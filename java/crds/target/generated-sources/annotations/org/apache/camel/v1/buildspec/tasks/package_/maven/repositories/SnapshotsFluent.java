package org.apache.camel.v1.buildspec.tasks.package_.maven.repositories;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SnapshotsFluent<A extends SnapshotsFluent<A>> extends BaseFluent<A>{
  public SnapshotsFluent() {
  }
  
  public SnapshotsFluent(Snapshots instance) {
    this.copyInstance(instance);
  }
  private String checksumPolicy;
  private Boolean enabled;
  private String updatePolicy;
  
  protected void copyInstance(Snapshots instance) {
    instance = (instance != null ? instance : new Snapshots());
    if (instance != null) {
          this.withChecksumPolicy(instance.getChecksumPolicy());
          this.withEnabled(instance.getEnabled());
          this.withUpdatePolicy(instance.getUpdatePolicy());
        }
  }
  
  public String getChecksumPolicy() {
    return this.checksumPolicy;
  }
  
  public A withChecksumPolicy(String checksumPolicy) {
    this.checksumPolicy = checksumPolicy;
    return (A) this;
  }
  
  public boolean hasChecksumPolicy() {
    return this.checksumPolicy != null;
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
  
  public String getUpdatePolicy() {
    return this.updatePolicy;
  }
  
  public A withUpdatePolicy(String updatePolicy) {
    this.updatePolicy = updatePolicy;
    return (A) this;
  }
  
  public boolean hasUpdatePolicy() {
    return this.updatePolicy != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    SnapshotsFluent that = (SnapshotsFluent) o;
    if (!java.util.Objects.equals(checksumPolicy, that.checksumPolicy)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(updatePolicy, that.updatePolicy)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(checksumPolicy,  enabled,  updatePolicy,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (checksumPolicy != null) { sb.append("checksumPolicy:"); sb.append(checksumPolicy + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (updatePolicy != null) { sb.append("updatePolicy:"); sb.append(updatePolicy); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  

}