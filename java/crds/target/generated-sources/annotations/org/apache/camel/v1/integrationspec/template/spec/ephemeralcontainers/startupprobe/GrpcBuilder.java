package org.apache.camel.v1.integrationspec.template.spec.ephemeralcontainers.startupprobe;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class GrpcBuilder extends GrpcFluent<GrpcBuilder> implements VisitableBuilder<Grpc,GrpcBuilder>{
  public GrpcBuilder() {
    this(new Grpc());
  }
  
  public GrpcBuilder(GrpcFluent<?> fluent) {
    this(fluent, new Grpc());
  }
  
  public GrpcBuilder(GrpcFluent<?> fluent,Grpc instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public GrpcBuilder(Grpc instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  GrpcFluent<?> fluent;
  
  public Grpc build() {
    Grpc buildable = new Grpc();
    buildable.setPort(fluent.getPort());
    buildable.setService(fluent.getService());
    return buildable;
  }
  

}