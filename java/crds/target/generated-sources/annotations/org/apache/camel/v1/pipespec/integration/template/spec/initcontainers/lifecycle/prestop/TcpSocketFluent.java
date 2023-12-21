package org.apache.camel.v1.pipespec.integration.template.spec.initcontainers.lifecycle.prestop;

import io.fabric8.kubernetes.api.model.IntOrString;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class TcpSocketFluent<A extends TcpSocketFluent<A>> extends BaseFluent<A>{
  public TcpSocketFluent() {
  }
  
  public TcpSocketFluent(TcpSocket instance) {
    this.copyInstance(instance);
  }
  private String host;
  private IntOrString port;
  
  protected void copyInstance(TcpSocket instance) {
    instance = (instance != null ? instance : new TcpSocket());
    if (instance != null) {
          this.withHost(instance.getHost());
          this.withPort(instance.getPort());
        }
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
  
  public IntOrString getPort() {
    return this.port;
  }
  
  public A withPort(IntOrString port) {
    this.port = port;
    return (A) this;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public A withNewPort(Object value) {
    return (A)withPort(new IntOrString(value));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    TcpSocketFluent that = (TcpSocketFluent) o;
    if (!java.util.Objects.equals(host, that.host)) return false;
    if (!java.util.Objects.equals(port, that.port)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(host,  port,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (host != null) { sb.append("host:"); sb.append(host + ","); }
    if (port != null) { sb.append("port:"); sb.append(port); }
    sb.append("}");
    return sb.toString();
  }
  

}