package io.seqware.webservice.controller;

import io.seqware.webservice.generated.controller.AbstractFacade;
import io.seqware.webservice.model.SkippableEntity;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import javax.persistence.Query;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public abstract class SkippableEntityFacade<T extends SkippableEntity> extends AbstractFacade<T> {

    private String entityIDFieldName;
    private String entityTableName;

    private String getEntityTableName()
    {
        String tableName = entityClass.getSimpleName(); 
        for (Annotation a : entityClass.getAnnotations())
        {
            if (a.annotationType().getName().equals("javax.persistence.Table"))
            {
                try {
                    if (a.annotationType().getField("name") != null)
                    {
                       tableName =  (String) a.annotationType().getField("name").get(entityTableName);
                       if (tableName == null || entityTableName.equals("") || entityTableName.equals("null"))
                       {
                           tableName = entityClass.getSimpleName();       
                       }
                       return tableName;
                    }
                } catch (NoSuchFieldException e) {
                    tableName = entityClass.getSimpleName();
                    return tableName;
                } catch (SecurityException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return tableName;
    }
    
    private String getEntityIDFieldName()
    {
        String idFieldName = new String();
        for (Field f : entityClass.getDeclaredFields()) {
            for (Annotation a : f.getDeclaredAnnotations()) {
                if (a.annotationType().getName().equals("javax.persistence.Id")) {
                    try {
                        if (a.annotationType().getField("name") != null) {
                            idFieldName = (String) a.annotationType().getField("name").get(idFieldName);
                            
                            if (idFieldName == null || idFieldName.equals("") || idFieldName.equals("null"))
                            {
                                idFieldName = f.getName();                                
                            }
                            return idFieldName;
                        }
                        else
                        {
                            idFieldName = f.getName();
                        }
                    } catch (NoSuchFieldException e) {
                        idFieldName = f.getName();
                        return idFieldName;
                    } catch (IllegalArgumentException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (SecurityException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
        return idFieldName;
    }
    
    public SkippableEntityFacade(Class<T> entityClass) {
        super(entityClass);
        this.entityTableName = this.getEntityTableName();
        this.entityIDFieldName = this.getEntityIDFieldName();
    }

    @Path("/skip/{id}")
    @POST
    public void skip(@PathParam("id") String id) {

        Query updateLaneQuery = this.getEntityManager().createQuery(
                "update " + this.entityClass.getSimpleName() + " set skip=true where " + entityIDFieldName + "=:id");
        updateLaneQuery.setParameter("id", Integer.parseInt(id));
        int numAffected = updateLaneQuery.executeUpdate();

    }

    @Path("/unskip/{id}")
    @POST
    public void unskip(@PathParam("id") String id) {
        Query updateLaneQuery = this.getEntityManager().createQuery(
                "update " + this.entityClass.getSimpleName() + " set skip=false where " + entityIDFieldName + "=:id");
        updateLaneQuery.setParameter("id", Integer.parseInt(id));
        int numAffected = updateLaneQuery.executeUpdate();
    }
}