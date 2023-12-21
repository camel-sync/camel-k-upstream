package org.apache.camel.v1.integrationspec.traits;

import org.apache.camel.v1.integrationspec.traits.mount.ConfigurationBuilder;
import org.apache.camel.v1.integrationspec.traits.mount.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.integrationspec.traits.mount.ConfigurationFluent;
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
public class MountFluent<A extends MountFluent<A>> extends BaseFluent<A>{
  public MountFluent() {
  }
  
  public MountFluent(Mount instance) {
    this.copyInstance(instance);
  }
  private List<String> configs;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private Boolean hotReload;
  private List<String> resources;
  private List<String> volumes;
  
  protected void copyInstance(Mount instance) {
    instance = (instance != null ? instance : new Mount());
    if (instance != null) {
          this.withConfigs(instance.getConfigs());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withHotReload(instance.getHotReload());
          this.withResources(instance.getResources());
          this.withVolumes(instance.getVolumes());
        }
  }
  
  public A addToConfigs(int index,String item) {
    if (this.configs == null) {this.configs = new ArrayList<String>();}
    this.configs.add(index, item);
    return (A)this;
  }
  
  public A setToConfigs(int index,String item) {
    if (this.configs == null) {this.configs = new ArrayList<String>();}
    this.configs.set(index, item); return (A)this;
  }
  
  public A addToConfigs(java.lang.String... items) {
    if (this.configs == null) {this.configs = new ArrayList<String>();}
    for (String item : items) {this.configs.add(item);} return (A)this;
  }
  
  public A addAllToConfigs(Collection<String> items) {
    if (this.configs == null) {this.configs = new ArrayList<String>();}
    for (String item : items) {this.configs.add(item);} return (A)this;
  }
  
  public A removeFromConfigs(java.lang.String... items) {
    if (this.configs == null) return (A)this;
    for (String item : items) { this.configs.remove(item);} return (A)this;
  }
  
  public A removeAllFromConfigs(Collection<String> items) {
    if (this.configs == null) return (A)this;
    for (String item : items) { this.configs.remove(item);} return (A)this;
  }
  
  public List<String> getConfigs() {
    return this.configs;
  }
  
  public String getConfig(int index) {
    return this.configs.get(index);
  }
  
  public String getFirstConfig() {
    return this.configs.get(0);
  }
  
  public String getLastConfig() {
    return this.configs.get(configs.size() - 1);
  }
  
  public String getMatchingConfig(Predicate<String> predicate) {
      for (String item : configs) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingConfig(Predicate<String> predicate) {
      for (String item : configs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConfigs(List<String> configs) {
    if (configs != null) {
        this.configs = new ArrayList();
        for (String item : configs) {
          this.addToConfigs(item);
        }
    } else {
      this.configs = null;
    }
    return (A) this;
  }
  
  public A withConfigs(java.lang.String... configs) {
    if (this.configs != null) {
        this.configs.clear();
        _visitables.remove("configs");
    }
    if (configs != null) {
      for (String item : configs) {
        this.addToConfigs(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConfigs() {
    return this.configs != null && !this.configs.isEmpty();
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
  
  public Boolean getHotReload() {
    return this.hotReload;
  }
  
  public A withHotReload(Boolean hotReload) {
    this.hotReload = hotReload;
    return (A) this;
  }
  
  public boolean hasHotReload() {
    return this.hotReload != null;
  }
  
  public A addToResources(int index,String item) {
    if (this.resources == null) {this.resources = new ArrayList<String>();}
    this.resources.add(index, item);
    return (A)this;
  }
  
  public A setToResources(int index,String item) {
    if (this.resources == null) {this.resources = new ArrayList<String>();}
    this.resources.set(index, item); return (A)this;
  }
  
  public A addToResources(java.lang.String... items) {
    if (this.resources == null) {this.resources = new ArrayList<String>();}
    for (String item : items) {this.resources.add(item);} return (A)this;
  }
  
  public A addAllToResources(Collection<String> items) {
    if (this.resources == null) {this.resources = new ArrayList<String>();}
    for (String item : items) {this.resources.add(item);} return (A)this;
  }
  
  public A removeFromResources(java.lang.String... items) {
    if (this.resources == null) return (A)this;
    for (String item : items) { this.resources.remove(item);} return (A)this;
  }
  
  public A removeAllFromResources(Collection<String> items) {
    if (this.resources == null) return (A)this;
    for (String item : items) { this.resources.remove(item);} return (A)this;
  }
  
  public List<String> getResources() {
    return this.resources;
  }
  
  public String getResource(int index) {
    return this.resources.get(index);
  }
  
  public String getFirstResource() {
    return this.resources.get(0);
  }
  
  public String getLastResource() {
    return this.resources.get(resources.size() - 1);
  }
  
  public String getMatchingResource(Predicate<String> predicate) {
      for (String item : resources) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingResource(Predicate<String> predicate) {
      for (String item : resources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResources(List<String> resources) {
    if (resources != null) {
        this.resources = new ArrayList();
        for (String item : resources) {
          this.addToResources(item);
        }
    } else {
      this.resources = null;
    }
    return (A) this;
  }
  
  public A withResources(java.lang.String... resources) {
    if (this.resources != null) {
        this.resources.clear();
        _visitables.remove("resources");
    }
    if (resources != null) {
      for (String item : resources) {
        this.addToResources(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResources() {
    return this.resources != null && !this.resources.isEmpty();
  }
  
  public A addToVolumes(int index,String item) {
    if (this.volumes == null) {this.volumes = new ArrayList<String>();}
    this.volumes.add(index, item);
    return (A)this;
  }
  
  public A setToVolumes(int index,String item) {
    if (this.volumes == null) {this.volumes = new ArrayList<String>();}
    this.volumes.set(index, item); return (A)this;
  }
  
  public A addToVolumes(java.lang.String... items) {
    if (this.volumes == null) {this.volumes = new ArrayList<String>();}
    for (String item : items) {this.volumes.add(item);} return (A)this;
  }
  
  public A addAllToVolumes(Collection<String> items) {
    if (this.volumes == null) {this.volumes = new ArrayList<String>();}
    for (String item : items) {this.volumes.add(item);} return (A)this;
  }
  
  public A removeFromVolumes(java.lang.String... items) {
    if (this.volumes == null) return (A)this;
    for (String item : items) { this.volumes.remove(item);} return (A)this;
  }
  
  public A removeAllFromVolumes(Collection<String> items) {
    if (this.volumes == null) return (A)this;
    for (String item : items) { this.volumes.remove(item);} return (A)this;
  }
  
  public List<String> getVolumes() {
    return this.volumes;
  }
  
  public String getVolume(int index) {
    return this.volumes.get(index);
  }
  
  public String getFirstVolume() {
    return this.volumes.get(0);
  }
  
  public String getLastVolume() {
    return this.volumes.get(volumes.size() - 1);
  }
  
  public String getMatchingVolume(Predicate<String> predicate) {
      for (String item : volumes) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingVolume(Predicate<String> predicate) {
      for (String item : volumes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVolumes(List<String> volumes) {
    if (volumes != null) {
        this.volumes = new ArrayList();
        for (String item : volumes) {
          this.addToVolumes(item);
        }
    } else {
      this.volumes = null;
    }
    return (A) this;
  }
  
  public A withVolumes(java.lang.String... volumes) {
    if (this.volumes != null) {
        this.volumes.clear();
        _visitables.remove("volumes");
    }
    if (volumes != null) {
      for (String item : volumes) {
        this.addToVolumes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVolumes() {
    return this.volumes != null && !this.volumes.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    MountFluent that = (MountFluent) o;
    if (!java.util.Objects.equals(configs, that.configs)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(hotReload, that.hotReload)) return false;
    if (!java.util.Objects.equals(resources, that.resources)) return false;
    if (!java.util.Objects.equals(volumes, that.volumes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configs,  configuration,  enabled,  hotReload,  resources,  volumes,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configs != null && !configs.isEmpty()) { sb.append("configs:"); sb.append(configs + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (hotReload != null) { sb.append("hotReload:"); sb.append(hotReload + ","); }
    if (resources != null && !resources.isEmpty()) { sb.append("resources:"); sb.append(resources + ","); }
    if (volumes != null && !volumes.isEmpty()) { sb.append("volumes:"); sb.append(volumes); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withHotReload() {
    return withHotReload(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) MountFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}