package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class GcePersistentDiskFluent<A extends GcePersistentDiskFluent<A>> extends BaseFluent<A>{
  public GcePersistentDiskFluent() {
  }
  
  public GcePersistentDiskFluent(GcePersistentDisk instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private Integer partition;
  private String pdName;
  private Boolean readOnly;
  
  protected void copyInstance(GcePersistentDisk instance) {
    instance = (instance != null ? instance : new GcePersistentDisk());
    if (instance != null) {
          this.withFsType(instance.getFsType());
          this.withPartition(instance.getPartition());
          this.withPdName(instance.getPdName());
          this.withReadOnly(instance.getReadOnly());
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
  
  public Integer getPartition() {
    return this.partition;
  }
  
  public A withPartition(Integer partition) {
    this.partition = partition;
    return (A) this;
  }
  
  public boolean hasPartition() {
    return this.partition != null;
  }
  
  public String getPdName() {
    return this.pdName;
  }
  
  public A withPdName(String pdName) {
    this.pdName = pdName;
    return (A) this;
  }
  
  public boolean hasPdName() {
    return this.pdName != null;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    GcePersistentDiskFluent that = (GcePersistentDiskFluent) o;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(partition, that.partition)) return false;
    if (!java.util.Objects.equals(pdName, that.pdName)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fsType,  partition,  pdName,  readOnly,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (partition != null) { sb.append("partition:"); sb.append(partition + ","); }
    if (pdName != null) { sb.append("pdName:"); sb.append(pdName + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}