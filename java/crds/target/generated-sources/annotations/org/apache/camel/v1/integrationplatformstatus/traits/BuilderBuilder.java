package org.apache.camel.v1.integrationplatformstatus.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class BuilderBuilder extends BuilderFluent<BuilderBuilder> implements VisitableBuilder<Builder,BuilderBuilder>{
  public BuilderBuilder() {
    this(new Builder());
  }
  
  public BuilderBuilder(BuilderFluent<?> fluent) {
    this(fluent, new Builder());
  }
  
  public BuilderBuilder(BuilderFluent<?> fluent,Builder instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public BuilderBuilder(Builder instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  BuilderFluent<?> fluent;
  
  public Builder build() {
    Builder buildable = new Builder();
    buildable.setBaseImage(fluent.getBaseImage());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setIncrementalImageBuild(fluent.getIncrementalImageBuild());
    buildable.setLimitCPU(fluent.getLimitCPU());
    buildable.setLimitMemory(fluent.getLimitMemory());
    buildable.setMavenProfiles(fluent.getMavenProfiles());
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setOrderStrategy(fluent.getOrderStrategy());
    buildable.setProperties(fluent.getProperties());
    buildable.setRequestCPU(fluent.getRequestCPU());
    buildable.setRequestMemory(fluent.getRequestMemory());
    buildable.setStrategy(fluent.getStrategy());
    buildable.setTasks(fluent.getTasks());
    buildable.setTasksLimitCPU(fluent.getTasksLimitCPU());
    buildable.setTasksLimitMemory(fluent.getTasksLimitMemory());
    buildable.setTasksRequestCPU(fluent.getTasksRequestCPU());
    buildable.setTasksRequestMemory(fluent.getTasksRequestMemory());
    buildable.setVerbose(fluent.getVerbose());
    return buildable;
  }
  

}