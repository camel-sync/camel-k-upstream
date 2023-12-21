package org.apache.camel.v1alpha1.kameletspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class DataTypesBuilder extends DataTypesFluent<DataTypesBuilder> implements VisitableBuilder<DataTypes,DataTypesBuilder>{
  public DataTypesBuilder() {
    this(new DataTypes());
  }
  
  public DataTypesBuilder(DataTypesFluent<?> fluent) {
    this(fluent, new DataTypes());
  }
  
  public DataTypesBuilder(DataTypesFluent<?> fluent,DataTypes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public DataTypesBuilder(DataTypes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  DataTypesFluent<?> fluent;
  
  public DataTypes build() {
    DataTypes buildable = new DataTypes();
    buildable.setHeaders(fluent.getHeaders());
    buildable.setTypes(fluent.getTypes());
    return buildable;
  }
  

}