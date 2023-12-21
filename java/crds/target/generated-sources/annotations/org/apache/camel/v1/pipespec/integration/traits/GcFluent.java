package org.apache.camel.v1.pipespec.integration.traits;

import org.apache.camel.v1.pipespec.integration.traits.gc.ConfigurationBuilder;
import org.apache.camel.v1.pipespec.integration.traits.gc.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.pipespec.integration.traits.gc.ConfigurationFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class GcFluent<A extends GcFluent<A>> extends BaseFluent<A>{
  public GcFluent() {
  }
  
  public GcFluent(Gc instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private Gc.DiscoveryCache discoveryCache;
  private Boolean enabled;
  
  protected void copyInstance(Gc instance) {
    instance = (instance != null ? instance : new Gc());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withDiscoveryCache(instance.getDiscoveryCache());
          this.withEnabled(instance.getEnabled());
        }
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
  
  public Gc.DiscoveryCache getDiscoveryCache() {
    return this.discoveryCache;
  }
  
  public A withDiscoveryCache(Gc.DiscoveryCache discoveryCache) {
    this.discoveryCache = discoveryCache;
    return (A) this;
  }
  
  public boolean hasDiscoveryCache() {
    return this.discoveryCache != null;
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    GcFluent that = (GcFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(discoveryCache, that.discoveryCache)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  discoveryCache,  enabled,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (discoveryCache != null) { sb.append("discoveryCache:"); sb.append(discoveryCache + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled); }
    sb.append("}");
    return sb.toString();
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
      return (N) GcFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}