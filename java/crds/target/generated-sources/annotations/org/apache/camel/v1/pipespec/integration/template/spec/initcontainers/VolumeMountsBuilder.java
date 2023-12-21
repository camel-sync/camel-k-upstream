package org.apache.camel.v1.pipespec.integration.template.spec.initcontainers;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class VolumeMountsBuilder extends VolumeMountsFluent<VolumeMountsBuilder> implements VisitableBuilder<VolumeMounts,VolumeMountsBuilder>{
  public VolumeMountsBuilder() {
    this(new VolumeMounts());
  }
  
  public VolumeMountsBuilder(VolumeMountsFluent<?> fluent) {
    this(fluent, new VolumeMounts());
  }
  
  public VolumeMountsBuilder(VolumeMountsFluent<?> fluent,VolumeMounts instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public VolumeMountsBuilder(VolumeMounts instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  VolumeMountsFluent<?> fluent;
  
  public VolumeMounts build() {
    VolumeMounts buildable = new VolumeMounts();
    buildable.setMountPath(fluent.getMountPath());
    buildable.setMountPropagation(fluent.getMountPropagation());
    buildable.setName(fluent.getName());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSubPath(fluent.getSubPath());
    buildable.setSubPathExpr(fluent.getSubPathExpr());
    return buildable;
  }
  

}