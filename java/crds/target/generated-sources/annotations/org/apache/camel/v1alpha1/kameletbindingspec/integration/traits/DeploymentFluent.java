package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.deployment.ConfigurationBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.deployment.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.deployment.ConfigurationFluent;
import java.lang.Integer;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class DeploymentFluent<A extends DeploymentFluent<A>> extends BaseFluent<A>{
  public DeploymentFluent() {
  }
  
  public DeploymentFluent(Deployment instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private Integer progressDeadlineSeconds;
  private Long rollingUpdateMaxSurge;
  private Long rollingUpdateMaxUnavailable;
  private Deployment.Strategy strategy;
  
  protected void copyInstance(Deployment instance) {
    instance = (instance != null ? instance : new Deployment());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds());
          this.withRollingUpdateMaxSurge(instance.getRollingUpdateMaxSurge());
          this.withRollingUpdateMaxUnavailable(instance.getRollingUpdateMaxUnavailable());
          this.withStrategy(instance.getStrategy());
        }
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
  
  public Integer getProgressDeadlineSeconds() {
    return this.progressDeadlineSeconds;
  }
  
  public A withProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
    return (A) this;
  }
  
  public boolean hasProgressDeadlineSeconds() {
    return this.progressDeadlineSeconds != null;
  }
  
  public Long getRollingUpdateMaxSurge() {
    return this.rollingUpdateMaxSurge;
  }
  
  public A withRollingUpdateMaxSurge(Long rollingUpdateMaxSurge) {
    this.rollingUpdateMaxSurge = rollingUpdateMaxSurge;
    return (A) this;
  }
  
  public boolean hasRollingUpdateMaxSurge() {
    return this.rollingUpdateMaxSurge != null;
  }
  
  public Long getRollingUpdateMaxUnavailable() {
    return this.rollingUpdateMaxUnavailable;
  }
  
  public A withRollingUpdateMaxUnavailable(Long rollingUpdateMaxUnavailable) {
    this.rollingUpdateMaxUnavailable = rollingUpdateMaxUnavailable;
    return (A) this;
  }
  
  public boolean hasRollingUpdateMaxUnavailable() {
    return this.rollingUpdateMaxUnavailable != null;
  }
  
  public Deployment.Strategy getStrategy() {
    return this.strategy;
  }
  
  public A withStrategy(Deployment.Strategy strategy) {
    this.strategy = strategy;
    return (A) this;
  }
  
  public boolean hasStrategy() {
    return this.strategy != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    DeploymentFluent that = (DeploymentFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(progressDeadlineSeconds, that.progressDeadlineSeconds)) return false;
    if (!java.util.Objects.equals(rollingUpdateMaxSurge, that.rollingUpdateMaxSurge)) return false;
    if (!java.util.Objects.equals(rollingUpdateMaxUnavailable, that.rollingUpdateMaxUnavailable)) return false;
    if (!java.util.Objects.equals(strategy, that.strategy)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  enabled,  progressDeadlineSeconds,  rollingUpdateMaxSurge,  rollingUpdateMaxUnavailable,  strategy,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (progressDeadlineSeconds != null) { sb.append("progressDeadlineSeconds:"); sb.append(progressDeadlineSeconds + ","); }
    if (rollingUpdateMaxSurge != null) { sb.append("rollingUpdateMaxSurge:"); sb.append(rollingUpdateMaxSurge + ","); }
    if (rollingUpdateMaxUnavailable != null) { sb.append("rollingUpdateMaxUnavailable:"); sb.append(rollingUpdateMaxUnavailable + ","); }
    if (strategy != null) { sb.append("strategy:"); sb.append(strategy); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) DeploymentFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}