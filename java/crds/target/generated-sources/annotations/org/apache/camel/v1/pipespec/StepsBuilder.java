package org.apache.camel.v1.pipespec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class StepsBuilder extends StepsFluent<StepsBuilder> implements VisitableBuilder<Steps,StepsBuilder>{
  public StepsBuilder() {
    this(new Steps());
  }
  
  public StepsBuilder(StepsFluent<?> fluent) {
    this(fluent, new Steps());
  }
  
  public StepsBuilder(StepsFluent<?> fluent,Steps instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public StepsBuilder(Steps instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  StepsFluent<?> fluent;
  
  public Steps build() {
    Steps buildable = new Steps();
    buildable.setDataTypes(fluent.getDataTypes());
    buildable.setProperties(fluent.buildProperties());
    buildable.setRef(fluent.buildRef());
    buildable.setUri(fluent.getUri());
    return buildable;
  }
  

}