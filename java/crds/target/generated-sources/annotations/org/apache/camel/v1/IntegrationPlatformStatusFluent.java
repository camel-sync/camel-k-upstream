package org.apache.camel.v1;

import org.apache.camel.v1.integrationplatformstatus.ConfigurationBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.integrationplatformstatus.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.integrationplatformstatus.ConditionsFluent;
import java.lang.String;
import org.apache.camel.v1.integrationplatformstatus.ConfigurationFluent;
import org.apache.camel.v1.integrationplatformstatus.Conditions;
import org.apache.camel.v1.integrationplatformstatus.Traits;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import org.apache.camel.v1.integrationplatformstatus.TraitsBuilder;
import org.apache.camel.v1.integrationplatformstatus.Build;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import org.apache.camel.v1.integrationplatformstatus.TraitsFluent;
import java.util.List;
import org.apache.camel.v1.integrationplatformstatus.Kamelet;
import org.apache.camel.v1.integrationplatformstatus.BuildFluent;
import org.apache.camel.v1.integrationplatformstatus.BuildBuilder;
import org.apache.camel.v1.integrationplatformstatus.ConditionsBuilder;
import org.apache.camel.v1.integrationplatformstatus.KameletBuilder;
import java.lang.Long;
import java.util.Collection;
import org.apache.camel.v1.integrationplatformstatus.KameletFluent;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class IntegrationPlatformStatusFluent<A extends IntegrationPlatformStatusFluent<A>> extends BaseFluent<A>{
  public IntegrationPlatformStatusFluent() {
  }
  
  public IntegrationPlatformStatusFluent(IntegrationPlatformStatus instance) {
    this.copyInstance(instance);
  }
  private BuildBuilder build;
  private String cluster;
  private ArrayList<ConditionsBuilder> conditions;
  private ArrayList<ConfigurationBuilder> configuration;
  private Map<String,String> info;
  private KameletBuilder kamelet;
  private Long observedGeneration;
  private String phase;
  private String profile;
  private TraitsBuilder traits;
  private String version;
  
  protected void copyInstance(IntegrationPlatformStatus instance) {
    instance = (instance != null ? instance : new IntegrationPlatformStatus());
    if (instance != null) {
          this.withBuild(instance.getBuild());
          this.withCluster(instance.getCluster());
          this.withConditions(instance.getConditions());
          this.withConfiguration(instance.getConfiguration());
          this.withInfo(instance.getInfo());
          this.withKamelet(instance.getKamelet());
          this.withObservedGeneration(instance.getObservedGeneration());
          this.withPhase(instance.getPhase());
          this.withProfile(instance.getProfile());
          this.withTraits(instance.getTraits());
          this.withVersion(instance.getVersion());
        }
  }
  
  public Build buildBuild() {
    return this.build != null ? this.build.build() : null;
  }
  
  public A withBuild(Build build) {
    this._visitables.remove("build");
    if (build != null) {
        this.build = new BuildBuilder(build);
        this._visitables.get("build").add(this.build);
    } else {
        this.build = null;
        this._visitables.get("build").remove(this.build);
    }
    return (A) this;
  }
  
  public boolean hasBuild() {
    return this.build != null;
  }
  
  public BuildNested<A> withNewBuild() {
    return new BuildNested(null);
  }
  
  public BuildNested<A> withNewBuildLike(Build item) {
    return new BuildNested(item);
  }
  
  public BuildNested<A> editIntegrationplatformstatusBuild() {
    return withNewBuildLike(java.util.Optional.ofNullable(buildBuild()).orElse(null));
  }
  
  public BuildNested<A> editOrNewBuild() {
    return withNewBuildLike(java.util.Optional.ofNullable(buildBuild()).orElse(new BuildBuilder().build()));
  }
  
  public BuildNested<A> editOrNewBuildLike(Build item) {
    return withNewBuildLike(java.util.Optional.ofNullable(buildBuild()).orElse(item));
  }
  
  public String getCluster() {
    return this.cluster;
  }
  
  public A withCluster(String cluster) {
    this.cluster = cluster;
    return (A) this;
  }
  
  public boolean hasCluster() {
    return this.cluster != null;
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
  
  public A addToConditions(org.apache.camel.v1.integrationplatformstatus.Conditions... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToIntegrationplatformstatusConditions(Collection<Conditions> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(org.apache.camel.v1.integrationplatformstatus.Conditions... items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIntegrationplatformstatusConditions(Collection<Conditions> items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIntegrationplatformstatusConditions(Predicate<ConditionsBuilder> predicate) {
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
  
  public A withConditions(org.apache.camel.v1.integrationplatformstatus.Conditions... conditions) {
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
  
  public A addToConfiguration(org.apache.camel.v1.integrationplatformstatus.Configuration... items) {
    if (this.configuration == null) {this.configuration = new ArrayList<ConfigurationBuilder>();}
    for (Configuration item : items) {ConfigurationBuilder builder = new ConfigurationBuilder(item);_visitables.get("configuration").add(builder);this.configuration.add(builder);} return (A)this;
  }
  
  public A addAllToConfiguration(Collection<Configuration> items) {
    if (this.configuration == null) {this.configuration = new ArrayList<ConfigurationBuilder>();}
    for (Configuration item : items) {ConfigurationBuilder builder = new ConfigurationBuilder(item);_visitables.get("configuration").add(builder);this.configuration.add(builder);} return (A)this;
  }
  
  public A removeFromConfiguration(org.apache.camel.v1.integrationplatformstatus.Configuration... items) {
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
  
  public A withConfiguration(org.apache.camel.v1.integrationplatformstatus.Configuration... configuration) {
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
  
  public A addToInfo(String key,String value) {
    if(this.info == null && key != null && value != null) { this.info = new LinkedHashMap(); }
    if(key != null && value != null) {this.info.put(key, value);} return (A)this;
  }
  
  public A addToInfo(Map<String,String> map) {
    if(this.info == null && map != null) { this.info = new LinkedHashMap(); }
    if(map != null) { this.info.putAll(map);} return (A)this;
  }
  
  public A removeFromInfo(String key) {
    if(this.info == null) { return (A) this; }
    if(key != null && this.info != null) {this.info.remove(key);} return (A)this;
  }
  
  public A removeFromInfo(Map<String,String> map) {
    if(this.info == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.info != null){this.info.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getInfo() {
    return this.info;
  }
  
  public <K,V>A withInfo(Map<String,String> info) {
    if (info == null) {
      this.info = null;
    } else {
      this.info = new LinkedHashMap(info);
    }
    return (A) this;
  }
  
  public boolean hasInfo() {
    return this.info != null;
  }
  
  public Kamelet buildKamelet() {
    return this.kamelet != null ? this.kamelet.build() : null;
  }
  
  public A withKamelet(Kamelet kamelet) {
    this._visitables.remove("kamelet");
    if (kamelet != null) {
        this.kamelet = new KameletBuilder(kamelet);
        this._visitables.get("kamelet").add(this.kamelet);
    } else {
        this.kamelet = null;
        this._visitables.get("kamelet").remove(this.kamelet);
    }
    return (A) this;
  }
  
  public boolean hasKamelet() {
    return this.kamelet != null;
  }
  
  public KameletNested<A> withNewKamelet() {
    return new KameletNested(null);
  }
  
  public KameletNested<A> withNewKameletLike(Kamelet item) {
    return new KameletNested(item);
  }
  
  public KameletNested<A> editIntegrationplatformstatusKamelet() {
    return withNewKameletLike(java.util.Optional.ofNullable(buildKamelet()).orElse(null));
  }
  
  public KameletNested<A> editOrNewKamelet() {
    return withNewKameletLike(java.util.Optional.ofNullable(buildKamelet()).orElse(new KameletBuilder().build()));
  }
  
  public KameletNested<A> editOrNewKameletLike(Kamelet item) {
    return withNewKameletLike(java.util.Optional.ofNullable(buildKamelet()).orElse(item));
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
  
  public Traits buildTraits() {
    return this.traits != null ? this.traits.build() : null;
  }
  
  public A withTraits(Traits traits) {
    this._visitables.remove("traits");
    if (traits != null) {
        this.traits = new TraitsBuilder(traits);
        this._visitables.get("traits").add(this.traits);
    } else {
        this.traits = null;
        this._visitables.get("traits").remove(this.traits);
    }
    return (A) this;
  }
  
  public boolean hasTraits() {
    return this.traits != null;
  }
  
  public TraitsNested<A> withNewTraits() {
    return new TraitsNested(null);
  }
  
  public TraitsNested<A> withNewTraitsLike(Traits item) {
    return new TraitsNested(item);
  }
  
  public TraitsNested<A> editIntegrationplatformstatusTraits() {
    return withNewTraitsLike(java.util.Optional.ofNullable(buildTraits()).orElse(null));
  }
  
  public TraitsNested<A> editOrNewTraits() {
    return withNewTraitsLike(java.util.Optional.ofNullable(buildTraits()).orElse(new TraitsBuilder().build()));
  }
  
  public TraitsNested<A> editOrNewTraitsLike(Traits item) {
    return withNewTraitsLike(java.util.Optional.ofNullable(buildTraits()).orElse(item));
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
    IntegrationPlatformStatusFluent that = (IntegrationPlatformStatusFluent) o;
    if (!java.util.Objects.equals(build, that.build)) return false;
    if (!java.util.Objects.equals(cluster, that.cluster)) return false;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(info, that.info)) return false;
    if (!java.util.Objects.equals(kamelet, that.kamelet)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    if (!java.util.Objects.equals(phase, that.phase)) return false;
    if (!java.util.Objects.equals(profile, that.profile)) return false;
    if (!java.util.Objects.equals(traits, that.traits)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(build,  cluster,  conditions,  configuration,  info,  kamelet,  observedGeneration,  phase,  profile,  traits,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (build != null) { sb.append("build:"); sb.append(build + ","); }
    if (cluster != null) { sb.append("cluster:"); sb.append(cluster + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (configuration != null && !configuration.isEmpty()) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (info != null && !info.isEmpty()) { sb.append("info:"); sb.append(info + ","); }
    if (kamelet != null) { sb.append("kamelet:"); sb.append(kamelet + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase + ","); }
    if (profile != null) { sb.append("profile:"); sb.append(profile + ","); }
    if (traits != null) { sb.append("traits:"); sb.append(traits + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  public class BuildNested<N> extends BuildFluent<BuildNested<N>> implements Nested<N>{
    BuildNested(Build item) {
      this.builder = new BuildBuilder(this, item);
    }
    BuildBuilder builder;
    
    public N and() {
      return (N) IntegrationPlatformStatusFluent.this.withBuild(builder.build());
    }
    
    public N endIntegrationplatformstatusBuild() {
      return and();
    }
    
  
  }
  public class ConditionsNested<N> extends ConditionsFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,Conditions item) {
      this.index = index;
      this.builder = new ConditionsBuilder(this, item);
    }
    ConditionsBuilder builder;
    int index;
    
    public N and() {
      return (N) IntegrationPlatformStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endIntegrationplatformstatusCondition() {
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
      return (N) IntegrationPlatformStatusFluent.this.setToConfiguration(index,builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }
  public class KameletNested<N> extends KameletFluent<KameletNested<N>> implements Nested<N>{
    KameletNested(Kamelet item) {
      this.builder = new KameletBuilder(this, item);
    }
    KameletBuilder builder;
    
    public N and() {
      return (N) IntegrationPlatformStatusFluent.this.withKamelet(builder.build());
    }
    
    public N endIntegrationplatformstatusKamelet() {
      return and();
    }
    
  
  }
  public class TraitsNested<N> extends TraitsFluent<TraitsNested<N>> implements Nested<N>{
    TraitsNested(Traits item) {
      this.builder = new TraitsBuilder(this, item);
    }
    TraitsBuilder builder;
    
    public N and() {
      return (N) IntegrationPlatformStatusFluent.this.withTraits(builder.build());
    }
    
    public N endIntegrationplatformstatusTraits() {
      return and();
    }
    
  
  }

}