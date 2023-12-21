package org.apache.camel.v1.buildspec.tasks.package_.runtime;

import org.apache.camel.v1.buildspec.tasks.package_.runtime.capabilities.DependenciesBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import org.apache.camel.v1.buildspec.tasks.package_.runtime.capabilities.DependenciesFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import org.apache.camel.v1.buildspec.tasks.package_.runtime.capabilities.Dependencies;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CapabilitiesFluent<A extends CapabilitiesFluent<A>> extends BaseFluent<A>{
  public CapabilitiesFluent() {
  }
  
  public CapabilitiesFluent(Capabilities instance) {
    this.copyInstance(instance);
  }
  private ArrayList<DependenciesBuilder> dependencies;
  
  protected void copyInstance(Capabilities instance) {
    instance = (instance != null ? instance : new Capabilities());
    if (instance != null) {
          this.withDependencies(instance.getDependencies());
        }
  }
  
  public A addToDependencies(int index,Dependencies item) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    DependenciesBuilder builder = new DependenciesBuilder(item);
    if (index < 0 || index >= dependencies.size()) { _visitables.get("dependencies").add(builder); dependencies.add(builder); } else { _visitables.get("dependencies").add(index, builder); dependencies.add(index, builder);}
    return (A)this;
  }
  
  public A setToDependencies(int index,Dependencies item) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    DependenciesBuilder builder = new DependenciesBuilder(item);
    if (index < 0 || index >= dependencies.size()) { _visitables.get("dependencies").add(builder); dependencies.add(builder); } else { _visitables.get("dependencies").set(index, builder); dependencies.set(index, builder);}
    return (A)this;
  }
  
  public A addToDependencies(org.apache.camel.v1.buildspec.tasks.package_.runtime.capabilities.Dependencies... items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").add(builder);this.dependencies.add(builder);} return (A)this;
  }
  
  public A addAllToCapabilitiesDependencies(Collection<Dependencies> items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").add(builder);this.dependencies.add(builder);} return (A)this;
  }
  
  public A removeFromDependencies(org.apache.camel.v1.buildspec.tasks.package_.runtime.capabilities.Dependencies... items) {
    if (this.dependencies == null) return (A)this;
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").remove(builder); this.dependencies.remove(builder);} return (A)this;
  }
  
  public A removeAllFromCapabilitiesDependencies(Collection<Dependencies> items) {
    if (this.dependencies == null) return (A)this;
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").remove(builder); this.dependencies.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromCapabilitiesDependencies(Predicate<DependenciesBuilder> predicate) {
    if (dependencies == null) return (A) this;
    final Iterator<DependenciesBuilder> each = dependencies.iterator();
    final List visitables = _visitables.get("dependencies");
    while (each.hasNext()) {
      DependenciesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Dependencies> buildDependencies() {
    return this.dependencies != null ? build(dependencies) : null;
  }
  
  public Dependencies buildDependency(int index) {
    return this.dependencies.get(index).build();
  }
  
  public Dependencies buildFirstDependency() {
    return this.dependencies.get(0).build();
  }
  
  public Dependencies buildLastDependency() {
    return this.dependencies.get(dependencies.size() - 1).build();
  }
  
  public Dependencies buildMatchingDependency(Predicate<DependenciesBuilder> predicate) {
      for (DependenciesBuilder item : dependencies) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingDependency(Predicate<DependenciesBuilder> predicate) {
      for (DependenciesBuilder item : dependencies) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDependencies(List<Dependencies> dependencies) {
    if (this.dependencies != null) {
      this._visitables.get("dependencies").clear();
    }
    if (dependencies != null) {
        this.dependencies = new ArrayList();
        for (Dependencies item : dependencies) {
          this.addToDependencies(item);
        }
    } else {
      this.dependencies = null;
    }
    return (A) this;
  }
  
  public A withDependencies(org.apache.camel.v1.buildspec.tasks.package_.runtime.capabilities.Dependencies... dependencies) {
    if (this.dependencies != null) {
        this.dependencies.clear();
        _visitables.remove("dependencies");
    }
    if (dependencies != null) {
      for (Dependencies item : dependencies) {
        this.addToDependencies(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDependencies() {
    return this.dependencies != null && !this.dependencies.isEmpty();
  }
  
  public DependenciesNested<A> addNewDependency() {
    return new DependenciesNested(-1, null);
  }
  
  public DependenciesNested<A> addNewDependencyLike(Dependencies item) {
    return new DependenciesNested(-1, item);
  }
  
  public DependenciesNested<A> setNewDependencyLike(int index,Dependencies item) {
    return new DependenciesNested(index, item);
  }
  
  public DependenciesNested<A> editDependency(int index) {
    if (dependencies.size() <= index) throw new RuntimeException("Can't edit dependencies. Index exceeds size.");
    return setNewDependencyLike(index, buildDependency(index));
  }
  
  public DependenciesNested<A> editFirstDependency() {
    if (dependencies.size() == 0) throw new RuntimeException("Can't edit first dependencies. The list is empty.");
    return setNewDependencyLike(0, buildDependency(0));
  }
  
  public DependenciesNested<A> editLastDependency() {
    int index = dependencies.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last dependencies. The list is empty.");
    return setNewDependencyLike(index, buildDependency(index));
  }
  
  public DependenciesNested<A> editMatchingDependency(Predicate<DependenciesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<dependencies.size();i++) { 
    if (predicate.test(dependencies.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching dependencies. No match found.");
    return setNewDependencyLike(index, buildDependency(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CapabilitiesFluent that = (CapabilitiesFluent) o;
    if (!java.util.Objects.equals(dependencies, that.dependencies)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(dependencies,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (dependencies != null && !dependencies.isEmpty()) { sb.append("dependencies:"); sb.append(dependencies); }
    sb.append("}");
    return sb.toString();
  }
  public class DependenciesNested<N> extends DependenciesFluent<DependenciesNested<N>> implements Nested<N>{
    DependenciesNested(int index,Dependencies item) {
      this.index = index;
      this.builder = new DependenciesBuilder(this, item);
    }
    DependenciesBuilder builder;
    int index;
    
    public N and() {
      return (N) CapabilitiesFluent.this.setToDependencies(index,builder.build());
    }
    
    public N endCapabilitiesDependency() {
      return and();
    }
    
  
  }

}