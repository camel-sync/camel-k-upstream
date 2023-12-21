package org.apache.camel.v1.buildspec.tasks.jib;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ConfigurationBuilder extends ConfigurationFluent<ConfigurationBuilder> implements VisitableBuilder<Configuration,ConfigurationBuilder>{
  public ConfigurationBuilder() {
    this(new Configuration());
  }
  
  public ConfigurationBuilder(ConfigurationFluent<?> fluent) {
    this(fluent, new Configuration());
  }
  
  public ConfigurationBuilder(ConfigurationFluent<?> fluent,Configuration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ConfigurationBuilder(Configuration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ConfigurationFluent<?> fluent;
  
  public Configuration build() {
    Configuration buildable = new Configuration();
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