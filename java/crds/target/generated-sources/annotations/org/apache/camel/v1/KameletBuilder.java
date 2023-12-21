package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KameletBuilder extends KameletFluent<KameletBuilder> implements VisitableBuilder<Kamelet,KameletBuilder>{
  public KameletBuilder() {
    this(new Kamelet());
  }
  
  public KameletBuilder(KameletFluent<?> fluent) {
    this(fluent, new Kamelet());
  }
  
  public KameletBuilder(KameletFluent<?> fluent,Kamelet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KameletBuilder(Kamelet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KameletFluent<?> fluent;
  
  public Kamelet build() {
    Kamelet buildable = new Kamelet();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    buildable.setKind(fluent.getKind());
    buildable.setApiVersion(fluent.getApiVersion());
    return buildable;
  }
  

}