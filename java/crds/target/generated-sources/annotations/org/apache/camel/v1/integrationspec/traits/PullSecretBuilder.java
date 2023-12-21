package org.apache.camel.v1.integrationspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PullSecretBuilder extends PullSecretFluent<PullSecretBuilder> implements VisitableBuilder<PullSecret,PullSecretBuilder>{
  public PullSecretBuilder() {
    this(new PullSecret());
  }
  
  public PullSecretBuilder(PullSecretFluent<?> fluent) {
    this(fluent, new PullSecret());
  }
  
  public PullSecretBuilder(PullSecretFluent<?> fluent,PullSecret instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PullSecretBuilder(PullSecret instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PullSecretFluent<?> fluent;
  
  public PullSecret build() {
    PullSecret buildable = new PullSecret();
    buildable.setAuto(fluent.getAuto());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setImagePullerDelegation(fluent.getImagePullerDelegation());
    buildable.setSecretName(fluent.getSecretName());
    return buildable;
  }
  

}