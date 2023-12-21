package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class DownwardAPIBuilder extends DownwardAPIFluent<DownwardAPIBuilder> implements VisitableBuilder<DownwardAPI,DownwardAPIBuilder>{
  public DownwardAPIBuilder() {
    this(new DownwardAPI());
  }
  
  public DownwardAPIBuilder(DownwardAPIFluent<?> fluent) {
    this(fluent, new DownwardAPI());
  }
  
  public DownwardAPIBuilder(DownwardAPIFluent<?> fluent,DownwardAPI instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public DownwardAPIBuilder(DownwardAPI instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  DownwardAPIFluent<?> fluent;
  
  public DownwardAPI build() {
    DownwardAPI buildable = new DownwardAPI();
    buildable.setItems(fluent.buildItems());
    return buildable;
  }
  

}