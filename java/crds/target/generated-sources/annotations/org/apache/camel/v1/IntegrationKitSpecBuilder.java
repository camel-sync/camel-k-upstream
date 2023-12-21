package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IntegrationKitSpecBuilder extends IntegrationKitSpecFluent<IntegrationKitSpecBuilder> implements VisitableBuilder<IntegrationKitSpec,IntegrationKitSpecBuilder>{
  public IntegrationKitSpecBuilder() {
    this(new IntegrationKitSpec());
  }
  
  public IntegrationKitSpecBuilder(IntegrationKitSpecFluent<?> fluent) {
    this(fluent, new IntegrationKitSpec());
  }
  
  public IntegrationKitSpecBuilder(IntegrationKitSpecFluent<?> fluent,IntegrationKitSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IntegrationKitSpecBuilder(IntegrationKitSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IntegrationKitSpecFluent<?> fluent;
  
  public IntegrationKitSpec build() {
    IntegrationKitSpec buildable = new IntegrationKitSpec();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setDependencies(fluent.getDependencies());
    buildable.setImage(fluent.getImage());
    buildable.setProfile(fluent.getProfile());
    buildable.setRepositories(fluent.getRepositories());
    buildable.setSources(fluent.buildSources());
    buildable.setTraits(fluent.buildTraits());
    return buildable;
  }
  

}