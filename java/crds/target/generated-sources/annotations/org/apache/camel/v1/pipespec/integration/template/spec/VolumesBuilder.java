package org.apache.camel.v1.pipespec.integration.template.spec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class VolumesBuilder extends VolumesFluent<VolumesBuilder> implements VisitableBuilder<Volumes,VolumesBuilder>{
  public VolumesBuilder() {
    this(new Volumes());
  }
  
  public VolumesBuilder(VolumesFluent<?> fluent) {
    this(fluent, new Volumes());
  }
  
  public VolumesBuilder(VolumesFluent<?> fluent,Volumes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public VolumesBuilder(Volumes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  VolumesFluent<?> fluent;
  
  public Volumes build() {
    Volumes buildable = new Volumes();
    buildable.setAwsElasticBlockStore(fluent.buildAwsElasticBlockStore());
    buildable.setAzureDisk(fluent.buildAzureDisk());
    buildable.setAzureFile(fluent.buildAzureFile());
    buildable.setCephfs(fluent.buildCephfs());
    buildable.setCinder(fluent.buildCinder());
    buildable.setConfigMap(fluent.buildConfigMap());
    buildable.setCsi(fluent.buildCsi());
    buildable.setDownwardAPI(fluent.buildDownwardAPI());
    buildable.setEmptyDir(fluent.buildEmptyDir());
    buildable.setEphemeral(fluent.buildEphemeral());
    buildable.setFc(fluent.buildFc());
    buildable.setFlexVolume(fluent.buildFlexVolume());
    buildable.setFlocker(fluent.buildFlocker());
    buildable.setGcePersistentDisk(fluent.buildGcePersistentDisk());
    buildable.setGitRepo(fluent.buildGitRepo());
    buildable.setGlusterfs(fluent.buildGlusterfs());
    buildable.setHostPath(fluent.buildHostPath());
    buildable.setIscsi(fluent.buildIscsi());
    buildable.setName(fluent.getName());
    buildable.setNfs(fluent.buildNfs());
    buildable.setPersistentVolumeClaim(fluent.buildPersistentVolumeClaim());
    buildable.setPhotonPersistentDisk(fluent.buildPhotonPersistentDisk());
    buildable.setPortworxVolume(fluent.buildPortworxVolume());
    buildable.setProjected(fluent.buildProjected());
    buildable.setQuobyte(fluent.buildQuobyte());
    buildable.setRbd(fluent.buildRbd());
    buildable.setScaleIO(fluent.buildScaleIO());
    buildable.setSecret(fluent.buildSecret());
    buildable.setStorageos(fluent.buildStorageos());
    buildable.setVsphereVolume(fluent.buildVsphereVolume());
    return buildable;
  }
  

}