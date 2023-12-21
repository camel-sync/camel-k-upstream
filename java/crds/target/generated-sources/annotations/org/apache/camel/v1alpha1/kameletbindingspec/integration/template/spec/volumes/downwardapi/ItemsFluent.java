package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.downwardapi;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.downwardapi.items.FieldRef;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.downwardapi.items.ResourceFieldRef;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.downwardapi.items.FieldRefBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.downwardapi.items.ResourceFieldRefFluent;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.downwardapi.items.FieldRefFluent;
import java.lang.Integer;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.downwardapi.items.ResourceFieldRefBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;

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
  private FieldRefBuilder fieldRef;
  private Integer mode;
  private String path;
  private ResourceFieldRefBuilder resourceFieldRef;
  
  protected void copyInstance(Items instance) {
    instance = (instance != null ? instance : new Items());
    if (instance != null) {
          this.withFieldRef(instance.getFieldRef());
          this.withMode(instance.getMode());
          this.withPath(instance.getPath());
          this.withResourceFieldRef(instance.getResourceFieldRef());
        }
  }
  
  public FieldRef buildFieldRef() {
    return this.fieldRef != null ? this.fieldRef.build() : null;
  }
  
  public A withFieldRef(FieldRef fieldRef) {
    this._visitables.remove("fieldRef");
    if (fieldRef != null) {
        this.fieldRef = new FieldRefBuilder(fieldRef);
        this._visitables.get("fieldRef").add(this.fieldRef);
    } else {
        this.fieldRef = null;
        this._visitables.get("fieldRef").remove(this.fieldRef);
    }
    return (A) this;
  }
  
  public boolean hasFieldRef() {
    return this.fieldRef != null;
  }
  
  public FieldRefNested<A> withNewFieldRef() {
    return new FieldRefNested(null);
  }
  
  public FieldRefNested<A> withNewFieldRefLike(FieldRef item) {
    return new FieldRefNested(item);
  }
  
  public FieldRefNested<A> editItemsFieldRef() {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(null));
  }
  
  public FieldRefNested<A> editOrNewFieldRef() {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(new FieldRefBuilder().build()));
  }
  
  public FieldRefNested<A> editOrNewFieldRefLike(FieldRef item) {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(item));
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
  
  public ResourceFieldRef buildResourceFieldRef() {
    return this.resourceFieldRef != null ? this.resourceFieldRef.build() : null;
  }
  
  public A withResourceFieldRef(ResourceFieldRef resourceFieldRef) {
    this._visitables.remove("resourceFieldRef");
    if (resourceFieldRef != null) {
        this.resourceFieldRef = new ResourceFieldRefBuilder(resourceFieldRef);
        this._visitables.get("resourceFieldRef").add(this.resourceFieldRef);
    } else {
        this.resourceFieldRef = null;
        this._visitables.get("resourceFieldRef").remove(this.resourceFieldRef);
    }
    return (A) this;
  }
  
  public boolean hasResourceFieldRef() {
    return this.resourceFieldRef != null;
  }
  
  public ResourceFieldRefNested<A> withNewResourceFieldRef() {
    return new ResourceFieldRefNested(null);
  }
  
  public ResourceFieldRefNested<A> withNewResourceFieldRefLike(ResourceFieldRef item) {
    return new ResourceFieldRefNested(item);
  }
  
  public ResourceFieldRefNested<A> editItemsResourceFieldRef() {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(null));
  }
  
  public ResourceFieldRefNested<A> editOrNewResourceFieldRef() {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(new ResourceFieldRefBuilder().build()));
  }
  
  public ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(ResourceFieldRef item) {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ItemsFluent that = (ItemsFluent) o;
    if (!java.util.Objects.equals(fieldRef, that.fieldRef)) return false;
    if (!java.util.Objects.equals(mode, that.mode)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(resourceFieldRef, that.resourceFieldRef)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fieldRef,  mode,  path,  resourceFieldRef,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fieldRef != null) { sb.append("fieldRef:"); sb.append(fieldRef + ","); }
    if (mode != null) { sb.append("mode:"); sb.append(mode + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (resourceFieldRef != null) { sb.append("resourceFieldRef:"); sb.append(resourceFieldRef); }
    sb.append("}");
    return sb.toString();
  }
  public class FieldRefNested<N> extends FieldRefFluent<FieldRefNested<N>> implements Nested<N>{
    FieldRefNested(FieldRef item) {
      this.builder = new FieldRefBuilder(this, item);
    }
    FieldRefBuilder builder;
    
    public N and() {
      return (N) ItemsFluent.this.withFieldRef(builder.build());
    }
    
    public N endItemsFieldRef() {
      return and();
    }
    
  
  }
  public class ResourceFieldRefNested<N> extends ResourceFieldRefFluent<ResourceFieldRefNested<N>> implements Nested<N>{
    ResourceFieldRefNested(ResourceFieldRef item) {
      this.builder = new ResourceFieldRefBuilder(this, item);
    }
    ResourceFieldRefBuilder builder;
    
    public N and() {
      return (N) ItemsFluent.this.withResourceFieldRef(builder.build());
    }
    
    public N endItemsResourceFieldRef() {
      return and();
    }
    
  
  }

}