package org.apache.camel.v1.integrationplatformspec.build;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class BuildConfigurationBuilder extends BuildConfigurationFluent<BuildConfigurationBuilder> implements VisitableBuilder<BuildConfiguration,BuildConfigurationBuilder>{
  public BuildConfigurationBuilder() {
    this(new BuildConfiguration());
  }
  
  public BuildConfigurationBuilder(BuildConfigurationFluent<?> fluent) {
    this(fluent, new BuildConfiguration());
  }
  
  public BuildConfigurationBuilder(BuildConfigurationFluent<?> fluent,BuildConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public BuildConfigurationBuilder(BuildConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  BuildConfigurationFluent<?> fluent;
  
  public BuildConfiguration build() {
    BuildConfiguration buildable = new BuildConfiguration();
    buildable.setLimitCPU(fluent.getLimitCPU());
    buildable.setLimitMemory(fluent.getLimitMemory());
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setOperatorNamespace(fluent.getOperatorNamespace());
    buildable.setOrderStrategy(fluent.getOrderStrategy());
    buildable.setRequestCPU(fluent.getRequestCPU());
    buildable.setRequestMemory(fluent.getRequestMemory());
    buildable.setStrategy(fluent.getStrategy());
    buildable.setToolImage(fluent.getToolImage());
    return buildable;
  }
  

}