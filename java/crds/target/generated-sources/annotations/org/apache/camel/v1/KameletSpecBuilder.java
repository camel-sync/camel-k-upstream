package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KameletSpecBuilder extends KameletSpecFluent<KameletSpecBuilder> implements VisitableBuilder<KameletSpec,KameletSpecBuilder>{
  public KameletSpecBuilder() {
    this(new KameletSpec());
  }
  
  public KameletSpecBuilder(KameletSpecFluent<?> fluent) {
    this(fluent, new KameletSpec());
  }
  
  public KameletSpecBuilder(KameletSpecFluent<?> fluent,KameletSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KameletSpecBuilder(KameletSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KameletSpecFluent<?> fluent;
  
  public KameletSpec build() {
    KameletSpec buildable = new KameletSpec();
    buildable.setDataTypes(fluent.getDataTypes());
    buildable.setDefinition(fluent.buildDefinition());
    buildable.setDependencies(fluent.getDependencies());
    buildable.setSources(fluent.buildSources());
    buildable.setTemplate(fluent.buildTemplate());
    buildable.setTypes(fluent.getTypes());
    return buildable;
  }
  

}