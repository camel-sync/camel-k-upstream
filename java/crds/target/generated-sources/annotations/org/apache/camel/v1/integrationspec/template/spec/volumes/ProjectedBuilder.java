package org.apache.camel.v1.integrationspec.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ProjectedBuilder extends ProjectedFluent<ProjectedBuilder> implements VisitableBuilder<Projected,ProjectedBuilder>{
  public ProjectedBuilder() {
    this(new Projected());
  }
  
  public ProjectedBuilder(ProjectedFluent<?> fluent) {
    this(fluent, new Projected());
  }
  
  public ProjectedBuilder(ProjectedFluent<?> fluent,Projected instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ProjectedBuilder(Projected instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ProjectedFluent<?> fluent;
  
  public Projected build() {
    Projected buildable = new Projected();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setSources(fluent.buildSources());
    return buildable;
  }
  

}