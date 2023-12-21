package org.apache.camel.v1.pipespec.integration.template.spec.ephemeralcontainers.livenessprobe;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ExecBuilder extends ExecFluent<ExecBuilder> implements VisitableBuilder<Exec,ExecBuilder>{
  public ExecBuilder() {
    this(new Exec());
  }
  
  public ExecBuilder(ExecFluent<?> fluent) {
    this(fluent, new Exec());
  }
  
  public ExecBuilder(ExecFluent<?> fluent,Exec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ExecBuilder(Exec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ExecFluent<?> fluent;
  
  public Exec build() {
    Exec buildable = new Exec();
    buildable.setCommand(fluent.getCommand());
    return buildable;
  }
  

}