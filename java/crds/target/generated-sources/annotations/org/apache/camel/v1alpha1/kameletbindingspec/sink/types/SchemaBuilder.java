package org.apache.camel.v1alpha1.kameletbindingspec.sink.types;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SchemaBuilder extends SchemaFluent<SchemaBuilder> implements VisitableBuilder<Schema,SchemaBuilder>{
  public SchemaBuilder() {
    this(new Schema());
  }
  
  public SchemaBuilder(SchemaFluent<?> fluent) {
    this(fluent, new Schema());
  }
  
  public SchemaBuilder(SchemaFluent<?> fluent,Schema instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SchemaBuilder(Schema instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SchemaFluent<?> fluent;
  
  public Schema build() {
    Schema buildable = new Schema();
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