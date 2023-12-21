package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IngressBuilder extends IngressFluent<IngressBuilder> implements VisitableBuilder<Ingress,IngressBuilder>{
  public IngressBuilder() {
    this(new Ingress());
  }
  
  public IngressBuilder(IngressFluent<?> fluent) {
    this(fluent, new Ingress());
  }
  
  public IngressBuilder(IngressFluent<?> fluent,Ingress instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IngressBuilder(Ingress instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IngressFluent<?> fluent;
  
  public Ingress build() {
    Ingress buildable = new Ingress();
    buildable.setAnnotations(fluent.getAnnotations());
    buildable.setAuto(fluent.getAuto());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setHost(fluent.getHost());
    buildable.setPath(fluent.getPath());
    buildable.setPathType(fluent.getPathType());
    return buildable;
  }
  

}