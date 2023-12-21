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
public class GlusterfsFluent<A extends GlusterfsFluent<A>> extends BaseFluent<A>{
  public GlusterfsFluent() {
  }
  
  public GlusterfsFluent(Glusterfs instance) {
    this.copyInstance(instance);
  }
  private String endpoints;
  private String path;
  private Boolean readOnly;
  
  protected void copyInstance(Glusterfs instance) {
    instance = (instance != null ? instance : new Glusterfs());
    if (instance != null) {
          this.withEndpoints(instance.getEndpoints());
          this.withPath(instance.getPath());
          this.withReadOnly(instance.getReadOnly());
        }
  }
  
  public String getEndpoints() {
    return this.endpoints;
  }
  
  public A withEndpoints(String endpoints) {
    this.endpoints = endpoints;
    return (A) this;
  }
  
  public boolean hasEndpoints() {
    return this.endpoints != null;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
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
    GlusterfsFluent that = (GlusterfsFluent) o;
    if (!java.util.Objects.equals(endpoints, that.endpoints)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(endpoints,  path,  readOnly,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (endpoints != null) { sb.append("endpoints:"); sb.append(endpoints + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}