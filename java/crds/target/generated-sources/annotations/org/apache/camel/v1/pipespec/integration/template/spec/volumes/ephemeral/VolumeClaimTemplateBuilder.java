package org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class VolumeClaimTemplateBuilder extends VolumeClaimTemplateFluent<VolumeClaimTemplateBuilder> implements VisitableBuilder<VolumeClaimTemplate,VolumeClaimTemplateBuilder>{
  public VolumeClaimTemplateBuilder() {
    this(new VolumeClaimTemplate());
  }
  
  public VolumeClaimTemplateBuilder(VolumeClaimTemplateFluent<?> fluent) {
    this(fluent, new VolumeClaimTemplate());
  }
  
  public VolumeClaimTemplateBuilder(VolumeClaimTemplateFluent<?> fluent,VolumeClaimTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public VolumeClaimTemplateBuilder(VolumeClaimTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  VolumeClaimTemplateFluent<?> fluent;
  
  public VolumeClaimTemplate build() {
    VolumeClaimTemplate buildable = new VolumeClaimTemplate();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}