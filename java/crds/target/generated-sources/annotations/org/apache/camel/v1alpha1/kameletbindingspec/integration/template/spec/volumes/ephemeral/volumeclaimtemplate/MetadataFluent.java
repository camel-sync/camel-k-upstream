package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class MetadataFluent<A extends MetadataFluent<A>> extends BaseFluent<A>{
  public MetadataFluent() {
  }
  
  public MetadataFluent(Metadata instance) {
    this.copyInstance(instance);
  }
  
  
  protected void copyInstance(Metadata instance) {
    instance = (instance != null ? instance : new Metadata());
    if (instance != null) {
        }
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    MetadataFluent that = (MetadataFluent) o;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("}");
    return sb.toString();
  }
  

}