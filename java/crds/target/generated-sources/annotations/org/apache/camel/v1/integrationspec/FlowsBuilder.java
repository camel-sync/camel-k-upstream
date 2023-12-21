package org.apache.camel.v1.integrationspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class FlowsBuilder extends FlowsFluent<FlowsBuilder> implements VisitableBuilder<Flows,FlowsBuilder>{
  public FlowsBuilder() {
    this(new Flows());
  }
  
  public FlowsBuilder(FlowsFluent<?> fluent) {
    this(fluent, new Flows());
  }
  
  public FlowsBuilder(FlowsFluent<?> fluent,Flows instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public FlowsBuilder(Flows instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  FlowsFluent<?> fluent;
  
  public Flows build() {
    Flows buildable = new Flows();
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}