package org.apache.camel.v1.buildspec.tasks.kaniko;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CacheBuilder extends CacheFluent<CacheBuilder> implements VisitableBuilder<Cache,CacheBuilder>{
  public CacheBuilder() {
    this(new Cache());
  }
  
  public CacheBuilder(CacheFluent<?> fluent) {
    this(fluent, new Cache());
  }
  
  public CacheBuilder(CacheFluent<?> fluent,Cache instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CacheBuilder(Cache instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CacheFluent<?> fluent;
  
  public Cache build() {
    Cache buildable = new Cache();
    buildable.setEnabled(fluent.getEnabled());
    buildable.setPersistentVolumeClaim(fluent.getPersistentVolumeClaim());
    return buildable;
  }
  

}