package org.apache.camel.v1.kameletspec;

import org.apache.camel.v1.kameletspec.datatypes.Types;
import java.lang.SuppressWarnings;
import org.apache.camel.v1.kameletspec.datatypes.Headers;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class DataTypesFluent<A extends DataTypesFluent<A>> extends BaseFluent<A>{
  public DataTypesFluent() {
  }
  
  public DataTypesFluent(DataTypes instance) {
    this.copyInstance(instance);
  }
  private Map<String,Headers> headers;
  private Map<String,Types> types;
  
  protected void copyInstance(DataTypes instance) {
    instance = (instance != null ? instance : new DataTypes());
    if (instance != null) {
          this.withHeaders(instance.getHeaders());
          this.withTypes(instance.getTypes());
        }
  }
  
  public A addToHeaders(String key,Headers value) {
    if(this.headers == null && key != null && value != null) { this.headers = new LinkedHashMap(); }
    if(key != null && value != null) {this.headers.put(key, value);} return (A)this;
  }
  
  public A addToHeaders(Map<String,Headers> map) {
    if(this.headers == null && map != null) { this.headers = new LinkedHashMap(); }
    if(map != null) { this.headers.putAll(map);} return (A)this;
  }
  
  public A removeFromHeaders(String key) {
    if(this.headers == null) { return (A) this; }
    if(key != null && this.headers != null) {this.headers.remove(key);} return (A)this;
  }
  
  public A removeFromHeaders(Map<String,Headers> map) {
    if(this.headers == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.headers != null){this.headers.remove(key);}}} return (A)this;
  }
  
  public Map<String,Headers> getHeaders() {
    return this.headers;
  }
  
  public <K,V>A withHeaders(Map<String,Headers> headers) {
    if (headers == null) {
      this.headers = null;
    } else {
      this.headers = new LinkedHashMap(headers);
    }
    return (A) this;
  }
  
  public boolean hasHeaders() {
    return this.headers != null;
  }
  
  public A addToTypes(String key,Types value) {
    if(this.types == null && key != null && value != null) { this.types = new LinkedHashMap(); }
    if(key != null && value != null) {this.types.put(key, value);} return (A)this;
  }
  
  public A addToTypes(Map<String,Types> map) {
    if(this.types == null && map != null) { this.types = new LinkedHashMap(); }
    if(map != null) { this.types.putAll(map);} return (A)this;
  }
  
  public A removeFromTypes(String key) {
    if(this.types == null) { return (A) this; }
    if(key != null && this.types != null) {this.types.remove(key);} return (A)this;
  }
  
  public A removeFromTypes(Map<String,Types> map) {
    if(this.types == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.types != null){this.types.remove(key);}}} return (A)this;
  }
  
  public Map<String,Types> getTypes() {
    return this.types;
  }
  
  public <K,V>A withTypes(Map<String,Types> types) {
    if (types == null) {
      this.types = null;
    } else {
      this.types = new LinkedHashMap(types);
    }
    return (A) this;
  }
  
  public boolean hasTypes() {
    return this.types != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    DataTypesFluent that = (DataTypesFluent) o;
    if (!java.util.Objects.equals(headers, that.headers)) return false;
    if (!java.util.Objects.equals(types, that.types)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(headers,  types,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (headers != null && !headers.isEmpty()) { sb.append("headers:"); sb.append(headers + ","); }
    if (types != null && !types.isEmpty()) { sb.append("types:"); sb.append(types); }
    sb.append("}");
    return sb.toString();
  }
  

}