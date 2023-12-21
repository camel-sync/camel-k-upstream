package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class EmptyDirBuilder extends EmptyDirFluent<EmptyDirBuilder> implements VisitableBuilder<EmptyDir,EmptyDirBuilder>{
  public EmptyDirBuilder() {
    this(new EmptyDir());
  }
  
  public EmptyDirBuilder(EmptyDirFluent<?> fluent) {
    this(fluent, new EmptyDir());
  }
  
  public EmptyDirBuilder(EmptyDirFluent<?> fluent,EmptyDir instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public EmptyDirBuilder(EmptyDir instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  EmptyDirFluent<?> fluent;
  
  public EmptyDir build() {
    EmptyDir buildable = new EmptyDir();
    buildable.setMedium(fluent.getMedium());
    buildable.setSizeLimit(fluent.getSizeLimit());
    return buildable;
  }
  

}