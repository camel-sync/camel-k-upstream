package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class IntegrationBuilder extends IntegrationFluent<IntegrationBuilder> implements VisitableBuilder<Integration,IntegrationBuilder>{
  public IntegrationBuilder() {
    this(new Integration());
  }
  
  public IntegrationBuilder(IntegrationFluent<?> fluent) {
    this(fluent, new Integration());
  }
  
  public IntegrationBuilder(IntegrationFluent<?> fluent,Integration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public IntegrationBuilder(Integration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  IntegrationFluent<?> fluent;
  
  public Integration build() {
    Integration buildable = new Integration();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    buildable.setKind(fluent.getKind());
    buildable.setApiVersion(fluent.getApiVersion());
    return buildable;
  }
  

}