package org.apache.camel.v1.pipespec.integration.template.spec.volumes.projected;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SourcesBuilder extends SourcesFluent<SourcesBuilder> implements VisitableBuilder<Sources,SourcesBuilder>{
  public SourcesBuilder() {
    this(new Sources());
  }
  
  public SourcesBuilder(SourcesFluent<?> fluent) {
    this(fluent, new Sources());
  }
  
  public SourcesBuilder(SourcesFluent<?> fluent,Sources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SourcesBuilder(Sources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SourcesFluent<?> fluent;
  
  public Sources build() {
    Sources buildable = new Sources();
    buildable.setConfigMap(fluent.buildConfigMap());
    buildable.setDownwardAPI(fluent.buildDownwardAPI());
    buildable.setSecret(fluent.buildSecret());
    buildable.setServiceAccountToken(fluent.buildServiceAccountToken());
    return buildable;
  }
  

}