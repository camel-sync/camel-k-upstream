package org.apache.camel.v1.integrationplatformstatus.traits;

import org.apache.camel.v1.integrationplatformstatus.traits.jvm.ConfigurationBuilder;
import org.apache.camel.v1.integrationplatformstatus.traits.jvm.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.integrationplatformstatus.traits.jvm.ConfigurationFluent;
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
public class JvmFluent<A extends JvmFluent<A>> extends BaseFluent<A>{
  public JvmFluent() {
  }
  
  public JvmFluent(Jvm instance) {
    this.copyInstance(instance);
  }
  private String classpath;
  private ConfigurationBuilder configuration;
  private Boolean debug;
  private String debugAddress;
  private Boolean debugSuspend;
  private Boolean enabled;
  private List<String> options;
  private Boolean printCommand;
  
  protected void copyInstance(Jvm instance) {
    instance = (instance != null ? instance : new Jvm());
    if (instance != null) {
          this.withClasspath(instance.getClasspath());
          this.withConfiguration(instance.getConfiguration());
          this.withDebug(instance.getDebug());
          this.withDebugAddress(instance.getDebugAddress());
          this.withDebugSuspend(instance.getDebugSuspend());
          this.withEnabled(instance.getEnabled());
          this.withOptions(instance.getOptions());
          this.withPrintCommand(instance.getPrintCommand());
        }
  }
  
  public String getClasspath() {
    return this.classpath;
  }
  
  public A withClasspath(String classpath) {
    this.classpath = classpath;
    return (A) this;
  }
  
  public boolean hasClasspath() {
    return this.classpath != null;
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
  
  public Boolean getDebug() {
    return this.debug;
  }
  
  public A withDebug(Boolean debug) {
    this.debug = debug;
    return (A) this;
  }
  
  public boolean hasDebug() {
    return this.debug != null;
  }
  
  public String getDebugAddress() {
    return this.debugAddress;
  }
  
  public A withDebugAddress(String debugAddress) {
    this.debugAddress = debugAddress;
    return (A) this;
  }
  
  public boolean hasDebugAddress() {
    return this.debugAddress != null;
  }
  
  public Boolean getDebugSuspend() {
    return this.debugSuspend;
  }
  
  public A withDebugSuspend(Boolean debugSuspend) {
    this.debugSuspend = debugSuspend;
    return (A) this;
  }
  
  public boolean hasDebugSuspend() {
    return this.debugSuspend != null;
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
  
  public A addToOptions(int index,String item) {
    if (this.options == null) {this.options = new ArrayList<String>();}
    this.options.add(index, item);
    return (A)this;
  }
  
  public A setToOptions(int index,String item) {
    if (this.options == null) {this.options = new ArrayList<String>();}
    this.options.set(index, item); return (A)this;
  }
  
  public A addToOptions(java.lang.String... items) {
    if (this.options == null) {this.options = new ArrayList<String>();}
    for (String item : items) {this.options.add(item);} return (A)this;
  }
  
  public A addAllToOptions(Collection<String> items) {
    if (this.options == null) {this.options = new ArrayList<String>();}
    for (String item : items) {this.options.add(item);} return (A)this;
  }
  
  public A removeFromOptions(java.lang.String... items) {
    if (this.options == null) return (A)this;
    for (String item : items) { this.options.remove(item);} return (A)this;
  }
  
  public A removeAllFromOptions(Collection<String> items) {
    if (this.options == null) return (A)this;
    for (String item : items) { this.options.remove(item);} return (A)this;
  }
  
  public List<String> getOptions() {
    return this.options;
  }
  
  public String getOption(int index) {
    return this.options.get(index);
  }
  
  public String getFirstOption() {
    return this.options.get(0);
  }
  
  public String getLastOption() {
    return this.options.get(options.size() - 1);
  }
  
  public String getMatchingOption(Predicate<String> predicate) {
      for (String item : options) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingOption(Predicate<String> predicate) {
      for (String item : options) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withOptions(List<String> options) {
    if (options != null) {
        this.options = new ArrayList();
        for (String item : options) {
          this.addToOptions(item);
        }
    } else {
      this.options = null;
    }
    return (A) this;
  }
  
  public A withOptions(java.lang.String... options) {
    if (this.options != null) {
        this.options.clear();
        _visitables.remove("options");
    }
    if (options != null) {
      for (String item : options) {
        this.addToOptions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasOptions() {
    return this.options != null && !this.options.isEmpty();
  }
  
  public Boolean getPrintCommand() {
    return this.printCommand;
  }
  
  public A withPrintCommand(Boolean printCommand) {
    this.printCommand = printCommand;
    return (A) this;
  }
  
  public boolean hasPrintCommand() {
    return this.printCommand != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    JvmFluent that = (JvmFluent) o;
    if (!java.util.Objects.equals(classpath, that.classpath)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(debug, that.debug)) return false;
    if (!java.util.Objects.equals(debugAddress, that.debugAddress)) return false;
    if (!java.util.Objects.equals(debugSuspend, that.debugSuspend)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(options, that.options)) return false;
    if (!java.util.Objects.equals(printCommand, that.printCommand)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(classpath,  configuration,  debug,  debugAddress,  debugSuspend,  enabled,  options,  printCommand,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (classpath != null) { sb.append("classpath:"); sb.append(classpath + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (debug != null) { sb.append("debug:"); sb.append(debug + ","); }
    if (debugAddress != null) { sb.append("debugAddress:"); sb.append(debugAddress + ","); }
    if (debugSuspend != null) { sb.append("debugSuspend:"); sb.append(debugSuspend + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (options != null && !options.isEmpty()) { sb.append("options:"); sb.append(options + ","); }
    if (printCommand != null) { sb.append("printCommand:"); sb.append(printCommand); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDebug() {
    return withDebug(true);
  }
  
  public A withDebugSuspend() {
    return withDebugSuspend(true);
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withPrintCommand() {
    return withPrintCommand(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) JvmFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}