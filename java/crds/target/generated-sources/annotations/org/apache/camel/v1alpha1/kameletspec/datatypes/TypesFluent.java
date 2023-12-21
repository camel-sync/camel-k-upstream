package org.apache.camel.v1alpha1.kameletspec.datatypes;

import java.lang.SuppressWarnings;
import org.apache.camel.v1alpha1.kameletspec.datatypes.types.Headers;
import org.apache.camel.v1alpha1.kameletspec.datatypes.types.Schema;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1alpha1.kameletspec.datatypes.types.SchemaFluent;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1alpha1.kameletspec.datatypes.types.SchemaBuilder;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class TypesFluent<A extends TypesFluent<A>> extends BaseFluent<A>{
  public TypesFluent() {
  }
  
  public TypesFluent(Types instance) {
    this.copyInstance(instance);
  }
  private List<String> dependencies;
  private String description;
  private String format;
  private Map<String,Headers> headers;
  private String mediaType;
  private SchemaBuilder schema;
  private String scheme;
  
  protected void copyInstance(Types instance) {
    instance = (instance != null ? instance : new Types());
    if (instance != null) {
          this.withDependencies(instance.getDependencies());
          this.withDescription(instance.getDescription());
          this.withFormat(instance.getFormat());
          this.withHeaders(instance.getHeaders());
          this.withMediaType(instance.getMediaType());
          this.withSchema(instance.getSchema());
          this.withScheme(instance.getScheme());
        }
  }
  
  public A addToDependencies(int index,String item) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<String>();}
    this.dependencies.add(index, item);
    return (A)this;
  }
  
  public A setToDependencies(int index,String item) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<String>();}
    this.dependencies.set(index, item); return (A)this;
  }
  
  public A addToDependencies(java.lang.String... items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<String>();}
    for (String item : items) {this.dependencies.add(item);} return (A)this;
  }
  
  public A addAllToDependencies(Collection<String> items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<String>();}
    for (String item : items) {this.dependencies.add(item);} return (A)this;
  }
  
  public A removeFromDependencies(java.lang.String... items) {
    if (this.dependencies == null) return (A)this;
    for (String item : items) { this.dependencies.remove(item);} return (A)this;
  }
  
  public A removeAllFromDependencies(Collection<String> items) {
    if (this.dependencies == null) return (A)this;
    for (String item : items) { this.dependencies.remove(item);} return (A)this;
  }
  
  public List<String> getDependencies() {
    return this.dependencies;
  }
  
  public String getDependency(int index) {
    return this.dependencies.get(index);
  }
  
  public String getFirstDependency() {
    return this.dependencies.get(0);
  }
  
  public String getLastDependency() {
    return this.dependencies.get(dependencies.size() - 1);
  }
  
  public String getMatchingDependency(Predicate<String> predicate) {
      for (String item : dependencies) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingDependency(Predicate<String> predicate) {
      for (String item : dependencies) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDependencies(List<String> dependencies) {
    if (dependencies != null) {
        this.dependencies = new ArrayList();
        for (String item : dependencies) {
          this.addToDependencies(item);
        }
    } else {
      this.dependencies = null;
    }
    return (A) this;
  }
  
  public A withDependencies(java.lang.String... dependencies) {
    if (this.dependencies != null) {
        this.dependencies.clear();
        _visitables.remove("dependencies");
    }
    if (dependencies != null) {
      for (String item : dependencies) {
        this.addToDependencies(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDependencies() {
    return this.dependencies != null && !this.dependencies.isEmpty();
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public A withDescription(String description) {
    this.description = description;
    return (A) this;
  }
  
  public boolean hasDescription() {
    return this.description != null;
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
  
  public A addToHeaders(String key,Headers value) {
    if(this.headers == null && key != null && value != null) { this.headers = new LinkedHashMap(); }
    if(key != null && value != null) {this.headers.put(key, value);} return (A)this;
  }
  
  public A addToHeaders(Map<String,Headers> map) {
    if(this.headers == null && map != null) { this.headers = new LinkedHashMap(); }
    if(map != null) { this.headers.putAll(map);} return (A)this;
  }
  
  public A removeFromHeaders(String key) {
    if(this.headers == null) { return (A) this; }
    if(key != null && this.headers != null) {this.headers.remove(key);} return (A)this;
  }
  
  public A removeFromHeaders(Map<String,Headers> map) {
    if(this.headers == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.headers != null){this.headers.remove(key);}}} return (A)this;
  }
  
  public Map<String,Headers> getHeaders() {
    return this.headers;
  }
  
  public <K,V>A withHeaders(Map<String,Headers> headers) {
    if (headers == null) {
      this.headers = null;
    } else {
      this.headers = new LinkedHashMap(headers);
    }
    return (A) this;
  }
  
  public boolean hasHeaders() {
    return this.headers != null;
  }
  
  public String getMediaType() {
    return this.mediaType;
  }
  
  public A withMediaType(String mediaType) {
    this.mediaType = mediaType;
    return (A) this;
  }
  
  public boolean hasMediaType() {
    return this.mediaType != null;
  }
  
  public Schema buildSchema() {
    return this.schema != null ? this.schema.build() : null;
  }
  
  public A withSchema(Schema schema) {
    this._visitables.remove("schema");
    if (schema != null) {
        this.schema = new SchemaBuilder(schema);
        this._visitables.get("schema").add(this.schema);
    } else {
        this.schema = null;
        this._visitables.get("schema").remove(this.schema);
    }
    return (A) this;
  }
  
  public boolean hasSchema() {
    return this.schema != null;
  }
  
  public SchemaNested<A> withNewSchema() {
    return new SchemaNested(null);
  }
  
  public SchemaNested<A> withNewSchemaLike(Schema item) {
    return new SchemaNested(item);
  }
  
  public SchemaNested<A> editV1alpha1Schema() {
    return withNewSchemaLike(java.util.Optional.ofNullable(buildSchema()).orElse(null));
  }
  
  public SchemaNested<A> editOrNewSchema() {
    return withNewSchemaLike(java.util.Optional.ofNullable(buildSchema()).orElse(new SchemaBuilder().build()));
  }
  
  public SchemaNested<A> editOrNewSchemaLike(Schema item) {
    return withNewSchemaLike(java.util.Optional.ofNullable(buildSchema()).orElse(item));
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
    TypesFluent that = (TypesFluent) o;
    if (!java.util.Objects.equals(dependencies, that.dependencies)) return false;
    if (!java.util.Objects.equals(description, that.description)) return false;
    if (!java.util.Objects.equals(format, that.format)) return false;
    if (!java.util.Objects.equals(headers, that.headers)) return false;
    if (!java.util.Objects.equals(mediaType, that.mediaType)) return false;
    if (!java.util.Objects.equals(schema, that.schema)) return false;
    if (!java.util.Objects.equals(scheme, that.scheme)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(dependencies,  description,  format,  headers,  mediaType,  schema,  scheme,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (dependencies != null && !dependencies.isEmpty()) { sb.append("dependencies:"); sb.append(dependencies + ","); }
    if (description != null) { sb.append("description:"); sb.append(description + ","); }
    if (format != null) { sb.append("format:"); sb.append(format + ","); }
    if (headers != null && !headers.isEmpty()) { sb.append("headers:"); sb.append(headers + ","); }
    if (mediaType != null) { sb.append("mediaType:"); sb.append(mediaType + ","); }
    if (schema != null) { sb.append("schema:"); sb.append(schema + ","); }
    if (scheme != null) { sb.append("scheme:"); sb.append(scheme); }
    sb.append("}");
    return sb.toString();
  }
  public class SchemaNested<N> extends SchemaFluent<SchemaNested<N>> implements Nested<N>{
    SchemaNested(Schema item) {
      this.builder = new SchemaBuilder(this, item);
    }
    SchemaBuilder builder;
    
    public N and() {
      return (N) TypesFluent.this.withSchema(builder.build());
    }
    
    public N endV1alpha1Schema() {
      return and();
    }
    
  
  }

}