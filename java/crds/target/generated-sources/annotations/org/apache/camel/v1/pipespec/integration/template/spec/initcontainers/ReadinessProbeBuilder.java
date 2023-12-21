package org.apache.camel.v1.pipespec.integration.template.spec.initcontainers;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ReadinessProbeBuilder extends ReadinessProbeFluent<ReadinessProbeBuilder> implements VisitableBuilder<ReadinessProbe,ReadinessProbeBuilder>{
  public ReadinessProbeBuilder() {
    this(new ReadinessProbe());
  }
  
  public ReadinessProbeBuilder(ReadinessProbeFluent<?> fluent) {
    this(fluent, new ReadinessProbe());
  }
  
  public ReadinessProbeBuilder(ReadinessProbeFluent<?> fluent,ReadinessProbe instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ReadinessProbeBuilder(ReadinessProbe instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ReadinessProbeFluent<?> fluent;
  
  public ReadinessProbe build() {
    ReadinessProbe buildable = new ReadinessProbe();
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