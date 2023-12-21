package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IntegrationSpecBuilder extends IntegrationSpecFluent<IntegrationSpecBuilder> implements VisitableBuilder<IntegrationSpec,IntegrationSpecBuilder>{
  public IntegrationSpecBuilder() {
    this(new IntegrationSpec());
  }
  
  public IntegrationSpecBuilder(IntegrationSpecFluent<?> fluent) {
    this(fluent, new IntegrationSpec());
  }
  
  public IntegrationSpecBuilder(IntegrationSpecFluent<?> fluent,IntegrationSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IntegrationSpecBuilder(IntegrationSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IntegrationSpecFluent<?> fluent;
  
  public IntegrationSpec build() {
    IntegrationSpec buildable = new IntegrationSpec();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setDependencies(fluent.getDependencies());
    buildable.setFlows(fluent.buildFlows());
    buildable.setIntegrationKit(fluent.buildIntegrationKit());
    buildable.setProfile(fluent.getProfile());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setRepositories(fluent.getRepositories());
    buildable.setServiceAccountName(fluent.getServiceAccountName());
    buildable.setSources(fluent.buildSources());
    buildable.setTemplate(fluent.buildTemplate());
    buildable.setTraits(fluent.buildTraits());
    return buildable;
  }
  

}