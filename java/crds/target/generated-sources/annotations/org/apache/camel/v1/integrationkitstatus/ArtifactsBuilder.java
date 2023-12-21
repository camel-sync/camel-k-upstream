package org.apache.camel.v1.integrationkitstatus;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ArtifactsBuilder extends ArtifactsFluent<ArtifactsBuilder> implements VisitableBuilder<Artifacts,ArtifactsBuilder>{
  public ArtifactsBuilder() {
    this(new Artifacts());
  }
  
  public ArtifactsBuilder(ArtifactsFluent<?> fluent) {
    this(fluent, new Artifacts());
  }
  
  public ArtifactsBuilder(ArtifactsFluent<?> fluent,Artifacts instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ArtifactsBuilder(Artifacts instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ArtifactsFluent<?> fluent;
  
  public Artifacts build() {
    Artifacts buildable = new Artifacts();
    buildable.setChecksum(fluent.getChecksum());
    buildable.setId(fluent.getId());
    buildable.setLocation(fluent.getLocation());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  

}