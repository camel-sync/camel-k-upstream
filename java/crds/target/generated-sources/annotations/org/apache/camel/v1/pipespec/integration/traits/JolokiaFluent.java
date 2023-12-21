package org.apache.camel.v1.pipespec.integration.traits;

import org.apache.camel.v1.pipespec.integration.traits.jolokia.ConfigurationBuilder;
import org.apache.camel.v1.pipespec.integration.traits.jolokia.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.pipespec.integration.traits.jolokia.ConfigurationFluent;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class JolokiaFluent<A extends JolokiaFluent<A>> extends BaseFluent<A>{
  public JolokiaFluent() {
  }
  
  public JolokiaFluent(Jolokia instance) {
    this.copyInstance(instance);
  }
  private String CACert;
  private List<String> clientPrincipal;
  private ConfigurationBuilder configuration;
  private Boolean discoveryEnabled;
  private Boolean enabled;
  private Boolean extendedClientCheck;
  private String host;
  private List<String> options;
  private String password;
  private Long port;
  private String protocol;
  private Boolean useSSLClientAuthentication;
  private String user;
  
  protected void copyInstance(Jolokia instance) {
    instance = (instance != null ? instance : new Jolokia());
    if (instance != null) {
          this.withCACert(instance.getCACert());
          this.withClientPrincipal(instance.getClientPrincipal());
          this.withConfiguration(instance.getConfiguration());
          this.withDiscoveryEnabled(instance.getDiscoveryEnabled());
          this.withEnabled(instance.getEnabled());
          this.withExtendedClientCheck(instance.getExtendedClientCheck());
          this.withHost(instance.getHost());
          this.withOptions(instance.getOptions());
          this.withPassword(instance.getPassword());
          this.withPort(instance.getPort());
          this.withProtocol(instance.getProtocol());
          this.withUseSSLClientAuthentication(instance.getUseSSLClientAuthentication());
          this.withUser(instance.getUser());
        }
  }
  
  public String getCACert() {
    return this.CACert;
  }
  
  public A withCACert(String CACert) {
    this.CACert = CACert;
    return (A) this;
  }
  
  public boolean hasCACert() {
    return this.CACert != null;
  }
  
  public A addToClientPrincipal(int index,String item) {
    if (this.clientPrincipal == null) {this.clientPrincipal = new ArrayList<String>();}
    this.clientPrincipal.add(index, item);
    return (A)this;
  }
  
  public A setToClientPrincipal(int index,String item) {
    if (this.clientPrincipal == null) {this.clientPrincipal = new ArrayList<String>();}
    this.clientPrincipal.set(index, item); return (A)this;
  }
  
  public A addToClientPrincipal(java.lang.String... items) {
    if (this.clientPrincipal == null) {this.clientPrincipal = new ArrayList<String>();}
    for (String item : items) {this.clientPrincipal.add(item);} return (A)this;
  }
  
  public A addAllToClientPrincipal(Collection<String> items) {
    if (this.clientPrincipal == null) {this.clientPrincipal = new ArrayList<String>();}
    for (String item : items) {this.clientPrincipal.add(item);} return (A)this;
  }
  
  public A removeFromClientPrincipal(java.lang.String... items) {
    if (this.clientPrincipal == null) return (A)this;
    for (String item : items) { this.clientPrincipal.remove(item);} return (A)this;
  }
  
  public A removeAllFromClientPrincipal(Collection<String> items) {
    if (this.clientPrincipal == null) return (A)this;
    for (String item : items) { this.clientPrincipal.remove(item);} return (A)this;
  }
  
  public List<String> getClientPrincipal() {
    return this.clientPrincipal;
  }
  
  public String getClientPrincipal(int index) {
    return this.clientPrincipal.get(index);
  }
  
  public String getFirstClientPrincipal() {
    return this.clientPrincipal.get(0);
  }
  
  public String getLastClientPrincipal() {
    return this.clientPrincipal.get(clientPrincipal.size() - 1);
  }
  
  public String getMatchingClientPrincipal(Predicate<String> predicate) {
      for (String item : clientPrincipal) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingClientPrincipal(Predicate<String> predicate) {
      for (String item : clientPrincipal) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withClientPrincipal(List<String> clientPrincipal) {
    if (clientPrincipal != null) {
        this.clientPrincipal = new ArrayList();
        for (String item : clientPrincipal) {
          this.addToClientPrincipal(item);
        }
    } else {
      this.clientPrincipal = null;
    }
    return (A) this;
  }
  
  public A withClientPrincipal(java.lang.String... clientPrincipal) {
    if (this.clientPrincipal != null) {
        this.clientPrincipal.clear();
        _visitables.remove("clientPrincipal");
    }
    if (clientPrincipal != null) {
      for (String item : clientPrincipal) {
        this.addToClientPrincipal(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasClientPrincipal() {
    return this.clientPrincipal != null && !this.clientPrincipal.isEmpty();
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
  
  public Boolean getDiscoveryEnabled() {
    return this.discoveryEnabled;
  }
  
  public A withDiscoveryEnabled(Boolean discoveryEnabled) {
    this.discoveryEnabled = discoveryEnabled;
    return (A) this;
  }
  
  public boolean hasDiscoveryEnabled() {
    return this.discoveryEnabled != null;
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
  
  public Boolean getExtendedClientCheck() {
    return this.extendedClientCheck;
  }
  
  public A withExtendedClientCheck(Boolean extendedClientCheck) {
    this.extendedClientCheck = extendedClientCheck;
    return (A) this;
  }
  
  public boolean hasExtendedClientCheck() {
    return this.extendedClientCheck != null;
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
  
  public A addToOptions(int index,String item) {
    if (this.options == null) {this.options = new ArrayList<String>();}
    this.options.add(index, item);
    return (A)this;
  }
  
  public A setToOptions(int index,String item) {
    if (this.options == null) {this.options = new ArrayList<String>();}
    this.options.set(index, item); return (A)this;
  }
  
  public A addToOptions(java.lang.String... items) {
    if (this.options == null) {this.options = new ArrayList<String>();}
    for (String item : items) {this.options.add(item);} return (A)this;
  }
  
  public A addAllToOptions(Collection<String> items) {
    if (this.options == null) {this.options = new ArrayList<String>();}
    for (String item : items) {this.options.add(item);} return (A)this;
  }
  
  public A removeFromOptions(java.lang.String... items) {
    if (this.options == null) return (A)this;
    for (String item : items) { this.options.remove(item);} return (A)this;
  }
  
  public A removeAllFromOptions(Collection<String> items) {
    if (this.options == null) return (A)this;
    for (String item : items) { this.options.remove(item);} return (A)this;
  }
  
  public List<String> getOptions() {
    return this.options;
  }
  
  public String getOption(int index) {
    return this.options.get(index);
  }
  
  public String getFirstOption() {
    return this.options.get(0);
  }
  
  public String getLastOption() {
    return this.options.get(options.size() - 1);
  }
  
  public String getMatchingOption(Predicate<String> predicate) {
      for (String item : options) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingOption(Predicate<String> predicate) {
      for (String item : options) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withOptions(List<String> options) {
    if (options != null) {
        this.options = new ArrayList();
        for (String item : options) {
          this.addToOptions(item);
        }
    } else {
      this.options = null;
    }
    return (A) this;
  }
  
  public A withOptions(java.lang.String... options) {
    if (this.options != null) {
        this.options.clear();
        _visitables.remove("options");
    }
    if (options != null) {
      for (String item : options) {
        this.addToOptions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasOptions() {
    return this.options != null && !this.options.isEmpty();
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public A withPassword(String password) {
    this.password = password;
    return (A) this;
  }
  
  public boolean hasPassword() {
    return this.password != null;
  }
  
  public Long getPort() {
    return this.port;
  }
  
  public A withPort(Long port) {
    this.port = port;
    return (A) this;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public String getProtocol() {
    return this.protocol;
  }
  
  public A withProtocol(String protocol) {
    this.protocol = protocol;
    return (A) this;
  }
  
  public boolean hasProtocol() {
    return this.protocol != null;
  }
  
  public Boolean getUseSSLClientAuthentication() {
    return this.useSSLClientAuthentication;
  }
  
  public A withUseSSLClientAuthentication(Boolean useSSLClientAuthentication) {
    this.useSSLClientAuthentication = useSSLClientAuthentication;
    return (A) this;
  }
  
  public boolean hasUseSSLClientAuthentication() {
    return this.useSSLClientAuthentication != null;
  }
  
  public String getUser() {
    return this.user;
  }
  
  public A withUser(String user) {
    this.user = user;
    return (A) this;
  }
  
  public boolean hasUser() {
    return this.user != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    JolokiaFluent that = (JolokiaFluent) o;
    if (!java.util.Objects.equals(CACert, that.CACert)) return false;
    if (!java.util.Objects.equals(clientPrincipal, that.clientPrincipal)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(discoveryEnabled, that.discoveryEnabled)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(extendedClientCheck, that.extendedClientCheck)) return false;
    if (!java.util.Objects.equals(host, that.host)) return false;
    if (!java.util.Objects.equals(options, that.options)) return false;
    if (!java.util.Objects.equals(password, that.password)) return false;
    if (!java.util.Objects.equals(port, that.port)) return false;
    if (!java.util.Objects.equals(protocol, that.protocol)) return false;
    if (!java.util.Objects.equals(useSSLClientAuthentication, that.useSSLClientAuthentication)) return false;
    if (!java.util.Objects.equals(user, that.user)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(CACert,  clientPrincipal,  configuration,  discoveryEnabled,  enabled,  extendedClientCheck,  host,  options,  password,  port,  protocol,  useSSLClientAuthentication,  user,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (CACert != null) { sb.append("CACert:"); sb.append(CACert + ","); }
    if (clientPrincipal != null && !clientPrincipal.isEmpty()) { sb.append("clientPrincipal:"); sb.append(clientPrincipal + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (discoveryEnabled != null) { sb.append("discoveryEnabled:"); sb.append(discoveryEnabled + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (extendedClientCheck != null) { sb.append("extendedClientCheck:"); sb.append(extendedClientCheck + ","); }
    if (host != null) { sb.append("host:"); sb.append(host + ","); }
    if (options != null && !options.isEmpty()) { sb.append("options:"); sb.append(options + ","); }
    if (password != null) { sb.append("password:"); sb.append(password + ","); }
    if (port != null) { sb.append("port:"); sb.append(port + ","); }
    if (protocol != null) { sb.append("protocol:"); sb.append(protocol + ","); }
    if (useSSLClientAuthentication != null) { sb.append("useSSLClientAuthentication:"); sb.append(useSSLClientAuthentication + ","); }
    if (user != null) { sb.append("user:"); sb.append(user); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDiscoveryEnabled() {
    return withDiscoveryEnabled(true);
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withExtendedClientCheck() {
    return withExtendedClientCheck(true);
  }
  
  public A withUseSSLClientAuthentication() {
    return withUseSSLClientAuthentication(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) JolokiaFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}