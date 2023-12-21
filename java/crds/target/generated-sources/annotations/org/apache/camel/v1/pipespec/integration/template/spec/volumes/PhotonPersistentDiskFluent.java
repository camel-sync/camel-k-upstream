package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PhotonPersistentDiskFluent<A extends PhotonPersistentDiskFluent<A>> extends BaseFluent<A>{
  public PhotonPersistentDiskFluent() {
  }
  
  public PhotonPersistentDiskFluent(PhotonPersistentDisk instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private String pdID;
  
  protected void copyInstance(PhotonPersistentDisk instance) {
    instance = (instance != null ? instance : new PhotonPersistentDisk());
    if (instance != null) {
          this.withFsType(instance.getFsType());
          this.withPdID(instance.getPdID());
        }
  }
  
  public String getFsType() {
    return this.fsType;
  }
  
  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public String getPdID() {
    return this.pdID;
  }
  
  public A withPdID(String pdID) {
    this.pdID = pdID;
    return (A) this;
  }
  
  public boolean hasPdID() {
    return this.pdID != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    PhotonPersistentDiskFluent that = (PhotonPersistentDiskFluent) o;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(pdID, that.pdID)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fsType,  pdID,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (pdID != null) { sb.append("pdID:"); sb.append(pdID); }
    sb.append("}");
    return sb.toString();
  }
  

}