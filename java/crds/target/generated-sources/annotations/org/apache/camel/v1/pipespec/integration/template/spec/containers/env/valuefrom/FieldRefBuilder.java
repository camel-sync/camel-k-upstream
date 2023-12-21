package org.apache.camel.v1.pipespec.integration.template.spec.containers.env.valuefrom;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class FieldRefBuilder extends FieldRefFluent<FieldRefBuilder> implements VisitableBuilder<FieldRef,FieldRefBuilder>{
  public FieldRefBuilder() {
    this(new FieldRef());
  }
  
  public FieldRefBuilder(FieldRefFluent<?> fluent) {
    this(fluent, new FieldRef());
  }
  
  public FieldRefBuilder(FieldRefFluent<?> fluent,FieldRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public FieldRefBuilder(FieldRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  FieldRefFluent<?> fluent;
  
  public FieldRef build() {
    FieldRef buildable = new FieldRef();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldPath(fluent.getFieldPath());
    return buildable;
  }
  

}