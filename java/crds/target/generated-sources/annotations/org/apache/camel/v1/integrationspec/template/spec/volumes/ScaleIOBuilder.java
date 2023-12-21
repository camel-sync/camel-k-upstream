package org.apache.camel.v1.integrationspec.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ScaleIOBuilder extends ScaleIOFluent<ScaleIOBuilder> implements VisitableBuilder<ScaleIO,ScaleIOBuilder>{
  public ScaleIOBuilder() {
    this(new ScaleIO());
  }
  
  public ScaleIOBuilder(ScaleIOFluent<?> fluent) {
    this(fluent, new ScaleIO());
  }
  
  public ScaleIOBuilder(ScaleIOFluent<?> fluent,ScaleIO instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ScaleIOBuilder(ScaleIO instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ScaleIOFluent<?> fluent;
  
  public ScaleIO build() {
    ScaleIO buildable = new ScaleIO();
    buildable.setFsType(fluent.getFsType());
    buildable.setGateway(fluent.getGateway());
    buildable.setProtectionDomain(fluent.getProtectionDomain());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setSslEnabled(fluent.getSslEnabled());
    buildable.setStorageMode(fluent.getStorageMode());
    buildable.setStoragePool(fluent.getStoragePool());
    buildable.setSystem(fluent.getSystem());
    buildable.setVolumeName(fluent.getVolumeName());
    return buildable;
  }
  

}