package org.apache.camel.v1.integrationkitspec.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"buildMode","configuration","enabled","nativeBaseImage","nativeBuilderImage","packageTypes"})
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
public class Quarkus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum BuildMode {

        @com.fasterxml.jackson.annotation.JsonProperty("jvm")
        JVM("jvm"), @com.fasterxml.jackson.annotation.JsonProperty("native")
        _NATIVE("native");

        java.lang.String value;

        BuildMode(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The Quarkus mode to run: either `jvm` or `native` (default `jvm`). In case both `jvm` and `native` are specified, two `IntegrationKit` resources are created, with the `native` kit having precedence over the `jvm` one once ready.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Quarkus mode to run: either `jvm` or `native` (default `jvm`). In case both `jvm` and `native` are specified, two `IntegrationKit` resources are created, with the `native` kit having precedence over the `jvm` one once ready.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<BuildMode> buildMode = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("[\"jvm\"]", java.util.List.class);

    public java.util.List<BuildMode> getBuildMode() {
        return buildMode;
    }

    public void setBuildMode(java.util.List<BuildMode> buildMode) {
        this.buildMode = buildMode;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationkitspec.traits.quarkus.Configuration configuration;

    public org.apache.camel.v1.integrationkitspec.traits.quarkus.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationkitspec.traits.quarkus.Configuration configuration) {
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

    /**
     * The base image to use when running a native build (default `quay.io/quarkus/quarkus-micro-image:2.0`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nativeBaseImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The base image to use when running a native build (default `quay.io/quarkus/quarkus-micro-image:2.0`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String nativeBaseImage = "quay.io/quarkus/quarkus-micro-image:2.0";

    public String getNativeBaseImage() {
        return nativeBaseImage;
    }

    public void setNativeBaseImage(String nativeBaseImage) {
        this.nativeBaseImage = nativeBaseImage;
    }

    /**
     * The image containing the tooling required for a native build (by default it will use the one provided in the runtime catalog)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nativeBuilderImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The image containing the tooling required for a native build (by default it will use the one provided in the runtime catalog)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String nativeBuilderImage;

    public String getNativeBuilderImage() {
        return nativeBuilderImage;
    }

    public void setNativeBuilderImage(String nativeBuilderImage) {
        this.nativeBuilderImage = nativeBuilderImage;
    }

    public enum PackageTypes {

        @com.fasterxml.jackson.annotation.JsonProperty("fast-jar")
        FASTJAR("fast-jar"), @com.fasterxml.jackson.annotation.JsonProperty("native")
        _NATIVE("native");

        java.lang.String value;

        PackageTypes(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The Quarkus package types, `fast-jar` or `native` (default `fast-jar`). In case both `fast-jar` and `native` are specified, two `IntegrationKit` resources are created, with the native kit having precedence over the `fast-jar` one once ready. The order influences the resolution of the current kit for the integration. The kit corresponding to the first package type will be assigned to the integration in case no existing kit that matches the integration exists. Deprecated: use `build-mode` instead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packageTypes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Quarkus package types, `fast-jar` or `native` (default `fast-jar`). In case both `fast-jar` and `native` are specified, two `IntegrationKit` resources are created, with the native kit having precedence over the `fast-jar` one once ready. The order influences the resolution of the current kit for the integration. The kit corresponding to the first package type will be assigned to the integration in case no existing kit that matches the integration exists. Deprecated: use `build-mode` instead.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<PackageTypes> packageTypes;

    public java.util.List<PackageTypes> getPackageTypes() {
        return packageTypes;
    }

    public void setPackageTypes(java.util.List<PackageTypes> packageTypes) {
        this.packageTypes = packageTypes;
    }
}

