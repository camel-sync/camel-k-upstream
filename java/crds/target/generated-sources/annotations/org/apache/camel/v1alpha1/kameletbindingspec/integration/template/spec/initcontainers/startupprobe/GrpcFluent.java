package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.initcontainers.startupprobe;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class GrpcFluent<A extends GrpcFluent<A>> extends BaseFluent<A>{
  public GrpcFluent() {
  }
  
  public GrpcFluent(Grpc instance) {
    this.copyInstance(instance);
  }
  private Integer port;
  private String service;
  
  protected void copyInstance(Grpc instance) {
    instance = (instance != null ? instance : new Grpc());
    if (instance != null) {
          this.withPort(instance.getPort());
          this.withService(instance.getService());
        }
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public A withPort(Integer port) {
    this.port = port;
    return (A) this;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public String getService() {
    return this.service;
  }
  
  public A withService(String service) {
    this.service = service;
    return (A) this;
  }
  
  public boolean hasService() {
    return this.service != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    GrpcFluent that = (GrpcFluent) o;
    if (!java.util.Objects.equals(port, that.port)) return false;
    if (!java.util.Objects.equals(service, that.service)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(port,  service,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (port != null) { sb.append("port:"); sb.append(port + ","); }
    if (service != null) { sb.append("service:"); sb.append(service); }
    sb.append("}");
    return sb.toString();
  }
  

}