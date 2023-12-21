package org.apache.camel.v1.integrationplatformstatus;

import org.apache.camel.v1.integrationplatformstatus.build.Maven;
import java.lang.SuppressWarnings;
import org.apache.camel.v1.integrationplatformstatus.build.BuildConfigurationFluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import org.apache.camel.v1.integrationplatformstatus.build.BuildConfiguration;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1.integrationplatformstatus.build.MavenBuilder;
import org.apache.camel.v1.integrationplatformstatus.build.BuildConfigurationBuilder;
import org.apache.camel.v1.integrationplatformstatus.build.Registry;
import org.apache.camel.v1.integrationplatformstatus.build.MavenFluent;
import org.apache.camel.v1.integrationplatformstatus.build.RegistryFluent;
import java.lang.Integer;
import java.lang.Object;
import org.apache.camel.v1.integrationplatformstatus.build.RegistryBuilder;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class BuildFluent<A extends BuildFluent<A>> extends BaseFluent<A>{
  public BuildFluent() {
  }
  
  public BuildFluent(Build instance) {
    this.copyInstance(instance);
  }
  private Map<String,String> PublishStrategyOptions;
  private String baseImage;
  private String buildCatalogToolTimeout;
  private BuildConfigurationBuilder buildConfiguration;
  private MavenBuilder maven;
  private Integer maxRunningBuilds;
  private String publishStrategy;
  private RegistryBuilder registry;
  private String runtimeProvider;
  private String runtimeVersion;
  private String timeout;
  
  protected void copyInstance(Build instance) {
    instance = (instance != null ? instance : new Build());
    if (instance != null) {
          this.withPublishStrategyOptions(instance.getPublishStrategyOptions());
          this.withBaseImage(instance.getBaseImage());
          this.withBuildCatalogToolTimeout(instance.getBuildCatalogToolTimeout());
          this.withBuildConfiguration(instance.getBuildConfiguration());
          this.withMaven(instance.getMaven());
          this.withMaxRunningBuilds(instance.getMaxRunningBuilds());
          this.withPublishStrategy(instance.getPublishStrategy());
          this.withRegistry(instance.getRegistry());
          this.withRuntimeProvider(instance.getRuntimeProvider());
          this.withRuntimeVersion(instance.getRuntimeVersion());
          this.withTimeout(instance.getTimeout());
        }
  }
  
  public A addToPublishStrategyOptions(String key,String value) {
    if(this.PublishStrategyOptions == null && key != null && value != null) { this.PublishStrategyOptions = new LinkedHashMap(); }
    if(key != null && value != null) {this.PublishStrategyOptions.put(key, value);} return (A)this;
  }
  
  public A addToPublishStrategyOptions(Map<String,String> map) {
    if(this.PublishStrategyOptions == null && map != null) { this.PublishStrategyOptions = new LinkedHashMap(); }
    if(map != null) { this.PublishStrategyOptions.putAll(map);} return (A)this;
  }
  
  public A removeFromPublishStrategyOptions(String key) {
    if(this.PublishStrategyOptions == null) { return (A) this; }
    if(key != null && this.PublishStrategyOptions != null) {this.PublishStrategyOptions.remove(key);} return (A)this;
  }
  
  public A removeFromPublishStrategyOptions(Map<String,String> map) {
    if(this.PublishStrategyOptions == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.PublishStrategyOptions != null){this.PublishStrategyOptions.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getPublishStrategyOptions() {
    return this.PublishStrategyOptions;
  }
  
  public <K,V>A withPublishStrategyOptions(Map<String,String> PublishStrategyOptions) {
    if (PublishStrategyOptions == null) {
      this.PublishStrategyOptions = null;
    } else {
      this.PublishStrategyOptions = new LinkedHashMap(PublishStrategyOptions);
    }
    return (A) this;
  }
  
  public boolean hasPublishStrategyOptions() {
    return this.PublishStrategyOptions != null;
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
  
  public String getBuildCatalogToolTimeout() {
    return this.buildCatalogToolTimeout;
  }
  
  public A withBuildCatalogToolTimeout(String buildCatalogToolTimeout) {
    this.buildCatalogToolTimeout = buildCatalogToolTimeout;
    return (A) this;
  }
  
  public boolean hasBuildCatalogToolTimeout() {
    return this.buildCatalogToolTimeout != null;
  }
  
  public BuildConfiguration buildBuildConfiguration() {
    return this.buildConfiguration != null ? this.buildConfiguration.build() : null;
  }
  
  public A withBuildConfiguration(BuildConfiguration buildConfiguration) {
    this._visitables.remove("buildConfiguration");
    if (buildConfiguration != null) {
        this.buildConfiguration = new BuildConfigurationBuilder(buildConfiguration);
        this._visitables.get("buildConfiguration").add(this.buildConfiguration);
    } else {
        this.buildConfiguration = null;
        this._visitables.get("buildConfiguration").remove(this.buildConfiguration);
    }
    return (A) this;
  }
  
  public boolean hasBuildConfiguration() {
    return this.buildConfiguration != null;
  }
  
  public BuildConfigurationNested<A> withNewBuildConfiguration() {
    return new BuildConfigurationNested(null);
  }
  
  public BuildConfigurationNested<A> withNewBuildConfigurationLike(BuildConfiguration item) {
    return new BuildConfigurationNested(item);
  }
  
  public BuildConfigurationNested<A> editIntegrationplatformstatusBuildConfiguration() {
    return withNewBuildConfigurationLike(java.util.Optional.ofNullable(buildBuildConfiguration()).orElse(null));
  }
  
  public BuildConfigurationNested<A> editOrNewBuildConfiguration() {
    return withNewBuildConfigurationLike(java.util.Optional.ofNullable(buildBuildConfiguration()).orElse(new BuildConfigurationBuilder().build()));
  }
  
  public BuildConfigurationNested<A> editOrNewBuildConfigurationLike(BuildConfiguration item) {
    return withNewBuildConfigurationLike(java.util.Optional.ofNullable(buildBuildConfiguration()).orElse(item));
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
  
  public MavenNested<A> editBuildMaven() {
    return withNewMavenLike(java.util.Optional.ofNullable(buildMaven()).orElse(null));
  }
  
  public MavenNested<A> editOrNewMaven() {
    return withNewMavenLike(java.util.Optional.ofNullable(buildMaven()).orElse(new MavenBuilder().build()));
  }
  
  public MavenNested<A> editOrNewMavenLike(Maven item) {
    return withNewMavenLike(java.util.Optional.ofNullable(buildMaven()).orElse(item));
  }
  
  public Integer getMaxRunningBuilds() {
    return this.maxRunningBuilds;
  }
  
  public A withMaxRunningBuilds(Integer maxRunningBuilds) {
    this.maxRunningBuilds = maxRunningBuilds;
    return (A) this;
  }
  
  public boolean hasMaxRunningBuilds() {
    return this.maxRunningBuilds != null;
  }
  
  public String getPublishStrategy() {
    return this.publishStrategy;
  }
  
  public A withPublishStrategy(String publishStrategy) {
    this.publishStrategy = publishStrategy;
    return (A) this;
  }
  
  public boolean hasPublishStrategy() {
    return this.publishStrategy != null;
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
  
  public RegistryNested<A> editBuildRegistry() {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(null));
  }
  
  public RegistryNested<A> editOrNewRegistry() {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(new RegistryBuilder().build()));
  }
  
  public RegistryNested<A> editOrNewRegistryLike(Registry item) {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(item));
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
  
  public String getTimeout() {
    return this.timeout;
  }
  
  public A withTimeout(String timeout) {
    this.timeout = timeout;
    return (A) this;
  }
  
  public boolean hasTimeout() {
    return this.timeout != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    BuildFluent that = (BuildFluent) o;
    if (!java.util.Objects.equals(PublishStrategyOptions, that.PublishStrategyOptions)) return false;
    if (!java.util.Objects.equals(baseImage, that.baseImage)) return false;
    if (!java.util.Objects.equals(buildCatalogToolTimeout, that.buildCatalogToolTimeout)) return false;
    if (!java.util.Objects.equals(buildConfiguration, that.buildConfiguration)) return false;
    if (!java.util.Objects.equals(maven, that.maven)) return false;
    if (!java.util.Objects.equals(maxRunningBuilds, that.maxRunningBuilds)) return false;
    if (!java.util.Objects.equals(publishStrategy, that.publishStrategy)) return false;
    if (!java.util.Objects.equals(registry, that.registry)) return false;
    if (!java.util.Objects.equals(runtimeProvider, that.runtimeProvider)) return false;
    if (!java.util.Objects.equals(runtimeVersion, that.runtimeVersion)) return false;
    if (!java.util.Objects.equals(timeout, that.timeout)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(PublishStrategyOptions,  baseImage,  buildCatalogToolTimeout,  buildConfiguration,  maven,  maxRunningBuilds,  publishStrategy,  registry,  runtimeProvider,  runtimeVersion,  timeout,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (PublishStrategyOptions != null && !PublishStrategyOptions.isEmpty()) { sb.append("PublishStrategyOptions:"); sb.append(PublishStrategyOptions + ","); }
    if (baseImage != null) { sb.append("baseImage:"); sb.append(baseImage + ","); }
    if (buildCatalogToolTimeout != null) { sb.append("buildCatalogToolTimeout:"); sb.append(buildCatalogToolTimeout + ","); }
    if (buildConfiguration != null) { sb.append("buildConfiguration:"); sb.append(buildConfiguration + ","); }
    if (maven != null) { sb.append("maven:"); sb.append(maven + ","); }
    if (maxRunningBuilds != null) { sb.append("maxRunningBuilds:"); sb.append(maxRunningBuilds + ","); }
    if (publishStrategy != null) { sb.append("publishStrategy:"); sb.append(publishStrategy + ","); }
    if (registry != null) { sb.append("registry:"); sb.append(registry + ","); }
    if (runtimeProvider != null) { sb.append("runtimeProvider:"); sb.append(runtimeProvider + ","); }
    if (runtimeVersion != null) { sb.append("runtimeVersion:"); sb.append(runtimeVersion + ","); }
    if (timeout != null) { sb.append("timeout:"); sb.append(timeout); }
    sb.append("}");
    return sb.toString();
  }
  public class BuildConfigurationNested<N> extends BuildConfigurationFluent<BuildConfigurationNested<N>> implements Nested<N>{
    BuildConfigurationNested(BuildConfiguration item) {
      this.builder = new BuildConfigurationBuilder(this, item);
    }
    BuildConfigurationBuilder builder;
    
    public N and() {
      return (N) BuildFluent.this.withBuildConfiguration(builder.build());
    }
    
    public N endIntegrationplatformstatusBuildConfiguration() {
      return and();
    }
    
  
  }
  public class MavenNested<N> extends MavenFluent<MavenNested<N>> implements Nested<N>{
    MavenNested(Maven item) {
      this.builder = new MavenBuilder(this, item);
    }
    MavenBuilder builder;
    
    public N and() {
      return (N) BuildFluent.this.withMaven(builder.build());
    }
    
    public N endBuildMaven() {
      return and();
    }
    
  
  }
  public class RegistryNested<N> extends RegistryFluent<RegistryNested<N>> implements Nested<N>{
    RegistryNested(Registry item) {
      this.builder = new RegistryBuilder(this, item);
    }
    RegistryBuilder builder;
    
    public N and() {
      return (N) BuildFluent.this.withRegistry(builder.build());
    }
    
    public N endBuildRegistry() {
      return and();
    }
    
  
  }

}