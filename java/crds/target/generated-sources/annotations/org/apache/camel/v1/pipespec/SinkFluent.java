package org.apache.camel.v1.pipespec;

import org.apache.camel.v1.pipespec.sink.PropertiesFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.pipespec.sink.Properties;
import org.apache.camel.v1.pipespec.sink.PropertiesBuilder;
import java.util.LinkedHashMap;
import org.apache.camel.v1.pipespec.sink.Ref;
import org.apache.camel.v1.pipespec.sink.RefBuilder;
import org.apache.camel.v1.pipespec.sink.RefFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.util.Map;
import org.apache.camel.v1.pipespec.sink.DataTypes;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SinkFluent<A extends SinkFluent<A>> extends BaseFluent<A>{
  public SinkFluent() {
  }
  
  public SinkFluent(Sink instance) {
    this.copyInstance(instance);
  }
  private Map<String,DataTypes> dataTypes;
  private PropertiesBuilder properties;
  private RefBuilder ref;
  private String uri;
  
  protected void copyInstance(Sink instance) {
    instance = (instance != null ? instance : new Sink());
    if (instance != null) {
          this.withDataTypes(instance.getDataTypes());
          this.withProperties(instance.getProperties());
          this.withRef(instance.getRef());
          this.withUri(instance.getUri());
        }
  }
  
  public A addToDataTypes(String key,DataTypes value) {
    if(this.dataTypes == null && key != null && value != null) { this.dataTypes = new LinkedHashMap(); }
    if(key != null && value != null) {this.dataTypes.put(key, value);} return (A)this;
  }
  
  public A addToDataTypes(Map<String,DataTypes> map) {
    if(this.dataTypes == null && map != null) { this.dataTypes = new LinkedHashMap(); }
    if(map != null) { this.dataTypes.putAll(map);} return (A)this;
  }
  
  public A removeFromDataTypes(String key) {
    if(this.dataTypes == null) { return (A) this; }
    if(key != null && this.dataTypes != null) {this.dataTypes.remove(key);} return (A)this;
  }
  
  public A removeFromDataTypes(Map<String,DataTypes> map) {
    if(this.dataTypes == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.dataTypes != null){this.dataTypes.remove(key);}}} return (A)this;
  }
  
  public Map<String,DataTypes> getDataTypes() {
    return this.dataTypes;
  }
  
  public <K,V>A withDataTypes(Map<String,DataTypes> dataTypes) {
    if (dataTypes == null) {
      this.dataTypes = null;
    } else {
      this.dataTypes = new LinkedHashMap(dataTypes);
    }
    return (A) this;
  }
  
  public boolean hasDataTypes() {
    return this.dataTypes != null;
  }
  
  public Properties buildProperties() {
    return this.properties != null ? this.properties.build() : null;
  }
  
  public A withProperties(Properties properties) {
    this._visitables.remove("properties");
    if (properties != null) {
        this.properties = new PropertiesBuilder(properties);
        this._visitables.get("properties").add(this.properties);
    } else {
        this.properties = null;
        this._visitables.get("properties").remove(this.properties);
    }
    return (A) this;
  }
  
  public boolean hasProperties() {
    return this.properties != null;
  }
  
  public PropertiesNested<A> withNewProperties() {
    return new PropertiesNested(null);
  }
  
  public PropertiesNested<A> withNewPropertiesLike(Properties item) {
    return new PropertiesNested(item);
  }
  
  public PropertiesNested<A> editProperties() {
    return withNewPropertiesLike(java.util.Optional.ofNullable(buildProperties()).orElse(null));
  }
  
  public PropertiesNested<A> editOrNewProperties() {
    return withNewPropertiesLike(java.util.Optional.ofNullable(buildProperties()).orElse(new PropertiesBuilder().build()));
  }
  
  public PropertiesNested<A> editOrNewPropertiesLike(Properties item) {
    return withNewPropertiesLike(java.util.Optional.ofNullable(buildProperties()).orElse(item));
  }
  
  public Ref buildRef() {
    return this.ref != null ? this.ref.build() : null;
  }
  
  public A withRef(Ref ref) {
    this._visitables.remove("ref");
    if (ref != null) {
        this.ref = new RefBuilder(ref);
        this._visitables.get("ref").add(this.ref);
    } else {
        this.ref = null;
        this._visitables.get("ref").remove(this.ref);
    }
    return (A) this;
  }
  
  public boolean hasRef() {
    return this.ref != null;
  }
  
  public RefNested<A> withNewRef() {
    return new RefNested(null);
  }
  
  public RefNested<A> withNewRefLike(Ref item) {
    return new RefNested(item);
  }
  
  public RefNested<A> editRef() {
    return withNewRefLike(java.util.Optional.ofNullable(buildRef()).orElse(null));
  }
  
  public RefNested<A> editOrNewRef() {
    return withNewRefLike(java.util.Optional.ofNullable(buildRef()).orElse(new RefBuilder().build()));
  }
  
  public RefNested<A> editOrNewRefLike(Ref item) {
    return withNewRefLike(java.util.Optional.ofNullable(buildRef()).orElse(item));
  }
  
  public String getUri() {
    return this.uri;
  }
  
  public A withUri(String uri) {
    this.uri = uri;
    return (A) this;
  }
  
  public boolean hasUri() {
    return this.uri != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    SinkFluent that = (SinkFluent) o;
    if (!java.util.Objects.equals(dataTypes, that.dataTypes)) return false;
    if (!java.util.Objects.equals(properties, that.properties)) return false;
    if (!java.util.Objects.equals(ref, that.ref)) return false;
    if (!java.util.Objects.equals(uri, that.uri)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(dataTypes,  properties,  ref,  uri,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (dataTypes != null && !dataTypes.isEmpty()) { sb.append("dataTypes:"); sb.append(dataTypes + ","); }
    if (properties != null) { sb.append("properties:"); sb.append(properties + ","); }
    if (ref != null) { sb.append("ref:"); sb.append(ref + ","); }
    if (uri != null) { sb.append("uri:"); sb.append(uri); }
    sb.append("}");
    return sb.toString();
  }
  public class PropertiesNested<N> extends PropertiesFluent<PropertiesNested<N>> implements Nested<N>{
    PropertiesNested(Properties item) {
      this.builder = new PropertiesBuilder(this, item);
    }
    PropertiesBuilder builder;
    
    public N and() {
      return (N) SinkFluent.this.withProperties(builder.build());
    }
    
    public N endProperties() {
      return and();
    }
    
  
  }
  public class RefNested<N> extends RefFluent<RefNested<N>> implements Nested<N>{
    RefNested(Ref item) {
      this.builder = new RefBuilder(this, item);
    }
    RefBuilder builder;
    
    public N and() {
      return (N) SinkFluent.this.withRef(builder.build());
    }
    
    public N endRef() {
      return and();
    }
    
  
  }

}