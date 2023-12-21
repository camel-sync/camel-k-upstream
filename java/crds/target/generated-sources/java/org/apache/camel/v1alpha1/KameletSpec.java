package org.apache.camel.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"dataTypes","definition","dependencies","sources","template","types"})
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
public class KameletSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * data specification types for the events consumed/produced by the Kamelet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataTypes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("data specification types for the events consumed/produced by the Kamelet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1alpha1.kameletspec.DataTypes> dataTypes;

    public java.util.Map<java.lang.String, org.apache.camel.v1alpha1.kameletspec.DataTypes> getDataTypes() {
        return dataTypes;
    }

    public void setDataTypes(java.util.Map<java.lang.String, org.apache.camel.v1alpha1.kameletspec.DataTypes> dataTypes) {
        this.dataTypes = dataTypes;
    }

    /**
     * defines the formal configuration of the Kamelet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("defines the formal configuration of the Kamelet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1alpha1.kameletspec.Definition definition;

    public org.apache.camel.v1alpha1.kameletspec.Definition getDefinition() {
        return definition;
    }

    public void setDefinition(org.apache.camel.v1alpha1.kameletspec.Definition definition) {
        this.definition = definition;
    }

    /**
     * Camel dependencies needed by the Kamelet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Camel dependencies needed by the Kamelet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> dependencies;

    public java.util.List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(java.util.List<String> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * sources in any Camel DSL supported
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("sources in any Camel DSL supported")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1alpha1.kameletspec.Sources> sources;

    public java.util.List<org.apache.camel.v1alpha1.kameletspec.Sources> getSources() {
        return sources;
    }

    public void setSources(java.util.List<org.apache.camel.v1alpha1.kameletspec.Sources> sources) {
        this.sources = sources;
    }

    /**
     * the main source in YAML DSL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the main source in YAML DSL")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1alpha1.kameletspec.Template template;

    public org.apache.camel.v1alpha1.kameletspec.Template getTemplate() {
        return template;
    }

    public void setTemplate(org.apache.camel.v1alpha1.kameletspec.Template template) {
        this.template = template;
    }

    /**
     * data specification types for the events consumed/produced by the Kamelet Deprecated: In favor of using DataTypes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("types")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("data specification types for the events consumed/produced by the Kamelet Deprecated: In favor of using DataTypes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, org.apache.camel.v1alpha1.kameletspec.Types> types;

    public java.util.Map<java.lang.String, org.apache.camel.v1alpha1.kameletspec.Types> getTypes() {
        return types;
    }

    public void setTypes(java.util.Map<java.lang.String, org.apache.camel.v1alpha1.kameletspec.Types> types) {
        this.types = types;
    }
}

