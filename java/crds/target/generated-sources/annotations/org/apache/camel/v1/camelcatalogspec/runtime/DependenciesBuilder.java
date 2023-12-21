package org.apache.camel.v1.camelcatalogspec.runtime;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class DependenciesBuilder extends DependenciesFluent<DependenciesBuilder> implements VisitableBuilder<Dependencies,DependenciesBuilder>{
  public DependenciesBuilder() {
    this(new Dependencies());
  }
  
  public DependenciesBuilder(DependenciesFluent<?> fluent) {
    this(fluent, new Dependencies());
  }
  
  public DependenciesBuilder(DependenciesFluent<?> fluent,Dependencies instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public DependenciesBuilder(Dependencies instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  DependenciesFluent<?> fluent;
  
  public Dependencies build() {
    Dependencies buildable = new Dependencies();
    buildable.setArtifactId(fluent.getArtifactId());
    buildable.setGroupId(fluent.getGroupId());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}