package org.apache.camel.v1.integrationspec.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class FlockerBuilder extends FlockerFluent<FlockerBuilder> implements VisitableBuilder<Flocker,FlockerBuilder>{
  public FlockerBuilder() {
    this(new Flocker());
  }
  
  public FlockerBuilder(FlockerFluent<?> fluent) {
    this(fluent, new Flocker());
  }
  
  public FlockerBuilder(FlockerFluent<?> fluent,Flocker instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public FlockerBuilder(Flocker instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  FlockerFluent<?> fluent;
  
  public Flocker build() {
    Flocker buildable = new Flocker();
    buildable.setDatasetName(fluent.getDatasetName());
    buildable.setDatasetUUID(fluent.getDatasetUUID());
    return buildable;
  }
  

}