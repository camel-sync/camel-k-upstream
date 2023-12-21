package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class FlexVolumeBuilder extends FlexVolumeFluent<FlexVolumeBuilder> implements VisitableBuilder<FlexVolume,FlexVolumeBuilder>{
  public FlexVolumeBuilder() {
    this(new FlexVolume());
  }
  
  public FlexVolumeBuilder(FlexVolumeFluent<?> fluent) {
    this(fluent, new FlexVolume());
  }
  
  public FlexVolumeBuilder(FlexVolumeFluent<?> fluent,FlexVolume instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public FlexVolumeBuilder(FlexVolume instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  FlexVolumeFluent<?> fluent;
  
  public FlexVolume build() {
    FlexVolume buildable = new FlexVolume();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setOptions(fluent.getOptions());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    return buildable;
  }
  

}