package org.apache.camel.v1.integrationplatformspec.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configuration","enabled","targetAnnotations","targetLabels"})
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
public class Owner implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.owner.Configuration configuration;

    public org.apache.camel.v1.integrationplatformspec.traits.owner.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationplatformspec.traits.owner.Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * Can be used to enable or disable a trait. All traits share this common property.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Can be used to enable or disable a trait. All traits share this common property.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * The set of annotations to be transferred
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetAnnotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The set of annotations to be transferred")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> targetAnnotations;

    public java.util.List<String> getTargetAnnotations() {
        return targetAnnotations;
    }

    public void setTargetAnnotations(java.util.List<String> targetAnnotations) {
        this.targetAnnotations = targetAnnotations;
    }

    /**
     * The set of labels to be transferred
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetLabels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The set of labels to be transferred")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> targetLabels;

    public java.util.List<String> getTargetLabels() {
        return targetLabels;
    }

    public void setTargetLabels(java.util.List<String> targetLabels) {
        this.targetLabels = targetLabels;
    }
}

