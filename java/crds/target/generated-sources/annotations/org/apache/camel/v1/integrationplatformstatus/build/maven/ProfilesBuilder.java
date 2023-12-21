package org.apache.camel.v1.integrationplatformstatus.build.maven;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ProfilesBuilder extends ProfilesFluent<ProfilesBuilder> implements VisitableBuilder<Profiles,ProfilesBuilder>{
  public ProfilesBuilder() {
    this(new Profiles());
  }
  
  public ProfilesBuilder(ProfilesFluent<?> fluent) {
    this(fluent, new Profiles());
  }
  
  public ProfilesBuilder(ProfilesFluent<?> fluent,Profiles instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ProfilesBuilder(Profiles instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ProfilesFluent<?> fluent;
  
  public Profiles build() {
    Profiles buildable = new Profiles();
    buildable.setConfigMapKeyRef(fluent.buildConfigMapKeyRef());
    buildable.setSecretKeyRef(fluent.buildSecretKeyRef());
    return buildable;
  }
  

}