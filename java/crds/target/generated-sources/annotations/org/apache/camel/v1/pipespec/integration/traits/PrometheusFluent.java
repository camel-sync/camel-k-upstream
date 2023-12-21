package org.apache.camel.v1.pipespec.integration.traits;

import org.apache.camel.v1.pipespec.integration.traits.prometheus.ConfigurationBuilder;
import org.apache.camel.v1.pipespec.integration.traits.prometheus.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.pipespec.integration.traits.prometheus.ConfigurationFluent;
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
public class PrometheusFluent<A extends PrometheusFluent<A>> extends BaseFluent<A>{
  public PrometheusFluent() {
  }
  
  public PrometheusFluent(Prometheus instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private Boolean podMonitor;
  private List<String> podMonitorLabels;
  
  protected void copyInstance(Prometheus instance) {
    instance = (instance != null ? instance : new Prometheus());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withPodMonitor(instance.getPodMonitor());
          this.withPodMonitorLabels(instance.getPodMonitorLabels());
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
  
  public Boolean getPodMonitor() {
    return this.podMonitor;
  }
  
  public A withPodMonitor(Boolean podMonitor) {
    this.podMonitor = podMonitor;
    return (A) this;
  }
  
  public boolean hasPodMonitor() {
    return this.podMonitor != null;
  }
  
  public A addToPodMonitorLabels(int index,String item) {
    if (this.podMonitorLabels == null) {this.podMonitorLabels = new ArrayList<String>();}
    this.podMonitorLabels.add(index, item);
    return (A)this;
  }
  
  public A setToPodMonitorLabels(int index,String item) {
    if (this.podMonitorLabels == null) {this.podMonitorLabels = new ArrayList<String>();}
    this.podMonitorLabels.set(index, item); return (A)this;
  }
  
  public A addToPodMonitorLabels(java.lang.String... items) {
    if (this.podMonitorLabels == null) {this.podMonitorLabels = new ArrayList<String>();}
    for (String item : items) {this.podMonitorLabels.add(item);} return (A)this;
  }
  
  public A addAllToPodMonitorLabels(Collection<String> items) {
    if (this.podMonitorLabels == null) {this.podMonitorLabels = new ArrayList<String>();}
    for (String item : items) {this.podMonitorLabels.add(item);} return (A)this;
  }
  
  public A removeFromPodMonitorLabels(java.lang.String... items) {
    if (this.podMonitorLabels == null) return (A)this;
    for (String item : items) { this.podMonitorLabels.remove(item);} return (A)this;
  }
  
  public A removeAllFromPodMonitorLabels(Collection<String> items) {
    if (this.podMonitorLabels == null) return (A)this;
    for (String item : items) { this.podMonitorLabels.remove(item);} return (A)this;
  }
  
  public List<String> getPodMonitorLabels() {
    return this.podMonitorLabels;
  }
  
  public String getPodMonitorLabel(int index) {
    return this.podMonitorLabels.get(index);
  }
  
  public String getFirstPodMonitorLabel() {
    return this.podMonitorLabels.get(0);
  }
  
  public String getLastPodMonitorLabel() {
    return this.podMonitorLabels.get(podMonitorLabels.size() - 1);
  }
  
  public String getMatchingPodMonitorLabel(Predicate<String> predicate) {
      for (String item : podMonitorLabels) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingPodMonitorLabel(Predicate<String> predicate) {
      for (String item : podMonitorLabels) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPodMonitorLabels(List<String> podMonitorLabels) {
    if (podMonitorLabels != null) {
        this.podMonitorLabels = new ArrayList();
        for (String item : podMonitorLabels) {
          this.addToPodMonitorLabels(item);
        }
    } else {
      this.podMonitorLabels = null;
    }
    return (A) this;
  }
  
  public A withPodMonitorLabels(java.lang.String... podMonitorLabels) {
    if (this.podMonitorLabels != null) {
        this.podMonitorLabels.clear();
        _visitables.remove("podMonitorLabels");
    }
    if (podMonitorLabels != null) {
      for (String item : podMonitorLabels) {
        this.addToPodMonitorLabels(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPodMonitorLabels() {
    return this.podMonitorLabels != null && !this.podMonitorLabels.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    PrometheusFluent that = (PrometheusFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(podMonitor, that.podMonitor)) return false;
    if (!java.util.Objects.equals(podMonitorLabels, that.podMonitorLabels)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  enabled,  podMonitor,  podMonitorLabels,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (podMonitor != null) { sb.append("podMonitor:"); sb.append(podMonitor + ","); }
    if (podMonitorLabels != null && !podMonitorLabels.isEmpty()) { sb.append("podMonitorLabels:"); sb.append(podMonitorLabels); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withPodMonitor() {
    return withPodMonitor(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) PrometheusFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}