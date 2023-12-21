package org.apache.camel.v1.pipespec.integration.template.spec.ephemeralcontainers;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PortsBuilder extends PortsFluent<PortsBuilder> implements VisitableBuilder<Ports,PortsBuilder>{
  public PortsBuilder() {
    this(new Ports());
  }
  
  public PortsBuilder(PortsFluent<?> fluent) {
    this(fluent, new Ports());
  }
  
  public PortsBuilder(PortsFluent<?> fluent,Ports instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PortsBuilder(Ports instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PortsFluent<?> fluent;
  
  public Ports build() {
    Ports buildable = new Ports();
    buildable.setContainerPort(fluent.getContainerPort());
    buildable.setHostIP(fluent.getHostIP());
    buildable.setHostPort(fluent.getHostPort());
    buildable.setName(fluent.getName());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  

}