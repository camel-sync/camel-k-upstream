package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class FcBuilder extends FcFluent<FcBuilder> implements VisitableBuilder<Fc,FcBuilder>{
  public FcBuilder() {
    this(new Fc());
  }
  
  public FcBuilder(FcFluent<?> fluent) {
    this(fluent, new Fc());
  }
  
  public FcBuilder(FcFluent<?> fluent,Fc instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public FcBuilder(Fc instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  FcFluent<?> fluent;
  
  public Fc build() {
    Fc buildable = new Fc();
    buildable.setFsType(fluent.getFsType());
    buildable.setLun(fluent.getLun());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setTargetWWNs(fluent.getTargetWWNs());
    buildable.setWwids(fluent.getWwids());
    return buildable;
  }
  

}