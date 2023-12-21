package org.apache.camel.v1.integrationplatformstatus.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class OwnerBuilder extends OwnerFluent<OwnerBuilder> implements VisitableBuilder<Owner,OwnerBuilder>{
  public OwnerBuilder() {
    this(new Owner());
  }
  
  public OwnerBuilder(OwnerFluent<?> fluent) {
    this(fluent, new Owner());
  }
  
  public OwnerBuilder(OwnerFluent<?> fluent,Owner instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public OwnerBuilder(Owner instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  OwnerFluent<?> fluent;
  
  public Owner build() {
    Owner buildable = new Owner();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setTargetAnnotations(fluent.getTargetAnnotations());
    buildable.setTargetLabels(fluent.getTargetLabels());
    return buildable;
  }
  

}