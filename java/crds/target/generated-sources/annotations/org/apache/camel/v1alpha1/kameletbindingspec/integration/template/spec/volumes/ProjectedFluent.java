package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.SourcesFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.SourcesBuilder;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.Sources;
import java.util.function.Predicate;
import java.lang.Integer;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ProjectedFluent<A extends ProjectedFluent<A>> extends BaseFluent<A>{
  public ProjectedFluent() {
  }
  
  public ProjectedFluent(Projected instance) {
    this.copyInstance(instance);
  }
  private Integer defaultMode;
  private ArrayList<SourcesBuilder> sources;
  
  protected void copyInstance(Projected instance) {
    instance = (instance != null ? instance : new Projected());
    if (instance != null) {
          this.withDefaultMode(instance.getDefaultMode());
          this.withSources(instance.getSources());
        }
  }
  
  public Integer getDefaultMode() {
    return this.defaultMode;
  }
  
  public A withDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return (A) this;
  }
  
  public boolean hasDefaultMode() {
    return this.defaultMode != null;
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
  
  public A addToSources(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.Sources... items) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").add(builder);this.sources.add(builder);} return (A)this;
  }
  
  public A addAllToProjectedSources(Collection<Sources> items) {
    if (this.sources == null) {this.sources = new ArrayList<SourcesBuilder>();}
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").add(builder);this.sources.add(builder);} return (A)this;
  }
  
  public A removeFromSources(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.Sources... items) {
    if (this.sources == null) return (A)this;
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").remove(builder); this.sources.remove(builder);} return (A)this;
  }
  
  public A removeAllFromProjectedSources(Collection<Sources> items) {
    if (this.sources == null) return (A)this;
    for (Sources item : items) {SourcesBuilder builder = new SourcesBuilder(item);_visitables.get("sources").remove(builder); this.sources.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromProjectedSources(Predicate<SourcesBuilder> predicate) {
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
  
  public A withSources(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.Sources... sources) {
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ProjectedFluent that = (ProjectedFluent) o;
    if (!java.util.Objects.equals(defaultMode, that.defaultMode)) return false;
    if (!java.util.Objects.equals(sources, that.sources)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(defaultMode,  sources,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (defaultMode != null) { sb.append("defaultMode:"); sb.append(defaultMode + ","); }
    if (sources != null && !sources.isEmpty()) { sb.append("sources:"); sb.append(sources); }
    sb.append("}");
    return sb.toString();
  }
  public class SourcesNested<N> extends SourcesFluent<SourcesNested<N>> implements Nested<N>{
    SourcesNested(int index,Sources item) {
      this.index = index;
      this.builder = new SourcesBuilder(this, item);
    }
    SourcesBuilder builder;
    int index;
    
    public N and() {
      return (N) ProjectedFluent.this.setToSources(index,builder.build());
    }
    
    public N endProjectedSource() {
      return and();
    }
    
  
  }

}