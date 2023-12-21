package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CamelCatalogStatusBuilder extends CamelCatalogStatusFluent<CamelCatalogStatusBuilder> implements VisitableBuilder<CamelCatalogStatus,CamelCatalogStatusBuilder>{
  public CamelCatalogStatusBuilder() {
    this(new CamelCatalogStatus());
  }
  
  public CamelCatalogStatusBuilder(CamelCatalogStatusFluent<?> fluent) {
    this(fluent, new CamelCatalogStatus());
  }
  
  public CamelCatalogStatusBuilder(CamelCatalogStatusFluent<?> fluent,CamelCatalogStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CamelCatalogStatusBuilder(CamelCatalogStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CamelCatalogStatusFluent<?> fluent;
  
  public CamelCatalogStatus build() {
    CamelCatalogStatus buildable = new CamelCatalogStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setImage(fluent.getImage());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setPhase(fluent.getPhase());
    return buildable;
  }
  

}