package org.apache.camel.v1.integrationplatformstatus.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KameletsBuilder extends KameletsFluent<KameletsBuilder> implements VisitableBuilder<Kamelets,KameletsBuilder>{
  public KameletsBuilder() {
    this(new Kamelets());
  }
  
  public KameletsBuilder(KameletsFluent<?> fluent) {
    this(fluent, new Kamelets());
  }
  
  public KameletsBuilder(KameletsFluent<?> fluent,Kamelets instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KameletsBuilder(Kamelets instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KameletsFluent<?> fluent;
  
  public Kamelets build() {
    Kamelets buildable = new Kamelets();
    buildable.setAuto(fluent.getAuto());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setList(fluent.getList());
    buildable.setMountPoint(fluent.getMountPoint());
    return buildable;
  }
  

}