package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.securitycontext;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SeccompProfileBuilder extends SeccompProfileFluent<SeccompProfileBuilder> implements VisitableBuilder<SeccompProfile,SeccompProfileBuilder>{
  public SeccompProfileBuilder() {
    this(new SeccompProfile());
  }
  
  public SeccompProfileBuilder(SeccompProfileFluent<?> fluent) {
    this(fluent, new SeccompProfile());
  }
  
  public SeccompProfileBuilder(SeccompProfileFluent<?> fluent,SeccompProfile instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SeccompProfileBuilder(SeccompProfile instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SeccompProfileFluent<?> fluent;
  
  public SeccompProfile build() {
    SeccompProfile buildable = new SeccompProfile();
    buildable.setLocalhostProfile(fluent.getLocalhostProfile());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}