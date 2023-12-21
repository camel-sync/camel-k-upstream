package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IntegrationPlatformBuilder extends IntegrationPlatformFluent<IntegrationPlatformBuilder> implements VisitableBuilder<IntegrationPlatform,IntegrationPlatformBuilder>{
  public IntegrationPlatformBuilder() {
    this(new IntegrationPlatform());
  }
  
  public IntegrationPlatformBuilder(IntegrationPlatformFluent<?> fluent) {
    this(fluent, new IntegrationPlatform());
  }
  
  public IntegrationPlatformBuilder(IntegrationPlatformFluent<?> fluent,IntegrationPlatform instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IntegrationPlatformBuilder(IntegrationPlatform instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IntegrationPlatformFluent<?> fluent;
  
  public IntegrationPlatform build() {
    IntegrationPlatform buildable = new IntegrationPlatform();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    buildable.setKind(fluent.getKind());
    buildable.setApiVersion(fluent.getApiVersion());
    return buildable;
  }
  

}