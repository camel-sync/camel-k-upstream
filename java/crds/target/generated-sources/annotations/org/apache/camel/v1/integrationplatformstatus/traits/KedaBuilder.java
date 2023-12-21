package org.apache.camel.v1.integrationplatformstatus.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KedaBuilder extends KedaFluent<KedaBuilder> implements VisitableBuilder<Keda,KedaBuilder>{
  public KedaBuilder() {
    this(new Keda());
  }
  
  public KedaBuilder(KedaFluent<?> fluent) {
    this(fluent, new Keda());
  }
  
  public KedaBuilder(KedaFluent<?> fluent,Keda instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KedaBuilder(Keda instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KedaFluent<?> fluent;
  
  public Keda build() {
    Keda buildable = new Keda();
    buildable.setConfiguration(fluent.buildConfiguration());
    return buildable;
  }
  

}