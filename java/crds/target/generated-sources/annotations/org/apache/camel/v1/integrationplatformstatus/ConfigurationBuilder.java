package org.apache.camel.v1.integrationplatformstatus;

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
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}