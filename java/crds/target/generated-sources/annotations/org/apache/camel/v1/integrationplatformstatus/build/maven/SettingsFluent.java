package org.apache.camel.v1.integrationplatformstatus.build.maven;

import org.apache.camel.v1.integrationplatformstatus.build.maven.settings.ConfigMapKeyRef;
import org.apache.camel.v1.integrationplatformstatus.build.maven.settings.SecretKeyRefFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1.integrationplatformstatus.build.maven.settings.ConfigMapKeyRefBuilder;
import java.lang.String;
import org.apache.camel.v1.integrationplatformstatus.build.maven.settings.ConfigMapKeyRefFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import org.apache.camel.v1.integrationplatformstatus.build.maven.settings.SecretKeyRefBuilder;
import org.apache.camel.v1.integrationplatformstatus.build.maven.settings.SecretKeyRef;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SettingsFluent<A extends SettingsFluent<A>> extends BaseFluent<A>{
  public SettingsFluent() {
  }
  
  public SettingsFluent(Settings instance) {
    this.copyInstance(instance);
  }
  private ConfigMapKeyRefBuilder configMapKeyRef;
  private SecretKeyRefBuilder secretKeyRef;
  
  protected void copyInstance(Settings instance) {
    instance = (instance != null ? instance : new Settings());
    if (instance != null) {
          this.withConfigMapKeyRef(instance.getConfigMapKeyRef());
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
  
  public ConfigMapKeyRefNested<A> editSettingsConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(null));
  }
  
  public ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(new ConfigMapKeyRefBuilder().build()));
  }
  
  public ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRefLike(ConfigMapKeyRef item) {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(item));
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
  
  public SecretKeyRefNested<A> editSettingsSecretKeyRef() {
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
    SettingsFluent that = (SettingsFluent) o;
    if (!java.util.Objects.equals(configMapKeyRef, that.configMapKeyRef)) return false;
    if (!java.util.Objects.equals(secretKeyRef, that.secretKeyRef)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configMapKeyRef,  secretKeyRef,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configMapKeyRef != null) { sb.append("configMapKeyRef:"); sb.append(configMapKeyRef + ","); }
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
      return (N) SettingsFluent.this.withConfigMapKeyRef(builder.build());
    }
    
    public N endSettingsConfigMapKeyRef() {
      return and();
    }
    
  
  }
  public class SecretKeyRefNested<N> extends SecretKeyRefFluent<SecretKeyRefNested<N>> implements Nested<N>{
    SecretKeyRefNested(SecretKeyRef item) {
      this.builder = new SecretKeyRefBuilder(this, item);
    }
    SecretKeyRefBuilder builder;
    
    public N and() {
      return (N) SettingsFluent.this.withSecretKeyRef(builder.build());
    }
    
    public N endSettingsSecretKeyRef() {
      return and();
    }
    
  
  }

}