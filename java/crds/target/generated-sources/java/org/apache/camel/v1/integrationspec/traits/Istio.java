package org.apache.camel.v1.integrationspec.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allow","configuration","enabled","inject"})
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
public class Istio implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configures a (comma-separated) list of CIDR subnets that should not be intercepted by the Istio proxy (`10.0.0.0/8,172.16.0.0/12,192.168.0.0/16` by default).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allow")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures a (comma-separated) list of CIDR subnets that should not be intercepted by the Istio proxy (`10.0.0.0/8,172.16.0.0/12,192.168.0.0/16` by default).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String allow = "10.0.0.0/8,172.16.0.0/12,192.168.0.0/16";

    public String getAllow() {
        return allow;
    }

    public void setAllow(String allow) {
        this.allow = allow;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationspec.traits.istio.Configuration configuration;

    public org.apache.camel.v1.integrationspec.traits.istio.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationspec.traits.istio.Configuration configuration) {
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
     * Forces the value for labels `sidecar.istio.io/inject`. By default the label is set to `true` on deployment and not set on Knative Service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inject")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Forces the value for labels `sidecar.istio.io/inject`. By default the label is set to `true` on deployment and not set on Knative Service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean inject;

    public Boolean getInject() {
        return inject;
    }

    public void setInject(Boolean inject) {
        this.inject = inject;
    }
}

