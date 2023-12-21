package org.apache.camel.v1.integrationspec.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IscsiBuilder extends IscsiFluent<IscsiBuilder> implements VisitableBuilder<Iscsi,IscsiBuilder>{
  public IscsiBuilder() {
    this(new Iscsi());
  }
  
  public IscsiBuilder(IscsiFluent<?> fluent) {
    this(fluent, new Iscsi());
  }
  
  public IscsiBuilder(IscsiFluent<?> fluent,Iscsi instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IscsiBuilder(Iscsi instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IscsiFluent<?> fluent;
  
  public Iscsi build() {
    Iscsi buildable = new Iscsi();
    buildable.setChapAuthDiscovery(fluent.getChapAuthDiscovery());
    buildable.setChapAuthSession(fluent.getChapAuthSession());
    buildable.setFsType(fluent.getFsType());
    buildable.setInitiatorName(fluent.getInitiatorName());
    buildable.setIqn(fluent.getIqn());
    buildable.setIscsiInterface(fluent.getIscsiInterface());
    buildable.setLun(fluent.getLun());
    buildable.setPortals(fluent.getPortals());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setTargetPortal(fluent.getTargetPortal());
    return buildable;
  }
  

}