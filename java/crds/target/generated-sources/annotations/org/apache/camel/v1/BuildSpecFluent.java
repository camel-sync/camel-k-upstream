package org.apache.camel.v1;

import org.apache.camel.v1.buildspec.TasksBuilder;
import org.apache.camel.v1.buildspec.ConfigurationBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.buildspec.Tasks;
import org.apache.camel.v1.buildspec.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.buildspec.TasksFluent;
import java.lang.String;
import org.apache.camel.v1.buildspec.ConfigurationFluent;
import java.util.function.Predicate;
import java.lang.Integer;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class BuildSpecFluent<A extends BuildSpecFluent<A>> extends BaseFluent<A>{
  public BuildSpecFluent() {
  }
  
  public BuildSpecFluent(BuildSpec instance) {
    this.copyInstance(instance);
  }
  private ConfigurationBuilder configuration;
  private Integer maxRunningBuilds;
  private String operatorNamespace;
  private ArrayList<TasksBuilder> tasks;
  private String timeout;
  private String toolImage;
  
  protected void copyInstance(BuildSpec instance) {
    instance = (instance != null ? instance : new BuildSpec());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withMaxRunningBuilds(instance.getMaxRunningBuilds());
          this.withOperatorNamespace(instance.getOperatorNamespace());
          this.withTasks(instance.getTasks());
          this.withTimeout(instance.getTimeout());
          this.withToolImage(instance.getToolImage());
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
  
  public Integer getMaxRunningBuilds() {
    return this.maxRunningBuilds;
  }
  
  public A withMaxRunningBuilds(Integer maxRunningBuilds) {
    this.maxRunningBuilds = maxRunningBuilds;
    return (A) this;
  }
  
  public boolean hasMaxRunningBuilds() {
    return this.maxRunningBuilds != null;
  }
  
  public String getOperatorNamespace() {
    return this.operatorNamespace;
  }
  
  public A withOperatorNamespace(String operatorNamespace) {
    this.operatorNamespace = operatorNamespace;
    return (A) this;
  }
  
  public boolean hasOperatorNamespace() {
    return this.operatorNamespace != null;
  }
  
  public A addToTasks(int index,Tasks item) {
    if (this.tasks == null) {this.tasks = new ArrayList<TasksBuilder>();}
    TasksBuilder builder = new TasksBuilder(item);
    if (index < 0 || index >= tasks.size()) { _visitables.get("tasks").add(builder); tasks.add(builder); } else { _visitables.get("tasks").add(index, builder); tasks.add(index, builder);}
    return (A)this;
  }
  
  public A setToTasks(int index,Tasks item) {
    if (this.tasks == null) {this.tasks = new ArrayList<TasksBuilder>();}
    TasksBuilder builder = new TasksBuilder(item);
    if (index < 0 || index >= tasks.size()) { _visitables.get("tasks").add(builder); tasks.add(builder); } else { _visitables.get("tasks").set(index, builder); tasks.set(index, builder);}
    return (A)this;
  }
  
  public A addToTasks(org.apache.camel.v1.buildspec.Tasks... items) {
    if (this.tasks == null) {this.tasks = new ArrayList<TasksBuilder>();}
    for (Tasks item : items) {TasksBuilder builder = new TasksBuilder(item);_visitables.get("tasks").add(builder);this.tasks.add(builder);} return (A)this;
  }
  
  public A addAllToTasks(Collection<Tasks> items) {
    if (this.tasks == null) {this.tasks = new ArrayList<TasksBuilder>();}
    for (Tasks item : items) {TasksBuilder builder = new TasksBuilder(item);_visitables.get("tasks").add(builder);this.tasks.add(builder);} return (A)this;
  }
  
  public A removeFromTasks(org.apache.camel.v1.buildspec.Tasks... items) {
    if (this.tasks == null) return (A)this;
    for (Tasks item : items) {TasksBuilder builder = new TasksBuilder(item);_visitables.get("tasks").remove(builder); this.tasks.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTasks(Collection<Tasks> items) {
    if (this.tasks == null) return (A)this;
    for (Tasks item : items) {TasksBuilder builder = new TasksBuilder(item);_visitables.get("tasks").remove(builder); this.tasks.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromTasks(Predicate<TasksBuilder> predicate) {
    if (tasks == null) return (A) this;
    final Iterator<TasksBuilder> each = tasks.iterator();
    final List visitables = _visitables.get("tasks");
    while (each.hasNext()) {
      TasksBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Tasks> buildTasks() {
    return this.tasks != null ? build(tasks) : null;
  }
  
  public Tasks buildTask(int index) {
    return this.tasks.get(index).build();
  }
  
  public Tasks buildFirstTask() {
    return this.tasks.get(0).build();
  }
  
  public Tasks buildLastTask() {
    return this.tasks.get(tasks.size() - 1).build();
  }
  
  public Tasks buildMatchingTask(Predicate<TasksBuilder> predicate) {
      for (TasksBuilder item : tasks) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingTask(Predicate<TasksBuilder> predicate) {
      for (TasksBuilder item : tasks) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTasks(List<Tasks> tasks) {
    if (this.tasks != null) {
      this._visitables.get("tasks").clear();
    }
    if (tasks != null) {
        this.tasks = new ArrayList();
        for (Tasks item : tasks) {
          this.addToTasks(item);
        }
    } else {
      this.tasks = null;
    }
    return (A) this;
  }
  
  public A withTasks(org.apache.camel.v1.buildspec.Tasks... tasks) {
    if (this.tasks != null) {
        this.tasks.clear();
        _visitables.remove("tasks");
    }
    if (tasks != null) {
      for (Tasks item : tasks) {
        this.addToTasks(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTasks() {
    return this.tasks != null && !this.tasks.isEmpty();
  }
  
  public TasksNested<A> addNewTask() {
    return new TasksNested(-1, null);
  }
  
  public TasksNested<A> addNewTaskLike(Tasks item) {
    return new TasksNested(-1, item);
  }
  
  public TasksNested<A> setNewTaskLike(int index,Tasks item) {
    return new TasksNested(index, item);
  }
  
  public TasksNested<A> editTask(int index) {
    if (tasks.size() <= index) throw new RuntimeException("Can't edit tasks. Index exceeds size.");
    return setNewTaskLike(index, buildTask(index));
  }
  
  public TasksNested<A> editFirstTask() {
    if (tasks.size() == 0) throw new RuntimeException("Can't edit first tasks. The list is empty.");
    return setNewTaskLike(0, buildTask(0));
  }
  
  public TasksNested<A> editLastTask() {
    int index = tasks.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tasks. The list is empty.");
    return setNewTaskLike(index, buildTask(index));
  }
  
  public TasksNested<A> editMatchingTask(Predicate<TasksBuilder> predicate) {
    int index = -1;
    for (int i=0;i<tasks.size();i++) { 
    if (predicate.test(tasks.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching tasks. No match found.");
    return setNewTaskLike(index, buildTask(index));
  }
  
  public String getTimeout() {
    return this.timeout;
  }
  
  public A withTimeout(String timeout) {
    this.timeout = timeout;
    return (A) this;
  }
  
  public boolean hasTimeout() {
    return this.timeout != null;
  }
  
  public String getToolImage() {
    return this.toolImage;
  }
  
  public A withToolImage(String toolImage) {
    this.toolImage = toolImage;
    return (A) this;
  }
  
  public boolean hasToolImage() {
    return this.toolImage != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    BuildSpecFluent that = (BuildSpecFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(maxRunningBuilds, that.maxRunningBuilds)) return false;
    if (!java.util.Objects.equals(operatorNamespace, that.operatorNamespace)) return false;
    if (!java.util.Objects.equals(tasks, that.tasks)) return false;
    if (!java.util.Objects.equals(timeout, that.timeout)) return false;
    if (!java.util.Objects.equals(toolImage, that.toolImage)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  maxRunningBuilds,  operatorNamespace,  tasks,  timeout,  toolImage,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (maxRunningBuilds != null) { sb.append("maxRunningBuilds:"); sb.append(maxRunningBuilds + ","); }
    if (operatorNamespace != null) { sb.append("operatorNamespace:"); sb.append(operatorNamespace + ","); }
    if (tasks != null && !tasks.isEmpty()) { sb.append("tasks:"); sb.append(tasks + ","); }
    if (timeout != null) { sb.append("timeout:"); sb.append(timeout + ","); }
    if (toolImage != null) { sb.append("toolImage:"); sb.append(toolImage); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) BuildSpecFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }
  public class TasksNested<N> extends TasksFluent<TasksNested<N>> implements Nested<N>{
    TasksNested(int index,Tasks item) {
      this.index = index;
      this.builder = new TasksBuilder(this, item);
    }
    TasksBuilder builder;
    int index;
    
    public N and() {
      return (N) BuildSpecFluent.this.setToTasks(index,builder.build());
    }
    
    public N endTask() {
      return and();
    }
    
  
  }

}