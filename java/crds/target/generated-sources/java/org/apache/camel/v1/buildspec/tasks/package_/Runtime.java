package org.apache.camel.v1.buildspec.tasks.package_;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"applicationClass","capabilities","dependencies","metadata","provider","version"})
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
public class Runtime implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * application entry point (main) to be executed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationClass")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("application entry point (main) to be executed")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String applicationClass;

    public String getApplicationClass() {
        return applicationClass;
    }

    public void setApplicationClass(String applicationClass) {
        this.applicationClass = applicationClass;
    }

    /**
     * features offered by this runtime
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("features offered by this runtime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1.buildspec.tasks.package_.runtime.Capabilities> capabilities;

    public java.util.Map<java.lang.String, org.apache.camel.v1.buildspec.tasks.package_.runtime.Capabilities> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(java.util.Map<java.lang.String, org.apache.camel.v1.buildspec.tasks.package_.runtime.Capabilities> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * list of dependencies needed to run the application
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("list of dependencies needed to run the application")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.buildspec.tasks.package_.runtime.Dependencies> dependencies;

    public java.util.List<org.apache.camel.v1.buildspec.tasks.package_.runtime.Dependencies> getDependencies() {
        return dependencies;
    }

    public void setDependencies(java.util.List<org.apache.camel.v1.buildspec.tasks.package_.runtime.Dependencies> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * set of metadata
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("set of metadata")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> metadata;

    public java.util.Map<java.lang.String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(java.util.Map<java.lang.String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Camel main application provider, ie, Camel Quarkus
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Camel main application provider, ie, Camel Quarkus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String provider;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * Camel K Runtime version
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Camel K Runtime version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

