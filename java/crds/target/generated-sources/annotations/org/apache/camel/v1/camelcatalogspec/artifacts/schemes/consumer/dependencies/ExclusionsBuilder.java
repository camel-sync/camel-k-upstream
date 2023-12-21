package org.apache.camel.v1.camelcatalogspec.artifacts.schemes.consumer.dependencies;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ExclusionsBuilder extends ExclusionsFluent<ExclusionsBuilder> implements VisitableBuilder<Exclusions,ExclusionsBuilder>{
  public ExclusionsBuilder() {
    this(new Exclusions());
  }
  
  public ExclusionsBuilder(ExclusionsFluent<?> fluent) {
    this(fluent, new Exclusions());
  }
  
  public ExclusionsBuilder(ExclusionsFluent<?> fluent,Exclusions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ExclusionsBuilder(Exclusions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ExclusionsFluent<?> fluent;
  
  public Exclusions build() {
    Exclusions buildable = new Exclusions();
    buildable.setArtifactId(fluent.getArtifactId());
    buildable.setGroupId(fluent.getGroupId());
    return buildable;
  }
  

}