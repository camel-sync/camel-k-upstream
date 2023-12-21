package org.apache.camel.v1.integrationplatformstatus.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TolerationBuilder extends TolerationFluent<TolerationBuilder> implements VisitableBuilder<Toleration,TolerationBuilder>{
  public TolerationBuilder() {
    this(new Toleration());
  }
  
  public TolerationBuilder(TolerationFluent<?> fluent) {
    this(fluent, new Toleration());
  }
  
  public TolerationBuilder(TolerationFluent<?> fluent,Toleration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TolerationBuilder(Toleration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TolerationFluent<?> fluent;
  
  public Toleration build() {
    Toleration buildable = new Toleration();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setTaints(fluent.getTaints());
    return buildable;
  }
  

}