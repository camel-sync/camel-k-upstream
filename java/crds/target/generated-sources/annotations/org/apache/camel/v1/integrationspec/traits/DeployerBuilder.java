package org.apache.camel.v1.integrationspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class DeployerBuilder extends DeployerFluent<DeployerBuilder> implements VisitableBuilder<Deployer,DeployerBuilder>{
  public DeployerBuilder() {
    this(new Deployer());
  }
  
  public DeployerBuilder(DeployerFluent<?> fluent) {
    this(fluent, new Deployer());
  }
  
  public DeployerBuilder(DeployerFluent<?> fluent,Deployer instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public DeployerBuilder(Deployer instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  DeployerFluent<?> fluent;
  
  public Deployer build() {
    Deployer buildable = new Deployer();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setKind(fluent.getKind());
    buildable.setUseSSA(fluent.getUseSSA());
    return buildable;
  }
  

}