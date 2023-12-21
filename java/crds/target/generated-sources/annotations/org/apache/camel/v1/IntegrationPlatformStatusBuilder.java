package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IntegrationPlatformStatusBuilder extends IntegrationPlatformStatusFluent<IntegrationPlatformStatusBuilder> implements VisitableBuilder<IntegrationPlatformStatus,IntegrationPlatformStatusBuilder>{
  public IntegrationPlatformStatusBuilder() {
    this(new IntegrationPlatformStatus());
  }
  
  public IntegrationPlatformStatusBuilder(IntegrationPlatformStatusFluent<?> fluent) {
    this(fluent, new IntegrationPlatformStatus());
  }
  
  public IntegrationPlatformStatusBuilder(IntegrationPlatformStatusFluent<?> fluent,IntegrationPlatformStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IntegrationPlatformStatusBuilder(IntegrationPlatformStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IntegrationPlatformStatusFluent<?> fluent;
  
  public IntegrationPlatformStatus build() {
    IntegrationPlatformStatus buildable = new IntegrationPlatformStatus();
    buildable.setBuild(fluent.buildBuild());
    buildable.setCluster(fluent.getCluster());
    buildable.setConditions(fluent.buildConditions());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setInfo(fluent.getInfo());
    buildable.setKamelet(fluent.buildKamelet());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setPhase(fluent.getPhase());
    buildable.setProfile(fluent.getProfile());
    buildable.setTraits(fluent.buildTraits());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}