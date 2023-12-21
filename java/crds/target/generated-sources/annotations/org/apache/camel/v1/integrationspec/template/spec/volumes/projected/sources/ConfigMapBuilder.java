package org.apache.camel.v1.integrationspec.template.spec.volumes.projected.sources;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ConfigMapBuilder extends ConfigMapFluent<ConfigMapBuilder> implements VisitableBuilder<ConfigMap,ConfigMapBuilder>{
  public ConfigMapBuilder() {
    this(new ConfigMap());
  }
  
  public ConfigMapBuilder(ConfigMapFluent<?> fluent) {
    this(fluent, new ConfigMap());
  }
  
  public ConfigMapBuilder(ConfigMapFluent<?> fluent,ConfigMap instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ConfigMapBuilder(ConfigMap instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ConfigMapFluent<?> fluent;
  
  public ConfigMap build() {
    ConfigMap buildable = new ConfigMap();
    buildable.setItems(fluent.buildItems());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  

}