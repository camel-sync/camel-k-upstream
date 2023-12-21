package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.securitycontext;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SeccompProfileFluent<A extends SeccompProfileFluent<A>> extends BaseFluent<A>{
  public SeccompProfileFluent() {
  }
  
  public SeccompProfileFluent(SeccompProfile instance) {
    this.copyInstance(instance);
  }
  private String localhostProfile;
  private String type;
  
  protected void copyInstance(SeccompProfile instance) {
    instance = (instance != null ? instance : new SeccompProfile());
    if (instance != null) {
          this.withLocalhostProfile(instance.getLocalhostProfile());
          this.withType(instance.getType());
        }
  }
  
  public String getLocalhostProfile() {
    return this.localhostProfile;
  }
  
  public A withLocalhostProfile(String localhostProfile) {
    this.localhostProfile = localhostProfile;
    return (A) this;
  }
  
  public boolean hasLocalhostProfile() {
    return this.localhostProfile != null;
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
    SeccompProfileFluent that = (SeccompProfileFluent) o;
    if (!java.util.Objects.equals(localhostProfile, that.localhostProfile)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(localhostProfile,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (localhostProfile != null) { sb.append("localhostProfile:"); sb.append(localhostProfile + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  

}