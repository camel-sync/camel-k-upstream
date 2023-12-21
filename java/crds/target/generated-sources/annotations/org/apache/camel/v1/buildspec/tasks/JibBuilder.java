package org.apache.camel.v1.buildspec.tasks;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class JibBuilder extends JibFluent<JibBuilder> implements VisitableBuilder<Jib,JibBuilder>{
  public JibBuilder() {
    this(new Jib());
  }
  
  public JibBuilder(JibFluent<?> fluent) {
    this(fluent, new Jib());
  }
  
  public JibBuilder(JibFluent<?> fluent,Jib instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public JibBuilder(Jib instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  JibFluent<?> fluent;
  
  public Jib build() {
    Jib buildable = new Jib();
    buildable.setBaseImage(fluent.getBaseImage());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setContextDir(fluent.getContextDir());
    buildable.setImage(fluent.getImage());
    buildable.setName(fluent.getName());
    buildable.setRegistry(fluent.buildRegistry());
    return buildable;
  }
  

}