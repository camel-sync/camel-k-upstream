package org.apache.camel.v1.integrationspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TemplateBuilder extends TemplateFluent<TemplateBuilder> implements VisitableBuilder<Template,TemplateBuilder>{
  public TemplateBuilder() {
    this(new Template());
  }
  
  public TemplateBuilder(TemplateFluent<?> fluent) {
    this(fluent, new Template());
  }
  
  public TemplateBuilder(TemplateFluent<?> fluent,Template instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TemplateBuilder(Template instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TemplateFluent<?> fluent;
  
  public Template build() {
    Template buildable = new Template();
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}