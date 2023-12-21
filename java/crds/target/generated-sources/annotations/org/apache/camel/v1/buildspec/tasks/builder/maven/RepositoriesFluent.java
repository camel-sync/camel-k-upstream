package org.apache.camel.v1.buildspec.tasks.builder.maven;

import org.apache.camel.v1.buildspec.tasks.builder.maven.repositories.ReleasesBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.buildspec.tasks.builder.maven.repositories.SnapshotsBuilder;
import org.apache.camel.v1.buildspec.tasks.builder.maven.repositories.ReleasesFluent;
import org.apache.camel.v1.buildspec.tasks.builder.maven.repositories.Releases;
import org.apache.camel.v1.buildspec.tasks.builder.maven.repositories.SnapshotsFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import org.apache.camel.v1.buildspec.tasks.builder.maven.repositories.Snapshots;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class RepositoriesFluent<A extends RepositoriesFluent<A>> extends BaseFluent<A>{
  public RepositoriesFluent() {
  }
  
  public RepositoriesFluent(Repositories instance) {
    this.copyInstance(instance);
  }
  private String id;
  private String name;
  private ReleasesBuilder releases;
  private SnapshotsBuilder snapshots;
  private String url;
  
  protected void copyInstance(Repositories instance) {
    instance = (instance != null ? instance : new Repositories());
    if (instance != null) {
          this.withId(instance.getId());
          this.withName(instance.getName());
          this.withReleases(instance.getReleases());
          this.withSnapshots(instance.getSnapshots());
          this.withUrl(instance.getUrl());
        }
  }
  
  public String getId() {
    return this.id;
  }
  
  public A withId(String id) {
    this.id = id;
    return (A) this;
  }
  
  public boolean hasId() {
    return this.id != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public Releases buildReleases() {
    return this.releases != null ? this.releases.build() : null;
  }
  
  public A withReleases(Releases releases) {
    this._visitables.remove("releases");
    if (releases != null) {
        this.releases = new ReleasesBuilder(releases);
        this._visitables.get("releases").add(this.releases);
    } else {
        this.releases = null;
        this._visitables.get("releases").remove(this.releases);
    }
    return (A) this;
  }
  
  public boolean hasReleases() {
    return this.releases != null;
  }
  
  public ReleasesNested<A> withNewReleases() {
    return new ReleasesNested(null);
  }
  
  public ReleasesNested<A> withNewReleasesLike(Releases item) {
    return new ReleasesNested(item);
  }
  
  public ReleasesNested<A> editReleases() {
    return withNewReleasesLike(java.util.Optional.ofNullable(buildReleases()).orElse(null));
  }
  
  public ReleasesNested<A> editOrNewReleases() {
    return withNewReleasesLike(java.util.Optional.ofNullable(buildReleases()).orElse(new ReleasesBuilder().build()));
  }
  
  public ReleasesNested<A> editOrNewReleasesLike(Releases item) {
    return withNewReleasesLike(java.util.Optional.ofNullable(buildReleases()).orElse(item));
  }
  
  public Snapshots buildSnapshots() {
    return this.snapshots != null ? this.snapshots.build() : null;
  }
  
  public A withSnapshots(Snapshots snapshots) {
    this._visitables.remove("snapshots");
    if (snapshots != null) {
        this.snapshots = new SnapshotsBuilder(snapshots);
        this._visitables.get("snapshots").add(this.snapshots);
    } else {
        this.snapshots = null;
        this._visitables.get("snapshots").remove(this.snapshots);
    }
    return (A) this;
  }
  
  public boolean hasSnapshots() {
    return this.snapshots != null;
  }
  
  public SnapshotsNested<A> withNewSnapshots() {
    return new SnapshotsNested(null);
  }
  
  public SnapshotsNested<A> withNewSnapshotsLike(Snapshots item) {
    return new SnapshotsNested(item);
  }
  
  public SnapshotsNested<A> editSnapshots() {
    return withNewSnapshotsLike(java.util.Optional.ofNullable(buildSnapshots()).orElse(null));
  }
  
  public SnapshotsNested<A> editOrNewSnapshots() {
    return withNewSnapshotsLike(java.util.Optional.ofNullable(buildSnapshots()).orElse(new SnapshotsBuilder().build()));
  }
  
  public SnapshotsNested<A> editOrNewSnapshotsLike(Snapshots item) {
    return withNewSnapshotsLike(java.util.Optional.ofNullable(buildSnapshots()).orElse(item));
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public A withUrl(String url) {
    this.url = url;
    return (A) this;
  }
  
  public boolean hasUrl() {
    return this.url != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    RepositoriesFluent that = (RepositoriesFluent) o;
    if (!java.util.Objects.equals(id, that.id)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(releases, that.releases)) return false;
    if (!java.util.Objects.equals(snapshots, that.snapshots)) return false;
    if (!java.util.Objects.equals(url, that.url)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(id,  name,  releases,  snapshots,  url,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (id != null) { sb.append("id:"); sb.append(id + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (releases != null) { sb.append("releases:"); sb.append(releases + ","); }
    if (snapshots != null) { sb.append("snapshots:"); sb.append(snapshots + ","); }
    if (url != null) { sb.append("url:"); sb.append(url); }
    sb.append("}");
    return sb.toString();
  }
  public class ReleasesNested<N> extends ReleasesFluent<ReleasesNested<N>> implements Nested<N>{
    ReleasesNested(Releases item) {
      this.builder = new ReleasesBuilder(this, item);
    }
    ReleasesBuilder builder;
    
    public N and() {
      return (N) RepositoriesFluent.this.withReleases(builder.build());
    }
    
    public N endReleases() {
      return and();
    }
    
  
  }
  public class SnapshotsNested<N> extends SnapshotsFluent<SnapshotsNested<N>> implements Nested<N>{
    SnapshotsNested(Snapshots item) {
      this.builder = new SnapshotsBuilder(this, item);
    }
    SnapshotsBuilder builder;
    
    public N and() {
      return (N) RepositoriesFluent.this.withSnapshots(builder.build());
    }
    
    public N endSnapshots() {
      return and();
    }
    
  
  }

}