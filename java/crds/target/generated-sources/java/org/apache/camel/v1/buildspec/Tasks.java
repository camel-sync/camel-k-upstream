package org.apache.camel.v1.buildspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"buildah","builder","custom","jib","kaniko","package","s2i","spectrum"})
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
public class Tasks implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * a BuildahTask, for Buildah strategy Deprecated: use spectrum, jib or s2i instead
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildah")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a BuildahTask, for Buildah strategy Deprecated: use spectrum, jib or s2i instead")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.Buildah buildah;

    public org.apache.camel.v1.buildspec.tasks.Buildah getBuildah() {
        return buildah;
    }

    public void setBuildah(org.apache.camel.v1.buildspec.tasks.Buildah buildah) {
        this.buildah = buildah;
    }

    /**
     * a BuilderTask, used to generate and build the project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("builder")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a BuilderTask, used to generate and build the project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.Builder builder;

    public org.apache.camel.v1.buildspec.tasks.Builder getBuilder() {
        return builder;
    }

    public void setBuilder(org.apache.camel.v1.buildspec.tasks.Builder builder) {
        this.builder = builder;
    }

    /**
     * User customizable task execution. These are executed after the build and before the package task.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("custom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("User customizable task execution. These are executed after the build and before the package task.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.Custom custom;

    public org.apache.camel.v1.buildspec.tasks.Custom getCustom() {
        return custom;
    }

    public void setCustom(org.apache.camel.v1.buildspec.tasks.Custom custom) {
        this.custom = custom;
    }

    /**
     * a JibTask, for Jib strategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jib")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a JibTask, for Jib strategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.Jib jib;

    public org.apache.camel.v1.buildspec.tasks.Jib getJib() {
        return jib;
    }

    public void setJib(org.apache.camel.v1.buildspec.tasks.Jib jib) {
        this.jib = jib;
    }

    /**
     * a KanikoTask, for Kaniko strategy Deprecated: use spectrum, jib or s2i instead
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kaniko")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a KanikoTask, for Kaniko strategy Deprecated: use spectrum, jib or s2i instead")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.Kaniko kaniko;

    public org.apache.camel.v1.buildspec.tasks.Kaniko getKaniko() {
        return kaniko;
    }

    public void setKaniko(org.apache.camel.v1.buildspec.tasks.Kaniko kaniko) {
        this.kaniko = kaniko;
    }

    /**
     * Application pre publishing a PackageTask, used to package the project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("package")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Application pre publishing a PackageTask, used to package the project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.Package _package;

    public org.apache.camel.v1.buildspec.tasks.Package get_package() {
        return _package;
    }

    public void set_package(org.apache.camel.v1.buildspec.tasks.Package _package) {
        this._package = _package;
    }

    /**
     * a S2iTask, for S2I strategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("s2i")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a S2iTask, for S2I strategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.S2i s2i;

    public org.apache.camel.v1.buildspec.tasks.S2i getS2i() {
        return s2i;
    }

    public void setS2i(org.apache.camel.v1.buildspec.tasks.S2i s2i) {
        this.s2i = s2i;
    }

    /**
     * a SpectrumTask, for Spectrum strategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spectrum")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a SpectrumTask, for Spectrum strategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.Spectrum spectrum;

    public org.apache.camel.v1.buildspec.tasks.Spectrum getSpectrum() {
        return spectrum;
    }

    public void setSpectrum(org.apache.camel.v1.buildspec.tasks.Spectrum spectrum) {
        this.spectrum = spectrum;
    }
}

