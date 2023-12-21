package org.apache.camel.v1.integrationplatformspec.traits;

import org.apache.camel.v1.integrationplatformspec.traits.environment.ConfigurationBuilder;
import org.apache.camel.v1.integrationplatformspec.traits.environment.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.integrationplatformspec.traits.environment.ConfigurationFluent;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class EnvironmentFluent<A extends EnvironmentFluent<A>> extends BaseFluent<A>{
  public EnvironmentFluent() {
  }
  
  public EnvironmentFluent(Environment instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private Boolean containerMeta;
  private Boolean enabled;
  private Boolean httpProxy;
  private List<String> vars;
  
  protected void copyInstance(Environment instance) {
    instance = (instance != null ? instance : new Environment());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withContainerMeta(instance.getContainerMeta());
          this.withEnabled(instance.getEnabled());
          this.withHttpProxy(instance.getHttpProxy());
          this.withVars(instance.getVars());
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
  
  public Boolean getContainerMeta() {
    return this.containerMeta;
  }
  
  public A withContainerMeta(Boolean containerMeta) {
    this.containerMeta = containerMeta;
    return (A) this;
  }
  
  public boolean hasContainerMeta() {
    return this.containerMeta != null;
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
  
  public Boolean getHttpProxy() {
    return this.httpProxy;
  }
  
  public A withHttpProxy(Boolean httpProxy) {
    this.httpProxy = httpProxy;
    return (A) this;
  }
  
  public boolean hasHttpProxy() {
    return this.httpProxy != null;
  }
  
  public A addToVars(int index,String item) {
    if (this.vars == null) {this.vars = new ArrayList<String>();}
    this.vars.add(index, item);
    return (A)this;
  }
  
  public A setToVars(int index,String item) {
    if (this.vars == null) {this.vars = new ArrayList<String>();}
    this.vars.set(index, item); return (A)this;
  }
  
  public A addToVars(java.lang.String... items) {
    if (this.vars == null) {this.vars = new ArrayList<String>();}
    for (String item : items) {this.vars.add(item);} return (A)this;
  }
  
  public A addAllToVars(Collection<String> items) {
    if (this.vars == null) {this.vars = new ArrayList<String>();}
    for (String item : items) {this.vars.add(item);} return (A)this;
  }
  
  public A removeFromVars(java.lang.String... items) {
    if (this.vars == null) return (A)this;
    for (String item : items) { this.vars.remove(item);} return (A)this;
  }
  
  public A removeAllFromVars(Collection<String> items) {
    if (this.vars == null) return (A)this;
    for (String item : items) { this.vars.remove(item);} return (A)this;
  }
  
  public List<String> getVars() {
    return this.vars;
  }
  
  public String getVar(int index) {
    return this.vars.get(index);
  }
  
  public String getFirstVar() {
    return this.vars.get(0);
  }
  
  public String getLastVar() {
    return this.vars.get(vars.size() - 1);
  }
  
  public String getMatchingVar(Predicate<String> predicate) {
      for (String item : vars) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingVar(Predicate<String> predicate) {
      for (String item : vars) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVars(List<String> vars) {
    if (vars != null) {
        this.vars = new ArrayList();
        for (String item : vars) {
          this.addToVars(item);
        }
    } else {
      this.vars = null;
    }
    return (A) this;
  }
  
  public A withVars(java.lang.String... vars) {
    if (this.vars != null) {
        this.vars.clear();
        _visitables.remove("vars");
    }
    if (vars != null) {
      for (String item : vars) {
        this.addToVars(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVars() {
    return this.vars != null && !this.vars.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EnvironmentFluent that = (EnvironmentFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(containerMeta, that.containerMeta)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(httpProxy, that.httpProxy)) return false;
    if (!java.util.Objects.equals(vars, that.vars)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  containerMeta,  enabled,  httpProxy,  vars,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (containerMeta != null) { sb.append("containerMeta:"); sb.append(containerMeta + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (httpProxy != null) { sb.append("httpProxy:"); sb.append(httpProxy + ","); }
    if (vars != null && !vars.isEmpty()) { sb.append("vars:"); sb.append(vars); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withContainerMeta() {
    return withContainerMeta(true);
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withHttpProxy() {
    return withHttpProxy(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) EnvironmentFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}