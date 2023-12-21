package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class DataSourceBuilder extends DataSourceFluent<DataSourceBuilder> implements VisitableBuilder<DataSource,DataSourceBuilder>{
  public DataSourceBuilder() {
    this(new DataSource());
  }
  
  public DataSourceBuilder(DataSourceFluent<?> fluent) {
    this(fluent, new DataSource());
  }
  
  public DataSourceBuilder(DataSourceFluent<?> fluent,DataSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public DataSourceBuilder(DataSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  DataSourceFluent<?> fluent;
  
  public DataSource build() {
    DataSource buildable = new DataSource();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}