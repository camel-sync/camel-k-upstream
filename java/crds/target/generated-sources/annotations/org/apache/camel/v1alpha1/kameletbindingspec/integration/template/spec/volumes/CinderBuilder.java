package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CinderBuilder extends CinderFluent<CinderBuilder> implements VisitableBuilder<Cinder,CinderBuilder>{
  public CinderBuilder() {
    this(new Cinder());
  }
  
  public CinderBuilder(CinderFluent<?> fluent) {
    this(fluent, new Cinder());
  }
  
  public CinderBuilder(CinderFluent<?> fluent,Cinder instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CinderBuilder(Cinder instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CinderFluent<?> fluent;
  
  public Cinder build() {
    Cinder buildable = new Cinder();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  

}