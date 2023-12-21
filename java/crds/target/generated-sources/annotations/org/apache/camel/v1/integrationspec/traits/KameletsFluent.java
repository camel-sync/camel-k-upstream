package org.apache.camel.v1.integrationspec.traits;

import org.apache.camel.v1.integrationspec.traits.kamelets.ConfigurationBuilder;
import org.apache.camel.v1.integrationspec.traits.kamelets.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.integrationspec.traits.kamelets.ConfigurationFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class KameletsFluent<A extends KameletsFluent<A>> extends BaseFluent<A>{
  public KameletsFluent() {
  }
  
  public KameletsFluent(Kamelets instance) {
    this.copyInstance(instance);
  }
  private Boolean auto;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private String list;
  private String mountPoint;
  
  protected void copyInstance(Kamelets instance) {
    instance = (instance != null ? instance : new Kamelets());
    if (instance != null) {
          this.withAuto(instance.getAuto());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withList(instance.getList());
          this.withMountPoint(instance.getMountPoint());
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
  
  public String getList() {
    return this.list;
  }
  
  public A withList(String list) {
    this.list = list;
    return (A) this;
  }
  
  public boolean hasList() {
    return this.list != null;
  }
  
  public String getMountPoint() {
    return this.mountPoint;
  }
  
  public A withMountPoint(String mountPoint) {
    this.mountPoint = mountPoint;
    return (A) this;
  }
  
  public boolean hasMountPoint() {
    return this.mountPoint != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletsFluent that = (KameletsFluent) o;
    if (!java.util.Objects.equals(auto, that.auto)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(list, that.list)) return false;
    if (!java.util.Objects.equals(mountPoint, that.mountPoint)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(auto,  configuration,  enabled,  list,  mountPoint,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (auto != null) { sb.append("auto:"); sb.append(auto + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (list != null) { sb.append("list:"); sb.append(list + ","); }
    if (mountPoint != null) { sb.append("mountPoint:"); sb.append(mountPoint); }
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
      return (N) KameletsFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}