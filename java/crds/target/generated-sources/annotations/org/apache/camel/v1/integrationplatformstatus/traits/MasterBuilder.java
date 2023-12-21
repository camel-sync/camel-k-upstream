package org.apache.camel.v1.integrationplatformstatus.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class MasterBuilder extends MasterFluent<MasterBuilder> implements VisitableBuilder<Master,MasterBuilder>{
  public MasterBuilder() {
    this(new Master());
  }
  
  public MasterBuilder(MasterFluent<?> fluent) {
    this(fluent, new Master());
  }
  
  public MasterBuilder(MasterFluent<?> fluent,Master instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public MasterBuilder(Master instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  MasterFluent<?> fluent;
  
  public Master build() {
    Master buildable = new Master();
    buildable.setConfiguration(fluent.buildConfiguration());
    return buildable;
  }
  

}