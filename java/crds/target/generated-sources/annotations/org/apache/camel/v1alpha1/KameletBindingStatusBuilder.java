package org.apache.camel.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KameletBindingStatusBuilder extends KameletBindingStatusFluent<KameletBindingStatusBuilder> implements VisitableBuilder<KameletBindingStatus,KameletBindingStatusBuilder>{
  public KameletBindingStatusBuilder() {
    this(new KameletBindingStatus());
  }
  
  public KameletBindingStatusBuilder(KameletBindingStatusFluent<?> fluent) {
    this(fluent, new KameletBindingStatus());
  }
  
  public KameletBindingStatusBuilder(KameletBindingStatusFluent<?> fluent,KameletBindingStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KameletBindingStatusBuilder(KameletBindingStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KameletBindingStatusFluent<?> fluent;
  
  public KameletBindingStatus build() {
    KameletBindingStatus buildable = new KameletBindingStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setPhase(fluent.getPhase());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    return buildable;
  }
  

}