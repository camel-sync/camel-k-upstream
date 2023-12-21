package org.apache.camel.v1alpha1.kameletbindingstatus.conditions.pods;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import io.fabric8.kubernetes.api.model.AnyType;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class HealthFluent<A extends HealthFluent<A>> extends BaseFluent<A>{
  public HealthFluent() {
  }
  
  public HealthFluent(Health instance) {
    this.copyInstance(instance);
  }
  private AnyType data;
  private String name;
  private String status;
  
  protected void copyInstance(Health instance) {
    instance = (instance != null ? instance : new Health());
    if (instance != null) {
          this.withData(instance.getData());
          this.withName(instance.getName());
          this.withStatus(instance.getStatus());
        }
  }
  
  public AnyType getData() {
    return this.data;
  }
  
  public A withData(AnyType data) {
    this.data = data;
    return (A) this;
  }
  
  public boolean hasData() {
    return this.data != null;
  }
  
  public A withNewData(Object value) {
    return (A)withData(new AnyType(value));
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
  
  public String getStatus() {
    return this.status;
  }
  
  public A withStatus(String status) {
    this.status = status;
    return (A) this;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    HealthFluent that = (HealthFluent) o;
    if (!java.util.Objects.equals(data, that.data)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(status, that.status)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(data,  name,  status,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (data != null) { sb.append("data:"); sb.append(data + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (status != null) { sb.append("status:"); sb.append(status); }
    sb.append("}");
    return sb.toString();
  }
  

}