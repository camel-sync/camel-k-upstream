package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class AzureDiskBuilder extends AzureDiskFluent<AzureDiskBuilder> implements VisitableBuilder<AzureDisk,AzureDiskBuilder>{
  public AzureDiskBuilder() {
    this(new AzureDisk());
  }
  
  public AzureDiskBuilder(AzureDiskFluent<?> fluent) {
    this(fluent, new AzureDisk());
  }
  
  public AzureDiskBuilder(AzureDiskFluent<?> fluent,AzureDisk instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AzureDiskBuilder(AzureDisk instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AzureDiskFluent<?> fluent;
  
  public AzureDisk build() {
    AzureDisk buildable = new AzureDisk();
    buildable.setCachingMode(fluent.getCachingMode());
    buildable.setDiskName(fluent.getDiskName());
    buildable.setDiskURI(fluent.getDiskURI());
    buildable.setFsType(fluent.getFsType());
    buildable.setKind(fluent.getKind());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  

}