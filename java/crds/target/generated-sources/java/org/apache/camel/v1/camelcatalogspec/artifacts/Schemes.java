package org.apache.camel.v1.camelcatalogspec.artifacts;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"consumer","http","id","passive","producer"})
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
public class Schemes implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * required scope for consumer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("required scope for consumer")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.camelcatalogspec.artifacts.schemes.Consumer consumer;

    public org.apache.camel.v1.camelcatalogspec.artifacts.schemes.Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(org.apache.camel.v1.camelcatalogspec.artifacts.schemes.Consumer consumer) {
        this.consumer = consumer;
    }

    /**
     * is a HTTP based scheme
     */
    @com.fasterxml.jackson.annotation.JsonProperty("http")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("is a HTTP based scheme")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean http;

    public Boolean getHttp() {
        return http;
    }

    public void setHttp(Boolean http) {
        this.http = http;
    }

    /**
     * the ID (ie, timer in a timer:xyz URI)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the ID (ie, timer in a timer:xyz URI)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * is a passive scheme
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passive")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("is a passive scheme")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean passive;

    public Boolean getPassive() {
        return passive;
    }

    public void setPassive(Boolean passive) {
        this.passive = passive;
    }

    /**
     * required scope for producers
     */
    @com.fasterxml.jackson.annotation.JsonProperty("producer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("required scope for producers")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.camelcatalogspec.artifacts.schemes.Producer producer;

    public org.apache.camel.v1.camelcatalogspec.artifacts.schemes.Producer getProducer() {
        return producer;
    }

    public void setProducer(org.apache.camel.v1.camelcatalogspec.artifacts.schemes.Producer producer) {
        this.producer = producer;
    }
}

