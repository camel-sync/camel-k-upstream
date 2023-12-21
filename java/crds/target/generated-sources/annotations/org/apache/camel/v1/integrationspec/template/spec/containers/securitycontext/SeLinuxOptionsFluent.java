package org.apache.camel.v1.integrationspec.template.spec.containers.securitycontext;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SeLinuxOptionsFluent<A extends SeLinuxOptionsFluent<A>> extends BaseFluent<A>{
  public SeLinuxOptionsFluent() {
  }
  
  public SeLinuxOptionsFluent(SeLinuxOptions instance) {
    this.copyInstance(instance);
  }
  private String level;
  private String role;
  private String type;
  private String user;
  
  protected void copyInstance(SeLinuxOptions instance) {
    instance = (instance != null ? instance : new SeLinuxOptions());
    if (instance != null) {
          this.withLevel(instance.getLevel());
          this.withRole(instance.getRole());
          this.withType(instance.getType());
          this.withUser(instance.getUser());
        }
  }
  
  public String getLevel() {
    return this.level;
  }
  
  public A withLevel(String level) {
    this.level = level;
    return (A) this;
  }
  
  public boolean hasLevel() {
    return this.level != null;
  }
  
  public String getRole() {
    return this.role;
  }
  
  public A withRole(String role) {
    this.role = role;
    return (A) this;
  }
  
  public boolean hasRole() {
    return this.role != null;
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
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
    SeLinuxOptionsFluent that = (SeLinuxOptionsFluent) o;
    if (!java.util.Objects.equals(level, that.level)) return false;
    if (!java.util.Objects.equals(role, that.role)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    if (!java.util.Objects.equals(user, that.user)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(level,  role,  type,  user,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (level != null) { sb.append("level:"); sb.append(level + ","); }
    if (role != null) { sb.append("role:"); sb.append(role + ","); }
    if (type != null) { sb.append("type:"); sb.append(type + ","); }
    if (user != null) { sb.append("user:"); sb.append(user); }
    sb.append("}");
    return sb.toString();
  }
  

}