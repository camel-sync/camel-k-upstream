package org.apache.camel.v1.camelcatalogspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class LoadersBuilder extends LoadersFluent<LoadersBuilder> implements VisitableBuilder<Loaders,LoadersBuilder>{
  public LoadersBuilder() {
    this(new Loaders());
  }
  
  public LoadersBuilder(LoadersFluent<?> fluent) {
    this(fluent, new Loaders());
  }
  
  public LoadersBuilder(LoadersFluent<?> fluent,Loaders instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public LoadersBuilder(Loaders instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  LoadersFluent<?> fluent;
  
  public Loaders build() {
    Loaders buildable = new Loaders();
    buildable.setArtifactId(fluent.getArtifactId());
    buildable.setDependencies(fluent.buildDependencies());
    buildable.setGroupId(fluent.getGroupId());
    buildable.setLanguages(fluent.getLanguages());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}