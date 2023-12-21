package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.SecretBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.DownwardAPIFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.ConfigMapFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.DownwardAPI;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.ConfigMapBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.DownwardAPIBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.ServiceAccountToken;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.ConfigMap;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.ServiceAccountTokenFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.Secret;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.SecretFluent;
import java.lang.Object;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.ServiceAccountTokenBuilder;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SourcesFluent<A extends SourcesFluent<A>> extends BaseFluent<A>{
  public SourcesFluent() {
  }
  
  public SourcesFluent(Sources instance) {
    this.copyInstance(instance);
  }
  private ConfigMapBuilder configMap;
  private DownwardAPIBuilder downwardAPI;
  private SecretBuilder secret;
  private ServiceAccountTokenBuilder serviceAccountToken;
  
  protected void copyInstance(Sources instance) {
    instance = (instance != null ? instance : new Sources());
    if (instance != null) {
          this.withConfigMap(instance.getConfigMap());
          this.withDownwardAPI(instance.getDownwardAPI());
          this.withSecret(instance.getSecret());
          this.withServiceAccountToken(instance.getServiceAccountToken());
        }
  }
  
  public ConfigMap buildConfigMap() {
    return this.configMap != null ? this.configMap.build() : null;
  }
  
  public A withConfigMap(ConfigMap configMap) {
    this._visitables.remove("configMap");
    if (configMap != null) {
        this.configMap = new ConfigMapBuilder(configMap);
        this._visitables.get("configMap").add(this.configMap);
    } else {
        this.configMap = null;
        this._visitables.get("configMap").remove(this.configMap);
    }
    return (A) this;
  }
  
  public boolean hasConfigMap() {
    return this.configMap != null;
  }
  
  public ConfigMapNested<A> withNewConfigMap() {
    return new ConfigMapNested(null);
  }
  
  public ConfigMapNested<A> withNewConfigMapLike(ConfigMap item) {
    return new ConfigMapNested(item);
  }
  
  public ConfigMapNested<A> editSourcesConfigMap() {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(null));
  }
  
  public ConfigMapNested<A> editOrNewConfigMap() {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(new ConfigMapBuilder().build()));
  }
  
  public ConfigMapNested<A> editOrNewConfigMapLike(ConfigMap item) {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(item));
  }
  
  public DownwardAPI buildDownwardAPI() {
    return this.downwardAPI != null ? this.downwardAPI.build() : null;
  }
  
  public A withDownwardAPI(DownwardAPI downwardAPI) {
    this._visitables.remove("downwardAPI");
    if (downwardAPI != null) {
        this.downwardAPI = new DownwardAPIBuilder(downwardAPI);
        this._visitables.get("downwardAPI").add(this.downwardAPI);
    } else {
        this.downwardAPI = null;
        this._visitables.get("downwardAPI").remove(this.downwardAPI);
    }
    return (A) this;
  }
  
  public boolean hasDownwardAPI() {
    return this.downwardAPI != null;
  }
  
  public DownwardAPINested<A> withNewDownwardAPI() {
    return new DownwardAPINested(null);
  }
  
  public DownwardAPINested<A> withNewDownwardAPILike(DownwardAPI item) {
    return new DownwardAPINested(item);
  }
  
  public DownwardAPINested<A> editSourcesDownwardAPI() {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(null));
  }
  
  public DownwardAPINested<A> editOrNewDownwardAPI() {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(new DownwardAPIBuilder().build()));
  }
  
  public DownwardAPINested<A> editOrNewDownwardAPILike(DownwardAPI item) {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(item));
  }
  
  public Secret buildSecret() {
    return this.secret != null ? this.secret.build() : null;
  }
  
  public A withSecret(Secret secret) {
    this._visitables.remove("secret");
    if (secret != null) {
        this.secret = new SecretBuilder(secret);
        this._visitables.get("secret").add(this.secret);
    } else {
        this.secret = null;
        this._visitables.get("secret").remove(this.secret);
    }
    return (A) this;
  }
  
  public boolean hasSecret() {
    return this.secret != null;
  }
  
  public SecretNested<A> withNewSecret() {
    return new SecretNested(null);
  }
  
  public SecretNested<A> withNewSecretLike(Secret item) {
    return new SecretNested(item);
  }
  
  public SecretNested<A> editSourcesSecret() {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(null));
  }
  
  public SecretNested<A> editOrNewSecret() {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(new SecretBuilder().build()));
  }
  
  public SecretNested<A> editOrNewSecretLike(Secret item) {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(item));
  }
  
  public ServiceAccountToken buildServiceAccountToken() {
    return this.serviceAccountToken != null ? this.serviceAccountToken.build() : null;
  }
  
  public A withServiceAccountToken(ServiceAccountToken serviceAccountToken) {
    this._visitables.remove("serviceAccountToken");
    if (serviceAccountToken != null) {
        this.serviceAccountToken = new ServiceAccountTokenBuilder(serviceAccountToken);
        this._visitables.get("serviceAccountToken").add(this.serviceAccountToken);
    } else {
        this.serviceAccountToken = null;
        this._visitables.get("serviceAccountToken").remove(this.serviceAccountToken);
    }
    return (A) this;
  }
  
  public boolean hasServiceAccountToken() {
    return this.serviceAccountToken != null;
  }
  
  public ServiceAccountTokenNested<A> withNewServiceAccountToken() {
    return new ServiceAccountTokenNested(null);
  }
  
  public ServiceAccountTokenNested<A> withNewServiceAccountTokenLike(ServiceAccountToken item) {
    return new ServiceAccountTokenNested(item);
  }
  
  public ServiceAccountTokenNested<A> editIntegrationServiceAccountToken() {
    return withNewServiceAccountTokenLike(java.util.Optional.ofNullable(buildServiceAccountToken()).orElse(null));
  }
  
  public ServiceAccountTokenNested<A> editOrNewServiceAccountToken() {
    return withNewServiceAccountTokenLike(java.util.Optional.ofNullable(buildServiceAccountToken()).orElse(new ServiceAccountTokenBuilder().build()));
  }
  
  public ServiceAccountTokenNested<A> editOrNewServiceAccountTokenLike(ServiceAccountToken item) {
    return withNewServiceAccountTokenLike(java.util.Optional.ofNullable(buildServiceAccountToken()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    SourcesFluent that = (SourcesFluent) o;
    if (!java.util.Objects.equals(configMap, that.configMap)) return false;
    if (!java.util.Objects.equals(downwardAPI, that.downwardAPI)) return false;
    if (!java.util.Objects.equals(secret, that.secret)) return false;
    if (!java.util.Objects.equals(serviceAccountToken, that.serviceAccountToken)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configMap,  downwardAPI,  secret,  serviceAccountToken,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configMap != null) { sb.append("configMap:"); sb.append(configMap + ","); }
    if (downwardAPI != null) { sb.append("downwardAPI:"); sb.append(downwardAPI + ","); }
    if (secret != null) { sb.append("secret:"); sb.append(secret + ","); }
    if (serviceAccountToken != null) { sb.append("serviceAccountToken:"); sb.append(serviceAccountToken); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigMapNested<N> extends ConfigMapFluent<ConfigMapNested<N>> implements Nested<N>{
    ConfigMapNested(ConfigMap item) {
      this.builder = new ConfigMapBuilder(this, item);
    }
    ConfigMapBuilder builder;
    
    public N and() {
      return (N) SourcesFluent.this.withConfigMap(builder.build());
    }
    
    public N endSourcesConfigMap() {
      return and();
    }
    
  
  }
  public class DownwardAPINested<N> extends DownwardAPIFluent<DownwardAPINested<N>> implements Nested<N>{
    DownwardAPINested(DownwardAPI item) {
      this.builder = new DownwardAPIBuilder(this, item);
    }
    DownwardAPIBuilder builder;
    
    public N and() {
      return (N) SourcesFluent.this.withDownwardAPI(builder.build());
    }
    
    public N endSourcesDownwardAPI() {
      return and();
    }
    
  
  }
  public class SecretNested<N> extends SecretFluent<SecretNested<N>> implements Nested<N>{
    SecretNested(Secret item) {
      this.builder = new SecretBuilder(this, item);
    }
    SecretBuilder builder;
    
    public N and() {
      return (N) SourcesFluent.this.withSecret(builder.build());
    }
    
    public N endSourcesSecret() {
      return and();
    }
    
  
  }
  public class ServiceAccountTokenNested<N> extends ServiceAccountTokenFluent<ServiceAccountTokenNested<N>> implements Nested<N>{
    ServiceAccountTokenNested(ServiceAccountToken item) {
      this.builder = new ServiceAccountTokenBuilder(this, item);
    }
    ServiceAccountTokenBuilder builder;
    
    public N and() {
      return (N) SourcesFluent.this.withServiceAccountToken(builder.build());
    }
    
    public N endIntegrationServiceAccountToken() {
      return and();
    }
    
  
  }

}