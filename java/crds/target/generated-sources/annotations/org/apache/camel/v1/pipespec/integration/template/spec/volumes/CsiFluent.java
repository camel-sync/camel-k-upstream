package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.csi.NodePublishSecretRef;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.csi.NodePublishSecretRefBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.csi.NodePublishSecretRefFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CsiFluent<A extends CsiFluent<A>> extends BaseFluent<A>{
  public CsiFluent() {
  }
  
  public CsiFluent(Csi instance) {
    this.copyInstance(instance);
  }
  private String driver;
  private String fsType;
  private NodePublishSecretRefBuilder nodePublishSecretRef;
  private Boolean readOnly;
  private Map<String,String> volumeAttributes;
  
  protected void copyInstance(Csi instance) {
    instance = (instance != null ? instance : new Csi());
    if (instance != null) {
          this.withDriver(instance.getDriver());
          this.withFsType(instance.getFsType());
          this.withNodePublishSecretRef(instance.getNodePublishSecretRef());
          this.withReadOnly(instance.getReadOnly());
          this.withVolumeAttributes(instance.getVolumeAttributes());
        }
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public String getFsType() {
    return this.fsType;
  }
  
  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public NodePublishSecretRef buildNodePublishSecretRef() {
    return this.nodePublishSecretRef != null ? this.nodePublishSecretRef.build() : null;
  }
  
  public A withNodePublishSecretRef(NodePublishSecretRef nodePublishSecretRef) {
    this._visitables.remove("nodePublishSecretRef");
    if (nodePublishSecretRef != null) {
        this.nodePublishSecretRef = new NodePublishSecretRefBuilder(nodePublishSecretRef);
        this._visitables.get("nodePublishSecretRef").add(this.nodePublishSecretRef);
    } else {
        this.nodePublishSecretRef = null;
        this._visitables.get("nodePublishSecretRef").remove(this.nodePublishSecretRef);
    }
    return (A) this;
  }
  
  public boolean hasNodePublishSecretRef() {
    return this.nodePublishSecretRef != null;
  }
  
  public NodePublishSecretRefNested<A> withNewNodePublishSecretRef() {
    return new NodePublishSecretRefNested(null);
  }
  
  public NodePublishSecretRefNested<A> withNewNodePublishSecretRefLike(NodePublishSecretRef item) {
    return new NodePublishSecretRefNested(item);
  }
  
  public NodePublishSecretRefNested<A> editIntegrationNodePublishSecretRef() {
    return withNewNodePublishSecretRefLike(java.util.Optional.ofNullable(buildNodePublishSecretRef()).orElse(null));
  }
  
  public NodePublishSecretRefNested<A> editOrNewNodePublishSecretRef() {
    return withNewNodePublishSecretRefLike(java.util.Optional.ofNullable(buildNodePublishSecretRef()).orElse(new NodePublishSecretRefBuilder().build()));
  }
  
  public NodePublishSecretRefNested<A> editOrNewNodePublishSecretRefLike(NodePublishSecretRef item) {
    return withNewNodePublishSecretRefLike(java.util.Optional.ofNullable(buildNodePublishSecretRef()).orElse(item));
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
  
  public A addToVolumeAttributes(String key,String value) {
    if(this.volumeAttributes == null && key != null && value != null) { this.volumeAttributes = new LinkedHashMap(); }
    if(key != null && value != null) {this.volumeAttributes.put(key, value);} return (A)this;
  }
  
  public A addToVolumeAttributes(Map<String,String> map) {
    if(this.volumeAttributes == null && map != null) { this.volumeAttributes = new LinkedHashMap(); }
    if(map != null) { this.volumeAttributes.putAll(map);} return (A)this;
  }
  
  public A removeFromVolumeAttributes(String key) {
    if(this.volumeAttributes == null) { return (A) this; }
    if(key != null && this.volumeAttributes != null) {this.volumeAttributes.remove(key);} return (A)this;
  }
  
  public A removeFromVolumeAttributes(Map<String,String> map) {
    if(this.volumeAttributes == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.volumeAttributes != null){this.volumeAttributes.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getVolumeAttributes() {
    return this.volumeAttributes;
  }
  
  public <K,V>A withVolumeAttributes(Map<String,String> volumeAttributes) {
    if (volumeAttributes == null) {
      this.volumeAttributes = null;
    } else {
      this.volumeAttributes = new LinkedHashMap(volumeAttributes);
    }
    return (A) this;
  }
  
  public boolean hasVolumeAttributes() {
    return this.volumeAttributes != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CsiFluent that = (CsiFluent) o;
    if (!java.util.Objects.equals(driver, that.driver)) return false;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(nodePublishSecretRef, that.nodePublishSecretRef)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(volumeAttributes, that.volumeAttributes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(driver,  fsType,  nodePublishSecretRef,  readOnly,  volumeAttributes,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (driver != null) { sb.append("driver:"); sb.append(driver + ","); }
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (nodePublishSecretRef != null) { sb.append("nodePublishSecretRef:"); sb.append(nodePublishSecretRef + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (volumeAttributes != null && !volumeAttributes.isEmpty()) { sb.append("volumeAttributes:"); sb.append(volumeAttributes); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  public class NodePublishSecretRefNested<N> extends NodePublishSecretRefFluent<NodePublishSecretRefNested<N>> implements Nested<N>{
    NodePublishSecretRefNested(NodePublishSecretRef item) {
      this.builder = new NodePublishSecretRefBuilder(this, item);
    }
    NodePublishSecretRefBuilder builder;
    
    public N and() {
      return (N) CsiFluent.this.withNodePublishSecretRef(builder.build());
    }
    
    public N endIntegrationNodePublishSecretRef() {
      return and();
    }
    
  
  }

}