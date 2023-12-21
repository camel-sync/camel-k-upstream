package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PersistentVolumeClaimBuilder extends PersistentVolumeClaimFluent<PersistentVolumeClaimBuilder> implements VisitableBuilder<PersistentVolumeClaim,PersistentVolumeClaimBuilder>{
  public PersistentVolumeClaimBuilder() {
    this(new PersistentVolumeClaim());
  }
  
  public PersistentVolumeClaimBuilder(PersistentVolumeClaimFluent<?> fluent) {
    this(fluent, new PersistentVolumeClaim());
  }
  
  public PersistentVolumeClaimBuilder(PersistentVolumeClaimFluent<?> fluent,PersistentVolumeClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PersistentVolumeClaimBuilder(PersistentVolumeClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PersistentVolumeClaimFluent<?> fluent;
  
  public PersistentVolumeClaim build() {
    PersistentVolumeClaim buildable = new PersistentVolumeClaim();
    buildable.setClaimName(fluent.getClaimName());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  

}