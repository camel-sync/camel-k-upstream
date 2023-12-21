package org.apache.camel.v1.integrationkitspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"addons","builder","camel","quarkus","registry"})
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
public class Traits implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The collection of addon trait configurations
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addons")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The collection of addon trait configurations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1.integrationkitspec.traits.Addons> addons;

    public java.util.Map<java.lang.String, org.apache.camel.v1.integrationkitspec.traits.Addons> getAddons() {
        return addons;
    }

    public void setAddons(java.util.Map<java.lang.String, org.apache.camel.v1.integrationkitspec.traits.Addons> addons) {
        this.addons = addons;
    }

    /**
     * The builder trait is internally used to determine the best strategy to build and configure IntegrationKits.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("builder")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The builder trait is internally used to determine the best strategy to build and configure IntegrationKits.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationkitspec.traits.Builder builder;

    public org.apache.camel.v1.integrationkitspec.traits.Builder getBuilder() {
        return builder;
    }

    public void setBuilder(org.apache.camel.v1.integrationkitspec.traits.Builder builder) {
        this.builder = builder;
    }

    /**
     * The Camel trait sets up Camel configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("camel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Camel trait sets up Camel configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationkitspec.traits.Camel camel;

    public org.apache.camel.v1.integrationkitspec.traits.Camel getCamel() {
        return camel;
    }

    public void setCamel(org.apache.camel.v1.integrationkitspec.traits.Camel camel) {
        this.camel = camel;
    }

    /**
     * The Quarkus trait configures the Quarkus runtime. It's enabled by default. NOTE: Compiling to a native executable, requires at least 4GiB of memory, so the Pod running the native build must have enough memory available.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quarkus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Quarkus trait configures the Quarkus runtime. It's enabled by default. NOTE: Compiling to a native executable, requires at least 4GiB of memory, so the Pod running the native build must have enough memory available.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationkitspec.traits.Quarkus quarkus;

    public org.apache.camel.v1.integrationkitspec.traits.Quarkus getQuarkus() {
        return quarkus;
    }

    public void setQuarkus(org.apache.camel.v1.integrationkitspec.traits.Quarkus quarkus) {
        this.quarkus = quarkus;
    }

    /**
     * The Registry trait sets up Maven to use the Image registry as a Maven repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("registry")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Registry trait sets up Maven to use the Image registry as a Maven repository.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationkitspec.traits.Registry registry;

    public org.apache.camel.v1.integrationkitspec.traits.Registry getRegistry() {
        return registry;
    }

    public void setRegistry(org.apache.camel.v1.integrationkitspec.traits.Registry registry) {
        this.registry = registry;
    }
}

