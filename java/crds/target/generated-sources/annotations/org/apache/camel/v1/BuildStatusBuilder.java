package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class BuildStatusBuilder extends BuildStatusFluent<BuildStatusBuilder> implements VisitableBuilder<BuildStatus,BuildStatusBuilder>{
  public BuildStatusBuilder() {
    this(new BuildStatus());
  }
  
  public BuildStatusBuilder(BuildStatusFluent<?> fluent) {
    this(fluent, new BuildStatus());
  }
  
  public BuildStatusBuilder(BuildStatusFluent<?> fluent,BuildStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public BuildStatusBuilder(BuildStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  BuildStatusFluent<?> fluent;
  
  public BuildStatus build() {
    BuildStatus buildable = new BuildStatus();
    buildable.setArtifacts(fluent.buildArtifacts());
    buildable.setBaseImage(fluent.getBaseImage());
    buildable.setConditions(fluent.buildConditions());
    buildable.setDigest(fluent.getDigest());
    buildable.setDuration(fluent.getDuration());
    buildable.setError(fluent.getError());
    buildable.setFailure(fluent.buildFailure());
    buildable.setImage(fluent.getImage());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setPhase(fluent.getPhase());
    buildable.setRootImage(fluent.getRootImage());
    buildable.setStartedAt(fluent.getStartedAt());
    return buildable;
  }
  

}