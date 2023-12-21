package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.storageos.SecretRefBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.storageos.SecretRefFluent;
import java.lang.Object;
import java.lang.Boolean;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.storageos.SecretRef;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class StorageosFluent<A extends StorageosFluent<A>> extends BaseFluent<A>{
  public StorageosFluent() {
  }
  
  public StorageosFluent(Storageos instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private Boolean readOnly;
  private SecretRefBuilder secretRef;
  private String volumeName;
  private String volumeNamespace;
  
  protected void copyInstance(Storageos instance) {
    instance = (instance != null ? instance : new Storageos());
    if (instance != null) {
          this.withFsType(instance.getFsType());
          this.withReadOnly(instance.getReadOnly());
          this.withSecretRef(instance.getSecretRef());
          this.withVolumeName(instance.getVolumeName());
          this.withVolumeNamespace(instance.getVolumeNamespace());
        }
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
  
  public SecretRef buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }
  
  public A withSecretRef(SecretRef secretRef) {
    this._visitables.remove("secretRef");
    if (secretRef != null) {
        this.secretRef = new SecretRefBuilder(secretRef);
        this._visitables.get("secretRef").add(this.secretRef);
    } else {
        this.secretRef = null;
        this._visitables.get("secretRef").remove(this.secretRef);
    }
    return (A) this;
  }
  
  public boolean hasSecretRef() {
    return this.secretRef != null;
  }
  
  public SecretRefNested<A> withNewSecretRef() {
    return new SecretRefNested(null);
  }
  
  public SecretRefNested<A> withNewSecretRefLike(SecretRef item) {
    return new SecretRefNested(item);
  }
  
  public SecretRefNested<A> editStorageosSecretRef() {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(null));
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(new SecretRefBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(SecretRef item) {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(item));
  }
  
  public String getVolumeName() {
    return this.volumeName;
  }
  
  public A withVolumeName(String volumeName) {
    this.volumeName = volumeName;
    return (A) this;
  }
  
  public boolean hasVolumeName() {
    return this.volumeName != null;
  }
  
  public String getVolumeNamespace() {
    return this.volumeNamespace;
  }
  
  public A withVolumeNamespace(String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
    return (A) this;
  }
  
  public boolean hasVolumeNamespace() {
    return this.volumeNamespace != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    StorageosFluent that = (StorageosFluent) o;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(secretRef, that.secretRef)) return false;
    if (!java.util.Objects.equals(volumeName, that.volumeName)) return false;
    if (!java.util.Objects.equals(volumeNamespace, that.volumeNamespace)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fsType,  readOnly,  secretRef,  volumeName,  volumeNamespace,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef + ","); }
    if (volumeName != null) { sb.append("volumeName:"); sb.append(volumeName + ","); }
    if (volumeNamespace != null) { sb.append("volumeNamespace:"); sb.append(volumeNamespace); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  public class SecretRefNested<N> extends SecretRefFluent<SecretRefNested<N>> implements Nested<N>{
    SecretRefNested(SecretRef item) {
      this.builder = new SecretRefBuilder(this, item);
    }
    SecretRefBuilder builder;
    
    public N and() {
      return (N) StorageosFluent.this.withSecretRef(builder.build());
    }
    
    public N endStorageosSecretRef() {
      return and();
    }
    
  
  }

}