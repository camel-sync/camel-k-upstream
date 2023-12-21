package org.apache.camel.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"errorHandler","integration","replicas","serviceAccountName","sink","source","steps"})
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
public class PipeSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ErrorHandler is an optional handler called upon an error occurring in the integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("errorHandler")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ErrorHandler is an optional handler called upon an error occurring in the integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.pipespec.ErrorHandler errorHandler;

    public org.apache.camel.v1.pipespec.ErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public void setErrorHandler(org.apache.camel.v1.pipespec.ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    /**
     * Integration is an optional integration used to specify custom parameters Deprecated don't use this. Use trait annotations if you need to change any cluster configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("integration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Integration is an optional integration used to specify custom parameters Deprecated don't use this. Use trait annotations if you need to change any cluster configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.pipespec.Integration integration;

    public org.apache.camel.v1.pipespec.Integration getIntegration() {
        return integration;
    }

    public void setIntegration(org.apache.camel.v1.pipespec.Integration integration) {
        this.integration = integration;
    }

    /**
     * Replicas is the number of desired replicas for the Pipe
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Replicas is the number of desired replicas for the Pipe")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * Custom SA to use for the Pipe
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Custom SA to use for the Pipe")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceAccountName;

    public String getServiceAccountName() {
        return serviceAccountName;
    }

    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    /**
     * Sink is the destination of the integration defined by this Pipe
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sink")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sink is the destination of the integration defined by this Pipe")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.pipespec.Sink sink;

    public org.apache.camel.v1.pipespec.Sink getSink() {
        return sink;
    }

    public void setSink(org.apache.camel.v1.pipespec.Sink sink) {
        this.sink = sink;
    }

    /**
     * Source is the starting point of the integration defined by this Pipe
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Source is the starting point of the integration defined by this Pipe")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.pipespec.Source source;

    public org.apache.camel.v1.pipespec.Source getSource() {
        return source;
    }

    public void setSource(org.apache.camel.v1.pipespec.Source source) {
        this.source = source;
    }

    /**
     * Steps contains an optional list of intermediate steps that are executed between the Source and the Sink
     */
    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Steps contains an optional list of intermediate steps that are executed between the Source and the Sink")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.pipespec.Steps> steps;

    public java.util.List<org.apache.camel.v1.pipespec.Steps> getSteps() {
        return steps;
    }

    public void setSteps(java.util.List<org.apache.camel.v1.pipespec.Steps> steps) {
        this.steps = steps;
    }
}

