package org.apache.camel.v1.camelcatalogspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"artifactId","dependencies","groupId","languages","metadata","version"})
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
public class Loaders implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Maven Artifact
     */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maven Artifact")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String artifactId;

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * a list of additional dependencies required beside the base one
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a list of additional dependencies required beside the base one")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.camelcatalogspec.loaders.Dependencies> dependencies;

    public java.util.List<org.apache.camel.v1.camelcatalogspec.loaders.Dependencies> getDependencies() {
        return dependencies;
    }

    public void setDependencies(java.util.List<org.apache.camel.v1.camelcatalogspec.loaders.Dependencies> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * Maven Group
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maven Group")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * a list of DSLs supported
     */
    @com.fasterxml.jackson.annotation.JsonProperty("languages")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a list of DSLs supported")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> languages;

    public java.util.List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(java.util.List<String> languages) {
        this.languages = languages;
    }

    /**
     * the metadata of the loader
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the metadata of the loader")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> metadata;

    public java.util.Map<java.lang.String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(java.util.Map<java.lang.String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Maven Version
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maven Version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

