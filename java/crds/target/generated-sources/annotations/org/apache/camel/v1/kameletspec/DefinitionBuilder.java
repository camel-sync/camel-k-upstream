package org.apache.camel.v1.kameletspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class DefinitionBuilder extends DefinitionFluent<DefinitionBuilder> implements VisitableBuilder<Definition,DefinitionBuilder>{
  public DefinitionBuilder() {
    this(new Definition());
  }
  
  public DefinitionBuilder(DefinitionFluent<?> fluent) {
    this(fluent, new Definition());
  }
  
  public DefinitionBuilder(DefinitionFluent<?> fluent,Definition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public DefinitionBuilder(Definition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  DefinitionFluent<?> fluent;
  
  public Definition build() {
    Definition buildable = new Definition();
    buildable.setDescription(fluent.getDescription());
    buildable.setExample(fluent.getExample());
    buildable.setExternalDocs(fluent.buildExternalDocs());
    buildable.setId(fluent.getId());
    buildable.setProperties(fluent.getProperties());
    buildable.setRequired(fluent.getRequired());
    buildable.setTitle(fluent.getTitle());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}