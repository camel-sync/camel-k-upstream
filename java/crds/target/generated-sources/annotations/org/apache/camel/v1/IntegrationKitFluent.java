package org.apache.camel.v1;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class IntegrationKitFluent<A extends IntegrationKitFluent<A>> extends BaseFluent<A>{
  public IntegrationKitFluent() {
  }
  
  public IntegrationKitFluent(IntegrationKit instance) {
    this.copyInstance(instance);
  }
  private ObjectMetaBuilder metadata;
  private IntegrationKitSpecBuilder spec;
  private IntegrationKitStatusBuilder status;
  private String kind;
  private String apiVersion;
  
  protected void copyInstance(IntegrationKit instance) {
    instance = (instance != null ? instance : new IntegrationKit());
    if (instance != null) {
          this.withMetadata(instance.getMetadata());
          this.withSpec(instance.getSpec());
          this.withStatus(instance.getStatus());
          this.withKind(instance.getKind());
          this.withApiVersion(instance.getApiVersion());
        }
  }
  
  public ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new ObjectMetaBuilder(metadata);
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
  
  public MetadataNested<A> withNewMetadataLike(ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(ObjectMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public IntegrationKitSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }
  
  public A withSpec(IntegrationKitSpec spec) {
    this._visitables.remove("spec");
    if (spec != null) {
        this.spec = new IntegrationKitSpecBuilder(spec);
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
  
  public SpecNested<A> withNewSpecLike(IntegrationKitSpec item) {
    return new SpecNested(item);
  }
  
  public SpecNested<A> editSpec() {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(null));
  }
  
  public SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(new IntegrationKitSpecBuilder().build()));
  }
  
  public SpecNested<A> editOrNewSpecLike(IntegrationKitSpec item) {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(item));
  }
  
  public IntegrationKitStatus buildStatus() {
    return this.status != null ? this.status.build() : null;
  }
  
  public A withStatus(IntegrationKitStatus status) {
    this._visitables.remove("status");
    if (status != null) {
        this.status = new IntegrationKitStatusBuilder(status);
        this._visitables.get("status").add(this.status);
    } else {
        this.status = null;
        this._visitables.get("status").remove(this.status);
    }
    return (A) this;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public StatusNested<A> withNewStatus() {
    return new StatusNested(null);
  }
  
  public StatusNested<A> withNewStatusLike(IntegrationKitStatus item) {
    return new StatusNested(item);
  }
  
  public StatusNested<A> editStatus() {
    return withNewStatusLike(java.util.Optional.ofNullable(buildStatus()).orElse(null));
  }
  
  public StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(java.util.Optional.ofNullable(buildStatus()).orElse(new IntegrationKitStatusBuilder().build()));
  }
  
  public StatusNested<A> editOrNewStatusLike(IntegrationKitStatus item) {
    return withNewStatusLike(java.util.Optional.ofNullable(buildStatus()).orElse(item));
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    IntegrationKitFluent that = (IntegrationKitFluent) o;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(spec, that.spec)) return false;
    if (!java.util.Objects.equals(status, that.status)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(metadata,  spec,  status,  kind,  apiVersion,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (spec != null) { sb.append("spec:"); sb.append(spec + ","); }
    if (status != null) { sb.append("status:"); sb.append(status + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion); }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(ObjectMeta item) {
      this.builder = new ObjectMetaBuilder(this, item);
    }
    ObjectMetaBuilder builder;
    
    public N and() {
      return (N) IntegrationKitFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class SpecNested<N> extends IntegrationKitSpecFluent<SpecNested<N>> implements Nested<N>{
    SpecNested(IntegrationKitSpec item) {
      this.builder = new IntegrationKitSpecBuilder(this, item);
    }
    IntegrationKitSpecBuilder builder;
    
    public N and() {
      return (N) IntegrationKitFluent.this.withSpec(builder.build());
    }
    
    public N endSpec() {
      return and();
    }
    
  
  }
  public class StatusNested<N> extends IntegrationKitStatusFluent<StatusNested<N>> implements Nested<N>{
    StatusNested(IntegrationKitStatus item) {
      this.builder = new IntegrationKitStatusBuilder(this, item);
    }
    IntegrationKitStatusBuilder builder;
    
    public N and() {
      return (N) IntegrationKitFluent.this.withStatus(builder.build());
    }
    
    public N endStatus() {
      return and();
    }
    
  
  }

}