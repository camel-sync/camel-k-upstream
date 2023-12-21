package org.apache.camel.v1.kameletspec.datatypes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"dependencies","description","format","headers","mediaType","schema","scheme"})
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
public class Types implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * the list of Camel or Maven dependencies required by the data type
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the list of Camel or Maven dependencies required by the data type")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> dependencies;

    public java.util.List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(java.util.List<String> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * optional description
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("optional description")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * the data type format name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the data type format name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * one to many header specifications
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("one to many header specifications")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1.kameletspec.datatypes.types.Headers> headers;

    public java.util.Map<java.lang.String, org.apache.camel.v1.kameletspec.datatypes.types.Headers> getHeaders() {
        return headers;
    }

    public void setHeaders(java.util.Map<java.lang.String, org.apache.camel.v1.kameletspec.datatypes.types.Headers> headers) {
        this.headers = headers;
    }

    /**
     * media type as expected for HTTP media types (ie, application/json)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("media type as expected for HTTP media types (ie, application/json)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String mediaType;

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * the expected schema for the data type
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the expected schema for the data type")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.kameletspec.datatypes.types.Schema schema;

    public org.apache.camel.v1.kameletspec.datatypes.types.Schema getSchema() {
        return schema;
    }

    public void setSchema(org.apache.camel.v1.kameletspec.datatypes.types.Schema schema) {
        this.schema = schema;
    }

    /**
     * the data type component scheme
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheme")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the data type component scheme")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String scheme;

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
}

