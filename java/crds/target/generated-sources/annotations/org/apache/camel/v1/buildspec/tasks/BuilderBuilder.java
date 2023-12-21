package org.apache.camel.v1.buildspec.tasks;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class BuilderBuilder extends BuilderFluent<BuilderBuilder> implements VisitableBuilder<Builder,BuilderBuilder>{
  public BuilderBuilder() {
    this(new Builder());
  }
  
  public BuilderBuilder(BuilderFluent<?> fluent) {
    this(fluent, new Builder());
  }
  
  public BuilderBuilder(BuilderFluent<?> fluent,Builder instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public BuilderBuilder(Builder instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  BuilderFluent<?> fluent;
  
  public Builder build() {
    Builder buildable = new Builder();
    buildable.setBaseImage(fluent.getBaseImage());
    buildable.setBuildDir(fluent.getBuildDir());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setDependencies(fluent.getDependencies());
    buildable.setMaven(fluent.buildMaven());
    buildable.setName(fluent.getName());
    buildable.setRuntime(fluent.buildRuntime());
    buildable.setSources(fluent.buildSources());
    buildable.setSteps(fluent.getSteps());
    return buildable;
  }
  

}