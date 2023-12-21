package org.apache.camel.v1.buildspec.tasks;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KanikoBuilder extends KanikoFluent<KanikoBuilder> implements VisitableBuilder<Kaniko,KanikoBuilder>{
  public KanikoBuilder() {
    this(new Kaniko());
  }
  
  public KanikoBuilder(KanikoFluent<?> fluent) {
    this(fluent, new Kaniko());
  }
  
  public KanikoBuilder(KanikoFluent<?> fluent,Kaniko instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KanikoBuilder(Kaniko instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KanikoFluent<?> fluent;
  
  public Kaniko build() {
    Kaniko buildable = new Kaniko();
    buildable.setBaseImage(fluent.getBaseImage());
    buildable.setCache(fluent.buildCache());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setContextDir(fluent.getContextDir());
    buildable.setExecutorImage(fluent.getExecutorImage());
    buildable.setImage(fluent.getImage());
    buildable.setName(fluent.getName());
    buildable.setRegistry(fluent.buildRegistry());
    buildable.setVerbose(fluent.getVerbose());
    return buildable;
  }
  

}