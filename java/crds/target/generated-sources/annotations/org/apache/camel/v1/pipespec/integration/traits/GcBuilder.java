package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class GcBuilder extends GcFluent<GcBuilder> implements VisitableBuilder<Gc,GcBuilder>{
  public GcBuilder() {
    this(new Gc());
  }
  
  public GcBuilder(GcFluent<?> fluent) {
    this(fluent, new Gc());
  }
  
  public GcBuilder(GcFluent<?> fluent,Gc instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public GcBuilder(Gc instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  GcFluent<?> fluent;
  
  public Gc build() {
    Gc buildable = new Gc();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setDiscoveryCache(fluent.getDiscoveryCache());
    buildable.setEnabled(fluent.getEnabled());
    return buildable;
  }
  

}