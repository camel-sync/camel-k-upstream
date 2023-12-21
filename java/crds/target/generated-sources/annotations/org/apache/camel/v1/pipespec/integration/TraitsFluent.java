package org.apache.camel.v1.pipespec.integration;

import org.apache.camel.v1.pipespec.integration.traits.BuilderFluent;
import org.apache.camel.v1.pipespec.integration.traits.Owner;
import org.apache.camel.v1.pipespec.integration.traits.Jolokia;
import org.apache.camel.v1.pipespec.integration.traits.Prometheus;
import java.lang.String;
import org.apache.camel.v1.pipespec.integration.traits.ContainerBuilder;
import org.apache.camel.v1.pipespec.integration.traits.QuarkusBuilder;
import org.apache.camel.v1.pipespec.integration.traits.JolokiaBuilder;
import org.apache.camel.v1.pipespec.integration.traits.PlatformBuilder;
import org.apache.camel.v1.pipespec.integration.traits.LoggingBuilder;
import org.apache.camel.v1.pipespec.integration.traits.Deployer;
import org.apache.camel.v1.pipespec.integration.traits.KnativeServiceFluent;
import org.apache.camel.v1.pipespec.integration.traits.GcFluent;
import org.apache.camel.v1.pipespec.integration.traits.Pod;
import org.apache.camel.v1.pipespec.integration.traits.KedaBuilder;
import org.apache.camel.v1.pipespec.integration.traits.PodBuilder;
import org.apache.camel.v1.pipespec.integration.traits.DeployerBuilder;
import org.apache.camel.v1.pipespec.integration.traits.KnativeFluent;
import org.apache.camel.v1.pipespec.integration.traits.OpenapiBuilder;
import org.apache.camel.v1.pipespec.integration.traits.MasterFluent;
import org.apache.camel.v1.pipespec.integration.traits.PdbBuilder;
import org.apache.camel.v1.pipespec.integration.traits.RegistryBuilder;
import org.apache.camel.v1.pipespec.integration.traits.CamelBuilder;
import org.apache.camel.v1.pipespec.integration.traits.RouteBuilder;
import org.apache.camel.v1.pipespec.integration.traits.ServiceBinding;
import org.apache.camel.v1.pipespec.integration.traits.Master;
import org.apache.camel.v1.pipespec.integration.traits.HealthBuilder;
import org.apache.camel.v1.pipespec.integration.traits.OwnerBuilder;
import org.apache.camel.v1.pipespec.integration.traits.Jvm;
import org.apache.camel.v1.pipespec.integration.traits.Deployment;
import org.apache.camel.v1.pipespec.integration.traits.Cron;
import org.apache.camel.v1.pipespec.integration.traits.DependenciesFluent;
import org.apache.camel.v1.pipespec.integration.traits.Container;
import org.apache.camel.v1.pipespec.integration.traits.ErrorHandlerBuilder;
import org.apache.camel.v1.pipespec.integration.traits.Knative;
import org.apache.camel.v1.pipespec.integration.traits.OwnerFluent;
import org.apache.camel.v1.pipespec.integration.traits.TolerationFluent;
import org.apache.camel.v1.pipespec.integration.traits.Dependencies;
import org.apache.camel.v1.pipespec.integration.traits.Openapi;
import org.apache.camel.v1.pipespec.integration.traits.Route;
import org.apache.camel.v1.pipespec.integration.traits.Logging;
import org.apache.camel.v1.pipespec.integration.traits.CronFluent;
import org.apache.camel.v1.pipespec.integration.traits.Quarkus;
import org.apache.camel.v1.pipespec.integration.traits.Affinity;
import org.apache.camel.v1.pipespec.integration.traits.KameletsBuilder;
import org.apache.camel.v1.pipespec.integration.traits.EnvironmentFluent;
import java.lang.SuppressWarnings;
import org.apache.camel.v1.pipespec.integration.traits.Addons;
import org.apache.camel.v1.pipespec.integration.traits.JvmFluent;
import org.apache.camel.v1.pipespec.integration.traits.ServiceFluent;
import org.apache.camel.v1.pipespec.integration.traits.Pdb;
import org.apache.camel.v1.pipespec.integration.traits.PullSecret;
import org.apache.camel.v1.pipespec.integration.traits.DeploymentFluent;
import org.apache.camel.v1.pipespec.integration.traits.PullSecretFluent;
import org.apache.camel.v1.pipespec.integration.traits.Health;
import org.apache.camel.v1.pipespec.integration.traits.Registry;
import org.apache.camel.v1.pipespec.integration.traits.KnativeServiceBuilder;
import org.apache.camel.v1.pipespec.integration.traits.IngressBuilder;
import org.apache.camel.v1.pipespec.integration.traits.CronBuilder;
import org.apache.camel.v1.pipespec.integration.traits.GcBuilder;
import org.apache.camel.v1.pipespec.integration.traits.MountBuilder;
import org.apache.camel.v1.pipespec.integration.traits.Gc;
import org.apache.camel.v1.pipespec.integration.traits.Platform;
import org.apache.camel.v1.pipespec.integration.traits.KnativeService;
import org.apache.camel.v1.pipespec.integration.traits.EnvironmentBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1.pipespec.integration.traits.JolokiaFluent;
import org.apache.camel.v1.pipespec.integration.traits.KedaFluent;
import org.apache.camel.v1.pipespec.integration.traits.PrometheusBuilder;
import org.apache.camel.v1.pipespec.integration.traits.Istio;
import org.apache.camel.v1.pipespec.integration.traits.PodFluent;
import org.apache.camel.v1.pipespec.integration.traits.ErrorHandlerFluent;
import org.apache.camel.v1.pipespec.integration.traits.CamelFluent;
import org.apache.camel.v1.pipespec.integration.traits.IstioBuilder;
import java.lang.Object;
import org.apache.camel.v1.pipespec.integration.traits.Tracing;
import java.util.Map;
import org.apache.camel.v1.pipespec.integration.traits.DeploymentBuilder;
import org.apache.camel.v1.pipespec.integration.traits.DependenciesBuilder;
import org.apache.camel.v1.pipespec.integration.traits.MasterBuilder;
import org.apache.camel.v1.pipespec.integration.traits.Camel;
import org.apache.camel.v1.pipespec.integration.traits.StrimziFluent;
import org.apache.camel.v1.pipespec.integration.traits.IstioFluent;
import org.apache.camel.v1.pipespec.integration.traits.Keda;
import org.apache.camel.v1.pipespec.integration.traits.ContainerFluent;
import org.apache.camel.v1.pipespec.integration.traits.TolerationBuilder;
import org.apache.camel.v1.pipespec.integration.traits.TracingBuilder;
import org.apache.camel.v1.pipespec.integration.traits.TracingFluent;
import org.apache.camel.v1.pipespec.integration.traits.RegistryFluent;
import org.apache.camel.v1.pipespec.integration.traits.JvmBuilder;
import org.apache.camel.v1.pipespec.integration.traits.PrometheusFluent;
import org.apache.camel.v1.pipespec.integration.traits.RouteFluent;
import org.apache.camel.v1.pipespec.integration.traits.StrimziBuilder;
import org.apache.camel.v1.pipespec.integration.traits.QuarkusFluent;
import org.apache.camel.v1.pipespec.integration.traits.Builder;
import org.apache.camel.v1.pipespec.integration.traits.IngressFluent;
import org.apache.camel.v1.pipespec.integration.traits.Mount;
import org.apache.camel.v1.pipespec.integration.traits.KameletsFluent;
import java.util.LinkedHashMap;
import org.apache.camel.v1.pipespec.integration.traits.PdbFluent;
import org.apache.camel.v1.pipespec.integration.traits.ServiceBindingFluent;
import org.apache.camel.v1.pipespec.integration.traits.ErrorHandler;
import org.apache.camel.v1.pipespec.integration.traits.Ingress;
import org.apache.camel.v1.pipespec.integration.traits.KnativeBuilder;
import org.apache.camel.v1.pipespec.integration.traits.ServiceBindingBuilder;
import org.apache.camel.v1.pipespec.integration.traits.Kamelets;
import org.apache.camel.v1.pipespec.integration.traits.AffinityFluent;
import org.apache.camel.v1.pipespec.integration.traits.LoggingFluent;
import org.apache.camel.v1.pipespec.integration.traits.HealthFluent;
import org.apache.camel.v1.pipespec.integration.traits.Toleration;
import org.apache.camel.v1.pipespec.integration.traits.Environment;
import org.apache.camel.v1.pipespec.integration.traits.OpenapiFluent;
import org.apache.camel.v1.pipespec.integration.traits.AffinityBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1.pipespec.integration.traits.DeployerFluent;
import org.apache.camel.v1.pipespec.integration.traits.ServiceBuilder;
import org.apache.camel.v1.pipespec.integration.traits.PlatformFluent;
import org.apache.camel.v1.pipespec.integration.traits.Service;
import org.apache.camel.v1.pipespec.integration.traits.Strimzi;
import org.apache.camel.v1.pipespec.integration.traits.MountFluent;
import org.apache.camel.v1.pipespec.integration.traits.BuilderBuilder;
import org.apache.camel.v1.pipespec.integration.traits.PullSecretBuilder;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class TraitsFluent<A extends TraitsFluent<A>> extends BaseFluent<A>{
  public TraitsFluent() {
  }
  
  public TraitsFluent(Traits instance) {
    this.copyInstance(instance);
  }
  private Map<String,Addons> addons;
  private AffinityBuilder affinity;
  private BuilderBuilder builder;
  private CamelBuilder camel;
  private ContainerBuilder container;
  private CronBuilder cron;
  private DependenciesBuilder dependencies;
  private DeployerBuilder deployer;
  private DeploymentBuilder deployment;
  private EnvironmentBuilder environment;
  private ErrorHandlerBuilder errorHandler;
  private GcBuilder gc;
  private HealthBuilder health;
  private IngressBuilder ingress;
  private IstioBuilder istio;
  private JolokiaBuilder jolokia;
  private JvmBuilder jvm;
  private KameletsBuilder kamelets;
  private KedaBuilder keda;
  private KnativeBuilder knative;
  private KnativeServiceBuilder knativeService;
  private LoggingBuilder logging;
  private MasterBuilder master;
  private MountBuilder mount;
  private OpenapiBuilder openapi;
  private OwnerBuilder owner;
  private PdbBuilder pdb;
  private PlatformBuilder platform;
  private PodBuilder pod;
  private PrometheusBuilder prometheus;
  private PullSecretBuilder pullSecret;
  private QuarkusBuilder quarkus;
  private RegistryBuilder registry;
  private RouteBuilder route;
  private ServiceBuilder service;
  private ServiceBindingBuilder serviceBinding;
  private StrimziBuilder strimzi;
  private TolerationBuilder toleration;
  private TracingBuilder tracing;
  
  protected void copyInstance(Traits instance) {
    instance = (instance != null ? instance : new Traits());
    if (instance != null) {
          this.withAddons(instance.getAddons());
          this.withAffinity(instance.getAffinity());
          this.withBuilder(instance.getBuilder());
          this.withCamel(instance.getCamel());
          this.withContainer(instance.getContainer());
          this.withCron(instance.getCron());
          this.withDependencies(instance.getDependencies());
          this.withDeployer(instance.getDeployer());
          this.withDeployment(instance.getDeployment());
          this.withEnvironment(instance.getEnvironment());
          this.withErrorHandler(instance.getErrorHandler());
          this.withGc(instance.getGc());
          this.withHealth(instance.getHealth());
          this.withIngress(instance.getIngress());
          this.withIstio(instance.getIstio());
          this.withJolokia(instance.getJolokia());
          this.withJvm(instance.getJvm());
          this.withKamelets(instance.getKamelets());
          this.withKeda(instance.getKeda());
          this.withKnative(instance.getKnative());
          this.withKnativeService(instance.getKnativeService());
          this.withLogging(instance.getLogging());
          this.withMaster(instance.getMaster());
          this.withMount(instance.getMount());
          this.withOpenapi(instance.getOpenapi());
          this.withOwner(instance.getOwner());
          this.withPdb(instance.getPdb());
          this.withPlatform(instance.getPlatform());
          this.withPod(instance.getPod());
          this.withPrometheus(instance.getPrometheus());
          this.withPullSecret(instance.getPullSecret());
          this.withQuarkus(instance.getQuarkus());
          this.withRegistry(instance.getRegistry());
          this.withRoute(instance.getRoute());
          this.withService(instance.getService());
          this.withServiceBinding(instance.getServiceBinding());
          this.withStrimzi(instance.getStrimzi());
          this.withToleration(instance.getToleration());
          this.withTracing(instance.getTracing());
        }
  }
  
  public A addToAddons(String key,Addons value) {
    if(this.addons == null && key != null && value != null) { this.addons = new LinkedHashMap(); }
    if(key != null && value != null) {this.addons.put(key, value);} return (A)this;
  }
  
  public A addToAddons(Map<String,Addons> map) {
    if(this.addons == null && map != null) { this.addons = new LinkedHashMap(); }
    if(map != null) { this.addons.putAll(map);} return (A)this;
  }
  
  public A removeFromAddons(String key) {
    if(this.addons == null) { return (A) this; }
    if(key != null && this.addons != null) {this.addons.remove(key);} return (A)this;
  }
  
  public A removeFromAddons(Map<String,Addons> map) {
    if(this.addons == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.addons != null){this.addons.remove(key);}}} return (A)this;
  }
  
  public Map<String,Addons> getAddons() {
    return this.addons;
  }
  
  public <K,V>A withAddons(Map<String,Addons> addons) {
    if (addons == null) {
      this.addons = null;
    } else {
      this.addons = new LinkedHashMap(addons);
    }
    return (A) this;
  }
  
  public boolean hasAddons() {
    return this.addons != null;
  }
  
  public Affinity buildAffinity() {
    return this.affinity != null ? this.affinity.build() : null;
  }
  
  public A withAffinity(Affinity affinity) {
    this._visitables.remove("affinity");
    if (affinity != null) {
        this.affinity = new AffinityBuilder(affinity);
        this._visitables.get("affinity").add(this.affinity);
    } else {
        this.affinity = null;
        this._visitables.get("affinity").remove(this.affinity);
    }
    return (A) this;
  }
  
  public boolean hasAffinity() {
    return this.affinity != null;
  }
  
  public AffinityNested<A> withNewAffinity() {
    return new AffinityNested(null);
  }
  
  public AffinityNested<A> withNewAffinityLike(Affinity item) {
    return new AffinityNested(item);
  }
  
  public AffinityNested<A> editIntegrationAffinity() {
    return withNewAffinityLike(java.util.Optional.ofNullable(buildAffinity()).orElse(null));
  }
  
  public AffinityNested<A> editOrNewAffinity() {
    return withNewAffinityLike(java.util.Optional.ofNullable(buildAffinity()).orElse(new AffinityBuilder().build()));
  }
  
  public AffinityNested<A> editOrNewAffinityLike(Affinity item) {
    return withNewAffinityLike(java.util.Optional.ofNullable(buildAffinity()).orElse(item));
  }
  
  public Builder buildBuilder() {
    return this.builder != null ? this.builder.build() : null;
  }
  
  public A withBuilder(Builder builder) {
    this._visitables.remove("builder");
    if (builder != null) {
        this.builder = new BuilderBuilder(builder);
        this._visitables.get("builder").add(this.builder);
    } else {
        this.builder = null;
        this._visitables.get("builder").remove(this.builder);
    }
    return (A) this;
  }
  
  public boolean hasBuilder() {
    return this.builder != null;
  }
  
  public BuilderNested<A> withNewBuilder() {
    return new BuilderNested(null);
  }
  
  public BuilderNested<A> withNewBuilderLike(Builder item) {
    return new BuilderNested(item);
  }
  
  public BuilderNested<A> editBuilder() {
    return withNewBuilderLike(java.util.Optional.ofNullable(buildBuilder()).orElse(null));
  }
  
  public BuilderNested<A> editOrNewBuilder() {
    return withNewBuilderLike(java.util.Optional.ofNullable(buildBuilder()).orElse(new BuilderBuilder().build()));
  }
  
  public BuilderNested<A> editOrNewBuilderLike(Builder item) {
    return withNewBuilderLike(java.util.Optional.ofNullable(buildBuilder()).orElse(item));
  }
  
  public Camel buildCamel() {
    return this.camel != null ? this.camel.build() : null;
  }
  
  public A withCamel(Camel camel) {
    this._visitables.remove("camel");
    if (camel != null) {
        this.camel = new CamelBuilder(camel);
        this._visitables.get("camel").add(this.camel);
    } else {
        this.camel = null;
        this._visitables.get("camel").remove(this.camel);
    }
    return (A) this;
  }
  
  public boolean hasCamel() {
    return this.camel != null;
  }
  
  public CamelNested<A> withNewCamel() {
    return new CamelNested(null);
  }
  
  public CamelNested<A> withNewCamelLike(Camel item) {
    return new CamelNested(item);
  }
  
  public CamelNested<A> editIntegrationCamel() {
    return withNewCamelLike(java.util.Optional.ofNullable(buildCamel()).orElse(null));
  }
  
  public CamelNested<A> editOrNewCamel() {
    return withNewCamelLike(java.util.Optional.ofNullable(buildCamel()).orElse(new CamelBuilder().build()));
  }
  
  public CamelNested<A> editOrNewCamelLike(Camel item) {
    return withNewCamelLike(java.util.Optional.ofNullable(buildCamel()).orElse(item));
  }
  
  public Container buildContainer() {
    return this.container != null ? this.container.build() : null;
  }
  
  public A withContainer(Container container) {
    this._visitables.remove("container");
    if (container != null) {
        this.container = new ContainerBuilder(container);
        this._visitables.get("container").add(this.container);
    } else {
        this.container = null;
        this._visitables.get("container").remove(this.container);
    }
    return (A) this;
  }
  
  public boolean hasContainer() {
    return this.container != null;
  }
  
  public ContainerNested<A> withNewContainer() {
    return new ContainerNested(null);
  }
  
  public ContainerNested<A> withNewContainerLike(Container item) {
    return new ContainerNested(item);
  }
  
  public ContainerNested<A> editTraitsContainer() {
    return withNewContainerLike(java.util.Optional.ofNullable(buildContainer()).orElse(null));
  }
  
  public ContainerNested<A> editOrNewContainer() {
    return withNewContainerLike(java.util.Optional.ofNullable(buildContainer()).orElse(new ContainerBuilder().build()));
  }
  
  public ContainerNested<A> editOrNewContainerLike(Container item) {
    return withNewContainerLike(java.util.Optional.ofNullable(buildContainer()).orElse(item));
  }
  
  public Cron buildCron() {
    return this.cron != null ? this.cron.build() : null;
  }
  
  public A withCron(Cron cron) {
    this._visitables.remove("cron");
    if (cron != null) {
        this.cron = new CronBuilder(cron);
        this._visitables.get("cron").add(this.cron);
    } else {
        this.cron = null;
        this._visitables.get("cron").remove(this.cron);
    }
    return (A) this;
  }
  
  public boolean hasCron() {
    return this.cron != null;
  }
  
  public CronNested<A> withNewCron() {
    return new CronNested(null);
  }
  
  public CronNested<A> withNewCronLike(Cron item) {
    return new CronNested(item);
  }
  
  public CronNested<A> editIntegrationCron() {
    return withNewCronLike(java.util.Optional.ofNullable(buildCron()).orElse(null));
  }
  
  public CronNested<A> editOrNewCron() {
    return withNewCronLike(java.util.Optional.ofNullable(buildCron()).orElse(new CronBuilder().build()));
  }
  
  public CronNested<A> editOrNewCronLike(Cron item) {
    return withNewCronLike(java.util.Optional.ofNullable(buildCron()).orElse(item));
  }
  
  public Dependencies buildDependencies() {
    return this.dependencies != null ? this.dependencies.build() : null;
  }
  
  public A withDependencies(Dependencies dependencies) {
    this._visitables.remove("dependencies");
    if (dependencies != null) {
        this.dependencies = new DependenciesBuilder(dependencies);
        this._visitables.get("dependencies").add(this.dependencies);
    } else {
        this.dependencies = null;
        this._visitables.get("dependencies").remove(this.dependencies);
    }
    return (A) this;
  }
  
  public boolean hasDependencies() {
    return this.dependencies != null;
  }
  
  public DependenciesNested<A> withNewDependencies() {
    return new DependenciesNested(null);
  }
  
  public DependenciesNested<A> withNewDependenciesLike(Dependencies item) {
    return new DependenciesNested(item);
  }
  
  public DependenciesNested<A> editTraitsDependencies() {
    return withNewDependenciesLike(java.util.Optional.ofNullable(buildDependencies()).orElse(null));
  }
  
  public DependenciesNested<A> editOrNewDependencies() {
    return withNewDependenciesLike(java.util.Optional.ofNullable(buildDependencies()).orElse(new DependenciesBuilder().build()));
  }
  
  public DependenciesNested<A> editOrNewDependenciesLike(Dependencies item) {
    return withNewDependenciesLike(java.util.Optional.ofNullable(buildDependencies()).orElse(item));
  }
  
  public Deployer buildDeployer() {
    return this.deployer != null ? this.deployer.build() : null;
  }
  
  public A withDeployer(Deployer deployer) {
    this._visitables.remove("deployer");
    if (deployer != null) {
        this.deployer = new DeployerBuilder(deployer);
        this._visitables.get("deployer").add(this.deployer);
    } else {
        this.deployer = null;
        this._visitables.get("deployer").remove(this.deployer);
    }
    return (A) this;
  }
  
  public boolean hasDeployer() {
    return this.deployer != null;
  }
  
  public DeployerNested<A> withNewDeployer() {
    return new DeployerNested(null);
  }
  
  public DeployerNested<A> withNewDeployerLike(Deployer item) {
    return new DeployerNested(item);
  }
  
  public DeployerNested<A> editIntegrationDeployer() {
    return withNewDeployerLike(java.util.Optional.ofNullable(buildDeployer()).orElse(null));
  }
  
  public DeployerNested<A> editOrNewDeployer() {
    return withNewDeployerLike(java.util.Optional.ofNullable(buildDeployer()).orElse(new DeployerBuilder().build()));
  }
  
  public DeployerNested<A> editOrNewDeployerLike(Deployer item) {
    return withNewDeployerLike(java.util.Optional.ofNullable(buildDeployer()).orElse(item));
  }
  
  public Deployment buildDeployment() {
    return this.deployment != null ? this.deployment.build() : null;
  }
  
  public A withDeployment(Deployment deployment) {
    this._visitables.remove("deployment");
    if (deployment != null) {
        this.deployment = new DeploymentBuilder(deployment);
        this._visitables.get("deployment").add(this.deployment);
    } else {
        this.deployment = null;
        this._visitables.get("deployment").remove(this.deployment);
    }
    return (A) this;
  }
  
  public boolean hasDeployment() {
    return this.deployment != null;
  }
  
  public DeploymentNested<A> withNewDeployment() {
    return new DeploymentNested(null);
  }
  
  public DeploymentNested<A> withNewDeploymentLike(Deployment item) {
    return new DeploymentNested(item);
  }
  
  public DeploymentNested<A> editIntegrationDeployment() {
    return withNewDeploymentLike(java.util.Optional.ofNullable(buildDeployment()).orElse(null));
  }
  
  public DeploymentNested<A> editOrNewDeployment() {
    return withNewDeploymentLike(java.util.Optional.ofNullable(buildDeployment()).orElse(new DeploymentBuilder().build()));
  }
  
  public DeploymentNested<A> editOrNewDeploymentLike(Deployment item) {
    return withNewDeploymentLike(java.util.Optional.ofNullable(buildDeployment()).orElse(item));
  }
  
  public Environment buildEnvironment() {
    return this.environment != null ? this.environment.build() : null;
  }
  
  public A withEnvironment(Environment environment) {
    this._visitables.remove("environment");
    if (environment != null) {
        this.environment = new EnvironmentBuilder(environment);
        this._visitables.get("environment").add(this.environment);
    } else {
        this.environment = null;
        this._visitables.get("environment").remove(this.environment);
    }
    return (A) this;
  }
  
  public boolean hasEnvironment() {
    return this.environment != null;
  }
  
  public EnvironmentNested<A> withNewEnvironment() {
    return new EnvironmentNested(null);
  }
  
  public EnvironmentNested<A> withNewEnvironmentLike(Environment item) {
    return new EnvironmentNested(item);
  }
  
  public EnvironmentNested<A> editIntegrationEnvironment() {
    return withNewEnvironmentLike(java.util.Optional.ofNullable(buildEnvironment()).orElse(null));
  }
  
  public EnvironmentNested<A> editOrNewEnvironment() {
    return withNewEnvironmentLike(java.util.Optional.ofNullable(buildEnvironment()).orElse(new EnvironmentBuilder().build()));
  }
  
  public EnvironmentNested<A> editOrNewEnvironmentLike(Environment item) {
    return withNewEnvironmentLike(java.util.Optional.ofNullable(buildEnvironment()).orElse(item));
  }
  
  public ErrorHandler buildErrorHandler() {
    return this.errorHandler != null ? this.errorHandler.build() : null;
  }
  
  public A withErrorHandler(ErrorHandler errorHandler) {
    this._visitables.remove("errorHandler");
    if (errorHandler != null) {
        this.errorHandler = new ErrorHandlerBuilder(errorHandler);
        this._visitables.get("errorHandler").add(this.errorHandler);
    } else {
        this.errorHandler = null;
        this._visitables.get("errorHandler").remove(this.errorHandler);
    }
    return (A) this;
  }
  
  public boolean hasErrorHandler() {
    return this.errorHandler != null;
  }
  
  public ErrorHandlerNested<A> withNewErrorHandler() {
    return new ErrorHandlerNested(null);
  }
  
  public ErrorHandlerNested<A> withNewErrorHandlerLike(ErrorHandler item) {
    return new ErrorHandlerNested(item);
  }
  
  public ErrorHandlerNested<A> editIntegrationErrorHandler() {
    return withNewErrorHandlerLike(java.util.Optional.ofNullable(buildErrorHandler()).orElse(null));
  }
  
  public ErrorHandlerNested<A> editOrNewErrorHandler() {
    return withNewErrorHandlerLike(java.util.Optional.ofNullable(buildErrorHandler()).orElse(new ErrorHandlerBuilder().build()));
  }
  
  public ErrorHandlerNested<A> editOrNewErrorHandlerLike(ErrorHandler item) {
    return withNewErrorHandlerLike(java.util.Optional.ofNullable(buildErrorHandler()).orElse(item));
  }
  
  public Gc buildGc() {
    return this.gc != null ? this.gc.build() : null;
  }
  
  public A withGc(Gc gc) {
    this._visitables.remove("gc");
    if (gc != null) {
        this.gc = new GcBuilder(gc);
        this._visitables.get("gc").add(this.gc);
    } else {
        this.gc = null;
        this._visitables.get("gc").remove(this.gc);
    }
    return (A) this;
  }
  
  public boolean hasGc() {
    return this.gc != null;
  }
  
  public GcNested<A> withNewGc() {
    return new GcNested(null);
  }
  
  public GcNested<A> withNewGcLike(Gc item) {
    return new GcNested(item);
  }
  
  public GcNested<A> editIntegrationGc() {
    return withNewGcLike(java.util.Optional.ofNullable(buildGc()).orElse(null));
  }
  
  public GcNested<A> editOrNewGc() {
    return withNewGcLike(java.util.Optional.ofNullable(buildGc()).orElse(new GcBuilder().build()));
  }
  
  public GcNested<A> editOrNewGcLike(Gc item) {
    return withNewGcLike(java.util.Optional.ofNullable(buildGc()).orElse(item));
  }
  
  public Health buildHealth() {
    return this.health != null ? this.health.build() : null;
  }
  
  public A withHealth(Health health) {
    this._visitables.remove("health");
    if (health != null) {
        this.health = new HealthBuilder(health);
        this._visitables.get("health").add(this.health);
    } else {
        this.health = null;
        this._visitables.get("health").remove(this.health);
    }
    return (A) this;
  }
  
  public boolean hasHealth() {
    return this.health != null;
  }
  
  public HealthNested<A> withNewHealth() {
    return new HealthNested(null);
  }
  
  public HealthNested<A> withNewHealthLike(Health item) {
    return new HealthNested(item);
  }
  
  public HealthNested<A> editIntegrationHealth() {
    return withNewHealthLike(java.util.Optional.ofNullable(buildHealth()).orElse(null));
  }
  
  public HealthNested<A> editOrNewHealth() {
    return withNewHealthLike(java.util.Optional.ofNullable(buildHealth()).orElse(new HealthBuilder().build()));
  }
  
  public HealthNested<A> editOrNewHealthLike(Health item) {
    return withNewHealthLike(java.util.Optional.ofNullable(buildHealth()).orElse(item));
  }
  
  public Ingress buildIngress() {
    return this.ingress != null ? this.ingress.build() : null;
  }
  
  public A withIngress(Ingress ingress) {
    this._visitables.remove("ingress");
    if (ingress != null) {
        this.ingress = new IngressBuilder(ingress);
        this._visitables.get("ingress").add(this.ingress);
    } else {
        this.ingress = null;
        this._visitables.get("ingress").remove(this.ingress);
    }
    return (A) this;
  }
  
  public boolean hasIngress() {
    return this.ingress != null;
  }
  
  public IngressNested<A> withNewIngress() {
    return new IngressNested(null);
  }
  
  public IngressNested<A> withNewIngressLike(Ingress item) {
    return new IngressNested(item);
  }
  
  public IngressNested<A> editIntegrationIngress() {
    return withNewIngressLike(java.util.Optional.ofNullable(buildIngress()).orElse(null));
  }
  
  public IngressNested<A> editOrNewIngress() {
    return withNewIngressLike(java.util.Optional.ofNullable(buildIngress()).orElse(new IngressBuilder().build()));
  }
  
  public IngressNested<A> editOrNewIngressLike(Ingress item) {
    return withNewIngressLike(java.util.Optional.ofNullable(buildIngress()).orElse(item));
  }
  
  public Istio buildIstio() {
    return this.istio != null ? this.istio.build() : null;
  }
  
  public A withIstio(Istio istio) {
    this._visitables.remove("istio");
    if (istio != null) {
        this.istio = new IstioBuilder(istio);
        this._visitables.get("istio").add(this.istio);
    } else {
        this.istio = null;
        this._visitables.get("istio").remove(this.istio);
    }
    return (A) this;
  }
  
  public boolean hasIstio() {
    return this.istio != null;
  }
  
  public IstioNested<A> withNewIstio() {
    return new IstioNested(null);
  }
  
  public IstioNested<A> withNewIstioLike(Istio item) {
    return new IstioNested(item);
  }
  
  public IstioNested<A> editIntegrationIstio() {
    return withNewIstioLike(java.util.Optional.ofNullable(buildIstio()).orElse(null));
  }
  
  public IstioNested<A> editOrNewIstio() {
    return withNewIstioLike(java.util.Optional.ofNullable(buildIstio()).orElse(new IstioBuilder().build()));
  }
  
  public IstioNested<A> editOrNewIstioLike(Istio item) {
    return withNewIstioLike(java.util.Optional.ofNullable(buildIstio()).orElse(item));
  }
  
  public Jolokia buildJolokia() {
    return this.jolokia != null ? this.jolokia.build() : null;
  }
  
  public A withJolokia(Jolokia jolokia) {
    this._visitables.remove("jolokia");
    if (jolokia != null) {
        this.jolokia = new JolokiaBuilder(jolokia);
        this._visitables.get("jolokia").add(this.jolokia);
    } else {
        this.jolokia = null;
        this._visitables.get("jolokia").remove(this.jolokia);
    }
    return (A) this;
  }
  
  public boolean hasJolokia() {
    return this.jolokia != null;
  }
  
  public JolokiaNested<A> withNewJolokia() {
    return new JolokiaNested(null);
  }
  
  public JolokiaNested<A> withNewJolokiaLike(Jolokia item) {
    return new JolokiaNested(item);
  }
  
  public JolokiaNested<A> editIntegrationJolokia() {
    return withNewJolokiaLike(java.util.Optional.ofNullable(buildJolokia()).orElse(null));
  }
  
  public JolokiaNested<A> editOrNewJolokia() {
    return withNewJolokiaLike(java.util.Optional.ofNullable(buildJolokia()).orElse(new JolokiaBuilder().build()));
  }
  
  public JolokiaNested<A> editOrNewJolokiaLike(Jolokia item) {
    return withNewJolokiaLike(java.util.Optional.ofNullable(buildJolokia()).orElse(item));
  }
  
  public Jvm buildJvm() {
    return this.jvm != null ? this.jvm.build() : null;
  }
  
  public A withJvm(Jvm jvm) {
    this._visitables.remove("jvm");
    if (jvm != null) {
        this.jvm = new JvmBuilder(jvm);
        this._visitables.get("jvm").add(this.jvm);
    } else {
        this.jvm = null;
        this._visitables.get("jvm").remove(this.jvm);
    }
    return (A) this;
  }
  
  public boolean hasJvm() {
    return this.jvm != null;
  }
  
  public JvmNested<A> withNewJvm() {
    return new JvmNested(null);
  }
  
  public JvmNested<A> withNewJvmLike(Jvm item) {
    return new JvmNested(item);
  }
  
  public JvmNested<A> editIntegrationJvm() {
    return withNewJvmLike(java.util.Optional.ofNullable(buildJvm()).orElse(null));
  }
  
  public JvmNested<A> editOrNewJvm() {
    return withNewJvmLike(java.util.Optional.ofNullable(buildJvm()).orElse(new JvmBuilder().build()));
  }
  
  public JvmNested<A> editOrNewJvmLike(Jvm item) {
    return withNewJvmLike(java.util.Optional.ofNullable(buildJvm()).orElse(item));
  }
  
  public Kamelets buildKamelets() {
    return this.kamelets != null ? this.kamelets.build() : null;
  }
  
  public A withKamelets(Kamelets kamelets) {
    this._visitables.remove("kamelets");
    if (kamelets != null) {
        this.kamelets = new KameletsBuilder(kamelets);
        this._visitables.get("kamelets").add(this.kamelets);
    } else {
        this.kamelets = null;
        this._visitables.get("kamelets").remove(this.kamelets);
    }
    return (A) this;
  }
  
  public boolean hasKamelets() {
    return this.kamelets != null;
  }
  
  public KameletsNested<A> withNewKamelets() {
    return new KameletsNested(null);
  }
  
  public KameletsNested<A> withNewKameletsLike(Kamelets item) {
    return new KameletsNested(item);
  }
  
  public KameletsNested<A> editIntegrationKamelets() {
    return withNewKameletsLike(java.util.Optional.ofNullable(buildKamelets()).orElse(null));
  }
  
  public KameletsNested<A> editOrNewKamelets() {
    return withNewKameletsLike(java.util.Optional.ofNullable(buildKamelets()).orElse(new KameletsBuilder().build()));
  }
  
  public KameletsNested<A> editOrNewKameletsLike(Kamelets item) {
    return withNewKameletsLike(java.util.Optional.ofNullable(buildKamelets()).orElse(item));
  }
  
  public Keda buildKeda() {
    return this.keda != null ? this.keda.build() : null;
  }
  
  public A withKeda(Keda keda) {
    this._visitables.remove("keda");
    if (keda != null) {
        this.keda = new KedaBuilder(keda);
        this._visitables.get("keda").add(this.keda);
    } else {
        this.keda = null;
        this._visitables.get("keda").remove(this.keda);
    }
    return (A) this;
  }
  
  public boolean hasKeda() {
    return this.keda != null;
  }
  
  public KedaNested<A> withNewKeda() {
    return new KedaNested(null);
  }
  
  public KedaNested<A> withNewKedaLike(Keda item) {
    return new KedaNested(item);
  }
  
  public KedaNested<A> editIntegrationKeda() {
    return withNewKedaLike(java.util.Optional.ofNullable(buildKeda()).orElse(null));
  }
  
  public KedaNested<A> editOrNewKeda() {
    return withNewKedaLike(java.util.Optional.ofNullable(buildKeda()).orElse(new KedaBuilder().build()));
  }
  
  public KedaNested<A> editOrNewKedaLike(Keda item) {
    return withNewKedaLike(java.util.Optional.ofNullable(buildKeda()).orElse(item));
  }
  
  public Knative buildKnative() {
    return this.knative != null ? this.knative.build() : null;
  }
  
  public A withKnative(Knative knative) {
    this._visitables.remove("knative");
    if (knative != null) {
        this.knative = new KnativeBuilder(knative);
        this._visitables.get("knative").add(this.knative);
    } else {
        this.knative = null;
        this._visitables.get("knative").remove(this.knative);
    }
    return (A) this;
  }
  
  public boolean hasKnative() {
    return this.knative != null;
  }
  
  public KnativeNested<A> withNewKnative() {
    return new KnativeNested(null);
  }
  
  public KnativeNested<A> withNewKnativeLike(Knative item) {
    return new KnativeNested(item);
  }
  
  public KnativeNested<A> editIntegrationKnative() {
    return withNewKnativeLike(java.util.Optional.ofNullable(buildKnative()).orElse(null));
  }
  
  public KnativeNested<A> editOrNewKnative() {
    return withNewKnativeLike(java.util.Optional.ofNullable(buildKnative()).orElse(new KnativeBuilder().build()));
  }
  
  public KnativeNested<A> editOrNewKnativeLike(Knative item) {
    return withNewKnativeLike(java.util.Optional.ofNullable(buildKnative()).orElse(item));
  }
  
  public KnativeService buildKnativeService() {
    return this.knativeService != null ? this.knativeService.build() : null;
  }
  
  public A withKnativeService(KnativeService knativeService) {
    this._visitables.remove("knativeService");
    if (knativeService != null) {
        this.knativeService = new KnativeServiceBuilder(knativeService);
        this._visitables.get("knativeService").add(this.knativeService);
    } else {
        this.knativeService = null;
        this._visitables.get("knativeService").remove(this.knativeService);
    }
    return (A) this;
  }
  
  public boolean hasKnativeService() {
    return this.knativeService != null;
  }
  
  public KnativeServiceNested<A> withNewKnativeService() {
    return new KnativeServiceNested(null);
  }
  
  public KnativeServiceNested<A> withNewKnativeServiceLike(KnativeService item) {
    return new KnativeServiceNested(item);
  }
  
  public KnativeServiceNested<A> editIntegrationKnativeService() {
    return withNewKnativeServiceLike(java.util.Optional.ofNullable(buildKnativeService()).orElse(null));
  }
  
  public KnativeServiceNested<A> editOrNewKnativeService() {
    return withNewKnativeServiceLike(java.util.Optional.ofNullable(buildKnativeService()).orElse(new KnativeServiceBuilder().build()));
  }
  
  public KnativeServiceNested<A> editOrNewKnativeServiceLike(KnativeService item) {
    return withNewKnativeServiceLike(java.util.Optional.ofNullable(buildKnativeService()).orElse(item));
  }
  
  public Logging buildLogging() {
    return this.logging != null ? this.logging.build() : null;
  }
  
  public A withLogging(Logging logging) {
    this._visitables.remove("logging");
    if (logging != null) {
        this.logging = new LoggingBuilder(logging);
        this._visitables.get("logging").add(this.logging);
    } else {
        this.logging = null;
        this._visitables.get("logging").remove(this.logging);
    }
    return (A) this;
  }
  
  public boolean hasLogging() {
    return this.logging != null;
  }
  
  public LoggingNested<A> withNewLogging() {
    return new LoggingNested(null);
  }
  
  public LoggingNested<A> withNewLoggingLike(Logging item) {
    return new LoggingNested(item);
  }
  
  public LoggingNested<A> editIntegrationLogging() {
    return withNewLoggingLike(java.util.Optional.ofNullable(buildLogging()).orElse(null));
  }
  
  public LoggingNested<A> editOrNewLogging() {
    return withNewLoggingLike(java.util.Optional.ofNullable(buildLogging()).orElse(new LoggingBuilder().build()));
  }
  
  public LoggingNested<A> editOrNewLoggingLike(Logging item) {
    return withNewLoggingLike(java.util.Optional.ofNullable(buildLogging()).orElse(item));
  }
  
  public Master buildMaster() {
    return this.master != null ? this.master.build() : null;
  }
  
  public A withMaster(Master master) {
    this._visitables.remove("master");
    if (master != null) {
        this.master = new MasterBuilder(master);
        this._visitables.get("master").add(this.master);
    } else {
        this.master = null;
        this._visitables.get("master").remove(this.master);
    }
    return (A) this;
  }
  
  public boolean hasMaster() {
    return this.master != null;
  }
  
  public MasterNested<A> withNewMaster() {
    return new MasterNested(null);
  }
  
  public MasterNested<A> withNewMasterLike(Master item) {
    return new MasterNested(item);
  }
  
  public MasterNested<A> editIntegrationMaster() {
    return withNewMasterLike(java.util.Optional.ofNullable(buildMaster()).orElse(null));
  }
  
  public MasterNested<A> editOrNewMaster() {
    return withNewMasterLike(java.util.Optional.ofNullable(buildMaster()).orElse(new MasterBuilder().build()));
  }
  
  public MasterNested<A> editOrNewMasterLike(Master item) {
    return withNewMasterLike(java.util.Optional.ofNullable(buildMaster()).orElse(item));
  }
  
  public Mount buildMount() {
    return this.mount != null ? this.mount.build() : null;
  }
  
  public A withMount(Mount mount) {
    this._visitables.remove("mount");
    if (mount != null) {
        this.mount = new MountBuilder(mount);
        this._visitables.get("mount").add(this.mount);
    } else {
        this.mount = null;
        this._visitables.get("mount").remove(this.mount);
    }
    return (A) this;
  }
  
  public boolean hasMount() {
    return this.mount != null;
  }
  
  public MountNested<A> withNewMount() {
    return new MountNested(null);
  }
  
  public MountNested<A> withNewMountLike(Mount item) {
    return new MountNested(item);
  }
  
  public MountNested<A> editIntegrationMount() {
    return withNewMountLike(java.util.Optional.ofNullable(buildMount()).orElse(null));
  }
  
  public MountNested<A> editOrNewMount() {
    return withNewMountLike(java.util.Optional.ofNullable(buildMount()).orElse(new MountBuilder().build()));
  }
  
  public MountNested<A> editOrNewMountLike(Mount item) {
    return withNewMountLike(java.util.Optional.ofNullable(buildMount()).orElse(item));
  }
  
  public Openapi buildOpenapi() {
    return this.openapi != null ? this.openapi.build() : null;
  }
  
  public A withOpenapi(Openapi openapi) {
    this._visitables.remove("openapi");
    if (openapi != null) {
        this.openapi = new OpenapiBuilder(openapi);
        this._visitables.get("openapi").add(this.openapi);
    } else {
        this.openapi = null;
        this._visitables.get("openapi").remove(this.openapi);
    }
    return (A) this;
  }
  
  public boolean hasOpenapi() {
    return this.openapi != null;
  }
  
  public OpenapiNested<A> withNewOpenapi() {
    return new OpenapiNested(null);
  }
  
  public OpenapiNested<A> withNewOpenapiLike(Openapi item) {
    return new OpenapiNested(item);
  }
  
  public OpenapiNested<A> editIntegrationOpenapi() {
    return withNewOpenapiLike(java.util.Optional.ofNullable(buildOpenapi()).orElse(null));
  }
  
  public OpenapiNested<A> editOrNewOpenapi() {
    return withNewOpenapiLike(java.util.Optional.ofNullable(buildOpenapi()).orElse(new OpenapiBuilder().build()));
  }
  
  public OpenapiNested<A> editOrNewOpenapiLike(Openapi item) {
    return withNewOpenapiLike(java.util.Optional.ofNullable(buildOpenapi()).orElse(item));
  }
  
  public Owner buildOwner() {
    return this.owner != null ? this.owner.build() : null;
  }
  
  public A withOwner(Owner owner) {
    this._visitables.remove("owner");
    if (owner != null) {
        this.owner = new OwnerBuilder(owner);
        this._visitables.get("owner").add(this.owner);
    } else {
        this.owner = null;
        this._visitables.get("owner").remove(this.owner);
    }
    return (A) this;
  }
  
  public boolean hasOwner() {
    return this.owner != null;
  }
  
  public OwnerNested<A> withNewOwner() {
    return new OwnerNested(null);
  }
  
  public OwnerNested<A> withNewOwnerLike(Owner item) {
    return new OwnerNested(item);
  }
  
  public OwnerNested<A> editIntegrationOwner() {
    return withNewOwnerLike(java.util.Optional.ofNullable(buildOwner()).orElse(null));
  }
  
  public OwnerNested<A> editOrNewOwner() {
    return withNewOwnerLike(java.util.Optional.ofNullable(buildOwner()).orElse(new OwnerBuilder().build()));
  }
  
  public OwnerNested<A> editOrNewOwnerLike(Owner item) {
    return withNewOwnerLike(java.util.Optional.ofNullable(buildOwner()).orElse(item));
  }
  
  public Pdb buildPdb() {
    return this.pdb != null ? this.pdb.build() : null;
  }
  
  public A withPdb(Pdb pdb) {
    this._visitables.remove("pdb");
    if (pdb != null) {
        this.pdb = new PdbBuilder(pdb);
        this._visitables.get("pdb").add(this.pdb);
    } else {
        this.pdb = null;
        this._visitables.get("pdb").remove(this.pdb);
    }
    return (A) this;
  }
  
  public boolean hasPdb() {
    return this.pdb != null;
  }
  
  public PdbNested<A> withNewPdb() {
    return new PdbNested(null);
  }
  
  public PdbNested<A> withNewPdbLike(Pdb item) {
    return new PdbNested(item);
  }
  
  public PdbNested<A> editIntegrationPdb() {
    return withNewPdbLike(java.util.Optional.ofNullable(buildPdb()).orElse(null));
  }
  
  public PdbNested<A> editOrNewPdb() {
    return withNewPdbLike(java.util.Optional.ofNullable(buildPdb()).orElse(new PdbBuilder().build()));
  }
  
  public PdbNested<A> editOrNewPdbLike(Pdb item) {
    return withNewPdbLike(java.util.Optional.ofNullable(buildPdb()).orElse(item));
  }
  
  public Platform buildPlatform() {
    return this.platform != null ? this.platform.build() : null;
  }
  
  public A withPlatform(Platform platform) {
    this._visitables.remove("platform");
    if (platform != null) {
        this.platform = new PlatformBuilder(platform);
        this._visitables.get("platform").add(this.platform);
    } else {
        this.platform = null;
        this._visitables.get("platform").remove(this.platform);
    }
    return (A) this;
  }
  
  public boolean hasPlatform() {
    return this.platform != null;
  }
  
  public PlatformNested<A> withNewPlatform() {
    return new PlatformNested(null);
  }
  
  public PlatformNested<A> withNewPlatformLike(Platform item) {
    return new PlatformNested(item);
  }
  
  public PlatformNested<A> editIntegrationPlatform() {
    return withNewPlatformLike(java.util.Optional.ofNullable(buildPlatform()).orElse(null));
  }
  
  public PlatformNested<A> editOrNewPlatform() {
    return withNewPlatformLike(java.util.Optional.ofNullable(buildPlatform()).orElse(new PlatformBuilder().build()));
  }
  
  public PlatformNested<A> editOrNewPlatformLike(Platform item) {
    return withNewPlatformLike(java.util.Optional.ofNullable(buildPlatform()).orElse(item));
  }
  
  public Pod buildPod() {
    return this.pod != null ? this.pod.build() : null;
  }
  
  public A withPod(Pod pod) {
    this._visitables.remove("pod");
    if (pod != null) {
        this.pod = new PodBuilder(pod);
        this._visitables.get("pod").add(this.pod);
    } else {
        this.pod = null;
        this._visitables.get("pod").remove(this.pod);
    }
    return (A) this;
  }
  
  public boolean hasPod() {
    return this.pod != null;
  }
  
  public PodNested<A> withNewPod() {
    return new PodNested(null);
  }
  
  public PodNested<A> withNewPodLike(Pod item) {
    return new PodNested(item);
  }
  
  public PodNested<A> editIntegrationPod() {
    return withNewPodLike(java.util.Optional.ofNullable(buildPod()).orElse(null));
  }
  
  public PodNested<A> editOrNewPod() {
    return withNewPodLike(java.util.Optional.ofNullable(buildPod()).orElse(new PodBuilder().build()));
  }
  
  public PodNested<A> editOrNewPodLike(Pod item) {
    return withNewPodLike(java.util.Optional.ofNullable(buildPod()).orElse(item));
  }
  
  public Prometheus buildPrometheus() {
    return this.prometheus != null ? this.prometheus.build() : null;
  }
  
  public A withPrometheus(Prometheus prometheus) {
    this._visitables.remove("prometheus");
    if (prometheus != null) {
        this.prometheus = new PrometheusBuilder(prometheus);
        this._visitables.get("prometheus").add(this.prometheus);
    } else {
        this.prometheus = null;
        this._visitables.get("prometheus").remove(this.prometheus);
    }
    return (A) this;
  }
  
  public boolean hasPrometheus() {
    return this.prometheus != null;
  }
  
  public PrometheusNested<A> withNewPrometheus() {
    return new PrometheusNested(null);
  }
  
  public PrometheusNested<A> withNewPrometheusLike(Prometheus item) {
    return new PrometheusNested(item);
  }
  
  public PrometheusNested<A> editIntegrationPrometheus() {
    return withNewPrometheusLike(java.util.Optional.ofNullable(buildPrometheus()).orElse(null));
  }
  
  public PrometheusNested<A> editOrNewPrometheus() {
    return withNewPrometheusLike(java.util.Optional.ofNullable(buildPrometheus()).orElse(new PrometheusBuilder().build()));
  }
  
  public PrometheusNested<A> editOrNewPrometheusLike(Prometheus item) {
    return withNewPrometheusLike(java.util.Optional.ofNullable(buildPrometheus()).orElse(item));
  }
  
  public PullSecret buildPullSecret() {
    return this.pullSecret != null ? this.pullSecret.build() : null;
  }
  
  public A withPullSecret(PullSecret pullSecret) {
    this._visitables.remove("pullSecret");
    if (pullSecret != null) {
        this.pullSecret = new PullSecretBuilder(pullSecret);
        this._visitables.get("pullSecret").add(this.pullSecret);
    } else {
        this.pullSecret = null;
        this._visitables.get("pullSecret").remove(this.pullSecret);
    }
    return (A) this;
  }
  
  public boolean hasPullSecret() {
    return this.pullSecret != null;
  }
  
  public PullSecretNested<A> withNewPullSecret() {
    return new PullSecretNested(null);
  }
  
  public PullSecretNested<A> withNewPullSecretLike(PullSecret item) {
    return new PullSecretNested(item);
  }
  
  public PullSecretNested<A> editIntegrationPullSecret() {
    return withNewPullSecretLike(java.util.Optional.ofNullable(buildPullSecret()).orElse(null));
  }
  
  public PullSecretNested<A> editOrNewPullSecret() {
    return withNewPullSecretLike(java.util.Optional.ofNullable(buildPullSecret()).orElse(new PullSecretBuilder().build()));
  }
  
  public PullSecretNested<A> editOrNewPullSecretLike(PullSecret item) {
    return withNewPullSecretLike(java.util.Optional.ofNullable(buildPullSecret()).orElse(item));
  }
  
  public Quarkus buildQuarkus() {
    return this.quarkus != null ? this.quarkus.build() : null;
  }
  
  public A withQuarkus(Quarkus quarkus) {
    this._visitables.remove("quarkus");
    if (quarkus != null) {
        this.quarkus = new QuarkusBuilder(quarkus);
        this._visitables.get("quarkus").add(this.quarkus);
    } else {
        this.quarkus = null;
        this._visitables.get("quarkus").remove(this.quarkus);
    }
    return (A) this;
  }
  
  public boolean hasQuarkus() {
    return this.quarkus != null;
  }
  
  public QuarkusNested<A> withNewQuarkus() {
    return new QuarkusNested(null);
  }
  
  public QuarkusNested<A> withNewQuarkusLike(Quarkus item) {
    return new QuarkusNested(item);
  }
  
  public QuarkusNested<A> editIntegrationQuarkus() {
    return withNewQuarkusLike(java.util.Optional.ofNullable(buildQuarkus()).orElse(null));
  }
  
  public QuarkusNested<A> editOrNewQuarkus() {
    return withNewQuarkusLike(java.util.Optional.ofNullable(buildQuarkus()).orElse(new QuarkusBuilder().build()));
  }
  
  public QuarkusNested<A> editOrNewQuarkusLike(Quarkus item) {
    return withNewQuarkusLike(java.util.Optional.ofNullable(buildQuarkus()).orElse(item));
  }
  
  public Registry buildRegistry() {
    return this.registry != null ? this.registry.build() : null;
  }
  
  public A withRegistry(Registry registry) {
    this._visitables.remove("registry");
    if (registry != null) {
        this.registry = new RegistryBuilder(registry);
        this._visitables.get("registry").add(this.registry);
    } else {
        this.registry = null;
        this._visitables.get("registry").remove(this.registry);
    }
    return (A) this;
  }
  
  public boolean hasRegistry() {
    return this.registry != null;
  }
  
  public RegistryNested<A> withNewRegistry() {
    return new RegistryNested(null);
  }
  
  public RegistryNested<A> withNewRegistryLike(Registry item) {
    return new RegistryNested(item);
  }
  
  public RegistryNested<A> editTraitsRegistry() {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(null));
  }
  
  public RegistryNested<A> editOrNewRegistry() {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(new RegistryBuilder().build()));
  }
  
  public RegistryNested<A> editOrNewRegistryLike(Registry item) {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(item));
  }
  
  public Route buildRoute() {
    return this.route != null ? this.route.build() : null;
  }
  
  public A withRoute(Route route) {
    this._visitables.remove("route");
    if (route != null) {
        this.route = new RouteBuilder(route);
        this._visitables.get("route").add(this.route);
    } else {
        this.route = null;
        this._visitables.get("route").remove(this.route);
    }
    return (A) this;
  }
  
  public boolean hasRoute() {
    return this.route != null;
  }
  
  public RouteNested<A> withNewRoute() {
    return new RouteNested(null);
  }
  
  public RouteNested<A> withNewRouteLike(Route item) {
    return new RouteNested(item);
  }
  
  public RouteNested<A> editIntegrationRoute() {
    return withNewRouteLike(java.util.Optional.ofNullable(buildRoute()).orElse(null));
  }
  
  public RouteNested<A> editOrNewRoute() {
    return withNewRouteLike(java.util.Optional.ofNullable(buildRoute()).orElse(new RouteBuilder().build()));
  }
  
  public RouteNested<A> editOrNewRouteLike(Route item) {
    return withNewRouteLike(java.util.Optional.ofNullable(buildRoute()).orElse(item));
  }
  
  public Service buildService() {
    return this.service != null ? this.service.build() : null;
  }
  
  public A withService(Service service) {
    this._visitables.remove("service");
    if (service != null) {
        this.service = new ServiceBuilder(service);
        this._visitables.get("service").add(this.service);
    } else {
        this.service = null;
        this._visitables.get("service").remove(this.service);
    }
    return (A) this;
  }
  
  public boolean hasService() {
    return this.service != null;
  }
  
  public ServiceNested<A> withNewService() {
    return new ServiceNested(null);
  }
  
  public ServiceNested<A> withNewServiceLike(Service item) {
    return new ServiceNested(item);
  }
  
  public ServiceNested<A> editIntegrationService() {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(null));
  }
  
  public ServiceNested<A> editOrNewService() {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(new ServiceBuilder().build()));
  }
  
  public ServiceNested<A> editOrNewServiceLike(Service item) {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(item));
  }
  
  public ServiceBinding buildServiceBinding() {
    return this.serviceBinding != null ? this.serviceBinding.build() : null;
  }
  
  public A withServiceBinding(ServiceBinding serviceBinding) {
    this._visitables.remove("serviceBinding");
    if (serviceBinding != null) {
        this.serviceBinding = new ServiceBindingBuilder(serviceBinding);
        this._visitables.get("serviceBinding").add(this.serviceBinding);
    } else {
        this.serviceBinding = null;
        this._visitables.get("serviceBinding").remove(this.serviceBinding);
    }
    return (A) this;
  }
  
  public boolean hasServiceBinding() {
    return this.serviceBinding != null;
  }
  
  public ServiceBindingNested<A> withNewServiceBinding() {
    return new ServiceBindingNested(null);
  }
  
  public ServiceBindingNested<A> withNewServiceBindingLike(ServiceBinding item) {
    return new ServiceBindingNested(item);
  }
  
  public ServiceBindingNested<A> editIntegrationServiceBinding() {
    return withNewServiceBindingLike(java.util.Optional.ofNullable(buildServiceBinding()).orElse(null));
  }
  
  public ServiceBindingNested<A> editOrNewServiceBinding() {
    return withNewServiceBindingLike(java.util.Optional.ofNullable(buildServiceBinding()).orElse(new ServiceBindingBuilder().build()));
  }
  
  public ServiceBindingNested<A> editOrNewServiceBindingLike(ServiceBinding item) {
    return withNewServiceBindingLike(java.util.Optional.ofNullable(buildServiceBinding()).orElse(item));
  }
  
  public Strimzi buildStrimzi() {
    return this.strimzi != null ? this.strimzi.build() : null;
  }
  
  public A withStrimzi(Strimzi strimzi) {
    this._visitables.remove("strimzi");
    if (strimzi != null) {
        this.strimzi = new StrimziBuilder(strimzi);
        this._visitables.get("strimzi").add(this.strimzi);
    } else {
        this.strimzi = null;
        this._visitables.get("strimzi").remove(this.strimzi);
    }
    return (A) this;
  }
  
  public boolean hasStrimzi() {
    return this.strimzi != null;
  }
  
  public StrimziNested<A> withNewStrimzi() {
    return new StrimziNested(null);
  }
  
  public StrimziNested<A> withNewStrimziLike(Strimzi item) {
    return new StrimziNested(item);
  }
  
  public StrimziNested<A> editIntegrationStrimzi() {
    return withNewStrimziLike(java.util.Optional.ofNullable(buildStrimzi()).orElse(null));
  }
  
  public StrimziNested<A> editOrNewStrimzi() {
    return withNewStrimziLike(java.util.Optional.ofNullable(buildStrimzi()).orElse(new StrimziBuilder().build()));
  }
  
  public StrimziNested<A> editOrNewStrimziLike(Strimzi item) {
    return withNewStrimziLike(java.util.Optional.ofNullable(buildStrimzi()).orElse(item));
  }
  
  public Toleration buildToleration() {
    return this.toleration != null ? this.toleration.build() : null;
  }
  
  public A withToleration(Toleration toleration) {
    this._visitables.remove("toleration");
    if (toleration != null) {
        this.toleration = new TolerationBuilder(toleration);
        this._visitables.get("toleration").add(this.toleration);
    } else {
        this.toleration = null;
        this._visitables.get("toleration").remove(this.toleration);
    }
    return (A) this;
  }
  
  public boolean hasToleration() {
    return this.toleration != null;
  }
  
  public TolerationNested<A> withNewToleration() {
    return new TolerationNested(null);
  }
  
  public TolerationNested<A> withNewTolerationLike(Toleration item) {
    return new TolerationNested(item);
  }
  
  public TolerationNested<A> editIntegrationToleration() {
    return withNewTolerationLike(java.util.Optional.ofNullable(buildToleration()).orElse(null));
  }
  
  public TolerationNested<A> editOrNewToleration() {
    return withNewTolerationLike(java.util.Optional.ofNullable(buildToleration()).orElse(new TolerationBuilder().build()));
  }
  
  public TolerationNested<A> editOrNewTolerationLike(Toleration item) {
    return withNewTolerationLike(java.util.Optional.ofNullable(buildToleration()).orElse(item));
  }
  
  public Tracing buildTracing() {
    return this.tracing != null ? this.tracing.build() : null;
  }
  
  public A withTracing(Tracing tracing) {
    this._visitables.remove("tracing");
    if (tracing != null) {
        this.tracing = new TracingBuilder(tracing);
        this._visitables.get("tracing").add(this.tracing);
    } else {
        this.tracing = null;
        this._visitables.get("tracing").remove(this.tracing);
    }
    return (A) this;
  }
  
  public boolean hasTracing() {
    return this.tracing != null;
  }
  
  public TracingNested<A> withNewTracing() {
    return new TracingNested(null);
  }
  
  public TracingNested<A> withNewTracingLike(Tracing item) {
    return new TracingNested(item);
  }
  
  public TracingNested<A> editIntegrationTracing() {
    return withNewTracingLike(java.util.Optional.ofNullable(buildTracing()).orElse(null));
  }
  
  public TracingNested<A> editOrNewTracing() {
    return withNewTracingLike(java.util.Optional.ofNullable(buildTracing()).orElse(new TracingBuilder().build()));
  }
  
  public TracingNested<A> editOrNewTracingLike(Tracing item) {
    return withNewTracingLike(java.util.Optional.ofNullable(buildTracing()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    TraitsFluent that = (TraitsFluent) o;
    if (!java.util.Objects.equals(addons, that.addons)) return false;
    if (!java.util.Objects.equals(affinity, that.affinity)) return false;
    if (!java.util.Objects.equals(builder, that.builder)) return false;
    if (!java.util.Objects.equals(camel, that.camel)) return false;
    if (!java.util.Objects.equals(container, that.container)) return false;
    if (!java.util.Objects.equals(cron, that.cron)) return false;
    if (!java.util.Objects.equals(dependencies, that.dependencies)) return false;
    if (!java.util.Objects.equals(deployer, that.deployer)) return false;
    if (!java.util.Objects.equals(deployment, that.deployment)) return false;
    if (!java.util.Objects.equals(environment, that.environment)) return false;
    if (!java.util.Objects.equals(errorHandler, that.errorHandler)) return false;
    if (!java.util.Objects.equals(gc, that.gc)) return false;
    if (!java.util.Objects.equals(health, that.health)) return false;
    if (!java.util.Objects.equals(ingress, that.ingress)) return false;
    if (!java.util.Objects.equals(istio, that.istio)) return false;
    if (!java.util.Objects.equals(jolokia, that.jolokia)) return false;
    if (!java.util.Objects.equals(jvm, that.jvm)) return false;
    if (!java.util.Objects.equals(kamelets, that.kamelets)) return false;
    if (!java.util.Objects.equals(keda, that.keda)) return false;
    if (!java.util.Objects.equals(knative, that.knative)) return false;
    if (!java.util.Objects.equals(knativeService, that.knativeService)) return false;
    if (!java.util.Objects.equals(logging, that.logging)) return false;
    if (!java.util.Objects.equals(master, that.master)) return false;
    if (!java.util.Objects.equals(mount, that.mount)) return false;
    if (!java.util.Objects.equals(openapi, that.openapi)) return false;
    if (!java.util.Objects.equals(owner, that.owner)) return false;
    if (!java.util.Objects.equals(pdb, that.pdb)) return false;
    if (!java.util.Objects.equals(platform, that.platform)) return false;
    if (!java.util.Objects.equals(pod, that.pod)) return false;
    if (!java.util.Objects.equals(prometheus, that.prometheus)) return false;
    if (!java.util.Objects.equals(pullSecret, that.pullSecret)) return false;
    if (!java.util.Objects.equals(quarkus, that.quarkus)) return false;
    if (!java.util.Objects.equals(registry, that.registry)) return false;
    if (!java.util.Objects.equals(route, that.route)) return false;
    if (!java.util.Objects.equals(service, that.service)) return false;
    if (!java.util.Objects.equals(serviceBinding, that.serviceBinding)) return false;
    if (!java.util.Objects.equals(strimzi, that.strimzi)) return false;
    if (!java.util.Objects.equals(toleration, that.toleration)) return false;
    if (!java.util.Objects.equals(tracing, that.tracing)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(addons,  affinity,  builder,  camel,  container,  cron,  dependencies,  deployer,  deployment,  environment,  errorHandler,  gc,  health,  ingress,  istio,  jolokia,  jvm,  kamelets,  keda,  knative,  knativeService,  logging,  master,  mount,  openapi,  owner,  pdb,  platform,  pod,  prometheus,  pullSecret,  quarkus,  registry,  route,  service,  serviceBinding,  strimzi,  toleration,  tracing,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (addons != null && !addons.isEmpty()) { sb.append("addons:"); sb.append(addons + ","); }
    if (affinity != null) { sb.append("affinity:"); sb.append(affinity + ","); }
    if (builder != null) { sb.append("builder:"); sb.append(builder + ","); }
    if (camel != null) { sb.append("camel:"); sb.append(camel + ","); }
    if (container != null) { sb.append("container:"); sb.append(container + ","); }
    if (cron != null) { sb.append("cron:"); sb.append(cron + ","); }
    if (dependencies != null) { sb.append("dependencies:"); sb.append(dependencies + ","); }
    if (deployer != null) { sb.append("deployer:"); sb.append(deployer + ","); }
    if (deployment != null) { sb.append("deployment:"); sb.append(deployment + ","); }
    if (environment != null) { sb.append("environment:"); sb.append(environment + ","); }
    if (errorHandler != null) { sb.append("errorHandler:"); sb.append(errorHandler + ","); }
    if (gc != null) { sb.append("gc:"); sb.append(gc + ","); }
    if (health != null) { sb.append("health:"); sb.append(health + ","); }
    if (ingress != null) { sb.append("ingress:"); sb.append(ingress + ","); }
    if (istio != null) { sb.append("istio:"); sb.append(istio + ","); }
    if (jolokia != null) { sb.append("jolokia:"); sb.append(jolokia + ","); }
    if (jvm != null) { sb.append("jvm:"); sb.append(jvm + ","); }
    if (kamelets != null) { sb.append("kamelets:"); sb.append(kamelets + ","); }
    if (keda != null) { sb.append("keda:"); sb.append(keda + ","); }
    if (knative != null) { sb.append("knative:"); sb.append(knative + ","); }
    if (knativeService != null) { sb.append("knativeService:"); sb.append(knativeService + ","); }
    if (logging != null) { sb.append("logging:"); sb.append(logging + ","); }
    if (master != null) { sb.append("master:"); sb.append(master + ","); }
    if (mount != null) { sb.append("mount:"); sb.append(mount + ","); }
    if (openapi != null) { sb.append("openapi:"); sb.append(openapi + ","); }
    if (owner != null) { sb.append("owner:"); sb.append(owner + ","); }
    if (pdb != null) { sb.append("pdb:"); sb.append(pdb + ","); }
    if (platform != null) { sb.append("platform:"); sb.append(platform + ","); }
    if (pod != null) { sb.append("pod:"); sb.append(pod + ","); }
    if (prometheus != null) { sb.append("prometheus:"); sb.append(prometheus + ","); }
    if (pullSecret != null) { sb.append("pullSecret:"); sb.append(pullSecret + ","); }
    if (quarkus != null) { sb.append("quarkus:"); sb.append(quarkus + ","); }
    if (registry != null) { sb.append("registry:"); sb.append(registry + ","); }
    if (route != null) { sb.append("route:"); sb.append(route + ","); }
    if (service != null) { sb.append("service:"); sb.append(service + ","); }
    if (serviceBinding != null) { sb.append("serviceBinding:"); sb.append(serviceBinding + ","); }
    if (strimzi != null) { sb.append("strimzi:"); sb.append(strimzi + ","); }
    if (toleration != null) { sb.append("toleration:"); sb.append(toleration + ","); }
    if (tracing != null) { sb.append("tracing:"); sb.append(tracing); }
    sb.append("}");
    return sb.toString();
  }
  public class AffinityNested<N> extends AffinityFluent<AffinityNested<N>> implements Nested<N>{
    AffinityNested(Affinity item) {
      this.builder = new AffinityBuilder(this, item);
    }
    AffinityBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withAffinity(builder.build());
    }
    
    public N endIntegrationAffinity() {
      return and();
    }
    
  
  }
  public class BuilderNested<N> extends BuilderFluent<BuilderNested<N>> implements Nested<N>{
    BuilderNested(Builder item) {
      this.builder = new BuilderBuilder(this, item);
    }
    BuilderBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withBuilder(builder.build());
    }
    
    public N endBuilder() {
      return and();
    }
    
  
  }
  public class CamelNested<N> extends CamelFluent<CamelNested<N>> implements Nested<N>{
    CamelNested(Camel item) {
      this.builder = new CamelBuilder(this, item);
    }
    CamelBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withCamel(builder.build());
    }
    
    public N endIntegrationCamel() {
      return and();
    }
    
  
  }
  public class ContainerNested<N> extends ContainerFluent<ContainerNested<N>> implements Nested<N>{
    ContainerNested(Container item) {
      this.builder = new ContainerBuilder(this, item);
    }
    ContainerBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withContainer(builder.build());
    }
    
    public N endTraitsContainer() {
      return and();
    }
    
  
  }
  public class CronNested<N> extends CronFluent<CronNested<N>> implements Nested<N>{
    CronNested(Cron item) {
      this.builder = new CronBuilder(this, item);
    }
    CronBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withCron(builder.build());
    }
    
    public N endIntegrationCron() {
      return and();
    }
    
  
  }
  public class DependenciesNested<N> extends DependenciesFluent<DependenciesNested<N>> implements Nested<N>{
    DependenciesNested(Dependencies item) {
      this.builder = new DependenciesBuilder(this, item);
    }
    DependenciesBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withDependencies(builder.build());
    }
    
    public N endTraitsDependencies() {
      return and();
    }
    
  
  }
  public class DeployerNested<N> extends DeployerFluent<DeployerNested<N>> implements Nested<N>{
    DeployerNested(Deployer item) {
      this.builder = new DeployerBuilder(this, item);
    }
    DeployerBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withDeployer(builder.build());
    }
    
    public N endIntegrationDeployer() {
      return and();
    }
    
  
  }
  public class DeploymentNested<N> extends DeploymentFluent<DeploymentNested<N>> implements Nested<N>{
    DeploymentNested(Deployment item) {
      this.builder = new DeploymentBuilder(this, item);
    }
    DeploymentBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withDeployment(builder.build());
    }
    
    public N endIntegrationDeployment() {
      return and();
    }
    
  
  }
  public class EnvironmentNested<N> extends EnvironmentFluent<EnvironmentNested<N>> implements Nested<N>{
    EnvironmentNested(Environment item) {
      this.builder = new EnvironmentBuilder(this, item);
    }
    EnvironmentBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withEnvironment(builder.build());
    }
    
    public N endIntegrationEnvironment() {
      return and();
    }
    
  
  }
  public class ErrorHandlerNested<N> extends ErrorHandlerFluent<ErrorHandlerNested<N>> implements Nested<N>{
    ErrorHandlerNested(ErrorHandler item) {
      this.builder = new ErrorHandlerBuilder(this, item);
    }
    ErrorHandlerBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withErrorHandler(builder.build());
    }
    
    public N endIntegrationErrorHandler() {
      return and();
    }
    
  
  }
  public class GcNested<N> extends GcFluent<GcNested<N>> implements Nested<N>{
    GcNested(Gc item) {
      this.builder = new GcBuilder(this, item);
    }
    GcBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withGc(builder.build());
    }
    
    public N endIntegrationGc() {
      return and();
    }
    
  
  }
  public class HealthNested<N> extends HealthFluent<HealthNested<N>> implements Nested<N>{
    HealthNested(Health item) {
      this.builder = new HealthBuilder(this, item);
    }
    HealthBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withHealth(builder.build());
    }
    
    public N endIntegrationHealth() {
      return and();
    }
    
  
  }
  public class IngressNested<N> extends IngressFluent<IngressNested<N>> implements Nested<N>{
    IngressNested(Ingress item) {
      this.builder = new IngressBuilder(this, item);
    }
    IngressBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withIngress(builder.build());
    }
    
    public N endIntegrationIngress() {
      return and();
    }
    
  
  }
  public class IstioNested<N> extends IstioFluent<IstioNested<N>> implements Nested<N>{
    IstioNested(Istio item) {
      this.builder = new IstioBuilder(this, item);
    }
    IstioBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withIstio(builder.build());
    }
    
    public N endIntegrationIstio() {
      return and();
    }
    
  
  }
  public class JolokiaNested<N> extends JolokiaFluent<JolokiaNested<N>> implements Nested<N>{
    JolokiaNested(Jolokia item) {
      this.builder = new JolokiaBuilder(this, item);
    }
    JolokiaBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withJolokia(builder.build());
    }
    
    public N endIntegrationJolokia() {
      return and();
    }
    
  
  }
  public class JvmNested<N> extends JvmFluent<JvmNested<N>> implements Nested<N>{
    JvmNested(Jvm item) {
      this.builder = new JvmBuilder(this, item);
    }
    JvmBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withJvm(builder.build());
    }
    
    public N endIntegrationJvm() {
      return and();
    }
    
  
  }
  public class KameletsNested<N> extends KameletsFluent<KameletsNested<N>> implements Nested<N>{
    KameletsNested(Kamelets item) {
      this.builder = new KameletsBuilder(this, item);
    }
    KameletsBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withKamelets(builder.build());
    }
    
    public N endIntegrationKamelets() {
      return and();
    }
    
  
  }
  public class KedaNested<N> extends KedaFluent<KedaNested<N>> implements Nested<N>{
    KedaNested(Keda item) {
      this.builder = new KedaBuilder(this, item);
    }
    KedaBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withKeda(builder.build());
    }
    
    public N endIntegrationKeda() {
      return and();
    }
    
  
  }
  public class KnativeNested<N> extends KnativeFluent<KnativeNested<N>> implements Nested<N>{
    KnativeNested(Knative item) {
      this.builder = new KnativeBuilder(this, item);
    }
    KnativeBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withKnative(builder.build());
    }
    
    public N endIntegrationKnative() {
      return and();
    }
    
  
  }
  public class KnativeServiceNested<N> extends KnativeServiceFluent<KnativeServiceNested<N>> implements Nested<N>{
    KnativeServiceNested(KnativeService item) {
      this.builder = new KnativeServiceBuilder(this, item);
    }
    KnativeServiceBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withKnativeService(builder.build());
    }
    
    public N endIntegrationKnativeService() {
      return and();
    }
    
  
  }
  public class LoggingNested<N> extends LoggingFluent<LoggingNested<N>> implements Nested<N>{
    LoggingNested(Logging item) {
      this.builder = new LoggingBuilder(this, item);
    }
    LoggingBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withLogging(builder.build());
    }
    
    public N endIntegrationLogging() {
      return and();
    }
    
  
  }
  public class MasterNested<N> extends MasterFluent<MasterNested<N>> implements Nested<N>{
    MasterNested(Master item) {
      this.builder = new MasterBuilder(this, item);
    }
    MasterBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withMaster(builder.build());
    }
    
    public N endIntegrationMaster() {
      return and();
    }
    
  
  }
  public class MountNested<N> extends MountFluent<MountNested<N>> implements Nested<N>{
    MountNested(Mount item) {
      this.builder = new MountBuilder(this, item);
    }
    MountBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withMount(builder.build());
    }
    
    public N endIntegrationMount() {
      return and();
    }
    
  
  }
  public class OpenapiNested<N> extends OpenapiFluent<OpenapiNested<N>> implements Nested<N>{
    OpenapiNested(Openapi item) {
      this.builder = new OpenapiBuilder(this, item);
    }
    OpenapiBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withOpenapi(builder.build());
    }
    
    public N endIntegrationOpenapi() {
      return and();
    }
    
  
  }
  public class OwnerNested<N> extends OwnerFluent<OwnerNested<N>> implements Nested<N>{
    OwnerNested(Owner item) {
      this.builder = new OwnerBuilder(this, item);
    }
    OwnerBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withOwner(builder.build());
    }
    
    public N endIntegrationOwner() {
      return and();
    }
    
  
  }
  public class PdbNested<N> extends PdbFluent<PdbNested<N>> implements Nested<N>{
    PdbNested(Pdb item) {
      this.builder = new PdbBuilder(this, item);
    }
    PdbBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withPdb(builder.build());
    }
    
    public N endIntegrationPdb() {
      return and();
    }
    
  
  }
  public class PlatformNested<N> extends PlatformFluent<PlatformNested<N>> implements Nested<N>{
    PlatformNested(Platform item) {
      this.builder = new PlatformBuilder(this, item);
    }
    PlatformBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withPlatform(builder.build());
    }
    
    public N endIntegrationPlatform() {
      return and();
    }
    
  
  }
  public class PodNested<N> extends PodFluent<PodNested<N>> implements Nested<N>{
    PodNested(Pod item) {
      this.builder = new PodBuilder(this, item);
    }
    PodBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withPod(builder.build());
    }
    
    public N endIntegrationPod() {
      return and();
    }
    
  
  }
  public class PrometheusNested<N> extends PrometheusFluent<PrometheusNested<N>> implements Nested<N>{
    PrometheusNested(Prometheus item) {
      this.builder = new PrometheusBuilder(this, item);
    }
    PrometheusBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withPrometheus(builder.build());
    }
    
    public N endIntegrationPrometheus() {
      return and();
    }
    
  
  }
  public class PullSecretNested<N> extends PullSecretFluent<PullSecretNested<N>> implements Nested<N>{
    PullSecretNested(PullSecret item) {
      this.builder = new PullSecretBuilder(this, item);
    }
    PullSecretBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withPullSecret(builder.build());
    }
    
    public N endIntegrationPullSecret() {
      return and();
    }
    
  
  }
  public class QuarkusNested<N> extends QuarkusFluent<QuarkusNested<N>> implements Nested<N>{
    QuarkusNested(Quarkus item) {
      this.builder = new QuarkusBuilder(this, item);
    }
    QuarkusBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withQuarkus(builder.build());
    }
    
    public N endIntegrationQuarkus() {
      return and();
    }
    
  
  }
  public class RegistryNested<N> extends RegistryFluent<RegistryNested<N>> implements Nested<N>{
    RegistryNested(Registry item) {
      this.builder = new RegistryBuilder(this, item);
    }
    RegistryBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withRegistry(builder.build());
    }
    
    public N endTraitsRegistry() {
      return and();
    }
    
  
  }
  public class RouteNested<N> extends RouteFluent<RouteNested<N>> implements Nested<N>{
    RouteNested(Route item) {
      this.builder = new RouteBuilder(this, item);
    }
    RouteBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withRoute(builder.build());
    }
    
    public N endIntegrationRoute() {
      return and();
    }
    
  
  }
  public class ServiceNested<N> extends ServiceFluent<ServiceNested<N>> implements Nested<N>{
    ServiceNested(Service item) {
      this.builder = new ServiceBuilder(this, item);
    }
    ServiceBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withService(builder.build());
    }
    
    public N endIntegrationService() {
      return and();
    }
    
  
  }
  public class ServiceBindingNested<N> extends ServiceBindingFluent<ServiceBindingNested<N>> implements Nested<N>{
    ServiceBindingNested(ServiceBinding item) {
      this.builder = new ServiceBindingBuilder(this, item);
    }
    ServiceBindingBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withServiceBinding(builder.build());
    }
    
    public N endIntegrationServiceBinding() {
      return and();
    }
    
  
  }
  public class StrimziNested<N> extends StrimziFluent<StrimziNested<N>> implements Nested<N>{
    StrimziNested(Strimzi item) {
      this.builder = new StrimziBuilder(this, item);
    }
    StrimziBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withStrimzi(builder.build());
    }
    
    public N endIntegrationStrimzi() {
      return and();
    }
    
  
  }
  public class TolerationNested<N> extends TolerationFluent<TolerationNested<N>> implements Nested<N>{
    TolerationNested(Toleration item) {
      this.builder = new TolerationBuilder(this, item);
    }
    TolerationBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withToleration(builder.build());
    }
    
    public N endIntegrationToleration() {
      return and();
    }
    
  
  }
  public class TracingNested<N> extends TracingFluent<TracingNested<N>> implements Nested<N>{
    TracingNested(Tracing item) {
      this.builder = new TracingBuilder(this, item);
    }
    TracingBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withTracing(builder.build());
    }
    
    public N endIntegrationTracing() {
      return and();
    }
    
  
  }

}