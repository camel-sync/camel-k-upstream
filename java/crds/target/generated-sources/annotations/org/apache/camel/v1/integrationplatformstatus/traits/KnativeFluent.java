package org.apache.camel.v1.integrationplatformstatus.traits;

import org.apache.camel.v1.integrationplatformstatus.traits.knative.ConfigurationBuilder;
import org.apache.camel.v1.integrationplatformstatus.traits.knative.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.integrationplatformstatus.traits.knative.ConfigurationFluent;
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
public class KnativeFluent<A extends KnativeFluent<A>> extends BaseFluent<A>{
  public KnativeFluent() {
  }
  
  public KnativeFluent(Knative instance) {
    this.copyInstance(instance);
  }
  private Boolean auto;
  private List<String> channelSinks;
  private List<String> channelSources;
  private String config;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private List<String> endpointSinks;
  private List<String> endpointSources;
  private List<String> eventSinks;
  private List<String> eventSources;
  private Boolean filterSourceChannels;
  private Boolean namespaceLabel;
  private Boolean sinkBinding;
  
  protected void copyInstance(Knative instance) {
    instance = (instance != null ? instance : new Knative());
    if (instance != null) {
          this.withAuto(instance.getAuto());
          this.withChannelSinks(instance.getChannelSinks());
          this.withChannelSources(instance.getChannelSources());
          this.withConfig(instance.getConfig());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withEndpointSinks(instance.getEndpointSinks());
          this.withEndpointSources(instance.getEndpointSources());
          this.withEventSinks(instance.getEventSinks());
          this.withEventSources(instance.getEventSources());
          this.withFilterSourceChannels(instance.getFilterSourceChannels());
          this.withNamespaceLabel(instance.getNamespaceLabel());
          this.withSinkBinding(instance.getSinkBinding());
        }
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
  
  public A addToChannelSinks(int index,String item) {
    if (this.channelSinks == null) {this.channelSinks = new ArrayList<String>();}
    this.channelSinks.add(index, item);
    return (A)this;
  }
  
  public A setToChannelSinks(int index,String item) {
    if (this.channelSinks == null) {this.channelSinks = new ArrayList<String>();}
    this.channelSinks.set(index, item); return (A)this;
  }
  
  public A addToChannelSinks(java.lang.String... items) {
    if (this.channelSinks == null) {this.channelSinks = new ArrayList<String>();}
    for (String item : items) {this.channelSinks.add(item);} return (A)this;
  }
  
  public A addAllToChannelSinks(Collection<String> items) {
    if (this.channelSinks == null) {this.channelSinks = new ArrayList<String>();}
    for (String item : items) {this.channelSinks.add(item);} return (A)this;
  }
  
  public A removeFromChannelSinks(java.lang.String... items) {
    if (this.channelSinks == null) return (A)this;
    for (String item : items) { this.channelSinks.remove(item);} return (A)this;
  }
  
  public A removeAllFromChannelSinks(Collection<String> items) {
    if (this.channelSinks == null) return (A)this;
    for (String item : items) { this.channelSinks.remove(item);} return (A)this;
  }
  
  public List<String> getChannelSinks() {
    return this.channelSinks;
  }
  
  public String getChannelSink(int index) {
    return this.channelSinks.get(index);
  }
  
  public String getFirstChannelSink() {
    return this.channelSinks.get(0);
  }
  
  public String getLastChannelSink() {
    return this.channelSinks.get(channelSinks.size() - 1);
  }
  
  public String getMatchingChannelSink(Predicate<String> predicate) {
      for (String item : channelSinks) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingChannelSink(Predicate<String> predicate) {
      for (String item : channelSinks) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withChannelSinks(List<String> channelSinks) {
    if (channelSinks != null) {
        this.channelSinks = new ArrayList();
        for (String item : channelSinks) {
          this.addToChannelSinks(item);
        }
    } else {
      this.channelSinks = null;
    }
    return (A) this;
  }
  
  public A withChannelSinks(java.lang.String... channelSinks) {
    if (this.channelSinks != null) {
        this.channelSinks.clear();
        _visitables.remove("channelSinks");
    }
    if (channelSinks != null) {
      for (String item : channelSinks) {
        this.addToChannelSinks(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasChannelSinks() {
    return this.channelSinks != null && !this.channelSinks.isEmpty();
  }
  
  public A addToChannelSources(int index,String item) {
    if (this.channelSources == null) {this.channelSources = new ArrayList<String>();}
    this.channelSources.add(index, item);
    return (A)this;
  }
  
  public A setToChannelSources(int index,String item) {
    if (this.channelSources == null) {this.channelSources = new ArrayList<String>();}
    this.channelSources.set(index, item); return (A)this;
  }
  
  public A addToChannelSources(java.lang.String... items) {
    if (this.channelSources == null) {this.channelSources = new ArrayList<String>();}
    for (String item : items) {this.channelSources.add(item);} return (A)this;
  }
  
  public A addAllToChannelSources(Collection<String> items) {
    if (this.channelSources == null) {this.channelSources = new ArrayList<String>();}
    for (String item : items) {this.channelSources.add(item);} return (A)this;
  }
  
  public A removeFromChannelSources(java.lang.String... items) {
    if (this.channelSources == null) return (A)this;
    for (String item : items) { this.channelSources.remove(item);} return (A)this;
  }
  
  public A removeAllFromChannelSources(Collection<String> items) {
    if (this.channelSources == null) return (A)this;
    for (String item : items) { this.channelSources.remove(item);} return (A)this;
  }
  
  public List<String> getChannelSources() {
    return this.channelSources;
  }
  
  public String getChannelSource(int index) {
    return this.channelSources.get(index);
  }
  
  public String getFirstChannelSource() {
    return this.channelSources.get(0);
  }
  
  public String getLastChannelSource() {
    return this.channelSources.get(channelSources.size() - 1);
  }
  
  public String getMatchingChannelSource(Predicate<String> predicate) {
      for (String item : channelSources) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingChannelSource(Predicate<String> predicate) {
      for (String item : channelSources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withChannelSources(List<String> channelSources) {
    if (channelSources != null) {
        this.channelSources = new ArrayList();
        for (String item : channelSources) {
          this.addToChannelSources(item);
        }
    } else {
      this.channelSources = null;
    }
    return (A) this;
  }
  
  public A withChannelSources(java.lang.String... channelSources) {
    if (this.channelSources != null) {
        this.channelSources.clear();
        _visitables.remove("channelSources");
    }
    if (channelSources != null) {
      for (String item : channelSources) {
        this.addToChannelSources(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasChannelSources() {
    return this.channelSources != null && !this.channelSources.isEmpty();
  }
  
  public String getConfig() {
    return this.config;
  }
  
  public A withConfig(String config) {
    this.config = config;
    return (A) this;
  }
  
  public boolean hasConfig() {
    return this.config != null;
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
  
  public A addToEndpointSinks(int index,String item) {
    if (this.endpointSinks == null) {this.endpointSinks = new ArrayList<String>();}
    this.endpointSinks.add(index, item);
    return (A)this;
  }
  
  public A setToEndpointSinks(int index,String item) {
    if (this.endpointSinks == null) {this.endpointSinks = new ArrayList<String>();}
    this.endpointSinks.set(index, item); return (A)this;
  }
  
  public A addToEndpointSinks(java.lang.String... items) {
    if (this.endpointSinks == null) {this.endpointSinks = new ArrayList<String>();}
    for (String item : items) {this.endpointSinks.add(item);} return (A)this;
  }
  
  public A addAllToEndpointSinks(Collection<String> items) {
    if (this.endpointSinks == null) {this.endpointSinks = new ArrayList<String>();}
    for (String item : items) {this.endpointSinks.add(item);} return (A)this;
  }
  
  public A removeFromEndpointSinks(java.lang.String... items) {
    if (this.endpointSinks == null) return (A)this;
    for (String item : items) { this.endpointSinks.remove(item);} return (A)this;
  }
  
  public A removeAllFromEndpointSinks(Collection<String> items) {
    if (this.endpointSinks == null) return (A)this;
    for (String item : items) { this.endpointSinks.remove(item);} return (A)this;
  }
  
  public List<String> getEndpointSinks() {
    return this.endpointSinks;
  }
  
  public String getEndpointSink(int index) {
    return this.endpointSinks.get(index);
  }
  
  public String getFirstEndpointSink() {
    return this.endpointSinks.get(0);
  }
  
  public String getLastEndpointSink() {
    return this.endpointSinks.get(endpointSinks.size() - 1);
  }
  
  public String getMatchingEndpointSink(Predicate<String> predicate) {
      for (String item : endpointSinks) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingEndpointSink(Predicate<String> predicate) {
      for (String item : endpointSinks) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEndpointSinks(List<String> endpointSinks) {
    if (endpointSinks != null) {
        this.endpointSinks = new ArrayList();
        for (String item : endpointSinks) {
          this.addToEndpointSinks(item);
        }
    } else {
      this.endpointSinks = null;
    }
    return (A) this;
  }
  
  public A withEndpointSinks(java.lang.String... endpointSinks) {
    if (this.endpointSinks != null) {
        this.endpointSinks.clear();
        _visitables.remove("endpointSinks");
    }
    if (endpointSinks != null) {
      for (String item : endpointSinks) {
        this.addToEndpointSinks(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEndpointSinks() {
    return this.endpointSinks != null && !this.endpointSinks.isEmpty();
  }
  
  public A addToEndpointSources(int index,String item) {
    if (this.endpointSources == null) {this.endpointSources = new ArrayList<String>();}
    this.endpointSources.add(index, item);
    return (A)this;
  }
  
  public A setToEndpointSources(int index,String item) {
    if (this.endpointSources == null) {this.endpointSources = new ArrayList<String>();}
    this.endpointSources.set(index, item); return (A)this;
  }
  
  public A addToEndpointSources(java.lang.String... items) {
    if (this.endpointSources == null) {this.endpointSources = new ArrayList<String>();}
    for (String item : items) {this.endpointSources.add(item);} return (A)this;
  }
  
  public A addAllToEndpointSources(Collection<String> items) {
    if (this.endpointSources == null) {this.endpointSources = new ArrayList<String>();}
    for (String item : items) {this.endpointSources.add(item);} return (A)this;
  }
  
  public A removeFromEndpointSources(java.lang.String... items) {
    if (this.endpointSources == null) return (A)this;
    for (String item : items) { this.endpointSources.remove(item);} return (A)this;
  }
  
  public A removeAllFromEndpointSources(Collection<String> items) {
    if (this.endpointSources == null) return (A)this;
    for (String item : items) { this.endpointSources.remove(item);} return (A)this;
  }
  
  public List<String> getEndpointSources() {
    return this.endpointSources;
  }
  
  public String getEndpointSource(int index) {
    return this.endpointSources.get(index);
  }
  
  public String getFirstEndpointSource() {
    return this.endpointSources.get(0);
  }
  
  public String getLastEndpointSource() {
    return this.endpointSources.get(endpointSources.size() - 1);
  }
  
  public String getMatchingEndpointSource(Predicate<String> predicate) {
      for (String item : endpointSources) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingEndpointSource(Predicate<String> predicate) {
      for (String item : endpointSources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEndpointSources(List<String> endpointSources) {
    if (endpointSources != null) {
        this.endpointSources = new ArrayList();
        for (String item : endpointSources) {
          this.addToEndpointSources(item);
        }
    } else {
      this.endpointSources = null;
    }
    return (A) this;
  }
  
  public A withEndpointSources(java.lang.String... endpointSources) {
    if (this.endpointSources != null) {
        this.endpointSources.clear();
        _visitables.remove("endpointSources");
    }
    if (endpointSources != null) {
      for (String item : endpointSources) {
        this.addToEndpointSources(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEndpointSources() {
    return this.endpointSources != null && !this.endpointSources.isEmpty();
  }
  
  public A addToEventSinks(int index,String item) {
    if (this.eventSinks == null) {this.eventSinks = new ArrayList<String>();}
    this.eventSinks.add(index, item);
    return (A)this;
  }
  
  public A setToEventSinks(int index,String item) {
    if (this.eventSinks == null) {this.eventSinks = new ArrayList<String>();}
    this.eventSinks.set(index, item); return (A)this;
  }
  
  public A addToEventSinks(java.lang.String... items) {
    if (this.eventSinks == null) {this.eventSinks = new ArrayList<String>();}
    for (String item : items) {this.eventSinks.add(item);} return (A)this;
  }
  
  public A addAllToEventSinks(Collection<String> items) {
    if (this.eventSinks == null) {this.eventSinks = new ArrayList<String>();}
    for (String item : items) {this.eventSinks.add(item);} return (A)this;
  }
  
  public A removeFromEventSinks(java.lang.String... items) {
    if (this.eventSinks == null) return (A)this;
    for (String item : items) { this.eventSinks.remove(item);} return (A)this;
  }
  
  public A removeAllFromEventSinks(Collection<String> items) {
    if (this.eventSinks == null) return (A)this;
    for (String item : items) { this.eventSinks.remove(item);} return (A)this;
  }
  
  public List<String> getEventSinks() {
    return this.eventSinks;
  }
  
  public String getEventSink(int index) {
    return this.eventSinks.get(index);
  }
  
  public String getFirstEventSink() {
    return this.eventSinks.get(0);
  }
  
  public String getLastEventSink() {
    return this.eventSinks.get(eventSinks.size() - 1);
  }
  
  public String getMatchingEventSink(Predicate<String> predicate) {
      for (String item : eventSinks) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingEventSink(Predicate<String> predicate) {
      for (String item : eventSinks) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEventSinks(List<String> eventSinks) {
    if (eventSinks != null) {
        this.eventSinks = new ArrayList();
        for (String item : eventSinks) {
          this.addToEventSinks(item);
        }
    } else {
      this.eventSinks = null;
    }
    return (A) this;
  }
  
  public A withEventSinks(java.lang.String... eventSinks) {
    if (this.eventSinks != null) {
        this.eventSinks.clear();
        _visitables.remove("eventSinks");
    }
    if (eventSinks != null) {
      for (String item : eventSinks) {
        this.addToEventSinks(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEventSinks() {
    return this.eventSinks != null && !this.eventSinks.isEmpty();
  }
  
  public A addToEventSources(int index,String item) {
    if (this.eventSources == null) {this.eventSources = new ArrayList<String>();}
    this.eventSources.add(index, item);
    return (A)this;
  }
  
  public A setToEventSources(int index,String item) {
    if (this.eventSources == null) {this.eventSources = new ArrayList<String>();}
    this.eventSources.set(index, item); return (A)this;
  }
  
  public A addToEventSources(java.lang.String... items) {
    if (this.eventSources == null) {this.eventSources = new ArrayList<String>();}
    for (String item : items) {this.eventSources.add(item);} return (A)this;
  }
  
  public A addAllToEventSources(Collection<String> items) {
    if (this.eventSources == null) {this.eventSources = new ArrayList<String>();}
    for (String item : items) {this.eventSources.add(item);} return (A)this;
  }
  
  public A removeFromEventSources(java.lang.String... items) {
    if (this.eventSources == null) return (A)this;
    for (String item : items) { this.eventSources.remove(item);} return (A)this;
  }
  
  public A removeAllFromEventSources(Collection<String> items) {
    if (this.eventSources == null) return (A)this;
    for (String item : items) { this.eventSources.remove(item);} return (A)this;
  }
  
  public List<String> getEventSources() {
    return this.eventSources;
  }
  
  public String getEventSource(int index) {
    return this.eventSources.get(index);
  }
  
  public String getFirstEventSource() {
    return this.eventSources.get(0);
  }
  
  public String getLastEventSource() {
    return this.eventSources.get(eventSources.size() - 1);
  }
  
  public String getMatchingEventSource(Predicate<String> predicate) {
      for (String item : eventSources) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingEventSource(Predicate<String> predicate) {
      for (String item : eventSources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEventSources(List<String> eventSources) {
    if (eventSources != null) {
        this.eventSources = new ArrayList();
        for (String item : eventSources) {
          this.addToEventSources(item);
        }
    } else {
      this.eventSources = null;
    }
    return (A) this;
  }
  
  public A withEventSources(java.lang.String... eventSources) {
    if (this.eventSources != null) {
        this.eventSources.clear();
        _visitables.remove("eventSources");
    }
    if (eventSources != null) {
      for (String item : eventSources) {
        this.addToEventSources(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEventSources() {
    return this.eventSources != null && !this.eventSources.isEmpty();
  }
  
  public Boolean getFilterSourceChannels() {
    return this.filterSourceChannels;
  }
  
  public A withFilterSourceChannels(Boolean filterSourceChannels) {
    this.filterSourceChannels = filterSourceChannels;
    return (A) this;
  }
  
  public boolean hasFilterSourceChannels() {
    return this.filterSourceChannels != null;
  }
  
  public Boolean getNamespaceLabel() {
    return this.namespaceLabel;
  }
  
  public A withNamespaceLabel(Boolean namespaceLabel) {
    this.namespaceLabel = namespaceLabel;
    return (A) this;
  }
  
  public boolean hasNamespaceLabel() {
    return this.namespaceLabel != null;
  }
  
  public Boolean getSinkBinding() {
    return this.sinkBinding;
  }
  
  public A withSinkBinding(Boolean sinkBinding) {
    this.sinkBinding = sinkBinding;
    return (A) this;
  }
  
  public boolean hasSinkBinding() {
    return this.sinkBinding != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KnativeFluent that = (KnativeFluent) o;
    if (!java.util.Objects.equals(auto, that.auto)) return false;
    if (!java.util.Objects.equals(channelSinks, that.channelSinks)) return false;
    if (!java.util.Objects.equals(channelSources, that.channelSources)) return false;
    if (!java.util.Objects.equals(config, that.config)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(endpointSinks, that.endpointSinks)) return false;
    if (!java.util.Objects.equals(endpointSources, that.endpointSources)) return false;
    if (!java.util.Objects.equals(eventSinks, that.eventSinks)) return false;
    if (!java.util.Objects.equals(eventSources, that.eventSources)) return false;
    if (!java.util.Objects.equals(filterSourceChannels, that.filterSourceChannels)) return false;
    if (!java.util.Objects.equals(namespaceLabel, that.namespaceLabel)) return false;
    if (!java.util.Objects.equals(sinkBinding, that.sinkBinding)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(auto,  channelSinks,  channelSources,  config,  configuration,  enabled,  endpointSinks,  endpointSources,  eventSinks,  eventSources,  filterSourceChannels,  namespaceLabel,  sinkBinding,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (auto != null) { sb.append("auto:"); sb.append(auto + ","); }
    if (channelSinks != null && !channelSinks.isEmpty()) { sb.append("channelSinks:"); sb.append(channelSinks + ","); }
    if (channelSources != null && !channelSources.isEmpty()) { sb.append("channelSources:"); sb.append(channelSources + ","); }
    if (config != null) { sb.append("config:"); sb.append(config + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (endpointSinks != null && !endpointSinks.isEmpty()) { sb.append("endpointSinks:"); sb.append(endpointSinks + ","); }
    if (endpointSources != null && !endpointSources.isEmpty()) { sb.append("endpointSources:"); sb.append(endpointSources + ","); }
    if (eventSinks != null && !eventSinks.isEmpty()) { sb.append("eventSinks:"); sb.append(eventSinks + ","); }
    if (eventSources != null && !eventSources.isEmpty()) { sb.append("eventSources:"); sb.append(eventSources + ","); }
    if (filterSourceChannels != null) { sb.append("filterSourceChannels:"); sb.append(filterSourceChannels + ","); }
    if (namespaceLabel != null) { sb.append("namespaceLabel:"); sb.append(namespaceLabel + ","); }
    if (sinkBinding != null) { sb.append("sinkBinding:"); sb.append(sinkBinding); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAuto() {
    return withAuto(true);
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withFilterSourceChannels() {
    return withFilterSourceChannels(true);
  }
  
  public A withNamespaceLabel() {
    return withNamespaceLabel(true);
  }
  
  public A withSinkBinding() {
    return withSinkBinding(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) KnativeFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}