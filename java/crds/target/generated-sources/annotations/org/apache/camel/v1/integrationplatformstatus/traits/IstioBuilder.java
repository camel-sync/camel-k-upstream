package org.apache.camel.v1.integrationplatformstatus.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IstioBuilder extends IstioFluent<IstioBuilder> implements VisitableBuilder<Istio,IstioBuilder>{
  public IstioBuilder() {
    this(new Istio());
  }
  
  public IstioBuilder(IstioFluent<?> fluent) {
    this(fluent, new Istio());
  }
  
  public IstioBuilder(IstioFluent<?> fluent,Istio instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IstioBuilder(Istio instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IstioFluent<?> fluent;
  
  public Istio build() {
    Istio buildable = new Istio();
    buildable.setAllow(fluent.getAllow());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setInject(fluent.getInject());
    return buildable;
  }
  

}