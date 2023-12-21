package org.apache.camel.v1.pipespec.integration.traits;

import org.apache.camel.v1.pipespec.integration.traits.camel.ConfigurationBuilder;
import org.apache.camel.v1.pipespec.integration.traits.camel.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.pipespec.integration.traits.camel.ConfigurationFluent;
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
public class CamelFluent<A extends CamelFluent<A>> extends BaseFluent<A>{
  public CamelFluent() {
  }
  
  public CamelFluent(Camel instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private List<String> properties;
  private String runtimeVersion;
  
  protected void copyInstance(Camel instance) {
    instance = (instance != null ? instance : new Camel());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withProperties(instance.getProperties());
          this.withRuntimeVersion(instance.getRuntimeVersion());
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
  
  public A addToProperties(int index,String item) {
    if (this.properties == null) {this.properties = new ArrayList<String>();}
    this.properties.add(index, item);
    return (A)this;
  }
  
  public A setToProperties(int index,String item) {
    if (this.properties == null) {this.properties = new ArrayList<String>();}
    this.properties.set(index, item); return (A)this;
  }
  
  public A addToProperties(java.lang.String... items) {
    if (this.properties == null) {this.properties = new ArrayList<String>();}
    for (String item : items) {this.properties.add(item);} return (A)this;
  }
  
  public A addAllToProperties(Collection<String> items) {
    if (this.properties == null) {this.properties = new ArrayList<String>();}
    for (String item : items) {this.properties.add(item);} return (A)this;
  }
  
  public A removeFromProperties(java.lang.String... items) {
    if (this.properties == null) return (A)this;
    for (String item : items) { this.properties.remove(item);} return (A)this;
  }
  
  public A removeAllFromProperties(Collection<String> items) {
    if (this.properties == null) return (A)this;
    for (String item : items) { this.properties.remove(item);} return (A)this;
  }
  
  public List<String> getProperties() {
    return this.properties;
  }
  
  public String getProperty(int index) {
    return this.properties.get(index);
  }
  
  public String getFirstProperty() {
    return this.properties.get(0);
  }
  
  public String getLastProperty() {
    return this.properties.get(properties.size() - 1);
  }
  
  public String getMatchingProperty(Predicate<String> predicate) {
      for (String item : properties) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingProperty(Predicate<String> predicate) {
      for (String item : properties) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withProperties(List<String> properties) {
    if (properties != null) {
        this.properties = new ArrayList();
        for (String item : properties) {
          this.addToProperties(item);
        }
    } else {
      this.properties = null;
    }
    return (A) this;
  }
  
  public A withProperties(java.lang.String... properties) {
    if (this.properties != null) {
        this.properties.clear();
        _visitables.remove("properties");
    }
    if (properties != null) {
      for (String item : properties) {
        this.addToProperties(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasProperties() {
    return this.properties != null && !this.properties.isEmpty();
  }
  
  public String getRuntimeVersion() {
    return this.runtimeVersion;
  }
  
  public A withRuntimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
    return (A) this;
  }
  
  public boolean hasRuntimeVersion() {
    return this.runtimeVersion != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CamelFluent that = (CamelFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(properties, that.properties)) return false;
    if (!java.util.Objects.equals(runtimeVersion, that.runtimeVersion)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  enabled,  properties,  runtimeVersion,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (properties != null && !properties.isEmpty()) { sb.append("properties:"); sb.append(properties + ","); }
    if (runtimeVersion != null) { sb.append("runtimeVersion:"); sb.append(runtimeVersion); }
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
      return (N) CamelFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}