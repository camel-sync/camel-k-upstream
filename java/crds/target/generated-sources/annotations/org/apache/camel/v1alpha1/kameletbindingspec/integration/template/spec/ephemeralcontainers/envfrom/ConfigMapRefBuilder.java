package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.envfrom;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ConfigMapRefBuilder extends ConfigMapRefFluent<ConfigMapRefBuilder> implements VisitableBuilder<ConfigMapRef,ConfigMapRefBuilder>{
  public ConfigMapRefBuilder() {
    this(new ConfigMapRef());
  }
  
  public ConfigMapRefBuilder(ConfigMapRefFluent<?> fluent) {
    this(fluent, new ConfigMapRef());
  }
  
  public ConfigMapRefBuilder(ConfigMapRefFluent<?> fluent,ConfigMapRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ConfigMapRefBuilder(ConfigMapRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ConfigMapRefFluent<?> fluent;
  
  public ConfigMapRef build() {
    ConfigMapRef buildable = new ConfigMapRef();
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  

}