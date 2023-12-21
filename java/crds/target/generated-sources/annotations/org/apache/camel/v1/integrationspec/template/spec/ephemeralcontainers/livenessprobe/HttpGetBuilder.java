package org.apache.camel.v1.integrationspec.template.spec.ephemeralcontainers.livenessprobe;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class HttpGetBuilder extends HttpGetFluent<HttpGetBuilder> implements VisitableBuilder<HttpGet,HttpGetBuilder>{
  public HttpGetBuilder() {
    this(new HttpGet());
  }
  
  public HttpGetBuilder(HttpGetFluent<?> fluent) {
    this(fluent, new HttpGet());
  }
  
  public HttpGetBuilder(HttpGetFluent<?> fluent,HttpGet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public HttpGetBuilder(HttpGet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  HttpGetFluent<?> fluent;
  
  public HttpGet build() {
    HttpGet buildable = new HttpGet();
    buildable.setHost(fluent.getHost());
    buildable.setHttpHeaders(fluent.buildHttpHeaders());
    buildable.setPath(fluent.getPath());
    buildable.setPort(fluent.getPort());
    buildable.setScheme(fluent.getScheme());
    return buildable;
  }
  

}