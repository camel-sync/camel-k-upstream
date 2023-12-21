package org.apache.camel.v1.buildspec.tasks;

import org.apache.camel.v1.buildspec.tasks.kaniko.ConfigurationBuilder;
import org.apache.camel.v1.buildspec.tasks.kaniko.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.buildspec.tasks.kaniko.ConfigurationFluent;
import org.apache.camel.v1.buildspec.tasks.kaniko.Registry;
import org.apache.camel.v1.buildspec.tasks.kaniko.CacheFluent;
import org.apache.camel.v1.buildspec.tasks.kaniko.RegistryFluent;
import org.apache.camel.v1.buildspec.tasks.kaniko.CacheBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import org.apache.camel.v1.buildspec.tasks.kaniko.RegistryBuilder;
import java.lang.Boolean;
import org.apache.camel.v1.buildspec.tasks.kaniko.Cache;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class KanikoFluent<A extends KanikoFluent<A>> extends BaseFluent<A>{
  public KanikoFluent() {
  }
  
  public KanikoFluent(Kaniko instance) {
    this.copyInstance(instance);
  }
  private String baseImage;
  private CacheBuilder cache;
  private ConfigurationBuilder configuration;
  private String contextDir;
  private String executorImage;
  private String image;
  private String name;
  private RegistryBuilder registry;
  private Boolean verbose;
  
  protected void copyInstance(Kaniko instance) {
    instance = (instance != null ? instance : new Kaniko());
    if (instance != null) {
          this.withBaseImage(instance.getBaseImage());
          this.withCache(instance.getCache());
          this.withConfiguration(instance.getConfiguration());
          this.withContextDir(instance.getContextDir());
          this.withExecutorImage(instance.getExecutorImage());
          this.withImage(instance.getImage());
          this.withName(instance.getName());
          this.withRegistry(instance.getRegistry());
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
  
  public Cache buildCache() {
    return this.cache != null ? this.cache.build() : null;
  }
  
  public A withCache(Cache cache) {
    this._visitables.remove("cache");
    if (cache != null) {
        this.cache = new CacheBuilder(cache);
        this._visitables.get("cache").add(this.cache);
    } else {
        this.cache = null;
        this._visitables.get("cache").remove(this.cache);
    }
    return (A) this;
  }
  
  public boolean hasCache() {
    return this.cache != null;
  }
  
  public CacheNested<A> withNewCache() {
    return new CacheNested(null);
  }
  
  public CacheNested<A> withNewCacheLike(Cache item) {
    return new CacheNested(item);
  }
  
  public CacheNested<A> editCache() {
    return withNewCacheLike(java.util.Optional.ofNullable(buildCache()).orElse(null));
  }
  
  public CacheNested<A> editOrNewCache() {
    return withNewCacheLike(java.util.Optional.ofNullable(buildCache()).orElse(new CacheBuilder().build()));
  }
  
  public CacheNested<A> editOrNewCacheLike(Cache item) {
    return withNewCacheLike(java.util.Optional.ofNullable(buildCache()).orElse(item));
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
  
  public String getContextDir() {
    return this.contextDir;
  }
  
  public A withContextDir(String contextDir) {
    this.contextDir = contextDir;
    return (A) this;
  }
  
  public boolean hasContextDir() {
    return this.contextDir != null;
  }
  
  public String getExecutorImage() {
    return this.executorImage;
  }
  
  public A withExecutorImage(String executorImage) {
    this.executorImage = executorImage;
    return (A) this;
  }
  
  public boolean hasExecutorImage() {
    return this.executorImage != null;
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
  
  public Registry buildRegistry() {
    return this.registry != null ? this.registry.build() : null;
  }
  
  public A withRegistry(Registry registry) {
    this._visitables.remove("registry");
    if (registry != null) {
        this.registry = new RegistryBuilder(registry);
        this._visitables.get("registry").add(this.registry);
    } else {
        this.registry = null;
        this._visitables.get("registry").remove(this.registry);
    }
    return (A) this;
  }
  
  public boolean hasRegistry() {
    return this.registry != null;
  }
  
  public RegistryNested<A> withNewRegistry() {
    return new RegistryNested(null);
  }
  
  public RegistryNested<A> withNewRegistryLike(Registry item) {
    return new RegistryNested(item);
  }
  
  public RegistryNested<A> editKanikoRegistry() {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(null));
  }
  
  public RegistryNested<A> editOrNewRegistry() {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(new RegistryBuilder().build()));
  }
  
  public RegistryNested<A> editOrNewRegistryLike(Registry item) {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(item));
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
    KanikoFluent that = (KanikoFluent) o;
    if (!java.util.Objects.equals(baseImage, that.baseImage)) return false;
    if (!java.util.Objects.equals(cache, that.cache)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(contextDir, that.contextDir)) return false;
    if (!java.util.Objects.equals(executorImage, that.executorImage)) return false;
    if (!java.util.Objects.equals(image, that.image)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(registry, that.registry)) return false;
    if (!java.util.Objects.equals(verbose, that.verbose)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(baseImage,  cache,  configuration,  contextDir,  executorImage,  image,  name,  registry,  verbose,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (baseImage != null) { sb.append("baseImage:"); sb.append(baseImage + ","); }
    if (cache != null) { sb.append("cache:"); sb.append(cache + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (contextDir != null) { sb.append("contextDir:"); sb.append(contextDir + ","); }
    if (executorImage != null) { sb.append("executorImage:"); sb.append(executorImage + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (registry != null) { sb.append("registry:"); sb.append(registry + ","); }
    if (verbose != null) { sb.append("verbose:"); sb.append(verbose); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withVerbose() {
    return withVerbose(true);
  }
  public class CacheNested<N> extends CacheFluent<CacheNested<N>> implements Nested<N>{
    CacheNested(Cache item) {
      this.builder = new CacheBuilder(this, item);
    }
    CacheBuilder builder;
    
    public N and() {
      return (N) KanikoFluent.this.withCache(builder.build());
    }
    
    public N endCache() {
      return and();
    }
    
  
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) KanikoFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }
  public class RegistryNested<N> extends RegistryFluent<RegistryNested<N>> implements Nested<N>{
    RegistryNested(Registry item) {
      this.builder = new RegistryBuilder(this, item);
    }
    RegistryBuilder builder;
    
    public N and() {
      return (N) KanikoFluent.this.withRegistry(builder.build());
    }
    
    public N endKanikoRegistry() {
      return and();
    }
    
  
  }

}