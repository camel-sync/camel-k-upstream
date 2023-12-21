package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PipeBuilder extends PipeFluent<PipeBuilder> implements VisitableBuilder<Pipe,PipeBuilder>{
  public PipeBuilder() {
    this(new Pipe());
  }
  
  public PipeBuilder(PipeFluent<?> fluent) {
    this(fluent, new Pipe());
  }
  
  public PipeBuilder(PipeFluent<?> fluent,Pipe instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PipeBuilder(Pipe instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PipeFluent<?> fluent;
  
  public Pipe build() {
    Pipe buildable = new Pipe();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    buildable.setKind(fluent.getKind());
    buildable.setApiVersion(fluent.getApiVersion());
    return buildable;
  }
  

}