package org.apache.camel.v1.integrationplatformstatus.build.maven;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ExtensionBuilder extends ExtensionFluent<ExtensionBuilder> implements VisitableBuilder<Extension,ExtensionBuilder>{
  public ExtensionBuilder() {
    this(new Extension());
  }
  
  public ExtensionBuilder(ExtensionFluent<?> fluent) {
    this(fluent, new Extension());
  }
  
  public ExtensionBuilder(ExtensionFluent<?> fluent,Extension instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ExtensionBuilder(Extension instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ExtensionFluent<?> fluent;
  
  public Extension build() {
    Extension buildable = new Extension();
    buildable.setArtifactId(fluent.getArtifactId());
    buildable.setGroupId(fluent.getGroupId());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}