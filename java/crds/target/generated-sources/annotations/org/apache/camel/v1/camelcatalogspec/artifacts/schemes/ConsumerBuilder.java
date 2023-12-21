package org.apache.camel.v1.camelcatalogspec.artifacts.schemes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ConsumerBuilder extends ConsumerFluent<ConsumerBuilder> implements VisitableBuilder<Consumer,ConsumerBuilder>{
  public ConsumerBuilder() {
    this(new Consumer());
  }
  
  public ConsumerBuilder(ConsumerFluent<?> fluent) {
    this(fluent, new Consumer());
  }
  
  public ConsumerBuilder(ConsumerFluent<?> fluent,Consumer instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ConsumerBuilder(Consumer instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ConsumerFluent<?> fluent;
  
  public Consumer build() {
    Consumer buildable = new Consumer();
    buildable.setDependencies(fluent.buildDependencies());
    return buildable;
  }
  

}