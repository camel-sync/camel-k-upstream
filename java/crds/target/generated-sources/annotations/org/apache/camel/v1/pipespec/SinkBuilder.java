package org.apache.camel.v1.pipespec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SinkBuilder extends SinkFluent<SinkBuilder> implements VisitableBuilder<Sink,SinkBuilder>{
  public SinkBuilder() {
    this(new Sink());
  }
  
  public SinkBuilder(SinkFluent<?> fluent) {
    this(fluent, new Sink());
  }
  
  public SinkBuilder(SinkFluent<?> fluent,Sink instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SinkBuilder(Sink instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SinkFluent<?> fluent;
  
  public Sink build() {
    Sink buildable = new Sink();
    buildable.setDataTypes(fluent.getDataTypes());
    buildable.setProperties(fluent.buildProperties());
    buildable.setRef(fluent.buildRef());
    buildable.setUri(fluent.getUri());
    return buildable;
  }
  

}