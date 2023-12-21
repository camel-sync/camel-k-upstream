package org.apache.camel.v1.buildspec.tasks.package_.maven;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ServersFluent<A extends ServersFluent<A>> extends BaseFluent<A>{
  public ServersFluent() {
  }
  
  public ServersFluent(Servers instance) {
    this.copyInstance(instance);
  }
  private Map<String,String> configuration;
  private String id;
  private String password;
  private String username;
  
  protected void copyInstance(Servers instance) {
    instance = (instance != null ? instance : new Servers());
    if (instance != null) {
          this.withConfiguration(instance.getConfiguration());
          this.withId(instance.getId());
          this.withPassword(instance.getPassword());
          this.withUsername(instance.getUsername());
        }
  }
  
  public A addToConfiguration(String key,String value) {
    if(this.configuration == null && key != null && value != null) { this.configuration = new LinkedHashMap(); }
    if(key != null && value != null) {this.configuration.put(key, value);} return (A)this;
  }
  
  public A addToConfiguration(Map<String,String> map) {
    if(this.configuration == null && map != null) { this.configuration = new LinkedHashMap(); }
    if(map != null) { this.configuration.putAll(map);} return (A)this;
  }
  
  public A removeFromConfiguration(String key) {
    if(this.configuration == null) { return (A) this; }
    if(key != null && this.configuration != null) {this.configuration.remove(key);} return (A)this;
  }
  
  public A removeFromConfiguration(Map<String,String> map) {
    if(this.configuration == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.configuration != null){this.configuration.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getConfiguration() {
    return this.configuration;
  }
  
  public <K,V>A withConfiguration(Map<String,String> configuration) {
    if (configuration == null) {
      this.configuration = null;
    } else {
      this.configuration = new LinkedHashMap(configuration);
    }
    return (A) this;
  }
  
  public boolean hasConfiguration() {
    return this.configuration != null;
  }
  
  public String getId() {
    return this.id;
  }
  
  public A withId(String id) {
    this.id = id;
    return (A) this;
  }
  
  public boolean hasId() {
    return this.id != null;
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
  
  public String getUsername() {
    return this.username;
  }
  
  public A withUsername(String username) {
    this.username = username;
    return (A) this;
  }
  
  public boolean hasUsername() {
    return this.username != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ServersFluent that = (ServersFluent) o;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(id, that.id)) return false;
    if (!java.util.Objects.equals(password, that.password)) return false;
    if (!java.util.Objects.equals(username, that.username)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configuration,  id,  password,  username,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configuration != null && !configuration.isEmpty()) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (id != null) { sb.append("id:"); sb.append(id + ","); }
    if (password != null) { sb.append("password:"); sb.append(password + ","); }
    if (username != null) { sb.append("username:"); sb.append(username); }
    sb.append("}");
    return sb.toString();
  }
  

}