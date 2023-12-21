package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class MountBuilder extends MountFluent<MountBuilder> implements VisitableBuilder<Mount,MountBuilder>{
  public MountBuilder() {
    this(new Mount());
  }
  
  public MountBuilder(MountFluent<?> fluent) {
    this(fluent, new Mount());
  }
  
  public MountBuilder(MountFluent<?> fluent,Mount instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public MountBuilder(Mount instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  MountFluent<?> fluent;
  
  public Mount build() {
    Mount buildable = new Mount();
    buildable.setConfigs(fluent.getConfigs());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setHotReload(fluent.getHotReload());
    buildable.setResources(fluent.getResources());
    buildable.setVolumes(fluent.getVolumes());
    return buildable;
  }
  

}