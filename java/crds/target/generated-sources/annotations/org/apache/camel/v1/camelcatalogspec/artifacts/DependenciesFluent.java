package org.apache.camel.v1.camelcatalogspec.artifacts;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.camelcatalogspec.artifacts.dependencies.Exclusions;
import org.apache.camel.v1.camelcatalogspec.artifacts.dependencies.ExclusionsBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import org.apache.camel.v1.camelcatalogspec.artifacts.dependencies.ExclusionsFluent;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class DependenciesFluent<A extends DependenciesFluent<A>> extends BaseFluent<A>{
  public DependenciesFluent() {
  }
  
  public DependenciesFluent(Dependencies instance) {
    this.copyInstance(instance);
  }
  private String artifactId;
  private ArrayList<ExclusionsBuilder> exclusions;
  private String groupId;
  private String version;
  
  protected void copyInstance(Dependencies instance) {
    instance = (instance != null ? instance : new Dependencies());
    if (instance != null) {
          this.withArtifactId(instance.getArtifactId());
          this.withExclusions(instance.getExclusions());
          this.withGroupId(instance.getGroupId());
          this.withVersion(instance.getVersion());
        }
  }
  
  public String getArtifactId() {
    return this.artifactId;
  }
  
  public A withArtifactId(String artifactId) {
    this.artifactId = artifactId;
    return (A) this;
  }
  
  public boolean hasArtifactId() {
    return this.artifactId != null;
  }
  
  public A addToExclusions(int index,Exclusions item) {
    if (this.exclusions == null) {this.exclusions = new ArrayList<ExclusionsBuilder>();}
    ExclusionsBuilder builder = new ExclusionsBuilder(item);
    if (index < 0 || index >= exclusions.size()) { _visitables.get("exclusions").add(builder); exclusions.add(builder); } else { _visitables.get("exclusions").add(index, builder); exclusions.add(index, builder);}
    return (A)this;
  }
  
  public A setToExclusions(int index,Exclusions item) {
    if (this.exclusions == null) {this.exclusions = new ArrayList<ExclusionsBuilder>();}
    ExclusionsBuilder builder = new ExclusionsBuilder(item);
    if (index < 0 || index >= exclusions.size()) { _visitables.get("exclusions").add(builder); exclusions.add(builder); } else { _visitables.get("exclusions").set(index, builder); exclusions.set(index, builder);}
    return (A)this;
  }
  
  public A addToExclusions(org.apache.camel.v1.camelcatalogspec.artifacts.dependencies.Exclusions... items) {
    if (this.exclusions == null) {this.exclusions = new ArrayList<ExclusionsBuilder>();}
    for (Exclusions item : items) {ExclusionsBuilder builder = new ExclusionsBuilder(item);_visitables.get("exclusions").add(builder);this.exclusions.add(builder);} return (A)this;
  }
  
  public A addAllToDependenciesExclusions(Collection<Exclusions> items) {
    if (this.exclusions == null) {this.exclusions = new ArrayList<ExclusionsBuilder>();}
    for (Exclusions item : items) {ExclusionsBuilder builder = new ExclusionsBuilder(item);_visitables.get("exclusions").add(builder);this.exclusions.add(builder);} return (A)this;
  }
  
  public A removeFromExclusions(org.apache.camel.v1.camelcatalogspec.artifacts.dependencies.Exclusions... items) {
    if (this.exclusions == null) return (A)this;
    for (Exclusions item : items) {ExclusionsBuilder builder = new ExclusionsBuilder(item);_visitables.get("exclusions").remove(builder); this.exclusions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromDependenciesExclusions(Collection<Exclusions> items) {
    if (this.exclusions == null) return (A)this;
    for (Exclusions item : items) {ExclusionsBuilder builder = new ExclusionsBuilder(item);_visitables.get("exclusions").remove(builder); this.exclusions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromDependenciesExclusions(Predicate<ExclusionsBuilder> predicate) {
    if (exclusions == null) return (A) this;
    final Iterator<ExclusionsBuilder> each = exclusions.iterator();
    final List visitables = _visitables.get("exclusions");
    while (each.hasNext()) {
      ExclusionsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Exclusions> buildExclusions() {
    return this.exclusions != null ? build(exclusions) : null;
  }
  
  public Exclusions buildExclusion(int index) {
    return this.exclusions.get(index).build();
  }
  
  public Exclusions buildFirstExclusion() {
    return this.exclusions.get(0).build();
  }
  
  public Exclusions buildLastExclusion() {
    return this.exclusions.get(exclusions.size() - 1).build();
  }
  
  public Exclusions buildMatchingExclusion(Predicate<ExclusionsBuilder> predicate) {
      for (ExclusionsBuilder item : exclusions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingExclusion(Predicate<ExclusionsBuilder> predicate) {
      for (ExclusionsBuilder item : exclusions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withExclusions(List<Exclusions> exclusions) {
    if (this.exclusions != null) {
      this._visitables.get("exclusions").clear();
    }
    if (exclusions != null) {
        this.exclusions = new ArrayList();
        for (Exclusions item : exclusions) {
          this.addToExclusions(item);
        }
    } else {
      this.exclusions = null;
    }
    return (A) this;
  }
  
  public A withExclusions(org.apache.camel.v1.camelcatalogspec.artifacts.dependencies.Exclusions... exclusions) {
    if (this.exclusions != null) {
        this.exclusions.clear();
        _visitables.remove("exclusions");
    }
    if (exclusions != null) {
      for (Exclusions item : exclusions) {
        this.addToExclusions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasExclusions() {
    return this.exclusions != null && !this.exclusions.isEmpty();
  }
  
  public ExclusionsNested<A> addNewExclusion() {
    return new ExclusionsNested(-1, null);
  }
  
  public ExclusionsNested<A> addNewExclusionLike(Exclusions item) {
    return new ExclusionsNested(-1, item);
  }
  
  public ExclusionsNested<A> setNewExclusionLike(int index,Exclusions item) {
    return new ExclusionsNested(index, item);
  }
  
  public ExclusionsNested<A> editExclusion(int index) {
    if (exclusions.size() <= index) throw new RuntimeException("Can't edit exclusions. Index exceeds size.");
    return setNewExclusionLike(index, buildExclusion(index));
  }
  
  public ExclusionsNested<A> editFirstExclusion() {
    if (exclusions.size() == 0) throw new RuntimeException("Can't edit first exclusions. The list is empty.");
    return setNewExclusionLike(0, buildExclusion(0));
  }
  
  public ExclusionsNested<A> editLastExclusion() {
    int index = exclusions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last exclusions. The list is empty.");
    return setNewExclusionLike(index, buildExclusion(index));
  }
  
  public ExclusionsNested<A> editMatchingExclusion(Predicate<ExclusionsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<exclusions.size();i++) { 
    if (predicate.test(exclusions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching exclusions. No match found.");
    return setNewExclusionLike(index, buildExclusion(index));
  }
  
  public String getGroupId() {
    return this.groupId;
  }
  
  public A withGroupId(String groupId) {
    this.groupId = groupId;
    return (A) this;
  }
  
  public boolean hasGroupId() {
    return this.groupId != null;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    DependenciesFluent that = (DependenciesFluent) o;
    if (!java.util.Objects.equals(artifactId, that.artifactId)) return false;
    if (!java.util.Objects.equals(exclusions, that.exclusions)) return false;
    if (!java.util.Objects.equals(groupId, that.groupId)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(artifactId,  exclusions,  groupId,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (artifactId != null) { sb.append("artifactId:"); sb.append(artifactId + ","); }
    if (exclusions != null && !exclusions.isEmpty()) { sb.append("exclusions:"); sb.append(exclusions + ","); }
    if (groupId != null) { sb.append("groupId:"); sb.append(groupId + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  public class ExclusionsNested<N> extends ExclusionsFluent<ExclusionsNested<N>> implements Nested<N>{
    ExclusionsNested(int index,Exclusions item) {
      this.index = index;
      this.builder = new ExclusionsBuilder(this, item);
    }
    ExclusionsBuilder builder;
    int index;
    
    public N and() {
      return (N) DependenciesFluent.this.setToExclusions(index,builder.build());
    }
    
    public N endDependenciesExclusion() {
      return and();
    }
    
  
  }

}