package org.apache.camel.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"artifacts","baseImage","conditions","digest","failure","image","observedGeneration","phase","platform","rootImage","runtimeProvider","runtimeVersion","version"})
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
public class IntegrationKitStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * list of artifacts used by the kit
     */
    @com.fasterxml.jackson.annotation.JsonProperty("artifacts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("list of artifacts used by the kit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.integrationkitstatus.Artifacts> artifacts;

    public java.util.List<org.apache.camel.v1.integrationkitstatus.Artifacts> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(java.util.List<org.apache.camel.v1.integrationkitstatus.Artifacts> artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * base image used by the kit (could be another IntegrationKit)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("base image used by the kit (could be another IntegrationKit)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String baseImage;

    public String getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    /**
     * a list of conditions which happened for the events related the kit
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a list of conditions which happened for the events related the kit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.integrationkitstatus.Conditions> conditions;

    public java.util.List<org.apache.camel.v1.integrationkitstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<org.apache.camel.v1.integrationkitstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * actual image digest of the kit
     */
    @com.fasterxml.jackson.annotation.JsonProperty("digest")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("actual image digest of the kit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String digest;

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * failure reason (if any)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failure")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("failure reason (if any)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationkitstatus.Failure failure;

    public org.apache.camel.v1.integrationkitstatus.Failure getFailure() {
        return failure;
    }

    public void setFailure(org.apache.camel.v1.integrationkitstatus.Failure failure) {
        this.failure = failure;
    }

    /**
     * actual image name of the kit
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("actual image name of the kit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * ObservedGeneration is the most recent generation observed for this IntegrationKit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observedGeneration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ObservedGeneration is the most recent generation observed for this IntegrationKit.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long observedGeneration;

    public Long getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    /**
     * phase of the kit
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("phase of the kit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * the platform for which this kit was configured
     */
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the platform for which this kit was configured")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String platform;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * root image used by the kit (the first image from which the incremental image has started, typically a JDK/JRE base image)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rootImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("root image used by the kit (the first image from which the incremental image has started, typically a JDK/JRE base image)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String rootImage;

    public String getRootImage() {
        return rootImage;
    }

    public void setRootImage(String rootImage) {
        this.rootImage = rootImage;
    }

    /**
     * the runtime provider for which this kit was configured
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeProvider")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the runtime provider for which this kit was configured")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String runtimeProvider;

    public String getRuntimeProvider() {
        return runtimeProvider;
    }

    public void setRuntimeProvider(String runtimeProvider) {
        this.runtimeProvider = runtimeProvider;
    }

    /**
     * the runtime version for which this kit was configured
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the runtime version for which this kit was configured")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String runtimeVersion;

    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * the Camel K operator version for which this kit was configured
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the Camel K operator version for which this kit was configured")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

