package org.apache.camel.v1.buildspec.tasks;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"baseImage","configuration","contextDir","executorImage","image","name","platform","registry","verbose"})
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
public class Buildah implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * base image layer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("base image layer")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String baseImage;

    public String getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    /**
     * The configuration that should be used to perform the Build.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration that should be used to perform the Build.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.buildah.Configuration configuration;

    public org.apache.camel.v1.buildspec.tasks.buildah.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.buildspec.tasks.buildah.Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * can be useful to share info with other tasks
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contextDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("can be useful to share info with other tasks")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String contextDir;

    public String getContextDir() {
        return contextDir;
    }

    public void setContextDir(String contextDir) {
        this.contextDir = contextDir;
    }

    /**
     * docker image to use
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executorImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("docker image to use")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String executorImage;

    public String getExecutorImage() {
        return executorImage;
    }

    public void setExecutorImage(String executorImage) {
        this.executorImage = executorImage;
    }

    /**
     * final image name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("final image name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * name of the task
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("name of the task")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The platform of build image
     */
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The platform of build image")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String platform;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * where to publish the final image
     */
    @com.fasterxml.jackson.annotation.JsonProperty("registry")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("where to publish the final image")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.buildah.Registry registry;

    public org.apache.camel.v1.buildspec.tasks.buildah.Registry getRegistry() {
        return registry;
    }

    public void setRegistry(org.apache.camel.v1.buildspec.tasks.buildah.Registry registry) {
        this.registry = registry;
    }

    /**
     * log more information
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verbose")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("log more information")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean verbose;

    public Boolean getVerbose() {
        return verbose;
    }

    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }
}

