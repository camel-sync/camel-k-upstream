package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TracingBuilder extends TracingFluent<TracingBuilder> implements VisitableBuilder<Tracing,TracingBuilder>{
  public TracingBuilder() {
    this(new Tracing());
  }
  
  public TracingBuilder(TracingFluent<?> fluent) {
    this(fluent, new Tracing());
  }
  
  public TracingBuilder(TracingFluent<?> fluent,Tracing instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TracingBuilder(Tracing instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TracingFluent<?> fluent;
  
  public Tracing build() {
    Tracing buildable = new Tracing();
    buildable.setConfiguration(fluent.buildConfiguration());
    return buildable;
  }
  

}