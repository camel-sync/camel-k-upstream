package org.apache.camel.v1.pipespec.integration.template.spec.containers;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class VolumeDevicesBuilder extends VolumeDevicesFluent<VolumeDevicesBuilder> implements VisitableBuilder<VolumeDevices,VolumeDevicesBuilder>{
  public VolumeDevicesBuilder() {
    this(new VolumeDevices());
  }
  
  public VolumeDevicesBuilder(VolumeDevicesFluent<?> fluent) {
    this(fluent, new VolumeDevices());
  }
  
  public VolumeDevicesBuilder(VolumeDevicesFluent<?> fluent,VolumeDevices instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public VolumeDevicesBuilder(VolumeDevices instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  VolumeDevicesFluent<?> fluent;
  
  public VolumeDevices build() {
    VolumeDevices buildable = new VolumeDevices();
    buildable.setDevicePath(fluent.getDevicePath());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}