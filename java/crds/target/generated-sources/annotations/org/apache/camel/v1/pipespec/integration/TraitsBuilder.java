package org.apache.camel.v1.pipespec.integration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TraitsBuilder extends TraitsFluent<TraitsBuilder> implements VisitableBuilder<Traits,TraitsBuilder>{
  public TraitsBuilder() {
    this(new Traits());
  }
  
  public TraitsBuilder(TraitsFluent<?> fluent) {
    this(fluent, new Traits());
  }
  
  public TraitsBuilder(TraitsFluent<?> fluent,Traits instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TraitsBuilder(Traits instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TraitsFluent<?> fluent;
  
  public Traits build() {
    Traits buildable = new Traits();
    buildable.setAddons(fluent.getAddons());
    buildable.setAffinity(fluent.buildAffinity());
    buildable.setBuilder(fluent.buildBuilder());
    buildable.setCamel(fluent.buildCamel());
    buildable.setContainer(fluent.buildContainer());
    buildable.setCron(fluent.buildCron());
    buildable.setDependencies(fluent.buildDependencies());
    buildable.setDeployer(fluent.buildDeployer());
    buildable.setDeployment(fluent.buildDeployment());
    buildable.setEnvironment(fluent.buildEnvironment());
    buildable.setErrorHandler(fluent.buildErrorHandler());
    buildable.setGc(fluent.buildGc());
    buildable.setHealth(fluent.buildHealth());
    buildable.setIngress(fluent.buildIngress());
    buildable.setIstio(fluent.buildIstio());
    buildable.setJolokia(fluent.buildJolokia());
    buildable.setJvm(fluent.buildJvm());
    buildable.setKamelets(fluent.buildKamelets());
    buildable.setKeda(fluent.buildKeda());
    buildable.setKnative(fluent.buildKnative());
    buildable.setKnativeService(fluent.buildKnativeService());
    buildable.setLogging(fluent.buildLogging());
    buildable.setMaster(fluent.buildMaster());
    buildable.setMount(fluent.buildMount());
    buildable.setOpenapi(fluent.buildOpenapi());
    buildable.setOwner(fluent.buildOwner());
    buildable.setPdb(fluent.buildPdb());
    buildable.setPlatform(fluent.buildPlatform());
    buildable.setPod(fluent.buildPod());
    buildable.setPrometheus(fluent.buildPrometheus());
    buildable.setPullSecret(fluent.buildPullSecret());
    buildable.setQuarkus(fluent.buildQuarkus());
    buildable.setRegistry(fluent.buildRegistry());
    buildable.setRoute(fluent.buildRoute());
    buildable.setService(fluent.buildService());
    buildable.setServiceBinding(fluent.buildServiceBinding());
    buildable.setStrimzi(fluent.buildStrimzi());
    buildable.setToleration(fluent.buildToleration());
    buildable.setTracing(fluent.buildTracing());
    return buildable;
  }
  

}