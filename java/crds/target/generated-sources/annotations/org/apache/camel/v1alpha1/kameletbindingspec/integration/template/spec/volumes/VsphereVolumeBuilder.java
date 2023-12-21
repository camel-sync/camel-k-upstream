package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class VsphereVolumeBuilder extends VsphereVolumeFluent<VsphereVolumeBuilder> implements VisitableBuilder<VsphereVolume,VsphereVolumeBuilder>{
  public VsphereVolumeBuilder() {
    this(new VsphereVolume());
  }
  
  public VsphereVolumeBuilder(VsphereVolumeFluent<?> fluent) {
    this(fluent, new VsphereVolume());
  }
  
  public VsphereVolumeBuilder(VsphereVolumeFluent<?> fluent,VsphereVolume instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public VsphereVolumeBuilder(VsphereVolume instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  VsphereVolumeFluent<?> fluent;
  
  public VsphereVolume build() {
    VsphereVolume buildable = new VsphereVolume();
    buildable.setFsType(fluent.getFsType());
    buildable.setStoragePolicyID(fluent.getStoragePolicyID());
    buildable.setStoragePolicyName(fluent.getStoragePolicyName());
    buildable.setVolumePath(fluent.getVolumePath());
    return buildable;
  }
  

}