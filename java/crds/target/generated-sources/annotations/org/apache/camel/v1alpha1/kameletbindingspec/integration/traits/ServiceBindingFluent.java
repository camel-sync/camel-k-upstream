package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.servicebinding.ConfigurationBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.servicebinding.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.servicebinding.ConfigurationFluent;
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
public class ServiceBindingFluent<A extends ServiceBindingFluent<A>> extends BaseFluent<A>{
  public ServiceBindingFluent() {
  }
  
  public ServiceBindingFluent(ServiceBinding instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private List<String> services;
  
  protected void copyInstance(ServiceBinding instance) {
    instance = (instance != null ? instance : new ServiceBinding());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withServices(instance.getServices());
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
  
  public A addToServices(int index,String item) {
    if (this.services == null) {this.services = new ArrayList<String>();}
    this.services.add(index, item);
    return (A)this;
  }
  
  public A setToServices(int index,String item) {
    if (this.services == null) {this.services = new ArrayList<String>();}
    this.services.set(index, item); return (A)this;
  }
  
  public A addToServices(java.lang.String... items) {
    if (this.services == null) {this.services = new ArrayList<String>();}
    for (String item : items) {this.services.add(item);} return (A)this;
  }
  
  public A addAllToServices(Collection<String> items) {
    if (this.services == null) {this.services = new ArrayList<String>();}
    for (String item : items) {this.services.add(item);} return (A)this;
  }
  
  public A removeFromServices(java.lang.String... items) {
    if (this.services == null) return (A)this;
    for (String item : items) { this.services.remove(item);} return (A)this;
  }
  
  public A removeAllFromServices(Collection<String> items) {
    if (this.services == null) return (A)this;
    for (String item : items) { this.services.remove(item);} return (A)this;
  }
  
  public List<String> getServices() {
    return this.services;
  }
  
  public String getService(int index) {
    return this.services.get(index);
  }
  
  public String getFirstService() {
    return this.services.get(0);
  }
  
  public String getLastService() {
    return this.services.get(services.size() - 1);
  }
  
  public String getMatchingService(Predicate<String> predicate) {
      for (String item : services) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingService(Predicate<String> predicate) {
      for (String item : services) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withServices(List<String> services) {
    if (services != null) {
        this.services = new ArrayList();
        for (String item : services) {
          this.addToServices(item);
        }
    } else {
      this.services = null;
    }
    return (A) this;
  }
  
  public A withServices(java.lang.String... services) {
    if (this.services != null) {
        this.services.clear();
        _visitables.remove("services");
    }
    if (services != null) {
      for (String item : services) {
        this.addToServices(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasServices() {
    return this.services != null && !this.services.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ServiceBindingFluent that = (ServiceBindingFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(services, that.services)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  enabled,  services,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (services != null && !services.isEmpty()) { sb.append("services:"); sb.append(services); }
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
      return (N) ServiceBindingFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}