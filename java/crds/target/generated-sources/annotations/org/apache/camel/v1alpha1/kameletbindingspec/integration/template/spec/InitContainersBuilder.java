package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class InitContainersBuilder extends InitContainersFluent<InitContainersBuilder> implements VisitableBuilder<InitContainers,InitContainersBuilder>{
  public InitContainersBuilder() {
    this(new InitContainers());
  }
  
  public InitContainersBuilder(InitContainersFluent<?> fluent) {
    this(fluent, new InitContainers());
  }
  
  public InitContainersBuilder(InitContainersFluent<?> fluent,InitContainers instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public InitContainersBuilder(InitContainers instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  InitContainersFluent<?> fluent;
  
  public InitContainers build() {
    InitContainers buildable = new InitContainers();
    buildable.setArgs(fluent.getArgs());
    buildable.setCommand(fluent.getCommand());
    buildable.setEnv(fluent.buildEnv());
    buildable.setEnvFrom(fluent.buildEnvFrom());
    buildable.setImage(fluent.getImage());
    buildable.setImagePullPolicy(fluent.getImagePullPolicy());
    buildable.setLifecycle(fluent.buildLifecycle());
    buildable.setLivenessProbe(fluent.buildLivenessProbe());
    buildable.setName(fluent.getName());
    buildable.setPorts(fluent.buildPorts());
    buildable.setReadinessProbe(fluent.buildReadinessProbe());
    buildable.setResizePolicy(fluent.buildResizePolicy());
    buildable.setResources(fluent.buildResources());
    buildable.setSecurityContext(fluent.buildSecurityContext());
    buildable.setStartupProbe(fluent.buildStartupProbe());
    buildable.setStdin(fluent.getStdin());
    buildable.setStdinOnce(fluent.getStdinOnce());
    buildable.setTerminationMessagePath(fluent.getTerminationMessagePath());
    buildable.setTerminationMessagePolicy(fluent.getTerminationMessagePolicy());
    buildable.setTty(fluent.getTty());
    buildable.setVolumeDevices(fluent.buildVolumeDevices());
    buildable.setVolumeMounts(fluent.buildVolumeMounts());
    buildable.setWorkingDir(fluent.getWorkingDir());
    return buildable;
  }
  

}