package org.apache.camel.v1alpha1.kameletbindingstatus.conditions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PodsBuilder extends PodsFluent<PodsBuilder> implements VisitableBuilder<Pods,PodsBuilder>{
  public PodsBuilder() {
    this(new Pods());
  }
  
  public PodsBuilder(PodsFluent<?> fluent) {
    this(fluent, new Pods());
  }
  
  public PodsBuilder(PodsFluent<?> fluent,Pods instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PodsBuilder(Pods instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PodsFluent<?> fluent;
  
  public Pods build() {
    Pods buildable = new Pods();
    buildable.setCondition(fluent.buildCondition());
    buildable.setHealth(fluent.buildHealth());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}