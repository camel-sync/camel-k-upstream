package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.csi;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class NodePublishSecretRefBuilder extends NodePublishSecretRefFluent<NodePublishSecretRefBuilder> implements VisitableBuilder<NodePublishSecretRef,NodePublishSecretRefBuilder>{
  public NodePublishSecretRefBuilder() {
    this(new NodePublishSecretRef());
  }
  
  public NodePublishSecretRefBuilder(NodePublishSecretRefFluent<?> fluent) {
    this(fluent, new NodePublishSecretRef());
  }
  
  public NodePublishSecretRefBuilder(NodePublishSecretRefFluent<?> fluent,NodePublishSecretRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public NodePublishSecretRefBuilder(NodePublishSecretRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  NodePublishSecretRefFluent<?> fluent;
  
  public NodePublishSecretRef build() {
    NodePublishSecretRef buildable = new NodePublishSecretRef();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}