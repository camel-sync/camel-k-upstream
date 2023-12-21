package org.apache.camel.v1.pipespec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class _3scaleBuilder extends _3scaleFluent<_3scaleBuilder> implements VisitableBuilder<_3scale,_3scaleBuilder>{
  public _3scaleBuilder() {
    this(new _3scale());
  }
  
  public _3scaleBuilder(_3scaleFluent<?> fluent) {
    this(fluent, new _3scale());
  }
  
  public _3scaleBuilder(_3scaleFluent<?> fluent,_3scale instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public _3scaleBuilder(_3scale instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  _3scaleFluent<?> fluent;
  
  public _3scale build() {
    _3scale buildable = new _3scale();
    buildable.setConfiguration(fluent.buildConfiguration());
    return buildable;
  }
  

}