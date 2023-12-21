package org.apache.camel.v1.integrationplatformstatus;

import org.apache.camel.v1.integrationplatformstatus.kamelet.Repositories;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.integrationplatformstatus.kamelet.RepositoriesBuilder;
import java.lang.String;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import org.apache.camel.v1.integrationplatformstatus.kamelet.RepositoriesFluent;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class KameletFluent<A extends KameletFluent<A>> extends BaseFluent<A>{
  public KameletFluent() {
  }
  
  public KameletFluent(Kamelet instance) {
    this.copyInstance(instance);
  }
  private ArrayList<RepositoriesBuilder> repositories;
  
  protected void copyInstance(Kamelet instance) {
    instance = (instance != null ? instance : new Kamelet());
    if (instance != null) {
          this.withRepositories(instance.getRepositories());
        }
  }
  
  public A addToRepositories(int index,Repositories item) {
    if (this.repositories == null) {this.repositories = new ArrayList<RepositoriesBuilder>();}
    RepositoriesBuilder builder = new RepositoriesBuilder(item);
    if (index < 0 || index >= repositories.size()) { _visitables.get("repositories").add(builder); repositories.add(builder); } else { _visitables.get("repositories").add(index, builder); repositories.add(index, builder);}
    return (A)this;
  }
  
  public A setToRepositories(int index,Repositories item) {
    if (this.repositories == null) {this.repositories = new ArrayList<RepositoriesBuilder>();}
    RepositoriesBuilder builder = new RepositoriesBuilder(item);
    if (index < 0 || index >= repositories.size()) { _visitables.get("repositories").add(builder); repositories.add(builder); } else { _visitables.get("repositories").set(index, builder); repositories.set(index, builder);}
    return (A)this;
  }
  
  public A addToRepositories(org.apache.camel.v1.integrationplatformstatus.kamelet.Repositories... items) {
    if (this.repositories == null) {this.repositories = new ArrayList<RepositoriesBuilder>();}
    for (Repositories item : items) {RepositoriesBuilder builder = new RepositoriesBuilder(item);_visitables.get("repositories").add(builder);this.repositories.add(builder);} return (A)this;
  }
  
  public A addAllToKameletRepositories(Collection<Repositories> items) {
    if (this.repositories == null) {this.repositories = new ArrayList<RepositoriesBuilder>();}
    for (Repositories item : items) {RepositoriesBuilder builder = new RepositoriesBuilder(item);_visitables.get("repositories").add(builder);this.repositories.add(builder);} return (A)this;
  }
  
  public A removeFromRepositories(org.apache.camel.v1.integrationplatformstatus.kamelet.Repositories... items) {
    if (this.repositories == null) return (A)this;
    for (Repositories item : items) {RepositoriesBuilder builder = new RepositoriesBuilder(item);_visitables.get("repositories").remove(builder); this.repositories.remove(builder);} return (A)this;
  }
  
  public A removeAllFromKameletRepositories(Collection<Repositories> items) {
    if (this.repositories == null) return (A)this;
    for (Repositories item : items) {RepositoriesBuilder builder = new RepositoriesBuilder(item);_visitables.get("repositories").remove(builder); this.repositories.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromKameletRepositories(Predicate<RepositoriesBuilder> predicate) {
    if (repositories == null) return (A) this;
    final Iterator<RepositoriesBuilder> each = repositories.iterator();
    final List visitables = _visitables.get("repositories");
    while (each.hasNext()) {
      RepositoriesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Repositories> buildRepositories() {
    return this.repositories != null ? build(repositories) : null;
  }
  
  public Repositories buildRepository(int index) {
    return this.repositories.get(index).build();
  }
  
  public Repositories buildFirstRepository() {
    return this.repositories.get(0).build();
  }
  
  public Repositories buildLastRepository() {
    return this.repositories.get(repositories.size() - 1).build();
  }
  
  public Repositories buildMatchingRepository(Predicate<RepositoriesBuilder> predicate) {
      for (RepositoriesBuilder item : repositories) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRepository(Predicate<RepositoriesBuilder> predicate) {
      for (RepositoriesBuilder item : repositories) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRepositories(List<Repositories> repositories) {
    if (this.repositories != null) {
      this._visitables.get("repositories").clear();
    }
    if (repositories != null) {
        this.repositories = new ArrayList();
        for (Repositories item : repositories) {
          this.addToRepositories(item);
        }
    } else {
      this.repositories = null;
    }
    return (A) this;
  }
  
  public A withRepositories(org.apache.camel.v1.integrationplatformstatus.kamelet.Repositories... repositories) {
    if (this.repositories != null) {
        this.repositories.clear();
        _visitables.remove("repositories");
    }
    if (repositories != null) {
      for (Repositories item : repositories) {
        this.addToRepositories(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRepositories() {
    return this.repositories != null && !this.repositories.isEmpty();
  }
  
  public RepositoriesNested<A> addNewRepository() {
    return new RepositoriesNested(-1, null);
  }
  
  public RepositoriesNested<A> addNewRepositoryLike(Repositories item) {
    return new RepositoriesNested(-1, item);
  }
  
  public RepositoriesNested<A> setNewRepositoryLike(int index,Repositories item) {
    return new RepositoriesNested(index, item);
  }
  
  public RepositoriesNested<A> editRepository(int index) {
    if (repositories.size() <= index) throw new RuntimeException("Can't edit repositories. Index exceeds size.");
    return setNewRepositoryLike(index, buildRepository(index));
  }
  
  public RepositoriesNested<A> editFirstRepository() {
    if (repositories.size() == 0) throw new RuntimeException("Can't edit first repositories. The list is empty.");
    return setNewRepositoryLike(0, buildRepository(0));
  }
  
  public RepositoriesNested<A> editLastRepository() {
    int index = repositories.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last repositories. The list is empty.");
    return setNewRepositoryLike(index, buildRepository(index));
  }
  
  public RepositoriesNested<A> editMatchingRepository(Predicate<RepositoriesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<repositories.size();i++) { 
    if (predicate.test(repositories.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching repositories. No match found.");
    return setNewRepositoryLike(index, buildRepository(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletFluent that = (KameletFluent) o;
    if (!java.util.Objects.equals(repositories, that.repositories)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(repositories,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (repositories != null && !repositories.isEmpty()) { sb.append("repositories:"); sb.append(repositories); }
    sb.append("}");
    return sb.toString();
  }
  public class RepositoriesNested<N> extends RepositoriesFluent<RepositoriesNested<N>> implements Nested<N>{
    RepositoriesNested(int index,Repositories item) {
      this.index = index;
      this.builder = new RepositoriesBuilder(this, item);
    }
    RepositoriesBuilder builder;
    int index;
    
    public N and() {
      return (N) KameletFluent.this.setToRepositories(index,builder.build());
    }
    
    public N endKameletRepository() {
      return and();
    }
    
  
  }

}