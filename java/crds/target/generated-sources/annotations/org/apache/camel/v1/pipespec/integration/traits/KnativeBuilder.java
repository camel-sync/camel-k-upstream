package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KnativeBuilder extends KnativeFluent<KnativeBuilder> implements VisitableBuilder<Knative,KnativeBuilder>{
  public KnativeBuilder() {
    this(new Knative());
  }
  
  public KnativeBuilder(KnativeFluent<?> fluent) {
    this(fluent, new Knative());
  }
  
  public KnativeBuilder(KnativeFluent<?> fluent,Knative instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KnativeBuilder(Knative instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KnativeFluent<?> fluent;
  
  public Knative build() {
    Knative buildable = new Knative();
    buildable.setAuto(fluent.getAuto());
    buildable.setChannelSinks(fluent.getChannelSinks());
    buildable.setChannelSources(fluent.getChannelSources());
    buildable.setConfig(fluent.getConfig());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setEndpointSinks(fluent.getEndpointSinks());
    buildable.setEndpointSources(fluent.getEndpointSources());
    buildable.setEventSinks(fluent.getEventSinks());
    buildable.setEventSources(fluent.getEventSources());
    buildable.setFilterSourceChannels(fluent.getFilterSourceChannels());
    buildable.setNamespaceLabel(fluent.getNamespaceLabel());
    buildable.setSinkBinding(fluent.getSinkBinding());
    return buildable;
  }
  

}