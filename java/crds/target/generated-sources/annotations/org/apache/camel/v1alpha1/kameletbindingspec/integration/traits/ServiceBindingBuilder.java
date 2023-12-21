package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ServiceBindingBuilder extends ServiceBindingFluent<ServiceBindingBuilder> implements VisitableBuilder<ServiceBinding,ServiceBindingBuilder>{
  public ServiceBindingBuilder() {
    this(new ServiceBinding());
  }
  
  public ServiceBindingBuilder(ServiceBindingFluent<?> fluent) {
    this(fluent, new ServiceBinding());
  }
  
  public ServiceBindingBuilder(ServiceBindingFluent<?> fluent,ServiceBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ServiceBindingBuilder(ServiceBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ServiceBindingFluent<?> fluent;
  
  public ServiceBinding build() {
    ServiceBinding buildable = new ServiceBinding();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setServices(fluent.getServices());
    return buildable;
  }
  

}