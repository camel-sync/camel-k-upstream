package org.apache.camel.v1.integrationspec.template.spec.initcontainers.startupprobe.httpget;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class HttpHeadersBuilder extends HttpHeadersFluent<HttpHeadersBuilder> implements VisitableBuilder<HttpHeaders,HttpHeadersBuilder>{
  public HttpHeadersBuilder() {
    this(new HttpHeaders());
  }
  
  public HttpHeadersBuilder(HttpHeadersFluent<?> fluent) {
    this(fluent, new HttpHeaders());
  }
  
  public HttpHeadersBuilder(HttpHeadersFluent<?> fluent,HttpHeaders instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public HttpHeadersBuilder(HttpHeaders instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  HttpHeadersFluent<?> fluent;
  
  public HttpHeaders build() {
    HttpHeaders buildable = new HttpHeaders();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}