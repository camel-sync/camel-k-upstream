package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CephfsBuilder extends CephfsFluent<CephfsBuilder> implements VisitableBuilder<Cephfs,CephfsBuilder>{
  public CephfsBuilder() {
    this(new Cephfs());
  }
  
  public CephfsBuilder(CephfsFluent<?> fluent) {
    this(fluent, new Cephfs());
  }
  
  public CephfsBuilder(CephfsFluent<?> fluent,Cephfs instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CephfsBuilder(Cephfs instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CephfsFluent<?> fluent;
  
  public Cephfs build() {
    Cephfs buildable = new Cephfs();
    buildable.setMonitors(fluent.getMonitors());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretFile(fluent.getSecretFile());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  

}