package org.apache.camel.v1.integrationspec.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class AzureFileBuilder extends AzureFileFluent<AzureFileBuilder> implements VisitableBuilder<AzureFile,AzureFileBuilder>{
  public AzureFileBuilder() {
    this(new AzureFile());
  }
  
  public AzureFileBuilder(AzureFileFluent<?> fluent) {
    this(fluent, new AzureFile());
  }
  
  public AzureFileBuilder(AzureFileFluent<?> fluent,AzureFile instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AzureFileBuilder(AzureFile instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AzureFileFluent<?> fluent;
  
  public AzureFile build() {
    AzureFile buildable = new AzureFile();
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setShareName(fluent.getShareName());
    return buildable;
  }
  

}