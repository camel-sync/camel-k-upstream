package org.apache.camel.v1.integrationspec.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class StorageosBuilder extends StorageosFluent<StorageosBuilder> implements VisitableBuilder<Storageos,StorageosBuilder>{
  public StorageosBuilder() {
    this(new Storageos());
  }
  
  public StorageosBuilder(StorageosFluent<?> fluent) {
    this(fluent, new Storageos());
  }
  
  public StorageosBuilder(StorageosFluent<?> fluent,Storageos instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public StorageosBuilder(Storageos instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  StorageosFluent<?> fluent;
  
  public Storageos build() {
    Storageos buildable = new Storageos();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setVolumeName(fluent.getVolumeName());
    buildable.setVolumeNamespace(fluent.getVolumeNamespace());
    return buildable;
  }
  

}