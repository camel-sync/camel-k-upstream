package org.apache.camel.v1.integrationspec.template.spec.ephemeralcontainers;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class VolumeMountsFluent<A extends VolumeMountsFluent<A>> extends BaseFluent<A>{
  public VolumeMountsFluent() {
  }
  
  public VolumeMountsFluent(VolumeMounts instance) {
    this.copyInstance(instance);
  }
  private String mountPath;
  private String mountPropagation;
  private String name;
  private Boolean readOnly;
  private String subPath;
  private String subPathExpr;
  
  protected void copyInstance(VolumeMounts instance) {
    instance = (instance != null ? instance : new VolumeMounts());
    if (instance != null) {
          this.withMountPath(instance.getMountPath());
          this.withMountPropagation(instance.getMountPropagation());
          this.withName(instance.getName());
          this.withReadOnly(instance.getReadOnly());
          this.withSubPath(instance.getSubPath());
          this.withSubPathExpr(instance.getSubPathExpr());
        }
  }
  
  public String getMountPath() {
    return this.mountPath;
  }
  
  public A withMountPath(String mountPath) {
    this.mountPath = mountPath;
    return (A) this;
  }
  
  public boolean hasMountPath() {
    return this.mountPath != null;
  }
  
  public String getMountPropagation() {
    return this.mountPropagation;
  }
  
  public A withMountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
    return (A) this;
  }
  
  public boolean hasMountPropagation() {
    return this.mountPropagation != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
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
  
  public String getSubPath() {
    return this.subPath;
  }
  
  public A withSubPath(String subPath) {
    this.subPath = subPath;
    return (A) this;
  }
  
  public boolean hasSubPath() {
    return this.subPath != null;
  }
  
  public String getSubPathExpr() {
    return this.subPathExpr;
  }
  
  public A withSubPathExpr(String subPathExpr) {
    this.subPathExpr = subPathExpr;
    return (A) this;
  }
  
  public boolean hasSubPathExpr() {
    return this.subPathExpr != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    VolumeMountsFluent that = (VolumeMountsFluent) o;
    if (!java.util.Objects.equals(mountPath, that.mountPath)) return false;
    if (!java.util.Objects.equals(mountPropagation, that.mountPropagation)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(subPath, that.subPath)) return false;
    if (!java.util.Objects.equals(subPathExpr, that.subPathExpr)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(mountPath,  mountPropagation,  name,  readOnly,  subPath,  subPathExpr,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (mountPath != null) { sb.append("mountPath:"); sb.append(mountPath + ","); }
    if (mountPropagation != null) { sb.append("mountPropagation:"); sb.append(mountPropagation + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (subPath != null) { sb.append("subPath:"); sb.append(subPath + ","); }
    if (subPathExpr != null) { sb.append("subPathExpr:"); sb.append(subPathExpr); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}