package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.initcontainers.env.valuefrom;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ResourceFieldRefBuilder extends ResourceFieldRefFluent<ResourceFieldRefBuilder> implements VisitableBuilder<ResourceFieldRef,ResourceFieldRefBuilder>{
  public ResourceFieldRefBuilder() {
    this(new ResourceFieldRef());
  }
  
  public ResourceFieldRefBuilder(ResourceFieldRefFluent<?> fluent) {
    this(fluent, new ResourceFieldRef());
  }
  
  public ResourceFieldRefBuilder(ResourceFieldRefFluent<?> fluent,ResourceFieldRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ResourceFieldRefBuilder(ResourceFieldRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ResourceFieldRefFluent<?> fluent;
  
  public ResourceFieldRef build() {
    ResourceFieldRef buildable = new ResourceFieldRef();
    buildable.setContainerName(fluent.getContainerName());
    buildable.setDivisor(fluent.getDivisor());
    buildable.setResource(fluent.getResource());
    return buildable;
  }
  

}