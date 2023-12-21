package org.apache.camel.v1.camelcatalogspec;

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
    buildable.setArtifactId(fluent.getArtifactId());
    buildable.setDataformats(fluent.getDataformats());
    buildable.setDependencies(fluent.buildDependencies());
    buildable.setExclusions(fluent.buildExclusions());
    buildable.setGroupId(fluent.getGroupId());
    buildable.setJavaTypes(fluent.getJavaTypes());
    buildable.setLanguages(fluent.getLanguages());
    buildable.setSchemes(fluent.buildSchemes());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}