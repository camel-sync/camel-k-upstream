package org.apache.camel.v1.integrationspec.traits;

import org.apache.camel.v1.integrationspec.traits.openapi.ConfigurationBuilder;
import org.apache.camel.v1.integrationspec.traits.openapi.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.integrationspec.traits.openapi.ConfigurationFluent;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class OpenapiFluent<A extends OpenapiFluent<A>> extends BaseFluent<A>{
  public OpenapiFluent() {
  }
  
  public OpenapiFluent(Openapi instance) {
    this.copyInstance(instance);
  }
  private List<String> configmaps;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  
  protected void copyInstance(Openapi instance) {
    instance = (instance != null ? instance : new Openapi());
    if (instance != null) {
          this.withConfigmaps(instance.getConfigmaps());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
        }
  }
  
  public A addToConfigmaps(int index,String item) {
    if (this.configmaps == null) {this.configmaps = new ArrayList<String>();}
    this.configmaps.add(index, item);
    return (A)this;
  }
  
  public A setToConfigmaps(int index,String item) {
    if (this.configmaps == null) {this.configmaps = new ArrayList<String>();}
    this.configmaps.set(index, item); return (A)this;
  }
  
  public A addToConfigmaps(java.lang.String... items) {
    if (this.configmaps == null) {this.configmaps = new ArrayList<String>();}
    for (String item : items) {this.configmaps.add(item);} return (A)this;
  }
  
  public A addAllToConfigmaps(Collection<String> items) {
    if (this.configmaps == null) {this.configmaps = new ArrayList<String>();}
    for (String item : items) {this.configmaps.add(item);} return (A)this;
  }
  
  public A removeFromConfigmaps(java.lang.String... items) {
    if (this.configmaps == null) return (A)this;
    for (String item : items) { this.configmaps.remove(item);} return (A)this;
  }
  
  public A removeAllFromConfigmaps(Collection<String> items) {
    if (this.configmaps == null) return (A)this;
    for (String item : items) { this.configmaps.remove(item);} return (A)this;
  }
  
  public List<String> getConfigmaps() {
    return this.configmaps;
  }
  
  public String getConfigmap(int index) {
    return this.configmaps.get(index);
  }
  
  public String getFirstConfigmap() {
    return this.configmaps.get(0);
  }
  
  public String getLastConfigmap() {
    return this.configmaps.get(configmaps.size() - 1);
  }
  
  public String getMatchingConfigmap(Predicate<String> predicate) {
      for (String item : configmaps) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingConfigmap(Predicate<String> predicate) {
      for (String item : configmaps) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConfigmaps(List<String> configmaps) {
    if (configmaps != null) {
        this.configmaps = new ArrayList();
        for (String item : configmaps) {
          this.addToConfigmaps(item);
        }
    } else {
      this.configmaps = null;
    }
    return (A) this;
  }
  
  public A withConfigmaps(java.lang.String... configmaps) {
    if (this.configmaps != null) {
        this.configmaps.clear();
        _visitables.remove("configmaps");
    }
    if (configmaps != null) {
      for (String item : configmaps) {
        this.addToConfigmaps(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConfigmaps() {
    return this.configmaps != null && !this.configmaps.isEmpty();
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    OpenapiFluent that = (OpenapiFluent) o;
    if (!java.util.Objects.equals(configmaps, that.configmaps)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configmaps,  configuration,  enabled,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configmaps != null && !configmaps.isEmpty()) { sb.append("configmaps:"); sb.append(configmaps + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
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
      return (N) OpenapiFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}