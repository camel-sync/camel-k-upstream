package org.apache.camel.v1.camelcatalogspec.artifacts;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SchemesBuilder extends SchemesFluent<SchemesBuilder> implements VisitableBuilder<Schemes,SchemesBuilder>{
  public SchemesBuilder() {
    this(new Schemes());
  }
  
  public SchemesBuilder(SchemesFluent<?> fluent) {
    this(fluent, new Schemes());
  }
  
  public SchemesBuilder(SchemesFluent<?> fluent,Schemes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SchemesBuilder(Schemes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SchemesFluent<?> fluent;
  
  public Schemes build() {
    Schemes buildable = new Schemes();
    buildable.setConsumer(fluent.buildConsumer());
    buildable.setHttp(fluent.getHttp());
    buildable.setId(fluent.getId());
    buildable.setPassive(fluent.getPassive());
    buildable.setProducer(fluent.buildProducer());
    return buildable;
  }
  

}