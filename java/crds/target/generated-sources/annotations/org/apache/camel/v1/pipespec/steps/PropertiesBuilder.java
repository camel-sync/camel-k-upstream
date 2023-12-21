package org.apache.camel.v1.pipespec.steps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PropertiesBuilder extends PropertiesFluent<PropertiesBuilder> implements VisitableBuilder<Properties,PropertiesBuilder>{
  public PropertiesBuilder() {
    this(new Properties());
  }
  
  public PropertiesBuilder(PropertiesFluent<?> fluent) {
    this(fluent, new Properties());
  }
  
  public PropertiesBuilder(PropertiesFluent<?> fluent,Properties instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PropertiesBuilder(Properties instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PropertiesFluent<?> fluent;
  
  public Properties build() {
    Properties buildable = new Properties();
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}