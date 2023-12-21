package org.apache.camel.v1.integrationplatformspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class HealthBuilder extends HealthFluent<HealthBuilder> implements VisitableBuilder<Health,HealthBuilder>{
  public HealthBuilder() {
    this(new Health());
  }
  
  public HealthBuilder(HealthFluent<?> fluent) {
    this(fluent, new Health());
  }
  
  public HealthBuilder(HealthFluent<?> fluent,Health instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public HealthBuilder(Health instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  HealthFluent<?> fluent;
  
  public Health build() {
    Health buildable = new Health();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setLivenessFailureThreshold(fluent.getLivenessFailureThreshold());
    buildable.setLivenessInitialDelay(fluent.getLivenessInitialDelay());
    buildable.setLivenessPeriod(fluent.getLivenessPeriod());
    buildable.setLivenessProbeEnabled(fluent.getLivenessProbeEnabled());
    buildable.setLivenessScheme(fluent.getLivenessScheme());
    buildable.setLivenessSuccessThreshold(fluent.getLivenessSuccessThreshold());
    buildable.setLivenessTimeout(fluent.getLivenessTimeout());
    buildable.setReadinessFailureThreshold(fluent.getReadinessFailureThreshold());
    buildable.setReadinessInitialDelay(fluent.getReadinessInitialDelay());
    buildable.setReadinessPeriod(fluent.getReadinessPeriod());
    buildable.setReadinessProbeEnabled(fluent.getReadinessProbeEnabled());
    buildable.setReadinessScheme(fluent.getReadinessScheme());
    buildable.setReadinessSuccessThreshold(fluent.getReadinessSuccessThreshold());
    buildable.setReadinessTimeout(fluent.getReadinessTimeout());
    buildable.setStartupFailureThreshold(fluent.getStartupFailureThreshold());
    buildable.setStartupInitialDelay(fluent.getStartupInitialDelay());
    buildable.setStartupPeriod(fluent.getStartupPeriod());
    buildable.setStartupProbeEnabled(fluent.getStartupProbeEnabled());
    buildable.setStartupScheme(fluent.getStartupScheme());
    buildable.setStartupSuccessThreshold(fluent.getStartupSuccessThreshold());
    buildable.setStartupTimeout(fluent.getStartupTimeout());
    return buildable;
  }
  

}