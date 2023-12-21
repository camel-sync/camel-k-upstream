package org.apache.camel.v1.integrationplatformstatus.traits;

import org.apache.camel.v1.integrationplatformstatus.traits.health.ConfigurationBuilder;
import org.apache.camel.v1.integrationplatformstatus.traits.health.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.integrationplatformstatus.traits.health.ConfigurationFluent;
import java.lang.Integer;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class HealthFluent<A extends HealthFluent<A>> extends BaseFluent<A>{
  public HealthFluent() {
  }
  
  public HealthFluent(Health instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private Integer livenessFailureThreshold;
  private Integer livenessInitialDelay;
  private Integer livenessPeriod;
  private Boolean livenessProbeEnabled;
  private String livenessScheme;
  private Integer livenessSuccessThreshold;
  private Integer livenessTimeout;
  private Integer readinessFailureThreshold;
  private Integer readinessInitialDelay;
  private Integer readinessPeriod;
  private Boolean readinessProbeEnabled;
  private String readinessScheme;
  private Integer readinessSuccessThreshold;
  private Integer readinessTimeout;
  private Integer startupFailureThreshold;
  private Integer startupInitialDelay;
  private Integer startupPeriod;
  private Boolean startupProbeEnabled;
  private String startupScheme;
  private Integer startupSuccessThreshold;
  private Integer startupTimeout;
  
  protected void copyInstance(Health instance) {
    instance = (instance != null ? instance : new Health());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withLivenessFailureThreshold(instance.getLivenessFailureThreshold());
          this.withLivenessInitialDelay(instance.getLivenessInitialDelay());
          this.withLivenessPeriod(instance.getLivenessPeriod());
          this.withLivenessProbeEnabled(instance.getLivenessProbeEnabled());
          this.withLivenessScheme(instance.getLivenessScheme());
          this.withLivenessSuccessThreshold(instance.getLivenessSuccessThreshold());
          this.withLivenessTimeout(instance.getLivenessTimeout());
          this.withReadinessFailureThreshold(instance.getReadinessFailureThreshold());
          this.withReadinessInitialDelay(instance.getReadinessInitialDelay());
          this.withReadinessPeriod(instance.getReadinessPeriod());
          this.withReadinessProbeEnabled(instance.getReadinessProbeEnabled());
          this.withReadinessScheme(instance.getReadinessScheme());
          this.withReadinessSuccessThreshold(instance.getReadinessSuccessThreshold());
          this.withReadinessTimeout(instance.getReadinessTimeout());
          this.withStartupFailureThreshold(instance.getStartupFailureThreshold());
          this.withStartupInitialDelay(instance.getStartupInitialDelay());
          this.withStartupPeriod(instance.getStartupPeriod());
          this.withStartupProbeEnabled(instance.getStartupProbeEnabled());
          this.withStartupScheme(instance.getStartupScheme());
          this.withStartupSuccessThreshold(instance.getStartupSuccessThreshold());
          this.withStartupTimeout(instance.getStartupTimeout());
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
  
  public Integer getLivenessFailureThreshold() {
    return this.livenessFailureThreshold;
  }
  
  public A withLivenessFailureThreshold(Integer livenessFailureThreshold) {
    this.livenessFailureThreshold = livenessFailureThreshold;
    return (A) this;
  }
  
  public boolean hasLivenessFailureThreshold() {
    return this.livenessFailureThreshold != null;
  }
  
  public Integer getLivenessInitialDelay() {
    return this.livenessInitialDelay;
  }
  
  public A withLivenessInitialDelay(Integer livenessInitialDelay) {
    this.livenessInitialDelay = livenessInitialDelay;
    return (A) this;
  }
  
  public boolean hasLivenessInitialDelay() {
    return this.livenessInitialDelay != null;
  }
  
  public Integer getLivenessPeriod() {
    return this.livenessPeriod;
  }
  
  public A withLivenessPeriod(Integer livenessPeriod) {
    this.livenessPeriod = livenessPeriod;
    return (A) this;
  }
  
  public boolean hasLivenessPeriod() {
    return this.livenessPeriod != null;
  }
  
  public Boolean getLivenessProbeEnabled() {
    return this.livenessProbeEnabled;
  }
  
  public A withLivenessProbeEnabled(Boolean livenessProbeEnabled) {
    this.livenessProbeEnabled = livenessProbeEnabled;
    return (A) this;
  }
  
  public boolean hasLivenessProbeEnabled() {
    return this.livenessProbeEnabled != null;
  }
  
  public String getLivenessScheme() {
    return this.livenessScheme;
  }
  
  public A withLivenessScheme(String livenessScheme) {
    this.livenessScheme = livenessScheme;
    return (A) this;
  }
  
  public boolean hasLivenessScheme() {
    return this.livenessScheme != null;
  }
  
  public Integer getLivenessSuccessThreshold() {
    return this.livenessSuccessThreshold;
  }
  
  public A withLivenessSuccessThreshold(Integer livenessSuccessThreshold) {
    this.livenessSuccessThreshold = livenessSuccessThreshold;
    return (A) this;
  }
  
  public boolean hasLivenessSuccessThreshold() {
    return this.livenessSuccessThreshold != null;
  }
  
  public Integer getLivenessTimeout() {
    return this.livenessTimeout;
  }
  
  public A withLivenessTimeout(Integer livenessTimeout) {
    this.livenessTimeout = livenessTimeout;
    return (A) this;
  }
  
  public boolean hasLivenessTimeout() {
    return this.livenessTimeout != null;
  }
  
  public Integer getReadinessFailureThreshold() {
    return this.readinessFailureThreshold;
  }
  
  public A withReadinessFailureThreshold(Integer readinessFailureThreshold) {
    this.readinessFailureThreshold = readinessFailureThreshold;
    return (A) this;
  }
  
  public boolean hasReadinessFailureThreshold() {
    return this.readinessFailureThreshold != null;
  }
  
  public Integer getReadinessInitialDelay() {
    return this.readinessInitialDelay;
  }
  
  public A withReadinessInitialDelay(Integer readinessInitialDelay) {
    this.readinessInitialDelay = readinessInitialDelay;
    return (A) this;
  }
  
  public boolean hasReadinessInitialDelay() {
    return this.readinessInitialDelay != null;
  }
  
  public Integer getReadinessPeriod() {
    return this.readinessPeriod;
  }
  
  public A withReadinessPeriod(Integer readinessPeriod) {
    this.readinessPeriod = readinessPeriod;
    return (A) this;
  }
  
  public boolean hasReadinessPeriod() {
    return this.readinessPeriod != null;
  }
  
  public Boolean getReadinessProbeEnabled() {
    return this.readinessProbeEnabled;
  }
  
  public A withReadinessProbeEnabled(Boolean readinessProbeEnabled) {
    this.readinessProbeEnabled = readinessProbeEnabled;
    return (A) this;
  }
  
  public boolean hasReadinessProbeEnabled() {
    return this.readinessProbeEnabled != null;
  }
  
  public String getReadinessScheme() {
    return this.readinessScheme;
  }
  
  public A withReadinessScheme(String readinessScheme) {
    this.readinessScheme = readinessScheme;
    return (A) this;
  }
  
  public boolean hasReadinessScheme() {
    return this.readinessScheme != null;
  }
  
  public Integer getReadinessSuccessThreshold() {
    return this.readinessSuccessThreshold;
  }
  
  public A withReadinessSuccessThreshold(Integer readinessSuccessThreshold) {
    this.readinessSuccessThreshold = readinessSuccessThreshold;
    return (A) this;
  }
  
  public boolean hasReadinessSuccessThreshold() {
    return this.readinessSuccessThreshold != null;
  }
  
  public Integer getReadinessTimeout() {
    return this.readinessTimeout;
  }
  
  public A withReadinessTimeout(Integer readinessTimeout) {
    this.readinessTimeout = readinessTimeout;
    return (A) this;
  }
  
  public boolean hasReadinessTimeout() {
    return this.readinessTimeout != null;
  }
  
  public Integer getStartupFailureThreshold() {
    return this.startupFailureThreshold;
  }
  
  public A withStartupFailureThreshold(Integer startupFailureThreshold) {
    this.startupFailureThreshold = startupFailureThreshold;
    return (A) this;
  }
  
  public boolean hasStartupFailureThreshold() {
    return this.startupFailureThreshold != null;
  }
  
  public Integer getStartupInitialDelay() {
    return this.startupInitialDelay;
  }
  
  public A withStartupInitialDelay(Integer startupInitialDelay) {
    this.startupInitialDelay = startupInitialDelay;
    return (A) this;
  }
  
  public boolean hasStartupInitialDelay() {
    return this.startupInitialDelay != null;
  }
  
  public Integer getStartupPeriod() {
    return this.startupPeriod;
  }
  
  public A withStartupPeriod(Integer startupPeriod) {
    this.startupPeriod = startupPeriod;
    return (A) this;
  }
  
  public boolean hasStartupPeriod() {
    return this.startupPeriod != null;
  }
  
  public Boolean getStartupProbeEnabled() {
    return this.startupProbeEnabled;
  }
  
  public A withStartupProbeEnabled(Boolean startupProbeEnabled) {
    this.startupProbeEnabled = startupProbeEnabled;
    return (A) this;
  }
  
  public boolean hasStartupProbeEnabled() {
    return this.startupProbeEnabled != null;
  }
  
  public String getStartupScheme() {
    return this.startupScheme;
  }
  
  public A withStartupScheme(String startupScheme) {
    this.startupScheme = startupScheme;
    return (A) this;
  }
  
  public boolean hasStartupScheme() {
    return this.startupScheme != null;
  }
  
  public Integer getStartupSuccessThreshold() {
    return this.startupSuccessThreshold;
  }
  
  public A withStartupSuccessThreshold(Integer startupSuccessThreshold) {
    this.startupSuccessThreshold = startupSuccessThreshold;
    return (A) this;
  }
  
  public boolean hasStartupSuccessThreshold() {
    return this.startupSuccessThreshold != null;
  }
  
  public Integer getStartupTimeout() {
    return this.startupTimeout;
  }
  
  public A withStartupTimeout(Integer startupTimeout) {
    this.startupTimeout = startupTimeout;
    return (A) this;
  }
  
  public boolean hasStartupTimeout() {
    return this.startupTimeout != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    HealthFluent that = (HealthFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(livenessFailureThreshold, that.livenessFailureThreshold)) return false;
    if (!java.util.Objects.equals(livenessInitialDelay, that.livenessInitialDelay)) return false;
    if (!java.util.Objects.equals(livenessPeriod, that.livenessPeriod)) return false;
    if (!java.util.Objects.equals(livenessProbeEnabled, that.livenessProbeEnabled)) return false;
    if (!java.util.Objects.equals(livenessScheme, that.livenessScheme)) return false;
    if (!java.util.Objects.equals(livenessSuccessThreshold, that.livenessSuccessThreshold)) return false;
    if (!java.util.Objects.equals(livenessTimeout, that.livenessTimeout)) return false;
    if (!java.util.Objects.equals(readinessFailureThreshold, that.readinessFailureThreshold)) return false;
    if (!java.util.Objects.equals(readinessInitialDelay, that.readinessInitialDelay)) return false;
    if (!java.util.Objects.equals(readinessPeriod, that.readinessPeriod)) return false;
    if (!java.util.Objects.equals(readinessProbeEnabled, that.readinessProbeEnabled)) return false;
    if (!java.util.Objects.equals(readinessScheme, that.readinessScheme)) return false;
    if (!java.util.Objects.equals(readinessSuccessThreshold, that.readinessSuccessThreshold)) return false;
    if (!java.util.Objects.equals(readinessTimeout, that.readinessTimeout)) return false;
    if (!java.util.Objects.equals(startupFailureThreshold, that.startupFailureThreshold)) return false;
    if (!java.util.Objects.equals(startupInitialDelay, that.startupInitialDelay)) return false;
    if (!java.util.Objects.equals(startupPeriod, that.startupPeriod)) return false;
    if (!java.util.Objects.equals(startupProbeEnabled, that.startupProbeEnabled)) return false;
    if (!java.util.Objects.equals(startupScheme, that.startupScheme)) return false;
    if (!java.util.Objects.equals(startupSuccessThreshold, that.startupSuccessThreshold)) return false;
    if (!java.util.Objects.equals(startupTimeout, that.startupTimeout)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  enabled,  livenessFailureThreshold,  livenessInitialDelay,  livenessPeriod,  livenessProbeEnabled,  livenessScheme,  livenessSuccessThreshold,  livenessTimeout,  readinessFailureThreshold,  readinessInitialDelay,  readinessPeriod,  readinessProbeEnabled,  readinessScheme,  readinessSuccessThreshold,  readinessTimeout,  startupFailureThreshold,  startupInitialDelay,  startupPeriod,  startupProbeEnabled,  startupScheme,  startupSuccessThreshold,  startupTimeout,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (livenessFailureThreshold != null) { sb.append("livenessFailureThreshold:"); sb.append(livenessFailureThreshold + ","); }
    if (livenessInitialDelay != null) { sb.append("livenessInitialDelay:"); sb.append(livenessInitialDelay + ","); }
    if (livenessPeriod != null) { sb.append("livenessPeriod:"); sb.append(livenessPeriod + ","); }
    if (livenessProbeEnabled != null) { sb.append("livenessProbeEnabled:"); sb.append(livenessProbeEnabled + ","); }
    if (livenessScheme != null) { sb.append("livenessScheme:"); sb.append(livenessScheme + ","); }
    if (livenessSuccessThreshold != null) { sb.append("livenessSuccessThreshold:"); sb.append(livenessSuccessThreshold + ","); }
    if (livenessTimeout != null) { sb.append("livenessTimeout:"); sb.append(livenessTimeout + ","); }
    if (readinessFailureThreshold != null) { sb.append("readinessFailureThreshold:"); sb.append(readinessFailureThreshold + ","); }
    if (readinessInitialDelay != null) { sb.append("readinessInitialDelay:"); sb.append(readinessInitialDelay + ","); }
    if (readinessPeriod != null) { sb.append("readinessPeriod:"); sb.append(readinessPeriod + ","); }
    if (readinessProbeEnabled != null) { sb.append("readinessProbeEnabled:"); sb.append(readinessProbeEnabled + ","); }
    if (readinessScheme != null) { sb.append("readinessScheme:"); sb.append(readinessScheme + ","); }
    if (readinessSuccessThreshold != null) { sb.append("readinessSuccessThreshold:"); sb.append(readinessSuccessThreshold + ","); }
    if (readinessTimeout != null) { sb.append("readinessTimeout:"); sb.append(readinessTimeout + ","); }
    if (startupFailureThreshold != null) { sb.append("startupFailureThreshold:"); sb.append(startupFailureThreshold + ","); }
    if (startupInitialDelay != null) { sb.append("startupInitialDelay:"); sb.append(startupInitialDelay + ","); }
    if (startupPeriod != null) { sb.append("startupPeriod:"); sb.append(startupPeriod + ","); }
    if (startupProbeEnabled != null) { sb.append("startupProbeEnabled:"); sb.append(startupProbeEnabled + ","); }
    if (startupScheme != null) { sb.append("startupScheme:"); sb.append(startupScheme + ","); }
    if (startupSuccessThreshold != null) { sb.append("startupSuccessThreshold:"); sb.append(startupSuccessThreshold + ","); }
    if (startupTimeout != null) { sb.append("startupTimeout:"); sb.append(startupTimeout); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withLivenessProbeEnabled() {
    return withLivenessProbeEnabled(true);
  }
  
  public A withReadinessProbeEnabled() {
    return withReadinessProbeEnabled(true);
  }
  
  public A withStartupProbeEnabled() {
    return withStartupProbeEnabled(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) HealthFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}