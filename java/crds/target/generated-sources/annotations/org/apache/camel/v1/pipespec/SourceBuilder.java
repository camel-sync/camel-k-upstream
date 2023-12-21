package org.apache.camel.v1.pipespec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SourceBuilder extends SourceFluent<SourceBuilder> implements VisitableBuilder<Source,SourceBuilder>{
  public SourceBuilder() {
    this(new Source());
  }
  
  public SourceBuilder(SourceFluent<?> fluent) {
    this(fluent, new Source());
  }
  
  public SourceBuilder(SourceFluent<?> fluent,Source instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SourceBuilder(Source instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SourceFluent<?> fluent;
  
  public Source build() {
    Source buildable = new Source();
    buildable.setDataTypes(fluent.getDataTypes());
    buildable.setProperties(fluent.buildProperties());
    buildable.setRef(fluent.buildRef());
    buildable.setUri(fluent.getUri());
    return buildable;
  }
  

}