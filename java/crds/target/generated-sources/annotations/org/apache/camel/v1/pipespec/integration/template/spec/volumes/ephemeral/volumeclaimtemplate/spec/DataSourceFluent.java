package org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class DataSourceFluent<A extends DataSourceFluent<A>> extends BaseFluent<A>{
  public DataSourceFluent() {
  }
  
  public DataSourceFluent(DataSource instance) {
    this.copyInstance(instance);
  }
  private String apiGroup;
  private String kind;
  private String name;
  
  protected void copyInstance(DataSource instance) {
    instance = (instance != null ? instance : new DataSource());
    if (instance != null) {
          this.withApiGroup(instance.getApiGroup());
          this.withKind(instance.getKind());
          this.withName(instance.getName());
        }
  }
  
  public String getApiGroup() {
    return this.apiGroup;
  }
  
  public A withApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return (A) this;
  }
  
  public boolean hasApiGroup() {
    return this.apiGroup != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    DataSourceFluent that = (DataSourceFluent) o;
    if (!java.util.Objects.equals(apiGroup, that.apiGroup)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiGroup,  kind,  name,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiGroup != null) { sb.append("apiGroup:"); sb.append(apiGroup + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  

}