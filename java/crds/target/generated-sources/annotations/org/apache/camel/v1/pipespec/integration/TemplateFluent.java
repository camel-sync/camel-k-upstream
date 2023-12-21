package org.apache.camel.v1.pipespec.integration;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1.pipespec.integration.template.SpecBuilder;
import java.lang.Object;
import java.lang.String;
import org.apache.camel.v1.pipespec.integration.template.Spec;
import org.apache.camel.v1.pipespec.integration.template.SpecFluent;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class TemplateFluent<A extends TemplateFluent<A>> extends BaseFluent<A>{
  public TemplateFluent() {
  }
  
  public TemplateFluent(Template instance) {
    this.copyInstance(instance);
  }
  private SpecBuilder spec;
  
  protected void copyInstance(Template instance) {
    instance = (instance != null ? instance : new Template());
    if (instance != null) {
          this.withSpec(instance.getSpec());
        }
  }
  
  public Spec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }
  
  public A withSpec(Spec spec) {
    this._visitables.remove("spec");
    if (spec != null) {
        this.spec = new SpecBuilder(spec);
        this._visitables.get("spec").add(this.spec);
    } else {
        this.spec = null;
        this._visitables.get("spec").remove(this.spec);
    }
    return (A) this;
  }
  
  public boolean hasSpec() {
    return this.spec != null;
  }
  
  public SpecNested<A> withNewSpec() {
    return new SpecNested(null);
  }
  
  public SpecNested<A> withNewSpecLike(Spec item) {
    return new SpecNested(item);
  }
  
  public SpecNested<A> editIntegrationSpec() {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(null));
  }
  
  public SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(new SpecBuilder().build()));
  }
  
  public SpecNested<A> editOrNewSpecLike(Spec item) {
    return withNewSpecLike(java.util.Optional.ofNullable(buildSpec()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    TemplateFluent that = (TemplateFluent) o;
    if (!java.util.Objects.equals(spec, that.spec)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(spec,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (spec != null) { sb.append("spec:"); sb.append(spec); }
    sb.append("}");
    return sb.toString();
  }
  public class SpecNested<N> extends SpecFluent<SpecNested<N>> implements Nested<N>{
    SpecNested(Spec item) {
      this.builder = new SpecBuilder(this, item);
    }
    SpecBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withSpec(builder.build());
    }
    
    public N endIntegrationSpec() {
      return and();
    }
    
  
  }

}