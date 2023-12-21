package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class EphemeralBuilder extends EphemeralFluent<EphemeralBuilder> implements VisitableBuilder<Ephemeral,EphemeralBuilder>{
  public EphemeralBuilder() {
    this(new Ephemeral());
  }
  
  public EphemeralBuilder(EphemeralFluent<?> fluent) {
    this(fluent, new Ephemeral());
  }
  
  public EphemeralBuilder(EphemeralFluent<?> fluent,Ephemeral instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public EphemeralBuilder(Ephemeral instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  EphemeralFluent<?> fluent;
  
  public Ephemeral build() {
    Ephemeral buildable = new Ephemeral();
    buildable.setVolumeClaimTemplate(fluent.buildVolumeClaimTemplate());
    return buildable;
  }
  

}