package org.apache.camel.v1.integrationplatformspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class BuildBuilder extends BuildFluent<BuildBuilder> implements VisitableBuilder<Build,BuildBuilder>{
  public BuildBuilder() {
    this(new Build());
  }
  
  public BuildBuilder(BuildFluent<?> fluent) {
    this(fluent, new Build());
  }
  
  public BuildBuilder(BuildFluent<?> fluent,Build instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public BuildBuilder(Build instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  BuildFluent<?> fluent;
  
  public Build build() {
    Build buildable = new Build();
    buildable.setPublishStrategyOptions(fluent.getPublishStrategyOptions());
    buildable.setBaseImage(fluent.getBaseImage());
    buildable.setBuildCatalogToolTimeout(fluent.getBuildCatalogToolTimeout());
    buildable.setBuildConfiguration(fluent.buildBuildConfiguration());
    buildable.setMaven(fluent.buildMaven());
    buildable.setMaxRunningBuilds(fluent.getMaxRunningBuilds());
    buildable.setPublishStrategy(fluent.getPublishStrategy());
    buildable.setRegistry(fluent.buildRegistry());
    buildable.setRuntimeProvider(fluent.getRuntimeProvider());
    buildable.setRuntimeVersion(fluent.getRuntimeVersion());
    buildable.setTimeout(fluent.getTimeout());
    return buildable;
  }
  

}