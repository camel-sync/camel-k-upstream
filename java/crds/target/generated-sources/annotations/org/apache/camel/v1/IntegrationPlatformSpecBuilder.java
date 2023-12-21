package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IntegrationPlatformSpecBuilder extends IntegrationPlatformSpecFluent<IntegrationPlatformSpecBuilder> implements VisitableBuilder<IntegrationPlatformSpec,IntegrationPlatformSpecBuilder>{
  public IntegrationPlatformSpecBuilder() {
    this(new IntegrationPlatformSpec());
  }
  
  public IntegrationPlatformSpecBuilder(IntegrationPlatformSpecFluent<?> fluent) {
    this(fluent, new IntegrationPlatformSpec());
  }
  
  public IntegrationPlatformSpecBuilder(IntegrationPlatformSpecFluent<?> fluent,IntegrationPlatformSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IntegrationPlatformSpecBuilder(IntegrationPlatformSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IntegrationPlatformSpecFluent<?> fluent;
  
  public IntegrationPlatformSpec build() {
    IntegrationPlatformSpec buildable = new IntegrationPlatformSpec();
    buildable.setBuild(fluent.buildBuild());
    buildable.setCluster(fluent.getCluster());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setKamelet(fluent.buildKamelet());
    buildable.setProfile(fluent.getProfile());
    buildable.setTraits(fluent.buildTraits());
    return buildable;
  }
  

}