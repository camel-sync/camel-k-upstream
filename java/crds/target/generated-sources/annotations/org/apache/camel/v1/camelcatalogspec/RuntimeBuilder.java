package org.apache.camel.v1.camelcatalogspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class RuntimeBuilder extends RuntimeFluent<RuntimeBuilder> implements VisitableBuilder<Runtime,RuntimeBuilder>{
  public RuntimeBuilder() {
    this(new Runtime());
  }
  
  public RuntimeBuilder(RuntimeFluent<?> fluent) {
    this(fluent, new Runtime());
  }
  
  public RuntimeBuilder(RuntimeFluent<?> fluent,Runtime instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RuntimeBuilder(Runtime instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RuntimeFluent<?> fluent;
  
  public Runtime build() {
    Runtime buildable = new Runtime();
    buildable.setApplicationClass(fluent.getApplicationClass());
    buildable.setCapabilities(fluent.getCapabilities());
    buildable.setDependencies(fluent.buildDependencies());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setProvider(fluent.getProvider());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}