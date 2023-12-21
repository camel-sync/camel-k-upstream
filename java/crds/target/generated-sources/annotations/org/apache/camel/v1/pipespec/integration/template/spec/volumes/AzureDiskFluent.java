package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class AzureDiskFluent<A extends AzureDiskFluent<A>> extends BaseFluent<A>{
  public AzureDiskFluent() {
  }
  
  public AzureDiskFluent(AzureDisk instance) {
    this.copyInstance(instance);
  }
  private String cachingMode;
  private String diskName;
  private String diskURI;
  private String fsType;
  private String kind;
  private Boolean readOnly;
  
  protected void copyInstance(AzureDisk instance) {
    instance = (instance != null ? instance : new AzureDisk());
    if (instance != null) {
          this.withCachingMode(instance.getCachingMode());
          this.withDiskName(instance.getDiskName());
          this.withDiskURI(instance.getDiskURI());
          this.withFsType(instance.getFsType());
          this.withKind(instance.getKind());
          this.withReadOnly(instance.getReadOnly());
        }
  }
  
  public String getCachingMode() {
    return this.cachingMode;
  }
  
  public A withCachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
    return (A) this;
  }
  
  public boolean hasCachingMode() {
    return this.cachingMode != null;
  }
  
  public String getDiskName() {
    return this.diskName;
  }
  
  public A withDiskName(String diskName) {
    this.diskName = diskName;
    return (A) this;
  }
  
  public boolean hasDiskName() {
    return this.diskName != null;
  }
  
  public String getDiskURI() {
    return this.diskURI;
  }
  
  public A withDiskURI(String diskURI) {
    this.diskURI = diskURI;
    return (A) this;
  }
  
  public boolean hasDiskURI() {
    return this.diskURI != null;
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
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
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
    AzureDiskFluent that = (AzureDiskFluent) o;
    if (!java.util.Objects.equals(cachingMode, that.cachingMode)) return false;
    if (!java.util.Objects.equals(diskName, that.diskName)) return false;
    if (!java.util.Objects.equals(diskURI, that.diskURI)) return false;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(cachingMode,  diskName,  diskURI,  fsType,  kind,  readOnly,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (cachingMode != null) { sb.append("cachingMode:"); sb.append(cachingMode + ","); }
    if (diskName != null) { sb.append("diskName:"); sb.append(diskName + ","); }
    if (diskURI != null) { sb.append("diskURI:"); sb.append(diskURI + ","); }
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}