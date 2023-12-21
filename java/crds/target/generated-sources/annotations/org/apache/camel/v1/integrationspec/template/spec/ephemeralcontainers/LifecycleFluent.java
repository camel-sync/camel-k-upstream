package org.apache.camel.v1.integrationspec.template.spec.ephemeralcontainers;

import org.apache.camel.v1.integrationspec.template.spec.ephemeralcontainers.lifecycle.PreStopBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1.integrationspec.template.spec.ephemeralcontainers.lifecycle.PostStart;
import java.lang.String;
import org.apache.camel.v1.integrationspec.template.spec.ephemeralcontainers.lifecycle.PreStopFluent;
import org.apache.camel.v1.integrationspec.template.spec.ephemeralcontainers.lifecycle.PreStop;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1.integrationspec.template.spec.ephemeralcontainers.lifecycle.PostStartFluent;
import java.lang.Object;
import org.apache.camel.v1.integrationspec.template.spec.ephemeralcontainers.lifecycle.PostStartBuilder;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class LifecycleFluent<A extends LifecycleFluent<A>> extends BaseFluent<A>{
  public LifecycleFluent() {
  }
  
  public LifecycleFluent(Lifecycle instance) {
    this.copyInstance(instance);
  }
  private PostStartBuilder postStart;
  private PreStopBuilder preStop;
  
  protected void copyInstance(Lifecycle instance) {
    instance = (instance != null ? instance : new Lifecycle());
    if (instance != null) {
          this.withPostStart(instance.getPostStart());
          this.withPreStop(instance.getPreStop());
        }
  }
  
  public PostStart buildPostStart() {
    return this.postStart != null ? this.postStart.build() : null;
  }
  
  public A withPostStart(PostStart postStart) {
    this._visitables.remove("postStart");
    if (postStart != null) {
        this.postStart = new PostStartBuilder(postStart);
        this._visitables.get("postStart").add(this.postStart);
    } else {
        this.postStart = null;
        this._visitables.get("postStart").remove(this.postStart);
    }
    return (A) this;
  }
  
  public boolean hasPostStart() {
    return this.postStart != null;
  }
  
  public PostStartNested<A> withNewPostStart() {
    return new PostStartNested(null);
  }
  
  public PostStartNested<A> withNewPostStartLike(PostStart item) {
    return new PostStartNested(item);
  }
  
  public PostStartNested<A> editEphemeralcontainersPostStart() {
    return withNewPostStartLike(java.util.Optional.ofNullable(buildPostStart()).orElse(null));
  }
  
  public PostStartNested<A> editOrNewPostStart() {
    return withNewPostStartLike(java.util.Optional.ofNullable(buildPostStart()).orElse(new PostStartBuilder().build()));
  }
  
  public PostStartNested<A> editOrNewPostStartLike(PostStart item) {
    return withNewPostStartLike(java.util.Optional.ofNullable(buildPostStart()).orElse(item));
  }
  
  public PreStop buildPreStop() {
    return this.preStop != null ? this.preStop.build() : null;
  }
  
  public A withPreStop(PreStop preStop) {
    this._visitables.remove("preStop");
    if (preStop != null) {
        this.preStop = new PreStopBuilder(preStop);
        this._visitables.get("preStop").add(this.preStop);
    } else {
        this.preStop = null;
        this._visitables.get("preStop").remove(this.preStop);
    }
    return (A) this;
  }
  
  public boolean hasPreStop() {
    return this.preStop != null;
  }
  
  public PreStopNested<A> withNewPreStop() {
    return new PreStopNested(null);
  }
  
  public PreStopNested<A> withNewPreStopLike(PreStop item) {
    return new PreStopNested(item);
  }
  
  public PreStopNested<A> editEphemeralcontainersPreStop() {
    return withNewPreStopLike(java.util.Optional.ofNullable(buildPreStop()).orElse(null));
  }
  
  public PreStopNested<A> editOrNewPreStop() {
    return withNewPreStopLike(java.util.Optional.ofNullable(buildPreStop()).orElse(new PreStopBuilder().build()));
  }
  
  public PreStopNested<A> editOrNewPreStopLike(PreStop item) {
    return withNewPreStopLike(java.util.Optional.ofNullable(buildPreStop()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    LifecycleFluent that = (LifecycleFluent) o;
    if (!java.util.Objects.equals(postStart, that.postStart)) return false;
    if (!java.util.Objects.equals(preStop, that.preStop)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(postStart,  preStop,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (postStart != null) { sb.append("postStart:"); sb.append(postStart + ","); }
    if (preStop != null) { sb.append("preStop:"); sb.append(preStop); }
    sb.append("}");
    return sb.toString();
  }
  public class PostStartNested<N> extends PostStartFluent<PostStartNested<N>> implements Nested<N>{
    PostStartNested(PostStart item) {
      this.builder = new PostStartBuilder(this, item);
    }
    PostStartBuilder builder;
    
    public N and() {
      return (N) LifecycleFluent.this.withPostStart(builder.build());
    }
    
    public N endEphemeralcontainersPostStart() {
      return and();
    }
    
  
  }
  public class PreStopNested<N> extends PreStopFluent<PreStopNested<N>> implements Nested<N>{
    PreStopNested(PreStop item) {
      this.builder = new PreStopBuilder(this, item);
    }
    PreStopBuilder builder;
    
    public N and() {
      return (N) LifecycleFluent.this.withPreStop(builder.build());
    }
    
    public N endEphemeralcontainersPreStop() {
      return and();
    }
    
  
  }

}