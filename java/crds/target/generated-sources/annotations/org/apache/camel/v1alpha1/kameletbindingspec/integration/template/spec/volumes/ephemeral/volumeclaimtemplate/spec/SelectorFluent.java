package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressionsBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressions;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressionsFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SelectorFluent<A extends SelectorFluent<A>> extends BaseFluent<A>{
  public SelectorFluent() {
  }
  
  public SelectorFluent(Selector instance) {
    this.copyInstance(instance);
  }
  private ArrayList<MatchExpressionsBuilder> matchExpressions;
  private Map<String,String> matchLabels;
  
  protected void copyInstance(Selector instance) {
    instance = (instance != null ? instance : new Selector());
    if (instance != null) {
          this.withMatchExpressions(instance.getMatchExpressions());
          this.withMatchLabels(instance.getMatchLabels());
        }
  }
  
  public A addToMatchExpressions(int index,MatchExpressions item) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<MatchExpressionsBuilder>();}
    MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);
    if (index < 0 || index >= matchExpressions.size()) { _visitables.get("matchExpressions").add(builder); matchExpressions.add(builder); } else { _visitables.get("matchExpressions").add(index, builder); matchExpressions.add(index, builder);}
    return (A)this;
  }
  
  public A setToMatchExpressions(int index,MatchExpressions item) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<MatchExpressionsBuilder>();}
    MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);
    if (index < 0 || index >= matchExpressions.size()) { _visitables.get("matchExpressions").add(builder); matchExpressions.add(builder); } else { _visitables.get("matchExpressions").set(index, builder); matchExpressions.set(index, builder);}
    return (A)this;
  }
  
  public A addToMatchExpressions(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressions... items) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<MatchExpressionsBuilder>();}
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
  }
  
  public A addAllToSelectorMatchExpressions(Collection<MatchExpressions> items) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<MatchExpressionsBuilder>();}
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
  }
  
  public A removeFromMatchExpressions(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressions... items) {
    if (this.matchExpressions == null) return (A)this;
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").remove(builder); this.matchExpressions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSelectorMatchExpressions(Collection<MatchExpressions> items) {
    if (this.matchExpressions == null) return (A)this;
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").remove(builder); this.matchExpressions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSelectorMatchExpressions(Predicate<MatchExpressionsBuilder> predicate) {
    if (matchExpressions == null) return (A) this;
    final Iterator<MatchExpressionsBuilder> each = matchExpressions.iterator();
    final List visitables = _visitables.get("matchExpressions");
    while (each.hasNext()) {
      MatchExpressionsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<MatchExpressions> buildMatchExpressions() {
    return this.matchExpressions != null ? build(matchExpressions) : null;
  }
  
  public MatchExpressions buildMatchExpression(int index) {
    return this.matchExpressions.get(index).build();
  }
  
  public MatchExpressions buildFirstMatchExpression() {
    return this.matchExpressions.get(0).build();
  }
  
  public MatchExpressions buildLastMatchExpression() {
    return this.matchExpressions.get(matchExpressions.size() - 1).build();
  }
  
  public MatchExpressions buildMatchingMatchExpression(Predicate<MatchExpressionsBuilder> predicate) {
      for (MatchExpressionsBuilder item : matchExpressions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingMatchExpression(Predicate<MatchExpressionsBuilder> predicate) {
      for (MatchExpressionsBuilder item : matchExpressions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMatchExpressions(List<MatchExpressions> matchExpressions) {
    if (this.matchExpressions != null) {
      this._visitables.get("matchExpressions").clear();
    }
    if (matchExpressions != null) {
        this.matchExpressions = new ArrayList();
        for (MatchExpressions item : matchExpressions) {
          this.addToMatchExpressions(item);
        }
    } else {
      this.matchExpressions = null;
    }
    return (A) this;
  }
  
  public A withMatchExpressions(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.selector.MatchExpressions... matchExpressions) {
    if (this.matchExpressions != null) {
        this.matchExpressions.clear();
        _visitables.remove("matchExpressions");
    }
    if (matchExpressions != null) {
      for (MatchExpressions item : matchExpressions) {
        this.addToMatchExpressions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMatchExpressions() {
    return this.matchExpressions != null && !this.matchExpressions.isEmpty();
  }
  
  public MatchExpressionsNested<A> addNewMatchExpression() {
    return new MatchExpressionsNested(-1, null);
  }
  
  public MatchExpressionsNested<A> addNewMatchExpressionLike(MatchExpressions item) {
    return new MatchExpressionsNested(-1, item);
  }
  
  public MatchExpressionsNested<A> setNewMatchExpressionLike(int index,MatchExpressions item) {
    return new MatchExpressionsNested(index, item);
  }
  
  public MatchExpressionsNested<A> editMatchExpression(int index) {
    if (matchExpressions.size() <= index) throw new RuntimeException("Can't edit matchExpressions. Index exceeds size.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  
  public MatchExpressionsNested<A> editFirstMatchExpression() {
    if (matchExpressions.size() == 0) throw new RuntimeException("Can't edit first matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(0, buildMatchExpression(0));
  }
  
  public MatchExpressionsNested<A> editLastMatchExpression() {
    int index = matchExpressions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  
  public MatchExpressionsNested<A> editMatchingMatchExpression(Predicate<MatchExpressionsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<matchExpressions.size();i++) { 
    if (predicate.test(matchExpressions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching matchExpressions. No match found.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  
  public A addToMatchLabels(String key,String value) {
    if(this.matchLabels == null && key != null && value != null) { this.matchLabels = new LinkedHashMap(); }
    if(key != null && value != null) {this.matchLabels.put(key, value);} return (A)this;
  }
  
  public A addToMatchLabels(Map<String,String> map) {
    if(this.matchLabels == null && map != null) { this.matchLabels = new LinkedHashMap(); }
    if(map != null) { this.matchLabels.putAll(map);} return (A)this;
  }
  
  public A removeFromMatchLabels(String key) {
    if(this.matchLabels == null) { return (A) this; }
    if(key != null && this.matchLabels != null) {this.matchLabels.remove(key);} return (A)this;
  }
  
  public A removeFromMatchLabels(Map<String,String> map) {
    if(this.matchLabels == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.matchLabels != null){this.matchLabels.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getMatchLabels() {
    return this.matchLabels;
  }
  
  public <K,V>A withMatchLabels(Map<String,String> matchLabels) {
    if (matchLabels == null) {
      this.matchLabels = null;
    } else {
      this.matchLabels = new LinkedHashMap(matchLabels);
    }
    return (A) this;
  }
  
  public boolean hasMatchLabels() {
    return this.matchLabels != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    SelectorFluent that = (SelectorFluent) o;
    if (!java.util.Objects.equals(matchExpressions, that.matchExpressions)) return false;
    if (!java.util.Objects.equals(matchLabels, that.matchLabels)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(matchExpressions,  matchLabels,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (matchExpressions != null && !matchExpressions.isEmpty()) { sb.append("matchExpressions:"); sb.append(matchExpressions + ","); }
    if (matchLabels != null && !matchLabels.isEmpty()) { sb.append("matchLabels:"); sb.append(matchLabels); }
    sb.append("}");
    return sb.toString();
  }
  public class MatchExpressionsNested<N> extends MatchExpressionsFluent<MatchExpressionsNested<N>> implements Nested<N>{
    MatchExpressionsNested(int index,MatchExpressions item) {
      this.index = index;
      this.builder = new MatchExpressionsBuilder(this, item);
    }
    MatchExpressionsBuilder builder;
    int index;
    
    public N and() {
      return (N) SelectorFluent.this.setToMatchExpressions(index,builder.build());
    }
    
    public N endSelectorMatchExpression() {
      return and();
    }
    
  
  }

}