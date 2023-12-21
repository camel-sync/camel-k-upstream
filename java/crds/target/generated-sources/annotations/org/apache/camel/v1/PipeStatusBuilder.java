package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PipeStatusBuilder extends PipeStatusFluent<PipeStatusBuilder> implements VisitableBuilder<PipeStatus,PipeStatusBuilder>{
  public PipeStatusBuilder() {
    this(new PipeStatus());
  }
  
  public PipeStatusBuilder(PipeStatusFluent<?> fluent) {
    this(fluent, new PipeStatus());
  }
  
  public PipeStatusBuilder(PipeStatusFluent<?> fluent,PipeStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PipeStatusBuilder(PipeStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PipeStatusFluent<?> fluent;
  
  public PipeStatus build() {
    PipeStatus buildable = new PipeStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setPhase(fluent.getPhase());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    return buildable;
  }
  

}