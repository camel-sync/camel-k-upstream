package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class GlusterfsBuilder extends GlusterfsFluent<GlusterfsBuilder> implements VisitableBuilder<Glusterfs,GlusterfsBuilder>{
  public GlusterfsBuilder() {
    this(new Glusterfs());
  }
  
  public GlusterfsBuilder(GlusterfsFluent<?> fluent) {
    this(fluent, new Glusterfs());
  }
  
  public GlusterfsBuilder(GlusterfsFluent<?> fluent,Glusterfs instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public GlusterfsBuilder(Glusterfs instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  GlusterfsFluent<?> fluent;
  
  public Glusterfs build() {
    Glusterfs buildable = new Glusterfs();
    buildable.setEndpoints(fluent.getEndpoints());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  

}