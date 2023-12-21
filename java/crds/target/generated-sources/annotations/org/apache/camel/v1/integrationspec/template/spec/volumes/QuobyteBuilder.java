package org.apache.camel.v1.integrationspec.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class QuobyteBuilder extends QuobyteFluent<QuobyteBuilder> implements VisitableBuilder<Quobyte,QuobyteBuilder>{
  public QuobyteBuilder() {
    this(new Quobyte());
  }
  
  public QuobyteBuilder(QuobyteFluent<?> fluent) {
    this(fluent, new Quobyte());
  }
  
  public QuobyteBuilder(QuobyteFluent<?> fluent,Quobyte instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public QuobyteBuilder(Quobyte instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  QuobyteFluent<?> fluent;
  
  public Quobyte build() {
    Quobyte buildable = new Quobyte();
    buildable.setGroup(fluent.getGroup());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setRegistry(fluent.getRegistry());
    buildable.setTenant(fluent.getTenant());
    buildable.setUser(fluent.getUser());
    buildable.setVolume(fluent.getVolume());
    return buildable;
  }
  

}