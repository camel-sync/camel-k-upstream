package org.apache.camel.v1.kameletspec.types.schema;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ExternalDocsFluent<A extends ExternalDocsFluent<A>> extends BaseFluent<A>{
  public ExternalDocsFluent() {
  }
  
  public ExternalDocsFluent(ExternalDocs instance) {
    this.copyInstance(instance);
  }
  private String description;
  private String url;
  
  protected void copyInstance(ExternalDocs instance) {
    instance = (instance != null ? instance : new ExternalDocs());
    if (instance != null) {
          this.withDescription(instance.getDescription());
          this.withUrl(instance.getUrl());
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
  
  public String getUrl() {
    return this.url;
  }
  
  public A withUrl(String url) {
    this.url = url;
    return (A) this;
  }
  
  public boolean hasUrl() {
    return this.url != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ExternalDocsFluent that = (ExternalDocsFluent) o;
    if (!java.util.Objects.equals(description, that.description)) return false;
    if (!java.util.Objects.equals(url, that.url)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(description,  url,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (description != null) { sb.append("description:"); sb.append(description + ","); }
    if (url != null) { sb.append("url:"); sb.append(url); }
    sb.append("}");
    return sb.toString();
  }
  

}