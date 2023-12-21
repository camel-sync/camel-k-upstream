package org.apache.camel.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KameletBindingSpecBuilder extends KameletBindingSpecFluent<KameletBindingSpecBuilder> implements VisitableBuilder<KameletBindingSpec,KameletBindingSpecBuilder>{
  public KameletBindingSpecBuilder() {
    this(new KameletBindingSpec());
  }
  
  public KameletBindingSpecBuilder(KameletBindingSpecFluent<?> fluent) {
    this(fluent, new KameletBindingSpec());
  }
  
  public KameletBindingSpecBuilder(KameletBindingSpecFluent<?> fluent,KameletBindingSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KameletBindingSpecBuilder(KameletBindingSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KameletBindingSpecFluent<?> fluent;
  
  public KameletBindingSpec build() {
    KameletBindingSpec buildable = new KameletBindingSpec();
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