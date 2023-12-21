package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.envfrom.ConfigMapRefFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.envfrom.ConfigMapRef;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.envfrom.ConfigMapRefBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.envfrom.SecretRefBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.envfrom.SecretRefFluent;
import java.lang.Object;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.envfrom.SecretRef;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class EnvFromFluent<A extends EnvFromFluent<A>> extends BaseFluent<A>{
  public EnvFromFluent() {
  }
  
  public EnvFromFluent(EnvFrom instance) {
    this.copyInstance(instance);
  }
  private ConfigMapRefBuilder configMapRef;
  private String prefix;
  private SecretRefBuilder secretRef;
  
  protected void copyInstance(EnvFrom instance) {
    instance = (instance != null ? instance : new EnvFrom());
    if (instance != null) {
          this.withConfigMapRef(instance.getConfigMapRef());
          this.withPrefix(instance.getPrefix());
          this.withSecretRef(instance.getSecretRef());
        }
  }
  
  public ConfigMapRef buildConfigMapRef() {
    return this.configMapRef != null ? this.configMapRef.build() : null;
  }
  
  public A withConfigMapRef(ConfigMapRef configMapRef) {
    this._visitables.remove("configMapRef");
    if (configMapRef != null) {
        this.configMapRef = new ConfigMapRefBuilder(configMapRef);
        this._visitables.get("configMapRef").add(this.configMapRef);
    } else {
        this.configMapRef = null;
        this._visitables.get("configMapRef").remove(this.configMapRef);
    }
    return (A) this;
  }
  
  public boolean hasConfigMapRef() {
    return this.configMapRef != null;
  }
  
  public ConfigMapRefNested<A> withNewConfigMapRef() {
    return new ConfigMapRefNested(null);
  }
  
  public ConfigMapRefNested<A> withNewConfigMapRefLike(ConfigMapRef item) {
    return new ConfigMapRefNested(item);
  }
  
  public ConfigMapRefNested<A> editEphemeralcontainersConfigMapRef() {
    return withNewConfigMapRefLike(java.util.Optional.ofNullable(buildConfigMapRef()).orElse(null));
  }
  
  public ConfigMapRefNested<A> editOrNewConfigMapRef() {
    return withNewConfigMapRefLike(java.util.Optional.ofNullable(buildConfigMapRef()).orElse(new ConfigMapRefBuilder().build()));
  }
  
  public ConfigMapRefNested<A> editOrNewConfigMapRefLike(ConfigMapRef item) {
    return withNewConfigMapRefLike(java.util.Optional.ofNullable(buildConfigMapRef()).orElse(item));
  }
  
  public String getPrefix() {
    return this.prefix;
  }
  
  public A withPrefix(String prefix) {
    this.prefix = prefix;
    return (A) this;
  }
  
  public boolean hasPrefix() {
    return this.prefix != null;
  }
  
  public SecretRef buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }
  
  public A withSecretRef(SecretRef secretRef) {
    this._visitables.remove("secretRef");
    if (secretRef != null) {
        this.secretRef = new SecretRefBuilder(secretRef);
        this._visitables.get("secretRef").add(this.secretRef);
    } else {
        this.secretRef = null;
        this._visitables.get("secretRef").remove(this.secretRef);
    }
    return (A) this;
  }
  
  public boolean hasSecretRef() {
    return this.secretRef != null;
  }
  
  public SecretRefNested<A> withNewSecretRef() {
    return new SecretRefNested(null);
  }
  
  public SecretRefNested<A> withNewSecretRefLike(SecretRef item) {
    return new SecretRefNested(item);
  }
  
  public SecretRefNested<A> editEphemeralcontainersSecretRef() {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(null));
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(new SecretRefBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(SecretRef item) {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EnvFromFluent that = (EnvFromFluent) o;
    if (!java.util.Objects.equals(configMapRef, that.configMapRef)) return false;
    if (!java.util.Objects.equals(prefix, that.prefix)) return false;
    if (!java.util.Objects.equals(secretRef, that.secretRef)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configMapRef,  prefix,  secretRef,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configMapRef != null) { sb.append("configMapRef:"); sb.append(configMapRef + ","); }
    if (prefix != null) { sb.append("prefix:"); sb.append(prefix + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigMapRefNested<N> extends ConfigMapRefFluent<ConfigMapRefNested<N>> implements Nested<N>{
    ConfigMapRefNested(ConfigMapRef item) {
      this.builder = new ConfigMapRefBuilder(this, item);
    }
    ConfigMapRefBuilder builder;
    
    public N and() {
      return (N) EnvFromFluent.this.withConfigMapRef(builder.build());
    }
    
    public N endEphemeralcontainersConfigMapRef() {
      return and();
    }
    
  
  }
  public class SecretRefNested<N> extends SecretRefFluent<SecretRefNested<N>> implements Nested<N>{
    SecretRefNested(SecretRef item) {
      this.builder = new SecretRefBuilder(this, item);
    }
    SecretRefBuilder builder;
    
    public N and() {
      return (N) EnvFromFluent.this.withSecretRef(builder.build());
    }
    
    public N endEphemeralcontainersSecretRef() {
      return and();
    }
    
  
  }

}