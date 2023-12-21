package org.apache.camel.v1.integrationspec.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"classpath","configuration","debug","debugAddress","debugSuspend","enabled","options","printCommand"})
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
public class Jvm implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Additional JVM classpath (use `Linux` classpath separator)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("classpath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Additional JVM classpath (use `Linux` classpath separator)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String classpath;

    public String getClasspath() {
        return classpath;
    }

    public void setClasspath(String classpath) {
        this.classpath = classpath;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationspec.traits.jvm.Configuration configuration;

    public org.apache.camel.v1.integrationspec.traits.jvm.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationspec.traits.jvm.Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * Activates remote debugging, so that a debugger can be attached to the JVM, e.g., using port-forwarding
     */
    @com.fasterxml.jackson.annotation.JsonProperty("debug")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Activates remote debugging, so that a debugger can be attached to the JVM, e.g., using port-forwarding")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean debug;

    public Boolean getDebug() {
        return debug;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    /**
     * Transport address at which to listen for the newly launched JVM (default `*:5005`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("debugAddress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Transport address at which to listen for the newly launched JVM (default `*:5005`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String debugAddress = "*:5005";

    public String getDebugAddress() {
        return debugAddress;
    }

    public void setDebugAddress(String debugAddress) {
        this.debugAddress = debugAddress;
    }

    /**
     * Suspends the target JVM immediately before the main class is loaded
     */
    @com.fasterxml.jackson.annotation.JsonProperty("debugSuspend")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Suspends the target JVM immediately before the main class is loaded")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean debugSuspend;

    public Boolean getDebugSuspend() {
        return debugSuspend;
    }

    public void setDebugSuspend(Boolean debugSuspend) {
        this.debugSuspend = debugSuspend;
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
     * A list of JVM options
     */
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of JVM options")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> options;

    public java.util.List<String> getOptions() {
        return options;
    }

    public void setOptions(java.util.List<String> options) {
        this.options = options;
    }

    /**
     * Prints the command used the start the JVM in the container logs (default `true`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("printCommand")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Prints the command used the start the JVM in the container logs (default `true`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean printCommand = true;

    public Boolean getPrintCommand() {
        return printCommand;
    }

    public void setPrintCommand(Boolean printCommand) {
        this.printCommand = printCommand;
    }
}

