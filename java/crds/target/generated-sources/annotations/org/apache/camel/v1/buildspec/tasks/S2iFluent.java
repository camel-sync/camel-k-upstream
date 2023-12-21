package org.apache.camel.v1.buildspec.tasks;

import org.apache.camel.v1.buildspec.tasks.s2i.ConfigurationBuilder;
import org.apache.camel.v1.buildspec.tasks.s2i.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Object;
import java.lang.String;
import org.apache.camel.v1.buildspec.tasks.s2i.ConfigurationFluent;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class S2iFluent<A extends S2iFluent<A>> extends BaseFluent<A>{
  public S2iFluent() {
  }
  
  public S2iFluent(S2i instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private String contextDir;
  private String name;
  private String tag;
  
  protected void copyInstance(S2i instance) {
    instance = (instance != null ? instance : new S2i());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withContextDir(instance.getContextDir());
          this.withName(instance.getName());
          this.withTag(instance.getTag());
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
  
  public String getContextDir() {
    return this.contextDir;
  }
  
  public A withContextDir(String contextDir) {
    this.contextDir = contextDir;
    return (A) this;
  }
  
  public boolean hasContextDir() {
    return this.contextDir != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public String getTag() {
    return this.tag;
  }
  
  public A withTag(String tag) {
    this.tag = tag;
    return (A) this;
  }
  
  public boolean hasTag() {
    return this.tag != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    S2iFluent that = (S2iFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(contextDir, that.contextDir)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(tag, that.tag)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  contextDir,  name,  tag,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (contextDir != null) { sb.append("contextDir:"); sb.append(contextDir + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (tag != null) { sb.append("tag:"); sb.append(tag); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) S2iFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}