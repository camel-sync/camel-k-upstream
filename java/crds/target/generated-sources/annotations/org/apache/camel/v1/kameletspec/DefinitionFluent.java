package org.apache.camel.v1.kameletspec;

import org.apache.camel.v1.kameletspec.definition.ExternalDocsFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.kameletspec.definition.ExternalDocsBuilder;
import org.apache.camel.v1.kameletspec.definition.Properties;
import org.apache.camel.v1.kameletspec.definition.ExternalDocs;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import io.fabric8.kubernetes.api.model.AnyType;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class DefinitionFluent<A extends DefinitionFluent<A>> extends BaseFluent<A>{
  public DefinitionFluent() {
  }
  
  public DefinitionFluent(Definition instance) {
    this.copyInstance(instance);
  }
  private String description;
  private AnyType example;
  private ExternalDocsBuilder externalDocs;
  private String id;
  private Map<String,Properties> properties;
  private List<String> required;
  private String title;
  private String type;
  
  protected void copyInstance(Definition instance) {
    instance = (instance != null ? instance : new Definition());
    if (instance != null) {
          this.withDescription(instance.getDescription());
          this.withExample(instance.getExample());
          this.withExternalDocs(instance.getExternalDocs());
          this.withId(instance.getId());
          this.withProperties(instance.getProperties());
          this.withRequired(instance.getRequired());
          this.withTitle(instance.getTitle());
          this.withType(instance.getType());
        }
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
  
  public AnyType getExample() {
    return this.example;
  }
  
  public A withExample(AnyType example) {
    this.example = example;
    return (A) this;
  }
  
  public boolean hasExample() {
    return this.example != null;
  }
  
  public A withNewExample(Object value) {
    return (A)withExample(new AnyType(value));
  }
  
  public ExternalDocs buildExternalDocs() {
    return this.externalDocs != null ? this.externalDocs.build() : null;
  }
  
  public A withExternalDocs(ExternalDocs externalDocs) {
    this._visitables.remove("externalDocs");
    if (externalDocs != null) {
        this.externalDocs = new ExternalDocsBuilder(externalDocs);
        this._visitables.get("externalDocs").add(this.externalDocs);
    } else {
        this.externalDocs = null;
        this._visitables.get("externalDocs").remove(this.externalDocs);
    }
    return (A) this;
  }
  
  public boolean hasExternalDocs() {
    return this.externalDocs != null;
  }
  
  public ExternalDocsNested<A> withNewExternalDocs() {
    return new ExternalDocsNested(null);
  }
  
  public ExternalDocsNested<A> withNewExternalDocsLike(ExternalDocs item) {
    return new ExternalDocsNested(item);
  }
  
  public ExternalDocsNested<A> editDefinitionExternalDocs() {
    return withNewExternalDocsLike(java.util.Optional.ofNullable(buildExternalDocs()).orElse(null));
  }
  
  public ExternalDocsNested<A> editOrNewExternalDocs() {
    return withNewExternalDocsLike(java.util.Optional.ofNullable(buildExternalDocs()).orElse(new ExternalDocsBuilder().build()));
  }
  
  public ExternalDocsNested<A> editOrNewExternalDocsLike(ExternalDocs item) {
    return withNewExternalDocsLike(java.util.Optional.ofNullable(buildExternalDocs()).orElse(item));
  }
  
  public String getId() {
    return this.id;
  }
  
  public A withId(String id) {
    this.id = id;
    return (A) this;
  }
  
  public boolean hasId() {
    return this.id != null;
  }
  
  public A addToProperties(String key,Properties value) {
    if(this.properties == null && key != null && value != null) { this.properties = new LinkedHashMap(); }
    if(key != null && value != null) {this.properties.put(key, value);} return (A)this;
  }
  
  public A addToProperties(Map<String,Properties> map) {
    if(this.properties == null && map != null) { this.properties = new LinkedHashMap(); }
    if(map != null) { this.properties.putAll(map);} return (A)this;
  }
  
  public A removeFromProperties(String key) {
    if(this.properties == null) { return (A) this; }
    if(key != null && this.properties != null) {this.properties.remove(key);} return (A)this;
  }
  
  public A removeFromProperties(Map<String,Properties> map) {
    if(this.properties == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.properties != null){this.properties.remove(key);}}} return (A)this;
  }
  
  public Map<String,Properties> getProperties() {
    return this.properties;
  }
  
  public <K,V>A withProperties(Map<String,Properties> properties) {
    if (properties == null) {
      this.properties = null;
    } else {
      this.properties = new LinkedHashMap(properties);
    }
    return (A) this;
  }
  
  public boolean hasProperties() {
    return this.properties != null;
  }
  
  public A addToRequired(int index,String item) {
    if (this.required == null) {this.required = new ArrayList<String>();}
    this.required.add(index, item);
    return (A)this;
  }
  
  public A setToRequired(int index,String item) {
    if (this.required == null) {this.required = new ArrayList<String>();}
    this.required.set(index, item); return (A)this;
  }
  
  public A addToRequired(java.lang.String... items) {
    if (this.required == null) {this.required = new ArrayList<String>();}
    for (String item : items) {this.required.add(item);} return (A)this;
  }
  
  public A addAllToRequired(Collection<String> items) {
    if (this.required == null) {this.required = new ArrayList<String>();}
    for (String item : items) {this.required.add(item);} return (A)this;
  }
  
  public A removeFromRequired(java.lang.String... items) {
    if (this.required == null) return (A)this;
    for (String item : items) { this.required.remove(item);} return (A)this;
  }
  
  public A removeAllFromRequired(Collection<String> items) {
    if (this.required == null) return (A)this;
    for (String item : items) { this.required.remove(item);} return (A)this;
  }
  
  public List<String> getRequired() {
    return this.required;
  }
  
  public String getRequired(int index) {
    return this.required.get(index);
  }
  
  public String getFirstRequired() {
    return this.required.get(0);
  }
  
  public String getLastRequired() {
    return this.required.get(required.size() - 1);
  }
  
  public String getMatchingRequired(Predicate<String> predicate) {
      for (String item : required) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequired(Predicate<String> predicate) {
      for (String item : required) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequired(List<String> required) {
    if (required != null) {
        this.required = new ArrayList();
        for (String item : required) {
          this.addToRequired(item);
        }
    } else {
      this.required = null;
    }
    return (A) this;
  }
  
  public A withRequired(java.lang.String... required) {
    if (this.required != null) {
        this.required.clear();
        _visitables.remove("required");
    }
    if (required != null) {
      for (String item : required) {
        this.addToRequired(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRequired() {
    return this.required != null && !this.required.isEmpty();
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public A withTitle(String title) {
    this.title = title;
    return (A) this;
  }
  
  public boolean hasTitle() {
    return this.title != null;
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    DefinitionFluent that = (DefinitionFluent) o;
    if (!java.util.Objects.equals(description, that.description)) return false;
    if (!java.util.Objects.equals(example, that.example)) return false;
    if (!java.util.Objects.equals(externalDocs, that.externalDocs)) return false;
    if (!java.util.Objects.equals(id, that.id)) return false;
    if (!java.util.Objects.equals(properties, that.properties)) return false;
    if (!java.util.Objects.equals(required, that.required)) return false;
    if (!java.util.Objects.equals(title, that.title)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(description,  example,  externalDocs,  id,  properties,  required,  title,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (description != null) { sb.append("description:"); sb.append(description + ","); }
    if (example != null) { sb.append("example:"); sb.append(example + ","); }
    if (externalDocs != null) { sb.append("externalDocs:"); sb.append(externalDocs + ","); }
    if (id != null) { sb.append("id:"); sb.append(id + ","); }
    if (properties != null && !properties.isEmpty()) { sb.append("properties:"); sb.append(properties + ","); }
    if (required != null && !required.isEmpty()) { sb.append("required:"); sb.append(required + ","); }
    if (title != null) { sb.append("title:"); sb.append(title + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  public class ExternalDocsNested<N> extends ExternalDocsFluent<ExternalDocsNested<N>> implements Nested<N>{
    ExternalDocsNested(ExternalDocs item) {
      this.builder = new ExternalDocsBuilder(this, item);
    }
    ExternalDocsBuilder builder;
    
    public N and() {
      return (N) DefinitionFluent.this.withExternalDocs(builder.build());
    }
    
    public N endDefinitionExternalDocs() {
      return and();
    }
    
  
  }

}