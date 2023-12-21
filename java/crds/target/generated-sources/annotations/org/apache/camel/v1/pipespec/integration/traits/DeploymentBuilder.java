package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class DeploymentBuilder extends DeploymentFluent<DeploymentBuilder> implements VisitableBuilder<Deployment,DeploymentBuilder>{
  public DeploymentBuilder() {
    this(new Deployment());
  }
  
  public DeploymentBuilder(DeploymentFluent<?> fluent) {
    this(fluent, new Deployment());
  }
  
  public DeploymentBuilder(DeploymentFluent<?> fluent,Deployment instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public DeploymentBuilder(Deployment instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  DeploymentFluent<?> fluent;
  
  public Deployment build() {
    Deployment buildable = new Deployment();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setProgressDeadlineSeconds(fluent.getProgressDeadlineSeconds());
    buildable.setRollingUpdateMaxSurge(fluent.getRollingUpdateMaxSurge());
    buildable.setRollingUpdateMaxUnavailable(fluent.getRollingUpdateMaxUnavailable());
    buildable.setStrategy(fluent.getStrategy());
    return buildable;
  }
  

}