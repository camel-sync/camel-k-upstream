package org.apache.camel.v1.buildspec.tasks;

import org.apache.camel.v1.buildspec.tasks.custom.ConfigurationBuilder;
import org.apache.camel.v1.buildspec.tasks.custom.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.buildspec.tasks.custom.ConfigurationFluent;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CustomFluent<A extends CustomFluent<A>> extends BaseFluent<A>{
  public CustomFluent() {
  }
  
  public CustomFluent(Custom instance) {
    this.copyInstance(instance);
  }
  private String command;
  private List<String> commands;
  private ConfigurationBuilder configuration;
  private String image;
  private String name;
  
  protected void copyInstance(Custom instance) {
    instance = (instance != null ? instance : new Custom());
    if (instance != null) {
          this.withCommand(instance.getCommand());
          this.withCommands(instance.getCommands());
          this.withConfiguration(instance.getConfiguration());
          this.withImage(instance.getImage());
          this.withName(instance.getName());
        }
  }
  
  public String getCommand() {
    return this.command;
  }
  
  public A withCommand(String command) {
    this.command = command;
    return (A) this;
  }
  
  public boolean hasCommand() {
    return this.command != null;
  }
  
  public A addToCommands(int index,String item) {
    if (this.commands == null) {this.commands = new ArrayList<String>();}
    this.commands.add(index, item);
    return (A)this;
  }
  
  public A setToCommands(int index,String item) {
    if (this.commands == null) {this.commands = new ArrayList<String>();}
    this.commands.set(index, item); return (A)this;
  }
  
  public A addToCommands(java.lang.String... items) {
    if (this.commands == null) {this.commands = new ArrayList<String>();}
    for (String item : items) {this.commands.add(item);} return (A)this;
  }
  
  public A addAllToCommands(Collection<String> items) {
    if (this.commands == null) {this.commands = new ArrayList<String>();}
    for (String item : items) {this.commands.add(item);} return (A)this;
  }
  
  public A removeFromCommands(java.lang.String... items) {
    if (this.commands == null) return (A)this;
    for (String item : items) { this.commands.remove(item);} return (A)this;
  }
  
  public A removeAllFromCommands(Collection<String> items) {
    if (this.commands == null) return (A)this;
    for (String item : items) { this.commands.remove(item);} return (A)this;
  }
  
  public List<String> getCommands() {
    return this.commands;
  }
  
  public String getCommand(int index) {
    return this.commands.get(index);
  }
  
  public String getFirstCommand() {
    return this.commands.get(0);
  }
  
  public String getLastCommand() {
    return this.commands.get(commands.size() - 1);
  }
  
  public String getMatchingCommand(Predicate<String> predicate) {
      for (String item : commands) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingCommand(Predicate<String> predicate) {
      for (String item : commands) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withCommands(List<String> commands) {
    if (commands != null) {
        this.commands = new ArrayList();
        for (String item : commands) {
          this.addToCommands(item);
        }
    } else {
      this.commands = null;
    }
    return (A) this;
  }
  
  public A withCommands(java.lang.String... commands) {
    if (this.commands != null) {
        this.commands.clear();
        _visitables.remove("commands");
    }
    if (commands != null) {
      for (String item : commands) {
        this.addToCommands(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasCommands() {
    return this.commands != null && !this.commands.isEmpty();
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
  
  public String getImage() {
    return this.image;
  }
  
  public A withImage(String image) {
    this.image = image;
    return (A) this;
  }
  
  public boolean hasImage() {
    return this.image != null;
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CustomFluent that = (CustomFluent) o;
    if (!java.util.Objects.equals(command, that.command)) return false;
    if (!java.util.Objects.equals(commands, that.commands)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(image, that.image)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(command,  commands,  configuration,  image,  name,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (command != null) { sb.append("command:"); sb.append(command + ","); }
    if (commands != null && !commands.isEmpty()) { sb.append("commands:"); sb.append(commands + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) CustomFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}