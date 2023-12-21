package org.apache.camel.v1.pipespec.integration.template.spec.volumes.projected.sources;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SecretBuilder extends SecretFluent<SecretBuilder> implements VisitableBuilder<Secret,SecretBuilder>{
  public SecretBuilder() {
    this(new Secret());
  }
  
  public SecretBuilder(SecretFluent<?> fluent) {
    this(fluent, new Secret());
  }
  
  public SecretBuilder(SecretFluent<?> fluent,Secret instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SecretBuilder(Secret instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SecretFluent<?> fluent;
  
  public Secret build() {
    Secret buildable = new Secret();
    buildable.setItems(fluent.buildItems());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  

}