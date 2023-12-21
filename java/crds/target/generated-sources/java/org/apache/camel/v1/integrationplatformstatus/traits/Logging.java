package org.apache.camel.v1.integrationplatformstatus.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"color","configuration","enabled","format","json","jsonPrettyPrint","level"})
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
public class Logging implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Colorize the log output
     */
    @com.fasterxml.jackson.annotation.JsonProperty("color")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Colorize the log output")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean color;

    public Boolean getColor() {
        return color;
    }

    public void setColor(Boolean color) {
        this.color = color;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformstatus.traits.logging.Configuration configuration;

    public org.apache.camel.v1.integrationplatformstatus.traits.logging.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationplatformstatus.traits.logging.Configuration configuration) {
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
     * Logs message format
     */
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logs message format")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Output the logs in JSON
     */
    @com.fasterxml.jackson.annotation.JsonProperty("json")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Output the logs in JSON")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean json;

    public Boolean getJson() {
        return json;
    }

    public void setJson(Boolean json) {
        this.json = json;
    }

    /**
     * Enable "pretty printing" of the JSON logs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jsonPrettyPrint")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable \"pretty printing\" of the JSON logs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean jsonPrettyPrint;

    public Boolean getJsonPrettyPrint() {
        return jsonPrettyPrint;
    }

    public void setJsonPrettyPrint(Boolean jsonPrettyPrint) {
        this.jsonPrettyPrint = jsonPrettyPrint;
    }

    public enum Level {

        @com.fasterxml.jackson.annotation.JsonProperty("FATAL")
        FATAL("FATAL"), @com.fasterxml.jackson.annotation.JsonProperty("WARN")
        WARN("WARN"), @com.fasterxml.jackson.annotation.JsonProperty("INFO")
        INFO("INFO"), @com.fasterxml.jackson.annotation.JsonProperty("DEBUG")
        DEBUG("DEBUG"), @com.fasterxml.jackson.annotation.JsonProperty("TRACE")
        TRACE("TRACE");

        java.lang.String value;

        Level(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Adjust the logging level (defaults to `INFO`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Adjust the logging level (defaults to `INFO`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Level level = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"INFO\"", Level.class);

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}

