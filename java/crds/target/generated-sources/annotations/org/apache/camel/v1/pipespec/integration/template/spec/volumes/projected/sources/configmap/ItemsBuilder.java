package org.apache.camel.v1.pipespec.integration.template.spec.volumes.projected.sources.configmap;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ItemsBuilder extends ItemsFluent<ItemsBuilder> implements VisitableBuilder<Items,ItemsBuilder>{
  public ItemsBuilder() {
    this(new Items());
  }
  
  public ItemsBuilder(ItemsFluent<?> fluent) {
    this(fluent, new Items());
  }
  
  public ItemsBuilder(ItemsFluent<?> fluent,Items instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ItemsBuilder(Items instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ItemsFluent<?> fluent;
  
  public Items build() {
    Items buildable = new Items();
    buildable.setKey(fluent.getKey());
    buildable.setMode(fluent.getMode());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
  

}