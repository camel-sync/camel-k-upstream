package org.apache.camel.v1.pipespec.integration.template.spec.volumes.projected.sources.configmap;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ItemsFluent<A extends ItemsFluent<A>> extends BaseFluent<A>{
  public ItemsFluent() {
  }
  
  public ItemsFluent(Items instance) {
    this.copyInstance(instance);
  }
  private String key;
  private Integer mode;
  private String path;
  
  protected void copyInstance(Items instance) {
    instance = (instance != null ? instance : new Items());
    if (instance != null) {
          this.withKey(instance.getKey());
          this.withMode(instance.getMode());
          this.withPath(instance.getPath());
        }
  }
  
  public String getKey() {
    return this.key;
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public Integer getMode() {
    return this.mode;
  }
  
  public A withMode(Integer mode) {
    this.mode = mode;
    return (A) this;
  }
  
  public boolean hasMode() {
    return this.mode != null;
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ItemsFluent that = (ItemsFluent) o;
    if (!java.util.Objects.equals(key, that.key)) return false;
    if (!java.util.Objects.equals(mode, that.mode)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(key,  mode,  path,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (key != null) { sb.append("key:"); sb.append(key + ","); }
    if (mode != null) { sb.append("mode:"); sb.append(mode + ","); }
    if (path != null) { sb.append("path:"); sb.append(path); }
    sb.append("}");
    return sb.toString();
  }
  

}