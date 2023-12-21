package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class HostPathFluent<A extends HostPathFluent<A>> extends BaseFluent<A>{
  public HostPathFluent() {
  }
  
  public HostPathFluent(HostPath instance) {
    this.copyInstance(instance);
  }
  private String path;
  private String type;
  
  protected void copyInstance(HostPath instance) {
    instance = (instance != null ? instance : new HostPath());
    if (instance != null) {
          this.withPath(instance.getPath());
          this.withType(instance.getType());
        }
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
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    HostPathFluent that = (HostPathFluent) o;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(path,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  

}