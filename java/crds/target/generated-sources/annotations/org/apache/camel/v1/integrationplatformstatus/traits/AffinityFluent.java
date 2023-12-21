package org.apache.camel.v1.integrationplatformstatus.traits;

import org.apache.camel.v1.integrationplatformstatus.traits.affinity.ConfigurationBuilder;
import org.apache.camel.v1.integrationplatformstatus.traits.affinity.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.integrationplatformstatus.traits.affinity.ConfigurationFluent;
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
public class AffinityFluent<A extends AffinityFluent<A>> extends BaseFluent<A>{
  public AffinityFluent() {
  }
  
  public AffinityFluent(Affinity instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private List<String> nodeAffinityLabels;
  private Boolean podAffinity;
  private List<String> podAffinityLabels;
  private Boolean podAntiAffinity;
  private List<String> podAntiAffinityLabels;
  
  protected void copyInstance(Affinity instance) {
    instance = (instance != null ? instance : new Affinity());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withNodeAffinityLabels(instance.getNodeAffinityLabels());
          this.withPodAffinity(instance.getPodAffinity());
          this.withPodAffinityLabels(instance.getPodAffinityLabels());
          this.withPodAntiAffinity(instance.getPodAntiAffinity());
          this.withPodAntiAffinityLabels(instance.getPodAntiAffinityLabels());
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
  
  public A addToNodeAffinityLabels(int index,String item) {
    if (this.nodeAffinityLabels == null) {this.nodeAffinityLabels = new ArrayList<String>();}
    this.nodeAffinityLabels.add(index, item);
    return (A)this;
  }
  
  public A setToNodeAffinityLabels(int index,String item) {
    if (this.nodeAffinityLabels == null) {this.nodeAffinityLabels = new ArrayList<String>();}
    this.nodeAffinityLabels.set(index, item); return (A)this;
  }
  
  public A addToNodeAffinityLabels(java.lang.String... items) {
    if (this.nodeAffinityLabels == null) {this.nodeAffinityLabels = new ArrayList<String>();}
    for (String item : items) {this.nodeAffinityLabels.add(item);} return (A)this;
  }
  
  public A addAllToNodeAffinityLabels(Collection<String> items) {
    if (this.nodeAffinityLabels == null) {this.nodeAffinityLabels = new ArrayList<String>();}
    for (String item : items) {this.nodeAffinityLabels.add(item);} return (A)this;
  }
  
  public A removeFromNodeAffinityLabels(java.lang.String... items) {
    if (this.nodeAffinityLabels == null) return (A)this;
    for (String item : items) { this.nodeAffinityLabels.remove(item);} return (A)this;
  }
  
  public A removeAllFromNodeAffinityLabels(Collection<String> items) {
    if (this.nodeAffinityLabels == null) return (A)this;
    for (String item : items) { this.nodeAffinityLabels.remove(item);} return (A)this;
  }
  
  public List<String> getNodeAffinityLabels() {
    return this.nodeAffinityLabels;
  }
  
  public String getNodeAffinityLabel(int index) {
    return this.nodeAffinityLabels.get(index);
  }
  
  public String getFirstNodeAffinityLabel() {
    return this.nodeAffinityLabels.get(0);
  }
  
  public String getLastNodeAffinityLabel() {
    return this.nodeAffinityLabels.get(nodeAffinityLabels.size() - 1);
  }
  
  public String getMatchingNodeAffinityLabel(Predicate<String> predicate) {
      for (String item : nodeAffinityLabels) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingNodeAffinityLabel(Predicate<String> predicate) {
      for (String item : nodeAffinityLabels) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withNodeAffinityLabels(List<String> nodeAffinityLabels) {
    if (nodeAffinityLabels != null) {
        this.nodeAffinityLabels = new ArrayList();
        for (String item : nodeAffinityLabels) {
          this.addToNodeAffinityLabels(item);
        }
    } else {
      this.nodeAffinityLabels = null;
    }
    return (A) this;
  }
  
  public A withNodeAffinityLabels(java.lang.String... nodeAffinityLabels) {
    if (this.nodeAffinityLabels != null) {
        this.nodeAffinityLabels.clear();
        _visitables.remove("nodeAffinityLabels");
    }
    if (nodeAffinityLabels != null) {
      for (String item : nodeAffinityLabels) {
        this.addToNodeAffinityLabels(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasNodeAffinityLabels() {
    return this.nodeAffinityLabels != null && !this.nodeAffinityLabels.isEmpty();
  }
  
  public Boolean getPodAffinity() {
    return this.podAffinity;
  }
  
  public A withPodAffinity(Boolean podAffinity) {
    this.podAffinity = podAffinity;
    return (A) this;
  }
  
  public boolean hasPodAffinity() {
    return this.podAffinity != null;
  }
  
  public A addToPodAffinityLabels(int index,String item) {
    if (this.podAffinityLabels == null) {this.podAffinityLabels = new ArrayList<String>();}
    this.podAffinityLabels.add(index, item);
    return (A)this;
  }
  
  public A setToPodAffinityLabels(int index,String item) {
    if (this.podAffinityLabels == null) {this.podAffinityLabels = new ArrayList<String>();}
    this.podAffinityLabels.set(index, item); return (A)this;
  }
  
  public A addToPodAffinityLabels(java.lang.String... items) {
    if (this.podAffinityLabels == null) {this.podAffinityLabels = new ArrayList<String>();}
    for (String item : items) {this.podAffinityLabels.add(item);} return (A)this;
  }
  
  public A addAllToPodAffinityLabels(Collection<String> items) {
    if (this.podAffinityLabels == null) {this.podAffinityLabels = new ArrayList<String>();}
    for (String item : items) {this.podAffinityLabels.add(item);} return (A)this;
  }
  
  public A removeFromPodAffinityLabels(java.lang.String... items) {
    if (this.podAffinityLabels == null) return (A)this;
    for (String item : items) { this.podAffinityLabels.remove(item);} return (A)this;
  }
  
  public A removeAllFromPodAffinityLabels(Collection<String> items) {
    if (this.podAffinityLabels == null) return (A)this;
    for (String item : items) { this.podAffinityLabels.remove(item);} return (A)this;
  }
  
  public List<String> getPodAffinityLabels() {
    return this.podAffinityLabels;
  }
  
  public String getPodAffinityLabel(int index) {
    return this.podAffinityLabels.get(index);
  }
  
  public String getFirstPodAffinityLabel() {
    return this.podAffinityLabels.get(0);
  }
  
  public String getLastPodAffinityLabel() {
    return this.podAffinityLabels.get(podAffinityLabels.size() - 1);
  }
  
  public String getMatchingPodAffinityLabel(Predicate<String> predicate) {
      for (String item : podAffinityLabels) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingPodAffinityLabel(Predicate<String> predicate) {
      for (String item : podAffinityLabels) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPodAffinityLabels(List<String> podAffinityLabels) {
    if (podAffinityLabels != null) {
        this.podAffinityLabels = new ArrayList();
        for (String item : podAffinityLabels) {
          this.addToPodAffinityLabels(item);
        }
    } else {
      this.podAffinityLabels = null;
    }
    return (A) this;
  }
  
  public A withPodAffinityLabels(java.lang.String... podAffinityLabels) {
    if (this.podAffinityLabels != null) {
        this.podAffinityLabels.clear();
        _visitables.remove("podAffinityLabels");
    }
    if (podAffinityLabels != null) {
      for (String item : podAffinityLabels) {
        this.addToPodAffinityLabels(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPodAffinityLabels() {
    return this.podAffinityLabels != null && !this.podAffinityLabels.isEmpty();
  }
  
  public Boolean getPodAntiAffinity() {
    return this.podAntiAffinity;
  }
  
  public A withPodAntiAffinity(Boolean podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
    return (A) this;
  }
  
  public boolean hasPodAntiAffinity() {
    return this.podAntiAffinity != null;
  }
  
  public A addToPodAntiAffinityLabels(int index,String item) {
    if (this.podAntiAffinityLabels == null) {this.podAntiAffinityLabels = new ArrayList<String>();}
    this.podAntiAffinityLabels.add(index, item);
    return (A)this;
  }
  
  public A setToPodAntiAffinityLabels(int index,String item) {
    if (this.podAntiAffinityLabels == null) {this.podAntiAffinityLabels = new ArrayList<String>();}
    this.podAntiAffinityLabels.set(index, item); return (A)this;
  }
  
  public A addToPodAntiAffinityLabels(java.lang.String... items) {
    if (this.podAntiAffinityLabels == null) {this.podAntiAffinityLabels = new ArrayList<String>();}
    for (String item : items) {this.podAntiAffinityLabels.add(item);} return (A)this;
  }
  
  public A addAllToPodAntiAffinityLabels(Collection<String> items) {
    if (this.podAntiAffinityLabels == null) {this.podAntiAffinityLabels = new ArrayList<String>();}
    for (String item : items) {this.podAntiAffinityLabels.add(item);} return (A)this;
  }
  
  public A removeFromPodAntiAffinityLabels(java.lang.String... items) {
    if (this.podAntiAffinityLabels == null) return (A)this;
    for (String item : items) { this.podAntiAffinityLabels.remove(item);} return (A)this;
  }
  
  public A removeAllFromPodAntiAffinityLabels(Collection<String> items) {
    if (this.podAntiAffinityLabels == null) return (A)this;
    for (String item : items) { this.podAntiAffinityLabels.remove(item);} return (A)this;
  }
  
  public List<String> getPodAntiAffinityLabels() {
    return this.podAntiAffinityLabels;
  }
  
  public String getPodAntiAffinityLabel(int index) {
    return this.podAntiAffinityLabels.get(index);
  }
  
  public String getFirstPodAntiAffinityLabel() {
    return this.podAntiAffinityLabels.get(0);
  }
  
  public String getLastPodAntiAffinityLabel() {
    return this.podAntiAffinityLabels.get(podAntiAffinityLabels.size() - 1);
  }
  
  public String getMatchingPodAntiAffinityLabel(Predicate<String> predicate) {
      for (String item : podAntiAffinityLabels) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingPodAntiAffinityLabel(Predicate<String> predicate) {
      for (String item : podAntiAffinityLabels) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPodAntiAffinityLabels(List<String> podAntiAffinityLabels) {
    if (podAntiAffinityLabels != null) {
        this.podAntiAffinityLabels = new ArrayList();
        for (String item : podAntiAffinityLabels) {
          this.addToPodAntiAffinityLabels(item);
        }
    } else {
      this.podAntiAffinityLabels = null;
    }
    return (A) this;
  }
  
  public A withPodAntiAffinityLabels(java.lang.String... podAntiAffinityLabels) {
    if (this.podAntiAffinityLabels != null) {
        this.podAntiAffinityLabels.clear();
        _visitables.remove("podAntiAffinityLabels");
    }
    if (podAntiAffinityLabels != null) {
      for (String item : podAntiAffinityLabels) {
        this.addToPodAntiAffinityLabels(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPodAntiAffinityLabels() {
    return this.podAntiAffinityLabels != null && !this.podAntiAffinityLabels.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    AffinityFluent that = (AffinityFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(nodeAffinityLabels, that.nodeAffinityLabels)) return false;
    if (!java.util.Objects.equals(podAffinity, that.podAffinity)) return false;
    if (!java.util.Objects.equals(podAffinityLabels, that.podAffinityLabels)) return false;
    if (!java.util.Objects.equals(podAntiAffinity, that.podAntiAffinity)) return false;
    if (!java.util.Objects.equals(podAntiAffinityLabels, that.podAntiAffinityLabels)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  enabled,  nodeAffinityLabels,  podAffinity,  podAffinityLabels,  podAntiAffinity,  podAntiAffinityLabels,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (nodeAffinityLabels != null && !nodeAffinityLabels.isEmpty()) { sb.append("nodeAffinityLabels:"); sb.append(nodeAffinityLabels + ","); }
    if (podAffinity != null) { sb.append("podAffinity:"); sb.append(podAffinity + ","); }
    if (podAffinityLabels != null && !podAffinityLabels.isEmpty()) { sb.append("podAffinityLabels:"); sb.append(podAffinityLabels + ","); }
    if (podAntiAffinity != null) { sb.append("podAntiAffinity:"); sb.append(podAntiAffinity + ","); }
    if (podAntiAffinityLabels != null && !podAntiAffinityLabels.isEmpty()) { sb.append("podAntiAffinityLabels:"); sb.append(podAntiAffinityLabels); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withPodAffinity() {
    return withPodAffinity(true);
  }
  
  public A withPodAntiAffinity() {
    return withPodAntiAffinity(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) AffinityFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}