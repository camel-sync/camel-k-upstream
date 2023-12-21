package org.apache.camel.v1.integrationplatformspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PrometheusBuilder extends PrometheusFluent<PrometheusBuilder> implements VisitableBuilder<Prometheus,PrometheusBuilder>{
  public PrometheusBuilder() {
    this(new Prometheus());
  }
  
  public PrometheusBuilder(PrometheusFluent<?> fluent) {
    this(fluent, new Prometheus());
  }
  
  public PrometheusBuilder(PrometheusFluent<?> fluent,Prometheus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PrometheusBuilder(Prometheus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PrometheusFluent<?> fluent;
  
  public Prometheus build() {
    Prometheus buildable = new Prometheus();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setPodMonitor(fluent.getPodMonitor());
    buildable.setPodMonitorLabels(fluent.getPodMonitorLabels());
    return buildable;
  }
  

}