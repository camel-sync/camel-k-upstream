package org.apache.camel.v1.integrationplatformspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class EnvironmentBuilder extends EnvironmentFluent<EnvironmentBuilder> implements VisitableBuilder<Environment,EnvironmentBuilder>{
  public EnvironmentBuilder() {
    this(new Environment());
  }
  
  public EnvironmentBuilder(EnvironmentFluent<?> fluent) {
    this(fluent, new Environment());
  }
  
  public EnvironmentBuilder(EnvironmentFluent<?> fluent,Environment instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public EnvironmentBuilder(Environment instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  EnvironmentFluent<?> fluent;
  
  public Environment build() {
    Environment buildable = new Environment();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setContainerMeta(fluent.getContainerMeta());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setHttpProxy(fluent.getHttpProxy());
    buildable.setVars(fluent.getVars());
    return buildable;
  }
  

}