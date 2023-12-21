package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.initcontainers;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class LifecycleBuilder extends LifecycleFluent<LifecycleBuilder> implements VisitableBuilder<Lifecycle,LifecycleBuilder>{
  public LifecycleBuilder() {
    this(new Lifecycle());
  }
  
  public LifecycleBuilder(LifecycleFluent<?> fluent) {
    this(fluent, new Lifecycle());
  }
  
  public LifecycleBuilder(LifecycleFluent<?> fluent,Lifecycle instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public LifecycleBuilder(Lifecycle instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  LifecycleFluent<?> fluent;
  
  public Lifecycle build() {
    Lifecycle buildable = new Lifecycle();
    buildable.setPostStart(fluent.buildPostStart());
    buildable.setPreStop(fluent.buildPreStop());
    return buildable;
  }
  

}