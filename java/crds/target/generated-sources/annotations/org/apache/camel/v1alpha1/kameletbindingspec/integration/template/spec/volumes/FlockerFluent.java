package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class FlockerFluent<A extends FlockerFluent<A>> extends BaseFluent<A>{
  public FlockerFluent() {
  }
  
  public FlockerFluent(Flocker instance) {
    this.copyInstance(instance);
  }
  private String datasetName;
  private String datasetUUID;
  
  protected void copyInstance(Flocker instance) {
    instance = (instance != null ? instance : new Flocker());
    if (instance != null) {
          this.withDatasetName(instance.getDatasetName());
          this.withDatasetUUID(instance.getDatasetUUID());
        }
  }
  
  public String getDatasetName() {
    return this.datasetName;
  }
  
  public A withDatasetName(String datasetName) {
    this.datasetName = datasetName;
    return (A) this;
  }
  
  public boolean hasDatasetName() {
    return this.datasetName != null;
  }
  
  public String getDatasetUUID() {
    return this.datasetUUID;
  }
  
  public A withDatasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
    return (A) this;
  }
  
  public boolean hasDatasetUUID() {
    return this.datasetUUID != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    FlockerFluent that = (FlockerFluent) o;
    if (!java.util.Objects.equals(datasetName, that.datasetName)) return false;
    if (!java.util.Objects.equals(datasetUUID, that.datasetUUID)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(datasetName,  datasetUUID,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (datasetName != null) { sb.append("datasetName:"); sb.append(datasetName + ","); }
    if (datasetUUID != null) { sb.append("datasetUUID:"); sb.append(datasetUUID); }
    sb.append("}");
    return sb.toString();
  }
  

}