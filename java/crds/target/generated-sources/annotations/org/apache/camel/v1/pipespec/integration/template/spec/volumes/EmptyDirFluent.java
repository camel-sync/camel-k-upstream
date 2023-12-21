package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.model.IntOrString;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class EmptyDirFluent<A extends EmptyDirFluent<A>> extends BaseFluent<A>{
  public EmptyDirFluent() {
  }
  
  public EmptyDirFluent(EmptyDir instance) {
    this.copyInstance(instance);
  }
  private String medium;
  private IntOrString sizeLimit;
  
  protected void copyInstance(EmptyDir instance) {
    instance = (instance != null ? instance : new EmptyDir());
    if (instance != null) {
          this.withMedium(instance.getMedium());
          this.withSizeLimit(instance.getSizeLimit());
        }
  }
  
  public String getMedium() {
    return this.medium;
  }
  
  public A withMedium(String medium) {
    this.medium = medium;
    return (A) this;
  }
  
  public boolean hasMedium() {
    return this.medium != null;
  }
  
  public IntOrString getSizeLimit() {
    return this.sizeLimit;
  }
  
  public A withSizeLimit(IntOrString sizeLimit) {
    this.sizeLimit = sizeLimit;
    return (A) this;
  }
  
  public boolean hasSizeLimit() {
    return this.sizeLimit != null;
  }
  
  public A withNewSizeLimit(Object value) {
    return (A)withSizeLimit(new IntOrString(value));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EmptyDirFluent that = (EmptyDirFluent) o;
    if (!java.util.Objects.equals(medium, that.medium)) return false;
    if (!java.util.Objects.equals(sizeLimit, that.sizeLimit)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(medium,  sizeLimit,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (medium != null) { sb.append("medium:"); sb.append(medium + ","); }
    if (sizeLimit != null) { sb.append("sizeLimit:"); sb.append(sizeLimit); }
    sb.append("}");
    return sb.toString();
  }
  

}