package org.apache.camel.v1.integrationspec.template.spec.containers;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ResizePolicyBuilder extends ResizePolicyFluent<ResizePolicyBuilder> implements VisitableBuilder<ResizePolicy,ResizePolicyBuilder>{
  public ResizePolicyBuilder() {
    this(new ResizePolicy());
  }
  
  public ResizePolicyBuilder(ResizePolicyFluent<?> fluent) {
    this(fluent, new ResizePolicy());
  }
  
  public ResizePolicyBuilder(ResizePolicyFluent<?> fluent,ResizePolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ResizePolicyBuilder(ResizePolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ResizePolicyFluent<?> fluent;
  
  public ResizePolicy build() {
    ResizePolicy buildable = new ResizePolicy();
    buildable.setResourceName(fluent.getResourceName());
    buildable.setRestartPolicy(fluent.getRestartPolicy());
    return buildable;
  }
  

}