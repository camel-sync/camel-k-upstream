package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class AddonsBuilder extends AddonsFluent<AddonsBuilder> implements VisitableBuilder<Addons,AddonsBuilder>{
  public AddonsBuilder() {
    this(new Addons());
  }
  
  public AddonsBuilder(AddonsFluent<?> fluent) {
    this(fluent, new Addons());
  }
  
  public AddonsBuilder(AddonsFluent<?> fluent,Addons instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AddonsBuilder(Addons instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AddonsFluent<?> fluent;
  
  public Addons build() {
    Addons buildable = new Addons();
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}