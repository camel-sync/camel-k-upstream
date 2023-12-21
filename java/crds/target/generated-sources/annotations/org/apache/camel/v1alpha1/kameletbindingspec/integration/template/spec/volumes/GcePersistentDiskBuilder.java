package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class GcePersistentDiskBuilder extends GcePersistentDiskFluent<GcePersistentDiskBuilder> implements VisitableBuilder<GcePersistentDisk,GcePersistentDiskBuilder>{
  public GcePersistentDiskBuilder() {
    this(new GcePersistentDisk());
  }
  
  public GcePersistentDiskBuilder(GcePersistentDiskFluent<?> fluent) {
    this(fluent, new GcePersistentDisk());
  }
  
  public GcePersistentDiskBuilder(GcePersistentDiskFluent<?> fluent,GcePersistentDisk instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public GcePersistentDiskBuilder(GcePersistentDisk instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  GcePersistentDiskFluent<?> fluent;
  
  public GcePersistentDisk build() {
    GcePersistentDisk buildable = new GcePersistentDisk();
    buildable.setFsType(fluent.getFsType());
    buildable.setPartition(fluent.getPartition());
    buildable.setPdName(fluent.getPdName());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  

}