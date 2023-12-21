package org.apache.camel.v1;

import org.apache.camel.v1.integrationstatus.ConfigurationBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.integrationstatus.Configuration;
import java.lang.SuppressWarnings;
import org.apache.camel.v1.integrationstatus.IntegrationKitBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.integrationstatus.ConditionsFluent;
import org.apache.camel.v1.integrationstatus.IntegrationKitFluent;
import java.lang.String;
import org.apache.camel.v1.integrationstatus.ConfigurationFluent;
import org.apache.camel.v1.integrationstatus.Conditions;
import java.util.function.Predicate;
import org.apache.camel.v1.integrationstatus.GeneratedSourcesBuilder;
import java.time.ZonedDateTime;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import org.apache.camel.v1.integrationstatus.GeneratedSourcesFluent;
import org.apache.camel.v1.integrationstatus.IntegrationKit;
import org.apache.camel.v1.integrationstatus.ConditionsBuilder;
import java.lang.Integer;
import org.apache.camel.v1.integrationstatus.GeneratedSources;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class IntegrationStatusFluent<A extends IntegrationStatusFluent<A>> extends BaseFluent<A>{
  public IntegrationStatusFluent() {
  }
  
  public IntegrationStatusFluent(IntegrationStatus instance) {
    this.copyInstance(instance);
  }
  private List<String> capabilities;
  private ArrayList<ConditionsBuilder> conditions;
  private ArrayList<ConfigurationBuilder> configuration;
  private List<String> dependencies;
  private String digest;
  private ArrayList<GeneratedSourcesBuilder> generatedSources;
  private String image;
  private IntegrationKitBuilder integrationKit;
  private ZonedDateTime lastInitTimestamp;
  private Long observedGeneration;
  private String phase;
  private String platform;
  private String profile;
  private Integer replicas;
  private String runtimeProvider;
  private String runtimeVersion;
  private String selector;
  private String version;
  
  protected void copyInstance(IntegrationStatus instance) {
    instance = (instance != null ? instance : new IntegrationStatus());
    if (instance != null) {
          this.withCapabilities(instance.getCapabilities());
          this.withConditions(instance.getConditions());
          this.withConfiguration(instance.getConfiguration());
          this.withDependencies(instance.getDependencies());
          this.withDigest(instance.getDigest());
          this.withGeneratedSources(instance.getGeneratedSources());
          this.withImage(instance.getImage());
          this.withIntegrationKit(instance.getIntegrationKit());
          this.withLastInitTimestamp(instance.getLastInitTimestamp());
          this.withObservedGeneration(instance.getObservedGeneration());
          this.withPhase(instance.getPhase());
          this.withPlatform(instance.getPlatform());
          this.withProfile(instance.getProfile());
          this.withReplicas(instance.getReplicas());
          this.withRuntimeProvider(instance.getRuntimeProvider());
          this.withRuntimeVersion(instance.getRuntimeVersion());
          this.withSelector(instance.getSelector());
          this.withVersion(instance.getVersion());
        }
  }
  
  public A addToCapabilities(int index,String item) {
    if (this.capabilities == null) {this.capabilities = new ArrayList<String>();}
    this.capabilities.add(index, item);
    return (A)this;
  }
  
  public A setToCapabilities(int index,String item) {
    if (this.capabilities == null) {this.capabilities = new ArrayList<String>();}
    this.capabilities.set(index, item); return (A)this;
  }
  
  public A addToCapabilities(java.lang.String... items) {
    if (this.capabilities == null) {this.capabilities = new ArrayList<String>();}
    for (String item : items) {this.capabilities.add(item);} return (A)this;
  }
  
  public A addAllToCapabilities(Collection<String> items) {
    if (this.capabilities == null) {this.capabilities = new ArrayList<String>();}
    for (String item : items) {this.capabilities.add(item);} return (A)this;
  }
  
  public A removeFromCapabilities(java.lang.String... items) {
    if (this.capabilities == null) return (A)this;
    for (String item : items) { this.capabilities.remove(item);} return (A)this;
  }
  
  public A removeAllFromCapabilities(Collection<String> items) {
    if (this.capabilities == null) return (A)this;
    for (String item : items) { this.capabilities.remove(item);} return (A)this;
  }
  
  public List<String> getCapabilities() {
    return this.capabilities;
  }
  
  public String getCapability(int index) {
    return this.capabilities.get(index);
  }
  
  public String getFirstCapability() {
    return this.capabilities.get(0);
  }
  
  public String getLastCapability() {
    return this.capabilities.get(capabilities.size() - 1);
  }
  
  public String getMatchingCapability(Predicate<String> predicate) {
      for (String item : capabilities) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingCapability(Predicate<String> predicate) {
      for (String item : capabilities) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withCapabilities(List<String> capabilities) {
    if (capabilities != null) {
        this.capabilities = new ArrayList();
        for (String item : capabilities) {
          this.addToCapabilities(item);
        }
    } else {
      this.capabilities = null;
    }
    return (A) this;
  }
  
  public A withCapabilities(java.lang.String... capabilities) {
    if (this.capabilities != null) {
        this.capabilities.clear();
        _visitables.remove("capabilities");
    }
    if (capabilities != null) {
      for (String item : capabilities) {
        this.addToCapabilities(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasCapabilities() {
    return this.capabilities != null && !this.capabilities.isEmpty();
  }
  
  public A addToConditions(int index,Conditions item) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    ConditionsBuilder builder = new ConditionsBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,Conditions item) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    ConditionsBuilder builder = new ConditionsBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(org.apache.camel.v1.integrationstatus.Conditions... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToIntegrationstatusConditions(Collection<Conditions> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(org.apache.camel.v1.integrationstatus.Conditions... items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIntegrationstatusConditions(Collection<Conditions> items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIntegrationstatusConditions(Predicate<ConditionsBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<ConditionsBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      ConditionsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Conditions> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public Conditions buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public Conditions buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public Conditions buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public Conditions buildMatchingCondition(Predicate<ConditionsBuilder> predicate) {
      for (ConditionsBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<ConditionsBuilder> predicate) {
      for (ConditionsBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<Conditions> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (Conditions item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(org.apache.camel.v1.integrationstatus.Conditions... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (Conditions item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !this.conditions.isEmpty();
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(Conditions item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,Conditions item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<ConditionsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public A addToConfiguration(int index,Configuration item) {
    if (this.configuration == null) {this.configuration = new ArrayList<ConfigurationBuilder>();}
    ConfigurationBuilder builder = new ConfigurationBuilder(item);
    if (index < 0 || index >= configuration.size()) { _visitables.get("configuration").add(builder); configuration.add(builder); } else { _visitables.get("configuration").add(index, builder); configuration.add(index, builder);}
    return (A)this;
  }
  
  public A setToConfiguration(int index,Configuration item) {
    if (this.configuration == null) {this.configuration = new ArrayList<ConfigurationBuilder>();}
    ConfigurationBuilder builder = new ConfigurationBuilder(item);
    if (index < 0 || index >= configuration.size()) { _visitables.get("configuration").add(builder); configuration.add(builder); } else { _visitables.get("configuration").set(index, builder); configuration.set(index, builder);}
    return (A)this;
  }
  
  public A addToConfiguration(org.apache.camel.v1.integrationstatus.Configuration... items) {
    if (this.configuration == null) {this.configuration = new ArrayList<ConfigurationBuilder>();}
    for (Configuration item : items) {ConfigurationBuilder builder = new ConfigurationBuilder(item);_visitables.get("configuration").add(builder);this.configuration.add(builder);} return (A)this;
  }
  
  public A addAllToConfiguration(Collection<Configuration> items) {
    if (this.configuration == null) {this.configuration = new ArrayList<ConfigurationBuilder>();}
    for (Configuration item : items) {ConfigurationBuilder builder = new ConfigurationBuilder(item);_visitables.get("configuration").add(builder);this.configuration.add(builder);} return (A)this;
  }
  
  public A removeFromConfiguration(org.apache.camel.v1.integrationstatus.Configuration... items) {
    if (this.configuration == null) return (A)this;
    for (Configuration item : items) {ConfigurationBuilder builder = new ConfigurationBuilder(item);_visitables.get("configuration").remove(builder); this.configuration.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConfiguration(Collection<Configuration> items) {
    if (this.configuration == null) return (A)this;
    for (Configuration item : items) {ConfigurationBuilder builder = new ConfigurationBuilder(item);_visitables.get("configuration").remove(builder); this.configuration.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConfiguration(Predicate<ConfigurationBuilder> predicate) {
    if (configuration == null) return (A) this;
    final Iterator<ConfigurationBuilder> each = configuration.iterator();
    final List visitables = _visitables.get("configuration");
    while (each.hasNext()) {
      ConfigurationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Configuration> buildConfiguration() {
    return this.configuration != null ? build(configuration) : null;
  }
  
  public Configuration buildConfiguration(int index) {
    return this.configuration.get(index).build();
  }
  
  public Configuration buildFirstConfiguration() {
    return this.configuration.get(0).build();
  }
  
  public Configuration buildLastConfiguration() {
    return this.configuration.get(configuration.size() - 1).build();
  }
  
  public Configuration buildMatchingConfiguration(Predicate<ConfigurationBuilder> predicate) {
      for (ConfigurationBuilder item : configuration) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConfiguration(Predicate<ConfigurationBuilder> predicate) {
      for (ConfigurationBuilder item : configuration) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConfiguration(List<Configuration> configuration) {
    if (this.configuration != null) {
      this._visitables.get("configuration").clear();
    }
    if (configuration != null) {
        this.configuration = new ArrayList();
        for (Configuration item : configuration) {
          this.addToConfiguration(item);
        }
    } else {
      this.configuration = null;
    }
    return (A) this;
  }
  
  public A withConfiguration(org.apache.camel.v1.integrationstatus.Configuration... configuration) {
    if (this.configuration != null) {
        this.configuration.clear();
        _visitables.remove("configuration");
    }
    if (configuration != null) {
      for (Configuration item : configuration) {
        this.addToConfiguration(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConfiguration() {
    return this.configuration != null && !this.configuration.isEmpty();
  }
  
  public ConfigurationNested<A> addNewConfiguration() {
    return new ConfigurationNested(-1, null);
  }
  
  public ConfigurationNested<A> addNewConfigurationLike(Configuration item) {
    return new ConfigurationNested(-1, item);
  }
  
  public ConfigurationNested<A> setNewConfigurationLike(int index,Configuration item) {
    return new ConfigurationNested(index, item);
  }
  
  public ConfigurationNested<A> editConfiguration(int index) {
    if (configuration.size() <= index) throw new RuntimeException("Can't edit configuration. Index exceeds size.");
    return setNewConfigurationLike(index, buildConfiguration(index));
  }
  
  public ConfigurationNested<A> editFirstConfiguration() {
    if (configuration.size() == 0) throw new RuntimeException("Can't edit first configuration. The list is empty.");
    return setNewConfigurationLike(0, buildConfiguration(0));
  }
  
  public ConfigurationNested<A> editLastConfiguration() {
    int index = configuration.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last configuration. The list is empty.");
    return setNewConfigurationLike(index, buildConfiguration(index));
  }
  
  public ConfigurationNested<A> editMatchingConfiguration(Predicate<ConfigurationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<configuration.size();i++) { 
    if (predicate.test(configuration.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching configuration. No match found.");
    return setNewConfigurationLike(index, buildConfiguration(index));
  }
  
  public A addToDependencies(int index,String item) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<String>();}
    this.dependencies.add(index, item);
    return (A)this;
  }
  
  public A setToDependencies(int index,String item) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<String>();}
    this.dependencies.set(index, item); return (A)this;
  }
  
  public A addToDependencies(java.lang.String... items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<String>();}
    for (String item : items) {this.dependencies.add(item);} return (A)this;
  }
  
  public A addAllToDependencies(Collection<String> items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<String>();}
    for (String item : items) {this.dependencies.add(item);} return (A)this;
  }
  
  public A removeFromDependencies(java.lang.String... items) {
    if (this.dependencies == null) return (A)this;
    for (String item : items) { this.dependencies.remove(item);} return (A)this;
  }
  
  public A removeAllFromDependencies(Collection<String> items) {
    if (this.dependencies == null) return (A)this;
    for (String item : items) { this.dependencies.remove(item);} return (A)this;
  }
  
  public List<String> getDependencies() {
    return this.dependencies;
  }
  
  public String getDependency(int index) {
    return this.dependencies.get(index);
  }
  
  public String getFirstDependency() {
    return this.dependencies.get(0);
  }
  
  public String getLastDependency() {
    return this.dependencies.get(dependencies.size() - 1);
  }
  
  public String getMatchingDependency(Predicate<String> predicate) {
      for (String item : dependencies) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingDependency(Predicate<String> predicate) {
      for (String item : dependencies) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDependencies(List<String> dependencies) {
    if (dependencies != null) {
        this.dependencies = new ArrayList();
        for (String item : dependencies) {
          this.addToDependencies(item);
        }
    } else {
      this.dependencies = null;
    }
    return (A) this;
  }
  
  public A withDependencies(java.lang.String... dependencies) {
    if (this.dependencies != null) {
        this.dependencies.clear();
        _visitables.remove("dependencies");
    }
    if (dependencies != null) {
      for (String item : dependencies) {
        this.addToDependencies(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDependencies() {
    return this.dependencies != null && !this.dependencies.isEmpty();
  }
  
  public String getDigest() {
    return this.digest;
  }
  
  public A withDigest(String digest) {
    this.digest = digest;
    return (A) this;
  }
  
  public boolean hasDigest() {
    return this.digest != null;
  }
  
  public A addToGeneratedSources(int index,GeneratedSources item) {
    if (this.generatedSources == null) {this.generatedSources = new ArrayList<GeneratedSourcesBuilder>();}
    GeneratedSourcesBuilder builder = new GeneratedSourcesBuilder(item);
    if (index < 0 || index >= generatedSources.size()) { _visitables.get("generatedSources").add(builder); generatedSources.add(builder); } else { _visitables.get("generatedSources").add(index, builder); generatedSources.add(index, builder);}
    return (A)this;
  }
  
  public A setToGeneratedSources(int index,GeneratedSources item) {
    if (this.generatedSources == null) {this.generatedSources = new ArrayList<GeneratedSourcesBuilder>();}
    GeneratedSourcesBuilder builder = new GeneratedSourcesBuilder(item);
    if (index < 0 || index >= generatedSources.size()) { _visitables.get("generatedSources").add(builder); generatedSources.add(builder); } else { _visitables.get("generatedSources").set(index, builder); generatedSources.set(index, builder);}
    return (A)this;
  }
  
  public A addToGeneratedSources(org.apache.camel.v1.integrationstatus.GeneratedSources... items) {
    if (this.generatedSources == null) {this.generatedSources = new ArrayList<GeneratedSourcesBuilder>();}
    for (GeneratedSources item : items) {GeneratedSourcesBuilder builder = new GeneratedSourcesBuilder(item);_visitables.get("generatedSources").add(builder);this.generatedSources.add(builder);} return (A)this;
  }
  
  public A addAllToGeneratedSources(Collection<GeneratedSources> items) {
    if (this.generatedSources == null) {this.generatedSources = new ArrayList<GeneratedSourcesBuilder>();}
    for (GeneratedSources item : items) {GeneratedSourcesBuilder builder = new GeneratedSourcesBuilder(item);_visitables.get("generatedSources").add(builder);this.generatedSources.add(builder);} return (A)this;
  }
  
  public A removeFromGeneratedSources(org.apache.camel.v1.integrationstatus.GeneratedSources... items) {
    if (this.generatedSources == null) return (A)this;
    for (GeneratedSources item : items) {GeneratedSourcesBuilder builder = new GeneratedSourcesBuilder(item);_visitables.get("generatedSources").remove(builder); this.generatedSources.remove(builder);} return (A)this;
  }
  
  public A removeAllFromGeneratedSources(Collection<GeneratedSources> items) {
    if (this.generatedSources == null) return (A)this;
    for (GeneratedSources item : items) {GeneratedSourcesBuilder builder = new GeneratedSourcesBuilder(item);_visitables.get("generatedSources").remove(builder); this.generatedSources.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromGeneratedSources(Predicate<GeneratedSourcesBuilder> predicate) {
    if (generatedSources == null) return (A) this;
    final Iterator<GeneratedSourcesBuilder> each = generatedSources.iterator();
    final List visitables = _visitables.get("generatedSources");
    while (each.hasNext()) {
      GeneratedSourcesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<GeneratedSources> buildGeneratedSources() {
    return this.generatedSources != null ? build(generatedSources) : null;
  }
  
  public GeneratedSources buildGeneratedSource(int index) {
    return this.generatedSources.get(index).build();
  }
  
  public GeneratedSources buildFirstGeneratedSource() {
    return this.generatedSources.get(0).build();
  }
  
  public GeneratedSources buildLastGeneratedSource() {
    return this.generatedSources.get(generatedSources.size() - 1).build();
  }
  
  public GeneratedSources buildMatchingGeneratedSource(Predicate<GeneratedSourcesBuilder> predicate) {
      for (GeneratedSourcesBuilder item : generatedSources) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingGeneratedSource(Predicate<GeneratedSourcesBuilder> predicate) {
      for (GeneratedSourcesBuilder item : generatedSources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withGeneratedSources(List<GeneratedSources> generatedSources) {
    if (this.generatedSources != null) {
      this._visitables.get("generatedSources").clear();
    }
    if (generatedSources != null) {
        this.generatedSources = new ArrayList();
        for (GeneratedSources item : generatedSources) {
          this.addToGeneratedSources(item);
        }
    } else {
      this.generatedSources = null;
    }
    return (A) this;
  }
  
  public A withGeneratedSources(org.apache.camel.v1.integrationstatus.GeneratedSources... generatedSources) {
    if (this.generatedSources != null) {
        this.generatedSources.clear();
        _visitables.remove("generatedSources");
    }
    if (generatedSources != null) {
      for (GeneratedSources item : generatedSources) {
        this.addToGeneratedSources(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasGeneratedSources() {
    return this.generatedSources != null && !this.generatedSources.isEmpty();
  }
  
  public GeneratedSourcesNested<A> addNewGeneratedSource() {
    return new GeneratedSourcesNested(-1, null);
  }
  
  public GeneratedSourcesNested<A> addNewGeneratedSourceLike(GeneratedSources item) {
    return new GeneratedSourcesNested(-1, item);
  }
  
  public GeneratedSourcesNested<A> setNewGeneratedSourceLike(int index,GeneratedSources item) {
    return new GeneratedSourcesNested(index, item);
  }
  
  public GeneratedSourcesNested<A> editGeneratedSource(int index) {
    if (generatedSources.size() <= index) throw new RuntimeException("Can't edit generatedSources. Index exceeds size.");
    return setNewGeneratedSourceLike(index, buildGeneratedSource(index));
  }
  
  public GeneratedSourcesNested<A> editFirstGeneratedSource() {
    if (generatedSources.size() == 0) throw new RuntimeException("Can't edit first generatedSources. The list is empty.");
    return setNewGeneratedSourceLike(0, buildGeneratedSource(0));
  }
  
  public GeneratedSourcesNested<A> editLastGeneratedSource() {
    int index = generatedSources.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last generatedSources. The list is empty.");
    return setNewGeneratedSourceLike(index, buildGeneratedSource(index));
  }
  
  public GeneratedSourcesNested<A> editMatchingGeneratedSource(Predicate<GeneratedSourcesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<generatedSources.size();i++) { 
    if (predicate.test(generatedSources.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching generatedSources. No match found.");
    return setNewGeneratedSourceLike(index, buildGeneratedSource(index));
  }
  
  public String getImage() {
    return this.image;
  }
  
  public A withImage(String image) {
    this.image = image;
    return (A) this;
  }
  
  public boolean hasImage() {
    return this.image != null;
  }
  
  public IntegrationKit buildIntegrationKit() {
    return this.integrationKit != null ? this.integrationKit.build() : null;
  }
  
  public A withIntegrationKit(IntegrationKit integrationKit) {
    this._visitables.remove("integrationKit");
    if (integrationKit != null) {
        this.integrationKit = new IntegrationKitBuilder(integrationKit);
        this._visitables.get("integrationKit").add(this.integrationKit);
    } else {
        this.integrationKit = null;
        this._visitables.get("integrationKit").remove(this.integrationKit);
    }
    return (A) this;
  }
  
  public boolean hasIntegrationKit() {
    return this.integrationKit != null;
  }
  
  public IntegrationKitNested<A> withNewIntegrationKit() {
    return new IntegrationKitNested(null);
  }
  
  public IntegrationKitNested<A> withNewIntegrationKitLike(IntegrationKit item) {
    return new IntegrationKitNested(item);
  }
  
  public IntegrationKitNested<A> editIntegrationstatusIntegrationKit() {
    return withNewIntegrationKitLike(java.util.Optional.ofNullable(buildIntegrationKit()).orElse(null));
  }
  
  public IntegrationKitNested<A> editOrNewIntegrationKit() {
    return withNewIntegrationKitLike(java.util.Optional.ofNullable(buildIntegrationKit()).orElse(new IntegrationKitBuilder().build()));
  }
  
  public IntegrationKitNested<A> editOrNewIntegrationKitLike(IntegrationKit item) {
    return withNewIntegrationKitLike(java.util.Optional.ofNullable(buildIntegrationKit()).orElse(item));
  }
  
  public ZonedDateTime getLastInitTimestamp() {
    return this.lastInitTimestamp;
  }
  
  public A withLastInitTimestamp(ZonedDateTime lastInitTimestamp) {
    this.lastInitTimestamp = lastInitTimestamp;
    return (A) this;
  }
  
  public boolean hasLastInitTimestamp() {
    return this.lastInitTimestamp != null;
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  
  public boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  
  public String getPhase() {
    return this.phase;
  }
  
  public A withPhase(String phase) {
    this.phase = phase;
    return (A) this;
  }
  
  public boolean hasPhase() {
    return this.phase != null;
  }
  
  public String getPlatform() {
    return this.platform;
  }
  
  public A withPlatform(String platform) {
    this.platform = platform;
    return (A) this;
  }
  
  public boolean hasPlatform() {
    return this.platform != null;
  }
  
  public String getProfile() {
    return this.profile;
  }
  
  public A withProfile(String profile) {
    this.profile = profile;
    return (A) this;
  }
  
  public boolean hasProfile() {
    return this.profile != null;
  }
  
  public Integer getReplicas() {
    return this.replicas;
  }
  
  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
  }
  
  public String getRuntimeProvider() {
    return this.runtimeProvider;
  }
  
  public A withRuntimeProvider(String runtimeProvider) {
    this.runtimeProvider = runtimeProvider;
    return (A) this;
  }
  
  public boolean hasRuntimeProvider() {
    return this.runtimeProvider != null;
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
  
  public String getSelector() {
    return this.selector;
  }
  
  public A withSelector(String selector) {
    this.selector = selector;
    return (A) this;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    IntegrationStatusFluent that = (IntegrationStatusFluent) o;
    if (!java.util.Objects.equals(capabilities, that.capabilities)) return false;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(dependencies, that.dependencies)) return false;
    if (!java.util.Objects.equals(digest, that.digest)) return false;
    if (!java.util.Objects.equals(generatedSources, that.generatedSources)) return false;
    if (!java.util.Objects.equals(image, that.image)) return false;
    if (!java.util.Objects.equals(integrationKit, that.integrationKit)) return false;
    if (!java.util.Objects.equals(lastInitTimestamp, that.lastInitTimestamp)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    if (!java.util.Objects.equals(phase, that.phase)) return false;
    if (!java.util.Objects.equals(platform, that.platform)) return false;
    if (!java.util.Objects.equals(profile, that.profile)) return false;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    if (!java.util.Objects.equals(runtimeProvider, that.runtimeProvider)) return false;
    if (!java.util.Objects.equals(runtimeVersion, that.runtimeVersion)) return false;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(capabilities,  conditions,  configuration,  dependencies,  digest,  generatedSources,  image,  integrationKit,  lastInitTimestamp,  observedGeneration,  phase,  platform,  profile,  replicas,  runtimeProvider,  runtimeVersion,  selector,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (capabilities != null && !capabilities.isEmpty()) { sb.append("capabilities:"); sb.append(capabilities + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (configuration != null && !configuration.isEmpty()) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (dependencies != null && !dependencies.isEmpty()) { sb.append("dependencies:"); sb.append(dependencies + ","); }
    if (digest != null) { sb.append("digest:"); sb.append(digest + ","); }
    if (generatedSources != null && !generatedSources.isEmpty()) { sb.append("generatedSources:"); sb.append(generatedSources + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (integrationKit != null) { sb.append("integrationKit:"); sb.append(integrationKit + ","); }
    if (lastInitTimestamp != null) { sb.append("lastInitTimestamp:"); sb.append(lastInitTimestamp + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase + ","); }
    if (platform != null) { sb.append("platform:"); sb.append(platform + ","); }
    if (profile != null) { sb.append("profile:"); sb.append(profile + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (runtimeProvider != null) { sb.append("runtimeProvider:"); sb.append(runtimeProvider + ","); }
    if (runtimeVersion != null) { sb.append("runtimeVersion:"); sb.append(runtimeVersion + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends ConditionsFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,Conditions item) {
      this.index = index;
      this.builder = new ConditionsBuilder(this, item);
    }
    ConditionsBuilder builder;
    int index;
    
    public N and() {
      return (N) IntegrationStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endIntegrationstatusCondition() {
      return and();
    }
    
  
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(int index,Configuration item) {
      this.index = index;
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    int index;
    
    public N and() {
      return (N) IntegrationStatusFluent.this.setToConfiguration(index,builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }
  public class GeneratedSourcesNested<N> extends GeneratedSourcesFluent<GeneratedSourcesNested<N>> implements Nested<N>{
    GeneratedSourcesNested(int index,GeneratedSources item) {
      this.index = index;
      this.builder = new GeneratedSourcesBuilder(this, item);
    }
    GeneratedSourcesBuilder builder;
    int index;
    
    public N and() {
      return (N) IntegrationStatusFluent.this.setToGeneratedSources(index,builder.build());
    }
    
    public N endGeneratedSource() {
      return and();
    }
    
  
  }
  public class IntegrationKitNested<N> extends IntegrationKitFluent<IntegrationKitNested<N>> implements Nested<N>{
    IntegrationKitNested(IntegrationKit item) {
      this.builder = new IntegrationKitBuilder(this, item);
    }
    IntegrationKitBuilder builder;
    
    public N and() {
      return (N) IntegrationStatusFluent.this.withIntegrationKit(builder.build());
    }
    
    public N endIntegrationstatusIntegrationKit() {
      return and();
    }
    
  
  }

}