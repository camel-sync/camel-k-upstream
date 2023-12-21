package org.apache.camel.v1alpha1.kameletbindingspec.steps;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

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
  private String format;
  private String scheme;
  
  protected void copyInstance(DataTypes instance) {
    instance = (instance != null ? instance : new DataTypes());
    if (instance != null) {
          this.withFormat(instance.getFormat());
          this.withScheme(instance.getScheme());
        }
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public A withFormat(String format) {
    this.format = format;
    return (A) this;
  }
  
  public boolean hasFormat() {
    return this.format != null;
  }
  
  public String getScheme() {
    return this.scheme;
  }
  
  public A withScheme(String scheme) {
    this.scheme = scheme;
    return (A) this;
  }
  
  public boolean hasScheme() {
    return this.scheme != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    DataTypesFluent that = (DataTypesFluent) o;
    if (!java.util.Objects.equals(format, that.format)) return false;
    if (!java.util.Objects.equals(scheme, that.scheme)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(format,  scheme,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (format != null) { sb.append("format:"); sb.append(format + ","); }
    if (scheme != null) { sb.append("scheme:"); sb.append(scheme); }
    sb.append("}");
    return sb.toString();
  }
  

}