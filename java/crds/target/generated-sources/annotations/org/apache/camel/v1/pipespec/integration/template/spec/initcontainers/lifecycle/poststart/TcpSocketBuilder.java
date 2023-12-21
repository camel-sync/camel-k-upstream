package org.apache.camel.v1.pipespec.integration.template.spec.initcontainers.lifecycle.poststart;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TcpSocketBuilder extends TcpSocketFluent<TcpSocketBuilder> implements VisitableBuilder<TcpSocket,TcpSocketBuilder>{
  public TcpSocketBuilder() {
    this(new TcpSocket());
  }
  
  public TcpSocketBuilder(TcpSocketFluent<?> fluent) {
    this(fluent, new TcpSocket());
  }
  
  public TcpSocketBuilder(TcpSocketFluent<?> fluent,TcpSocket instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TcpSocketBuilder(TcpSocket instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TcpSocketFluent<?> fluent;
  
  public TcpSocket build() {
    TcpSocket buildable = new TcpSocket();
    buildable.setHost(fluent.getHost());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  

}