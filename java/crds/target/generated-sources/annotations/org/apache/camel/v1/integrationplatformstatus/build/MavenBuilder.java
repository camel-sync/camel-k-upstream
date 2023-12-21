package org.apache.camel.v1.integrationplatformstatus.build;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class MavenBuilder extends MavenFluent<MavenBuilder> implements VisitableBuilder<Maven,MavenBuilder>{
  public MavenBuilder() {
    this(new Maven());
  }
  
  public MavenBuilder(MavenFluent<?> fluent) {
    this(fluent, new Maven());
  }
  
  public MavenBuilder(MavenFluent<?> fluent,Maven instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public MavenBuilder(Maven instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  MavenFluent<?> fluent;
  
  public Maven build() {
    Maven buildable = new Maven();
    buildable.setCaSecrets(fluent.buildCaSecrets());
    buildable.setCliOptions(fluent.getCliOptions());
    buildable.setExtension(fluent.buildExtension());
    buildable.setLocalRepository(fluent.getLocalRepository());
    buildable.setProfiles(fluent.buildProfiles());
    buildable.setProperties(fluent.getProperties());
    buildable.setSettings(fluent.buildSettings());
    buildable.setSettingsSecurity(fluent.buildSettingsSecurity());
    return buildable;
  }
  

}