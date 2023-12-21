package org.apache.camel.v1.buildspec.tasks.package_.maven;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ServersBuilder extends ServersFluent<ServersBuilder> implements VisitableBuilder<Servers,ServersBuilder>{
  public ServersBuilder() {
    this(new Servers());
  }
  
  public ServersBuilder(ServersFluent<?> fluent) {
    this(fluent, new Servers());
  }
  
  public ServersBuilder(ServersFluent<?> fluent,Servers instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ServersBuilder(Servers instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ServersFluent<?> fluent;
  
  public Servers build() {
    Servers buildable = new Servers();
    buildable.setConfiguration(fluent.getConfiguration());
    buildable.setId(fluent.getId());
    buildable.setPassword(fluent.getPassword());
    buildable.setUsername(fluent.getUsername());
    return buildable;
  }
  

}