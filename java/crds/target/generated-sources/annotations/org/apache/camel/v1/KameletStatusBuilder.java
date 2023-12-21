package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KameletStatusBuilder extends KameletStatusFluent<KameletStatusBuilder> implements VisitableBuilder<KameletStatus,KameletStatusBuilder>{
  public KameletStatusBuilder() {
    this(new KameletStatus());
  }
  
  public KameletStatusBuilder(KameletStatusFluent<?> fluent) {
    this(fluent, new KameletStatus());
  }
  
  public KameletStatusBuilder(KameletStatusFluent<?> fluent,KameletStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KameletStatusBuilder(KameletStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KameletStatusFluent<?> fluent;
  
  public KameletStatus build() {
    KameletStatus buildable = new KameletStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setPhase(fluent.getPhase());
    buildable.setProperties(fluent.buildProperties());
    return buildable;
  }
  

}