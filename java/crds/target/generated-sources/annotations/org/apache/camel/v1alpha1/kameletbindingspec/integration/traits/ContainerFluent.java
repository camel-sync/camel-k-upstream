package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.container.ConfigurationBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.container.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.container.ConfigurationFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ContainerFluent<A extends ContainerFluent<A>> extends BaseFluent<A>{
  public ContainerFluent() {
  }
  
  public ContainerFluent(Container instance) {
    this.copyInstance(instance);
  }
  private Boolean auto;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private Boolean expose;
  private String image;
  private Container.ImagePullPolicy imagePullPolicy;
  private String limitCPU;
  private String limitMemory;
  private String name;
  private Long port;
  private String portName;
  private String requestCPU;
  private String requestMemory;
  private Long servicePort;
  private String servicePortName;
  
  protected void copyInstance(Container instance) {
    instance = (instance != null ? instance : new Container());
    if (instance != null) {
          this.withAuto(instance.getAuto());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withExpose(instance.getExpose());
          this.withImage(instance.getImage());
          this.withImagePullPolicy(instance.getImagePullPolicy());
          this.withLimitCPU(instance.getLimitCPU());
          this.withLimitMemory(instance.getLimitMemory());
          this.withName(instance.getName());
          this.withPort(instance.getPort());
          this.withPortName(instance.getPortName());
          this.withRequestCPU(instance.getRequestCPU());
          this.withRequestMemory(instance.getRequestMemory());
          this.withServicePort(instance.getServicePort());
          this.withServicePortName(instance.getServicePortName());
        }
  }
  
  public Boolean getAuto() {
    return this.auto;
  }
  
  public A withAuto(Boolean auto) {
    this.auto = auto;
    return (A) this;
  }
  
  public boolean hasAuto() {
    return this.auto != null;
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
  
  public Boolean getExpose() {
    return this.expose;
  }
  
  public A withExpose(Boolean expose) {
    this.expose = expose;
    return (A) this;
  }
  
  public boolean hasExpose() {
    return this.expose != null;
  }
  
  public String getImage() {
    return this.image;
  }
  
  public A withImage(String image) {
    this.image = image;
    return (A) this;
  }
  
  public boolean hasImage() {
    return this.image != null;
  }
  
  public Container.ImagePullPolicy getImagePullPolicy() {
    return this.imagePullPolicy;
  }
  
  public A withImagePullPolicy(Container.ImagePullPolicy imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return (A) this;
  }
  
  public boolean hasImagePullPolicy() {
    return this.imagePullPolicy != null;
  }
  
  public String getLimitCPU() {
    return this.limitCPU;
  }
  
  public A withLimitCPU(String limitCPU) {
    this.limitCPU = limitCPU;
    return (A) this;
  }
  
  public boolean hasLimitCPU() {
    return this.limitCPU != null;
  }
  
  public String getLimitMemory() {
    return this.limitMemory;
  }
  
  public A withLimitMemory(String limitMemory) {
    this.limitMemory = limitMemory;
    return (A) this;
  }
  
  public boolean hasLimitMemory() {
    return this.limitMemory != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
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
  
  public String getPortName() {
    return this.portName;
  }
  
  public A withPortName(String portName) {
    this.portName = portName;
    return (A) this;
  }
  
  public boolean hasPortName() {
    return this.portName != null;
  }
  
  public String getRequestCPU() {
    return this.requestCPU;
  }
  
  public A withRequestCPU(String requestCPU) {
    this.requestCPU = requestCPU;
    return (A) this;
  }
  
  public boolean hasRequestCPU() {
    return this.requestCPU != null;
  }
  
  public String getRequestMemory() {
    return this.requestMemory;
  }
  
  public A withRequestMemory(String requestMemory) {
    this.requestMemory = requestMemory;
    return (A) this;
  }
  
  public boolean hasRequestMemory() {
    return this.requestMemory != null;
  }
  
  public Long getServicePort() {
    return this.servicePort;
  }
  
  public A withServicePort(Long servicePort) {
    this.servicePort = servicePort;
    return (A) this;
  }
  
  public boolean hasServicePort() {
    return this.servicePort != null;
  }
  
  public String getServicePortName() {
    return this.servicePortName;
  }
  
  public A withServicePortName(String servicePortName) {
    this.servicePortName = servicePortName;
    return (A) this;
  }
  
  public boolean hasServicePortName() {
    return this.servicePortName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ContainerFluent that = (ContainerFluent) o;
    if (!java.util.Objects.equals(auto, that.auto)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(expose, that.expose)) return false;
    if (!java.util.Objects.equals(image, that.image)) return false;
    if (!java.util.Objects.equals(imagePullPolicy, that.imagePullPolicy)) return false;
    if (!java.util.Objects.equals(limitCPU, that.limitCPU)) return false;
    if (!java.util.Objects.equals(limitMemory, that.limitMemory)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(port, that.port)) return false;
    if (!java.util.Objects.equals(portName, that.portName)) return false;
    if (!java.util.Objects.equals(requestCPU, that.requestCPU)) return false;
    if (!java.util.Objects.equals(requestMemory, that.requestMemory)) return false;
    if (!java.util.Objects.equals(servicePort, that.servicePort)) return false;
    if (!java.util.Objects.equals(servicePortName, that.servicePortName)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(auto,  configuration,  enabled,  expose,  image,  imagePullPolicy,  limitCPU,  limitMemory,  name,  port,  portName,  requestCPU,  requestMemory,  servicePort,  servicePortName,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (auto != null) { sb.append("auto:"); sb.append(auto + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (expose != null) { sb.append("expose:"); sb.append(expose + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (imagePullPolicy != null) { sb.append("imagePullPolicy:"); sb.append(imagePullPolicy + ","); }
    if (limitCPU != null) { sb.append("limitCPU:"); sb.append(limitCPU + ","); }
    if (limitMemory != null) { sb.append("limitMemory:"); sb.append(limitMemory + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (port != null) { sb.append("port:"); sb.append(port + ","); }
    if (portName != null) { sb.append("portName:"); sb.append(portName + ","); }
    if (requestCPU != null) { sb.append("requestCPU:"); sb.append(requestCPU + ","); }
    if (requestMemory != null) { sb.append("requestMemory:"); sb.append(requestMemory + ","); }
    if (servicePort != null) { sb.append("servicePort:"); sb.append(servicePort + ","); }
    if (servicePortName != null) { sb.append("servicePortName:"); sb.append(servicePortName); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAuto() {
    return withAuto(true);
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  
  public A withExpose() {
    return withExpose(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) ContainerFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}