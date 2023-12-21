package org.apache.camel.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configuration","dependencies","image","profile","repositories","sources","traits"})
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
public class IntegrationKitSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Deprecated: Use camel trait (camel.properties) to manage properties Use mount trait (mount.configs) to manage configs Use mount trait (mount.resources) to manage resources Use mount trait (mount.volumes) to manage volumes configuration used by the kit
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: Use camel trait (camel.properties) to manage properties Use mount trait (mount.configs) to manage configs Use mount trait (mount.resources) to manage resources Use mount trait (mount.volumes) to manage volumes configuration used by the kit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.integrationkitspec.Configuration> configuration;

    public java.util.List<org.apache.camel.v1.integrationkitspec.Configuration> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(java.util.List<org.apache.camel.v1.integrationkitspec.Configuration> configuration) {
        this.configuration = configuration;
    }

    /**
     * a list of Camel dependecies used by this kit
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a list of Camel dependecies used by this kit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> dependencies;

    public java.util.List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(java.util.List<String> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * the container image as identified in the container registry
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the container image as identified in the container registry")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * the profile which is expected by this kit
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the profile which is expected by this kit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String profile;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * Maven repositories that can be used by the kit
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositories")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maven repositories that can be used by the kit")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> repositories;

    public java.util.List<String> getRepositories() {
        return repositories;
    }

    public void setRepositories(java.util.List<String> repositories) {
        this.repositories = repositories;
    }

    /**
     * the sources to add at build time
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the sources to add at build time")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.integrationkitspec.Sources> sources;

    public java.util.List<org.apache.camel.v1.integrationkitspec.Sources> getSources() {
        return sources;
    }

    public void setSources(java.util.List<org.apache.camel.v1.integrationkitspec.Sources> sources) {
        this.sources = sources;
    }

    /**
     * traits that the kit will execute
     */
    @com.fasterxml.jackson.annotation.JsonProperty("traits")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("traits that the kit will execute")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationkitspec.Traits traits;

    public org.apache.camel.v1.integrationkitspec.Traits getTraits() {
        return traits;
    }

    public void setTraits(org.apache.camel.v1.integrationkitspec.Traits traits) {
        this.traits = traits;
    }
}

