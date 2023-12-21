package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.VolumeClaimTemplateFluent;
import java.lang.SuppressWarnings;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.VolumeClaimTemplate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Object;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.VolumeClaimTemplateBuilder;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class EphemeralFluent<A extends EphemeralFluent<A>> extends BaseFluent<A>{
  public EphemeralFluent() {
  }
  
  public EphemeralFluent(Ephemeral instance) {
    this.copyInstance(instance);
  }
  private VolumeClaimTemplateBuilder volumeClaimTemplate;
  
  protected void copyInstance(Ephemeral instance) {
    instance = (instance != null ? instance : new Ephemeral());
    if (instance != null) {
          this.withVolumeClaimTemplate(instance.getVolumeClaimTemplate());
        }
  }
  
  public VolumeClaimTemplate buildVolumeClaimTemplate() {
    return this.volumeClaimTemplate != null ? this.volumeClaimTemplate.build() : null;
  }
  
  public A withVolumeClaimTemplate(VolumeClaimTemplate volumeClaimTemplate) {
    this._visitables.remove("volumeClaimTemplate");
    if (volumeClaimTemplate != null) {
        this.volumeClaimTemplate = new VolumeClaimTemplateBuilder(volumeClaimTemplate);
        this._visitables.get("volumeClaimTemplate").add(this.volumeClaimTemplate);
    } else {
        this.volumeClaimTemplate = null;
        this._visitables.get("volumeClaimTemplate").remove(this.volumeClaimTemplate);
    }
    return (A) this;
  }
  
  public boolean hasVolumeClaimTemplate() {
    return this.volumeClaimTemplate != null;
  }
  
  public VolumeClaimTemplateNested<A> withNewVolumeClaimTemplate() {
    return new VolumeClaimTemplateNested(null);
  }
  
  public VolumeClaimTemplateNested<A> withNewVolumeClaimTemplateLike(VolumeClaimTemplate item) {
    return new VolumeClaimTemplateNested(item);
  }
  
  public VolumeClaimTemplateNested<A> editIntegrationVolumeClaimTemplate() {
    return withNewVolumeClaimTemplateLike(java.util.Optional.ofNullable(buildVolumeClaimTemplate()).orElse(null));
  }
  
  public VolumeClaimTemplateNested<A> editOrNewVolumeClaimTemplate() {
    return withNewVolumeClaimTemplateLike(java.util.Optional.ofNullable(buildVolumeClaimTemplate()).orElse(new VolumeClaimTemplateBuilder().build()));
  }
  
  public VolumeClaimTemplateNested<A> editOrNewVolumeClaimTemplateLike(VolumeClaimTemplate item) {
    return withNewVolumeClaimTemplateLike(java.util.Optional.ofNullable(buildVolumeClaimTemplate()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EphemeralFluent that = (EphemeralFluent) o;
    if (!java.util.Objects.equals(volumeClaimTemplate, that.volumeClaimTemplate)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(volumeClaimTemplate,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (volumeClaimTemplate != null) { sb.append("volumeClaimTemplate:"); sb.append(volumeClaimTemplate); }
    sb.append("}");
    return sb.toString();
  }
  public class VolumeClaimTemplateNested<N> extends VolumeClaimTemplateFluent<VolumeClaimTemplateNested<N>> implements Nested<N>{
    VolumeClaimTemplateNested(VolumeClaimTemplate item) {
      this.builder = new VolumeClaimTemplateBuilder(this, item);
    }
    VolumeClaimTemplateBuilder builder;
    
    public N and() {
      return (N) EphemeralFluent.this.withVolumeClaimTemplate(builder.build());
    }
    
    public N endIntegrationVolumeClaimTemplate() {
      return and();
    }
    
  
  }

}