package org.apache.camel.v1.pipestatus.conditions.pods;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class HealthBuilder extends HealthFluent<HealthBuilder> implements VisitableBuilder<Health,HealthBuilder>{
  public HealthBuilder() {
    this(new Health());
  }
  
  public HealthBuilder(HealthFluent<?> fluent) {
    this(fluent, new Health());
  }
  
  public HealthBuilder(HealthFluent<?> fluent,Health instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public HealthBuilder(Health instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  HealthFluent<?> fluent;
  
  public Health build() {
    Health buildable = new Health();
    buildable.setData(fluent.getData());
    buildable.setName(fluent.getName());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  

}