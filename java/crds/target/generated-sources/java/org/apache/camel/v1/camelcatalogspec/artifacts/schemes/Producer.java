package org.apache.camel.v1.camelcatalogspec.artifacts.schemes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"dependencies"})
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
public class Producer implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * list of dependencies needed for this scope
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("list of dependencies needed for this scope")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.schemes.producer.Dependencies> dependencies;

    public java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.schemes.producer.Dependencies> getDependencies() {
        return dependencies;
    }

    public void setDependencies(java.util.List<org.apache.camel.v1.camelcatalogspec.artifacts.schemes.producer.Dependencies> dependencies) {
        this.dependencies = dependencies;
    }
}

