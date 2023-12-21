package org.apache.camel.v1;

import org.apache.camel.v1.integrationspec.ConfigurationBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.integrationspec.Configuration;
import org.apache.camel.v1.integrationspec.FlowsFluent;
import org.apache.camel.v1.integrationspec.SourcesFluent;
import java.lang.SuppressWarnings;
import org.apache.camel.v1.integrationspec.IntegrationKitBuilder;
import org.apache.camel.v1.integrationspec.TemplateBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.integrationspec.IntegrationKitFluent;
import java.lang.String;
import org.apache.camel.v1.integrationspec.ConfigurationFluent;
import org.apache.camel.v1.integrationspec.Traits;
import java.util.function.Predicate;
import org.apache.camel.v1.integrationspec.Template;
import org.apache.camel.v1.integrationspec.TraitsBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import org.apache.camel.v1.integrationspec.TraitsFluent;
import java.util.List;
import org.apache.camel.v1.integrationspec.TemplateFluent;
import org.apache.camel.v1.integrationspec.Flows;
import org.apache.camel.v1.integrationspec.IntegrationKit;
import org.apache.camel.v1.integrationspec.SourcesBuilder;
import org.apache.camel.v1.integrationspec.Sources;
import org.apache.camel.v1.integrationspec.FlowsBuilder;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class IntegrationSpecFluent<A extends IntegrationSpecFluent<A>> extends BaseFluent<A>{
  public IntegrationSpecFluent() {
  }
  
  public IntegrationSpecFluent(IntegrationSpec instance) {
    this.copyInstance(instance);
  }
  private ArrayList<ConfigurationBuilder> configuration;
  private List<String> dependencies;
  private ArrayList<FlowsBuilder> flows;
  private IntegrationKitBuilder integrationKit;
  private String profile;
  private Integer replicas;
  private List<String> repositories;
  private String serviceAccountName;
  private ArrayList<SourcesBuilder> sources;
  private TemplateBuilder template;
  private TraitsBuilder traits;
  
  protected void copyInstance(IntegrationSpec instance) {
    instance = (instance != null ? instance : new IntegrationSpec());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withDependencies(instance.getDependencies());
          this.withFlows(instance.getFlows());
          this.withIntegrationKit(instance.getIntegrationKit());
          this.withProfile(instance.getProfile());
          this.withReplicas(instance.getReplicas());
          this.withRepositories(instance.getRepositories());
          this.withServiceAccountName(instance.getServiceAccountName());
          this.withSources(instance.getSources());
          this.withTemplate(instance.getTemplate());
          this.withTraits(instance.getTraits());
        }
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
  
  public A addToConfiguration(org.apache.camel.v1.integrationspec.Configuration... items) {
    if (this.configuration == null) {this.configuration = new ArrayList<ConfigurationBuilder>();}
    for (Configuration item : items) {ConfigurationBuilder builder = new ConfigurationBuilder(item);_visitables.get("configuration").add(builder);this.configuration.add(builder);} return (A)this;
  }
  
  public A addAllToConfiguration(Collection<Configuration> items) {
    if (this.configuration == null) {this.configuration = new ArrayList<ConfigurationBuilder>();}
    for (Configuration item : items) {ConfigurationBuilder builder = new ConfigurationBuilder(item);_visitables.get("configuration").add(builder);this.configuration.add(builder);} return (A)this;
  }
  
  public A removeFromConfiguration(org.apache.camel.v1.integrationspec.Configuration... items) {
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
  
  public A withConfiguration(org.apache.camel.v1.integrationspec.Configuration... configuration) {
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
  
  public A addToFlows(int index,Flows item) {
    if (this.flows == null) {this.flows = new ArrayList<FlowsBuilder>();}
    FlowsBuilder builder = new FlowsBuilder(item);
    if (index < 0 || index >= flows.size()) { _visitables.get("flows").add(builder); flows.add(builder); } else { _visitables.get("flows").add(index, builder); flows.add(index, builder);}
    return (A)this;
  }
  
  public A setToFlows(int index,Flows item) {
    if (this.flows == null) {this.flows = new ArrayList<FlowsBuilder>();}
    FlowsBuilder builder = new FlowsBuilder(item);
    if (index < 0 || index >= flows.size()) { _visitables.get("flows").add(builder); flows.add(builder); } else { _visitables.get("flows").set(index, builder); flows.set(index, builder);}
    return (A)this;
  }
  
  public A addToFlows(org.apache.camel.v1.integrationspec.Flows... items) {
    if (this.flows == null) {this.flows = new ArrayList<FlowsBuilder>();}
    for (Flows item : items) {FlowsBuilder builder = new FlowsBuilder(item);_visitables.get("flows").add(builder);this.flows.add(builder);} return (A)this;
  }
  
  public A addAllToFlows(Collection<Flows> items) {
    if (this.flows == null) {this.flows = new ArrayList<FlowsBuilder>();}
    for (Flows item : items) {FlowsBuilder builder = new FlowsBuilder(item);_visitables.get("flows").add(builder);this.flows.add(builder);} return (A)this;
  }
  
  public A removeFromFlows(org.apache.camel.v1.integrationspec.Flows... items) {
    if (this.flows == null) return (A)this;
    for (Flows item : items) {FlowsBuilder builder = new FlowsBuilder(item);_visitables.get("flows").remove(builder); this.flows.remove(builder);} return (A)this;
  }
  
  public A removeAllFromFlows(Collection<Flows> items) {
    if (this.flows == null) return (A)this;
    for (Flows item : items) {FlowsBuilder builder = new FlowsBuilder(item);_visitables.get("flows").remove(builder); this.flows.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromFlows(Predicate<FlowsBuilder> predicate) {
    if (flows == null) return (A) this;
    final Iterator<FlowsBuilder> each = flows.iterator();
    final List visitables = _visitables.get("flows");
    while (each.hasNext()) {
      FlowsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Flows> buildFlows() {
    return this.flows != null ? build(flows) : null;
  }
  
  public Flows buildFlow(int index) {
    return this.flows.get(index).build();
  }
  
  public Flows buildFirstFlow() {
    return this.flows.get(0).build();
  }
  
  public Flows buildLastFlow() {
    return this.flows.get(flows.size() - 1).build();
  }
  
  public Flows buildMatchingFlow(Predicate<FlowsBuilder> predicate) {
      for (FlowsBuilder item : flows) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingFlow(Predicate<FlowsBuilder> predicate) {
      for (FlowsBuilder item : flows) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withFlows(List<Flows> flows) {
    if (this.flows != null) {
      this._visitables.get("flows").clear();
    }
    if (flows != null) {
        this.flows = new ArrayList();
        for (Flows item : flows) {
          this.addToFlows(item);
        }
    } else {
      this.flows = null;
    }
    return (A) this;
  }
  
  public A withFlows(org.apache.camel.v1.integrationspec.Flows... flows) {
    if (this.flows != null) {
        this.flows.clear();
        _visitables.remove("flows");
    }
    if (flows != null) {
      for (Flows item : flows) {
        this.addToFlows(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasFlows() {
    return this.flows != null && !this.flows.isEmpty();
  }
  
  public FlowsNested<A> addNewFlow() {
    return new FlowsNested(-1, null);
  }
  
  public FlowsNested<A> addNewFlowLike(Flows item) {
    return new FlowsNested(-1, item);
  }
  
  public FlowsNested<A> setNewFlowLike(int index,Flows item) {
    return new FlowsNested(index, item);
  }
  
  public FlowsNested<A> editFlow(int index) {
    if (flows.size() <= index) throw new RuntimeException("Can't edit flows. Index exceeds size.");
    return setNewFlowLike(index, buildFlow(index));
  }
  
  public FlowsNested<A> editFirstFlow() {
    if (flows.size() == 0) throw new RuntimeException("Can't edit first flows. The list is empty.");
    return setNewFlowLike(0, buildFlow(0));
  }
  
  public FlowsNested<A> editLastFlow() {
    int index = flows.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last flows. The list is empty.");
    return setNewFlowLike(index, buildFlow(index));
  }
  
  public FlowsNested<A> editMatchingFlow(Predicate<FlowsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<flows.size();i++) { 
    if (predicate.test(flows.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching flows. No match found.");
    return setNewFlowLike(index, buildFlow(index));
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
  
  public IntegrationKitNested<A> editIntegrationspecIntegrationKit() {
    return withNewIntegrationKitLike(java.util.Optional.ofNullable(buildIntegrationKit()).orElse(null));
  }
  
  public IntegrationKitNested<A> editOrNewIntegrationKit() {
    return withNewIntegrationKitLike(java.util.Optional.ofNullable(buildIntegrationKit()).orElse(new IntegrationKitBuilder().build()));
  }
  
  public IntegrationKitNested<A> editOrNewIntegrationKitLike(IntegrationKit item) {
    return withNewIntegrationKitLike(java.util.Optional.ofNullable(buildIntegrationKit()).orElse(item));
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
  
  public A addToRepositories(int index,String item) {
    if (this.repositories == null) {this.repositories = new ArrayList<String>();}
    this.repositories.add(index, item);
    return (A)this;
  }
  
  public A setToRepositories(int index,String item) {
    if (this.repositories == null) {this.repositories = new ArrayList<String>();}
    this.repositories.set(index, item); return (A)this;
  }
  
  public A addToRepositories(java.lang.String... items) {
    if (this.repositories == null) {this.repositories = new ArrayList<String>();}
    for (String item : items) {this.repositories.add(item);} return (A)this;
  }
  
  public A addAllToRepositories(Collection<String> items) {
    if (this.repositories == null) {this.repositories = new ArrayList<String>();}
    for (String item : items) {this.repositories.add(item);} return (A)this;
  }
  
  public A removeFromRepositories(java.lang.String... items) {
    if (this.repositories == null) return (A)this;
    for (String item : items) { this.repositories.remove(item);} return (A)this;
  }
  
  public A removeAllFromRepositories(Collection<String> items) {
    if (this.repositories == null) return (A)this;
    for (String item : items) { this.repositories.remove(item);} return (A)this;
  }
  
  public List<String> getRepositories() {
    return this.repositories;
  }
  
  public String getRepository(int index) {
    return this.repositories.get(index);
  }
  
  public String getFirstRepository() {
    return this.repositories.get(0);
  }
  
  public String getLastRepository() {
    return this.repositories.get(repositories.size() - 1);
  }
  
  public String getMatchingRepository(Predicate<String> predicate) {
      for (String item : repositories) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingRepository(Predicate<String> predicate) {
      for (String item : repositories) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRepositories(List<String> repositories) {
    if (repositories != null) {
        this.repositories = new ArrayList();
        for (String item : repositories) {
          this.addToRepositories(item);
        }
    } else {
      this.repositories = null;
    }
    return (A) this;
  }
  
  public A withRepositories(java.lang.String... repositories) {
    if (this.repositories != null) {
        this.repositories.clear();
        _visitables.remove("repositories");
    }
    if (repositories != null) {
      for (String item : repositories) {
        this.addToRepositories(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRepositories() {
    return this.repositories != null && !this.repositories.isEmpty();
  }
  
  public String getServiceAccountName() {
    return this.serviceAccountName;
  }
  
  public A withServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return (A) this;
  }
  
  public boolean hasServiceAccountName() {
    return this.serviceAccountName != null;
  }
  
  public A addToSources(int index,Sources item) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    SourcesBuilder builder = new SourcesBuilder(item);
    if (index < 0 || index >= sources.size()) { _visitables.get("sources").add(builder); sources.add(builder); } else { _visitables.get("sources").add(index, builder); sources.add(index, builder);}
    return (A)this;
  }
  
  public A setToSources(int index,Sources item) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    SourcesBuilder builder = new SourcesBuilder(item);
    if (index < 0 || index >= sources.size()) { _visitables.get("sources").add(builder); sources.add(builder); } else { _visitables.get("sources").set(index, builder); sources.set(index, builder);}
    return (A)this;
  }
  
  public A addToSources(org.apache.camel.v1.integrationspec.Sources... items) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").add(builder);this.sources.add(builder);} return (A)this;
  }
  
  public A addAllToIntegrationspecSources(Collection<Sources> items) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").add(builder);this.sources.add(builder);} return (A)this;
  }
  
  public A removeFromSources(org.apache.camel.v1.integrationspec.Sources... items) {
    if (this.sources == null) return (A)this;
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").remove(builder); this.sources.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIntegrationspecSources(Collection<Sources> items) {
    if (this.sources == null) return (A)this;
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").remove(builder); this.sources.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIntegrationspecSources(Predicate<SourcesBuilder> predicate) {
    if (sources == null) return (A) this;
    final Iterator<SourcesBuilder> each = sources.iterator();
    final List visitables = _visitables.get("sources");
    while (each.hasNext()) {
      SourcesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Sources> buildSources() {
    return this.sources != null ? build(sources) : null;
  }
  
  public Sources buildSource(int index) {
    return this.sources.get(index).build();
  }
  
  public Sources buildFirstSource() {
    return this.sources.get(0).build();
  }
  
  public Sources buildLastSource() {
    return this.sources.get(sources.size() - 1).build();
  }
  
  public Sources buildMatchingSource(Predicate<SourcesBuilder> predicate) {
      for (SourcesBuilder item : sources) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingSource(Predicate<SourcesBuilder> predicate) {
      for (SourcesBuilder item : sources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSources(List<Sources> sources) {
    if (this.sources != null) {
      this._visitables.get("sources").clear();
    }
    if (sources != null) {
        this.sources = new ArrayList();
        for (Sources item : sources) {
          this.addToSources(item);
        }
    } else {
      this.sources = null;
    }
    return (A) this;
  }
  
  public A withSources(org.apache.camel.v1.integrationspec.Sources... sources) {
    if (this.sources != null) {
        this.sources.clear();
        _visitables.remove("sources");
    }
    if (sources != null) {
      for (Sources item : sources) {
        this.addToSources(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSources() {
    return this.sources != null && !this.sources.isEmpty();
  }
  
  public SourcesNested<A> addNewSource() {
    return new SourcesNested(-1, null);
  }
  
  public SourcesNested<A> addNewSourceLike(Sources item) {
    return new SourcesNested(-1, item);
  }
  
  public SourcesNested<A> setNewSourceLike(int index,Sources item) {
    return new SourcesNested(index, item);
  }
  
  public SourcesNested<A> editSource(int index) {
    if (sources.size() <= index) throw new RuntimeException("Can't edit sources. Index exceeds size.");
    return setNewSourceLike(index, buildSource(index));
  }
  
  public SourcesNested<A> editFirstSource() {
    if (sources.size() == 0) throw new RuntimeException("Can't edit first sources. The list is empty.");
    return setNewSourceLike(0, buildSource(0));
  }
  
  public SourcesNested<A> editLastSource() {
    int index = sources.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last sources. The list is empty.");
    return setNewSourceLike(index, buildSource(index));
  }
  
  public SourcesNested<A> editMatchingSource(Predicate<SourcesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<sources.size();i++) { 
    if (predicate.test(sources.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching sources. No match found.");
    return setNewSourceLike(index, buildSource(index));
  }
  
  public Template buildTemplate() {
    return this.template != null ? this.template.build() : null;
  }
  
  public A withTemplate(Template template) {
    this._visitables.remove("template");
    if (template != null) {
        this.template = new TemplateBuilder(template);
        this._visitables.get("template").add(this.template);
    } else {
        this.template = null;
        this._visitables.get("template").remove(this.template);
    }
    return (A) this;
  }
  
  public boolean hasTemplate() {
    return this.template != null;
  }
  
  public TemplateNested<A> withNewTemplate() {
    return new TemplateNested(null);
  }
  
  public TemplateNested<A> withNewTemplateLike(Template item) {
    return new TemplateNested(item);
  }
  
  public TemplateNested<A> editTemplate() {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(null));
  }
  
  public TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(new TemplateBuilder().build()));
  }
  
  public TemplateNested<A> editOrNewTemplateLike(Template item) {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(item));
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
  
  public TraitsNested<A> editIntegrationspecTraits() {
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
    IntegrationSpecFluent that = (IntegrationSpecFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(dependencies, that.dependencies)) return false;
    if (!java.util.Objects.equals(flows, that.flows)) return false;
    if (!java.util.Objects.equals(integrationKit, that.integrationKit)) return false;
    if (!java.util.Objects.equals(profile, that.profile)) return false;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    if (!java.util.Objects.equals(repositories, that.repositories)) return false;
    if (!java.util.Objects.equals(serviceAccountName, that.serviceAccountName)) return false;
    if (!java.util.Objects.equals(sources, that.sources)) return false;
    if (!java.util.Objects.equals(template, that.template)) return false;
    if (!java.util.Objects.equals(traits, that.traits)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  dependencies,  flows,  integrationKit,  profile,  replicas,  repositories,  serviceAccountName,  sources,  template,  traits,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null && !configuration.isEmpty()) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (dependencies != null && !dependencies.isEmpty()) { sb.append("dependencies:"); sb.append(dependencies + ","); }
    if (flows != null && !flows.isEmpty()) { sb.append("flows:"); sb.append(flows + ","); }
    if (integrationKit != null) { sb.append("integrationKit:"); sb.append(integrationKit + ","); }
    if (profile != null) { sb.append("profile:"); sb.append(profile + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (repositories != null && !repositories.isEmpty()) { sb.append("repositories:"); sb.append(repositories + ","); }
    if (serviceAccountName != null) { sb.append("serviceAccountName:"); sb.append(serviceAccountName + ","); }
    if (sources != null && !sources.isEmpty()) { sb.append("sources:"); sb.append(sources + ","); }
    if (template != null) { sb.append("template:"); sb.append(template + ","); }
    if (traits != null) { sb.append("traits:"); sb.append(traits); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(int index,Configuration item) {
      this.index = index;
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    int index;
    
    public N and() {
      return (N) IntegrationSpecFluent.this.setToConfiguration(index,builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }
  public class FlowsNested<N> extends FlowsFluent<FlowsNested<N>> implements Nested<N>{
    FlowsNested(int index,Flows item) {
      this.index = index;
      this.builder = new FlowsBuilder(this, item);
    }
    FlowsBuilder builder;
    int index;
    
    public N and() {
      return (N) IntegrationSpecFluent.this.setToFlows(index,builder.build());
    }
    
    public N endFlow() {
      return and();
    }
    
  
  }
  public class IntegrationKitNested<N> extends IntegrationKitFluent<IntegrationKitNested<N>> implements Nested<N>{
    IntegrationKitNested(IntegrationKit item) {
      this.builder = new IntegrationKitBuilder(this, item);
    }
    IntegrationKitBuilder builder;
    
    public N and() {
      return (N) IntegrationSpecFluent.this.withIntegrationKit(builder.build());
    }
    
    public N endIntegrationspecIntegrationKit() {
      return and();
    }
    
  
  }
  public class SourcesNested<N> extends SourcesFluent<SourcesNested<N>> implements Nested<N>{
    SourcesNested(int index,Sources item) {
      this.index = index;
      this.builder = new SourcesBuilder(this, item);
    }
    SourcesBuilder builder;
    int index;
    
    public N and() {
      return (N) IntegrationSpecFluent.this.setToSources(index,builder.build());
    }
    
    public N endIntegrationspecSource() {
      return and();
    }
    
  
  }
  public class TemplateNested<N> extends TemplateFluent<TemplateNested<N>> implements Nested<N>{
    TemplateNested(Template item) {
      this.builder = new TemplateBuilder(this, item);
    }
    TemplateBuilder builder;
    
    public N and() {
      return (N) IntegrationSpecFluent.this.withTemplate(builder.build());
    }
    
    public N endTemplate() {
      return and();
    }
    
  
  }
  public class TraitsNested<N> extends TraitsFluent<TraitsNested<N>> implements Nested<N>{
    TraitsNested(Traits item) {
      this.builder = new TraitsBuilder(this, item);
    }
    TraitsBuilder builder;
    
    public N and() {
      return (N) IntegrationSpecFluent.this.withTraits(builder.build());
    }
    
    public N endIntegrationspecTraits() {
      return and();
    }
    
  
  }

}