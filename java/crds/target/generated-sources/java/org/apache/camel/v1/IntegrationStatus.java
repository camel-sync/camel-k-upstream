package org.apache.camel.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"capabilities","conditions","configuration","dependencies","digest","generatedSources","image","integrationKit","lastInitTimestamp","observedGeneration","phase","platform","profile","replicas","runtimeProvider","runtimeVersion","selector","version"})
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
public class IntegrationStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * features offered by the Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("features offered by the Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> capabilities;

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(java.util.List<String> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * a list of events happened for the Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a list of events happened for the Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.integrationstatus.Conditions> conditions;

    public java.util.List<org.apache.camel.v1.integrationstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<org.apache.camel.v1.integrationstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * Deprecated: a list of configuration specification
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: a list of configuration specification")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.integrationstatus.Configuration> configuration;

    public java.util.List<org.apache.camel.v1.integrationstatus.Configuration> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(java.util.List<org.apache.camel.v1.integrationstatus.Configuration> configuration) {
        this.configuration = configuration;
    }

    /**
     * a list of dependencies needed by the application
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a list of dependencies needed by the application")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> dependencies;

    public java.util.List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(java.util.List<String> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * the digest calculated for this Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("digest")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the digest calculated for this Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String digest;

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * a list of sources generated for this Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("generatedSources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a list of sources generated for this Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.integrationstatus.GeneratedSources> generatedSources;

    public java.util.List<org.apache.camel.v1.integrationstatus.GeneratedSources> getGeneratedSources() {
        return generatedSources;
    }

    public void setGeneratedSources(java.util.List<org.apache.camel.v1.integrationstatus.GeneratedSources> generatedSources) {
        this.generatedSources = generatedSources;
    }

    /**
     * the container image used
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the container image used")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * the reference of the `IntegrationKit` which is used for this Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("integrationKit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the reference of the `IntegrationKit` which is used for this Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationstatus.IntegrationKit integrationKit;

    public org.apache.camel.v1.integrationstatus.IntegrationKit getIntegrationKit() {
        return integrationKit;
    }

    public void setIntegrationKit(org.apache.camel.v1.integrationstatus.IntegrationKit integrationKit) {
        this.integrationKit = integrationKit;
    }

    /**
     * the timestamp representing the last time when this integration was initialized.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastInitTimestamp")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the timestamp representing the last time when this integration was initialized.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime lastInitTimestamp;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getLastInitTimestamp() {
        return lastInitTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setLastInitTimestamp(java.time.ZonedDateTime lastInitTimestamp) {
        this.lastInitTimestamp = lastInitTimestamp;
    }

    /**
     * ObservedGeneration is the most recent generation observed for this Integration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observedGeneration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ObservedGeneration is the most recent generation observed for this Integration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long observedGeneration;

    public Long getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    /**
     * the actual phase
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the actual phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * The IntegrationPlatform watching this Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The IntegrationPlatform watching this Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String platform;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * the profile needed to run this Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the profile needed to run this Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String profile;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * the number of replicas
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the number of replicas")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * the runtime provider targeted for this Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeProvider")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the runtime provider targeted for this Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String runtimeProvider;

    public String getRuntimeProvider() {
        return runtimeProvider;
    }

    public void setRuntimeProvider(String runtimeProvider) {
        this.runtimeProvider = runtimeProvider;
    }

    /**
     * the runtime version targeted for this Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the runtime version targeted for this Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String runtimeVersion;

    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * label selector
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("label selector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String selector;

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    /**
     * the operator version
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the operator version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

