package org.apache.camel.v1alpha1;

import org.apache.camel.v1alpha1.kameletspec.Types;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1alpha1.kameletspec.SourcesFluent;
import java.lang.SuppressWarnings;
import org.apache.camel.v1alpha1.kameletspec.TemplateBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletspec.DefinitionBuilder;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import org.apache.camel.v1alpha1.kameletspec.Template;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import org.apache.camel.v1alpha1.kameletspec.TemplateFluent;
import org.apache.camel.v1alpha1.kameletspec.Definition;
import org.apache.camel.v1alpha1.kameletspec.SourcesBuilder;
import org.apache.camel.v1alpha1.kameletspec.Sources;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import org.apache.camel.v1alpha1.kameletspec.DefinitionFluent;
import org.apache.camel.v1alpha1.kameletspec.DataTypes;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class KameletSpecFluent<A extends KameletSpecFluent<A>> extends BaseFluent<A>{
  public KameletSpecFluent() {
  }
  
  public KameletSpecFluent(KameletSpec instance) {
    this.copyInstance(instance);
  }
  private Map<String,DataTypes> dataTypes;
  private DefinitionBuilder definition;
  private List<String> dependencies;
  private ArrayList<SourcesBuilder> sources;
  private TemplateBuilder template;
  private Map<String,Types> types;
  
  protected void copyInstance(KameletSpec instance) {
    instance = (instance != null ? instance : new KameletSpec());
    if (instance != null) {
          this.withDataTypes(instance.getDataTypes());
          this.withDefinition(instance.getDefinition());
          this.withDependencies(instance.getDependencies());
          this.withSources(instance.getSources());
          this.withTemplate(instance.getTemplate());
          this.withTypes(instance.getTypes());
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
  
  public Definition buildDefinition() {
    return this.definition != null ? this.definition.build() : null;
  }
  
  public A withDefinition(Definition definition) {
    this._visitables.remove("definition");
    if (definition != null) {
        this.definition = new DefinitionBuilder(definition);
        this._visitables.get("definition").add(this.definition);
    } else {
        this.definition = null;
        this._visitables.get("definition").remove(this.definition);
    }
    return (A) this;
  }
  
  public boolean hasDefinition() {
    return this.definition != null;
  }
  
  public DefinitionNested<A> withNewDefinition() {
    return new DefinitionNested(null);
  }
  
  public DefinitionNested<A> withNewDefinitionLike(Definition item) {
    return new DefinitionNested(item);
  }
  
  public DefinitionNested<A> editV1alpha1Definition() {
    return withNewDefinitionLike(java.util.Optional.ofNullable(buildDefinition()).orElse(null));
  }
  
  public DefinitionNested<A> editOrNewDefinition() {
    return withNewDefinitionLike(java.util.Optional.ofNullable(buildDefinition()).orElse(new DefinitionBuilder().build()));
  }
  
  public DefinitionNested<A> editOrNewDefinitionLike(Definition item) {
    return withNewDefinitionLike(java.util.Optional.ofNullable(buildDefinition()).orElse(item));
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
  
  public A addToSources(int index,Sources item) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    SourcesBuilder builder = new SourcesBuilder(item);
    if (index < 0 || index >= sources.size()) { _visitables.get("sources").add(builder); sources.add(builder); } else { _visitables.get("sources").add(index, builder); sources.add(index, builder);}
    return (A)this;
  }
  
  public A setToSources(int index,Sources item) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    SourcesBuilder builder = new SourcesBuilder(item);
    if (index < 0 || index >= sources.size()) { _visitables.get("sources").add(builder); sources.add(builder); } else { _visitables.get("sources").set(index, builder); sources.set(index, builder);}
    return (A)this;
  }
  
  public A addToSources(org.apache.camel.v1alpha1.kameletspec.Sources... items) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").add(builder);this.sources.add(builder);} return (A)this;
  }
  
  public A addAllToKameletspecSources(Collection<Sources> items) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").add(builder);this.sources.add(builder);} return (A)this;
  }
  
  public A removeFromSources(org.apache.camel.v1alpha1.kameletspec.Sources... items) {
    if (this.sources == null) return (A)this;
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").remove(builder); this.sources.remove(builder);} return (A)this;
  }
  
  public A removeAllFromKameletspecSources(Collection<Sources> items) {
    if (this.sources == null) return (A)this;
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").remove(builder); this.sources.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromKameletspecSources(Predicate<SourcesBuilder> predicate) {
    if (sources == null) return (A) this;
    final Iterator<SourcesBuilder> each = sources.iterator();
    final List visitables = _visitables.get("sources");
    while (each.hasNext()) {
      SourcesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Sources> buildSources() {
    return this.sources != null ? build(sources) : null;
  }
  
  public Sources buildSource(int index) {
    return this.sources.get(index).build();
  }
  
  public Sources buildFirstSource() {
    return this.sources.get(0).build();
  }
  
  public Sources buildLastSource() {
    return this.sources.get(sources.size() - 1).build();
  }
  
  public Sources buildMatchingSource(Predicate<SourcesBuilder> predicate) {
      for (SourcesBuilder item : sources) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingSource(Predicate<SourcesBuilder> predicate) {
      for (SourcesBuilder item : sources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSources(List<Sources> sources) {
    if (this.sources != null) {
      this._visitables.get("sources").clear();
    }
    if (sources != null) {
        this.sources = new ArrayList();
        for (Sources item : sources) {
          this.addToSources(item);
        }
    } else {
      this.sources = null;
    }
    return (A) this;
  }
  
  public A withSources(org.apache.camel.v1alpha1.kameletspec.Sources... sources) {
    if (this.sources != null) {
        this.sources.clear();
        _visitables.remove("sources");
    }
    if (sources != null) {
      for (Sources item : sources) {
        this.addToSources(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSources() {
    return this.sources != null && !this.sources.isEmpty();
  }
  
  public SourcesNested<A> addNewSource() {
    return new SourcesNested(-1, null);
  }
  
  public SourcesNested<A> addNewSourceLike(Sources item) {
    return new SourcesNested(-1, item);
  }
  
  public SourcesNested<A> setNewSourceLike(int index,Sources item) {
    return new SourcesNested(index, item);
  }
  
  public SourcesNested<A> editSource(int index) {
    if (sources.size() <= index) throw new RuntimeException("Can't edit sources. Index exceeds size.");
    return setNewSourceLike(index, buildSource(index));
  }
  
  public SourcesNested<A> editFirstSource() {
    if (sources.size() == 0) throw new RuntimeException("Can't edit first sources. The list is empty.");
    return setNewSourceLike(0, buildSource(0));
  }
  
  public SourcesNested<A> editLastSource() {
    int index = sources.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last sources. The list is empty.");
    return setNewSourceLike(index, buildSource(index));
  }
  
  public SourcesNested<A> editMatchingSource(Predicate<SourcesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<sources.size();i++) { 
    if (predicate.test(sources.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching sources. No match found.");
    return setNewSourceLike(index, buildSource(index));
  }
  
  public Template buildTemplate() {
    return this.template != null ? this.template.build() : null;
  }
  
  public A withTemplate(Template template) {
    this._visitables.remove("template");
    if (template != null) {
        this.template = new TemplateBuilder(template);
        this._visitables.get("template").add(this.template);
    } else {
        this.template = null;
        this._visitables.get("template").remove(this.template);
    }
    return (A) this;
  }
  
  public boolean hasTemplate() {
    return this.template != null;
  }
  
  public TemplateNested<A> withNewTemplate() {
    return new TemplateNested(null);
  }
  
  public TemplateNested<A> withNewTemplateLike(Template item) {
    return new TemplateNested(item);
  }
  
  public TemplateNested<A> editKameletspecTemplate() {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(null));
  }
  
  public TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(new TemplateBuilder().build()));
  }
  
  public TemplateNested<A> editOrNewTemplateLike(Template item) {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(item));
  }
  
  public A addToTypes(String key,Types value) {
    if(this.types == null && key != null && value != null) { this.types = new LinkedHashMap(); }
    if(key != null && value != null) {this.types.put(key, value);} return (A)this;
  }
  
  public A addToTypes(Map<String,Types> map) {
    if(this.types == null && map != null) { this.types = new LinkedHashMap(); }
    if(map != null) { this.types.putAll(map);} return (A)this;
  }
  
  public A removeFromTypes(String key) {
    if(this.types == null) { return (A) this; }
    if(key != null && this.types != null) {this.types.remove(key);} return (A)this;
  }
  
  public A removeFromTypes(Map<String,Types> map) {
    if(this.types == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.types != null){this.types.remove(key);}}} return (A)this;
  }
  
  public Map<String,Types> getTypes() {
    return this.types;
  }
  
  public <K,V>A withTypes(Map<String,Types> types) {
    if (types == null) {
      this.types = null;
    } else {
      this.types = new LinkedHashMap(types);
    }
    return (A) this;
  }
  
  public boolean hasTypes() {
    return this.types != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletSpecFluent that = (KameletSpecFluent) o;
    if (!java.util.Objects.equals(dataTypes, that.dataTypes)) return false;
    if (!java.util.Objects.equals(definition, that.definition)) return false;
    if (!java.util.Objects.equals(dependencies, that.dependencies)) return false;
    if (!java.util.Objects.equals(sources, that.sources)) return false;
    if (!java.util.Objects.equals(template, that.template)) return false;
    if (!java.util.Objects.equals(types, that.types)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(dataTypes,  definition,  dependencies,  sources,  template,  types,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (dataTypes != null && !dataTypes.isEmpty()) { sb.append("dataTypes:"); sb.append(dataTypes + ","); }
    if (definition != null) { sb.append("definition:"); sb.append(definition + ","); }
    if (dependencies != null && !dependencies.isEmpty()) { sb.append("dependencies:"); sb.append(dependencies + ","); }
    if (sources != null && !sources.isEmpty()) { sb.append("sources:"); sb.append(sources + ","); }
    if (template != null) { sb.append("template:"); sb.append(template + ","); }
    if (types != null && !types.isEmpty()) { sb.append("types:"); sb.append(types); }
    sb.append("}");
    return sb.toString();
  }
  public class DefinitionNested<N> extends DefinitionFluent<DefinitionNested<N>> implements Nested<N>{
    DefinitionNested(Definition item) {
      this.builder = new DefinitionBuilder(this, item);
    }
    DefinitionBuilder builder;
    
    public N and() {
      return (N) KameletSpecFluent.this.withDefinition(builder.build());
    }
    
    public N endV1alpha1Definition() {
      return and();
    }
    
  
  }
  public class SourcesNested<N> extends SourcesFluent<SourcesNested<N>> implements Nested<N>{
    SourcesNested(int index,Sources item) {
      this.index = index;
      this.builder = new SourcesBuilder(this, item);
    }
    SourcesBuilder builder;
    int index;
    
    public N and() {
      return (N) KameletSpecFluent.this.setToSources(index,builder.build());
    }
    
    public N endKameletspecSource() {
      return and();
    }
    
  
  }
  public class TemplateNested<N> extends TemplateFluent<TemplateNested<N>> implements Nested<N>{
    TemplateNested(Template item) {
      this.builder = new TemplateBuilder(this, item);
    }
    TemplateBuilder builder;
    
    public N and() {
      return (N) KameletSpecFluent.this.withTemplate(builder.build());
    }
    
    public N endKameletspecTemplate() {
      return and();
    }
    
  
  }

}