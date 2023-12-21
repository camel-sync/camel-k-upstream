package org.apache.camel.v1.integrationplatformspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class StrimziBuilder extends StrimziFluent<StrimziBuilder> implements VisitableBuilder<Strimzi,StrimziBuilder>{
  public StrimziBuilder() {
    this(new Strimzi());
  }
  
  public StrimziBuilder(StrimziFluent<?> fluent) {
    this(fluent, new Strimzi());
  }
  
  public StrimziBuilder(StrimziFluent<?> fluent,Strimzi instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public StrimziBuilder(Strimzi instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  StrimziFluent<?> fluent;
  
  public Strimzi build() {
    Strimzi buildable = new Strimzi();
    buildable.setConfiguration(fluent.buildConfiguration());
    return buildable;
  }
  

}