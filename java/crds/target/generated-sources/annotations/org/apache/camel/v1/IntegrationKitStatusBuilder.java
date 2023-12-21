package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IntegrationKitStatusBuilder extends IntegrationKitStatusFluent<IntegrationKitStatusBuilder> implements VisitableBuilder<IntegrationKitStatus,IntegrationKitStatusBuilder>{
  public IntegrationKitStatusBuilder() {
    this(new IntegrationKitStatus());
  }
  
  public IntegrationKitStatusBuilder(IntegrationKitStatusFluent<?> fluent) {
    this(fluent, new IntegrationKitStatus());
  }
  
  public IntegrationKitStatusBuilder(IntegrationKitStatusFluent<?> fluent,IntegrationKitStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IntegrationKitStatusBuilder(IntegrationKitStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IntegrationKitStatusFluent<?> fluent;
  
  public IntegrationKitStatus build() {
    IntegrationKitStatus buildable = new IntegrationKitStatus();
    buildable.setArtifacts(fluent.buildArtifacts());
    buildable.setBaseImage(fluent.getBaseImage());
    buildable.setConditions(fluent.buildConditions());
    buildable.setDigest(fluent.getDigest());
    buildable.setFailure(fluent.buildFailure());
    buildable.setImage(fluent.getImage());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setPhase(fluent.getPhase());
    buildable.setPlatform(fluent.getPlatform());
    buildable.setRootImage(fluent.getRootImage());
    buildable.setRuntimeProvider(fluent.getRuntimeProvider());
    buildable.setRuntimeVersion(fluent.getRuntimeVersion());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}