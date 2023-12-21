package org.apache.camel.v1.buildspec.tasks;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PackageBuilder extends PackageFluent<PackageBuilder> implements VisitableBuilder<Package,PackageBuilder>{
  public PackageBuilder() {
    this(new Package());
  }
  
  public PackageBuilder(PackageFluent<?> fluent) {
    this(fluent, new Package());
  }
  
  public PackageBuilder(PackageFluent<?> fluent,Package instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PackageBuilder(Package instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PackageFluent<?> fluent;
  
  public Package build() {
    Package buildable = new Package();
    buildable.setBaseImage(fluent.getBaseImage());
    buildable.setBuildDir(fluent.getBuildDir());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setDependencies(fluent.getDependencies());
    buildable.setMaven(fluent.buildMaven());
    buildable.setName(fluent.getName());
    buildable.setRuntime(fluent.buildRuntime());
    buildable.setSources(fluent.buildSources());
    buildable.setSteps(fluent.getSteps());
    return buildable;
  }
  

}