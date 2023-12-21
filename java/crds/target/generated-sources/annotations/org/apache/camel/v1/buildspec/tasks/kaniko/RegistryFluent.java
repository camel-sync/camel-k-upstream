package org.apache.camel.v1.buildspec.tasks.kaniko;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class RegistryFluent<A extends RegistryFluent<A>> extends BaseFluent<A>{
  public RegistryFluent() {
  }
  
  public RegistryFluent(Registry instance) {
    this.copyInstance(instance);
  }
  private String address;
  private String ca;
  private Boolean insecure;
  private String organization;
  private String secret;
  
  protected void copyInstance(Registry instance) {
    instance = (instance != null ? instance : new Registry());
    if (instance != null) {
          this.withAddress(instance.getAddress());
          this.withCa(instance.getCa());
          this.withInsecure(instance.getInsecure());
          this.withOrganization(instance.getOrganization());
          this.withSecret(instance.getSecret());
        }
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public A withAddress(String address) {
    this.address = address;
    return (A) this;
  }
  
  public boolean hasAddress() {
    return this.address != null;
  }
  
  public String getCa() {
    return this.ca;
  }
  
  public A withCa(String ca) {
    this.ca = ca;
    return (A) this;
  }
  
  public boolean hasCa() {
    return this.ca != null;
  }
  
  public Boolean getInsecure() {
    return this.insecure;
  }
  
  public A withInsecure(Boolean insecure) {
    this.insecure = insecure;
    return (A) this;
  }
  
  public boolean hasInsecure() {
    return this.insecure != null;
  }
  
  public String getOrganization() {
    return this.organization;
  }
  
  public A withOrganization(String organization) {
    this.organization = organization;
    return (A) this;
  }
  
  public boolean hasOrganization() {
    return this.organization != null;
  }
  
  public String getSecret() {
    return this.secret;
  }
  
  public A withSecret(String secret) {
    this.secret = secret;
    return (A) this;
  }
  
  public boolean hasSecret() {
    return this.secret != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    RegistryFluent that = (RegistryFluent) o;
    if (!java.util.Objects.equals(address, that.address)) return false;
    if (!java.util.Objects.equals(ca, that.ca)) return false;
    if (!java.util.Objects.equals(insecure, that.insecure)) return false;
    if (!java.util.Objects.equals(organization, that.organization)) return false;
    if (!java.util.Objects.equals(secret, that.secret)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(address,  ca,  insecure,  organization,  secret,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (address != null) { sb.append("address:"); sb.append(address + ","); }
    if (ca != null) { sb.append("ca:"); sb.append(ca + ","); }
    if (insecure != null) { sb.append("insecure:"); sb.append(insecure + ","); }
    if (organization != null) { sb.append("organization:"); sb.append(organization + ","); }
    if (secret != null) { sb.append("secret:"); sb.append(secret); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withInsecure() {
    return withInsecure(true);
  }
  

}