package org.apache.camel.v1.integrationplatformspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class RouteBuilder extends RouteFluent<RouteBuilder> implements VisitableBuilder<Route,RouteBuilder>{
  public RouteBuilder() {
    this(new Route());
  }
  
  public RouteBuilder(RouteFluent<?> fluent) {
    this(fluent, new Route());
  }
  
  public RouteBuilder(RouteFluent<?> fluent,Route instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RouteBuilder(Route instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RouteFluent<?> fluent;
  
  public Route build() {
    Route buildable = new Route();
    buildable.setAnnotations(fluent.getAnnotations());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setHost(fluent.getHost());
    buildable.setTlsCACertificate(fluent.getTlsCACertificate());
    buildable.setTlsCACertificateSecret(fluent.getTlsCACertificateSecret());
    buildable.setTlsCertificate(fluent.getTlsCertificate());
    buildable.setTlsCertificateSecret(fluent.getTlsCertificateSecret());
    buildable.setTlsDestinationCACertificate(fluent.getTlsDestinationCACertificate());
    buildable.setTlsDestinationCACertificateSecret(fluent.getTlsDestinationCACertificateSecret());
    buildable.setTlsInsecureEdgeTerminationPolicy(fluent.getTlsInsecureEdgeTerminationPolicy());
    buildable.setTlsKey(fluent.getTlsKey());
    buildable.setTlsKeySecret(fluent.getTlsKeySecret());
    buildable.setTlsTermination(fluent.getTlsTermination());
    return buildable;
  }
  

}