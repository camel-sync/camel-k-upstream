package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SecurityContextBuilder extends SecurityContextFluent<SecurityContextBuilder> implements VisitableBuilder<SecurityContext,SecurityContextBuilder>{
  public SecurityContextBuilder() {
    this(new SecurityContext());
  }
  
  public SecurityContextBuilder(SecurityContextFluent<?> fluent) {
    this(fluent, new SecurityContext());
  }
  
  public SecurityContextBuilder(SecurityContextFluent<?> fluent,SecurityContext instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SecurityContextBuilder(SecurityContext instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SecurityContextFluent<?> fluent;
  
  public SecurityContext build() {
    SecurityContext buildable = new SecurityContext();
    buildable.setFsGroup(fluent.getFsGroup());
    buildable.setFsGroupChangePolicy(fluent.getFsGroupChangePolicy());
    buildable.setRunAsGroup(fluent.getRunAsGroup());
    buildable.setRunAsNonRoot(fluent.getRunAsNonRoot());
    buildable.setRunAsUser(fluent.getRunAsUser());
    buildable.setSeLinuxOptions(fluent.buildSeLinuxOptions());
    buildable.setSeccompProfile(fluent.buildSeccompProfile());
    buildable.setSupplementalGroups(fluent.getSupplementalGroups());
    buildable.setSysctls(fluent.buildSysctls());
    buildable.setWindowsOptions(fluent.buildWindowsOptions());
    return buildable;
  }
  

}