package org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SelectorBuilder extends SelectorFluent<SelectorBuilder> implements VisitableBuilder<Selector,SelectorBuilder>{
  public SelectorBuilder() {
    this(new Selector());
  }
  
  public SelectorBuilder(SelectorFluent<?> fluent) {
    this(fluent, new Selector());
  }
  
  public SelectorBuilder(SelectorFluent<?> fluent,Selector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SelectorBuilder(Selector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SelectorFluent<?> fluent;
  
  public Selector build() {
    Selector buildable = new Selector();
    buildable.setMatchExpressions(fluent.buildMatchExpressions());
    buildable.setMatchLabels(fluent.getMatchLabels());
    return buildable;
  }
  

}