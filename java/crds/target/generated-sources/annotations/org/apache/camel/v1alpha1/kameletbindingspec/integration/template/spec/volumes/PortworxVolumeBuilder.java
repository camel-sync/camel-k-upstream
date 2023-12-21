package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PortworxVolumeBuilder extends PortworxVolumeFluent<PortworxVolumeBuilder> implements VisitableBuilder<PortworxVolume,PortworxVolumeBuilder>{
  public PortworxVolumeBuilder() {
    this(new PortworxVolume());
  }
  
  public PortworxVolumeBuilder(PortworxVolumeFluent<?> fluent) {
    this(fluent, new PortworxVolume());
  }
  
  public PortworxVolumeBuilder(PortworxVolumeFluent<?> fluent,PortworxVolume instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PortworxVolumeBuilder(PortworxVolume instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PortworxVolumeFluent<?> fluent;
  
  public PortworxVolume build() {
    PortworxVolume buildable = new PortworxVolume();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  

}