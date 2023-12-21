package org.apache.camel.v1.integrationspec.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class AwsElasticBlockStoreBuilder extends AwsElasticBlockStoreFluent<AwsElasticBlockStoreBuilder> implements VisitableBuilder<AwsElasticBlockStore,AwsElasticBlockStoreBuilder>{
  public AwsElasticBlockStoreBuilder() {
    this(new AwsElasticBlockStore());
  }
  
  public AwsElasticBlockStoreBuilder(AwsElasticBlockStoreFluent<?> fluent) {
    this(fluent, new AwsElasticBlockStore());
  }
  
  public AwsElasticBlockStoreBuilder(AwsElasticBlockStoreFluent<?> fluent,AwsElasticBlockStore instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AwsElasticBlockStoreBuilder(AwsElasticBlockStore instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AwsElasticBlockStoreFluent<?> fluent;
  
  public AwsElasticBlockStore build() {
    AwsElasticBlockStore buildable = new AwsElasticBlockStore();
    buildable.setFsType(fluent.getFsType());
    buildable.setPartition(fluent.getPartition());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  

}