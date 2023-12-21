package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CsiBuilder extends CsiFluent<CsiBuilder> implements VisitableBuilder<Csi,CsiBuilder>{
  public CsiBuilder() {
    this(new Csi());
  }
  
  public CsiBuilder(CsiFluent<?> fluent) {
    this(fluent, new Csi());
  }
  
  public CsiBuilder(CsiFluent<?> fluent,Csi instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CsiBuilder(Csi instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CsiFluent<?> fluent;
  
  public Csi build() {
    Csi buildable = new Csi();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setNodePublishSecretRef(fluent.buildNodePublishSecretRef());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeAttributes(fluent.getVolumeAttributes());
    return buildable;
  }
  

}