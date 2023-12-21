package org.apache.camel.v1.integrationplatformspec.traits;

import org.apache.camel.v1.integrationplatformspec.traits.ingress.ConfigurationBuilder;
import org.apache.camel.v1.integrationplatformspec.traits.ingress.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.integrationplatformspec.traits.ingress.ConfigurationFluent;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class IngressFluent<A extends IngressFluent<A>> extends BaseFluent<A>{
  public IngressFluent() {
  }
  
  public IngressFluent(Ingress instance) {
    this.copyInstance(instance);
  }
  private Map<String,String> annotations;
  private Boolean auto;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private String host;
  private String path;
  private Ingress.PathType pathType;
  
  protected void copyInstance(Ingress instance) {
    instance = (instance != null ? instance : new Ingress());
    if (instance != null) {
          this.withAnnotations(instance.getAnnotations());
          this.withAuto(instance.getAuto());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withHost(instance.getHost());
          this.withPath(instance.getPath());
          this.withPathType(instance.getPathType());
        }
  }
  
  public A addToAnnotations(String key,String value) {
    if(this.annotations == null && key != null && value != null) { this.annotations = new LinkedHashMap(); }
    if(key != null && value != null) {this.annotations.put(key, value);} return (A)this;
  }
  
  public A addToAnnotations(Map<String,String> map) {
    if(this.annotations == null && map != null) { this.annotations = new LinkedHashMap(); }
    if(map != null) { this.annotations.putAll(map);} return (A)this;
  }
  
  public A removeFromAnnotations(String key) {
    if(this.annotations == null) { return (A) this; }
    if(key != null && this.annotations != null) {this.annotations.remove(key);} return (A)this;
  }
  
  public A removeFromAnnotations(Map<String,String> map) {
    if(this.annotations == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.annotations != null){this.annotations.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getAnnotations() {
    return this.annotations;
  }
  
  public <K,V>A withAnnotations(Map<String,String> annotations) {
    if (annotations == null) {
      this.annotations = null;
    } else {
      this.annotations = new LinkedHashMap(annotations);
    }
    return (A) this;
  }
  
  public boolean hasAnnotations() {
    return this.annotations != null;
  }
  
  public Boolean getAuto() {
    return this.auto;
  }
  
  public A withAuto(Boolean auto) {
    this.auto = auto;
    return (A) this;
  }
  
  public boolean hasAuto() {
    return this.auto != null;
  }
  
  public Configuration buildConfiguration() {
    return this.configuration != null ? this.configuration.build() : null;
  }
  
  public A withConfiguration(Configuration configuration) {
    this._visitables.remove("configuration");
    if (configuration != null) {
        this.configuration = new ConfigurationBuilder(configuration);
        this._visitables.get("configuration").add(this.configuration);
    } else {
        this.configuration = null;
        this._visitables.get("configuration").remove(this.configuration);
    }
    return (A) this;
  }
  
  public boolean hasConfiguration() {
    return this.configuration != null;
  }
  
  public ConfigurationNested<A> withNewConfiguration() {
    return new ConfigurationNested(null);
  }
  
  public ConfigurationNested<A> withNewConfigurationLike(Configuration item) {
    return new ConfigurationNested(item);
  }
  
  public ConfigurationNested<A> editConfiguration() {
    return withNewConfigurationLike(java.util.Optional.ofNullable(buildConfiguration()).orElse(null));
  }
  
  public ConfigurationNested<A> editOrNewConfiguration() {
    return withNewConfigurationLike(java.util.Optional.ofNullable(buildConfiguration()).orElse(new ConfigurationBuilder().build()));
  }
  
  public ConfigurationNested<A> editOrNewConfigurationLike(Configuration item) {
    return withNewConfigurationLike(java.util.Optional.ofNullable(buildConfiguration()).orElse(item));
  }
  
  public Boolean getEnabled() {
    return this.enabled;
  }
  
  public A withEnabled(Boolean enabled) {
    this.enabled = enabled;
    return (A) this;
  }
  
  public boolean hasEnabled() {
    return this.enabled != null;
  }
  
  public String getHost() {
    return this.host;
  }
  
  public A withHost(String host) {
    this.host = host;
    return (A) this;
  }
  
  public boolean hasHost() {
    return this.host != null;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public Ingress.PathType getPathType() {
    return this.pathType;
  }
  
  public A withPathType(Ingress.PathType pathType) {
    this.pathType = pathType;
    return (A) this;
  }
  
  public boolean hasPathType() {
    return this.pathType != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    IngressFluent that = (IngressFluent) o;
    if (!java.util.Objects.equals(annotations, that.annotations)) return false;
    if (!java.util.Objects.equals(auto, that.auto)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(host, that.host)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(pathType, that.pathType)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(annotations,  auto,  configuration,  enabled,  host,  path,  pathType,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (annotations != null && !annotations.isEmpty()) { sb.append("annotations:"); sb.append(annotations + ","); }
    if (auto != null) { sb.append("auto:"); sb.append(auto + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (host != null) { sb.append("host:"); sb.append(host + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (pathType != null) { sb.append("pathType:"); sb.append(pathType); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAuto() {
    return withAuto(true);
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) IngressFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}