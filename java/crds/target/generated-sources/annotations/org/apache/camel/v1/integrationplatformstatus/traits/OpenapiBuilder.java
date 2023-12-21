package org.apache.camel.v1.integrationplatformstatus.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class OpenapiBuilder extends OpenapiFluent<OpenapiBuilder> implements VisitableBuilder<Openapi,OpenapiBuilder>{
  public OpenapiBuilder() {
    this(new Openapi());
  }
  
  public OpenapiBuilder(OpenapiFluent<?> fluent) {
    this(fluent, new Openapi());
  }
  
  public OpenapiBuilder(OpenapiFluent<?> fluent,Openapi instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public OpenapiBuilder(Openapi instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  OpenapiFluent<?> fluent;
  
  public Openapi build() {
    Openapi buildable = new Openapi();
    buildable.setConfigmaps(fluent.getConfigmaps());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    return buildable;
  }
  

}