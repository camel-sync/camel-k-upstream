package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CronBuilder extends CronFluent<CronBuilder> implements VisitableBuilder<Cron,CronBuilder>{
  public CronBuilder() {
    this(new Cron());
  }
  
  public CronBuilder(CronFluent<?> fluent) {
    this(fluent, new Cron());
  }
  
  public CronBuilder(CronFluent<?> fluent,Cron instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CronBuilder(Cron instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CronFluent<?> fluent;
  
  public Cron build() {
    Cron buildable = new Cron();
    buildable.setActiveDeadlineSeconds(fluent.getActiveDeadlineSeconds());
    buildable.setAuto(fluent.getAuto());
    buildable.setBackoffLimit(fluent.getBackoffLimit());
    buildable.setComponents(fluent.getComponents());
    buildable.setConcurrencyPolicy(fluent.getConcurrencyPolicy());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setFallback(fluent.getFallback());
    buildable.setSchedule(fluent.getSchedule());
    buildable.setStartingDeadlineSeconds(fluent.getStartingDeadlineSeconds());
    return buildable;
  }
  

}