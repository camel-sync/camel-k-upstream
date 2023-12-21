package org.apache.camel.v1.camelcatalogspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"artifactId","dataformats","dependencies","exclusions","groupId","javaTypes","languages","schemes","version"})
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
public class Artifacts implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
     * accepted data formats
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataformats")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("accepted data formats")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> dataformats;

    public java.util.List<String> getDataformats() {
        return dataformats;
    }

    public void setDataformats(java.util.List<String> dataformats) {
        this.dataformats = dataformats;
    }

    /**
     * required dependencies
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("required dependencies")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.Dependencies> dependencies;

    public java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.Dependencies> getDependencies() {
        return dependencies;
    }

    public void setDependencies(java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.Dependencies> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * provide a list of artifacts to exclude for this dependency
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("provide a list of artifacts to exclude for this dependency")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.Exclusions> exclusions;

    public java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.Exclusions> getExclusions() {
        return exclusions;
    }

    public void setExclusions(java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.Exclusions> exclusions) {
        this.exclusions = exclusions;
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
     * the Java types used by the artifact feature (ie, component, data format, ...)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("javaTypes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the Java types used by the artifact feature (ie, component, data format, ...)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> javaTypes;

    public java.util.List<String> getJavaTypes() {
        return javaTypes;
    }

    public void setJavaTypes(java.util.List<String> javaTypes) {
        this.javaTypes = javaTypes;
    }

    /**
     * accepted languages
     */
    @com.fasterxml.jackson.annotation.JsonProperty("languages")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("accepted languages")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> languages;

    public java.util.List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(java.util.List<String> languages) {
        this.languages = languages;
    }

    /**
     * accepted URI schemes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("accepted URI schemes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.Schemes> schemes;

    public java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.Schemes> getSchemes() {
        return schemes;
    }

    public void setSchemes(java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.Schemes> schemes) {
        this.schemes = schemes;
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

