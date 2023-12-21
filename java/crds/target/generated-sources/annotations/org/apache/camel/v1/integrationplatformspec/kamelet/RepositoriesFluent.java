package org.apache.camel.v1.integrationplatformspec.kamelet;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class RepositoriesFluent<A extends RepositoriesFluent<A>> extends BaseFluent<A>{
  public RepositoriesFluent() {
  }
  
  public RepositoriesFluent(Repositories instance) {
    this.copyInstance(instance);
  }
  private String uri;
  
  protected void copyInstance(Repositories instance) {
    instance = (instance != null ? instance : new Repositories());
    if (instance != null) {
          this.withUri(instance.getUri());
        }
  }
  
  public String getUri() {
    return this.uri;
  }
  
  public A withUri(String uri) {
    this.uri = uri;
    return (A) this;
  }
  
  public boolean hasUri() {
    return this.uri != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    RepositoriesFluent that = (RepositoriesFluent) o;
    if (!java.util.Objects.equals(uri, that.uri)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(uri,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (uri != null) { sb.append("uri:"); sb.append(uri); }
    sb.append("}");
    return sb.toString();
  }
  

}