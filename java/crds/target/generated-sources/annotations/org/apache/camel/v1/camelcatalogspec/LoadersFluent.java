package org.apache.camel.v1.camelcatalogspec;

import org.apache.camel.v1.camelcatalogspec.loaders.DependenciesBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import org.apache.camel.v1.camelcatalogspec.loaders.DependenciesFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import org.apache.camel.v1.camelcatalogspec.loaders.Dependencies;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class LoadersFluent<A extends LoadersFluent<A>> extends BaseFluent<A>{
  public LoadersFluent() {
  }
  
  public LoadersFluent(Loaders instance) {
    this.copyInstance(instance);
  }
  private String artifactId;
  private ArrayList<DependenciesBuilder> dependencies;
  private String groupId;
  private List<String> languages;
  private Map<String,String> metadata;
  private String version;
  
  protected void copyInstance(Loaders instance) {
    instance = (instance != null ? instance : new Loaders());
    if (instance != null) {
          this.withArtifactId(instance.getArtifactId());
          this.withDependencies(instance.getDependencies());
          this.withGroupId(instance.getGroupId());
          this.withLanguages(instance.getLanguages());
          this.withMetadata(instance.getMetadata());
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
  
  public A addToDependencies(int index,Dependencies item) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    DependenciesBuilder builder = new DependenciesBuilder(item);
    if (index < 0 || index >= dependencies.size()) { _visitables.get("dependencies").add(builder); dependencies.add(builder); } else { _visitables.get("dependencies").add(index, builder); dependencies.add(index, builder);}
    return (A)this;
  }
  
  public A setToDependencies(int index,Dependencies item) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    DependenciesBuilder builder = new DependenciesBuilder(item);
    if (index < 0 || index >= dependencies.size()) { _visitables.get("dependencies").add(builder); dependencies.add(builder); } else { _visitables.get("dependencies").set(index, builder); dependencies.set(index, builder);}
    return (A)this;
  }
  
  public A addToDependencies(org.apache.camel.v1.camelcatalogspec.loaders.Dependencies... items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").add(builder);this.dependencies.add(builder);} return (A)this;
  }
  
  public A addAllToLoadersDependencies(Collection<Dependencies> items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").add(builder);this.dependencies.add(builder);} return (A)this;
  }
  
  public A removeFromDependencies(org.apache.camel.v1.camelcatalogspec.loaders.Dependencies... items) {
    if (this.dependencies == null) return (A)this;
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").remove(builder); this.dependencies.remove(builder);} return (A)this;
  }
  
  public A removeAllFromLoadersDependencies(Collection<Dependencies> items) {
    if (this.dependencies == null) return (A)this;
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").remove(builder); this.dependencies.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromLoadersDependencies(Predicate<DependenciesBuilder> predicate) {
    if (dependencies == null) return (A) this;
    final Iterator<DependenciesBuilder> each = dependencies.iterator();
    final List visitables = _visitables.get("dependencies");
    while (each.hasNext()) {
      DependenciesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Dependencies> buildDependencies() {
    return this.dependencies != null ? build(dependencies) : null;
  }
  
  public Dependencies buildDependency(int index) {
    return this.dependencies.get(index).build();
  }
  
  public Dependencies buildFirstDependency() {
    return this.dependencies.get(0).build();
  }
  
  public Dependencies buildLastDependency() {
    return this.dependencies.get(dependencies.size() - 1).build();
  }
  
  public Dependencies buildMatchingDependency(Predicate<DependenciesBuilder> predicate) {
      for (DependenciesBuilder item : dependencies) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingDependency(Predicate<DependenciesBuilder> predicate) {
      for (DependenciesBuilder item : dependencies) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDependencies(List<Dependencies> dependencies) {
    if (this.dependencies != null) {
      this._visitables.get("dependencies").clear();
    }
    if (dependencies != null) {
        this.dependencies = new ArrayList();
        for (Dependencies item : dependencies) {
          this.addToDependencies(item);
        }
    } else {
      this.dependencies = null;
    }
    return (A) this;
  }
  
  public A withDependencies(org.apache.camel.v1.camelcatalogspec.loaders.Dependencies... dependencies) {
    if (this.dependencies != null) {
        this.dependencies.clear();
        _visitables.remove("dependencies");
    }
    if (dependencies != null) {
      for (Dependencies item : dependencies) {
        this.addToDependencies(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDependencies() {
    return this.dependencies != null && !this.dependencies.isEmpty();
  }
  
  public DependenciesNested<A> addNewDependency() {
    return new DependenciesNested(-1, null);
  }
  
  public DependenciesNested<A> addNewDependencyLike(Dependencies item) {
    return new DependenciesNested(-1, item);
  }
  
  public DependenciesNested<A> setNewDependencyLike(int index,Dependencies item) {
    return new DependenciesNested(index, item);
  }
  
  public DependenciesNested<A> editDependency(int index) {
    if (dependencies.size() <= index) throw new RuntimeException("Can't edit dependencies. Index exceeds size.");
    return setNewDependencyLike(index, buildDependency(index));
  }
  
  public DependenciesNested<A> editFirstDependency() {
    if (dependencies.size() == 0) throw new RuntimeException("Can't edit first dependencies. The list is empty.");
    return setNewDependencyLike(0, buildDependency(0));
  }
  
  public DependenciesNested<A> editLastDependency() {
    int index = dependencies.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last dependencies. The list is empty.");
    return setNewDependencyLike(index, buildDependency(index));
  }
  
  public DependenciesNested<A> editMatchingDependency(Predicate<DependenciesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<dependencies.size();i++) { 
    if (predicate.test(dependencies.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching dependencies. No match found.");
    return setNewDependencyLike(index, buildDependency(index));
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
  
  public A addToLanguages(int index,String item) {
    if (this.languages == null) {this.languages = new ArrayList<String>();}
    this.languages.add(index, item);
    return (A)this;
  }
  
  public A setToLanguages(int index,String item) {
    if (this.languages == null) {this.languages = new ArrayList<String>();}
    this.languages.set(index, item); return (A)this;
  }
  
  public A addToLanguages(java.lang.String... items) {
    if (this.languages == null) {this.languages = new ArrayList<String>();}
    for (String item : items) {this.languages.add(item);} return (A)this;
  }
  
  public A addAllToLanguages(Collection<String> items) {
    if (this.languages == null) {this.languages = new ArrayList<String>();}
    for (String item : items) {this.languages.add(item);} return (A)this;
  }
  
  public A removeFromLanguages(java.lang.String... items) {
    if (this.languages == null) return (A)this;
    for (String item : items) { this.languages.remove(item);} return (A)this;
  }
  
  public A removeAllFromLanguages(Collection<String> items) {
    if (this.languages == null) return (A)this;
    for (String item : items) { this.languages.remove(item);} return (A)this;
  }
  
  public List<String> getLanguages() {
    return this.languages;
  }
  
  public String getLanguage(int index) {
    return this.languages.get(index);
  }
  
  public String getFirstLanguage() {
    return this.languages.get(0);
  }
  
  public String getLastLanguage() {
    return this.languages.get(languages.size() - 1);
  }
  
  public String getMatchingLanguage(Predicate<String> predicate) {
      for (String item : languages) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingLanguage(Predicate<String> predicate) {
      for (String item : languages) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withLanguages(List<String> languages) {
    if (languages != null) {
        this.languages = new ArrayList();
        for (String item : languages) {
          this.addToLanguages(item);
        }
    } else {
      this.languages = null;
    }
    return (A) this;
  }
  
  public A withLanguages(java.lang.String... languages) {
    if (this.languages != null) {
        this.languages.clear();
        _visitables.remove("languages");
    }
    if (languages != null) {
      for (String item : languages) {
        this.addToLanguages(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasLanguages() {
    return this.languages != null && !this.languages.isEmpty();
  }
  
  public A addToMetadata(String key,String value) {
    if(this.metadata == null && key != null && value != null) { this.metadata = new LinkedHashMap(); }
    if(key != null && value != null) {this.metadata.put(key, value);} return (A)this;
  }
  
  public A addToMetadata(Map<String,String> map) {
    if(this.metadata == null && map != null) { this.metadata = new LinkedHashMap(); }
    if(map != null) { this.metadata.putAll(map);} return (A)this;
  }
  
  public A removeFromMetadata(String key) {
    if(this.metadata == null) { return (A) this; }
    if(key != null && this.metadata != null) {this.metadata.remove(key);} return (A)this;
  }
  
  public A removeFromMetadata(Map<String,String> map) {
    if(this.metadata == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.metadata != null){this.metadata.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getMetadata() {
    return this.metadata;
  }
  
  public <K,V>A withMetadata(Map<String,String> metadata) {
    if (metadata == null) {
      this.metadata = null;
    } else {
      this.metadata = new LinkedHashMap(metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
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
    LoadersFluent that = (LoadersFluent) o;
    if (!java.util.Objects.equals(artifactId, that.artifactId)) return false;
    if (!java.util.Objects.equals(dependencies, that.dependencies)) return false;
    if (!java.util.Objects.equals(groupId, that.groupId)) return false;
    if (!java.util.Objects.equals(languages, that.languages)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(artifactId,  dependencies,  groupId,  languages,  metadata,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (artifactId != null) { sb.append("artifactId:"); sb.append(artifactId + ","); }
    if (dependencies != null && !dependencies.isEmpty()) { sb.append("dependencies:"); sb.append(dependencies + ","); }
    if (groupId != null) { sb.append("groupId:"); sb.append(groupId + ","); }
    if (languages != null && !languages.isEmpty()) { sb.append("languages:"); sb.append(languages + ","); }
    if (metadata != null && !metadata.isEmpty()) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  public class DependenciesNested<N> extends DependenciesFluent<DependenciesNested<N>> implements Nested<N>{
    DependenciesNested(int index,Dependencies item) {
      this.index = index;
      this.builder = new DependenciesBuilder(this, item);
    }
    DependenciesBuilder builder;
    int index;
    
    public N and() {
      return (N) LoadersFluent.this.setToDependencies(index,builder.build());
    }
    
    public N endLoadersDependency() {
      return and();
    }
    
  
  }

}