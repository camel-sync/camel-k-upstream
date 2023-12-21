package org.apache.camel.v1alpha1.kameletspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SourcesBuilder extends SourcesFluent<SourcesBuilder> implements VisitableBuilder<Sources,SourcesBuilder>{
  public SourcesBuilder() {
    this(new Sources());
  }
  
  public SourcesBuilder(SourcesFluent<?> fluent) {
    this(fluent, new Sources());
  }
  
  public SourcesBuilder(SourcesFluent<?> fluent,Sources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SourcesBuilder(Sources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SourcesFluent<?> fluent;
  
  public Sources build() {
    Sources buildable = new Sources();
    buildable.setCompression(fluent.getCompression());
    buildable.setContent(fluent.getContent());
    buildable.setContentKey(fluent.getContentKey());
    buildable.setContentRef(fluent.getContentRef());
    buildable.setContentType(fluent.getContentType());
    buildable.setFromKamelet(fluent.getFromKamelet());
    buildable.setInterceptors(fluent.getInterceptors());
    buildable.setLanguage(fluent.getLanguage());
    buildable.setLoader(fluent.getLoader());
    buildable.setName(fluent.getName());
    buildable.setPath(fluent.getPath());
    buildable.setPropertyNames(fluent.getPropertyNames());
    buildable.setRawContent(fluent.getRawContent());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}