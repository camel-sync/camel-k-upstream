package org.apache.camel.v1.pipestatus;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ConditionsBuilder extends ConditionsFluent<ConditionsBuilder> implements VisitableBuilder<Conditions,ConditionsBuilder>{
  public ConditionsBuilder() {
    this(new Conditions());
  }
  
  public ConditionsBuilder(ConditionsFluent<?> fluent) {
    this(fluent, new Conditions());
  }
  
  public ConditionsBuilder(ConditionsFluent<?> fluent,Conditions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ConditionsBuilder(Conditions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ConditionsFluent<?> fluent;
  
  public Conditions build() {
    Conditions buildable = new Conditions();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setLastUpdateTime(fluent.getLastUpdateTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setPods(fluent.buildPods());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}