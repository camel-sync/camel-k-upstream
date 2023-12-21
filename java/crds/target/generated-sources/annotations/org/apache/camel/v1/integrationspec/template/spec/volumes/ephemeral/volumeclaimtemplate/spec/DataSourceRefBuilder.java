package org.apache.camel.v1.integrationspec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class DataSourceRefBuilder extends DataSourceRefFluent<DataSourceRefBuilder> implements VisitableBuilder<DataSourceRef,DataSourceRefBuilder>{
  public DataSourceRefBuilder() {
    this(new DataSourceRef());
  }
  
  public DataSourceRefBuilder(DataSourceRefFluent<?> fluent) {
    this(fluent, new DataSourceRef());
  }
  
  public DataSourceRefBuilder(DataSourceRefFluent<?> fluent,DataSourceRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public DataSourceRefBuilder(DataSourceRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  DataSourceRefFluent<?> fluent;
  
  public DataSourceRef build() {
    DataSourceRef buildable = new DataSourceRef();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  

}