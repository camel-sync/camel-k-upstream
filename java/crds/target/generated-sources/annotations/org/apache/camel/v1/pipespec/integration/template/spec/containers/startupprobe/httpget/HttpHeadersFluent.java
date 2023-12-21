package org.apache.camel.v1.pipespec.integration.template.spec.containers.startupprobe.httpget;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class HttpHeadersFluent<A extends HttpHeadersFluent<A>> extends BaseFluent<A>{
  public HttpHeadersFluent() {
  }
  
  public HttpHeadersFluent(HttpHeaders instance) {
    this.copyInstance(instance);
  }
  private String name;
  private String value;
  
  protected void copyInstance(HttpHeaders instance) {
    instance = (instance != null ? instance : new HttpHeaders());
    if (instance != null) {
          this.withName(instance.getName());
          this.withValue(instance.getValue());
        }
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
  
  public String getValue() {
    return this.value;
  }
  
  public A withValue(String value) {
    this.value = value;
    return (A) this;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    HttpHeadersFluent that = (HttpHeadersFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(value, that.value)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(name,  value,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (value != null) { sb.append("value:"); sb.append(value); }
    sb.append("}");
    return sb.toString();
  }
  

}