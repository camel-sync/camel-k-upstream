package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class AffinityBuilder extends AffinityFluent<AffinityBuilder> implements VisitableBuilder<Affinity,AffinityBuilder>{
  public AffinityBuilder() {
    this(new Affinity());
  }
  
  public AffinityBuilder(AffinityFluent<?> fluent) {
    this(fluent, new Affinity());
  }
  
  public AffinityBuilder(AffinityFluent<?> fluent,Affinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AffinityBuilder(Affinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AffinityFluent<?> fluent;
  
  public Affinity build() {
    Affinity buildable = new Affinity();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setNodeAffinityLabels(fluent.getNodeAffinityLabels());
    buildable.setPodAffinity(fluent.getPodAffinity());
    buildable.setPodAffinityLabels(fluent.getPodAffinityLabels());
    buildable.setPodAntiAffinity(fluent.getPodAntiAffinity());
    buildable.setPodAntiAffinityLabels(fluent.getPodAntiAffinityLabels());
    return buildable;
  }
  

}