package org.apache.camel.v1.integrationkitspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TraitsBuilder extends TraitsFluent<TraitsBuilder> implements VisitableBuilder<Traits,TraitsBuilder>{
  public TraitsBuilder() {
    this(new Traits());
  }
  
  public TraitsBuilder(TraitsFluent<?> fluent) {
    this(fluent, new Traits());
  }
  
  public TraitsBuilder(TraitsFluent<?> fluent,Traits instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TraitsBuilder(Traits instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TraitsFluent<?> fluent;
  
  public Traits build() {
    Traits buildable = new Traits();
    buildable.setAddons(fluent.getAddons());
    buildable.setBuilder(fluent.buildBuilder());
    buildable.setCamel(fluent.buildCamel());
    buildable.setQuarkus(fluent.buildQuarkus());
    buildable.setRegistry(fluent.buildRegistry());
    return buildable;
  }
  

}