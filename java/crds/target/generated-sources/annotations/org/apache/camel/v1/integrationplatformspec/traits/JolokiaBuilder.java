package org.apache.camel.v1.integrationplatformspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class JolokiaBuilder extends JolokiaFluent<JolokiaBuilder> implements VisitableBuilder<Jolokia,JolokiaBuilder>{
  public JolokiaBuilder() {
    this(new Jolokia());
  }
  
  public JolokiaBuilder(JolokiaFluent<?> fluent) {
    this(fluent, new Jolokia());
  }
  
  public JolokiaBuilder(JolokiaFluent<?> fluent,Jolokia instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public JolokiaBuilder(Jolokia instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  JolokiaFluent<?> fluent;
  
  public Jolokia build() {
    Jolokia buildable = new Jolokia();
    buildable.setCACert(fluent.getCACert());
    buildable.setClientPrincipal(fluent.getClientPrincipal());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setDiscoveryEnabled(fluent.getDiscoveryEnabled());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setExtendedClientCheck(fluent.getExtendedClientCheck());
    buildable.setHost(fluent.getHost());
    buildable.setOptions(fluent.getOptions());
    buildable.setPassword(fluent.getPassword());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    buildable.setUseSSLClientAuthentication(fluent.getUseSSLClientAuthentication());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  

}