package net.sourceforge.seqware.common.model;

//default package
//Generated 09.12.2011 15:01:20 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * ShareExperiment generated by hbm2java
 * 
 * @author boconnor
 * @version $Id: $Id
 */
public class ShareExperiment implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int shareExperimentId;
    private Experiment experiment;
    private Registration registration;
    private Boolean active;
    private Integer swAccession;
    private Date createTstmp;
    private Date updateTstmp;

    /**
     * <p>
     * Constructor for ShareExperiment.
     * </p>
     */
    public ShareExperiment() {
    }

    /**
     * <p>
     * Constructor for ShareExperiment.
     * </p>
     * 
     * @param shareExperimentId
     *            a int.
     * @param experiment
     *            a {@link net.sourceforge.seqware.common.model.Experiment} object.
     * @param registration
     *            a {@link net.sourceforge.seqware.common.model.Registration} object.
     * @param createTstmp
     *            a {@link java.util.Date} object.
     */
    public ShareExperiment(int shareExperimentId, Experiment experiment, Registration registration, Date createTstmp) {
        this.shareExperimentId = shareExperimentId;
        this.experiment = experiment;
        this.registration = registration;
        this.createTstmp = createTstmp;
    }

    /**
     * <p>
     * Constructor for ShareExperiment.
     * </p>
     * 
     * @param shareExperimentId
     *            a int.
     * @param experiment
     *            a {@link net.sourceforge.seqware.common.model.Experiment} object.
     * @param registration
     *            a {@link net.sourceforge.seqware.common.model.Registration} object.
     * @param active
     *            a {@link java.lang.Boolean} object.
     * @param swAccession
     *            a {@link java.lang.Integer} object.
     * @param createTstmp
     *            a {@link java.util.Date} object.
     * @param updateTstmp
     *            a {@link java.util.Date} object.
     */
    public ShareExperiment(int shareExperimentId, Experiment experiment, Registration registration, Boolean active, Integer swAccession,
            Date createTstmp, Date updateTstmp) {
        this.shareExperimentId = shareExperimentId;
        this.experiment = experiment;
        this.registration = registration;
        this.active = active;
        this.swAccession = swAccession;
        this.createTstmp = createTstmp;
        this.updateTstmp = updateTstmp;
    }

    /**
     * <p>
     * Getter for the field <code>shareExperimentId</code>.
     * </p>
     * 
     * @return a int.
     */
    public int getShareExperimentId() {
        return this.shareExperimentId;
    }

    /**
     * <p>
     * Setter for the field <code>shareExperimentId</code>.
     * </p>
     * 
     * @param shareExperimentId
     *            a int.
     */
    public void setShareExperimentId(int shareExperimentId) {
        this.shareExperimentId = shareExperimentId;
    }

    /**
     * <p>
     * Getter for the field <code>experiment</code>.
     * </p>
     * 
     * @return a {@link net.sourceforge.seqware.common.model.Experiment} object.
     */
    public Experiment getExperiment() {
        return this.experiment;
    }

    /**
     * <p>
     * Setter for the field <code>experiment</code>.
     * </p>
     * 
     * @param experiment
     *            a {@link net.sourceforge.seqware.common.model.Experiment} object.
     */
    public void setExperiment(Experiment experiment) {
        this.experiment = experiment;
    }

    /**
     * <p>
     * Getter for the field <code>registration</code>.
     * </p>
     * 
     * @return a {@link net.sourceforge.seqware.common.model.Registration} object.
     */
    public Registration getRegistration() {
        return this.registration;
    }

    /**
     * <p>
     * Setter for the field <code>registration</code>.
     * </p>
     * 
     * @param registration
     *            a {@link net.sourceforge.seqware.common.model.Registration} object.
     */
    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    /**
     * <p>
     * Getter for the field <code>active</code>.
     * </p>
     * 
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Setter for the field <code>active</code>.
     * </p>
     * 
     * @param active
     *            a {@link java.lang.Boolean} object.
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Getter for the field <code>swAccession</code>.
     * </p>
     * 
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getSwAccession() {
        return this.swAccession;
    }

    /**
     * <p>
     * Setter for the field <code>swAccession</code>.
     * </p>
     * 
     * @param swAccession
     *            a {@link java.lang.Integer} object.
     */
    public void setSwAccession(Integer swAccession) {
        this.swAccession = swAccession;
    }

    /**
     * <p>
     * Getter for the field <code>createTstmp</code>.
     * </p>
     * 
     * @return a {@link java.util.Date} object.
     */
    public Date getCreateTstmp() {
        return this.createTstmp;
    }

    /**
     * <p>
     * Setter for the field <code>createTstmp</code>.
     * </p>
     * 
     * @param createTstmp
     *            a {@link java.util.Date} object.
     */
    public void setCreateTstmp(Date createTstmp) {
        this.createTstmp = createTstmp;
    }

    /**
     * <p>
     * Getter for the field <code>updateTstmp</code>.
     * </p>
     * 
     * @return a {@link java.util.Date} object.
     */
    public Date getUpdateTstmp() {
        return this.updateTstmp;
    }

    /**
     * <p>
     * Setter for the field <code>updateTstmp</code>.
     * </p>
     * 
     * @param updateTstmp
     *            a {@link java.util.Date} object.
     */
    public void setUpdateTstmp(Date updateTstmp) {
        this.updateTstmp = updateTstmp;
    }

}
