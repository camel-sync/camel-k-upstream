package org.apache.camel.v1.integrationplatformspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PlatformBuilder extends PlatformFluent<PlatformBuilder> implements VisitableBuilder<Platform,PlatformBuilder>{
  public PlatformBuilder() {
    this(new Platform());
  }
  
  public PlatformBuilder(PlatformFluent<?> fluent) {
    this(fluent, new Platform());
  }
  
  public PlatformBuilder(PlatformFluent<?> fluent,Platform instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PlatformBuilder(Platform instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PlatformFluent<?> fluent;
  
  public Platform build() {
    Platform buildable = new Platform();
    buildable.setAuto(fluent.getAuto());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setCreateDefault(fluent.getCreateDefault());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setGlobal(fluent.getGlobal());
    return buildable;
  }
  

}