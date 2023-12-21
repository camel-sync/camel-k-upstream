package org.apache.camel.v1;

import org.apache.camel.v1.camelcatalogspec.RuntimeFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1.camelcatalogspec.Loaders;
import java.lang.String;
import java.util.LinkedHashMap;
import org.apache.camel.v1.camelcatalogspec.Artifacts;
import org.apache.camel.v1.camelcatalogspec.Runtime;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import org.apache.camel.v1.camelcatalogspec.RuntimeBuilder;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CamelCatalogSpecFluent<A extends CamelCatalogSpecFluent<A>> extends BaseFluent<A>{
  public CamelCatalogSpecFluent() {
  }
  
  public CamelCatalogSpecFluent(CamelCatalogSpec instance) {
    this.copyInstance(instance);
  }
  private Map<String,Artifacts> artifacts;
  private Map<String,Loaders> loaders;
  private RuntimeBuilder runtime;
  
  protected void copyInstance(CamelCatalogSpec instance) {
    instance = (instance != null ? instance : new CamelCatalogSpec());
    if (instance != null) {
          this.withArtifacts(instance.getArtifacts());
          this.withLoaders(instance.getLoaders());
          this.withRuntime(instance.getRuntime());
        }
  }
  
  public A addToArtifacts(String key,Artifacts value) {
    if(this.artifacts == null && key != null && value != null) { this.artifacts = new LinkedHashMap(); }
    if(key != null && value != null) {this.artifacts.put(key, value);} return (A)this;
  }
  
  public A addToArtifacts(Map<String,Artifacts> map) {
    if(this.artifacts == null && map != null) { this.artifacts = new LinkedHashMap(); }
    if(map != null) { this.artifacts.putAll(map);} return (A)this;
  }
  
  public A removeFromArtifacts(String key) {
    if(this.artifacts == null) { return (A) this; }
    if(key != null && this.artifacts != null) {this.artifacts.remove(key);} return (A)this;
  }
  
  public A removeFromArtifacts(Map<String,Artifacts> map) {
    if(this.artifacts == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.artifacts != null){this.artifacts.remove(key);}}} return (A)this;
  }
  
  public Map<String,Artifacts> getArtifacts() {
    return this.artifacts;
  }
  
  public <K,V>A withArtifacts(Map<String,Artifacts> artifacts) {
    if (artifacts == null) {
      this.artifacts = null;
    } else {
      this.artifacts = new LinkedHashMap(artifacts);
    }
    return (A) this;
  }
  
  public boolean hasArtifacts() {
    return this.artifacts != null;
  }
  
  public A addToLoaders(String key,Loaders value) {
    if(this.loaders == null && key != null && value != null) { this.loaders = new LinkedHashMap(); }
    if(key != null && value != null) {this.loaders.put(key, value);} return (A)this;
  }
  
  public A addToLoaders(Map<String,Loaders> map) {
    if(this.loaders == null && map != null) { this.loaders = new LinkedHashMap(); }
    if(map != null) { this.loaders.putAll(map);} return (A)this;
  }
  
  public A removeFromLoaders(String key) {
    if(this.loaders == null) { return (A) this; }
    if(key != null && this.loaders != null) {this.loaders.remove(key);} return (A)this;
  }
  
  public A removeFromLoaders(Map<String,Loaders> map) {
    if(this.loaders == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.loaders != null){this.loaders.remove(key);}}} return (A)this;
  }
  
  public Map<String,Loaders> getLoaders() {
    return this.loaders;
  }
  
  public <K,V>A withLoaders(Map<String,Loaders> loaders) {
    if (loaders == null) {
      this.loaders = null;
    } else {
      this.loaders = new LinkedHashMap(loaders);
    }
    return (A) this;
  }
  
  public boolean hasLoaders() {
    return this.loaders != null;
  }
  
  public Runtime buildRuntime() {
    return this.runtime != null ? this.runtime.build() : null;
  }
  
  public A withRuntime(Runtime runtime) {
    this._visitables.remove("runtime");
    if (runtime != null) {
        this.runtime = new RuntimeBuilder(runtime);
        this._visitables.get("runtime").add(this.runtime);
    } else {
        this.runtime = null;
        this._visitables.get("runtime").remove(this.runtime);
    }
    return (A) this;
  }
  
  public boolean hasRuntime() {
    return this.runtime != null;
  }
  
  public RuntimeNested<A> withNewRuntime() {
    return new RuntimeNested(null);
  }
  
  public RuntimeNested<A> withNewRuntimeLike(Runtime item) {
    return new RuntimeNested(item);
  }
  
  public RuntimeNested<A> editCamelcatalogspecRuntime() {
    return withNewRuntimeLike(java.util.Optional.ofNullable(buildRuntime()).orElse(null));
  }
  
  public RuntimeNested<A> editOrNewRuntime() {
    return withNewRuntimeLike(java.util.Optional.ofNullable(buildRuntime()).orElse(new RuntimeBuilder().build()));
  }
  
  public RuntimeNested<A> editOrNewRuntimeLike(Runtime item) {
    return withNewRuntimeLike(java.util.Optional.ofNullable(buildRuntime()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CamelCatalogSpecFluent that = (CamelCatalogSpecFluent) o;
    if (!java.util.Objects.equals(artifacts, that.artifacts)) return false;
    if (!java.util.Objects.equals(loaders, that.loaders)) return false;
    if (!java.util.Objects.equals(runtime, that.runtime)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(artifacts,  loaders,  runtime,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (artifacts != null && !artifacts.isEmpty()) { sb.append("artifacts:"); sb.append(artifacts + ","); }
    if (loaders != null && !loaders.isEmpty()) { sb.append("loaders:"); sb.append(loaders + ","); }
    if (runtime != null) { sb.append("runtime:"); sb.append(runtime); }
    sb.append("}");
    return sb.toString();
  }
  public class RuntimeNested<N> extends RuntimeFluent<RuntimeNested<N>> implements Nested<N>{
    RuntimeNested(Runtime item) {
      this.builder = new RuntimeBuilder(this, item);
    }
    RuntimeBuilder builder;
    
    public N and() {
      return (N) CamelCatalogSpecFluent.this.withRuntime(builder.build());
    }
    
    public N endCamelcatalogspecRuntime() {
      return and();
    }
    
  
  }

}