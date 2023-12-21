package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.env.valuefrom;

import io.fabric8.kubernetes.api.model.IntOrString;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ResourceFieldRefFluent<A extends ResourceFieldRefFluent<A>> extends BaseFluent<A>{
  public ResourceFieldRefFluent() {
  }
  
  public ResourceFieldRefFluent(ResourceFieldRef instance) {
    this.copyInstance(instance);
  }
  private String containerName;
  private IntOrString divisor;
  private String resource;
  
  protected void copyInstance(ResourceFieldRef instance) {
    instance = (instance != null ? instance : new ResourceFieldRef());
    if (instance != null) {
          this.withContainerName(instance.getContainerName());
          this.withDivisor(instance.getDivisor());
          this.withResource(instance.getResource());
        }
  }
  
  public String getContainerName() {
    return this.containerName;
  }
  
  public A withContainerName(String containerName) {
    this.containerName = containerName;
    return (A) this;
  }
  
  public boolean hasContainerName() {
    return this.containerName != null;
  }
  
  public IntOrString getDivisor() {
    return this.divisor;
  }
  
  public A withDivisor(IntOrString divisor) {
    this.divisor = divisor;
    return (A) this;
  }
  
  public boolean hasDivisor() {
    return this.divisor != null;
  }
  
  public A withNewDivisor(Object value) {
    return (A)withDivisor(new IntOrString(value));
  }
  
  public String getResource() {
    return this.resource;
  }
  
  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ResourceFieldRefFluent that = (ResourceFieldRefFluent) o;
    if (!java.util.Objects.equals(containerName, that.containerName)) return false;
    if (!java.util.Objects.equals(divisor, that.divisor)) return false;
    if (!java.util.Objects.equals(resource, that.resource)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(containerName,  divisor,  resource,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (containerName != null) { sb.append("containerName:"); sb.append(containerName + ","); }
    if (divisor != null) { sb.append("divisor:"); sb.append(divisor + ","); }
    if (resource != null) { sb.append("resource:"); sb.append(resource); }
    sb.append("}");
    return sb.toString();
  }
  

}