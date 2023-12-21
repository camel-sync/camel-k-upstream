package org.apache.camel.v1.integrationspec.template.spec.ephemeralcontainers;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class EnvFromBuilder extends EnvFromFluent<EnvFromBuilder> implements VisitableBuilder<EnvFrom,EnvFromBuilder>{
  public EnvFromBuilder() {
    this(new EnvFrom());
  }
  
  public EnvFromBuilder(EnvFromFluent<?> fluent) {
    this(fluent, new EnvFrom());
  }
  
  public EnvFromBuilder(EnvFromFluent<?> fluent,EnvFrom instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public EnvFromBuilder(EnvFrom instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  EnvFromFluent<?> fluent;
  
  public EnvFrom build() {
    EnvFrom buildable = new EnvFrom();
    buildable.setConfigMapRef(fluent.buildConfigMapRef());
    buildable.setPrefix(fluent.getPrefix());
    buildable.setSecretRef(fluent.buildSecretRef());
    return buildable;
  }
  

}