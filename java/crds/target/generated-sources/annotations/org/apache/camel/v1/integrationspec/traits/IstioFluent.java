package org.apache.camel.v1.integrationspec.traits;

import org.apache.camel.v1.integrationspec.traits.istio.ConfigurationBuilder;
import org.apache.camel.v1.integrationspec.traits.istio.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.integrationspec.traits.istio.ConfigurationFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class IstioFluent<A extends IstioFluent<A>> extends BaseFluent<A>{
  public IstioFluent() {
  }
  
  public IstioFluent(Istio instance) {
    this.copyInstance(instance);
  }
  private String allow;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private Boolean inject;
  
  protected void copyInstance(Istio instance) {
    instance = (instance != null ? instance : new Istio());
    if (instance != null) {
          this.withAllow(instance.getAllow());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withInject(instance.getInject());
        }
  }
  
  public String getAllow() {
    return this.allow;
  }
  
  public A withAllow(String allow) {
    this.allow = allow;
    return (A) this;
  }
  
  public boolean hasAllow() {
    return this.allow != null;
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
  
  public Boolean getInject() {
    return this.inject;
  }
  
  public A withInject(Boolean inject) {
    this.inject = inject;
    return (A) this;
  }
  
  public boolean hasInject() {
    return this.inject != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    IstioFluent that = (IstioFluent) o;
    if (!java.util.Objects.equals(allow, that.allow)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(inject, that.inject)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(allow,  configuration,  enabled,  inject,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allow != null) { sb.append("allow:"); sb.append(allow + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (inject != null) { sb.append("inject:"); sb.append(inject); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withInject() {
    return withInject(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) IstioFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}