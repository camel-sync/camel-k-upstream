package org.apache.camel.v1.integrationspec.template.spec.containers.lifecycle;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PreStopBuilder extends PreStopFluent<PreStopBuilder> implements VisitableBuilder<PreStop,PreStopBuilder>{
  public PreStopBuilder() {
    this(new PreStop());
  }
  
  public PreStopBuilder(PreStopFluent<?> fluent) {
    this(fluent, new PreStop());
  }
  
  public PreStopBuilder(PreStopFluent<?> fluent,PreStop instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PreStopBuilder(PreStop instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PreStopFluent<?> fluent;
  
  public PreStop build() {
    PreStop buildable = new PreStop();
    buildable.setExec(fluent.buildExec());
    buildable.setHttpGet(fluent.buildHttpGet());
    buildable.setTcpSocket(fluent.buildTcpSocket());
    return buildable;
  }
  

}