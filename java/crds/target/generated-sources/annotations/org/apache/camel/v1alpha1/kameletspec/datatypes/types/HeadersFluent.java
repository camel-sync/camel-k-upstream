package org.apache.camel.v1alpha1.kameletspec.datatypes.types;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class HeadersFluent<A extends HeadersFluent<A>> extends BaseFluent<A>{
  public HeadersFluent() {
  }
  
  public HeadersFluent(Headers instance) {
    this.copyInstance(instance);
  }
  private String description;
  private Boolean required;
  private String title;
  private String type;
  
  protected void copyInstance(Headers instance) {
    instance = (instance != null ? instance : new Headers());
    if (instance != null) {
          this.withDescription(instance.getDescription());
          this.withRequired(instance.getRequired());
          this.withTitle(instance.getTitle());
          this.withType(instance.getType());
        }
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public A withDescription(String description) {
    this.description = description;
    return (A) this;
  }
  
  public boolean hasDescription() {
    return this.description != null;
  }
  
  public Boolean getRequired() {
    return this.required;
  }
  
  public A withRequired(Boolean required) {
    this.required = required;
    return (A) this;
  }
  
  public boolean hasRequired() {
    return this.required != null;
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public A withTitle(String title) {
    this.title = title;
    return (A) this;
  }
  
  public boolean hasTitle() {
    return this.title != null;
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    HeadersFluent that = (HeadersFluent) o;
    if (!java.util.Objects.equals(description, that.description)) return false;
    if (!java.util.Objects.equals(required, that.required)) return false;
    if (!java.util.Objects.equals(title, that.title)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(description,  required,  title,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (description != null) { sb.append("description:"); sb.append(description + ","); }
    if (required != null) { sb.append("required:"); sb.append(required + ","); }
    if (title != null) { sb.append("title:"); sb.append(title + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withRequired() {
    return withRequired(true);
  }
  

}