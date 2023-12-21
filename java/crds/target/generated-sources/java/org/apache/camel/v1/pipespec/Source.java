package org.apache.camel.v1.pipespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"dataTypes","properties","ref","uri"})
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
public class Source implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * DataTypes defines the data type of the data produced/consumed by the endpoint and references a given data type specification.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataTypes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataTypes defines the data type of the data produced/consumed by the endpoint and references a given data type specification.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1.pipespec.source.DataTypes> dataTypes;

    public java.util.Map<java.lang.String, org.apache.camel.v1.pipespec.source.DataTypes> getDataTypes() {
        return dataTypes;
    }

    public void setDataTypes(java.util.Map<java.lang.String, org.apache.camel.v1.pipespec.source.DataTypes> dataTypes) {
        this.dataTypes = dataTypes;
    }

    /**
     * Properties are a key value representation of endpoint properties
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Properties are a key value representation of endpoint properties")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.pipespec.source.Properties properties;

    public org.apache.camel.v1.pipespec.source.Properties getProperties() {
        return properties;
    }

    public void setProperties(org.apache.camel.v1.pipespec.source.Properties properties) {
        this.properties = properties;
    }

    /**
     * Ref can be used to declare a Kubernetes resource as source/sink endpoint
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ref")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ref can be used to declare a Kubernetes resource as source/sink endpoint")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.pipespec.source.Ref ref;

    public org.apache.camel.v1.pipespec.source.Ref getRef() {
        return ref;
    }

    public void setRef(org.apache.camel.v1.pipespec.source.Ref ref) {
        this.ref = ref;
    }

    /**
     * URI can be used to specify the (Camel) endpoint explicitly
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("URI can be used to specify the (Camel) endpoint explicitly")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String uri;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}

