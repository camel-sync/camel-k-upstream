package org.apache.camel.v1alpha1.kameletbindingspec.sink;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class RefBuilder extends RefFluent<RefBuilder> implements VisitableBuilder<Ref,RefBuilder>{
  public RefBuilder() {
    this(new Ref());
  }
  
  public RefBuilder(RefFluent<?> fluent) {
    this(fluent, new Ref());
  }
  
  public RefBuilder(RefFluent<?> fluent,Ref instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RefBuilder(Ref instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RefFluent<?> fluent;
  
  public Ref build() {
    Ref buildable = new Ref();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldPath(fluent.getFieldPath());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}