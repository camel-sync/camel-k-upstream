package org.apache.camel.v1.pipespec.integration.traits;

import org.apache.camel.v1.pipespec.integration.traits.toleration.ConfigurationBuilder;
import org.apache.camel.v1.pipespec.integration.traits.toleration.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.pipespec.integration.traits.toleration.ConfigurationFluent;
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
public class TolerationFluent<A extends TolerationFluent<A>> extends BaseFluent<A>{
  public TolerationFluent() {
  }
  
  public TolerationFluent(Toleration instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private List<String> taints;
  
  protected void copyInstance(Toleration instance) {
    instance = (instance != null ? instance : new Toleration());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withTaints(instance.getTaints());
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
  
  public A addToTaints(int index,String item) {
    if (this.taints == null) {this.taints = new ArrayList<String>();}
    this.taints.add(index, item);
    return (A)this;
  }
  
  public A setToTaints(int index,String item) {
    if (this.taints == null) {this.taints = new ArrayList<String>();}
    this.taints.set(index, item); return (A)this;
  }
  
  public A addToTaints(java.lang.String... items) {
    if (this.taints == null) {this.taints = new ArrayList<String>();}
    for (String item : items) {this.taints.add(item);} return (A)this;
  }
  
  public A addAllToTaints(Collection<String> items) {
    if (this.taints == null) {this.taints = new ArrayList<String>();}
    for (String item : items) {this.taints.add(item);} return (A)this;
  }
  
  public A removeFromTaints(java.lang.String... items) {
    if (this.taints == null) return (A)this;
    for (String item : items) { this.taints.remove(item);} return (A)this;
  }
  
  public A removeAllFromTaints(Collection<String> items) {
    if (this.taints == null) return (A)this;
    for (String item : items) { this.taints.remove(item);} return (A)this;
  }
  
  public List<String> getTaints() {
    return this.taints;
  }
  
  public String getTaint(int index) {
    return this.taints.get(index);
  }
  
  public String getFirstTaint() {
    return this.taints.get(0);
  }
  
  public String getLastTaint() {
    return this.taints.get(taints.size() - 1);
  }
  
  public String getMatchingTaint(Predicate<String> predicate) {
      for (String item : taints) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingTaint(Predicate<String> predicate) {
      for (String item : taints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTaints(List<String> taints) {
    if (taints != null) {
        this.taints = new ArrayList();
        for (String item : taints) {
          this.addToTaints(item);
        }
    } else {
      this.taints = null;
    }
    return (A) this;
  }
  
  public A withTaints(java.lang.String... taints) {
    if (this.taints != null) {
        this.taints.clear();
        _visitables.remove("taints");
    }
    if (taints != null) {
      for (String item : taints) {
        this.addToTaints(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTaints() {
    return this.taints != null && !this.taints.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    TolerationFluent that = (TolerationFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(taints, that.taints)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  enabled,  taints,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (taints != null && !taints.isEmpty()) { sb.append("taints:"); sb.append(taints); }
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
      return (N) TolerationFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}