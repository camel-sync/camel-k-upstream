package org.apache.camel.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KameletBindingBuilder extends KameletBindingFluent<KameletBindingBuilder> implements VisitableBuilder<KameletBinding,KameletBindingBuilder>{
  public KameletBindingBuilder() {
    this(new KameletBinding());
  }
  
  public KameletBindingBuilder(KameletBindingFluent<?> fluent) {
    this(fluent, new KameletBinding());
  }
  
  public KameletBindingBuilder(KameletBindingFluent<?> fluent,KameletBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KameletBindingBuilder(KameletBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KameletBindingFluent<?> fluent;
  
  public KameletBinding build() {
    KameletBinding buildable = new KameletBinding();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    buildable.setKind(fluent.getKind());
    buildable.setApiVersion(fluent.getApiVersion());
    return buildable;
  }
  

}