package org.apache.camel.v1.pipespec.integration.template.spec.containers.envfrom;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SecretRefFluent<A extends SecretRefFluent<A>> extends BaseFluent<A>{
  public SecretRefFluent() {
  }
  
  public SecretRefFluent(SecretRef instance) {
    this.copyInstance(instance);
  }
  private String name;
  private Boolean optional;
  
  protected void copyInstance(SecretRef instance) {
    instance = (instance != null ? instance : new SecretRef());
    if (instance != null) {
          this.withName(instance.getName());
          this.withOptional(instance.getOptional());
        }
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
  
  public Boolean getOptional() {
    return this.optional;
  }
  
  public A withOptional(Boolean optional) {
    this.optional = optional;
    return (A) this;
  }
  
  public boolean hasOptional() {
    return this.optional != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    SecretRefFluent that = (SecretRefFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(optional, that.optional)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(name,  optional,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (optional != null) { sb.append("optional:"); sb.append(optional); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withOptional() {
    return withOptional(true);
  }
  

}