package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class RegistryBuilder extends RegistryFluent<RegistryBuilder> implements VisitableBuilder<Registry,RegistryBuilder>{
  public RegistryBuilder() {
    this(new Registry());
  }
  
  public RegistryBuilder(RegistryFluent<?> fluent) {
    this(fluent, new Registry());
  }
  
  public RegistryBuilder(RegistryFluent<?> fluent,Registry instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RegistryBuilder(Registry instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RegistryFluent<?> fluent;
  
  public Registry build() {
    Registry buildable = new Registry();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    return buildable;
  }
  

}