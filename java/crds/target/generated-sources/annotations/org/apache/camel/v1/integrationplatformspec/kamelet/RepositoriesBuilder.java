package org.apache.camel.v1.integrationplatformspec.kamelet;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class RepositoriesBuilder extends RepositoriesFluent<RepositoriesBuilder> implements VisitableBuilder<Repositories,RepositoriesBuilder>{
  public RepositoriesBuilder() {
    this(new Repositories());
  }
  
  public RepositoriesBuilder(RepositoriesFluent<?> fluent) {
    this(fluent, new Repositories());
  }
  
  public RepositoriesBuilder(RepositoriesFluent<?> fluent,Repositories instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RepositoriesBuilder(Repositories instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RepositoriesFluent<?> fluent;
  
  public Repositories build() {
    Repositories buildable = new Repositories();
    buildable.setUri(fluent.getUri());
    return buildable;
  }
  

}