package org.apache.camel.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"artifacts","loaders","runtime"})
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
public class CamelCatalogSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * artifacts required by this catalog
     */
    @com.fasterxml.jackson.annotation.JsonProperty("artifacts")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("artifacts required by this catalog")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1.camelcatalogspec.Artifacts> artifacts;

    public java.util.Map<java.lang.String, org.apache.camel.v1.camelcatalogspec.Artifacts> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(java.util.Map<java.lang.String, org.apache.camel.v1.camelcatalogspec.Artifacts> artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * loaders required by this catalog
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loaders")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("loaders required by this catalog")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1.camelcatalogspec.Loaders> loaders;

    public java.util.Map<java.lang.String, org.apache.camel.v1.camelcatalogspec.Loaders> getLoaders() {
        return loaders;
    }

    public void setLoaders(java.util.Map<java.lang.String, org.apache.camel.v1.camelcatalogspec.Loaders> loaders) {
        this.loaders = loaders;
    }

    /**
     * the runtime targeted for the catalog
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtime")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the runtime targeted for the catalog")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.camelcatalogspec.Runtime runtime;

    public org.apache.camel.v1.camelcatalogspec.Runtime getRuntime() {
        return runtime;
    }

    public void setRuntime(org.apache.camel.v1.camelcatalogspec.Runtime runtime) {
        this.runtime = runtime;
    }
}

