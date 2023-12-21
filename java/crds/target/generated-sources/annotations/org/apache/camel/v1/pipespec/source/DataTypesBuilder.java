package org.apache.camel.v1.pipespec.source;

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
    buildable.setFormat(fluent.getFormat());
    buildable.setScheme(fluent.getScheme());
    return buildable;
  }
  

}