package org.apache.camel.v1.buildspec.tasks.builder.maven;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SettingsSecurityBuilder extends SettingsSecurityFluent<SettingsSecurityBuilder> implements VisitableBuilder<SettingsSecurity,SettingsSecurityBuilder>{
  public SettingsSecurityBuilder() {
    this(new SettingsSecurity());
  }
  
  public SettingsSecurityBuilder(SettingsSecurityFluent<?> fluent) {
    this(fluent, new SettingsSecurity());
  }
  
  public SettingsSecurityBuilder(SettingsSecurityFluent<?> fluent,SettingsSecurity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SettingsSecurityBuilder(SettingsSecurity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SettingsSecurityFluent<?> fluent;
  
  public SettingsSecurity build() {
    SettingsSecurity buildable = new SettingsSecurity();
    buildable.setConfigMapKeyRef(fluent.buildConfigMapKeyRef());
    buildable.setSecretKeyRef(fluent.buildSecretKeyRef());
    return buildable;
  }
  

}