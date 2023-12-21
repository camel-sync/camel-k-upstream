package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CamelBuilder extends CamelFluent<CamelBuilder> implements VisitableBuilder<Camel,CamelBuilder>{
  public CamelBuilder() {
    this(new Camel());
  }
  
  public CamelBuilder(CamelFluent<?> fluent) {
    this(fluent, new Camel());
  }
  
  public CamelBuilder(CamelFluent<?> fluent,Camel instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CamelBuilder(Camel instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CamelFluent<?> fluent;
  
  public Camel build() {
    Camel buildable = new Camel();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setProperties(fluent.getProperties());
    buildable.setRuntimeVersion(fluent.getRuntimeVersion());
    return buildable;
  }
  

}