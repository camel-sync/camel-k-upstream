package org.apache.camel.v1.buildspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TasksBuilder extends TasksFluent<TasksBuilder> implements VisitableBuilder<Tasks,TasksBuilder>{
  public TasksBuilder() {
    this(new Tasks());
  }
  
  public TasksBuilder(TasksFluent<?> fluent) {
    this(fluent, new Tasks());
  }
  
  public TasksBuilder(TasksFluent<?> fluent,Tasks instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TasksBuilder(Tasks instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TasksFluent<?> fluent;
  
  public Tasks build() {
    Tasks buildable = new Tasks();
    buildable.setBuildah(fluent.buildBuildah());
    buildable.setBuilder(fluent.buildBuilder());
    buildable.setCustom(fluent.buildCustom());
    buildable.setJib(fluent.buildJib());
    buildable.setKaniko(fluent.buildKaniko());
    buildable.setS2i(fluent.buildS2i());
    buildable.setSpectrum(fluent.buildSpectrum());
    return buildable;
  }
  

}