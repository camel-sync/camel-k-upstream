package org.apache.camel.v1alpha1.kameletbindingspec.source.types.schema;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ExternalDocsBuilder extends ExternalDocsFluent<ExternalDocsBuilder> implements VisitableBuilder<ExternalDocs,ExternalDocsBuilder>{
  public ExternalDocsBuilder() {
    this(new ExternalDocs());
  }
  
  public ExternalDocsBuilder(ExternalDocsFluent<?> fluent) {
    this(fluent, new ExternalDocs());
  }
  
  public ExternalDocsBuilder(ExternalDocsFluent<?> fluent,ExternalDocs instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ExternalDocsBuilder(ExternalDocs instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ExternalDocsFluent<?> fluent;
  
  public ExternalDocs build() {
    ExternalDocs buildable = new ExternalDocs();
    buildable.setDescription(fluent.getDescription());
    buildable.setUrl(fluent.getUrl());
    return buildable;
  }
  

}