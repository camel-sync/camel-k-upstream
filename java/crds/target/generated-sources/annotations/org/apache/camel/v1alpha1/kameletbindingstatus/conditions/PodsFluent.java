package org.apache.camel.v1alpha1.kameletbindingstatus.conditions;

import org.apache.camel.v1alpha1.kameletbindingstatus.conditions.pods.Condition;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1alpha1.kameletbindingstatus.conditions.pods.Health;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingstatus.conditions.pods.ConditionFluent;
import java.util.function.Predicate;
import org.apache.camel.v1alpha1.kameletbindingstatus.conditions.pods.ConditionBuilder;
import org.apache.camel.v1alpha1.kameletbindingstatus.conditions.pods.HealthBuilder;
import org.apache.camel.v1alpha1.kameletbindingstatus.conditions.pods.HealthFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PodsFluent<A extends PodsFluent<A>> extends BaseFluent<A>{
  public PodsFluent() {
  }
  
  public PodsFluent(Pods instance) {
    this.copyInstance(instance);
  }
  private ConditionBuilder condition;
  private ArrayList<HealthBuilder> health;
  private String name;
  
  protected void copyInstance(Pods instance) {
    instance = (instance != null ? instance : new Pods());
    if (instance != null) {
          this.withCondition(instance.getCondition());
          this.withHealth(instance.getHealth());
          this.withName(instance.getName());
        }
  }
  
  public Condition buildCondition() {
    return this.condition != null ? this.condition.build() : null;
  }
  
  public A withCondition(Condition condition) {
    this._visitables.remove("condition");
    if (condition != null) {
        this.condition = new ConditionBuilder(condition);
        this._visitables.get("condition").add(this.condition);
    } else {
        this.condition = null;
        this._visitables.get("condition").remove(this.condition);
    }
    return (A) this;
  }
  
  public boolean hasCondition() {
    return this.condition != null;
  }
  
  public ConditionNested<A> withNewCondition() {
    return new ConditionNested(null);
  }
  
  public ConditionNested<A> withNewConditionLike(Condition item) {
    return new ConditionNested(item);
  }
  
  public ConditionNested<A> editCondition() {
    return withNewConditionLike(java.util.Optional.ofNullable(buildCondition()).orElse(null));
  }
  
  public ConditionNested<A> editOrNewCondition() {
    return withNewConditionLike(java.util.Optional.ofNullable(buildCondition()).orElse(new ConditionBuilder().build()));
  }
  
  public ConditionNested<A> editOrNewConditionLike(Condition item) {
    return withNewConditionLike(java.util.Optional.ofNullable(buildCondition()).orElse(item));
  }
  
  public A addToHealth(int index,Health item) {
    if (this.health == null) {this.health = new ArrayList<HealthBuilder>();}
    HealthBuilder builder = new HealthBuilder(item);
    if (index < 0 || index >= health.size()) { _visitables.get("health").add(builder); health.add(builder); } else { _visitables.get("health").add(index, builder); health.add(index, builder);}
    return (A)this;
  }
  
  public A setToHealth(int index,Health item) {
    if (this.health == null) {this.health = new ArrayList<HealthBuilder>();}
    HealthBuilder builder = new HealthBuilder(item);
    if (index < 0 || index >= health.size()) { _visitables.get("health").add(builder); health.add(builder); } else { _visitables.get("health").set(index, builder); health.set(index, builder);}
    return (A)this;
  }
  
  public A addToHealth(org.apache.camel.v1alpha1.kameletbindingstatus.conditions.pods.Health... items) {
    if (this.health == null) {this.health = new ArrayList<HealthBuilder>();}
    for (Health item : items) {HealthBuilder builder = new HealthBuilder(item);_visitables.get("health").add(builder);this.health.add(builder);} return (A)this;
  }
  
  public A addAllToPodsHealth(Collection<Health> items) {
    if (this.health == null) {this.health = new ArrayList<HealthBuilder>();}
    for (Health item : items) {HealthBuilder builder = new HealthBuilder(item);_visitables.get("health").add(builder);this.health.add(builder);} return (A)this;
  }
  
  public A removeFromHealth(org.apache.camel.v1alpha1.kameletbindingstatus.conditions.pods.Health... items) {
    if (this.health == null) return (A)this;
    for (Health item : items) {HealthBuilder builder = new HealthBuilder(item);_visitables.get("health").remove(builder); this.health.remove(builder);} return (A)this;
  }
  
  public A removeAllFromPodsHealth(Collection<Health> items) {
    if (this.health == null) return (A)this;
    for (Health item : items) {HealthBuilder builder = new HealthBuilder(item);_visitables.get("health").remove(builder); this.health.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromPodsHealth(Predicate<HealthBuilder> predicate) {
    if (health == null) return (A) this;
    final Iterator<HealthBuilder> each = health.iterator();
    final List visitables = _visitables.get("health");
    while (each.hasNext()) {
      HealthBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Health> buildHealth() {
    return this.health != null ? build(health) : null;
  }
  
  public Health buildHealth(int index) {
    return this.health.get(index).build();
  }
  
  public Health buildFirstHealth() {
    return this.health.get(0).build();
  }
  
  public Health buildLastHealth() {
    return this.health.get(health.size() - 1).build();
  }
  
  public Health buildMatchingHealth(Predicate<HealthBuilder> predicate) {
      for (HealthBuilder item : health) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingHealth(Predicate<HealthBuilder> predicate) {
      for (HealthBuilder item : health) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withHealth(List<Health> health) {
    if (this.health != null) {
      this._visitables.get("health").clear();
    }
    if (health != null) {
        this.health = new ArrayList();
        for (Health item : health) {
          this.addToHealth(item);
        }
    } else {
      this.health = null;
    }
    return (A) this;
  }
  
  public A withHealth(org.apache.camel.v1alpha1.kameletbindingstatus.conditions.pods.Health... health) {
    if (this.health != null) {
        this.health.clear();
        _visitables.remove("health");
    }
    if (health != null) {
      for (Health item : health) {
        this.addToHealth(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasHealth() {
    return this.health != null && !this.health.isEmpty();
  }
  
  public HealthNested<A> addNewHealth() {
    return new HealthNested(-1, null);
  }
  
  public HealthNested<A> addNewHealthLike(Health item) {
    return new HealthNested(-1, item);
  }
  
  public HealthNested<A> setNewHealthLike(int index,Health item) {
    return new HealthNested(index, item);
  }
  
  public HealthNested<A> editHealth(int index) {
    if (health.size() <= index) throw new RuntimeException("Can't edit health. Index exceeds size.");
    return setNewHealthLike(index, buildHealth(index));
  }
  
  public HealthNested<A> editFirstHealth() {
    if (health.size() == 0) throw new RuntimeException("Can't edit first health. The list is empty.");
    return setNewHealthLike(0, buildHealth(0));
  }
  
  public HealthNested<A> editLastHealth() {
    int index = health.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last health. The list is empty.");
    return setNewHealthLike(index, buildHealth(index));
  }
  
  public HealthNested<A> editMatchingHealth(Predicate<HealthBuilder> predicate) {
    int index = -1;
    for (int i=0;i<health.size();i++) { 
    if (predicate.test(health.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching health. No match found.");
    return setNewHealthLike(index, buildHealth(index));
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    PodsFluent that = (PodsFluent) o;
    if (!java.util.Objects.equals(condition, that.condition)) return false;
    if (!java.util.Objects.equals(health, that.health)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(condition,  health,  name,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (condition != null) { sb.append("condition:"); sb.append(condition + ","); }
    if (health != null && !health.isEmpty()) { sb.append("health:"); sb.append(health + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionNested<N> extends ConditionFluent<ConditionNested<N>> implements Nested<N>{
    ConditionNested(Condition item) {
      this.builder = new ConditionBuilder(this, item);
    }
    ConditionBuilder builder;
    
    public N and() {
      return (N) PodsFluent.this.withCondition(builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }
  public class HealthNested<N> extends HealthFluent<HealthNested<N>> implements Nested<N>{
    HealthNested(int index,Health item) {
      this.index = index;
      this.builder = new HealthBuilder(this, item);
    }
    HealthBuilder builder;
    int index;
    
    public N and() {
      return (N) PodsFluent.this.setToHealth(index,builder.build());
    }
    
    public N endPodsHealth() {
      return and();
    }
    
  
  }

}