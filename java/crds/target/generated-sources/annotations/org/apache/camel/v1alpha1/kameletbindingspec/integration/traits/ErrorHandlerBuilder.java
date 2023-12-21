package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ErrorHandlerBuilder extends ErrorHandlerFluent<ErrorHandlerBuilder> implements VisitableBuilder<ErrorHandler,ErrorHandlerBuilder>{
  public ErrorHandlerBuilder() {
    this(new ErrorHandler());
  }
  
  public ErrorHandlerBuilder(ErrorHandlerFluent<?> fluent) {
    this(fluent, new ErrorHandler());
  }
  
  public ErrorHandlerBuilder(ErrorHandlerFluent<?> fluent,ErrorHandler instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ErrorHandlerBuilder(ErrorHandler instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ErrorHandlerFluent<?> fluent;
  
  public ErrorHandler build() {
    ErrorHandler buildable = new ErrorHandler();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setRef(fluent.getRef());
    return buildable;
  }
  

}