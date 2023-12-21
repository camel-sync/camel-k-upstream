package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configuration","containerMeta","enabled","httpProxy","vars"})
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
public class Environment implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.environment.Configuration configuration;

    public org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.environment.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.environment.Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * Enables injection of `NAMESPACE` and `POD_NAME` environment variables (default `true`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containerMeta")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enables injection of `NAMESPACE` and `POD_NAME` environment variables (default `true`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean containerMeta = true;

    public Boolean getContainerMeta() {
        return containerMeta;
    }

    public void setContainerMeta(Boolean containerMeta) {
        this.containerMeta = containerMeta;
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

    /**
     * Propagates the `HTTP_PROXY`, `HTTPS_PROXY` and `NO_PROXY` environment variables (default `true`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpProxy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Propagates the `HTTP_PROXY`, `HTTPS_PROXY` and `NO_PROXY` environment variables (default `true`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean httpProxy = true;

    public Boolean getHttpProxy() {
        return httpProxy;
    }

    public void setHttpProxy(Boolean httpProxy) {
        this.httpProxy = httpProxy;
    }

    /**
     * A list of environment variables to be added to the integration container. The syntax is KEY=VALUE, e.g., `MY_VAR="my value"`. These take precedence over the previously defined environment variables.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vars")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of environment variables to be added to the integration container. The syntax is KEY=VALUE, e.g., `MY_VAR=\"my value\"`. These take precedence over the previously defined environment variables.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> vars;

    public java.util.List<String> getVars() {
        return vars;
    }

    public void setVars(java.util.List<String> vars) {
        this.vars = vars;
    }
}

