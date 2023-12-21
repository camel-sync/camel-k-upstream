package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IntegrationStatusBuilder extends IntegrationStatusFluent<IntegrationStatusBuilder> implements VisitableBuilder<IntegrationStatus,IntegrationStatusBuilder>{
  public IntegrationStatusBuilder() {
    this(new IntegrationStatus());
  }
  
  public IntegrationStatusBuilder(IntegrationStatusFluent<?> fluent) {
    this(fluent, new IntegrationStatus());
  }
  
  public IntegrationStatusBuilder(IntegrationStatusFluent<?> fluent,IntegrationStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IntegrationStatusBuilder(IntegrationStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IntegrationStatusFluent<?> fluent;
  
  public IntegrationStatus build() {
    IntegrationStatus buildable = new IntegrationStatus();
    buildable.setCapabilities(fluent.getCapabilities());
    buildable.setConditions(fluent.buildConditions());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setDependencies(fluent.getDependencies());
    buildable.setDigest(fluent.getDigest());
    buildable.setGeneratedSources(fluent.buildGeneratedSources());
    buildable.setImage(fluent.getImage());
    buildable.setIntegrationKit(fluent.buildIntegrationKit());
    buildable.setLastInitTimestamp(fluent.getLastInitTimestamp());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setPhase(fluent.getPhase());
    buildable.setPlatform(fluent.getPlatform());
    buildable.setProfile(fluent.getProfile());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setRuntimeProvider(fluent.getRuntimeProvider());
    buildable.setRuntimeVersion(fluent.getRuntimeVersion());
    buildable.setSelector(fluent.getSelector());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}