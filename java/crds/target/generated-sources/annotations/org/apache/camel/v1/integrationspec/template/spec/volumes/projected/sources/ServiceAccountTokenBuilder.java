package org.apache.camel.v1.integrationspec.template.spec.volumes.projected.sources;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ServiceAccountTokenBuilder extends ServiceAccountTokenFluent<ServiceAccountTokenBuilder> implements VisitableBuilder<ServiceAccountToken,ServiceAccountTokenBuilder>{
  public ServiceAccountTokenBuilder() {
    this(new ServiceAccountToken());
  }
  
  public ServiceAccountTokenBuilder(ServiceAccountTokenFluent<?> fluent) {
    this(fluent, new ServiceAccountToken());
  }
  
  public ServiceAccountTokenBuilder(ServiceAccountTokenFluent<?> fluent,ServiceAccountToken instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ServiceAccountTokenBuilder(ServiceAccountToken instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ServiceAccountTokenFluent<?> fluent;
  
  public ServiceAccountToken build() {
    ServiceAccountToken buildable = new ServiceAccountToken();
    buildable.setAudience(fluent.getAudience());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
  

}