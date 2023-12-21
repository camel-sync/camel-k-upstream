package org.apache.camel.v1.buildstatus;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class FailureBuilder extends FailureFluent<FailureBuilder> implements VisitableBuilder<Failure,FailureBuilder>{
  public FailureBuilder() {
    this(new Failure());
  }
  
  public FailureBuilder(FailureFluent<?> fluent) {
    this(fluent, new Failure());
  }
  
  public FailureBuilder(FailureFluent<?> fluent,Failure instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public FailureBuilder(Failure instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  FailureFluent<?> fluent;
  
  public Failure build() {
    Failure buildable = new Failure();
    buildable.setReason(fluent.getReason());
    buildable.setRecovery(fluent.buildRecovery());
    buildable.setTime(fluent.getTime());
    return buildable;
  }
  

}