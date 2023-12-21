package org.apache.camel.v1.integrationspec.template.spec.initcontainers.lifecycle;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PostStartBuilder extends PostStartFluent<PostStartBuilder> implements VisitableBuilder<PostStart,PostStartBuilder>{
  public PostStartBuilder() {
    this(new PostStart());
  }
  
  public PostStartBuilder(PostStartFluent<?> fluent) {
    this(fluent, new PostStart());
  }
  
  public PostStartBuilder(PostStartFluent<?> fluent,PostStart instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PostStartBuilder(PostStart instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PostStartFluent<?> fluent;
  
  public PostStart build() {
    PostStart buildable = new PostStart();
    buildable.setExec(fluent.buildExec());
    buildable.setHttpGet(fluent.buildHttpGet());
    buildable.setTcpSocket(fluent.buildTcpSocket());
    return buildable;
  }
  

}