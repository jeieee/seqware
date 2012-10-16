package net.sourceforge.seqware.common.model;

//default package
//Generated 09.12.2011 15:01:20 by Hibernate Tools 3.2.4.GA

/**
 * IusLink generated by hbm2java
 *
 * @author boconnor
 * @version $Id: $Id
 */
public class IUSLink implements java.io.Serializable {

  private static final long serialVersionUID = 1L;
  private int iusLinkId;
  private IUS ius;
  private String label;
  private String url;
  private String db;
  private String id;

  /**
   * <p>Constructor for IUSLink.</p>
   */
  public IUSLink() {
  }

  /**
   * <p>Constructor for IUSLink.</p>
   *
   * @param iusLinkId a int.
   * @param ius a {@link net.sourceforge.seqware.common.model.IUS} object.
   * @param label a {@link java.lang.String} object.
   * @param url a {@link java.lang.String} object.
   */
  public IUSLink(int iusLinkId, IUS ius, String label, String url) {
    this.iusLinkId = iusLinkId;
    this.ius = ius;
    this.label = label;
    this.url = url;
  }

  /**
   * <p>Constructor for IUSLink.</p>
   *
   * @param iusLinkId a int.
   * @param ius a {@link net.sourceforge.seqware.common.model.IUS} object.
   * @param label a {@link java.lang.String} object.
   * @param url a {@link java.lang.String} object.
   * @param db a {@link java.lang.String} object.
   * @param id a {@link java.lang.String} object.
   */
  public IUSLink(int iusLinkId, IUS ius, String label, String url, String db, String id) {
    this.iusLinkId = iusLinkId;
    this.ius = ius;
    this.label = label;
    this.url = url;
    this.db = db;
    this.id = id;
  }

  /**
   * <p>Getter for the field <code>iusLinkId</code>.</p>
   *
   * @return a int.
   */
  public int getIusLinkId() {
    return this.iusLinkId;
  }

  /**
   * <p>Setter for the field <code>iusLinkId</code>.</p>
   *
   * @param iusLinkId a int.
   */
  public void setIusLinkId(int iusLinkId) {
    this.iusLinkId = iusLinkId;
  }

  /**
   * <p>Getter for the field <code>ius</code>.</p>
   *
   * @return a {@link net.sourceforge.seqware.common.model.IUS} object.
   */
  public IUS getIus() {
    return this.ius;
  }

  /**
   * <p>Setter for the field <code>ius</code>.</p>
   *
   * @param ius a {@link net.sourceforge.seqware.common.model.IUS} object.
   */
  public void setIus(IUS ius) {
    this.ius = ius;
  }

  /**
   * <p>Getter for the field <code>label</code>.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getLabel() {
    return this.label;
  }

  /**
   * <p>Setter for the field <code>label</code>.</p>
   *
   * @param label a {@link java.lang.String} object.
   */
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * <p>Getter for the field <code>url</code>.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getUrl() {
    return this.url;
  }

  /**
   * <p>Setter for the field <code>url</code>.</p>
   *
   * @param url a {@link java.lang.String} object.
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * <p>Getter for the field <code>db</code>.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getDb() {
    return this.db;
  }

  /**
   * <p>Setter for the field <code>db</code>.</p>
   *
   * @param db a {@link java.lang.String} object.
   */
  public void setDb(String db) {
    this.db = db;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getId() {
    return this.id;
  }

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object.
   */
  public void setId(String id) {
    this.id = id;
  }

}
