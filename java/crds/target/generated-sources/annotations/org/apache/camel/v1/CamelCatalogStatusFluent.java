package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.camelcatalogstatus.ConditionsFluent;
import java.lang.String;
import org.apache.camel.v1.camelcatalogstatus.Conditions;
import java.util.function.Predicate;
import org.apache.camel.v1.camelcatalogstatus.ConditionsBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CamelCatalogStatusFluent<A extends CamelCatalogStatusFluent<A>> extends BaseFluent<A>{
  public CamelCatalogStatusFluent() {
  }
  
  public CamelCatalogStatusFluent(CamelCatalogStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<ConditionsBuilder> conditions;
  private String image;
  private Long observedGeneration;
  private String phase;
  
  protected void copyInstance(CamelCatalogStatus instance) {
    instance = (instance != null ? instance : new CamelCatalogStatus());
    if (instance != null) {
          this.withConditions(instance.getConditions());
          this.withImage(instance.getImage());
          this.withObservedGeneration(instance.getObservedGeneration());
          this.withPhase(instance.getPhase());
        }
  }
  
  public A addToConditions(int index,Conditions item) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    ConditionsBuilder builder = new ConditionsBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,Conditions item) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    ConditionsBuilder builder = new ConditionsBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(org.apache.camel.v1.camelcatalogstatus.Conditions... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToCamelcatalogstatusConditions(Collection<Conditions> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(org.apache.camel.v1.camelcatalogstatus.Conditions... items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromCamelcatalogstatusConditions(Collection<Conditions> items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromCamelcatalogstatusConditions(Predicate<ConditionsBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<ConditionsBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      ConditionsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Conditions> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public Conditions buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public Conditions buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public Conditions buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public Conditions buildMatchingCondition(Predicate<ConditionsBuilder> predicate) {
      for (ConditionsBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<ConditionsBuilder> predicate) {
      for (ConditionsBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<Conditions> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (Conditions item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(org.apache.camel.v1.camelcatalogstatus.Conditions... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (Conditions item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !this.conditions.isEmpty();
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(Conditions item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,Conditions item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<ConditionsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public String getImage() {
    return this.image;
  }
  
  public A withImage(String image) {
    this.image = image;
    return (A) this;
  }
  
  public boolean hasImage() {
    return this.image != null;
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  
  public boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  
  public String getPhase() {
    return this.phase;
  }
  
  public A withPhase(String phase) {
    this.phase = phase;
    return (A) this;
  }
  
  public boolean hasPhase() {
    return this.phase != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CamelCatalogStatusFluent that = (CamelCatalogStatusFluent) o;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(image, that.image)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    if (!java.util.Objects.equals(phase, that.phase)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(conditions,  image,  observedGeneration,  phase,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends ConditionsFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,Conditions item) {
      this.index = index;
      this.builder = new ConditionsBuilder(this, item);
    }
    ConditionsBuilder builder;
    int index;
    
    public N and() {
      return (N) CamelCatalogStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCamelcatalogstatusCondition() {
      return and();
    }
    
  
  }

}