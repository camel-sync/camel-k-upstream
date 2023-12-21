package org.apache.camel.v1.integrationkitstatus.failure;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class RecoveryBuilder extends RecoveryFluent<RecoveryBuilder> implements VisitableBuilder<Recovery,RecoveryBuilder>{
  public RecoveryBuilder() {
    this(new Recovery());
  }
  
  public RecoveryBuilder(RecoveryFluent<?> fluent) {
    this(fluent, new Recovery());
  }
  
  public RecoveryBuilder(RecoveryFluent<?> fluent,Recovery instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RecoveryBuilder(Recovery instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RecoveryFluent<?> fluent;
  
  public Recovery build() {
    Recovery buildable = new Recovery();
    buildable.setAttempt(fluent.getAttempt());
    buildable.setAttemptMax(fluent.getAttemptMax());
    buildable.setAttemptTime(fluent.getAttemptTime());
    return buildable;
  }
  

}