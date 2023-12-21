package org.apache.camel.v1.integrationspec.template.spec.volumes.ephemeral.volumeclaimtemplate;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SpecBuilder extends SpecFluent<SpecBuilder> implements VisitableBuilder<Spec,SpecBuilder>{
  public SpecBuilder() {
    this(new Spec());
  }
  
  public SpecBuilder(SpecFluent<?> fluent) {
    this(fluent, new Spec());
  }
  
  public SpecBuilder(SpecFluent<?> fluent,Spec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SpecBuilder(Spec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SpecFluent<?> fluent;
  
  public Spec build() {
    Spec buildable = new Spec();
    buildable.setAccessModes(fluent.getAccessModes());
    buildable.setDataSource(fluent.buildDataSource());
    buildable.setDataSourceRef(fluent.buildDataSourceRef());
    buildable.setResources(fluent.buildResources());
    buildable.setSelector(fluent.buildSelector());
    buildable.setStorageClassName(fluent.getStorageClassName());
    buildable.setVolumeMode(fluent.getVolumeMode());
    buildable.setVolumeName(fluent.getVolumeName());
    return buildable;
  }
  

}