package org.apache.camel.v1alpha1.kameletspec.datatypes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class HeadersBuilder extends HeadersFluent<HeadersBuilder> implements VisitableBuilder<Headers,HeadersBuilder>{
  public HeadersBuilder() {
    this(new Headers());
  }
  
  public HeadersBuilder(HeadersFluent<?> fluent) {
    this(fluent, new Headers());
  }
  
  public HeadersBuilder(HeadersFluent<?> fluent,Headers instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public HeadersBuilder(Headers instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  HeadersFluent<?> fluent;
  
  public Headers build() {
    Headers buildable = new Headers();
    buildable.setDescription(fluent.getDescription());
    buildable.setRequired(fluent.getRequired());
    buildable.setTitle(fluent.getTitle());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}