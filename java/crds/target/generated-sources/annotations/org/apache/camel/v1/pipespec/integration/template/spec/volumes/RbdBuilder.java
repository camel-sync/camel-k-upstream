package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class RbdBuilder extends RbdFluent<RbdBuilder> implements VisitableBuilder<Rbd,RbdBuilder>{
  public RbdBuilder() {
    this(new Rbd());
  }
  
  public RbdBuilder(RbdFluent<?> fluent) {
    this(fluent, new Rbd());
  }
  
  public RbdBuilder(RbdFluent<?> fluent,Rbd instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RbdBuilder(Rbd instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RbdFluent<?> fluent;
  
  public Rbd build() {
    Rbd buildable = new Rbd();
    buildable.setFsType(fluent.getFsType());
    buildable.setImage(fluent.getImage());
    buildable.setKeyring(fluent.getKeyring());
    buildable.setMonitors(fluent.getMonitors());
    buildable.setPool(fluent.getPool());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  

}