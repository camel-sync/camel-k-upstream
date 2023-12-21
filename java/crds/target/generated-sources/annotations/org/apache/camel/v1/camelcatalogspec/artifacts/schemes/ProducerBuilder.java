package org.apache.camel.v1.camelcatalogspec.artifacts.schemes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ProducerBuilder extends ProducerFluent<ProducerBuilder> implements VisitableBuilder<Producer,ProducerBuilder>{
  public ProducerBuilder() {
    this(new Producer());
  }
  
  public ProducerBuilder(ProducerFluent<?> fluent) {
    this(fluent, new Producer());
  }
  
  public ProducerBuilder(ProducerFluent<?> fluent,Producer instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ProducerBuilder(Producer instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ProducerFluent<?> fluent;
  
  public Producer build() {
    Producer buildable = new Producer();
    buildable.setDependencies(fluent.buildDependencies());
    return buildable;
  }
  

}