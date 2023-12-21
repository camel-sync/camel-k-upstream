package org.apache.camel.v1.integrationspec.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PhotonPersistentDiskBuilder extends PhotonPersistentDiskFluent<PhotonPersistentDiskBuilder> implements VisitableBuilder<PhotonPersistentDisk,PhotonPersistentDiskBuilder>{
  public PhotonPersistentDiskBuilder() {
    this(new PhotonPersistentDisk());
  }
  
  public PhotonPersistentDiskBuilder(PhotonPersistentDiskFluent<?> fluent) {
    this(fluent, new PhotonPersistentDisk());
  }
  
  public PhotonPersistentDiskBuilder(PhotonPersistentDiskFluent<?> fluent,PhotonPersistentDisk instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PhotonPersistentDiskBuilder(PhotonPersistentDisk instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PhotonPersistentDiskFluent<?> fluent;
  
  public PhotonPersistentDisk build() {
    PhotonPersistentDisk buildable = new PhotonPersistentDisk();
    buildable.setFsType(fluent.getFsType());
    buildable.setPdID(fluent.getPdID());
    return buildable;
  }
  

}