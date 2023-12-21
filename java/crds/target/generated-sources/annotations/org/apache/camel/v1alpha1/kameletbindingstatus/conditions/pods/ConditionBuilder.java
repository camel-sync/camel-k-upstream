package org.apache.camel.v1alpha1.kameletbindingstatus.conditions.pods;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ConditionBuilder extends ConditionFluent<ConditionBuilder> implements VisitableBuilder<Condition,ConditionBuilder>{
  public ConditionBuilder() {
    this(new Condition());
  }
  
  public ConditionBuilder(ConditionFluent<?> fluent) {
    this(fluent, new Condition());
  }
  
  public ConditionBuilder(ConditionFluent<?> fluent,Condition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ConditionBuilder(Condition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ConditionFluent<?> fluent;
  
  public Condition build() {
    Condition buildable = new Condition();
    buildable.setLastProbeTime(fluent.getLastProbeTime());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}