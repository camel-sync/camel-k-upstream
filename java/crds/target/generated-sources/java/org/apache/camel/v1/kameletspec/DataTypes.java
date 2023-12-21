package org.apache.camel.v1.kameletspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"default","headers","types"})
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
public class DataTypes implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * the default data type for this Kamelet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("default")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the default data type for this Kamelet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String _default;

    public String get_default() {
        return _default;
    }

    public void set_default(String _default) {
        this._default = _default;
    }

    /**
     * one to many header specifications
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("one to many header specifications")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1.kameletspec.datatypes.Headers> headers;

    public java.util.Map<java.lang.String, org.apache.camel.v1.kameletspec.datatypes.Headers> getHeaders() {
        return headers;
    }

    public void setHeaders(java.util.Map<java.lang.String, org.apache.camel.v1.kameletspec.datatypes.Headers> headers) {
        this.headers = headers;
    }

    /**
     * one to many data type specifications
     */
    @com.fasterxml.jackson.annotation.JsonProperty("types")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("one to many data type specifications")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1.kameletspec.datatypes.Types> types;

    public java.util.Map<java.lang.String, org.apache.camel.v1.kameletspec.datatypes.Types> getTypes() {
        return types;
    }

    public void setTypes(java.util.Map<java.lang.String, org.apache.camel.v1.kameletspec.datatypes.Types> types) {
        this.types = types;
    }
}

