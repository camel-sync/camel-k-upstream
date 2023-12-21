package org.apache.camel.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configuration","maxRunningBuilds","operatorNamespace","tasks","timeout","toolImage"})
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
public class BuildSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The configuration that should be used to perform the Build. Deprecated: no longer in use in Camel K 2 - maintained for backward compatibility
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration that should be used to perform the Build. Deprecated: no longer in use in Camel K 2 - maintained for backward compatibility")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.Configuration configuration;

    public org.apache.camel.v1.buildspec.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.buildspec.Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * the maximum amount of parallel running builds started by this operator instance Deprecated: no longer in use in Camel K 2 - maintained for backward compatibility
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxRunningBuilds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the maximum amount of parallel running builds started by this operator instance Deprecated: no longer in use in Camel K 2 - maintained for backward compatibility")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer maxRunningBuilds;

    public Integer getMaxRunningBuilds() {
        return maxRunningBuilds;
    }

    public void setMaxRunningBuilds(Integer maxRunningBuilds) {
        this.maxRunningBuilds = maxRunningBuilds;
    }

    /**
     * The namespace where to run the builder Pod (must be the same of the operator in charge of this Build reconciliation). Deprecated: no longer in use in Camel K 2 - maintained for backward compatibility
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operatorNamespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The namespace where to run the builder Pod (must be the same of the operator in charge of this Build reconciliation). Deprecated: no longer in use in Camel K 2 - maintained for backward compatibility")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String operatorNamespace;

    public String getOperatorNamespace() {
        return operatorNamespace;
    }

    public void setOperatorNamespace(String operatorNamespace) {
        this.operatorNamespace = operatorNamespace;
    }

    /**
     * The sequence of tasks (pipeline) to be performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tasks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The sequence of tasks (pipeline) to be performed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.buildspec.Tasks> tasks;

    public java.util.List<org.apache.camel.v1.buildspec.Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(java.util.List<org.apache.camel.v1.buildspec.Tasks> tasks) {
        this.tasks = tasks;
    }

    /**
     * Timeout defines the Build maximum execution duration. The Build deadline is set to the Build start time plus the Timeout duration. If the Build deadline is exceeded, the Build context is canceled, and its phase set to BuildPhaseFailed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Timeout defines the Build maximum execution duration. The Build deadline is set to the Build start time plus the Timeout duration. If the Build deadline is exceeded, the Build context is canceled, and its phase set to BuildPhaseFailed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String timeout;

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    /**
     * The container image to be used to run the build. Deprecated: no longer in use in Camel K 2 - maintained for backward compatibility
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toolImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The container image to be used to run the build. Deprecated: no longer in use in Camel K 2 - maintained for backward compatibility")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String toolImage;

    public String getToolImage() {
        return toolImage;
    }

    public void setToolImage(String toolImage) {
        this.toolImage = toolImage;
    }
}

