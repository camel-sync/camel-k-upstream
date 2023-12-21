package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PipeSpecBuilder extends PipeSpecFluent<PipeSpecBuilder> implements VisitableBuilder<PipeSpec,PipeSpecBuilder>{
  public PipeSpecBuilder() {
    this(new PipeSpec());
  }
  
  public PipeSpecBuilder(PipeSpecFluent<?> fluent) {
    this(fluent, new PipeSpec());
  }
  
  public PipeSpecBuilder(PipeSpecFluent<?> fluent,PipeSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PipeSpecBuilder(PipeSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PipeSpecFluent<?> fluent;
  
  public PipeSpec build() {
    PipeSpec buildable = new PipeSpec();
    buildable.setErrorHandler(fluent.buildErrorHandler());
    buildable.setIntegration(fluent.buildIntegration());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setServiceAccountName(fluent.getServiceAccountName());
    buildable.setSink(fluent.buildSink());
    buildable.setSource(fluent.buildSource());
    buildable.setSteps(fluent.buildSteps());
    return buildable;
  }
  

}