package org.apache.camel.v1.integrationspec.traits;

import org.apache.camel.v1.integrationspec.traits.cron.ConfigurationBuilder;
import org.apache.camel.v1.integrationspec.traits.cron.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.integrationspec.traits.cron.ConfigurationFluent;
import java.lang.Integer;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CronFluent<A extends CronFluent<A>> extends BaseFluent<A>{
  public CronFluent() {
  }
  
  public CronFluent(Cron instance) {
    this.copyInstance(instance);
  }
  private Long activeDeadlineSeconds;
  private Boolean auto;
  private Integer backoffLimit;
  private String components;
  private Cron.ConcurrencyPolicy concurrencyPolicy;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private Boolean fallback;
  private String schedule;
  private Long startingDeadlineSeconds;
  
  protected void copyInstance(Cron instance) {
    instance = (instance != null ? instance : new Cron());
    if (instance != null) {
          this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());
          this.withAuto(instance.getAuto());
          this.withBackoffLimit(instance.getBackoffLimit());
          this.withComponents(instance.getComponents());
          this.withConcurrencyPolicy(instance.getConcurrencyPolicy());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withFallback(instance.getFallback());
          this.withSchedule(instance.getSchedule());
          this.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds());
        }
  }
  
  public Long getActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds;
  }
  
  public A withActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return (A) this;
  }
  
  public boolean hasActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds != null;
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
  
  public Integer getBackoffLimit() {
    return this.backoffLimit;
  }
  
  public A withBackoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
    return (A) this;
  }
  
  public boolean hasBackoffLimit() {
    return this.backoffLimit != null;
  }
  
  public String getComponents() {
    return this.components;
  }
  
  public A withComponents(String components) {
    this.components = components;
    return (A) this;
  }
  
  public boolean hasComponents() {
    return this.components != null;
  }
  
  public Cron.ConcurrencyPolicy getConcurrencyPolicy() {
    return this.concurrencyPolicy;
  }
  
  public A withConcurrencyPolicy(Cron.ConcurrencyPolicy concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
    return (A) this;
  }
  
  public boolean hasConcurrencyPolicy() {
    return this.concurrencyPolicy != null;
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
  
  public Boolean getFallback() {
    return this.fallback;
  }
  
  public A withFallback(Boolean fallback) {
    this.fallback = fallback;
    return (A) this;
  }
  
  public boolean hasFallback() {
    return this.fallback != null;
  }
  
  public String getSchedule() {
    return this.schedule;
  }
  
  public A withSchedule(String schedule) {
    this.schedule = schedule;
    return (A) this;
  }
  
  public boolean hasSchedule() {
    return this.schedule != null;
  }
  
  public Long getStartingDeadlineSeconds() {
    return this.startingDeadlineSeconds;
  }
  
  public A withStartingDeadlineSeconds(Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
    return (A) this;
  }
  
  public boolean hasStartingDeadlineSeconds() {
    return this.startingDeadlineSeconds != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CronFluent that = (CronFluent) o;
    if (!java.util.Objects.equals(activeDeadlineSeconds, that.activeDeadlineSeconds)) return false;
    if (!java.util.Objects.equals(auto, that.auto)) return false;
    if (!java.util.Objects.equals(backoffLimit, that.backoffLimit)) return false;
    if (!java.util.Objects.equals(components, that.components)) return false;
    if (!java.util.Objects.equals(concurrencyPolicy, that.concurrencyPolicy)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(fallback, that.fallback)) return false;
    if (!java.util.Objects.equals(schedule, that.schedule)) return false;
    if (!java.util.Objects.equals(startingDeadlineSeconds, that.startingDeadlineSeconds)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(activeDeadlineSeconds,  auto,  backoffLimit,  components,  concurrencyPolicy,  configuration,  enabled,  fallback,  schedule,  startingDeadlineSeconds,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (activeDeadlineSeconds != null) { sb.append("activeDeadlineSeconds:"); sb.append(activeDeadlineSeconds + ","); }
    if (auto != null) { sb.append("auto:"); sb.append(auto + ","); }
    if (backoffLimit != null) { sb.append("backoffLimit:"); sb.append(backoffLimit + ","); }
    if (components != null) { sb.append("components:"); sb.append(components + ","); }
    if (concurrencyPolicy != null) { sb.append("concurrencyPolicy:"); sb.append(concurrencyPolicy + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (fallback != null) { sb.append("fallback:"); sb.append(fallback + ","); }
    if (schedule != null) { sb.append("schedule:"); sb.append(schedule + ","); }
    if (startingDeadlineSeconds != null) { sb.append("startingDeadlineSeconds:"); sb.append(startingDeadlineSeconds); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAuto() {
    return withAuto(true);
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withFallback() {
    return withFallback(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) CronFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}