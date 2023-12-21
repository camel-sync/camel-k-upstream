package org.apache.camel.v1.integrationplatformspec.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configuration","enabled","nodeAffinityLabels","podAffinity","podAffinityLabels","podAntiAffinity","podAntiAffinityLabels"})
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
public class Affinity implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.affinity.Configuration configuration;

    public org.apache.camel.v1.integrationplatformspec.traits.affinity.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationplatformspec.traits.affinity.Configuration configuration) {
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
     * Defines a set of nodes the integration pod(s) are eligible to be scheduled on, based on labels on the node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeAffinityLabels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defines a set of nodes the integration pod(s) are eligible to be scheduled on, based on labels on the node.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> nodeAffinityLabels;

    public java.util.List<String> getNodeAffinityLabels() {
        return nodeAffinityLabels;
    }

    public void setNodeAffinityLabels(java.util.List<String> nodeAffinityLabels) {
        this.nodeAffinityLabels = nodeAffinityLabels;
    }

    /**
     * Always co-locates multiple replicas of the integration in the same node (default `false`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Always co-locates multiple replicas of the integration in the same node (default `false`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean podAffinity = false;

    public Boolean getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(Boolean podAffinity) {
        this.podAffinity = podAffinity;
    }

    /**
     * Defines a set of pods (namely those matching the label selector, relative to the given namespace) that the integration pod(s) should be co-located with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAffinityLabels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defines a set of pods (namely those matching the label selector, relative to the given namespace) that the integration pod(s) should be co-located with.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> podAffinityLabels;

    public java.util.List<String> getPodAffinityLabels() {
        return podAffinityLabels;
    }

    public void setPodAffinityLabels(java.util.List<String> podAffinityLabels) {
        this.podAffinityLabels = podAffinityLabels;
    }

    /**
     * Never co-locates multiple replicas of the integration in the same node (default `false`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAntiAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Never co-locates multiple replicas of the integration in the same node (default `false`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean podAntiAffinity = false;

    public Boolean getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(Boolean podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }

    /**
     * Defines a set of pods (namely those matching the label selector, relative to the given namespace) that the integration pod(s) should not be co-located with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAntiAffinityLabels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defines a set of pods (namely those matching the label selector, relative to the given namespace) that the integration pod(s) should not be co-located with.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> podAntiAffinityLabels;

    public java.util.List<String> getPodAntiAffinityLabels() {
        return podAntiAffinityLabels;
    }

    public void setPodAntiAffinityLabels(java.util.List<String> podAntiAffinityLabels) {
        this.podAntiAffinityLabels = podAntiAffinityLabels;
    }
}

