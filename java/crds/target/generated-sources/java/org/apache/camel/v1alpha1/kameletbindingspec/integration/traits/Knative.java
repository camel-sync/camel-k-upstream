package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"auto","channelSinks","channelSources","config","configuration","enabled","endpointSinks","endpointSources","eventSinks","eventSources","filterSourceChannels","namespaceLabel","sinkBinding"})
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
public class Knative implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enable automatic discovery of all trait properties.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auto")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable automatic discovery of all trait properties.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean auto;

    public Boolean getAuto() {
        return auto;
    }

    public void setAuto(Boolean auto) {
        this.auto = auto;
    }

    /**
     * List of channels used as destination of integration routes. Can contain simple channel names or full Camel URIs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("channelSinks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of channels used as destination of integration routes. Can contain simple channel names or full Camel URIs.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> channelSinks;

    public java.util.List<String> getChannelSinks() {
        return channelSinks;
    }

    public void setChannelSinks(java.util.List<String> channelSinks) {
        this.channelSinks = channelSinks;
    }

    /**
     * List of channels used as source of integration routes. Can contain simple channel names or full Camel URIs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("channelSources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of channels used as source of integration routes. Can contain simple channel names or full Camel URIs.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> channelSources;

    public java.util.List<String> getChannelSources() {
        return channelSources;
    }

    public void setChannelSources(java.util.List<String> channelSources) {
        this.channelSources = channelSources;
    }

    /**
     * Can be used to inject a Knative complete configuration in JSON format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Can be used to inject a Knative complete configuration in JSON format.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.knative.Configuration configuration;

    public org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.knative.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.knative.Configuration configuration) {
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
     * List of endpoints used as destination of integration routes. Can contain simple endpoint names or full Camel URIs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointSinks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of endpoints used as destination of integration routes. Can contain simple endpoint names or full Camel URIs.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> endpointSinks;

    public java.util.List<String> getEndpointSinks() {
        return endpointSinks;
    }

    public void setEndpointSinks(java.util.List<String> endpointSinks) {
        this.endpointSinks = endpointSinks;
    }

    /**
     * List of channels used as source of integration routes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointSources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of channels used as source of integration routes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> endpointSources;

    public java.util.List<String> getEndpointSources() {
        return endpointSources;
    }

    public void setEndpointSources(java.util.List<String> endpointSources) {
        this.endpointSources = endpointSources;
    }

    /**
     * List of event types that the integration will produce. Can contain simple event types or full Camel URIs (to use a specific broker).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventSinks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of event types that the integration will produce. Can contain simple event types or full Camel URIs (to use a specific broker).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> eventSinks;

    public java.util.List<String> getEventSinks() {
        return eventSinks;
    }

    public void setEventSinks(java.util.List<String> eventSinks) {
        this.eventSinks = eventSinks;
    }

    /**
     * List of event types that the integration will be subscribed to. Can contain simple event types or full Camel URIs (to use a specific broker different from "default").
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventSources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of event types that the integration will be subscribed to. Can contain simple event types or full Camel URIs (to use a specific broker different from \"default\").")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> eventSources;

    public java.util.List<String> getEventSources() {
        return eventSources;
    }

    public void setEventSources(java.util.List<String> eventSources) {
        this.eventSources = eventSources;
    }

    /**
     * Enables filtering on events based on the header "ce-knativehistory". Since this header has been removed in newer versions of Knative, filtering is disabled by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filterSourceChannels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enables filtering on events based on the header \"ce-knativehistory\". Since this header has been removed in newer versions of Knative, filtering is disabled by default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean filterSourceChannels;

    public Boolean getFilterSourceChannels() {
        return filterSourceChannels;
    }

    public void setFilterSourceChannels(Boolean filterSourceChannels) {
        this.filterSourceChannels = filterSourceChannels;
    }

    /**
     * Enables the camel-k-operator to set the "bindings.knative.dev/include=true" label to the namespace As Knative requires this label to perform injection of K_SINK URL into the service. If this is false, the integration pod may start and fail, read the SinkBinding Knative documentation. (default: true)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceLabel")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enables the camel-k-operator to set the \"bindings.knative.dev/include=true\" label to the namespace As Knative requires this label to perform injection of K_SINK URL into the service. If this is false, the integration pod may start and fail, read the SinkBinding Knative documentation. (default: true)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean namespaceLabel = true;

    public Boolean getNamespaceLabel() {
        return namespaceLabel;
    }

    public void setNamespaceLabel(Boolean namespaceLabel) {
        this.namespaceLabel = namespaceLabel;
    }

    /**
     * Allows binding the integration to a sink via a Knative SinkBinding resource. This can be used when the integration targets a single sink. It's enabled by default when the integration targets a single sink (except when the integration is owned by a Knative source).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sinkBinding")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allows binding the integration to a sink via a Knative SinkBinding resource. This can be used when the integration targets a single sink. It's enabled by default when the integration targets a single sink (except when the integration is owned by a Knative source).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean sinkBinding;

    public Boolean getSinkBinding() {
        return sinkBinding;
    }

    public void setSinkBinding(Boolean sinkBinding) {
        this.sinkBinding = sinkBinding;
    }
}

