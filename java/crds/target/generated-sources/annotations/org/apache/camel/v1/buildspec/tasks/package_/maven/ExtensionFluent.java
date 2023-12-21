package org.apache.camel.v1.buildspec.tasks.package_.maven;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ExtensionFluent<A extends ExtensionFluent<A>> extends BaseFluent<A>{
  public ExtensionFluent() {
  }
  
  public ExtensionFluent(Extension instance) {
    this.copyInstance(instance);
  }
  private String artifactId;
  private String groupId;
  private String version;
  
  protected void copyInstance(Extension instance) {
    instance = (instance != null ? instance : new Extension());
    if (instance != null) {
          this.withArtifactId(instance.getArtifactId());
          this.withGroupId(instance.getGroupId());
          this.withVersion(instance.getVersion());
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
  
  public String getVersion() {
    return this.version;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ExtensionFluent that = (ExtensionFluent) o;
    if (!java.util.Objects.equals(artifactId, that.artifactId)) return false;
    if (!java.util.Objects.equals(groupId, that.groupId)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(artifactId,  groupId,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (artifactId != null) { sb.append("artifactId:"); sb.append(artifactId + ","); }
    if (groupId != null) { sb.append("groupId:"); sb.append(groupId + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  

}