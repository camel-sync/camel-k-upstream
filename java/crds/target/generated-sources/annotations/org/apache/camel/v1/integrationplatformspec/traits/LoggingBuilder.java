package org.apache.camel.v1.integrationplatformspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class LoggingBuilder extends LoggingFluent<LoggingBuilder> implements VisitableBuilder<Logging,LoggingBuilder>{
  public LoggingBuilder() {
    this(new Logging());
  }
  
  public LoggingBuilder(LoggingFluent<?> fluent) {
    this(fluent, new Logging());
  }
  
  public LoggingBuilder(LoggingFluent<?> fluent,Logging instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public LoggingBuilder(Logging instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  LoggingFluent<?> fluent;
  
  public Logging build() {
    Logging buildable = new Logging();
    buildable.setColor(fluent.getColor());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setFormat(fluent.getFormat());
    buildable.setJson(fluent.getJson());
    buildable.setJsonPrettyPrint(fluent.getJsonPrettyPrint());
    buildable.setLevel(fluent.getLevel());
    return buildable;
  }
  

}