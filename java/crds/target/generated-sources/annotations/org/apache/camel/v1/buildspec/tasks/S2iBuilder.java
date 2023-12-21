package org.apache.camel.v1.buildspec.tasks;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class S2iBuilder extends S2iFluent<S2iBuilder> implements VisitableBuilder<S2i,S2iBuilder>{
  public S2iBuilder() {
    this(new S2i());
  }
  
  public S2iBuilder(S2iFluent<?> fluent) {
    this(fluent, new S2i());
  }
  
  public S2iBuilder(S2iFluent<?> fluent,S2i instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public S2iBuilder(S2i instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  S2iFluent<?> fluent;
  
  public S2i build() {
    S2i buildable = new S2i();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setContextDir(fluent.getContextDir());
    buildable.setName(fluent.getName());
    buildable.setTag(fluent.getTag());
    return buildable;
  }
  

}