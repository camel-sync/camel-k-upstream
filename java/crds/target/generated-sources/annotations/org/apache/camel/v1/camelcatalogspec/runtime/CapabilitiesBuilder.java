package org.apache.camel.v1.camelcatalogspec.runtime;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CapabilitiesBuilder extends CapabilitiesFluent<CapabilitiesBuilder> implements VisitableBuilder<Capabilities,CapabilitiesBuilder>{
  public CapabilitiesBuilder() {
    this(new Capabilities());
  }
  
  public CapabilitiesBuilder(CapabilitiesFluent<?> fluent) {
    this(fluent, new Capabilities());
  }
  
  public CapabilitiesBuilder(CapabilitiesFluent<?> fluent,Capabilities instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CapabilitiesBuilder(Capabilities instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CapabilitiesFluent<?> fluent;
  
  public Capabilities build() {
    Capabilities buildable = new Capabilities();
    buildable.setDependencies(fluent.buildDependencies());
    return buildable;
  }
  

}