package org.apache.camel.v1alpha1.kameletbindingspec.source.types;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"$schema","description","example","externalDocs","id","properties","required","title","type"})
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
public class Schema implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * JSONSchemaURL represents a schema url.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$schema")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JSONSchemaURL represents a schema url.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String $schema;

    public String get$schema() {
        return $schema;
    }

    public void set$schema(String $schema) {
        this.$schema = $schema;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("description")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * JSON represents any valid JSON value. These types are supported: bool, int64, float64, string, []interface{}, map[string]interface{} and nil.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("example")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JSON represents any valid JSON value. These types are supported: bool, int64, float64, string, []interface{}, map[string]interface{} and nil.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.AnyType example;

    public io.fabric8.kubernetes.api.model.AnyType getExample() {
        return example;
    }

    public void setExample(io.fabric8.kubernetes.api.model.AnyType example) {
        this.example = example;
    }

    /**
     * ExternalDocumentation allows referencing an external resource for extended documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDocs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ExternalDocumentation allows referencing an external resource for extended documentation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1alpha1.kameletbindingspec.source.types.schema.ExternalDocs externalDocs;

    public org.apache.camel.v1alpha1.kameletbindingspec.source.types.schema.ExternalDocs getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(org.apache.camel.v1alpha1.kameletbindingspec.source.types.schema.ExternalDocs externalDocs) {
        this.externalDocs = externalDocs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1alpha1.kameletbindingspec.source.types.schema.Properties> properties;

    public java.util.Map<java.lang.String, org.apache.camel.v1alpha1.kameletbindingspec.source.types.schema.Properties> getProperties() {
        return properties;
    }

    public void setProperties(java.util.Map<java.lang.String, org.apache.camel.v1alpha1.kameletbindingspec.source.types.schema.Properties> properties) {
        this.properties = properties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("required")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> required;

    public java.util.List<String> getRequired() {
        return required;
    }

    public void setRequired(java.util.List<String> required) {
        this.required = required;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("title")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

