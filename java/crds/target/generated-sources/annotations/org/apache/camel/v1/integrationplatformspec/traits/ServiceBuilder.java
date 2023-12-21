package org.apache.camel.v1.integrationplatformspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ServiceBuilder extends ServiceFluent<ServiceBuilder> implements VisitableBuilder<Service,ServiceBuilder>{
  public ServiceBuilder() {
    this(new Service());
  }
  
  public ServiceBuilder(ServiceFluent<?> fluent) {
    this(fluent, new Service());
  }
  
  public ServiceBuilder(ServiceFluent<?> fluent,Service instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ServiceBuilder(Service instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ServiceFluent<?> fluent;
  
  public Service build() {
    Service buildable = new Service();
    buildable.setAuto(fluent.getAuto());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setNodePort(fluent.getNodePort());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}