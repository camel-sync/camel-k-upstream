package org.apache.camel.v1.kameletspec;

import java.lang.SuppressWarnings;
import org.apache.camel.v1.kameletspec.types.Schema;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1.kameletspec.types.SchemaBuilder;
import java.lang.Object;
import org.apache.camel.v1.kameletspec.types.SchemaFluent;
import java.lang.String;

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
  private String mediaType;
  private SchemaBuilder schema;
  
  protected void copyInstance(Types instance) {
    instance = (instance != null ? instance : new Types());
    if (instance != null) {
          this.withMediaType(instance.getMediaType());
          this.withSchema(instance.getSchema());
        }
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
  
  public SchemaNested<A> editKameletspecSchema() {
    return withNewSchemaLike(java.util.Optional.ofNullable(buildSchema()).orElse(null));
  }
  
  public SchemaNested<A> editOrNewSchema() {
    return withNewSchemaLike(java.util.Optional.ofNullable(buildSchema()).orElse(new SchemaBuilder().build()));
  }
  
  public SchemaNested<A> editOrNewSchemaLike(Schema item) {
    return withNewSchemaLike(java.util.Optional.ofNullable(buildSchema()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    TypesFluent that = (TypesFluent) o;
    if (!java.util.Objects.equals(mediaType, that.mediaType)) return false;
    if (!java.util.Objects.equals(schema, that.schema)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(mediaType,  schema,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (mediaType != null) { sb.append("mediaType:"); sb.append(mediaType + ","); }
    if (schema != null) { sb.append("schema:"); sb.append(schema); }
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
    
    public N endKameletspecSchema() {
      return and();
    }
    
  
  }

}