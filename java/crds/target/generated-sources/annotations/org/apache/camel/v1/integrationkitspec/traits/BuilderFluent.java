package org.apache.camel.v1.integrationkitspec.traits;

import org.apache.camel.v1.integrationkitspec.traits.builder.ConfigurationBuilder;
import org.apache.camel.v1.integrationkitspec.traits.builder.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.integrationkitspec.traits.builder.ConfigurationFluent;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class BuilderFluent<A extends BuilderFluent<A>> extends BaseFluent<A>{
  public BuilderFluent() {
  }
  
  public BuilderFluent(Builder instance) {
    this.copyInstance(instance);
  }
  private String baseImage;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private Boolean incrementalImageBuild;
  private String limitCPU;
  private String limitMemory;
  private List<String> mavenProfiles;
  private Map<String,String> nodeSelector;
  private Builder.OrderStrategy orderStrategy;
  private List<String> properties;
  private String requestCPU;
  private String requestMemory;
  private Builder.Strategy strategy;
  private List<String> tasks;
  private List<String> tasksLimitCPU;
  private List<String> tasksLimitMemory;
  private List<String> tasksRequestCPU;
  private List<String> tasksRequestMemory;
  private Boolean verbose;
  
  protected void copyInstance(Builder instance) {
    instance = (instance != null ? instance : new Builder());
    if (instance != null) {
          this.withBaseImage(instance.getBaseImage());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withIncrementalImageBuild(instance.getIncrementalImageBuild());
          this.withLimitCPU(instance.getLimitCPU());
          this.withLimitMemory(instance.getLimitMemory());
          this.withMavenProfiles(instance.getMavenProfiles());
          this.withNodeSelector(instance.getNodeSelector());
          this.withOrderStrategy(instance.getOrderStrategy());
          this.withProperties(instance.getProperties());
          this.withRequestCPU(instance.getRequestCPU());
          this.withRequestMemory(instance.getRequestMemory());
          this.withStrategy(instance.getStrategy());
          this.withTasks(instance.getTasks());
          this.withTasksLimitCPU(instance.getTasksLimitCPU());
          this.withTasksLimitMemory(instance.getTasksLimitMemory());
          this.withTasksRequestCPU(instance.getTasksRequestCPU());
          this.withTasksRequestMemory(instance.getTasksRequestMemory());
          this.withVerbose(instance.getVerbose());
        }
  }
  
  public String getBaseImage() {
    return this.baseImage;
  }
  
  public A withBaseImage(String baseImage) {
    this.baseImage = baseImage;
    return (A) this;
  }
  
  public boolean hasBaseImage() {
    return this.baseImage != null;
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
  
  public Boolean getIncrementalImageBuild() {
    return this.incrementalImageBuild;
  }
  
  public A withIncrementalImageBuild(Boolean incrementalImageBuild) {
    this.incrementalImageBuild = incrementalImageBuild;
    return (A) this;
  }
  
  public boolean hasIncrementalImageBuild() {
    return this.incrementalImageBuild != null;
  }
  
  public String getLimitCPU() {
    return this.limitCPU;
  }
  
  public A withLimitCPU(String limitCPU) {
    this.limitCPU = limitCPU;
    return (A) this;
  }
  
  public boolean hasLimitCPU() {
    return this.limitCPU != null;
  }
  
  public String getLimitMemory() {
    return this.limitMemory;
  }
  
  public A withLimitMemory(String limitMemory) {
    this.limitMemory = limitMemory;
    return (A) this;
  }
  
  public boolean hasLimitMemory() {
    return this.limitMemory != null;
  }
  
  public A addToMavenProfiles(int index,String item) {
    if (this.mavenProfiles == null) {this.mavenProfiles = new ArrayList<String>();}
    this.mavenProfiles.add(index, item);
    return (A)this;
  }
  
  public A setToMavenProfiles(int index,String item) {
    if (this.mavenProfiles == null) {this.mavenProfiles = new ArrayList<String>();}
    this.mavenProfiles.set(index, item); return (A)this;
  }
  
  public A addToMavenProfiles(java.lang.String... items) {
    if (this.mavenProfiles == null) {this.mavenProfiles = new ArrayList<String>();}
    for (String item : items) {this.mavenProfiles.add(item);} return (A)this;
  }
  
  public A addAllToMavenProfiles(Collection<String> items) {
    if (this.mavenProfiles == null) {this.mavenProfiles = new ArrayList<String>();}
    for (String item : items) {this.mavenProfiles.add(item);} return (A)this;
  }
  
  public A removeFromMavenProfiles(java.lang.String... items) {
    if (this.mavenProfiles == null) return (A)this;
    for (String item : items) { this.mavenProfiles.remove(item);} return (A)this;
  }
  
  public A removeAllFromMavenProfiles(Collection<String> items) {
    if (this.mavenProfiles == null) return (A)this;
    for (String item : items) { this.mavenProfiles.remove(item);} return (A)this;
  }
  
  public List<String> getMavenProfiles() {
    return this.mavenProfiles;
  }
  
  public String getMavenProfile(int index) {
    return this.mavenProfiles.get(index);
  }
  
  public String getFirstMavenProfile() {
    return this.mavenProfiles.get(0);
  }
  
  public String getLastMavenProfile() {
    return this.mavenProfiles.get(mavenProfiles.size() - 1);
  }
  
  public String getMatchingMavenProfile(Predicate<String> predicate) {
      for (String item : mavenProfiles) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingMavenProfile(Predicate<String> predicate) {
      for (String item : mavenProfiles) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMavenProfiles(List<String> mavenProfiles) {
    if (mavenProfiles != null) {
        this.mavenProfiles = new ArrayList();
        for (String item : mavenProfiles) {
          this.addToMavenProfiles(item);
        }
    } else {
      this.mavenProfiles = null;
    }
    return (A) this;
  }
  
  public A withMavenProfiles(java.lang.String... mavenProfiles) {
    if (this.mavenProfiles != null) {
        this.mavenProfiles.clear();
        _visitables.remove("mavenProfiles");
    }
    if (mavenProfiles != null) {
      for (String item : mavenProfiles) {
        this.addToMavenProfiles(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMavenProfiles() {
    return this.mavenProfiles != null && !this.mavenProfiles.isEmpty();
  }
  
  public A addToNodeSelector(String key,String value) {
    if(this.nodeSelector == null && key != null && value != null) { this.nodeSelector = new LinkedHashMap(); }
    if(key != null && value != null) {this.nodeSelector.put(key, value);} return (A)this;
  }
  
  public A addToNodeSelector(Map<String,String> map) {
    if(this.nodeSelector == null && map != null) { this.nodeSelector = new LinkedHashMap(); }
    if(map != null) { this.nodeSelector.putAll(map);} return (A)this;
  }
  
  public A removeFromNodeSelector(String key) {
    if(this.nodeSelector == null) { return (A) this; }
    if(key != null && this.nodeSelector != null) {this.nodeSelector.remove(key);} return (A)this;
  }
  
  public A removeFromNodeSelector(Map<String,String> map) {
    if(this.nodeSelector == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.nodeSelector != null){this.nodeSelector.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getNodeSelector() {
    return this.nodeSelector;
  }
  
  public <K,V>A withNodeSelector(Map<String,String> nodeSelector) {
    if (nodeSelector == null) {
      this.nodeSelector = null;
    } else {
      this.nodeSelector = new LinkedHashMap(nodeSelector);
    }
    return (A) this;
  }
  
  public boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }
  
  public Builder.OrderStrategy getOrderStrategy() {
    return this.orderStrategy;
  }
  
  public A withOrderStrategy(Builder.OrderStrategy orderStrategy) {
    this.orderStrategy = orderStrategy;
    return (A) this;
  }
  
  public boolean hasOrderStrategy() {
    return this.orderStrategy != null;
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
  
  public String getRequestCPU() {
    return this.requestCPU;
  }
  
  public A withRequestCPU(String requestCPU) {
    this.requestCPU = requestCPU;
    return (A) this;
  }
  
  public boolean hasRequestCPU() {
    return this.requestCPU != null;
  }
  
  public String getRequestMemory() {
    return this.requestMemory;
  }
  
  public A withRequestMemory(String requestMemory) {
    this.requestMemory = requestMemory;
    return (A) this;
  }
  
  public boolean hasRequestMemory() {
    return this.requestMemory != null;
  }
  
  public Builder.Strategy getStrategy() {
    return this.strategy;
  }
  
  public A withStrategy(Builder.Strategy strategy) {
    this.strategy = strategy;
    return (A) this;
  }
  
  public boolean hasStrategy() {
    return this.strategy != null;
  }
  
  public A addToTasks(int index,String item) {
    if (this.tasks == null) {this.tasks = new ArrayList<String>();}
    this.tasks.add(index, item);
    return (A)this;
  }
  
  public A setToTasks(int index,String item) {
    if (this.tasks == null) {this.tasks = new ArrayList<String>();}
    this.tasks.set(index, item); return (A)this;
  }
  
  public A addToTasks(java.lang.String... items) {
    if (this.tasks == null) {this.tasks = new ArrayList<String>();}
    for (String item : items) {this.tasks.add(item);} return (A)this;
  }
  
  public A addAllToTasks(Collection<String> items) {
    if (this.tasks == null) {this.tasks = new ArrayList<String>();}
    for (String item : items) {this.tasks.add(item);} return (A)this;
  }
  
  public A removeFromTasks(java.lang.String... items) {
    if (this.tasks == null) return (A)this;
    for (String item : items) { this.tasks.remove(item);} return (A)this;
  }
  
  public A removeAllFromTasks(Collection<String> items) {
    if (this.tasks == null) return (A)this;
    for (String item : items) { this.tasks.remove(item);} return (A)this;
  }
  
  public List<String> getTasks() {
    return this.tasks;
  }
  
  public String getTask(int index) {
    return this.tasks.get(index);
  }
  
  public String getFirstTask() {
    return this.tasks.get(0);
  }
  
  public String getLastTask() {
    return this.tasks.get(tasks.size() - 1);
  }
  
  public String getMatchingTask(Predicate<String> predicate) {
      for (String item : tasks) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingTask(Predicate<String> predicate) {
      for (String item : tasks) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTasks(List<String> tasks) {
    if (tasks != null) {
        this.tasks = new ArrayList();
        for (String item : tasks) {
          this.addToTasks(item);
        }
    } else {
      this.tasks = null;
    }
    return (A) this;
  }
  
  public A withTasks(java.lang.String... tasks) {
    if (this.tasks != null) {
        this.tasks.clear();
        _visitables.remove("tasks");
    }
    if (tasks != null) {
      for (String item : tasks) {
        this.addToTasks(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTasks() {
    return this.tasks != null && !this.tasks.isEmpty();
  }
  
  public A addToTasksLimitCPU(int index,String item) {
    if (this.tasksLimitCPU == null) {this.tasksLimitCPU = new ArrayList<String>();}
    this.tasksLimitCPU.add(index, item);
    return (A)this;
  }
  
  public A setToTasksLimitCPU(int index,String item) {
    if (this.tasksLimitCPU == null) {this.tasksLimitCPU = new ArrayList<String>();}
    this.tasksLimitCPU.set(index, item); return (A)this;
  }
  
  public A addToTasksLimitCPU(java.lang.String... items) {
    if (this.tasksLimitCPU == null) {this.tasksLimitCPU = new ArrayList<String>();}
    for (String item : items) {this.tasksLimitCPU.add(item);} return (A)this;
  }
  
  public A addAllToTasksLimitCPU(Collection<String> items) {
    if (this.tasksLimitCPU == null) {this.tasksLimitCPU = new ArrayList<String>();}
    for (String item : items) {this.tasksLimitCPU.add(item);} return (A)this;
  }
  
  public A removeFromTasksLimitCPU(java.lang.String... items) {
    if (this.tasksLimitCPU == null) return (A)this;
    for (String item : items) { this.tasksLimitCPU.remove(item);} return (A)this;
  }
  
  public A removeAllFromTasksLimitCPU(Collection<String> items) {
    if (this.tasksLimitCPU == null) return (A)this;
    for (String item : items) { this.tasksLimitCPU.remove(item);} return (A)this;
  }
  
  public List<String> getTasksLimitCPU() {
    return this.tasksLimitCPU;
  }
  
  public String getTasksLimitCPU(int index) {
    return this.tasksLimitCPU.get(index);
  }
  
  public String getFirstTasksLimitCPU() {
    return this.tasksLimitCPU.get(0);
  }
  
  public String getLastTasksLimitCPU() {
    return this.tasksLimitCPU.get(tasksLimitCPU.size() - 1);
  }
  
  public String getMatchingTasksLimitCPU(Predicate<String> predicate) {
      for (String item : tasksLimitCPU) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingTasksLimitCPU(Predicate<String> predicate) {
      for (String item : tasksLimitCPU) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTasksLimitCPU(List<String> tasksLimitCPU) {
    if (tasksLimitCPU != null) {
        this.tasksLimitCPU = new ArrayList();
        for (String item : tasksLimitCPU) {
          this.addToTasksLimitCPU(item);
        }
    } else {
      this.tasksLimitCPU = null;
    }
    return (A) this;
  }
  
  public A withTasksLimitCPU(java.lang.String... tasksLimitCPU) {
    if (this.tasksLimitCPU != null) {
        this.tasksLimitCPU.clear();
        _visitables.remove("tasksLimitCPU");
    }
    if (tasksLimitCPU != null) {
      for (String item : tasksLimitCPU) {
        this.addToTasksLimitCPU(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTasksLimitCPU() {
    return this.tasksLimitCPU != null && !this.tasksLimitCPU.isEmpty();
  }
  
  public A addToTasksLimitMemory(int index,String item) {
    if (this.tasksLimitMemory == null) {this.tasksLimitMemory = new ArrayList<String>();}
    this.tasksLimitMemory.add(index, item);
    return (A)this;
  }
  
  public A setToTasksLimitMemory(int index,String item) {
    if (this.tasksLimitMemory == null) {this.tasksLimitMemory = new ArrayList<String>();}
    this.tasksLimitMemory.set(index, item); return (A)this;
  }
  
  public A addToTasksLimitMemory(java.lang.String... items) {
    if (this.tasksLimitMemory == null) {this.tasksLimitMemory = new ArrayList<String>();}
    for (String item : items) {this.tasksLimitMemory.add(item);} return (A)this;
  }
  
  public A addAllToTasksLimitMemory(Collection<String> items) {
    if (this.tasksLimitMemory == null) {this.tasksLimitMemory = new ArrayList<String>();}
    for (String item : items) {this.tasksLimitMemory.add(item);} return (A)this;
  }
  
  public A removeFromTasksLimitMemory(java.lang.String... items) {
    if (this.tasksLimitMemory == null) return (A)this;
    for (String item : items) { this.tasksLimitMemory.remove(item);} return (A)this;
  }
  
  public A removeAllFromTasksLimitMemory(Collection<String> items) {
    if (this.tasksLimitMemory == null) return (A)this;
    for (String item : items) { this.tasksLimitMemory.remove(item);} return (A)this;
  }
  
  public List<String> getTasksLimitMemory() {
    return this.tasksLimitMemory;
  }
  
  public String getTasksLimitMemory(int index) {
    return this.tasksLimitMemory.get(index);
  }
  
  public String getFirstTasksLimitMemory() {
    return this.tasksLimitMemory.get(0);
  }
  
  public String getLastTasksLimitMemory() {
    return this.tasksLimitMemory.get(tasksLimitMemory.size() - 1);
  }
  
  public String getMatchingTasksLimitMemory(Predicate<String> predicate) {
      for (String item : tasksLimitMemory) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingTasksLimitMemory(Predicate<String> predicate) {
      for (String item : tasksLimitMemory) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTasksLimitMemory(List<String> tasksLimitMemory) {
    if (tasksLimitMemory != null) {
        this.tasksLimitMemory = new ArrayList();
        for (String item : tasksLimitMemory) {
          this.addToTasksLimitMemory(item);
        }
    } else {
      this.tasksLimitMemory = null;
    }
    return (A) this;
  }
  
  public A withTasksLimitMemory(java.lang.String... tasksLimitMemory) {
    if (this.tasksLimitMemory != null) {
        this.tasksLimitMemory.clear();
        _visitables.remove("tasksLimitMemory");
    }
    if (tasksLimitMemory != null) {
      for (String item : tasksLimitMemory) {
        this.addToTasksLimitMemory(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTasksLimitMemory() {
    return this.tasksLimitMemory != null && !this.tasksLimitMemory.isEmpty();
  }
  
  public A addToTasksRequestCPU(int index,String item) {
    if (this.tasksRequestCPU == null) {this.tasksRequestCPU = new ArrayList<String>();}
    this.tasksRequestCPU.add(index, item);
    return (A)this;
  }
  
  public A setToTasksRequestCPU(int index,String item) {
    if (this.tasksRequestCPU == null) {this.tasksRequestCPU = new ArrayList<String>();}
    this.tasksRequestCPU.set(index, item); return (A)this;
  }
  
  public A addToTasksRequestCPU(java.lang.String... items) {
    if (this.tasksRequestCPU == null) {this.tasksRequestCPU = new ArrayList<String>();}
    for (String item : items) {this.tasksRequestCPU.add(item);} return (A)this;
  }
  
  public A addAllToTasksRequestCPU(Collection<String> items) {
    if (this.tasksRequestCPU == null) {this.tasksRequestCPU = new ArrayList<String>();}
    for (String item : items) {this.tasksRequestCPU.add(item);} return (A)this;
  }
  
  public A removeFromTasksRequestCPU(java.lang.String... items) {
    if (this.tasksRequestCPU == null) return (A)this;
    for (String item : items) { this.tasksRequestCPU.remove(item);} return (A)this;
  }
  
  public A removeAllFromTasksRequestCPU(Collection<String> items) {
    if (this.tasksRequestCPU == null) return (A)this;
    for (String item : items) { this.tasksRequestCPU.remove(item);} return (A)this;
  }
  
  public List<String> getTasksRequestCPU() {
    return this.tasksRequestCPU;
  }
  
  public String getTasksRequestCPU(int index) {
    return this.tasksRequestCPU.get(index);
  }
  
  public String getFirstTasksRequestCPU() {
    return this.tasksRequestCPU.get(0);
  }
  
  public String getLastTasksRequestCPU() {
    return this.tasksRequestCPU.get(tasksRequestCPU.size() - 1);
  }
  
  public String getMatchingTasksRequestCPU(Predicate<String> predicate) {
      for (String item : tasksRequestCPU) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingTasksRequestCPU(Predicate<String> predicate) {
      for (String item : tasksRequestCPU) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTasksRequestCPU(List<String> tasksRequestCPU) {
    if (tasksRequestCPU != null) {
        this.tasksRequestCPU = new ArrayList();
        for (String item : tasksRequestCPU) {
          this.addToTasksRequestCPU(item);
        }
    } else {
      this.tasksRequestCPU = null;
    }
    return (A) this;
  }
  
  public A withTasksRequestCPU(java.lang.String... tasksRequestCPU) {
    if (this.tasksRequestCPU != null) {
        this.tasksRequestCPU.clear();
        _visitables.remove("tasksRequestCPU");
    }
    if (tasksRequestCPU != null) {
      for (String item : tasksRequestCPU) {
        this.addToTasksRequestCPU(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTasksRequestCPU() {
    return this.tasksRequestCPU != null && !this.tasksRequestCPU.isEmpty();
  }
  
  public A addToTasksRequestMemory(int index,String item) {
    if (this.tasksRequestMemory == null) {this.tasksRequestMemory = new ArrayList<String>();}
    this.tasksRequestMemory.add(index, item);
    return (A)this;
  }
  
  public A setToTasksRequestMemory(int index,String item) {
    if (this.tasksRequestMemory == null) {this.tasksRequestMemory = new ArrayList<String>();}
    this.tasksRequestMemory.set(index, item); return (A)this;
  }
  
  public A addToTasksRequestMemory(java.lang.String... items) {
    if (this.tasksRequestMemory == null) {this.tasksRequestMemory = new ArrayList<String>();}
    for (String item : items) {this.tasksRequestMemory.add(item);} return (A)this;
  }
  
  public A addAllToTasksRequestMemory(Collection<String> items) {
    if (this.tasksRequestMemory == null) {this.tasksRequestMemory = new ArrayList<String>();}
    for (String item : items) {this.tasksRequestMemory.add(item);} return (A)this;
  }
  
  public A removeFromTasksRequestMemory(java.lang.String... items) {
    if (this.tasksRequestMemory == null) return (A)this;
    for (String item : items) { this.tasksRequestMemory.remove(item);} return (A)this;
  }
  
  public A removeAllFromTasksRequestMemory(Collection<String> items) {
    if (this.tasksRequestMemory == null) return (A)this;
    for (String item : items) { this.tasksRequestMemory.remove(item);} return (A)this;
  }
  
  public List<String> getTasksRequestMemory() {
    return this.tasksRequestMemory;
  }
  
  public String getTasksRequestMemory(int index) {
    return this.tasksRequestMemory.get(index);
  }
  
  public String getFirstTasksRequestMemory() {
    return this.tasksRequestMemory.get(0);
  }
  
  public String getLastTasksRequestMemory() {
    return this.tasksRequestMemory.get(tasksRequestMemory.size() - 1);
  }
  
  public String getMatchingTasksRequestMemory(Predicate<String> predicate) {
      for (String item : tasksRequestMemory) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingTasksRequestMemory(Predicate<String> predicate) {
      for (String item : tasksRequestMemory) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTasksRequestMemory(List<String> tasksRequestMemory) {
    if (tasksRequestMemory != null) {
        this.tasksRequestMemory = new ArrayList();
        for (String item : tasksRequestMemory) {
          this.addToTasksRequestMemory(item);
        }
    } else {
      this.tasksRequestMemory = null;
    }
    return (A) this;
  }
  
  public A withTasksRequestMemory(java.lang.String... tasksRequestMemory) {
    if (this.tasksRequestMemory != null) {
        this.tasksRequestMemory.clear();
        _visitables.remove("tasksRequestMemory");
    }
    if (tasksRequestMemory != null) {
      for (String item : tasksRequestMemory) {
        this.addToTasksRequestMemory(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTasksRequestMemory() {
    return this.tasksRequestMemory != null && !this.tasksRequestMemory.isEmpty();
  }
  
  public Boolean getVerbose() {
    return this.verbose;
  }
  
  public A withVerbose(Boolean verbose) {
    this.verbose = verbose;
    return (A) this;
  }
  
  public boolean hasVerbose() {
    return this.verbose != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    BuilderFluent that = (BuilderFluent) o;
    if (!java.util.Objects.equals(baseImage, that.baseImage)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(incrementalImageBuild, that.incrementalImageBuild)) return false;
    if (!java.util.Objects.equals(limitCPU, that.limitCPU)) return false;
    if (!java.util.Objects.equals(limitMemory, that.limitMemory)) return false;
    if (!java.util.Objects.equals(mavenProfiles, that.mavenProfiles)) return false;
    if (!java.util.Objects.equals(nodeSelector, that.nodeSelector)) return false;
    if (!java.util.Objects.equals(orderStrategy, that.orderStrategy)) return false;
    if (!java.util.Objects.equals(properties, that.properties)) return false;
    if (!java.util.Objects.equals(requestCPU, that.requestCPU)) return false;
    if (!java.util.Objects.equals(requestMemory, that.requestMemory)) return false;
    if (!java.util.Objects.equals(strategy, that.strategy)) return false;
    if (!java.util.Objects.equals(tasks, that.tasks)) return false;
    if (!java.util.Objects.equals(tasksLimitCPU, that.tasksLimitCPU)) return false;
    if (!java.util.Objects.equals(tasksLimitMemory, that.tasksLimitMemory)) return false;
    if (!java.util.Objects.equals(tasksRequestCPU, that.tasksRequestCPU)) return false;
    if (!java.util.Objects.equals(tasksRequestMemory, that.tasksRequestMemory)) return false;
    if (!java.util.Objects.equals(verbose, that.verbose)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(baseImage,  configuration,  enabled,  incrementalImageBuild,  limitCPU,  limitMemory,  mavenProfiles,  nodeSelector,  orderStrategy,  properties,  requestCPU,  requestMemory,  strategy,  tasks,  tasksLimitCPU,  tasksLimitMemory,  tasksRequestCPU,  tasksRequestMemory,  verbose,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (baseImage != null) { sb.append("baseImage:"); sb.append(baseImage + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (incrementalImageBuild != null) { sb.append("incrementalImageBuild:"); sb.append(incrementalImageBuild + ","); }
    if (limitCPU != null) { sb.append("limitCPU:"); sb.append(limitCPU + ","); }
    if (limitMemory != null) { sb.append("limitMemory:"); sb.append(limitMemory + ","); }
    if (mavenProfiles != null && !mavenProfiles.isEmpty()) { sb.append("mavenProfiles:"); sb.append(mavenProfiles + ","); }
    if (nodeSelector != null && !nodeSelector.isEmpty()) { sb.append("nodeSelector:"); sb.append(nodeSelector + ","); }
    if (orderStrategy != null) { sb.append("orderStrategy:"); sb.append(orderStrategy + ","); }
    if (properties != null && !properties.isEmpty()) { sb.append("properties:"); sb.append(properties + ","); }
    if (requestCPU != null) { sb.append("requestCPU:"); sb.append(requestCPU + ","); }
    if (requestMemory != null) { sb.append("requestMemory:"); sb.append(requestMemory + ","); }
    if (strategy != null) { sb.append("strategy:"); sb.append(strategy + ","); }
    if (tasks != null && !tasks.isEmpty()) { sb.append("tasks:"); sb.append(tasks + ","); }
    if (tasksLimitCPU != null && !tasksLimitCPU.isEmpty()) { sb.append("tasksLimitCPU:"); sb.append(tasksLimitCPU + ","); }
    if (tasksLimitMemory != null && !tasksLimitMemory.isEmpty()) { sb.append("tasksLimitMemory:"); sb.append(tasksLimitMemory + ","); }
    if (tasksRequestCPU != null && !tasksRequestCPU.isEmpty()) { sb.append("tasksRequestCPU:"); sb.append(tasksRequestCPU + ","); }
    if (tasksRequestMemory != null && !tasksRequestMemory.isEmpty()) { sb.append("tasksRequestMemory:"); sb.append(tasksRequestMemory + ","); }
    if (verbose != null) { sb.append("verbose:"); sb.append(verbose); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withIncrementalImageBuild() {
    return withIncrementalImageBuild(true);
  }
  
  public A withVerbose() {
    return withVerbose(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) BuilderFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}