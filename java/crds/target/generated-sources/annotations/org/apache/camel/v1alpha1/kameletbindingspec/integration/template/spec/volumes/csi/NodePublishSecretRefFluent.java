package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.csi;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class NodePublishSecretRefFluent<A extends NodePublishSecretRefFluent<A>> extends BaseFluent<A>{
  public NodePublishSecretRefFluent() {
  }
  
  public NodePublishSecretRefFluent(NodePublishSecretRef instance) {
    this.copyInstance(instance);
  }
  private String name;
  
  protected void copyInstance(NodePublishSecretRef instance) {
    instance = (instance != null ? instance : new NodePublishSecretRef());
    if (instance != null) {
          this.withName(instance.getName());
        }
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
    NodePublishSecretRefFluent that = (NodePublishSecretRefFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(name,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  

}