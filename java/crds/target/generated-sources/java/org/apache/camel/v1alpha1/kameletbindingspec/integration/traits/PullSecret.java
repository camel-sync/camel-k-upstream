package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"auto","configuration","enabled","imagePullerDelegation","secretName"})
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
public class PullSecret implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Automatically configures the platform registry secret on the pod if it is of type `kubernetes.io/dockerconfigjson`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auto")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Automatically configures the platform registry secret on the pod if it is of type `kubernetes.io/dockerconfigjson`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean auto;

    public Boolean getAuto() {
        return auto;
    }

    public void setAuto(Boolean auto) {
        this.auto = auto;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.pullsecret.Configuration configuration;

    public org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.pullsecret.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.pullsecret.Configuration configuration) {
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
     * When using a global operator with a shared platform, this enables delegation of the `system:image-puller` cluster role on the operator namespace to the integration service account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullerDelegation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When using a global operator with a shared platform, this enables delegation of the `system:image-puller` cluster role on the operator namespace to the integration service account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean imagePullerDelegation;

    public Boolean getImagePullerDelegation() {
        return imagePullerDelegation;
    }

    public void setImagePullerDelegation(Boolean imagePullerDelegation) {
        this.imagePullerDelegation = imagePullerDelegation;
    }

    /**
     * The pull secret name to set on the Pod. If left empty this is automatically taken from the `IntegrationPlatform` registry configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The pull secret name to set on the Pod. If left empty this is automatically taken from the `IntegrationPlatform` registry configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String secretName;

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }
}

