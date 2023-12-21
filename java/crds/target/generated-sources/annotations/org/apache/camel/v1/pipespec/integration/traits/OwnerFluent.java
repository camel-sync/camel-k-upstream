package org.apache.camel.v1.pipespec.integration.traits;

import org.apache.camel.v1.pipespec.integration.traits.owner.ConfigurationBuilder;
import org.apache.camel.v1.pipespec.integration.traits.owner.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.pipespec.integration.traits.owner.ConfigurationFluent;
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
public class OwnerFluent<A extends OwnerFluent<A>> extends BaseFluent<A>{
  public OwnerFluent() {
  }
  
  public OwnerFluent(Owner instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private List<String> targetAnnotations;
  private List<String> targetLabels;
  
  protected void copyInstance(Owner instance) {
    instance = (instance != null ? instance : new Owner());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withTargetAnnotations(instance.getTargetAnnotations());
          this.withTargetLabels(instance.getTargetLabels());
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
  
  public A addToTargetAnnotations(int index,String item) {
    if (this.targetAnnotations == null) {this.targetAnnotations = new ArrayList<String>();}
    this.targetAnnotations.add(index, item);
    return (A)this;
  }
  
  public A setToTargetAnnotations(int index,String item) {
    if (this.targetAnnotations == null) {this.targetAnnotations = new ArrayList<String>();}
    this.targetAnnotations.set(index, item); return (A)this;
  }
  
  public A addToTargetAnnotations(java.lang.String... items) {
    if (this.targetAnnotations == null) {this.targetAnnotations = new ArrayList<String>();}
    for (String item : items) {this.targetAnnotations.add(item);} return (A)this;
  }
  
  public A addAllToTargetAnnotations(Collection<String> items) {
    if (this.targetAnnotations == null) {this.targetAnnotations = new ArrayList<String>();}
    for (String item : items) {this.targetAnnotations.add(item);} return (A)this;
  }
  
  public A removeFromTargetAnnotations(java.lang.String... items) {
    if (this.targetAnnotations == null) return (A)this;
    for (String item : items) { this.targetAnnotations.remove(item);} return (A)this;
  }
  
  public A removeAllFromTargetAnnotations(Collection<String> items) {
    if (this.targetAnnotations == null) return (A)this;
    for (String item : items) { this.targetAnnotations.remove(item);} return (A)this;
  }
  
  public List<String> getTargetAnnotations() {
    return this.targetAnnotations;
  }
  
  public String getTargetAnnotation(int index) {
    return this.targetAnnotations.get(index);
  }
  
  public String getFirstTargetAnnotation() {
    return this.targetAnnotations.get(0);
  }
  
  public String getLastTargetAnnotation() {
    return this.targetAnnotations.get(targetAnnotations.size() - 1);
  }
  
  public String getMatchingTargetAnnotation(Predicate<String> predicate) {
      for (String item : targetAnnotations) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingTargetAnnotation(Predicate<String> predicate) {
      for (String item : targetAnnotations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTargetAnnotations(List<String> targetAnnotations) {
    if (targetAnnotations != null) {
        this.targetAnnotations = new ArrayList();
        for (String item : targetAnnotations) {
          this.addToTargetAnnotations(item);
        }
    } else {
      this.targetAnnotations = null;
    }
    return (A) this;
  }
  
  public A withTargetAnnotations(java.lang.String... targetAnnotations) {
    if (this.targetAnnotations != null) {
        this.targetAnnotations.clear();
        _visitables.remove("targetAnnotations");
    }
    if (targetAnnotations != null) {
      for (String item : targetAnnotations) {
        this.addToTargetAnnotations(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTargetAnnotations() {
    return this.targetAnnotations != null && !this.targetAnnotations.isEmpty();
  }
  
  public A addToTargetLabels(int index,String item) {
    if (this.targetLabels == null) {this.targetLabels = new ArrayList<String>();}
    this.targetLabels.add(index, item);
    return (A)this;
  }
  
  public A setToTargetLabels(int index,String item) {
    if (this.targetLabels == null) {this.targetLabels = new ArrayList<String>();}
    this.targetLabels.set(index, item); return (A)this;
  }
  
  public A addToTargetLabels(java.lang.String... items) {
    if (this.targetLabels == null) {this.targetLabels = new ArrayList<String>();}
    for (String item : items) {this.targetLabels.add(item);} return (A)this;
  }
  
  public A addAllToTargetLabels(Collection<String> items) {
    if (this.targetLabels == null) {this.targetLabels = new ArrayList<String>();}
    for (String item : items) {this.targetLabels.add(item);} return (A)this;
  }
  
  public A removeFromTargetLabels(java.lang.String... items) {
    if (this.targetLabels == null) return (A)this;
    for (String item : items) { this.targetLabels.remove(item);} return (A)this;
  }
  
  public A removeAllFromTargetLabels(Collection<String> items) {
    if (this.targetLabels == null) return (A)this;
    for (String item : items) { this.targetLabels.remove(item);} return (A)this;
  }
  
  public List<String> getTargetLabels() {
    return this.targetLabels;
  }
  
  public String getTargetLabel(int index) {
    return this.targetLabels.get(index);
  }
  
  public String getFirstTargetLabel() {
    return this.targetLabels.get(0);
  }
  
  public String getLastTargetLabel() {
    return this.targetLabels.get(targetLabels.size() - 1);
  }
  
  public String getMatchingTargetLabel(Predicate<String> predicate) {
      for (String item : targetLabels) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingTargetLabel(Predicate<String> predicate) {
      for (String item : targetLabels) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTargetLabels(List<String> targetLabels) {
    if (targetLabels != null) {
        this.targetLabels = new ArrayList();
        for (String item : targetLabels) {
          this.addToTargetLabels(item);
        }
    } else {
      this.targetLabels = null;
    }
    return (A) this;
  }
  
  public A withTargetLabels(java.lang.String... targetLabels) {
    if (this.targetLabels != null) {
        this.targetLabels.clear();
        _visitables.remove("targetLabels");
    }
    if (targetLabels != null) {
      for (String item : targetLabels) {
        this.addToTargetLabels(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTargetLabels() {
    return this.targetLabels != null && !this.targetLabels.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    OwnerFluent that = (OwnerFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(targetAnnotations, that.targetAnnotations)) return false;
    if (!java.util.Objects.equals(targetLabels, that.targetLabels)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  enabled,  targetAnnotations,  targetLabels,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (targetAnnotations != null && !targetAnnotations.isEmpty()) { sb.append("targetAnnotations:"); sb.append(targetAnnotations + ","); }
    if (targetLabels != null && !targetLabels.isEmpty()) { sb.append("targetLabels:"); sb.append(targetLabels); }
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
      return (N) OwnerFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}