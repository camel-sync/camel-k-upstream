package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CamelCatalogBuilder extends CamelCatalogFluent<CamelCatalogBuilder> implements VisitableBuilder<CamelCatalog,CamelCatalogBuilder>{
  public CamelCatalogBuilder() {
    this(new CamelCatalog());
  }
  
  public CamelCatalogBuilder(CamelCatalogFluent<?> fluent) {
    this(fluent, new CamelCatalog());
  }
  
  public CamelCatalogBuilder(CamelCatalogFluent<?> fluent,CamelCatalog instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CamelCatalogBuilder(CamelCatalog instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CamelCatalogFluent<?> fluent;
  
  public CamelCatalog build() {
    CamelCatalog buildable = new CamelCatalog();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    buildable.setKind(fluent.getKind());
    buildable.setApiVersion(fluent.getApiVersion());
    return buildable;
  }
  

}