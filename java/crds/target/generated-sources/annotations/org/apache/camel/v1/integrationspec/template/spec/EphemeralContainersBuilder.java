package org.apache.camel.v1.integrationspec.template.spec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class EphemeralContainersBuilder extends EphemeralContainersFluent<EphemeralContainersBuilder> implements VisitableBuilder<EphemeralContainers,EphemeralContainersBuilder>{
  public EphemeralContainersBuilder() {
    this(new EphemeralContainers());
  }
  
  public EphemeralContainersBuilder(EphemeralContainersFluent<?> fluent) {
    this(fluent, new EphemeralContainers());
  }
  
  public EphemeralContainersBuilder(EphemeralContainersFluent<?> fluent,EphemeralContainers instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public EphemeralContainersBuilder(EphemeralContainers instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  EphemeralContainersFluent<?> fluent;
  
  public EphemeralContainers build() {
    EphemeralContainers buildable = new EphemeralContainers();
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
    buildable.setTargetContainerName(fluent.getTargetContainerName());
    buildable.setTerminationMessagePath(fluent.getTerminationMessagePath());
    buildable.setTerminationMessagePolicy(fluent.getTerminationMessagePolicy());
    buildable.setTty(fluent.getTty());
    buildable.setVolumeDevices(fluent.buildVolumeDevices());
    buildable.setVolumeMounts(fluent.buildVolumeMounts());
    buildable.setWorkingDir(fluent.getWorkingDir());
    return buildable;
  }
  

}