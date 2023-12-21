package org.apache.camel.v1.buildstatus;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ArtifactsFluent<A extends ArtifactsFluent<A>> extends BaseFluent<A>{
  public ArtifactsFluent() {
  }
  
  public ArtifactsFluent(Artifacts instance) {
    this.copyInstance(instance);
  }
  private String checksum;
  private String id;
  private String location;
  private String target;
  
  protected void copyInstance(Artifacts instance) {
    instance = (instance != null ? instance : new Artifacts());
    if (instance != null) {
          this.withChecksum(instance.getChecksum());
          this.withId(instance.getId());
          this.withLocation(instance.getLocation());
          this.withTarget(instance.getTarget());
        }
  }
  
  public String getChecksum() {
    return this.checksum;
  }
  
  public A withChecksum(String checksum) {
    this.checksum = checksum;
    return (A) this;
  }
  
  public boolean hasChecksum() {
    return this.checksum != null;
  }
  
  public String getId() {
    return this.id;
  }
  
  public A withId(String id) {
    this.id = id;
    return (A) this;
  }
  
  public boolean hasId() {
    return this.id != null;
  }
  
  public String getLocation() {
    return this.location;
  }
  
  public A withLocation(String location) {
    this.location = location;
    return (A) this;
  }
  
  public boolean hasLocation() {
    return this.location != null;
  }
  
  public String getTarget() {
    return this.target;
  }
  
  public A withTarget(String target) {
    this.target = target;
    return (A) this;
  }
  
  public boolean hasTarget() {
    return this.target != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ArtifactsFluent that = (ArtifactsFluent) o;
    if (!java.util.Objects.equals(checksum, that.checksum)) return false;
    if (!java.util.Objects.equals(id, that.id)) return false;
    if (!java.util.Objects.equals(location, that.location)) return false;
    if (!java.util.Objects.equals(target, that.target)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(checksum,  id,  location,  target,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (checksum != null) { sb.append("checksum:"); sb.append(checksum + ","); }
    if (id != null) { sb.append("id:"); sb.append(id + ","); }
    if (location != null) { sb.append("location:"); sb.append(location + ","); }
    if (target != null) { sb.append("target:"); sb.append(target); }
    sb.append("}");
    return sb.toString();
  }
  

}