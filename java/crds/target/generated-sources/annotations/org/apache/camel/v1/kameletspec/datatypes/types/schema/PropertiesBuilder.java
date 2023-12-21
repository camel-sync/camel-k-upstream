package org.apache.camel.v1.kameletspec.datatypes.types.schema;

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
    buildable.setDeprecated(fluent.getDeprecated());
    buildable.setDescription(fluent.getDescription());
    buildable.setExample(fluent.getExample());
    buildable.setExclusiveMaximum(fluent.getExclusiveMaximum());
    buildable.setExclusiveMinimum(fluent.getExclusiveMinimum());
    buildable.setFormat(fluent.getFormat());
    buildable.setId(fluent.getId());
    buildable.setMaxItems(fluent.getMaxItems());
    buildable.setMaxLength(fluent.getMaxLength());
    buildable.setMaxProperties(fluent.getMaxProperties());
    buildable.setMaximum(fluent.getMaximum());
    buildable.setMinItems(fluent.getMinItems());
    buildable.setMinLength(fluent.getMinLength());
    buildable.setMinProperties(fluent.getMinProperties());
    buildable.setMinimum(fluent.getMinimum());
    buildable.setMultipleOf(fluent.getMultipleOf());
    buildable.setNullable(fluent.getNullable());
    buildable.setPattern(fluent.getPattern());
    buildable.setTitle(fluent.getTitle());
    buildable.setType(fluent.getType());
    buildable.setUniqueItems(fluent.getUniqueItems());
    buildable.setXDescriptors(fluent.getXDescriptors());
    return buildable;
  }
  

}