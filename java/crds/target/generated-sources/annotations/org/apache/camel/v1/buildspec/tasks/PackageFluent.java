package org.apache.camel.v1.buildspec.tasks;

import org.apache.camel.v1.buildspec.tasks.package_.ConfigurationBuilder;
import org.apache.camel.v1.buildspec.tasks.package_.Maven;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.buildspec.tasks.package_.Configuration;
import org.apache.camel.v1.buildspec.tasks.package_.SourcesFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.buildspec.tasks.package_.ConfigurationFluent;
import java.util.function.Predicate;
import org.apache.camel.v1.buildspec.tasks.package_.Runtime;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import org.apache.camel.v1.buildspec.tasks.package_.MavenBuilder;
import org.apache.camel.v1.buildspec.tasks.package_.RuntimeFluent;
import org.apache.camel.v1.buildspec.tasks.package_.SourcesBuilder;
import org.apache.camel.v1.buildspec.tasks.package_.Sources;
import org.apache.camel.v1.buildspec.tasks.package_.MavenFluent;
import java.util.Collection;
import java.lang.Object;
import org.apache.camel.v1.buildspec.tasks.package_.RuntimeBuilder;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PackageFluent<A extends PackageFluent<A>> extends BaseFluent<A>{
  public PackageFluent() {
  }
  
  public PackageFluent(Package instance) {
    this.copyInstance(instance);
  }
  private String baseImage;
  private String buildDir;
  private ConfigurationBuilder configuration;
  private List<String> dependencies;
  private MavenBuilder maven;
  private String name;
  private RuntimeBuilder runtime;
  private ArrayList<SourcesBuilder> sources;
  private List<String> steps;
  
  protected void copyInstance(Package instance) {
    instance = (instance != null ? instance : new Package());
    if (instance != null) {
          this.withBaseImage(instance.getBaseImage());
          this.withBuildDir(instance.getBuildDir());
          this.withConfiguration(instance.getConfiguration());
          this.withDependencies(instance.getDependencies());
          this.withMaven(instance.getMaven());
          this.withName(instance.getName());
          this.withRuntime(instance.getRuntime());
          this.withSources(instance.getSources());
          this.withSteps(instance.getSteps());
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
  
  public String getBuildDir() {
    return this.buildDir;
  }
  
  public A withBuildDir(String buildDir) {
    this.buildDir = buildDir;
    return (A) this;
  }
  
  public boolean hasBuildDir() {
    return this.buildDir != null;
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
  
  public Maven buildMaven() {
    return this.maven != null ? this.maven.build() : null;
  }
  
  public A withMaven(Maven maven) {
    this._visitables.remove("maven");
    if (maven != null) {
        this.maven = new MavenBuilder(maven);
        this._visitables.get("maven").add(this.maven);
    } else {
        this.maven = null;
        this._visitables.get("maven").remove(this.maven);
    }
    return (A) this;
  }
  
  public boolean hasMaven() {
    return this.maven != null;
  }
  
  public MavenNested<A> withNewMaven() {
    return new MavenNested(null);
  }
  
  public MavenNested<A> withNewMavenLike(Maven item) {
    return new MavenNested(item);
  }
  
  public MavenNested<A> editPackage_Maven() {
    return withNewMavenLike(java.util.Optional.ofNullable(buildMaven()).orElse(null));
  }
  
  public MavenNested<A> editOrNewMaven() {
    return withNewMavenLike(java.util.Optional.ofNullable(buildMaven()).orElse(new MavenBuilder().build()));
  }
  
  public MavenNested<A> editOrNewMavenLike(Maven item) {
    return withNewMavenLike(java.util.Optional.ofNullable(buildMaven()).orElse(item));
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public Runtime buildRuntime() {
    return this.runtime != null ? this.runtime.build() : null;
  }
  
  public A withRuntime(Runtime runtime) {
    this._visitables.remove("runtime");
    if (runtime != null) {
        this.runtime = new RuntimeBuilder(runtime);
        this._visitables.get("runtime").add(this.runtime);
    } else {
        this.runtime = null;
        this._visitables.get("runtime").remove(this.runtime);
    }
    return (A) this;
  }
  
  public boolean hasRuntime() {
    return this.runtime != null;
  }
  
  public RuntimeNested<A> withNewRuntime() {
    return new RuntimeNested(null);
  }
  
  public RuntimeNested<A> withNewRuntimeLike(Runtime item) {
    return new RuntimeNested(item);
  }
  
  public RuntimeNested<A> editPackage_Runtime() {
    return withNewRuntimeLike(java.util.Optional.ofNullable(buildRuntime()).orElse(null));
  }
  
  public RuntimeNested<A> editOrNewRuntime() {
    return withNewRuntimeLike(java.util.Optional.ofNullable(buildRuntime()).orElse(new RuntimeBuilder().build()));
  }
  
  public RuntimeNested<A> editOrNewRuntimeLike(Runtime item) {
    return withNewRuntimeLike(java.util.Optional.ofNullable(buildRuntime()).orElse(item));
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
  
  public A addToSources(org.apache.camel.v1.buildspec.tasks.package_.Sources... items) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").add(builder);this.sources.add(builder);} return (A)this;
  }
  
  public A addAllToPackage_Sources(Collection<Sources> items) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").add(builder);this.sources.add(builder);} return (A)this;
  }
  
  public A removeFromSources(org.apache.camel.v1.buildspec.tasks.package_.Sources... items) {
    if (this.sources == null) return (A)this;
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").remove(builder); this.sources.remove(builder);} return (A)this;
  }
  
  public A removeAllFromPackage_Sources(Collection<Sources> items) {
    if (this.sources == null) return (A)this;
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").remove(builder); this.sources.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromPackage_Sources(Predicate<SourcesBuilder> predicate) {
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
  
  public A withSources(org.apache.camel.v1.buildspec.tasks.package_.Sources... sources) {
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
  
  public A addToSteps(int index,String item) {
    if (this.steps == null) {this.steps = new ArrayList<String>();}
    this.steps.add(index, item);
    return (A)this;
  }
  
  public A setToSteps(int index,String item) {
    if (this.steps == null) {this.steps = new ArrayList<String>();}
    this.steps.set(index, item); return (A)this;
  }
  
  public A addToSteps(java.lang.String... items) {
    if (this.steps == null) {this.steps = new ArrayList<String>();}
    for (String item : items) {this.steps.add(item);} return (A)this;
  }
  
  public A addAllToSteps(Collection<String> items) {
    if (this.steps == null) {this.steps = new ArrayList<String>();}
    for (String item : items) {this.steps.add(item);} return (A)this;
  }
  
  public A removeFromSteps(java.lang.String... items) {
    if (this.steps == null) return (A)this;
    for (String item : items) { this.steps.remove(item);} return (A)this;
  }
  
  public A removeAllFromSteps(Collection<String> items) {
    if (this.steps == null) return (A)this;
    for (String item : items) { this.steps.remove(item);} return (A)this;
  }
  
  public List<String> getSteps() {
    return this.steps;
  }
  
  public String getStep(int index) {
    return this.steps.get(index);
  }
  
  public String getFirstStep() {
    return this.steps.get(0);
  }
  
  public String getLastStep() {
    return this.steps.get(steps.size() - 1);
  }
  
  public String getMatchingStep(Predicate<String> predicate) {
      for (String item : steps) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingStep(Predicate<String> predicate) {
      for (String item : steps) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSteps(List<String> steps) {
    if (steps != null) {
        this.steps = new ArrayList();
        for (String item : steps) {
          this.addToSteps(item);
        }
    } else {
      this.steps = null;
    }
    return (A) this;
  }
  
  public A withSteps(java.lang.String... steps) {
    if (this.steps != null) {
        this.steps.clear();
        _visitables.remove("steps");
    }
    if (steps != null) {
      for (String item : steps) {
        this.addToSteps(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSteps() {
    return this.steps != null && !this.steps.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    PackageFluent that = (PackageFluent) o;
    if (!java.util.Objects.equals(baseImage, that.baseImage)) return false;
    if (!java.util.Objects.equals(buildDir, that.buildDir)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(dependencies, that.dependencies)) return false;
    if (!java.util.Objects.equals(maven, that.maven)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(runtime, that.runtime)) return false;
    if (!java.util.Objects.equals(sources, that.sources)) return false;
    if (!java.util.Objects.equals(steps, that.steps)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(baseImage,  buildDir,  configuration,  dependencies,  maven,  name,  runtime,  sources,  steps,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (baseImage != null) { sb.append("baseImage:"); sb.append(baseImage + ","); }
    if (buildDir != null) { sb.append("buildDir:"); sb.append(buildDir + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (dependencies != null && !dependencies.isEmpty()) { sb.append("dependencies:"); sb.append(dependencies + ","); }
    if (maven != null) { sb.append("maven:"); sb.append(maven + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (runtime != null) { sb.append("runtime:"); sb.append(runtime + ","); }
    if (sources != null && !sources.isEmpty()) { sb.append("sources:"); sb.append(sources + ","); }
    if (steps != null && !steps.isEmpty()) { sb.append("steps:"); sb.append(steps); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) PackageFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }
  public class MavenNested<N> extends MavenFluent<MavenNested<N>> implements Nested<N>{
    MavenNested(Maven item) {
      this.builder = new MavenBuilder(this, item);
    }
    MavenBuilder builder;
    
    public N and() {
      return (N) PackageFluent.this.withMaven(builder.build());
    }
    
    public N endPackage_Maven() {
      return and();
    }
    
  
  }
  public class RuntimeNested<N> extends RuntimeFluent<RuntimeNested<N>> implements Nested<N>{
    RuntimeNested(Runtime item) {
      this.builder = new RuntimeBuilder(this, item);
    }
    RuntimeBuilder builder;
    
    public N and() {
      return (N) PackageFluent.this.withRuntime(builder.build());
    }
    
    public N endPackage_Runtime() {
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
      return (N) PackageFluent.this.setToSources(index,builder.build());
    }
    
    public N endPackage_Source() {
      return and();
    }
    
  
  }

}