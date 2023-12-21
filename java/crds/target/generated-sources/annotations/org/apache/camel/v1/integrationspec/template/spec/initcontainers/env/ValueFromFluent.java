package org.apache.camel.v1.integrationspec.template.spec.initcontainers.env;

import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.ConfigMapKeyRef;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.SecretKeyRefFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.ResourceFieldRefFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.ConfigMapKeyRefBuilder;
import java.lang.String;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.ResourceFieldRefBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.SecretKeyRefBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.FieldRef;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.ResourceFieldRef;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.FieldRefBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.FieldRefFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.ConfigMapKeyRefFluent;
import java.lang.Object;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.env.valuefrom.SecretKeyRef;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ValueFromFluent<A extends ValueFromFluent<A>> extends BaseFluent<A>{
  public ValueFromFluent() {
  }
  
  public ValueFromFluent(ValueFrom instance) {
    this.copyInstance(instance);
  }
  private ConfigMapKeyRefBuilder configMapKeyRef;
  private FieldRefBuilder fieldRef;
  private ResourceFieldRefBuilder resourceFieldRef;
  private SecretKeyRefBuilder secretKeyRef;
  
  protected void copyInstance(ValueFrom instance) {
    instance = (instance != null ? instance : new ValueFrom());
    if (instance != null) {
          this.withConfigMapKeyRef(instance.getConfigMapKeyRef());
          this.withFieldRef(instance.getFieldRef());
          this.withResourceFieldRef(instance.getResourceFieldRef());
          this.withSecretKeyRef(instance.getSecretKeyRef());
        }
  }
  
  public ConfigMapKeyRef buildConfigMapKeyRef() {
    return this.configMapKeyRef != null ? this.configMapKeyRef.build() : null;
  }
  
  public A withConfigMapKeyRef(ConfigMapKeyRef configMapKeyRef) {
    this._visitables.remove("configMapKeyRef");
    if (configMapKeyRef != null) {
        this.configMapKeyRef = new ConfigMapKeyRefBuilder(configMapKeyRef);
        this._visitables.get("configMapKeyRef").add(this.configMapKeyRef);
    } else {
        this.configMapKeyRef = null;
        this._visitables.get("configMapKeyRef").remove(this.configMapKeyRef);
    }
    return (A) this;
  }
  
  public boolean hasConfigMapKeyRef() {
    return this.configMapKeyRef != null;
  }
  
  public ConfigMapKeyRefNested<A> withNewConfigMapKeyRef() {
    return new ConfigMapKeyRefNested(null);
  }
  
  public ConfigMapKeyRefNested<A> withNewConfigMapKeyRefLike(ConfigMapKeyRef item) {
    return new ConfigMapKeyRefNested(item);
  }
  
  public ConfigMapKeyRefNested<A> editValuefromConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(null));
  }
  
  public ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(new ConfigMapKeyRefBuilder().build()));
  }
  
  public ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRefLike(ConfigMapKeyRef item) {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(item));
  }
  
  public FieldRef buildFieldRef() {
    return this.fieldRef != null ? this.fieldRef.build() : null;
  }
  
  public A withFieldRef(FieldRef fieldRef) {
    this._visitables.remove("fieldRef");
    if (fieldRef != null) {
        this.fieldRef = new FieldRefBuilder(fieldRef);
        this._visitables.get("fieldRef").add(this.fieldRef);
    } else {
        this.fieldRef = null;
        this._visitables.get("fieldRef").remove(this.fieldRef);
    }
    return (A) this;
  }
  
  public boolean hasFieldRef() {
    return this.fieldRef != null;
  }
  
  public FieldRefNested<A> withNewFieldRef() {
    return new FieldRefNested(null);
  }
  
  public FieldRefNested<A> withNewFieldRefLike(FieldRef item) {
    return new FieldRefNested(item);
  }
  
  public FieldRefNested<A> editInitcontainersFieldRef() {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(null));
  }
  
  public FieldRefNested<A> editOrNewFieldRef() {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(new FieldRefBuilder().build()));
  }
  
  public FieldRefNested<A> editOrNewFieldRefLike(FieldRef item) {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(item));
  }
  
  public ResourceFieldRef buildResourceFieldRef() {
    return this.resourceFieldRef != null ? this.resourceFieldRef.build() : null;
  }
  
  public A withResourceFieldRef(ResourceFieldRef resourceFieldRef) {
    this._visitables.remove("resourceFieldRef");
    if (resourceFieldRef != null) {
        this.resourceFieldRef = new ResourceFieldRefBuilder(resourceFieldRef);
        this._visitables.get("resourceFieldRef").add(this.resourceFieldRef);
    } else {
        this.resourceFieldRef = null;
        this._visitables.get("resourceFieldRef").remove(this.resourceFieldRef);
    }
    return (A) this;
  }
  
  public boolean hasResourceFieldRef() {
    return this.resourceFieldRef != null;
  }
  
  public ResourceFieldRefNested<A> withNewResourceFieldRef() {
    return new ResourceFieldRefNested(null);
  }
  
  public ResourceFieldRefNested<A> withNewResourceFieldRefLike(ResourceFieldRef item) {
    return new ResourceFieldRefNested(item);
  }
  
  public ResourceFieldRefNested<A> editInitcontainersResourceFieldRef() {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(null));
  }
  
  public ResourceFieldRefNested<A> editOrNewResourceFieldRef() {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(new ResourceFieldRefBuilder().build()));
  }
  
  public ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(ResourceFieldRef item) {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(item));
  }
  
  public SecretKeyRef buildSecretKeyRef() {
    return this.secretKeyRef != null ? this.secretKeyRef.build() : null;
  }
  
  public A withSecretKeyRef(SecretKeyRef secretKeyRef) {
    this._visitables.remove("secretKeyRef");
    if (secretKeyRef != null) {
        this.secretKeyRef = new SecretKeyRefBuilder(secretKeyRef);
        this._visitables.get("secretKeyRef").add(this.secretKeyRef);
    } else {
        this.secretKeyRef = null;
        this._visitables.get("secretKeyRef").remove(this.secretKeyRef);
    }
    return (A) this;
  }
  
  public boolean hasSecretKeyRef() {
    return this.secretKeyRef != null;
  }
  
  public SecretKeyRefNested<A> withNewSecretKeyRef() {
    return new SecretKeyRefNested(null);
  }
  
  public SecretKeyRefNested<A> withNewSecretKeyRefLike(SecretKeyRef item) {
    return new SecretKeyRefNested(item);
  }
  
  public SecretKeyRefNested<A> editValuefromSecretKeyRef() {
    return withNewSecretKeyRefLike(java.util.Optional.ofNullable(buildSecretKeyRef()).orElse(null));
  }
  
  public SecretKeyRefNested<A> editOrNewSecretKeyRef() {
    return withNewSecretKeyRefLike(java.util.Optional.ofNullable(buildSecretKeyRef()).orElse(new SecretKeyRefBuilder().build()));
  }
  
  public SecretKeyRefNested<A> editOrNewSecretKeyRefLike(SecretKeyRef item) {
    return withNewSecretKeyRefLike(java.util.Optional.ofNullable(buildSecretKeyRef()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ValueFromFluent that = (ValueFromFluent) o;
    if (!java.util.Objects.equals(configMapKeyRef, that.configMapKeyRef)) return false;
    if (!java.util.Objects.equals(fieldRef, that.fieldRef)) return false;
    if (!java.util.Objects.equals(resourceFieldRef, that.resourceFieldRef)) return false;
    if (!java.util.Objects.equals(secretKeyRef, that.secretKeyRef)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configMapKeyRef,  fieldRef,  resourceFieldRef,  secretKeyRef,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configMapKeyRef != null) { sb.append("configMapKeyRef:"); sb.append(configMapKeyRef + ","); }
    if (fieldRef != null) { sb.append("fieldRef:"); sb.append(fieldRef + ","); }
    if (resourceFieldRef != null) { sb.append("resourceFieldRef:"); sb.append(resourceFieldRef + ","); }
    if (secretKeyRef != null) { sb.append("secretKeyRef:"); sb.append(secretKeyRef); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigMapKeyRefNested<N> extends ConfigMapKeyRefFluent<ConfigMapKeyRefNested<N>> implements Nested<N>{
    ConfigMapKeyRefNested(ConfigMapKeyRef item) {
      this.builder = new ConfigMapKeyRefBuilder(this, item);
    }
    ConfigMapKeyRefBuilder builder;
    
    public N and() {
      return (N) ValueFromFluent.this.withConfigMapKeyRef(builder.build());
    }
    
    public N endValuefromConfigMapKeyRef() {
      return and();
    }
    
  
  }
  public class FieldRefNested<N> extends FieldRefFluent<FieldRefNested<N>> implements Nested<N>{
    FieldRefNested(FieldRef item) {
      this.builder = new FieldRefBuilder(this, item);
    }
    FieldRefBuilder builder;
    
    public N and() {
      return (N) ValueFromFluent.this.withFieldRef(builder.build());
    }
    
    public N endInitcontainersFieldRef() {
      return and();
    }
    
  
  }
  public class ResourceFieldRefNested<N> extends ResourceFieldRefFluent<ResourceFieldRefNested<N>> implements Nested<N>{
    ResourceFieldRefNested(ResourceFieldRef item) {
      this.builder = new ResourceFieldRefBuilder(this, item);
    }
    ResourceFieldRefBuilder builder;
    
    public N and() {
      return (N) ValueFromFluent.this.withResourceFieldRef(builder.build());
    }
    
    public N endInitcontainersResourceFieldRef() {
      return and();
    }
    
  
  }
  public class SecretKeyRefNested<N> extends SecretKeyRefFluent<SecretKeyRefNested<N>> implements Nested<N>{
    SecretKeyRefNested(SecretKeyRef item) {
      this.builder = new SecretKeyRefBuilder(this, item);
    }
    SecretKeyRefBuilder builder;
    
    public N and() {
      return (N) ValueFromFluent.this.withSecretKeyRef(builder.build());
    }
    
    public N endValuefromSecretKeyRef() {
      return and();
    }
    
  
  }

}