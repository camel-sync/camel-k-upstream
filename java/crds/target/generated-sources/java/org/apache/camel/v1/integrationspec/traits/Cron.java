package org.apache.camel.v1.integrationspec.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"activeDeadlineSeconds","auto","backoffLimit","components","concurrencyPolicy","configuration","enabled","fallback","schedule","startingDeadlineSeconds"})
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
public class Cron implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Specifies the duration in seconds, relative to the start time, that the job may be continuously active before it is considered to be failed. It defaults to 60s.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activeDeadlineSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the duration in seconds, relative to the start time, that the job may be continuously active before it is considered to be failed. It defaults to 60s.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long activeDeadlineSeconds = 60L;

    public Long getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    /**
     * Automatically deploy the integration as CronJob when all routes are either starting from a periodic consumer (only `cron`, `timer` and `quartz` are supported) or a passive consumer (e.g. `direct` is a passive consumer).
     *  It's required that all periodic consumers have the same period, and it can be expressed as cron schedule (e.g. `1m` can be expressed as `0/1 * * * *`, while `35m` or `50s` cannot).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auto")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Automatically deploy the integration as CronJob when all routes are either starting from a periodic consumer (only `cron`, `timer` and `quartz` are supported) or a passive consumer (e.g. `direct` is a passive consumer). \n It's required that all periodic consumers have the same period, and it can be expressed as cron schedule (e.g. `1m` can be expressed as `0/1 * * * *`, while `35m` or `50s` cannot).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean auto;

    public Boolean getAuto() {
        return auto;
    }

    public void setAuto(Boolean auto) {
        this.auto = auto;
    }

    /**
     * Specifies the number of retries before marking the job failed. It defaults to 2.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backoffLimit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the number of retries before marking the job failed. It defaults to 2.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer backoffLimit = 2;

    public Integer getBackoffLimit() {
        return backoffLimit;
    }

    public void setBackoffLimit(Integer backoffLimit) {
        this.backoffLimit = backoffLimit;
    }

    /**
     * A comma separated list of the Camel components that need to be customized in order for them to work when the schedule is triggered externally by Kubernetes. A specific customizer is activated for each specified component. E.g. for the `timer` component, the `cron-timer` customizer is activated (it's present in the `org.apache.camel.k:camel-k-cron` library).
     *  Supported components are currently: `cron`, `timer` and `quartz`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("components")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A comma separated list of the Camel components that need to be customized in order for them to work when the schedule is triggered externally by Kubernetes. A specific customizer is activated for each specified component. E.g. for the `timer` component, the `cron-timer` customizer is activated (it's present in the `org.apache.camel.k:camel-k-cron` library). \n Supported components are currently: `cron`, `timer` and `quartz`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String components;

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public enum ConcurrencyPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("Allow")
        ALLOW("Allow"), @com.fasterxml.jackson.annotation.JsonProperty("Forbid")
        FORBID("Forbid"), @com.fasterxml.jackson.annotation.JsonProperty("Replace")
        REPLACE("Replace");

        java.lang.String value;

        ConcurrencyPolicy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow": allows CronJobs to run concurrently; - "Forbid" (default): forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
     */
    @com.fasterxml.jackson.annotation.JsonProperty("concurrencyPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies how to treat concurrent executions of a Job. Valid values are: - \"Allow\": allows CronJobs to run concurrently; - \"Forbid\" (default): forbids concurrent runs, skipping next run if previous run hasn't finished yet; - \"Replace\": cancels currently running job and replaces it with a new one")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ConcurrencyPolicy concurrencyPolicy;

    public ConcurrencyPolicy getConcurrencyPolicy() {
        return concurrencyPolicy;
    }

    public void setConcurrencyPolicy(ConcurrencyPolicy concurrencyPolicy) {
        this.concurrencyPolicy = concurrencyPolicy;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationspec.traits.cron.Configuration configuration;

    public org.apache.camel.v1.integrationspec.traits.cron.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationspec.traits.cron.Configuration configuration) {
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
     * Use the default Camel implementation of the `cron` endpoint (`quartz`) instead of trying to materialize the integration as Kubernetes CronJob.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fallback")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use the default Camel implementation of the `cron` endpoint (`quartz`) instead of trying to materialize the integration as Kubernetes CronJob.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean fallback;

    public Boolean getFallback() {
        return fallback;
    }

    public void setFallback(Boolean fallback) {
        this.fallback = fallback;
    }

    /**
     * The CronJob schedule for the whole integration. If multiple routes are declared, they must have the same schedule for this mechanism to work correctly.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The CronJob schedule for the whole integration. If multiple routes are declared, they must have the same schedule for this mechanism to work correctly.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String schedule;

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startingDeadlineSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long startingDeadlineSeconds;

    public Long getStartingDeadlineSeconds() {
        return startingDeadlineSeconds;
    }

    public void setStartingDeadlineSeconds(Long startingDeadlineSeconds) {
        this.startingDeadlineSeconds = startingDeadlineSeconds;
    }
}

