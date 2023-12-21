package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class LivenessProbeBuilder extends LivenessProbeFluent<LivenessProbeBuilder> implements VisitableBuilder<LivenessProbe,LivenessProbeBuilder>{
  public LivenessProbeBuilder() {
    this(new LivenessProbe());
  }
  
  public LivenessProbeBuilder(LivenessProbeFluent<?> fluent) {
    this(fluent, new LivenessProbe());
  }
  
  public LivenessProbeBuilder(LivenessProbeFluent<?> fluent,LivenessProbe instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public LivenessProbeBuilder(LivenessProbe instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  LivenessProbeFluent<?> fluent;
  
  public LivenessProbe build() {
    LivenessProbe buildable = new LivenessProbe();
    buildable.setExec(fluent.buildExec());
    buildable.setFailureThreshold(fluent.getFailureThreshold());
    buildable.setGrpc(fluent.buildGrpc());
    buildable.setHttpGet(fluent.buildHttpGet());
    buildable.setInitialDelaySeconds(fluent.getInitialDelaySeconds());
    buildable.setPeriodSeconds(fluent.getPeriodSeconds());
    buildable.setSuccessThreshold(fluent.getSuccessThreshold());
    buildable.setTcpSocket(fluent.buildTcpSocket());
    buildable.setTerminationGracePeriodSeconds(fluent.getTerminationGracePeriodSeconds());
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    return buildable;
  }
  

}