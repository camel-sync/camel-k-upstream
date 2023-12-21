package org.apache.camel.v1;

import org.apache.camel.v1.integrationplatformspec.ConfigurationBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.integrationplatformspec.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.integrationplatformspec.ConfigurationFluent;
import org.apache.camel.v1.integrationplatformspec.Traits;
import java.util.function.Predicate;
import org.apache.camel.v1.integrationplatformspec.TraitsBuilder;
import org.apache.camel.v1.integrationplatformspec.Build;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import org.apache.camel.v1.integrationplatformspec.TraitsFluent;
import java.util.List;
import org.apache.camel.v1.integrationplatformspec.Kamelet;
import org.apache.camel.v1.integrationplatformspec.BuildFluent;
import org.apache.camel.v1.integrationplatformspec.BuildBuilder;
import org.apache.camel.v1.integrationplatformspec.KameletBuilder;
import java.util.Collection;
import org.apache.camel.v1.integrationplatformspec.KameletFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class IntegrationPlatformSpecFluent<A extends IntegrationPlatformSpecFluent<A>> extends BaseFluent<A>{
  public IntegrationPlatformSpecFluent() {
  }
  
  public IntegrationPlatformSpecFluent(IntegrationPlatformSpec instance) {
    this.copyInstance(instance);
  }
  private BuildBuilder build;
  private String cluster;
  private ArrayList<ConfigurationBuilder> configuration;
  private KameletBuilder kamelet;
  private String profile;
  private TraitsBuilder traits;
  
  protected void copyInstance(IntegrationPlatformSpec instance) {
    instance = (instance != null ? instance : new IntegrationPlatformSpec());
    if (instance != null) {
          this.withBuild(instance.getBuild());
          this.withCluster(instance.getCluster());
          this.withConfiguration(instance.getConfiguration());
          this.withKamelet(instance.getKamelet());
          this.withProfile(instance.getProfile());
          this.withTraits(instance.getTraits());
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
  
  public BuildNested<A> editIntegrationplatformspecBuild() {
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
  
  public A addToConfiguration(org.apache.camel.v1.integrationplatformspec.Configuration... items) {
    if (this.configuration == null) {this.configuration = new ArrayList<ConfigurationBuilder>();}
    for (Configuration item : items) {ConfigurationBuilder builder = new ConfigurationBuilder(item);_visitables.get("configuration").add(builder);this.configuration.add(builder);} return (A)this;
  }
  
  public A addAllToConfiguration(Collection<Configuration> items) {
    if (this.configuration == null) {this.configuration = new ArrayList<ConfigurationBuilder>();}
    for (Configuration item : items) {ConfigurationBuilder builder = new ConfigurationBuilder(item);_visitables.get("configuration").add(builder);this.configuration.add(builder);} return (A)this;
  }
  
  public A removeFromConfiguration(org.apache.camel.v1.integrationplatformspec.Configuration... items) {
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
  
  public A withConfiguration(org.apache.camel.v1.integrationplatformspec.Configuration... configuration) {
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
  
  public KameletNested<A> editIntegrationplatformspecKamelet() {
    return withNewKameletLike(java.util.Optional.ofNullable(buildKamelet()).orElse(null));
  }
  
  public KameletNested<A> editOrNewKamelet() {
    return withNewKameletLike(java.util.Optional.ofNullable(buildKamelet()).orElse(new KameletBuilder().build()));
  }
  
  public KameletNested<A> editOrNewKameletLike(Kamelet item) {
    return withNewKameletLike(java.util.Optional.ofNullable(buildKamelet()).orElse(item));
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
  
  public TraitsNested<A> editIntegrationplatformspecTraits() {
    return withNewTraitsLike(java.util.Optional.ofNullable(buildTraits()).orElse(null));
  }
  
  public TraitsNested<A> editOrNewTraits() {
    return withNewTraitsLike(java.util.Optional.ofNullable(buildTraits()).orElse(new TraitsBuilder().build()));
  }
  
  public TraitsNested<A> editOrNewTraitsLike(Traits item) {
    return withNewTraitsLike(java.util.Optional.ofNullable(buildTraits()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    IntegrationPlatformSpecFluent that = (IntegrationPlatformSpecFluent) o;
    if (!java.util.Objects.equals(build, that.build)) return false;
    if (!java.util.Objects.equals(cluster, that.cluster)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(kamelet, that.kamelet)) return false;
    if (!java.util.Objects.equals(profile, that.profile)) return false;
    if (!java.util.Objects.equals(traits, that.traits)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(build,  cluster,  configuration,  kamelet,  profile,  traits,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (build != null) { sb.append("build:"); sb.append(build + ","); }
    if (cluster != null) { sb.append("cluster:"); sb.append(cluster + ","); }
    if (configuration != null && !configuration.isEmpty()) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (kamelet != null) { sb.append("kamelet:"); sb.append(kamelet + ","); }
    if (profile != null) { sb.append("profile:"); sb.append(profile + ","); }
    if (traits != null) { sb.append("traits:"); sb.append(traits); }
    sb.append("}");
    return sb.toString();
  }
  public class BuildNested<N> extends BuildFluent<BuildNested<N>> implements Nested<N>{
    BuildNested(Build item) {
      this.builder = new BuildBuilder(this, item);
    }
    BuildBuilder builder;
    
    public N and() {
      return (N) IntegrationPlatformSpecFluent.this.withBuild(builder.build());
    }
    
    public N endIntegrationplatformspecBuild() {
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
      return (N) IntegrationPlatformSpecFluent.this.setToConfiguration(index,builder.build());
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
      return (N) IntegrationPlatformSpecFluent.this.withKamelet(builder.build());
    }
    
    public N endIntegrationplatformspecKamelet() {
      return and();
    }
    
  
  }
  public class TraitsNested<N> extends TraitsFluent<TraitsNested<N>> implements Nested<N>{
    TraitsNested(Traits item) {
      this.builder = new TraitsBuilder(this, item);
    }
    TraitsBuilder builder;
    
    public N and() {
      return (N) IntegrationPlatformSpecFluent.this.withTraits(builder.build());
    }
    
    public N endIntegrationplatformspecTraits() {
      return and();
    }
    
  
  }

}