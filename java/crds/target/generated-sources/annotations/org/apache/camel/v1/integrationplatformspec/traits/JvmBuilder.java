package org.apache.camel.v1.integrationplatformspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class JvmBuilder extends JvmFluent<JvmBuilder> implements VisitableBuilder<Jvm,JvmBuilder>{
  public JvmBuilder() {
    this(new Jvm());
  }
  
  public JvmBuilder(JvmFluent<?> fluent) {
    this(fluent, new Jvm());
  }
  
  public JvmBuilder(JvmFluent<?> fluent,Jvm instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public JvmBuilder(Jvm instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  JvmFluent<?> fluent;
  
  public Jvm build() {
    Jvm buildable = new Jvm();
    buildable.setClasspath(fluent.getClasspath());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setDebug(fluent.getDebug());
    buildable.setDebugAddress(fluent.getDebugAddress());
    buildable.setDebugSuspend(fluent.getDebugSuspend());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setOptions(fluent.getOptions());
    buildable.setPrintCommand(fluent.getPrintCommand());
    return buildable;
  }
  

}