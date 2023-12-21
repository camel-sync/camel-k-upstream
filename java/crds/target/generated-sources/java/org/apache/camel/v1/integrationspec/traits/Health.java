package org.apache.camel.v1.integrationspec.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configuration","enabled","livenessFailureThreshold","livenessInitialDelay","livenessPeriod","livenessProbeEnabled","livenessScheme","livenessSuccessThreshold","livenessTimeout","readinessFailureThreshold","readinessInitialDelay","readinessPeriod","readinessProbeEnabled","readinessScheme","readinessSuccessThreshold","readinessTimeout","startupFailureThreshold","startupInitialDelay","startupPeriod","startupProbeEnabled","startupScheme","startupSuccessThreshold","startupTimeout"})
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
public class Health implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationspec.traits.health.Configuration configuration;

    public org.apache.camel.v1.integrationspec.traits.health.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationspec.traits.health.Configuration configuration) {
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
     * Minimum consecutive failures for the liveness probe to be considered failed after having succeeded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessFailureThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive failures for the liveness probe to be considered failed after having succeeded.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer livenessFailureThreshold;

    public Integer getLivenessFailureThreshold() {
        return livenessFailureThreshold;
    }

    public void setLivenessFailureThreshold(Integer livenessFailureThreshold) {
        this.livenessFailureThreshold = livenessFailureThreshold;
    }

    /**
     * Number of seconds after the container has started before the liveness probe is initiated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessInitialDelay")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds after the container has started before the liveness probe is initiated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer livenessInitialDelay;

    public Integer getLivenessInitialDelay() {
        return livenessInitialDelay;
    }

    public void setLivenessInitialDelay(Integer livenessInitialDelay) {
        this.livenessInitialDelay = livenessInitialDelay;
    }

    /**
     * How often to perform the liveness probe.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessPeriod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How often to perform the liveness probe.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer livenessPeriod;

    public Integer getLivenessPeriod() {
        return livenessPeriod;
    }

    public void setLivenessPeriod(Integer livenessPeriod) {
        this.livenessPeriod = livenessPeriod;
    }

    /**
     * Configures the liveness probe for the integration container (default `false`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessProbeEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures the liveness probe for the integration container (default `false`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean livenessProbeEnabled = false;

    public Boolean getLivenessProbeEnabled() {
        return livenessProbeEnabled;
    }

    public void setLivenessProbeEnabled(Boolean livenessProbeEnabled) {
        this.livenessProbeEnabled = livenessProbeEnabled;
    }

    /**
     * Scheme to use when connecting to the liveness probe (default `HTTP`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessScheme")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Scheme to use when connecting to the liveness probe (default `HTTP`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String livenessScheme = "HTTP";

    public String getLivenessScheme() {
        return livenessScheme;
    }

    public void setLivenessScheme(String livenessScheme) {
        this.livenessScheme = livenessScheme;
    }

    /**
     * Minimum consecutive successes for the liveness probe to be considered successful after having failed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessSuccessThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive successes for the liveness probe to be considered successful after having failed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer livenessSuccessThreshold;

    public Integer getLivenessSuccessThreshold() {
        return livenessSuccessThreshold;
    }

    public void setLivenessSuccessThreshold(Integer livenessSuccessThreshold) {
        this.livenessSuccessThreshold = livenessSuccessThreshold;
    }

    /**
     * Number of seconds after which the liveness probe times out.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessTimeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds after which the liveness probe times out.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer livenessTimeout;

    public Integer getLivenessTimeout() {
        return livenessTimeout;
    }

    public void setLivenessTimeout(Integer livenessTimeout) {
        this.livenessTimeout = livenessTimeout;
    }

    /**
     * Minimum consecutive failures for the readiness probe to be considered failed after having succeeded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessFailureThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive failures for the readiness probe to be considered failed after having succeeded.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer readinessFailureThreshold;

    public Integer getReadinessFailureThreshold() {
        return readinessFailureThreshold;
    }

    public void setReadinessFailureThreshold(Integer readinessFailureThreshold) {
        this.readinessFailureThreshold = readinessFailureThreshold;
    }

    /**
     * Number of seconds after the container has started before the readiness probe is initiated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessInitialDelay")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds after the container has started before the readiness probe is initiated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer readinessInitialDelay;

    public Integer getReadinessInitialDelay() {
        return readinessInitialDelay;
    }

    public void setReadinessInitialDelay(Integer readinessInitialDelay) {
        this.readinessInitialDelay = readinessInitialDelay;
    }

    /**
     * How often to perform the readiness probe.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessPeriod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How often to perform the readiness probe.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer readinessPeriod;

    public Integer getReadinessPeriod() {
        return readinessPeriod;
    }

    public void setReadinessPeriod(Integer readinessPeriod) {
        this.readinessPeriod = readinessPeriod;
    }

    /**
     * Configures the readiness probe for the integration container (default `true`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessProbeEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures the readiness probe for the integration container (default `true`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readinessProbeEnabled = true;

    public Boolean getReadinessProbeEnabled() {
        return readinessProbeEnabled;
    }

    public void setReadinessProbeEnabled(Boolean readinessProbeEnabled) {
        this.readinessProbeEnabled = readinessProbeEnabled;
    }

    /**
     * Scheme to use when connecting to the readiness probe (default `HTTP`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessScheme")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Scheme to use when connecting to the readiness probe (default `HTTP`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String readinessScheme = "HTTP";

    public String getReadinessScheme() {
        return readinessScheme;
    }

    public void setReadinessScheme(String readinessScheme) {
        this.readinessScheme = readinessScheme;
    }

    /**
     * Minimum consecutive successes for the readiness probe to be considered successful after having failed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessSuccessThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive successes for the readiness probe to be considered successful after having failed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer readinessSuccessThreshold;

    public Integer getReadinessSuccessThreshold() {
        return readinessSuccessThreshold;
    }

    public void setReadinessSuccessThreshold(Integer readinessSuccessThreshold) {
        this.readinessSuccessThreshold = readinessSuccessThreshold;
    }

    /**
     * Number of seconds after which the readiness probe times out.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessTimeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds after which the readiness probe times out.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer readinessTimeout;

    public Integer getReadinessTimeout() {
        return readinessTimeout;
    }

    public void setReadinessTimeout(Integer readinessTimeout) {
        this.readinessTimeout = readinessTimeout;
    }

    /**
     * Minimum consecutive failures for the startup probe to be considered failed after having succeeded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startupFailureThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive failures for the startup probe to be considered failed after having succeeded.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer startupFailureThreshold;

    public Integer getStartupFailureThreshold() {
        return startupFailureThreshold;
    }

    public void setStartupFailureThreshold(Integer startupFailureThreshold) {
        this.startupFailureThreshold = startupFailureThreshold;
    }

    /**
     * Number of seconds after the container has started before the startup probe is initiated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startupInitialDelay")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds after the container has started before the startup probe is initiated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer startupInitialDelay;

    public Integer getStartupInitialDelay() {
        return startupInitialDelay;
    }

    public void setStartupInitialDelay(Integer startupInitialDelay) {
        this.startupInitialDelay = startupInitialDelay;
    }

    /**
     * How often to perform the startup probe.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startupPeriod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How often to perform the startup probe.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer startupPeriod;

    public Integer getStartupPeriod() {
        return startupPeriod;
    }

    public void setStartupPeriod(Integer startupPeriod) {
        this.startupPeriod = startupPeriod;
    }

    /**
     * Configures the startup probe for the integration container (default `false`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startupProbeEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures the startup probe for the integration container (default `false`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean startupProbeEnabled = false;

    public Boolean getStartupProbeEnabled() {
        return startupProbeEnabled;
    }

    public void setStartupProbeEnabled(Boolean startupProbeEnabled) {
        this.startupProbeEnabled = startupProbeEnabled;
    }

    /**
     * Scheme to use when connecting to the startup probe (default `HTTP`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startupScheme")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Scheme to use when connecting to the startup probe (default `HTTP`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String startupScheme = "HTTP";

    public String getStartupScheme() {
        return startupScheme;
    }

    public void setStartupScheme(String startupScheme) {
        this.startupScheme = startupScheme;
    }

    /**
     * Minimum consecutive successes for the startup probe to be considered successful after having failed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startupSuccessThreshold")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive successes for the startup probe to be considered successful after having failed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer startupSuccessThreshold;

    public Integer getStartupSuccessThreshold() {
        return startupSuccessThreshold;
    }

    public void setStartupSuccessThreshold(Integer startupSuccessThreshold) {
        this.startupSuccessThreshold = startupSuccessThreshold;
    }

    /**
     * Number of seconds after which the startup probe times out.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startupTimeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of seconds after which the startup probe times out.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer startupTimeout;

    public Integer getStartupTimeout() {
        return startupTimeout;
    }

    public void setStartupTimeout(Integer startupTimeout) {
        this.startupTimeout = startupTimeout;
    }
}

