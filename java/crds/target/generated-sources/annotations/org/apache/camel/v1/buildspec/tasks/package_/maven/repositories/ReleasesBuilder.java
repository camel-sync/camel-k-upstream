package org.apache.camel.v1.buildspec.tasks.package_.maven.repositories;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ReleasesBuilder extends ReleasesFluent<ReleasesBuilder> implements VisitableBuilder<Releases,ReleasesBuilder>{
  public ReleasesBuilder() {
    this(new Releases());
  }
  
  public ReleasesBuilder(ReleasesFluent<?> fluent) {
    this(fluent, new Releases());
  }
  
  public ReleasesBuilder(ReleasesFluent<?> fluent,Releases instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ReleasesBuilder(Releases instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ReleasesFluent<?> fluent;
  
  public Releases build() {
    Releases buildable = new Releases();
    buildable.setChecksumPolicy(fluent.getChecksumPolicy());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setUpdatePolicy(fluent.getUpdatePolicy());
    return buildable;
  }
  

}