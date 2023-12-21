package org.apache.camel.v1.integrationplatformstatus.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configuration","enabled","kind","useSSA"})
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
public class Deployer implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformstatus.traits.deployer.Configuration configuration;

    public org.apache.camel.v1.integrationplatformstatus.traits.deployer.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationplatformstatus.traits.deployer.Configuration configuration) {
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

    public enum Kind {

        @com.fasterxml.jackson.annotation.JsonProperty("deployment")
        DEPLOYMENT("deployment"), @com.fasterxml.jackson.annotation.JsonProperty("cron-job")
        CRONJOB("cron-job"), @com.fasterxml.jackson.annotation.JsonProperty("knative-service")
        KNATIVESERVICE("knative-service");

        java.lang.String value;

        Kind(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Allows to explicitly select the desired deployment kind between `deployment`, `cron-job` or `knative-service` when creating the resources for running the integration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Allows to explicitly select the desired deployment kind between `deployment`, `cron-job` or `knative-service` when creating the resources for running the integration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Kind kind;

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    /**
     * Use server-side apply to update the owned resources (default `true`). Note that it automatically falls back to client-side patching, if SSA is not available, e.g., on old Kubernetes clusters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("useSSA")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use server-side apply to update the owned resources (default `true`). Note that it automatically falls back to client-side patching, if SSA is not available, e.g., on old Kubernetes clusters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean useSSA = true;

    public Boolean getUseSSA() {
        return useSSA;
    }

    public void setUseSSA(Boolean useSSA) {
        this.useSSA = useSSA;
    }
}

