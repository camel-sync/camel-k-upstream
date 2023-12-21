package org.apache.camel.v1.pipespec.integration.template.spec.containers;

import org.apache.camel.v1.pipespec.integration.template.spec.containers.env.ValueFrom;
import org.apache.camel.v1.pipespec.integration.template.spec.containers.env.ValueFromBuilder;
import org.apache.camel.v1.pipespec.integration.template.spec.containers.env.ValueFromFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class EnvFluent<A extends EnvFluent<A>> extends BaseFluent<A>{
  public EnvFluent() {
  }
  
  public EnvFluent(Env instance) {
    this.copyInstance(instance);
  }
  private String name;
  private String value;
  private ValueFromBuilder valueFrom;
  
  protected void copyInstance(Env instance) {
    instance = (instance != null ? instance : new Env());
    if (instance != null) {
          this.withName(instance.getName());
          this.withValue(instance.getValue());
          this.withValueFrom(instance.getValueFrom());
        }
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public A withValue(String value) {
    this.value = value;
    return (A) this;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public ValueFrom buildValueFrom() {
    return this.valueFrom != null ? this.valueFrom.build() : null;
  }
  
  public A withValueFrom(ValueFrom valueFrom) {
    this._visitables.remove("valueFrom");
    if (valueFrom != null) {
        this.valueFrom = new ValueFromBuilder(valueFrom);
        this._visitables.get("valueFrom").add(this.valueFrom);
    } else {
        this.valueFrom = null;
        this._visitables.get("valueFrom").remove(this.valueFrom);
    }
    return (A) this;
  }
  
  public boolean hasValueFrom() {
    return this.valueFrom != null;
  }
  
  public ValueFromNested<A> withNewValueFrom() {
    return new ValueFromNested(null);
  }
  
  public ValueFromNested<A> withNewValueFromLike(ValueFrom item) {
    return new ValueFromNested(item);
  }
  
  public ValueFromNested<A> editIntegrationValueFrom() {
    return withNewValueFromLike(java.util.Optional.ofNullable(buildValueFrom()).orElse(null));
  }
  
  public ValueFromNested<A> editOrNewValueFrom() {
    return withNewValueFromLike(java.util.Optional.ofNullable(buildValueFrom()).orElse(new ValueFromBuilder().build()));
  }
  
  public ValueFromNested<A> editOrNewValueFromLike(ValueFrom item) {
    return withNewValueFromLike(java.util.Optional.ofNullable(buildValueFrom()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EnvFluent that = (EnvFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(value, that.value)) return false;
    if (!java.util.Objects.equals(valueFrom, that.valueFrom)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(name,  value,  valueFrom,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (value != null) { sb.append("value:"); sb.append(value + ","); }
    if (valueFrom != null) { sb.append("valueFrom:"); sb.append(valueFrom); }
    sb.append("}");
    return sb.toString();
  }
  public class ValueFromNested<N> extends ValueFromFluent<ValueFromNested<N>> implements Nested<N>{
    ValueFromNested(ValueFrom item) {
      this.builder = new ValueFromBuilder(this, item);
    }
    ValueFromBuilder builder;
    
    public N and() {
      return (N) EnvFluent.this.withValueFrom(builder.build());
    }
    
    public N endIntegrationValueFrom() {
      return and();
    }
    
  
  }

}