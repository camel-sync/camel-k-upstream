package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ContainersBuilder extends ContainersFluent<ContainersBuilder> implements VisitableBuilder<Containers,ContainersBuilder>{
  public ContainersBuilder() {
    this(new Containers());
  }
  
  public ContainersBuilder(ContainersFluent<?> fluent) {
    this(fluent, new Containers());
  }
  
  public ContainersBuilder(ContainersFluent<?> fluent,Containers instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ContainersBuilder(Containers instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ContainersFluent<?> fluent;
  
  public Containers build() {
    Containers buildable = new Containers();
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