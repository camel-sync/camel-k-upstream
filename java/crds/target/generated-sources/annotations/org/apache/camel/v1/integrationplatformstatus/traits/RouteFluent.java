package org.apache.camel.v1.integrationplatformstatus.traits;

import org.apache.camel.v1.integrationplatformstatus.traits.route.ConfigurationBuilder;
import org.apache.camel.v1.integrationplatformstatus.traits.route.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.integrationplatformstatus.traits.route.ConfigurationFluent;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class RouteFluent<A extends RouteFluent<A>> extends BaseFluent<A>{
  public RouteFluent() {
  }
  
  public RouteFluent(Route instance) {
    this.copyInstance(instance);
  }
  private Map<String,String> annotations;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private String host;
  private String tlsCACertificate;
  private String tlsCACertificateSecret;
  private String tlsCertificate;
  private String tlsCertificateSecret;
  private String tlsDestinationCACertificate;
  private String tlsDestinationCACertificateSecret;
  private Route.TlsInsecureEdgeTerminationPolicy tlsInsecureEdgeTerminationPolicy;
  private String tlsKey;
  private String tlsKeySecret;
  private Route.TlsTermination tlsTermination;
  
  protected void copyInstance(Route instance) {
    instance = (instance != null ? instance : new Route());
    if (instance != null) {
          this.withAnnotations(instance.getAnnotations());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withHost(instance.getHost());
          this.withTlsCACertificate(instance.getTlsCACertificate());
          this.withTlsCACertificateSecret(instance.getTlsCACertificateSecret());
          this.withTlsCertificate(instance.getTlsCertificate());
          this.withTlsCertificateSecret(instance.getTlsCertificateSecret());
          this.withTlsDestinationCACertificate(instance.getTlsDestinationCACertificate());
          this.withTlsDestinationCACertificateSecret(instance.getTlsDestinationCACertificateSecret());
          this.withTlsInsecureEdgeTerminationPolicy(instance.getTlsInsecureEdgeTerminationPolicy());
          this.withTlsKey(instance.getTlsKey());
          this.withTlsKeySecret(instance.getTlsKeySecret());
          this.withTlsTermination(instance.getTlsTermination());
        }
  }
  
  public A addToAnnotations(String key,String value) {
    if(this.annotations == null && key != null && value != null) { this.annotations = new LinkedHashMap(); }
    if(key != null && value != null) {this.annotations.put(key, value);} return (A)this;
  }
  
  public A addToAnnotations(Map<String,String> map) {
    if(this.annotations == null && map != null) { this.annotations = new LinkedHashMap(); }
    if(map != null) { this.annotations.putAll(map);} return (A)this;
  }
  
  public A removeFromAnnotations(String key) {
    if(this.annotations == null) { return (A) this; }
    if(key != null && this.annotations != null) {this.annotations.remove(key);} return (A)this;
  }
  
  public A removeFromAnnotations(Map<String,String> map) {
    if(this.annotations == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.annotations != null){this.annotations.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getAnnotations() {
    return this.annotations;
  }
  
  public <K,V>A withAnnotations(Map<String,String> annotations) {
    if (annotations == null) {
      this.annotations = null;
    } else {
      this.annotations = new LinkedHashMap(annotations);
    }
    return (A) this;
  }
  
  public boolean hasAnnotations() {
    return this.annotations != null;
  }
  
  public Configuration buildConfiguration() {
    return this.configuration != null ? this.configuration.build() : null;
  }
  
  public A withConfiguration(Configuration configuration) {
    this._visitables.remove("configuration");
    if (configuration != null) {
        this.configuration = new ConfigurationBuilder(configuration);
        this._visitables.get("configuration").add(this.configuration);
    } else {
        this.configuration = null;
        this._visitables.get("configuration").remove(this.configuration);
    }
    return (A) this;
  }
  
  public boolean hasConfiguration() {
    return this.configuration != null;
  }
  
  public ConfigurationNested<A> withNewConfiguration() {
    return new ConfigurationNested(null);
  }
  
  public ConfigurationNested<A> withNewConfigurationLike(Configuration item) {
    return new ConfigurationNested(item);
  }
  
  public ConfigurationNested<A> editConfiguration() {
    return withNewConfigurationLike(java.util.Optional.ofNullable(buildConfiguration()).orElse(null));
  }
  
  public ConfigurationNested<A> editOrNewConfiguration() {
    return withNewConfigurationLike(java.util.Optional.ofNullable(buildConfiguration()).orElse(new ConfigurationBuilder().build()));
  }
  
  public ConfigurationNested<A> editOrNewConfigurationLike(Configuration item) {
    return withNewConfigurationLike(java.util.Optional.ofNullable(buildConfiguration()).orElse(item));
  }
  
  public Boolean getEnabled() {
    return this.enabled;
  }
  
  public A withEnabled(Boolean enabled) {
    this.enabled = enabled;
    return (A) this;
  }
  
  public boolean hasEnabled() {
    return this.enabled != null;
  }
  
  public String getHost() {
    return this.host;
  }
  
  public A withHost(String host) {
    this.host = host;
    return (A) this;
  }
  
  public boolean hasHost() {
    return this.host != null;
  }
  
  public String getTlsCACertificate() {
    return this.tlsCACertificate;
  }
  
  public A withTlsCACertificate(String tlsCACertificate) {
    this.tlsCACertificate = tlsCACertificate;
    return (A) this;
  }
  
  public boolean hasTlsCACertificate() {
    return this.tlsCACertificate != null;
  }
  
  public String getTlsCACertificateSecret() {
    return this.tlsCACertificateSecret;
  }
  
  public A withTlsCACertificateSecret(String tlsCACertificateSecret) {
    this.tlsCACertificateSecret = tlsCACertificateSecret;
    return (A) this;
  }
  
  public boolean hasTlsCACertificateSecret() {
    return this.tlsCACertificateSecret != null;
  }
  
  public String getTlsCertificate() {
    return this.tlsCertificate;
  }
  
  public A withTlsCertificate(String tlsCertificate) {
    this.tlsCertificate = tlsCertificate;
    return (A) this;
  }
  
  public boolean hasTlsCertificate() {
    return this.tlsCertificate != null;
  }
  
  public String getTlsCertificateSecret() {
    return this.tlsCertificateSecret;
  }
  
  public A withTlsCertificateSecret(String tlsCertificateSecret) {
    this.tlsCertificateSecret = tlsCertificateSecret;
    return (A) this;
  }
  
  public boolean hasTlsCertificateSecret() {
    return this.tlsCertificateSecret != null;
  }
  
  public String getTlsDestinationCACertificate() {
    return this.tlsDestinationCACertificate;
  }
  
  public A withTlsDestinationCACertificate(String tlsDestinationCACertificate) {
    this.tlsDestinationCACertificate = tlsDestinationCACertificate;
    return (A) this;
  }
  
  public boolean hasTlsDestinationCACertificate() {
    return this.tlsDestinationCACertificate != null;
  }
  
  public String getTlsDestinationCACertificateSecret() {
    return this.tlsDestinationCACertificateSecret;
  }
  
  public A withTlsDestinationCACertificateSecret(String tlsDestinationCACertificateSecret) {
    this.tlsDestinationCACertificateSecret = tlsDestinationCACertificateSecret;
    return (A) this;
  }
  
  public boolean hasTlsDestinationCACertificateSecret() {
    return this.tlsDestinationCACertificateSecret != null;
  }
  
  public Route.TlsInsecureEdgeTerminationPolicy getTlsInsecureEdgeTerminationPolicy() {
    return this.tlsInsecureEdgeTerminationPolicy;
  }
  
  public A withTlsInsecureEdgeTerminationPolicy(Route.TlsInsecureEdgeTerminationPolicy tlsInsecureEdgeTerminationPolicy) {
    this.tlsInsecureEdgeTerminationPolicy = tlsInsecureEdgeTerminationPolicy;
    return (A) this;
  }
  
  public boolean hasTlsInsecureEdgeTerminationPolicy() {
    return this.tlsInsecureEdgeTerminationPolicy != null;
  }
  
  public String getTlsKey() {
    return this.tlsKey;
  }
  
  public A withTlsKey(String tlsKey) {
    this.tlsKey = tlsKey;
    return (A) this;
  }
  
  public boolean hasTlsKey() {
    return this.tlsKey != null;
  }
  
  public String getTlsKeySecret() {
    return this.tlsKeySecret;
  }
  
  public A withTlsKeySecret(String tlsKeySecret) {
    this.tlsKeySecret = tlsKeySecret;
    return (A) this;
  }
  
  public boolean hasTlsKeySecret() {
    return this.tlsKeySecret != null;
  }
  
  public Route.TlsTermination getTlsTermination() {
    return this.tlsTermination;
  }
  
  public A withTlsTermination(Route.TlsTermination tlsTermination) {
    this.tlsTermination = tlsTermination;
    return (A) this;
  }
  
  public boolean hasTlsTermination() {
    return this.tlsTermination != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    RouteFluent that = (RouteFluent) o;
    if (!java.util.Objects.equals(annotations, that.annotations)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(host, that.host)) return false;
    if (!java.util.Objects.equals(tlsCACertificate, that.tlsCACertificate)) return false;
    if (!java.util.Objects.equals(tlsCACertificateSecret, that.tlsCACertificateSecret)) return false;
    if (!java.util.Objects.equals(tlsCertificate, that.tlsCertificate)) return false;
    if (!java.util.Objects.equals(tlsCertificateSecret, that.tlsCertificateSecret)) return false;
    if (!java.util.Objects.equals(tlsDestinationCACertificate, that.tlsDestinationCACertificate)) return false;
    if (!java.util.Objects.equals(tlsDestinationCACertificateSecret, that.tlsDestinationCACertificateSecret)) return false;
    if (!java.util.Objects.equals(tlsInsecureEdgeTerminationPolicy, that.tlsInsecureEdgeTerminationPolicy)) return false;
    if (!java.util.Objects.equals(tlsKey, that.tlsKey)) return false;
    if (!java.util.Objects.equals(tlsKeySecret, that.tlsKeySecret)) return false;
    if (!java.util.Objects.equals(tlsTermination, that.tlsTermination)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(annotations,  configuration,  enabled,  host,  tlsCACertificate,  tlsCACertificateSecret,  tlsCertificate,  tlsCertificateSecret,  tlsDestinationCACertificate,  tlsDestinationCACertificateSecret,  tlsInsecureEdgeTerminationPolicy,  tlsKey,  tlsKeySecret,  tlsTermination,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (annotations != null && !annotations.isEmpty()) { sb.append("annotations:"); sb.append(annotations + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (host != null) { sb.append("host:"); sb.append(host + ","); }
    if (tlsCACertificate != null) { sb.append("tlsCACertificate:"); sb.append(tlsCACertificate + ","); }
    if (tlsCACertificateSecret != null) { sb.append("tlsCACertificateSecret:"); sb.append(tlsCACertificateSecret + ","); }
    if (tlsCertificate != null) { sb.append("tlsCertificate:"); sb.append(tlsCertificate + ","); }
    if (tlsCertificateSecret != null) { sb.append("tlsCertificateSecret:"); sb.append(tlsCertificateSecret + ","); }
    if (tlsDestinationCACertificate != null) { sb.append("tlsDestinationCACertificate:"); sb.append(tlsDestinationCACertificate + ","); }
    if (tlsDestinationCACertificateSecret != null) { sb.append("tlsDestinationCACertificateSecret:"); sb.append(tlsDestinationCACertificateSecret + ","); }
    if (tlsInsecureEdgeTerminationPolicy != null) { sb.append("tlsInsecureEdgeTerminationPolicy:"); sb.append(tlsInsecureEdgeTerminationPolicy + ","); }
    if (tlsKey != null) { sb.append("tlsKey:"); sb.append(tlsKey + ","); }
    if (tlsKeySecret != null) { sb.append("tlsKeySecret:"); sb.append(tlsKeySecret + ","); }
    if (tlsTermination != null) { sb.append("tlsTermination:"); sb.append(tlsTermination); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) RouteFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}