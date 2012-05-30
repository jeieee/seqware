/**
 * 
 */
package net.sourceforge.seqware.queryengine.backend.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author boconnor
 * 
 * This is closely related to the Variant object but more generic. I would make this the 
 * supertype of Variant but really LocatableModel is the more appropriate parent of both
 * because there aren't that many overlapping fields between Variant and Feature. The idea
 * behind Feature is that it's a locatable entity in the genome, much like the concept of
 * features in the DAS project (http://www.biodas.org/documents/spec.html). This object
 * could then be used to store BED files (which is why I'm creating it), GFF, GTF, 
 * or BedGraph formats. See http://genome.ucsc.edu/FAQ/FAQformat.html and 
 * http://genome.ucsc.edu/goldenPath/help/bedgraph.htmlfor a description
 * of each of these formats, that's what I'm using as a reference. This object has fields
 * for many of these formats, optional/additional fields can be stored as key/value pairs.
 * You could also use this object for WIG continuous-valued data storage but I created the Coverage object to
 * store sequencing coverage information. I may make this object, Variant, and Coverage
 * more generic in the future.
 * 
 * Since this is a generic feature type I could add a type field as I did for the Variant
 * object. I think the better route is to leave these type-free and allow the user to tag with
 * whatever info he or she wants. I'm going to use the Sequence Ontology (http://www.sequenceontology.org/)
 * in my code where possible.
 * 
 */
public class Feature extends LocatableModel {

  // Generic variables
  protected String name = null;
  protected int score = 0; // 0-1000
  protected char strand = '+';
  
  // BED-specific
  protected int thickStart = 0;
  protected int thickEnd = 0;
  protected String itemRgb = "0,0,0";
  protected int blockCount = 1;
  protected int[] blockSizes = {0};
  protected int[] blockStarts = {0};
  
  // GFF-specific
  protected String source = null;
  protected String feature = null; // really just a type, stick a SO term here
  protected byte frame = 0;
  protected String group = null;
  
  //GTF-specific
  protected String geneId = null;
  protected String transcriptId = null;
  
  
  // autogenerated
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getScore() {
    return score;
  }
  public void setScore(int score) {
    this.score = score;
  }
  public char getStrand() {
    return strand;
  }
  public void setStrand(char strand) {
    this.strand = strand;
  }
  public int getThickStart() {
    return thickStart;
  }
  public void setThickStart(int thickStart) {
    this.thickStart = thickStart;
  }
  public int getThickEnd() {
    return thickEnd;
  }
  public void setThickEnd(int thickEnd) {
    this.thickEnd = thickEnd;
  }
  public String getItemRgb() {
    return itemRgb;
  }
  public void setItemRgb(String itemRgb) {
    this.itemRgb = itemRgb;
  }
  public int getBlockCount() {
    return blockCount;
  }
  public void setBlockCount(int blockCount) {
    this.blockCount = blockCount;
  }
  public int[] getBlockSizes() {
    return blockSizes;
  }
  public void setBlockSizes(int[] blockSizes) {
    this.blockSizes = blockSizes;
  }
  public int[] getBlockStarts() {
    return blockStarts;
  }
  public void setBlockStarts(int[] blockStarts) {
    this.blockStarts = blockStarts;
  }
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }
  public String getFeature() {
    return feature;
  }
  public void setFeature(String feature) {
    this.feature = feature;
  }
  public byte getFrame() {
    return frame;
  }
  public void setFrame(byte frame) {
    this.frame = frame;
  }
  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
  }
  public String getGeneId() {
    return geneId;
  }
  public void setGeneId(String geneId) {
    this.geneId = geneId;
  }
  public String getTranscriptId() {
    return transcriptId;
  }
  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
  }
  
  
}