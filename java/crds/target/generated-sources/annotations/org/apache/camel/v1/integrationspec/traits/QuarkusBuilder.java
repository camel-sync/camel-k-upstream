package org.apache.camel.v1.integrationspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class QuarkusBuilder extends QuarkusFluent<QuarkusBuilder> implements VisitableBuilder<Quarkus,QuarkusBuilder>{
  public QuarkusBuilder() {
    this(new Quarkus());
  }
  
  public QuarkusBuilder(QuarkusFluent<?> fluent) {
    this(fluent, new Quarkus());
  }
  
  public QuarkusBuilder(QuarkusFluent<?> fluent,Quarkus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public QuarkusBuilder(Quarkus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  QuarkusFluent<?> fluent;
  
  public Quarkus build() {
    Quarkus buildable = new Quarkus();
    buildable.setBuildMode(fluent.getBuildMode());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setNativeBaseImage(fluent.getNativeBaseImage());
    buildable.setNativeBuilderImage(fluent.getNativeBuilderImage());
    buildable.setPackageTypes(fluent.getPackageTypes());
    return buildable;
  }
  

}