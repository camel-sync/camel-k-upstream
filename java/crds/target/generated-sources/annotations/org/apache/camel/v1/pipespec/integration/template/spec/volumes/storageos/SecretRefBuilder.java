package org.apache.camel.v1.pipespec.integration.template.spec.volumes.storageos;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SecretRefBuilder extends SecretRefFluent<SecretRefBuilder> implements VisitableBuilder<SecretRef,SecretRefBuilder>{
  public SecretRefBuilder() {
    this(new SecretRef());
  }
  
  public SecretRefBuilder(SecretRefFluent<?> fluent) {
    this(fluent, new SecretRef());
  }
  
  public SecretRefBuilder(SecretRefFluent<?> fluent,SecretRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SecretRefBuilder(SecretRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SecretRefFluent<?> fluent;
  
  public SecretRef build() {
    SecretRef buildable = new SecretRef();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}