package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ContainerBuilder extends ContainerFluent<ContainerBuilder> implements VisitableBuilder<Container,ContainerBuilder>{
  public ContainerBuilder() {
    this(new Container());
  }
  
  public ContainerBuilder(ContainerFluent<?> fluent) {
    this(fluent, new Container());
  }
  
  public ContainerBuilder(ContainerFluent<?> fluent,Container instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ContainerBuilder(Container instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ContainerFluent<?> fluent;
  
  public Container build() {
    Container buildable = new Container();
    buildable.setAuto(fluent.getAuto());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setExpose(fluent.getExpose());
    buildable.setImage(fluent.getImage());
    buildable.setImagePullPolicy(fluent.getImagePullPolicy());
    buildable.setLimitCPU(fluent.getLimitCPU());
    buildable.setLimitMemory(fluent.getLimitMemory());
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    buildable.setPortName(fluent.getPortName());
    buildable.setRequestCPU(fluent.getRequestCPU());
    buildable.setRequestMemory(fluent.getRequestMemory());
    buildable.setServicePort(fluent.getServicePort());
    buildable.setServicePortName(fluent.getServicePortName());
    return buildable;
  }
  

}