package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class NfsFluent<A extends NfsFluent<A>> extends BaseFluent<A>{
  public NfsFluent() {
  }
  
  public NfsFluent(Nfs instance) {
    this.copyInstance(instance);
  }
  private String path;
  private Boolean readOnly;
  private String server;
  
  protected void copyInstance(Nfs instance) {
    instance = (instance != null ? instance : new Nfs());
    if (instance != null) {
          this.withPath(instance.getPath());
          this.withReadOnly(instance.getReadOnly());
          this.withServer(instance.getServer());
        }
  }
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public String getServer() {
    return this.server;
  }
  
  public A withServer(String server) {
    this.server = server;
    return (A) this;
  }
  
  public boolean hasServer() {
    return this.server != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    NfsFluent that = (NfsFluent) o;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(server, that.server)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(path,  readOnly,  server,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (server != null) { sb.append("server:"); sb.append(server); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}