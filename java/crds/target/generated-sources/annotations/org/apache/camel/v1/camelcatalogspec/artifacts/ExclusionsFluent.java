package org.apache.camel.v1.camelcatalogspec.artifacts;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ExclusionsFluent<A extends ExclusionsFluent<A>> extends BaseFluent<A>{
  public ExclusionsFluent() {
  }
  
  public ExclusionsFluent(Exclusions instance) {
    this.copyInstance(instance);
  }
  private String artifactId;
  private String groupId;
  
  protected void copyInstance(Exclusions instance) {
    instance = (instance != null ? instance : new Exclusions());
    if (instance != null) {
          this.withArtifactId(instance.getArtifactId());
          this.withGroupId(instance.getGroupId());
        }
  }
  
  public String getArtifactId() {
    return this.artifactId;
  }
  
  public A withArtifactId(String artifactId) {
    this.artifactId = artifactId;
    return (A) this;
  }
  
  public boolean hasArtifactId() {
    return this.artifactId != null;
  }
  
  public String getGroupId() {
    return this.groupId;
  }
  
  public A withGroupId(String groupId) {
    this.groupId = groupId;
    return (A) this;
  }
  
  public boolean hasGroupId() {
    return this.groupId != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ExclusionsFluent that = (ExclusionsFluent) o;
    if (!java.util.Objects.equals(artifactId, that.artifactId)) return false;
    if (!java.util.Objects.equals(groupId, that.groupId)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(artifactId,  groupId,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (artifactId != null) { sb.append("artifactId:"); sb.append(artifactId + ","); }
    if (groupId != null) { sb.append("groupId:"); sb.append(groupId); }
    sb.append("}");
    return sb.toString();
  }
  

}