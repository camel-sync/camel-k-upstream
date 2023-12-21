package org.apache.camel.v1.integrationplatformstatus.build.maven;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SettingsBuilder extends SettingsFluent<SettingsBuilder> implements VisitableBuilder<Settings,SettingsBuilder>{
  public SettingsBuilder() {
    this(new Settings());
  }
  
  public SettingsBuilder(SettingsFluent<?> fluent) {
    this(fluent, new Settings());
  }
  
  public SettingsBuilder(SettingsFluent<?> fluent,Settings instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SettingsBuilder(Settings instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SettingsFluent<?> fluent;
  
  public Settings build() {
    Settings buildable = new Settings();
    buildable.setConfigMapKeyRef(fluent.buildConfigMapKeyRef());
    buildable.setSecretKeyRef(fluent.buildSecretKeyRef());
    return buildable;
  }
  

}