package org.apache.camel.v1.buildspec.tasks;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CustomBuilder extends CustomFluent<CustomBuilder> implements VisitableBuilder<Custom,CustomBuilder>{
  public CustomBuilder() {
    this(new Custom());
  }
  
  public CustomBuilder(CustomFluent<?> fluent) {
    this(fluent, new Custom());
  }
  
  public CustomBuilder(CustomFluent<?> fluent,Custom instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CustomBuilder(Custom instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CustomFluent<?> fluent;
  
  public Custom build() {
    Custom buildable = new Custom();
    buildable.setCommand(fluent.getCommand());
    buildable.setCommands(fluent.getCommands());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setImage(fluent.getImage());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}