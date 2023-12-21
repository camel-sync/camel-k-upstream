package org.apache.camel.v1.camelcatalogspec;

import org.apache.camel.v1.camelcatalogspec.runtime.DependenciesBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import org.apache.camel.v1.camelcatalogspec.runtime.DependenciesFluent;
import org.apache.camel.v1.camelcatalogspec.runtime.Capabilities;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import org.apache.camel.v1.camelcatalogspec.runtime.Dependencies;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class RuntimeFluent<A extends RuntimeFluent<A>> extends BaseFluent<A>{
  public RuntimeFluent() {
  }
  
  public RuntimeFluent(Runtime instance) {
    this.copyInstance(instance);
  }
  private String applicationClass;
  private Map<String,Capabilities> capabilities;
  private ArrayList<DependenciesBuilder> dependencies;
  private Map<String,String> metadata;
  private String provider;
  private String version;
  
  protected void copyInstance(Runtime instance) {
    instance = (instance != null ? instance : new Runtime());
    if (instance != null) {
          this.withApplicationClass(instance.getApplicationClass());
          this.withCapabilities(instance.getCapabilities());
          this.withDependencies(instance.getDependencies());
          this.withMetadata(instance.getMetadata());
          this.withProvider(instance.getProvider());
          this.withVersion(instance.getVersion());
        }
  }
  
  public String getApplicationClass() {
    return this.applicationClass;
  }
  
  public A withApplicationClass(String applicationClass) {
    this.applicationClass = applicationClass;
    return (A) this;
  }
  
  public boolean hasApplicationClass() {
    return this.applicationClass != null;
  }
  
  public A addToCapabilities(String key,Capabilities value) {
    if(this.capabilities == null && key != null && value != null) { this.capabilities = new LinkedHashMap(); }
    if(key != null && value != null) {this.capabilities.put(key, value);} return (A)this;
  }
  
  public A addToCapabilities(Map<String,Capabilities> map) {
    if(this.capabilities == null && map != null) { this.capabilities = new LinkedHashMap(); }
    if(map != null) { this.capabilities.putAll(map);} return (A)this;
  }
  
  public A removeFromCapabilities(String key) {
    if(this.capabilities == null) { return (A) this; }
    if(key != null && this.capabilities != null) {this.capabilities.remove(key);} return (A)this;
  }
  
  public A removeFromCapabilities(Map<String,Capabilities> map) {
    if(this.capabilities == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.capabilities != null){this.capabilities.remove(key);}}} return (A)this;
  }
  
  public Map<String,Capabilities> getCapabilities() {
    return this.capabilities;
  }
  
  public <K,V>A withCapabilities(Map<String,Capabilities> capabilities) {
    if (capabilities == null) {
      this.capabilities = null;
    } else {
      this.capabilities = new LinkedHashMap(capabilities);
    }
    return (A) this;
  }
  
  public boolean hasCapabilities() {
    return this.capabilities != null;
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
  
  public A addToDependencies(org.apache.camel.v1.camelcatalogspec.runtime.Dependencies... items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").add(builder);this.dependencies.add(builder);} return (A)this;
  }
  
  public A addAllToCamelcatalogspecDependencies(Collection<Dependencies> items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").add(builder);this.dependencies.add(builder);} return (A)this;
  }
  
  public A removeFromDependencies(org.apache.camel.v1.camelcatalogspec.runtime.Dependencies... items) {
    if (this.dependencies == null) return (A)this;
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").remove(builder); this.dependencies.remove(builder);} return (A)this;
  }
  
  public A removeAllFromCamelcatalogspecDependencies(Collection<Dependencies> items) {
    if (this.dependencies == null) return (A)this;
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").remove(builder); this.dependencies.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromCamelcatalogspecDependencies(Predicate<DependenciesBuilder> predicate) {
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
  
  public A withDependencies(org.apache.camel.v1.camelcatalogspec.runtime.Dependencies... dependencies) {
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
  
  public String getProvider() {
    return this.provider;
  }
  
  public A withProvider(String provider) {
    this.provider = provider;
    return (A) this;
  }
  
  public boolean hasProvider() {
    return this.provider != null;
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
    RuntimeFluent that = (RuntimeFluent) o;
    if (!java.util.Objects.equals(applicationClass, that.applicationClass)) return false;
    if (!java.util.Objects.equals(capabilities, that.capabilities)) return false;
    if (!java.util.Objects.equals(dependencies, that.dependencies)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(provider, that.provider)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(applicationClass,  capabilities,  dependencies,  metadata,  provider,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (applicationClass != null) { sb.append("applicationClass:"); sb.append(applicationClass + ","); }
    if (capabilities != null && !capabilities.isEmpty()) { sb.append("capabilities:"); sb.append(capabilities + ","); }
    if (dependencies != null && !dependencies.isEmpty()) { sb.append("dependencies:"); sb.append(dependencies + ","); }
    if (metadata != null && !metadata.isEmpty()) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (provider != null) { sb.append("provider:"); sb.append(provider + ","); }
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
      return (N) RuntimeFluent.this.setToDependencies(index,builder.build());
    }
    
    public N endCamelcatalogspecDependency() {
      return and();
    }
    
  
  }

}