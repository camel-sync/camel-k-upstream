package org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral;

import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.MetadataBuilder;
import java.lang.SuppressWarnings;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.MetadataFluent;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.Metadata;
import java.lang.String;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.SpecFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.SpecBuilder;
import java.lang.Object;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.Spec;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class VolumeClaimTemplateFluent<A extends VolumeClaimTemplateFluent<A>> extends BaseFluent<A>{
  public VolumeClaimTemplateFluent() {
  }
  
  public VolumeClaimTemplateFluent(VolumeClaimTemplate instance) {
    this.copyInstance(instance);
  }
  private MetadataBuilder metadata;
  private SpecBuilder spec;
  
  protected void copyInstance(VolumeClaimTemplate instance) {
    instance = (instance != null ? instance : new VolumeClaimTemplate());
    if (instance != null) {
          this.withMetadata(instance.getMetadata());
          this.withSpec(instance.getSpec());
        }
  }
  
  public Metadata buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(Metadata metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new MetadataBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(Metadata item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editIntegrationMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new MetadataBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(Metadata item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public Spec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }
  
  public A withSpec(Spec spec) {
    this._visitables.remove("spec");
    if (spec != null) {
        this.spec = new SpecBuilder(spec);
        this._visitables.get("spec").add(this.spec);
    } else {
        this.spec = null;
        this._visitables.get("spec").remove(this.spec);
    }
    return (A) this;
  }
  
  public boolean hasSpec() {
    return this.spec != null;
  }
  
  public SpecNested<A> withNewSpec() {
    return new SpecNested(null);
  }
  
  public SpecNested<A> withNewSpecLike(Spec item) {
    return new SpecNested(item);
  }
  
  public SpecNested<A> editVolumeclaimtemplateSpec() {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(null));
  }
  
  public SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(new SpecBuilder().build()));
  }
  
  public SpecNested<A> editOrNewSpecLike(Spec item) {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    VolumeClaimTemplateFluent that = (VolumeClaimTemplateFluent) o;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(spec, that.spec)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(metadata,  spec,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (spec != null) { sb.append("spec:"); sb.append(spec); }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends MetadataFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(Metadata item) {
      this.builder = new MetadataBuilder(this, item);
    }
    MetadataBuilder builder;
    
    public N and() {
      return (N) VolumeClaimTemplateFluent.this.withMetadata(builder.build());
    }
    
    public N endIntegrationMetadata() {
      return and();
    }
    
  
  }
  public class SpecNested<N> extends SpecFluent<SpecNested<N>> implements Nested<N>{
    SpecNested(Spec item) {
      this.builder = new SpecBuilder(this, item);
    }
    SpecBuilder builder;
    
    public N and() {
      return (N) VolumeClaimTemplateFluent.this.withSpec(builder.build());
    }
    
    public N endVolumeclaimtemplateSpec() {
      return and();
    }
    
  
  }

}