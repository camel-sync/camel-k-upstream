package org.apache.camel.v1.integrationstatus;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.integrationstatus.conditions.PodsBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.integrationstatus.conditions.Pods;
import java.lang.String;
import java.util.function.Predicate;
import java.time.ZonedDateTime;
import org.apache.camel.v1.integrationstatus.conditions.PodsFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ConditionsFluent<A extends ConditionsFluent<A>> extends BaseFluent<A>{
  public ConditionsFluent() {
  }
  
  public ConditionsFluent(Conditions instance) {
    this.copyInstance(instance);
  }
  private ZonedDateTime firstTruthyTime;
  private ZonedDateTime lastTransitionTime;
  private ZonedDateTime lastUpdateTime;
  private String message;
  private ArrayList<PodsBuilder> pods;
  private String reason;
  private String status;
  private String type;
  
  protected void copyInstance(Conditions instance) {
    instance = (instance != null ? instance : new Conditions());
    if (instance != null) {
          this.withFirstTruthyTime(instance.getFirstTruthyTime());
          this.withLastTransitionTime(instance.getLastTransitionTime());
          this.withLastUpdateTime(instance.getLastUpdateTime());
          this.withMessage(instance.getMessage());
          this.withPods(instance.getPods());
          this.withReason(instance.getReason());
          this.withStatus(instance.getStatus());
          this.withType(instance.getType());
        }
  }
  
  public ZonedDateTime getFirstTruthyTime() {
    return this.firstTruthyTime;
  }
  
  public A withFirstTruthyTime(ZonedDateTime firstTruthyTime) {
    this.firstTruthyTime = firstTruthyTime;
    return (A) this;
  }
  
  public boolean hasFirstTruthyTime() {
    return this.firstTruthyTime != null;
  }
  
  public ZonedDateTime getLastTransitionTime() {
    return this.lastTransitionTime;
  }
  
  public A withLastTransitionTime(ZonedDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return (A) this;
  }
  
  public boolean hasLastTransitionTime() {
    return this.lastTransitionTime != null;
  }
  
  public ZonedDateTime getLastUpdateTime() {
    return this.lastUpdateTime;
  }
  
  public A withLastUpdateTime(ZonedDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return (A) this;
  }
  
  public boolean hasLastUpdateTime() {
    return this.lastUpdateTime != null;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public A addToPods(int index,Pods item) {
    if (this.pods == null) {this.pods = new ArrayList<PodsBuilder>();}
    PodsBuilder builder = new PodsBuilder(item);
    if (index < 0 || index >= pods.size()) { _visitables.get("pods").add(builder); pods.add(builder); } else { _visitables.get("pods").add(index, builder); pods.add(index, builder);}
    return (A)this;
  }
  
  public A setToPods(int index,Pods item) {
    if (this.pods == null) {this.pods = new ArrayList<PodsBuilder>();}
    PodsBuilder builder = new PodsBuilder(item);
    if (index < 0 || index >= pods.size()) { _visitables.get("pods").add(builder); pods.add(builder); } else { _visitables.get("pods").set(index, builder); pods.set(index, builder);}
    return (A)this;
  }
  
  public A addToPods(org.apache.camel.v1.integrationstatus.conditions.Pods... items) {
    if (this.pods == null) {this.pods = new ArrayList<PodsBuilder>();}
    for (Pods item : items) {PodsBuilder builder = new PodsBuilder(item);_visitables.get("pods").add(builder);this.pods.add(builder);} return (A)this;
  }
  
  public A addAllToPods(Collection<Pods> items) {
    if (this.pods == null) {this.pods = new ArrayList<PodsBuilder>();}
    for (Pods item : items) {PodsBuilder builder = new PodsBuilder(item);_visitables.get("pods").add(builder);this.pods.add(builder);} return (A)this;
  }
  
  public A removeFromPods(org.apache.camel.v1.integrationstatus.conditions.Pods... items) {
    if (this.pods == null) return (A)this;
    for (Pods item : items) {PodsBuilder builder = new PodsBuilder(item);_visitables.get("pods").remove(builder); this.pods.remove(builder);} return (A)this;
  }
  
  public A removeAllFromPods(Collection<Pods> items) {
    if (this.pods == null) return (A)this;
    for (Pods item : items) {PodsBuilder builder = new PodsBuilder(item);_visitables.get("pods").remove(builder); this.pods.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromPods(Predicate<PodsBuilder> predicate) {
    if (pods == null) return (A) this;
    final Iterator<PodsBuilder> each = pods.iterator();
    final List visitables = _visitables.get("pods");
    while (each.hasNext()) {
      PodsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Pods> buildPods() {
    return this.pods != null ? build(pods) : null;
  }
  
  public Pods buildPod(int index) {
    return this.pods.get(index).build();
  }
  
  public Pods buildFirstPod() {
    return this.pods.get(0).build();
  }
  
  public Pods buildLastPod() {
    return this.pods.get(pods.size() - 1).build();
  }
  
  public Pods buildMatchingPod(Predicate<PodsBuilder> predicate) {
      for (PodsBuilder item : pods) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPod(Predicate<PodsBuilder> predicate) {
      for (PodsBuilder item : pods) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPods(List<Pods> pods) {
    if (this.pods != null) {
      this._visitables.get("pods").clear();
    }
    if (pods != null) {
        this.pods = new ArrayList();
        for (Pods item : pods) {
          this.addToPods(item);
        }
    } else {
      this.pods = null;
    }
    return (A) this;
  }
  
  public A withPods(org.apache.camel.v1.integrationstatus.conditions.Pods... pods) {
    if (this.pods != null) {
        this.pods.clear();
        _visitables.remove("pods");
    }
    if (pods != null) {
      for (Pods item : pods) {
        this.addToPods(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPods() {
    return this.pods != null && !this.pods.isEmpty();
  }
  
  public PodsNested<A> addNewPod() {
    return new PodsNested(-1, null);
  }
  
  public PodsNested<A> addNewPodLike(Pods item) {
    return new PodsNested(-1, item);
  }
  
  public PodsNested<A> setNewPodLike(int index,Pods item) {
    return new PodsNested(index, item);
  }
  
  public PodsNested<A> editPod(int index) {
    if (pods.size() <= index) throw new RuntimeException("Can't edit pods. Index exceeds size.");
    return setNewPodLike(index, buildPod(index));
  }
  
  public PodsNested<A> editFirstPod() {
    if (pods.size() == 0) throw new RuntimeException("Can't edit first pods. The list is empty.");
    return setNewPodLike(0, buildPod(0));
  }
  
  public PodsNested<A> editLastPod() {
    int index = pods.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last pods. The list is empty.");
    return setNewPodLike(index, buildPod(index));
  }
  
  public PodsNested<A> editMatchingPod(Predicate<PodsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<pods.size();i++) { 
    if (predicate.test(pods.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching pods. No match found.");
    return setNewPodLike(index, buildPod(index));
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public A withStatus(String status) {
    this.status = status;
    return (A) this;
  }
  
  public boolean hasStatus() {
    return this.status != null;
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
    ConditionsFluent that = (ConditionsFluent) o;
    if (!java.util.Objects.equals(firstTruthyTime, that.firstTruthyTime)) return false;
    if (!java.util.Objects.equals(lastTransitionTime, that.lastTransitionTime)) return false;
    if (!java.util.Objects.equals(lastUpdateTime, that.lastUpdateTime)) return false;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(pods, that.pods)) return false;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    if (!java.util.Objects.equals(status, that.status)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(firstTruthyTime,  lastTransitionTime,  lastUpdateTime,  message,  pods,  reason,  status,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (firstTruthyTime != null) { sb.append("firstTruthyTime:"); sb.append(firstTruthyTime + ","); }
    if (lastTransitionTime != null) { sb.append("lastTransitionTime:"); sb.append(lastTransitionTime + ","); }
    if (lastUpdateTime != null) { sb.append("lastUpdateTime:"); sb.append(lastUpdateTime + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (pods != null && !pods.isEmpty()) { sb.append("pods:"); sb.append(pods + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (status != null) { sb.append("status:"); sb.append(status + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  public class PodsNested<N> extends PodsFluent<PodsNested<N>> implements Nested<N>{
    PodsNested(int index,Pods item) {
      this.index = index;
      this.builder = new PodsBuilder(this, item);
    }
    PodsBuilder builder;
    int index;
    
    public N and() {
      return (N) ConditionsFluent.this.setToPods(index,builder.build());
    }
    
    public N endPod() {
      return and();
    }
    
  
  }

}