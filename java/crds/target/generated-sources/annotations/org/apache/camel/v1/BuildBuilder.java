package org.apache.camel.v1;

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
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    buildable.setKind(fluent.getKind());
    buildable.setApiVersion(fluent.getApiVersion());
    return buildable;
  }
  

}