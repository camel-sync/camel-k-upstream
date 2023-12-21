package org.apache.camel.v1.integrationspec.template.spec.volumes;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class VsphereVolumeFluent<A extends VsphereVolumeFluent<A>> extends BaseFluent<A>{
  public VsphereVolumeFluent() {
  }
  
  public VsphereVolumeFluent(VsphereVolume instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private String storagePolicyID;
  private String storagePolicyName;
  private String volumePath;
  
  protected void copyInstance(VsphereVolume instance) {
    instance = (instance != null ? instance : new VsphereVolume());
    if (instance != null) {
          this.withFsType(instance.getFsType());
          this.withStoragePolicyID(instance.getStoragePolicyID());
          this.withStoragePolicyName(instance.getStoragePolicyName());
          this.withVolumePath(instance.getVolumePath());
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
  
  public String getStoragePolicyID() {
    return this.storagePolicyID;
  }
  
  public A withStoragePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
    return (A) this;
  }
  
  public boolean hasStoragePolicyID() {
    return this.storagePolicyID != null;
  }
  
  public String getStoragePolicyName() {
    return this.storagePolicyName;
  }
  
  public A withStoragePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
    return (A) this;
  }
  
  public boolean hasStoragePolicyName() {
    return this.storagePolicyName != null;
  }
  
  public String getVolumePath() {
    return this.volumePath;
  }
  
  public A withVolumePath(String volumePath) {
    this.volumePath = volumePath;
    return (A) this;
  }
  
  public boolean hasVolumePath() {
    return this.volumePath != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    VsphereVolumeFluent that = (VsphereVolumeFluent) o;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(storagePolicyID, that.storagePolicyID)) return false;
    if (!java.util.Objects.equals(storagePolicyName, that.storagePolicyName)) return false;
    if (!java.util.Objects.equals(volumePath, that.volumePath)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fsType,  storagePolicyID,  storagePolicyName,  volumePath,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (storagePolicyID != null) { sb.append("storagePolicyID:"); sb.append(storagePolicyID + ","); }
    if (storagePolicyName != null) { sb.append("storagePolicyName:"); sb.append(storagePolicyName + ","); }
    if (volumePath != null) { sb.append("volumePath:"); sb.append(volumePath); }
    sb.append("}");
    return sb.toString();
  }
  

}