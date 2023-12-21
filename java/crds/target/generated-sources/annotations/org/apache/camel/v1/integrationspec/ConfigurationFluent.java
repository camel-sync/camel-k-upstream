package org.apache.camel.v1.integrationspec;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ConfigurationFluent<A extends ConfigurationFluent<A>> extends BaseFluent<A>{
  public ConfigurationFluent() {
  }
  
  public ConfigurationFluent(Configuration instance) {
    this.copyInstance(instance);
  }
  private String type;
  private String value;
  
  protected void copyInstance(Configuration instance) {
    instance = (instance != null ? instance : new Configuration());
    if (instance != null) {
          this.withType(instance.getType());
          this.withValue(instance.getValue());
        }
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
    ConfigurationFluent that = (ConfigurationFluent) o;
    if (!java.util.Objects.equals(type, that.type)) return false;
    if (!java.util.Objects.equals(value, that.value)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(type,  value,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (type != null) { sb.append("type:"); sb.append(type + ","); }
    if (value != null) { sb.append("value:"); sb.append(value); }
    sb.append("}");
    return sb.toString();
  }
  

}