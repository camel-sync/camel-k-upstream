package org.apache.camel.v1.buildspec.tasks;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"baseImage","buildDir","configuration","dependencies","maven","name","runtime","sources","steps"})
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
public class Builder implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * the base image layer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the base image layer")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String baseImage;

    public String getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    /**
     * workspace directory to use
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("workspace directory to use")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String buildDir;

    public String getBuildDir() {
        return buildDir;
    }

    public void setBuildDir(String buildDir) {
        this.buildDir = buildDir;
    }

    /**
     * The configuration that should be used to perform the Build.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration that should be used to perform the Build.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.builder.Configuration configuration;

    public org.apache.camel.v1.buildspec.tasks.builder.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.buildspec.tasks.builder.Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * the list of dependencies to use for this build
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the list of dependencies to use for this build")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> dependencies;

    public java.util.List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(java.util.List<String> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * the configuration required by Maven for the application build phase
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maven")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the configuration required by Maven for the application build phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.builder.Maven maven;

    public org.apache.camel.v1.buildspec.tasks.builder.Maven getMaven() {
        return maven;
    }

    public void setMaven(org.apache.camel.v1.buildspec.tasks.builder.Maven maven) {
        this.maven = maven;
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
     * the configuration required for the runtime application
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtime")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the configuration required for the runtime application")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.builder.Runtime runtime;

    public org.apache.camel.v1.buildspec.tasks.builder.Runtime getRuntime() {
        return runtime;
    }

    public void setRuntime(org.apache.camel.v1.buildspec.tasks.builder.Runtime runtime) {
        this.runtime = runtime;
    }

    /**
     * the sources to add at build time
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the sources to add at build time")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.buildspec.tasks.builder.Sources> sources;

    public java.util.List<org.apache.camel.v1.buildspec.tasks.builder.Sources> getSources() {
        return sources;
    }

    public void setSources(java.util.List<org.apache.camel.v1.buildspec.tasks.builder.Sources> sources) {
        this.sources = sources;
    }

    /**
     * the list of steps to execute (see pkg/builder/)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the list of steps to execute (see pkg/builder/)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> steps;

    public java.util.List<String> getSteps() {
        return steps;
    }

    public void setSteps(java.util.List<String> steps) {
        this.steps = steps;
    }
}

