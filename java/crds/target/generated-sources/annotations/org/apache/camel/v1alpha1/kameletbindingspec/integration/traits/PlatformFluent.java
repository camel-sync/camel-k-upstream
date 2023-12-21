package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.platform.ConfigurationBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.platform.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.platform.ConfigurationFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PlatformFluent<A extends PlatformFluent<A>> extends BaseFluent<A>{
  public PlatformFluent() {
  }
  
  public PlatformFluent(Platform instance) {
    this.copyInstance(instance);
  }
  private Boolean auto;
  private ConfigurationBuilder configuration;
  private Boolean createDefault;
  private Boolean enabled;
  private Boolean global;
  
  protected void copyInstance(Platform instance) {
    instance = (instance != null ? instance : new Platform());
    if (instance != null) {
          this.withAuto(instance.getAuto());
          this.withConfiguration(instance.getConfiguration());
          this.withCreateDefault(instance.getCreateDefault());
          this.withEnabled(instance.getEnabled());
          this.withGlobal(instance.getGlobal());
        }
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
  
  public Boolean getCreateDefault() {
    return this.createDefault;
  }
  
  public A withCreateDefault(Boolean createDefault) {
    this.createDefault = createDefault;
    return (A) this;
  }
  
  public boolean hasCreateDefault() {
    return this.createDefault != null;
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
  
  public Boolean getGlobal() {
    return this.global;
  }
  
  public A withGlobal(Boolean global) {
    this.global = global;
    return (A) this;
  }
  
  public boolean hasGlobal() {
    return this.global != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    PlatformFluent that = (PlatformFluent) o;
    if (!java.util.Objects.equals(auto, that.auto)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(createDefault, that.createDefault)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(global, that.global)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(auto,  configuration,  createDefault,  enabled,  global,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (auto != null) { sb.append("auto:"); sb.append(auto + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (createDefault != null) { sb.append("createDefault:"); sb.append(createDefault + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (global != null) { sb.append("global:"); sb.append(global); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAuto() {
    return withAuto(true);
  }
  
  public A withCreateDefault() {
    return withCreateDefault(true);
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withGlobal() {
    return withGlobal(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) PlatformFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}