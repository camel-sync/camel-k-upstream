package org.apache.camel.v1.integrationplatformstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"PublishStrategyOptions","baseImage","buildCatalogToolTimeout","buildConfiguration","maven","maxRunningBuilds","publishStrategy","registry","runtimeProvider","runtimeVersion","timeout"})
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
public class Build implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Generic options that can used by any publish strategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PublishStrategyOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Generic options that can used by any publish strategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> PublishStrategyOptions;

    public java.util.Map<java.lang.String, String> getPublishStrategyOptions() {
        return PublishStrategyOptions;
    }

    public void setPublishStrategyOptions(java.util.Map<java.lang.String, String> PublishStrategyOptions) {
        this.PublishStrategyOptions = PublishStrategyOptions;
    }

    /**
     * a base image that can be used as base layer for all images. It can be useful if you want to provide some custom base image with further utility softwares
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a base image that can be used as base layer for all images. It can be useful if you want to provide some custom base image with further utility softwares")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String baseImage;

    public String getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    /**
     * the timeout (in seconds) to use when creating the build tools container image Deprecated: no longer in use
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildCatalogToolTimeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the timeout (in seconds) to use when creating the build tools container image Deprecated: no longer in use")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String buildCatalogToolTimeout;

    public String getBuildCatalogToolTimeout() {
        return buildCatalogToolTimeout;
    }

    public void setBuildCatalogToolTimeout(String buildCatalogToolTimeout) {
        this.buildCatalogToolTimeout = buildCatalogToolTimeout;
    }

    /**
     * the configuration required to build an Integration container image
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildConfiguration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the configuration required to build an Integration container image")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformstatus.build.BuildConfiguration buildConfiguration;

    public org.apache.camel.v1.integrationplatformstatus.build.BuildConfiguration getBuildConfiguration() {
        return buildConfiguration;
    }

    public void setBuildConfiguration(org.apache.camel.v1.integrationplatformstatus.build.BuildConfiguration buildConfiguration) {
        this.buildConfiguration = buildConfiguration;
    }

    /**
     * Maven configuration used to build the Camel/Camel-Quarkus applications
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maven")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maven configuration used to build the Camel/Camel-Quarkus applications")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformstatus.build.Maven maven;

    public org.apache.camel.v1.integrationplatformstatus.build.Maven getMaven() {
        return maven;
    }

    public void setMaven(org.apache.camel.v1.integrationplatformstatus.build.Maven maven) {
        this.maven = maven;
    }

    /**
     * the maximum amount of parallel running pipelines started by this operator instance
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxRunningBuilds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the maximum amount of parallel running pipelines started by this operator instance")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer maxRunningBuilds;

    public Integer getMaxRunningBuilds() {
        return maxRunningBuilds;
    }

    public void setMaxRunningBuilds(Integer maxRunningBuilds) {
        this.maxRunningBuilds = maxRunningBuilds;
    }

    /**
     * the strategy to adopt for publishing an Integration container image
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publishStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the strategy to adopt for publishing an Integration container image")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String publishStrategy;

    public String getPublishStrategy() {
        return publishStrategy;
    }

    public void setPublishStrategy(String publishStrategy) {
        this.publishStrategy = publishStrategy;
    }

    /**
     * the image registry used to push/pull Integration images
     */
    @com.fasterxml.jackson.annotation.JsonProperty("registry")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the image registry used to push/pull Integration images")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformstatus.build.Registry registry;

    public org.apache.camel.v1.integrationplatformstatus.build.Registry getRegistry() {
        return registry;
    }

    public void setRegistry(org.apache.camel.v1.integrationplatformstatus.build.Registry registry) {
        this.registry = registry;
    }

    /**
     * the runtime used. Likely Camel Quarkus (we used to have main runtime which has been discontinued since version 1.5)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeProvider")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the runtime used. Likely Camel Quarkus (we used to have main runtime which has been discontinued since version 1.5)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String runtimeProvider;

    public String getRuntimeProvider() {
        return runtimeProvider;
    }

    public void setRuntimeProvider(String runtimeProvider) {
        this.runtimeProvider = runtimeProvider;
    }

    /**
     * the Camel K Runtime dependency version
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the Camel K Runtime dependency version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String runtimeVersion;

    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    public void setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * how much time to wait before time out the pipeline process
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("how much time to wait before time out the pipeline process")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String timeout;

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }
}

