package org.apache.camel.v1.integrationspec.traits;

import org.apache.camel.v1.integrationspec.traits.service.ConfigurationBuilder;
import org.apache.camel.v1.integrationspec.traits.service.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.integrationspec.traits.service.ConfigurationFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ServiceFluent<A extends ServiceFluent<A>> extends BaseFluent<A>{
  public ServiceFluent() {
  }
  
  public ServiceFluent(Service instance) {
    this.copyInstance(instance);
  }
  private Boolean auto;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private Boolean nodePort;
  private Service.Type type;
  
  protected void copyInstance(Service instance) {
    instance = (instance != null ? instance : new Service());
    if (instance != null) {
          this.withAuto(instance.getAuto());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withNodePort(instance.getNodePort());
          this.withType(instance.getType());
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
  
  public Boolean getNodePort() {
    return this.nodePort;
  }
  
  public A withNodePort(Boolean nodePort) {
    this.nodePort = nodePort;
    return (A) this;
  }
  
  public boolean hasNodePort() {
    return this.nodePort != null;
  }
  
  public Service.Type getType() {
    return this.type;
  }
  
  public A withType(Service.Type type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ServiceFluent that = (ServiceFluent) o;
    if (!java.util.Objects.equals(auto, that.auto)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(nodePort, that.nodePort)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(auto,  configuration,  enabled,  nodePort,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (auto != null) { sb.append("auto:"); sb.append(auto + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (nodePort != null) { sb.append("nodePort:"); sb.append(nodePort + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAuto() {
    return withAuto(true);
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withNodePort() {
    return withNodePort(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) ServiceFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}