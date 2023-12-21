package org.apache.camel.v1.pipespec.integration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IntegrationKitBuilder extends IntegrationKitFluent<IntegrationKitBuilder> implements VisitableBuilder<IntegrationKit,IntegrationKitBuilder>{
  public IntegrationKitBuilder() {
    this(new IntegrationKit());
  }
  
  public IntegrationKitBuilder(IntegrationKitFluent<?> fluent) {
    this(fluent, new IntegrationKit());
  }
  
  public IntegrationKitBuilder(IntegrationKitFluent<?> fluent,IntegrationKit instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IntegrationKitBuilder(IntegrationKit instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IntegrationKitFluent<?> fluent;
  
  public IntegrationKit build() {
    IntegrationKit buildable = new IntegrationKit();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldPath(fluent.getFieldPath());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}