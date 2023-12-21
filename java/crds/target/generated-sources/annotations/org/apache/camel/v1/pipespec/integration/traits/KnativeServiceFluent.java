package org.apache.camel.v1.pipespec.integration.traits;

import org.apache.camel.v1.pipespec.integration.traits.knativeservice.ConfigurationBuilder;
import org.apache.camel.v1.pipespec.integration.traits.knativeservice.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.pipespec.integration.traits.knativeservice.ConfigurationFluent;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class KnativeServiceFluent<A extends KnativeServiceFluent<A>> extends BaseFluent<A>{
  public KnativeServiceFluent() {
  }
  
  public KnativeServiceFluent(KnativeService instance) {
    this.copyInstance(instance);
  }
  private Map<String,String> annotations;
  private Boolean auto;
  private String autoscalingMetric;
  private Long autoscalingTarget;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private Long maxScale;
  private Long minScale;
  private String rolloutDuration;
  private KnativeService.Visibility visibility;
  
  protected void copyInstance(KnativeService instance) {
    instance = (instance != null ? instance : new KnativeService());
    if (instance != null) {
          this.withAnnotations(instance.getAnnotations());
          this.withAuto(instance.getAuto());
          this.withAutoscalingMetric(instance.getAutoscalingMetric());
          this.withAutoscalingTarget(instance.getAutoscalingTarget());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withMaxScale(instance.getMaxScale());
          this.withMinScale(instance.getMinScale());
          this.withRolloutDuration(instance.getRolloutDuration());
          this.withVisibility(instance.getVisibility());
        }
  }
  
  public A addToAnnotations(String key,String value) {
    if(this.annotations == null && key != null && value != null) { this.annotations = new LinkedHashMap(); }
    if(key != null && value != null) {this.annotations.put(key, value);} return (A)this;
  }
  
  public A addToAnnotations(Map<String,String> map) {
    if(this.annotations == null && map != null) { this.annotations = new LinkedHashMap(); }
    if(map != null) { this.annotations.putAll(map);} return (A)this;
  }
  
  public A removeFromAnnotations(String key) {
    if(this.annotations == null) { return (A) this; }
    if(key != null && this.annotations != null) {this.annotations.remove(key);} return (A)this;
  }
  
  public A removeFromAnnotations(Map<String,String> map) {
    if(this.annotations == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.annotations != null){this.annotations.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getAnnotations() {
    return this.annotations;
  }
  
  public <K,V>A withAnnotations(Map<String,String> annotations) {
    if (annotations == null) {
      this.annotations = null;
    } else {
      this.annotations = new LinkedHashMap(annotations);
    }
    return (A) this;
  }
  
  public boolean hasAnnotations() {
    return this.annotations != null;
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
  
  public String getAutoscalingMetric() {
    return this.autoscalingMetric;
  }
  
  public A withAutoscalingMetric(String autoscalingMetric) {
    this.autoscalingMetric = autoscalingMetric;
    return (A) this;
  }
  
  public boolean hasAutoscalingMetric() {
    return this.autoscalingMetric != null;
  }
  
  public Long getAutoscalingTarget() {
    return this.autoscalingTarget;
  }
  
  public A withAutoscalingTarget(Long autoscalingTarget) {
    this.autoscalingTarget = autoscalingTarget;
    return (A) this;
  }
  
  public boolean hasAutoscalingTarget() {
    return this.autoscalingTarget != null;
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
  
  public Long getMaxScale() {
    return this.maxScale;
  }
  
  public A withMaxScale(Long maxScale) {
    this.maxScale = maxScale;
    return (A) this;
  }
  
  public boolean hasMaxScale() {
    return this.maxScale != null;
  }
  
  public Long getMinScale() {
    return this.minScale;
  }
  
  public A withMinScale(Long minScale) {
    this.minScale = minScale;
    return (A) this;
  }
  
  public boolean hasMinScale() {
    return this.minScale != null;
  }
  
  public String getRolloutDuration() {
    return this.rolloutDuration;
  }
  
  public A withRolloutDuration(String rolloutDuration) {
    this.rolloutDuration = rolloutDuration;
    return (A) this;
  }
  
  public boolean hasRolloutDuration() {
    return this.rolloutDuration != null;
  }
  
  public KnativeService.Visibility getVisibility() {
    return this.visibility;
  }
  
  public A withVisibility(KnativeService.Visibility visibility) {
    this.visibility = visibility;
    return (A) this;
  }
  
  public boolean hasVisibility() {
    return this.visibility != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KnativeServiceFluent that = (KnativeServiceFluent) o;
    if (!java.util.Objects.equals(annotations, that.annotations)) return false;
    if (!java.util.Objects.equals(auto, that.auto)) return false;
    if (!java.util.Objects.equals(autoscalingMetric, that.autoscalingMetric)) return false;
    if (!java.util.Objects.equals(autoscalingTarget, that.autoscalingTarget)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(maxScale, that.maxScale)) return false;
    if (!java.util.Objects.equals(minScale, that.minScale)) return false;
    if (!java.util.Objects.equals(rolloutDuration, that.rolloutDuration)) return false;
    if (!java.util.Objects.equals(visibility, that.visibility)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(annotations,  auto,  autoscalingMetric,  autoscalingTarget,  configuration,  enabled,  maxScale,  minScale,  rolloutDuration,  visibility,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (annotations != null && !annotations.isEmpty()) { sb.append("annotations:"); sb.append(annotations + ","); }
    if (auto != null) { sb.append("auto:"); sb.append(auto + ","); }
    if (autoscalingMetric != null) { sb.append("autoscalingMetric:"); sb.append(autoscalingMetric + ","); }
    if (autoscalingTarget != null) { sb.append("autoscalingTarget:"); sb.append(autoscalingTarget + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (maxScale != null) { sb.append("maxScale:"); sb.append(maxScale + ","); }
    if (minScale != null) { sb.append("minScale:"); sb.append(minScale + ","); }
    if (rolloutDuration != null) { sb.append("rolloutDuration:"); sb.append(rolloutDuration + ","); }
    if (visibility != null) { sb.append("visibility:"); sb.append(visibility); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAuto() {
    return withAuto(true);
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
      return (N) KnativeServiceFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}