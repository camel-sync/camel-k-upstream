package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.secret.ItemsBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.secret.Items;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.secret.ItemsFluent;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SecretFluent<A extends SecretFluent<A>> extends BaseFluent<A>{
  public SecretFluent() {
  }
  
  public SecretFluent(Secret instance) {
    this.copyInstance(instance);
  }
  private ArrayList<ItemsBuilder> items;
  private String name;
  private Boolean optional;
  
  protected void copyInstance(Secret instance) {
    instance = (instance != null ? instance : new Secret());
    if (instance != null) {
          this.withItems(instance.getItems());
          this.withName(instance.getName());
          this.withOptional(instance.getOptional());
        }
  }
  
  public A addToItems(int index,Items item) {
    if (this.items == null) {this.items = new ArrayList<ItemsBuilder>();}
    ItemsBuilder builder = new ItemsBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").add(index, builder); items.add(index, builder);}
    return (A)this;
  }
  
  public A setToItems(int index,Items item) {
    if (this.items == null) {this.items = new ArrayList<ItemsBuilder>();}
    ItemsBuilder builder = new ItemsBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").set(index, builder); items.set(index, builder);}
    return (A)this;
  }
  
  public A addToItems(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.secret.Items... items) {
    if (this.items == null) {this.items = new ArrayList<ItemsBuilder>();}
    for (Items item : items) {ItemsBuilder builder = new ItemsBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  
  public A addAllToSecretItems(Collection<Items> items) {
    if (this.items == null) {this.items = new ArrayList<ItemsBuilder>();}
    for (Items item : items) {ItemsBuilder builder = new ItemsBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  
  public A removeFromItems(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.secret.Items... items) {
    if (this.items == null) return (A)this;
    for (Items item : items) {ItemsBuilder builder = new ItemsBuilder(item);_visitables.get("items").remove(builder); this.items.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSecretItems(Collection<Items> items) {
    if (this.items == null) return (A)this;
    for (Items item : items) {ItemsBuilder builder = new ItemsBuilder(item);_visitables.get("items").remove(builder); this.items.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSecretItems(Predicate<ItemsBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<ItemsBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      ItemsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Items> buildItems() {
    return this.items != null ? build(items) : null;
  }
  
  public Items buildItem(int index) {
    return this.items.get(index).build();
  }
  
  public Items buildFirstItem() {
    return this.items.get(0).build();
  }
  
  public Items buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  
  public Items buildMatchingItem(Predicate<ItemsBuilder> predicate) {
      for (ItemsBuilder item : items) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingItem(Predicate<ItemsBuilder> predicate) {
      for (ItemsBuilder item : items) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withItems(List<Items> items) {
    if (this.items != null) {
      this._visitables.get("items").clear();
    }
    if (items != null) {
        this.items = new ArrayList();
        for (Items item : items) {
          this.addToItems(item);
        }
    } else {
      this.items = null;
    }
    return (A) this;
  }
  
  public A withItems(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.projected.sources.secret.Items... items) {
    if (this.items != null) {
        this.items.clear();
        _visitables.remove("items");
    }
    if (items != null) {
      for (Items item : items) {
        this.addToItems(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasItems() {
    return this.items != null && !this.items.isEmpty();
  }
  
  public ItemsNested<A> addNewItem() {
    return new ItemsNested(-1, null);
  }
  
  public ItemsNested<A> addNewItemLike(Items item) {
    return new ItemsNested(-1, item);
  }
  
  public ItemsNested<A> setNewItemLike(int index,Items item) {
    return new ItemsNested(index, item);
  }
  
  public ItemsNested<A> editItem(int index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }
  
  public ItemsNested<A> editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }
  
  public ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }
  
  public ItemsNested<A> editMatchingItem(Predicate<ItemsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<items.size();i++) { 
    if (predicate.test(items.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
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
  
  public Boolean getOptional() {
    return this.optional;
  }
  
  public A withOptional(Boolean optional) {
    this.optional = optional;
    return (A) this;
  }
  
  public boolean hasOptional() {
    return this.optional != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    SecretFluent that = (SecretFluent) o;
    if (!java.util.Objects.equals(items, that.items)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(optional, that.optional)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(items,  name,  optional,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (items != null && !items.isEmpty()) { sb.append("items:"); sb.append(items + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (optional != null) { sb.append("optional:"); sb.append(optional); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withOptional() {
    return withOptional(true);
  }
  public class ItemsNested<N> extends ItemsFluent<ItemsNested<N>> implements Nested<N>{
    ItemsNested(int index,Items item) {
      this.index = index;
      this.builder = new ItemsBuilder(this, item);
    }
    ItemsBuilder builder;
    int index;
    
    public N and() {
      return (N) SecretFluent.this.setToItems(index,builder.build());
    }
    
    public N endSecretItem() {
      return and();
    }
    
  
  }

}