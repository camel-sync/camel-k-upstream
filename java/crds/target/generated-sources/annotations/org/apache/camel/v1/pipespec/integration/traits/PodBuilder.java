package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PodBuilder extends PodFluent<PodBuilder> implements VisitableBuilder<Pod,PodBuilder>{
  public PodBuilder() {
    this(new Pod());
  }
  
  public PodBuilder(PodFluent<?> fluent) {
    this(fluent, new Pod());
  }
  
  public PodBuilder(PodFluent<?> fluent,Pod instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PodBuilder(Pod instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PodFluent<?> fluent;
  
  public Pod build() {
    Pod buildable = new Pod();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    return buildable;
  }
  

}