package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configmaps","configuration","enabled"})
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
public class Openapi implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The configmaps holding the spec of the OpenAPI
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configmaps")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configmaps holding the spec of the OpenAPI")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> configmaps;

    public java.util.List<String> getConfigmaps() {
        return configmaps;
    }

    public void setConfigmaps(java.util.List<String> configmaps) {
        this.configmaps = configmaps;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.openapi.Configuration configuration;

    public org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.openapi.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.openapi.Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * Deprecated: no longer in use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: no longer in use.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}

