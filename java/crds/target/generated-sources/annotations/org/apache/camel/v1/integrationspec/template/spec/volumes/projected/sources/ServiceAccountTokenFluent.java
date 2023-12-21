package org.apache.camel.v1.integrationspec.template.spec.volumes.projected.sources;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ServiceAccountTokenFluent<A extends ServiceAccountTokenFluent<A>> extends BaseFluent<A>{
  public ServiceAccountTokenFluent() {
  }
  
  public ServiceAccountTokenFluent(ServiceAccountToken instance) {
    this.copyInstance(instance);
  }
  private String audience;
  private Long expirationSeconds;
  private String path;
  
  protected void copyInstance(ServiceAccountToken instance) {
    instance = (instance != null ? instance : new ServiceAccountToken());
    if (instance != null) {
          this.withAudience(instance.getAudience());
          this.withExpirationSeconds(instance.getExpirationSeconds());
          this.withPath(instance.getPath());
        }
  }
  
  public String getAudience() {
    return this.audience;
  }
  
  public A withAudience(String audience) {
    this.audience = audience;
    return (A) this;
  }
  
  public boolean hasAudience() {
    return this.audience != null;
  }
  
  public Long getExpirationSeconds() {
    return this.expirationSeconds;
  }
  
  public A withExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return (A) this;
  }
  
  public boolean hasExpirationSeconds() {
    return this.expirationSeconds != null;
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ServiceAccountTokenFluent that = (ServiceAccountTokenFluent) o;
    if (!java.util.Objects.equals(audience, that.audience)) return false;
    if (!java.util.Objects.equals(expirationSeconds, that.expirationSeconds)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(audience,  expirationSeconds,  path,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (audience != null) { sb.append("audience:"); sb.append(audience + ","); }
    if (expirationSeconds != null) { sb.append("expirationSeconds:"); sb.append(expirationSeconds + ","); }
    if (path != null) { sb.append("path:"); sb.append(path); }
    sb.append("}");
    return sb.toString();
  }
  

}