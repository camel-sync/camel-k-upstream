package org.apache.camel.v1.integrationplatformspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"3scale","addons","affinity","builder","camel","container","cron","dependencies","deployer","deployment","environment","error-handler","gc","health","ingress","istio","jolokia","jvm","kamelets","keda","knative","knative-service","logging","master","mount","openapi","owner","pdb","platform","pod","prometheus","pull-secret","quarkus","registry","route","service","service-binding","strimzi","toleration","tracing"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class Traits implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("3scale")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits._3scale _3scale;

    public org.apache.camel.v1.integrationplatformspec.traits._3scale get_3scale() {
        return _3scale;
    }

    public void set_3scale(org.apache.camel.v1.integrationplatformspec.traits._3scale _3scale) {
        this._3scale = _3scale;
    }

    /**
     * The extension point with addon traits
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addons")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The extension point with addon traits")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1.integrationplatformspec.traits.Addons> addons;

    public java.util.Map<java.lang.String, org.apache.camel.v1.integrationplatformspec.traits.Addons> getAddons() {
        return addons;
    }

    public void setAddons(java.util.Map<java.lang.String, org.apache.camel.v1.integrationplatformspec.traits.Addons> addons) {
        this.addons = addons;
    }

    /**
     * The configuration of Affinity trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("affinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Affinity trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Affinity affinity;

    public org.apache.camel.v1.integrationplatformspec.traits.Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(org.apache.camel.v1.integrationplatformspec.traits.Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * The configuration of Builder trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("builder")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Builder trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Builder builder;

    public org.apache.camel.v1.integrationplatformspec.traits.Builder getBuilder() {
        return builder;
    }

    public void setBuilder(org.apache.camel.v1.integrationplatformspec.traits.Builder builder) {
        this.builder = builder;
    }

    /**
     * The configuration of Camel trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("camel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Camel trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Camel camel;

    public org.apache.camel.v1.integrationplatformspec.traits.Camel getCamel() {
        return camel;
    }

    public void setCamel(org.apache.camel.v1.integrationplatformspec.traits.Camel camel) {
        this.camel = camel;
    }

    /**
     * The configuration of Container trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("container")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Container trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Container container;

    public org.apache.camel.v1.integrationplatformspec.traits.Container getContainer() {
        return container;
    }

    public void setContainer(org.apache.camel.v1.integrationplatformspec.traits.Container container) {
        this.container = container;
    }

    /**
     * The configuration of Cron trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cron")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Cron trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Cron cron;

    public org.apache.camel.v1.integrationplatformspec.traits.Cron getCron() {
        return cron;
    }

    public void setCron(org.apache.camel.v1.integrationplatformspec.traits.Cron cron) {
        this.cron = cron;
    }

    /**
     * The configuration of Dependencies trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Dependencies trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Dependencies dependencies;

    public org.apache.camel.v1.integrationplatformspec.traits.Dependencies getDependencies() {
        return dependencies;
    }

    public void setDependencies(org.apache.camel.v1.integrationplatformspec.traits.Dependencies dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * The configuration of Deployer trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Deployer trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Deployer deployer;

    public org.apache.camel.v1.integrationplatformspec.traits.Deployer getDeployer() {
        return deployer;
    }

    public void setDeployer(org.apache.camel.v1.integrationplatformspec.traits.Deployer deployer) {
        this.deployer = deployer;
    }

    /**
     * The configuration of Deployment trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployment")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Deployment trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Deployment deployment;

    public org.apache.camel.v1.integrationplatformspec.traits.Deployment getDeployment() {
        return deployment;
    }

    public void setDeployment(org.apache.camel.v1.integrationplatformspec.traits.Deployment deployment) {
        this.deployment = deployment;
    }

    /**
     * The configuration of Environment trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environment")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Environment trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Environment environment;

    public org.apache.camel.v1.integrationplatformspec.traits.Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(org.apache.camel.v1.integrationplatformspec.traits.Environment environment) {
        this.environment = environment;
    }

    /**
     * The configuration of Error Handler trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("error-handler")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Error Handler trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.ErrorHandler errorHandler;

    public org.apache.camel.v1.integrationplatformspec.traits.ErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public void setErrorHandler(org.apache.camel.v1.integrationplatformspec.traits.ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    /**
     * The configuration of GC trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of GC trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Gc gc;

    public org.apache.camel.v1.integrationplatformspec.traits.Gc getGc() {
        return gc;
    }

    public void setGc(org.apache.camel.v1.integrationplatformspec.traits.Gc gc) {
        this.gc = gc;
    }

    /**
     * The configuration of Health trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("health")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Health trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Health health;

    public org.apache.camel.v1.integrationplatformspec.traits.Health getHealth() {
        return health;
    }

    public void setHealth(org.apache.camel.v1.integrationplatformspec.traits.Health health) {
        this.health = health;
    }

    /**
     * The configuration of Ingress trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Ingress trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Ingress ingress;

    public org.apache.camel.v1.integrationplatformspec.traits.Ingress getIngress() {
        return ingress;
    }

    public void setIngress(org.apache.camel.v1.integrationplatformspec.traits.Ingress ingress) {
        this.ingress = ingress;
    }

    /**
     * The configuration of Istio trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("istio")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Istio trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Istio istio;

    public org.apache.camel.v1.integrationplatformspec.traits.Istio getIstio() {
        return istio;
    }

    public void setIstio(org.apache.camel.v1.integrationplatformspec.traits.Istio istio) {
        this.istio = istio;
    }

    /**
     * The configuration of Jolokia trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jolokia")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Jolokia trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Jolokia jolokia;

    public org.apache.camel.v1.integrationplatformspec.traits.Jolokia getJolokia() {
        return jolokia;
    }

    public void setJolokia(org.apache.camel.v1.integrationplatformspec.traits.Jolokia jolokia) {
        this.jolokia = jolokia;
    }

    /**
     * The configuration of JVM trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jvm")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of JVM trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Jvm jvm;

    public org.apache.camel.v1.integrationplatformspec.traits.Jvm getJvm() {
        return jvm;
    }

    public void setJvm(org.apache.camel.v1.integrationplatformspec.traits.Jvm jvm) {
        this.jvm = jvm;
    }

    /**
     * The configuration of Kamelets trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kamelets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Kamelets trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Kamelets kamelets;

    public org.apache.camel.v1.integrationplatformspec.traits.Kamelets getKamelets() {
        return kamelets;
    }

    public void setKamelets(org.apache.camel.v1.integrationplatformspec.traits.Kamelets kamelets) {
        this.kamelets = kamelets;
    }

    /**
     * Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keda")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Keda keda;

    public org.apache.camel.v1.integrationplatformspec.traits.Keda getKeda() {
        return keda;
    }

    public void setKeda(org.apache.camel.v1.integrationplatformspec.traits.Keda keda) {
        this.keda = keda;
    }

    /**
     * The configuration of Knative trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("knative")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Knative trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Knative knative;

    public org.apache.camel.v1.integrationplatformspec.traits.Knative getKnative() {
        return knative;
    }

    public void setKnative(org.apache.camel.v1.integrationplatformspec.traits.Knative knative) {
        this.knative = knative;
    }

    /**
     * The configuration of Knative Service trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("knative-service")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Knative Service trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.KnativeService knativeService;

    public org.apache.camel.v1.integrationplatformspec.traits.KnativeService getKnativeService() {
        return knativeService;
    }

    public void setKnativeService(org.apache.camel.v1.integrationplatformspec.traits.KnativeService knativeService) {
        this.knativeService = knativeService;
    }

    /**
     * The configuration of Logging trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Logging trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Logging logging;

    public org.apache.camel.v1.integrationplatformspec.traits.Logging getLogging() {
        return logging;
    }

    public void setLogging(org.apache.camel.v1.integrationplatformspec.traits.Logging logging) {
        this.logging = logging;
    }

    /**
     * Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("master")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Master master;

    public org.apache.camel.v1.integrationplatformspec.traits.Master getMaster() {
        return master;
    }

    public void setMaster(org.apache.camel.v1.integrationplatformspec.traits.Master master) {
        this.master = master;
    }

    /**
     * The configuration of Mount trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Mount trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Mount mount;

    public org.apache.camel.v1.integrationplatformspec.traits.Mount getMount() {
        return mount;
    }

    public void setMount(org.apache.camel.v1.integrationplatformspec.traits.Mount mount) {
        this.mount = mount;
    }

    /**
     * The configuration of OpenAPI trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("openapi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of OpenAPI trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Openapi openapi;

    public org.apache.camel.v1.integrationplatformspec.traits.Openapi getOpenapi() {
        return openapi;
    }

    public void setOpenapi(org.apache.camel.v1.integrationplatformspec.traits.Openapi openapi) {
        this.openapi = openapi;
    }

    /**
     * The configuration of Owner trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Owner trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Owner owner;

    public org.apache.camel.v1.integrationplatformspec.traits.Owner getOwner() {
        return owner;
    }

    public void setOwner(org.apache.camel.v1.integrationplatformspec.traits.Owner owner) {
        this.owner = owner;
    }

    /**
     * The configuration of PDB trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pdb")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of PDB trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Pdb pdb;

    public org.apache.camel.v1.integrationplatformspec.traits.Pdb getPdb() {
        return pdb;
    }

    public void setPdb(org.apache.camel.v1.integrationplatformspec.traits.Pdb pdb) {
        this.pdb = pdb;
    }

    /**
     * The configuration of Platform trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Platform trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Platform platform;

    public org.apache.camel.v1.integrationplatformspec.traits.Platform getPlatform() {
        return platform;
    }

    public void setPlatform(org.apache.camel.v1.integrationplatformspec.traits.Platform platform) {
        this.platform = platform;
    }

    /**
     * The configuration of Pod trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Pod trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Pod pod;

    public org.apache.camel.v1.integrationplatformspec.traits.Pod getPod() {
        return pod;
    }

    public void setPod(org.apache.camel.v1.integrationplatformspec.traits.Pod pod) {
        this.pod = pod;
    }

    /**
     * The configuration of Prometheus trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prometheus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Prometheus trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Prometheus prometheus;

    public org.apache.camel.v1.integrationplatformspec.traits.Prometheus getPrometheus() {
        return prometheus;
    }

    public void setPrometheus(org.apache.camel.v1.integrationplatformspec.traits.Prometheus prometheus) {
        this.prometheus = prometheus;
    }

    /**
     * The configuration of Pull Secret trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pull-secret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Pull Secret trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.PullSecret pullSecret;

    public org.apache.camel.v1.integrationplatformspec.traits.PullSecret getPullSecret() {
        return pullSecret;
    }

    public void setPullSecret(org.apache.camel.v1.integrationplatformspec.traits.PullSecret pullSecret) {
        this.pullSecret = pullSecret;
    }

    /**
     * The configuration of Quarkus trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quarkus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Quarkus trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Quarkus quarkus;

    public org.apache.camel.v1.integrationplatformspec.traits.Quarkus getQuarkus() {
        return quarkus;
    }

    public void setQuarkus(org.apache.camel.v1.integrationplatformspec.traits.Quarkus quarkus) {
        this.quarkus = quarkus;
    }

    /**
     * The configuration of Registry trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("registry")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Registry trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Registry registry;

    public org.apache.camel.v1.integrationplatformspec.traits.Registry getRegistry() {
        return registry;
    }

    public void setRegistry(org.apache.camel.v1.integrationplatformspec.traits.Registry registry) {
        this.registry = registry;
    }

    /**
     * The configuration of Route trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("route")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Route trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Route route;

    public org.apache.camel.v1.integrationplatformspec.traits.Route getRoute() {
        return route;
    }

    public void setRoute(org.apache.camel.v1.integrationplatformspec.traits.Route route) {
        this.route = route;
    }

    /**
     * The configuration of Service trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Service trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Service service;

    public org.apache.camel.v1.integrationplatformspec.traits.Service getService() {
        return service;
    }

    public void setService(org.apache.camel.v1.integrationplatformspec.traits.Service service) {
        this.service = service;
    }

    /**
     * The configuration of Service Binding trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("service-binding")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Service Binding trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.ServiceBinding serviceBinding;

    public org.apache.camel.v1.integrationplatformspec.traits.ServiceBinding getServiceBinding() {
        return serviceBinding;
    }

    public void setServiceBinding(org.apache.camel.v1.integrationplatformspec.traits.ServiceBinding serviceBinding) {
        this.serviceBinding = serviceBinding;
    }

    /**
     * Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("strimzi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Strimzi strimzi;

    public org.apache.camel.v1.integrationplatformspec.traits.Strimzi getStrimzi() {
        return strimzi;
    }

    public void setStrimzi(org.apache.camel.v1.integrationplatformspec.traits.Strimzi strimzi) {
        this.strimzi = strimzi;
    }

    /**
     * The configuration of Toleration trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toleration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of Toleration trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Toleration toleration;

    public org.apache.camel.v1.integrationplatformspec.traits.Toleration getToleration() {
        return toleration;
    }

    public void setToleration(org.apache.camel.v1.integrationplatformspec.traits.Toleration toleration) {
        this.toleration = toleration;
    }

    /**
     * Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tracing")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.Tracing tracing;

    public org.apache.camel.v1.integrationplatformspec.traits.Tracing getTracing() {
        return tracing;
    }

    public void setTracing(org.apache.camel.v1.integrationplatformspec.traits.Tracing tracing) {
        this.tracing = tracing;
    }
}

