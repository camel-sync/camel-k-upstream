package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class NfsBuilder extends NfsFluent<NfsBuilder> implements VisitableBuilder<Nfs,NfsBuilder>{
  public NfsBuilder() {
    this(new Nfs());
  }
  
  public NfsBuilder(NfsFluent<?> fluent) {
    this(fluent, new Nfs());
  }
  
  public NfsBuilder(NfsFluent<?> fluent,Nfs instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public NfsBuilder(Nfs instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  NfsFluent<?> fluent;
  
  public Nfs build() {
    Nfs buildable = new Nfs();
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setServer(fluent.getServer());
    return buildable;
  }
  

}