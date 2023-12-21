package org.apache.camel.v1.integrationstatus;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class GeneratedSourcesBuilder extends GeneratedSourcesFluent<GeneratedSourcesBuilder> implements VisitableBuilder<GeneratedSources,GeneratedSourcesBuilder>{
  public GeneratedSourcesBuilder() {
    this(new GeneratedSources());
  }
  
  public GeneratedSourcesBuilder(GeneratedSourcesFluent<?> fluent) {
    this(fluent, new GeneratedSources());
  }
  
  public GeneratedSourcesBuilder(GeneratedSourcesFluent<?> fluent,GeneratedSources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public GeneratedSourcesBuilder(GeneratedSources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  GeneratedSourcesFluent<?> fluent;
  
  public GeneratedSources build() {
    GeneratedSources buildable = new GeneratedSources();
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