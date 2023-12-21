package org.apache.camel.v1.integrationspec.template.spec.initcontainers;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class StartupProbeBuilder extends StartupProbeFluent<StartupProbeBuilder> implements VisitableBuilder<StartupProbe,StartupProbeBuilder>{
  public StartupProbeBuilder() {
    this(new StartupProbe());
  }
  
  public StartupProbeBuilder(StartupProbeFluent<?> fluent) {
    this(fluent, new StartupProbe());
  }
  
  public StartupProbeBuilder(StartupProbeFluent<?> fluent,StartupProbe instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public StartupProbeBuilder(StartupProbe instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  StartupProbeFluent<?> fluent;
  
  public StartupProbe build() {
    StartupProbe buildable = new StartupProbe();
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