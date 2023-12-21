package org.apache.camel.v1alpha1.kameletbindingspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IntegrationBuilder extends IntegrationFluent<IntegrationBuilder> implements VisitableBuilder<Integration,IntegrationBuilder>{
  public IntegrationBuilder() {
    this(new Integration());
  }
  
  public IntegrationBuilder(IntegrationFluent<?> fluent) {
    this(fluent, new Integration());
  }
  
  public IntegrationBuilder(IntegrationFluent<?> fluent,Integration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IntegrationBuilder(Integration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IntegrationFluent<?> fluent;
  
  public Integration build() {
    Integration buildable = new Integration();
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