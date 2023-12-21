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
public class CacheFluent<A extends CacheFluent<A>> extends BaseFluent<A>{
  public CacheFluent() {
  }
  
  public CacheFluent(Cache instance) {
    this.copyInstance(instance);
  }
  private Boolean enabled;
  private String persistentVolumeClaim;
  
  protected void copyInstance(Cache instance) {
    instance = (instance != null ? instance : new Cache());
    if (instance != null) {
          this.withEnabled(instance.getEnabled());
          this.withPersistentVolumeClaim(instance.getPersistentVolumeClaim());
        }
  }
  
  public Boolean getEnabled() {
    return this.enabled;
  }
  
  public A withEnabled(Boolean enabled) {
    this.enabled = enabled;
    return (A) this;
  }
  
  public boolean hasEnabled() {
    return this.enabled != null;
  }
  
  public String getPersistentVolumeClaim() {
    return this.persistentVolumeClaim;
  }
  
  public A withPersistentVolumeClaim(String persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
    return (A) this;
  }
  
  public boolean hasPersistentVolumeClaim() {
    return this.persistentVolumeClaim != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CacheFluent that = (CacheFluent) o;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(persistentVolumeClaim, that.persistentVolumeClaim)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(enabled,  persistentVolumeClaim,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (persistentVolumeClaim != null) { sb.append("persistentVolumeClaim:"); sb.append(persistentVolumeClaim); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  

}