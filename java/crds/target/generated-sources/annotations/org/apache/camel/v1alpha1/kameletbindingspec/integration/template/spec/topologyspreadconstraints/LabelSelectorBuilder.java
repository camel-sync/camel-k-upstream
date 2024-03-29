package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.topologyspreadconstraints;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class LabelSelectorBuilder extends LabelSelectorFluent<LabelSelectorBuilder> implements VisitableBuilder<LabelSelector,LabelSelectorBuilder>{
  public LabelSelectorBuilder() {
    this(new LabelSelector());
  }
  
  public LabelSelectorBuilder(LabelSelectorFluent<?> fluent) {
    this(fluent, new LabelSelector());
  }
  
  public LabelSelectorBuilder(LabelSelectorFluent<?> fluent,LabelSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public LabelSelectorBuilder(LabelSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  LabelSelectorFluent<?> fluent;
  
  public LabelSelector build() {
    LabelSelector buildable = new LabelSelector();
    buildable.setMatchExpressions(fluent.buildMatchExpressions());
    buildable.setMatchLabels(fluent.getMatchLabels());
    return buildable;
  }
  

}