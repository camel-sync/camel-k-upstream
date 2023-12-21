package org.apache.camel.v1.buildspec.tasks.builder.maven.repositories;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SnapshotsBuilder extends SnapshotsFluent<SnapshotsBuilder> implements VisitableBuilder<Snapshots,SnapshotsBuilder>{
  public SnapshotsBuilder() {
    this(new Snapshots());
  }
  
  public SnapshotsBuilder(SnapshotsFluent<?> fluent) {
    this(fluent, new Snapshots());
  }
  
  public SnapshotsBuilder(SnapshotsFluent<?> fluent,Snapshots instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SnapshotsBuilder(Snapshots instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SnapshotsFluent<?> fluent;
  
  public Snapshots build() {
    Snapshots buildable = new Snapshots();
    buildable.setChecksumPolicy(fluent.getChecksumPolicy());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setUpdatePolicy(fluent.getUpdatePolicy());
    return buildable;
  }
  

}