package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CamelCatalogSpecBuilder extends CamelCatalogSpecFluent<CamelCatalogSpecBuilder> implements VisitableBuilder<CamelCatalogSpec,CamelCatalogSpecBuilder>{
  public CamelCatalogSpecBuilder() {
    this(new CamelCatalogSpec());
  }
  
  public CamelCatalogSpecBuilder(CamelCatalogSpecFluent<?> fluent) {
    this(fluent, new CamelCatalogSpec());
  }
  
  public CamelCatalogSpecBuilder(CamelCatalogSpecFluent<?> fluent,CamelCatalogSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CamelCatalogSpecBuilder(CamelCatalogSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CamelCatalogSpecFluent<?> fluent;
  
  public CamelCatalogSpec build() {
    CamelCatalogSpec buildable = new CamelCatalogSpec();
    buildable.setArtifacts(fluent.getArtifacts());
    buildable.setLoaders(fluent.getLoaders());
    buildable.setRuntime(fluent.buildRuntime());
    return buildable;
  }
  

}