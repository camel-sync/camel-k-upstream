package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.kameletstatus.PropertiesFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.kameletstatus.ConditionsFluent;
import java.lang.String;
import org.apache.camel.v1.kameletstatus.Properties;
import org.apache.camel.v1.kameletstatus.Conditions;
import org.apache.camel.v1.kameletstatus.PropertiesBuilder;
import java.util.function.Predicate;
import org.apache.camel.v1.kameletstatus.ConditionsBuilder;
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
public class KameletStatusFluent<A extends KameletStatusFluent<A>> extends BaseFluent<A>{
  public KameletStatusFluent() {
  }
  
  public KameletStatusFluent(KameletStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<ConditionsBuilder> conditions;
  private Long observedGeneration;
  private String phase;
  private ArrayList<PropertiesBuilder> properties;
  
  protected void copyInstance(KameletStatus instance) {
    instance = (instance != null ? instance : new KameletStatus());
    if (instance != null) {
          this.withConditions(instance.getConditions());
          this.withObservedGeneration(instance.getObservedGeneration());
          this.withPhase(instance.getPhase());
          this.withProperties(instance.getProperties());
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
  
  public A addToConditions(org.apache.camel.v1.kameletstatus.Conditions... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToKameletstatusConditions(Collection<Conditions> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(org.apache.camel.v1.kameletstatus.Conditions... items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromKameletstatusConditions(Collection<Conditions> items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromKameletstatusConditions(Predicate<ConditionsBuilder> predicate) {
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
  
  public A withConditions(org.apache.camel.v1.kameletstatus.Conditions... conditions) {
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
  
  public A addToProperties(int index,Properties item) {
    if (this.properties == null) {this.properties = new ArrayList<PropertiesBuilder>();}
    PropertiesBuilder builder = new PropertiesBuilder(item);
    if (index < 0 || index >= properties.size()) { _visitables.get("properties").add(builder); properties.add(builder); } else { _visitables.get("properties").add(index, builder); properties.add(index, builder);}
    return (A)this;
  }
  
  public A setToProperties(int index,Properties item) {
    if (this.properties == null) {this.properties = new ArrayList<PropertiesBuilder>();}
    PropertiesBuilder builder = new PropertiesBuilder(item);
    if (index < 0 || index >= properties.size()) { _visitables.get("properties").add(builder); properties.add(builder); } else { _visitables.get("properties").set(index, builder); properties.set(index, builder);}
    return (A)this;
  }
  
  public A addToProperties(org.apache.camel.v1.kameletstatus.Properties... items) {
    if (this.properties == null) {this.properties = new ArrayList<PropertiesBuilder>();}
    for (Properties item : items) {PropertiesBuilder builder = new PropertiesBuilder(item);_visitables.get("properties").add(builder);this.properties.add(builder);} return (A)this;
  }
  
  public A addAllToProperties(Collection<Properties> items) {
    if (this.properties == null) {this.properties = new ArrayList<PropertiesBuilder>();}
    for (Properties item : items) {PropertiesBuilder builder = new PropertiesBuilder(item);_visitables.get("properties").add(builder);this.properties.add(builder);} return (A)this;
  }
  
  public A removeFromProperties(org.apache.camel.v1.kameletstatus.Properties... items) {
    if (this.properties == null) return (A)this;
    for (Properties item : items) {PropertiesBuilder builder = new PropertiesBuilder(item);_visitables.get("properties").remove(builder); this.properties.remove(builder);} return (A)this;
  }
  
  public A removeAllFromProperties(Collection<Properties> items) {
    if (this.properties == null) return (A)this;
    for (Properties item : items) {PropertiesBuilder builder = new PropertiesBuilder(item);_visitables.get("properties").remove(builder); this.properties.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromProperties(Predicate<PropertiesBuilder> predicate) {
    if (properties == null) return (A) this;
    final Iterator<PropertiesBuilder> each = properties.iterator();
    final List visitables = _visitables.get("properties");
    while (each.hasNext()) {
      PropertiesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Properties> buildProperties() {
    return this.properties != null ? build(properties) : null;
  }
  
  public Properties buildProperty(int index) {
    return this.properties.get(index).build();
  }
  
  public Properties buildFirstProperty() {
    return this.properties.get(0).build();
  }
  
  public Properties buildLastProperty() {
    return this.properties.get(properties.size() - 1).build();
  }
  
  public Properties buildMatchingProperty(Predicate<PropertiesBuilder> predicate) {
      for (PropertiesBuilder item : properties) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingProperty(Predicate<PropertiesBuilder> predicate) {
      for (PropertiesBuilder item : properties) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withProperties(List<Properties> properties) {
    if (this.properties != null) {
      this._visitables.get("properties").clear();
    }
    if (properties != null) {
        this.properties = new ArrayList();
        for (Properties item : properties) {
          this.addToProperties(item);
        }
    } else {
      this.properties = null;
    }
    return (A) this;
  }
  
  public A withProperties(org.apache.camel.v1.kameletstatus.Properties... properties) {
    if (this.properties != null) {
        this.properties.clear();
        _visitables.remove("properties");
    }
    if (properties != null) {
      for (Properties item : properties) {
        this.addToProperties(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasProperties() {
    return this.properties != null && !this.properties.isEmpty();
  }
  
  public PropertiesNested<A> addNewProperty() {
    return new PropertiesNested(-1, null);
  }
  
  public PropertiesNested<A> addNewPropertyLike(Properties item) {
    return new PropertiesNested(-1, item);
  }
  
  public PropertiesNested<A> setNewPropertyLike(int index,Properties item) {
    return new PropertiesNested(index, item);
  }
  
  public PropertiesNested<A> editProperty(int index) {
    if (properties.size() <= index) throw new RuntimeException("Can't edit properties. Index exceeds size.");
    return setNewPropertyLike(index, buildProperty(index));
  }
  
  public PropertiesNested<A> editFirstProperty() {
    if (properties.size() == 0) throw new RuntimeException("Can't edit first properties. The list is empty.");
    return setNewPropertyLike(0, buildProperty(0));
  }
  
  public PropertiesNested<A> editLastProperty() {
    int index = properties.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last properties. The list is empty.");
    return setNewPropertyLike(index, buildProperty(index));
  }
  
  public PropertiesNested<A> editMatchingProperty(Predicate<PropertiesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<properties.size();i++) { 
    if (predicate.test(properties.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching properties. No match found.");
    return setNewPropertyLike(index, buildProperty(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletStatusFluent that = (KameletStatusFluent) o;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    if (!java.util.Objects.equals(phase, that.phase)) return false;
    if (!java.util.Objects.equals(properties, that.properties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(conditions,  observedGeneration,  phase,  properties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase + ","); }
    if (properties != null && !properties.isEmpty()) { sb.append("properties:"); sb.append(properties); }
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
      return (N) KameletStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endKameletstatusCondition() {
      return and();
    }
    
  
  }
  public class PropertiesNested<N> extends PropertiesFluent<PropertiesNested<N>> implements Nested<N>{
    PropertiesNested(int index,Properties item) {
      this.index = index;
      this.builder = new PropertiesBuilder(this, item);
    }
    PropertiesBuilder builder;
    int index;
    
    public N and() {
      return (N) KameletStatusFluent.this.setToProperties(index,builder.build());
    }
    
    public N endProperty() {
      return and();
    }
    
  
  }

}