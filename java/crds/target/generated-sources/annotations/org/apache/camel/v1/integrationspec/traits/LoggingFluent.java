package org.apache.camel.v1.integrationspec.traits;

import org.apache.camel.v1.integrationspec.traits.logging.ConfigurationBuilder;
import org.apache.camel.v1.integrationspec.traits.logging.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.integrationspec.traits.logging.ConfigurationFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class LoggingFluent<A extends LoggingFluent<A>> extends BaseFluent<A>{
  public LoggingFluent() {
  }
  
  public LoggingFluent(Logging instance) {
    this.copyInstance(instance);
  }
  private Boolean color;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private String format;
  private Boolean json;
  private Boolean jsonPrettyPrint;
  private Logging.Level level;
  
  protected void copyInstance(Logging instance) {
    instance = (instance != null ? instance : new Logging());
    if (instance != null) {
          this.withColor(instance.getColor());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withFormat(instance.getFormat());
          this.withJson(instance.getJson());
          this.withJsonPrettyPrint(instance.getJsonPrettyPrint());
          this.withLevel(instance.getLevel());
        }
  }
  
  public Boolean getColor() {
    return this.color;
  }
  
  public A withColor(Boolean color) {
    this.color = color;
    return (A) this;
  }
  
  public boolean hasColor() {
    return this.color != null;
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
  
  public String getFormat() {
    return this.format;
  }
  
  public A withFormat(String format) {
    this.format = format;
    return (A) this;
  }
  
  public boolean hasFormat() {
    return this.format != null;
  }
  
  public Boolean getJson() {
    return this.json;
  }
  
  public A withJson(Boolean json) {
    this.json = json;
    return (A) this;
  }
  
  public boolean hasJson() {
    return this.json != null;
  }
  
  public Boolean getJsonPrettyPrint() {
    return this.jsonPrettyPrint;
  }
  
  public A withJsonPrettyPrint(Boolean jsonPrettyPrint) {
    this.jsonPrettyPrint = jsonPrettyPrint;
    return (A) this;
  }
  
  public boolean hasJsonPrettyPrint() {
    return this.jsonPrettyPrint != null;
  }
  
  public Logging.Level getLevel() {
    return this.level;
  }
  
  public A withLevel(Logging.Level level) {
    this.level = level;
    return (A) this;
  }
  
  public boolean hasLevel() {
    return this.level != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    LoggingFluent that = (LoggingFluent) o;
    if (!java.util.Objects.equals(color, that.color)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(format, that.format)) return false;
    if (!java.util.Objects.equals(json, that.json)) return false;
    if (!java.util.Objects.equals(jsonPrettyPrint, that.jsonPrettyPrint)) return false;
    if (!java.util.Objects.equals(level, that.level)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(color,  configuration,  enabled,  format,  json,  jsonPrettyPrint,  level,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (color != null) { sb.append("color:"); sb.append(color + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (format != null) { sb.append("format:"); sb.append(format + ","); }
    if (json != null) { sb.append("json:"); sb.append(json + ","); }
    if (jsonPrettyPrint != null) { sb.append("jsonPrettyPrint:"); sb.append(jsonPrettyPrint + ","); }
    if (level != null) { sb.append("level:"); sb.append(level); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withColor() {
    return withColor(true);
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withJson() {
    return withJson(true);
  }
  
  public A withJsonPrettyPrint() {
    return withJsonPrettyPrint(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) LoggingFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}