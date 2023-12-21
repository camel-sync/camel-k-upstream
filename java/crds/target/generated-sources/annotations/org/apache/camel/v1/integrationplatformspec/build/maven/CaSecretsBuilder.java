package org.apache.camel.v1.integrationplatformspec.build.maven;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CaSecretsBuilder extends CaSecretsFluent<CaSecretsBuilder> implements VisitableBuilder<CaSecrets,CaSecretsBuilder>{
  public CaSecretsBuilder() {
    this(new CaSecrets());
  }
  
  public CaSecretsBuilder(CaSecretsFluent<?> fluent) {
    this(fluent, new CaSecrets());
  }
  
  public CaSecretsBuilder(CaSecretsFluent<?> fluent,CaSecrets instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CaSecretsBuilder(CaSecrets instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CaSecretsFluent<?> fluent;
  
  public CaSecrets build() {
    CaSecrets buildable = new CaSecrets();
    buildable.setKey(fluent.getKey());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  

}