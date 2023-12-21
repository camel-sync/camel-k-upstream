package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.master.ConfigurationBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.master.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Object;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.master.ConfigurationFluent;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class MasterFluent<A extends MasterFluent<A>> extends BaseFluent<A>{
  public MasterFluent() {
  }
  
  public MasterFluent(Master instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  
  protected void copyInstance(Master instance) {
    instance = (instance != null ? instance : new Master());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    MasterFluent that = (MasterFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) MasterFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}