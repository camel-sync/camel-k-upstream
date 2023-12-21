package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class HostPathBuilder extends HostPathFluent<HostPathBuilder> implements VisitableBuilder<HostPath,HostPathBuilder>{
  public HostPathBuilder() {
    this(new HostPath());
  }
  
  public HostPathBuilder(HostPathFluent<?> fluent) {
    this(fluent, new HostPath());
  }
  
  public HostPathBuilder(HostPathFluent<?> fluent,HostPath instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public HostPathBuilder(HostPath instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  HostPathFluent<?> fluent;
  
  public HostPath build() {
    HostPath buildable = new HostPath();
    buildable.setPath(fluent.getPath());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}