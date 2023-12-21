package org.apache.camel.v1alpha1.kameletspec.datatypes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TypesBuilder extends TypesFluent<TypesBuilder> implements VisitableBuilder<Types,TypesBuilder>{
  public TypesBuilder() {
    this(new Types());
  }
  
  public TypesBuilder(TypesFluent<?> fluent) {
    this(fluent, new Types());
  }
  
  public TypesBuilder(TypesFluent<?> fluent,Types instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TypesBuilder(Types instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TypesFluent<?> fluent;
  
  public Types build() {
    Types buildable = new Types();
    buildable.setDependencies(fluent.getDependencies());
    buildable.setDescription(fluent.getDescription());
    buildable.setFormat(fluent.getFormat());
    buildable.setHeaders(fluent.getHeaders());
    buildable.setMediaType(fluent.getMediaType());
    buildable.setSchema(fluent.buildSchema());
    buildable.setScheme(fluent.getScheme());
    return buildable;
  }
  

}