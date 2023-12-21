package org.apache.camel.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"artifacts","baseImage","conditions","digest","duration","error","failure","image","observedGeneration","phase","rootImage","startedAt"})
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
public class BuildStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * a list of artifacts contained in the build
     */
    @com.fasterxml.jackson.annotation.JsonProperty("artifacts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a list of artifacts contained in the build")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.buildstatus.Artifacts> artifacts;

    public java.util.List<org.apache.camel.v1.buildstatus.Artifacts> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(java.util.List<org.apache.camel.v1.buildstatus.Artifacts> artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * the base image used for this build
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the base image used for this build")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String baseImage;

    public String getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    /**
     * a list of conditions occurred during the build
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a list of conditions occurred during the build")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.buildstatus.Conditions> conditions;

    public java.util.List<org.apache.camel.v1.buildstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<org.apache.camel.v1.buildstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * the digest from image
     */
    @com.fasterxml.jackson.annotation.JsonProperty("digest")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the digest from image")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String digest;

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * how long it took for the build Change to Duration / ISO 8601 when CRD uses OpenAPI spec v3 https://github.com/OAI/OpenAPI-Specification/issues/845
     */
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("how long it took for the build Change to Duration / ISO 8601 when CRD uses OpenAPI spec v3 https://github.com/OAI/OpenAPI-Specification/issues/845")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String duration;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * the error description (if any)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the error description (if any)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    /**
     * the reason of the failure (if any)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failure")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the reason of the failure (if any)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildstatus.Failure failure;

    public org.apache.camel.v1.buildstatus.Failure getFailure() {
        return failure;
    }

    public void setFailure(org.apache.camel.v1.buildstatus.Failure failure) {
        this.failure = failure;
    }

    /**
     * the image name built
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the image name built")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * ObservedGeneration is the most recent generation observed for this Build.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observedGeneration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ObservedGeneration is the most recent generation observed for this Build.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long observedGeneration;

    public Long getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    /**
     * describes the phase
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("describes the phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * root image (the first image from which the incremental image has started)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rootImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("root image (the first image from which the incremental image has started)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String rootImage;

    public String getRootImage() {
        return rootImage;
    }

    public void setRootImage(String rootImage) {
        this.rootImage = rootImage;
    }

    /**
     * the time when it started
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startedAt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the time when it started")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.time.ZonedDateTime startedAt;

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssVV")
    public java.time.ZonedDateTime getStartedAt() {
        return startedAt;
    }

    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss[XXX][VV]")
    public void setStartedAt(java.time.ZonedDateTime startedAt) {
        this.startedAt = startedAt;
    }
}

