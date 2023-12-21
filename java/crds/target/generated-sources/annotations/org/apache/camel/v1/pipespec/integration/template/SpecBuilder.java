package org.apache.camel.v1.pipespec.integration.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SpecBuilder extends SpecFluent<SpecBuilder> implements VisitableBuilder<Spec,SpecBuilder>{
  public SpecBuilder() {
    this(new Spec());
  }
  
  public SpecBuilder(SpecFluent<?> fluent) {
    this(fluent, new Spec());
  }
  
  public SpecBuilder(SpecFluent<?> fluent,Spec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SpecBuilder(Spec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SpecFluent<?> fluent;
  
  public Spec build() {
    Spec buildable = new Spec();
    buildable.setActiveDeadlineSeconds(fluent.getActiveDeadlineSeconds());
    buildable.setContainers(fluent.buildContainers());
    buildable.setDnsPolicy(fluent.getDnsPolicy());
    buildable.setEphemeralContainers(fluent.buildEphemeralContainers());
    buildable.setInitContainers(fluent.buildInitContainers());
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setRestartPolicy(fluent.getRestartPolicy());
    buildable.setSecurityContext(fluent.buildSecurityContext());
    buildable.setTerminationGracePeriodSeconds(fluent.getTerminationGracePeriodSeconds());
    buildable.setTopologySpreadConstraints(fluent.buildTopologySpreadConstraints());
    buildable.setVolumes(fluent.buildVolumes());
    return buildable;
  }
  

}