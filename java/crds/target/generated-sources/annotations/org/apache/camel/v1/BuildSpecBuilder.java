package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class BuildSpecBuilder extends BuildSpecFluent<BuildSpecBuilder> implements VisitableBuilder<BuildSpec,BuildSpecBuilder>{
  public BuildSpecBuilder() {
    this(new BuildSpec());
  }
  
  public BuildSpecBuilder(BuildSpecFluent<?> fluent) {
    this(fluent, new BuildSpec());
  }
  
  public BuildSpecBuilder(BuildSpecFluent<?> fluent,BuildSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public BuildSpecBuilder(BuildSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  BuildSpecFluent<?> fluent;
  
  public BuildSpec build() {
    BuildSpec buildable = new BuildSpec();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setMaxRunningBuilds(fluent.getMaxRunningBuilds());
    buildable.setOperatorNamespace(fluent.getOperatorNamespace());
    buildable.setTasks(fluent.buildTasks());
    buildable.setTimeout(fluent.getTimeout());
    buildable.setToolImage(fluent.getToolImage());
    return buildable;
  }
  

}