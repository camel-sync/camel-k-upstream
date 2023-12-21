package org.apache.camel.v1.pipespec.integration.template.spec.containers.env.valuefrom;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class FieldRefFluent<A extends FieldRefFluent<A>> extends BaseFluent<A>{
  public FieldRefFluent() {
  }
  
  public FieldRefFluent(FieldRef instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String fieldPath;
  
  protected void copyInstance(FieldRef instance) {
    instance = (instance != null ? instance : new FieldRef());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withFieldPath(instance.getFieldPath());
        }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public String getFieldPath() {
    return this.fieldPath;
  }
  
  public A withFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return (A) this;
  }
  
  public boolean hasFieldPath() {
    return this.fieldPath != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    FieldRefFluent that = (FieldRefFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(fieldPath, that.fieldPath)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  fieldPath,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (fieldPath != null) { sb.append("fieldPath:"); sb.append(fieldPath); }
    sb.append("}");
    return sb.toString();
  }
  

}