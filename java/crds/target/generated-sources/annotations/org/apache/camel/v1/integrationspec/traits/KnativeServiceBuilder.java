package org.apache.camel.v1.integrationspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KnativeServiceBuilder extends KnativeServiceFluent<KnativeServiceBuilder> implements VisitableBuilder<KnativeService,KnativeServiceBuilder>{
  public KnativeServiceBuilder() {
    this(new KnativeService());
  }
  
  public KnativeServiceBuilder(KnativeServiceFluent<?> fluent) {
    this(fluent, new KnativeService());
  }
  
  public KnativeServiceBuilder(KnativeServiceFluent<?> fluent,KnativeService instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KnativeServiceBuilder(KnativeService instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KnativeServiceFluent<?> fluent;
  
  public KnativeService build() {
    KnativeService buildable = new KnativeService();
    buildable.setAnnotations(fluent.getAnnotations());
    buildable.setAuto(fluent.getAuto());
    buildable.setAutoscalingMetric(fluent.getAutoscalingMetric());
    buildable.setAutoscalingTarget(fluent.getAutoscalingTarget());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setMaxScale(fluent.getMaxScale());
    buildable.setMinScale(fluent.getMinScale());
    buildable.setRolloutDuration(fluent.getRolloutDuration());
    buildable.setVisibility(fluent.getVisibility());
    return buildable;
  }
  

}