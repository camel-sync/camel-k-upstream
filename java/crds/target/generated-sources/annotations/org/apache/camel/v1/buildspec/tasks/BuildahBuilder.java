package org.apache.camel.v1.buildspec.tasks;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class BuildahBuilder extends BuildahFluent<BuildahBuilder> implements VisitableBuilder<Buildah,BuildahBuilder>{
  public BuildahBuilder() {
    this(new Buildah());
  }
  
  public BuildahBuilder(BuildahFluent<?> fluent) {
    this(fluent, new Buildah());
  }
  
  public BuildahBuilder(BuildahFluent<?> fluent,Buildah instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public BuildahBuilder(Buildah instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  BuildahFluent<?> fluent;
  
  public Buildah build() {
    Buildah buildable = new Buildah();
    buildable.setBaseImage(fluent.getBaseImage());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setContextDir(fluent.getContextDir());
    buildable.setExecutorImage(fluent.getExecutorImage());
    buildable.setImage(fluent.getImage());
    buildable.setName(fluent.getName());
    buildable.setPlatform(fluent.getPlatform());
    buildable.setRegistry(fluent.buildRegistry());
    buildable.setVerbose(fluent.getVerbose());
    return buildable;
  }
  

}