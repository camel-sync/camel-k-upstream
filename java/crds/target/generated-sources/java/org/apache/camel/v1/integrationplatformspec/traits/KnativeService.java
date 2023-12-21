package org.apache.camel.v1.integrationplatformspec.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"annotations","auto","autoscalingMetric","autoscalingTarget","class","configuration","enabled","maxScale","minScale","rolloutDuration","visibility"})
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
public class KnativeService implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The annotations added to route. This can be used to set knative service specific annotations CLI usage example: -t "knative-service.annotations.'haproxy.router.openshift.io/balance'=true"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("annotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The annotations added to route. This can be used to set knative service specific annotations CLI usage example: -t \"knative-service.annotations.'haproxy.router.openshift.io/balance'=true\"")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> annotations;

    public java.util.Map<java.lang.String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(java.util.Map<java.lang.String, String> annotations) {
        this.annotations = annotations;
    }

    /**
     * Automatically deploy the integration as Knative service when all conditions hold:
     *  Integration is using the Knative profile * All routes are either starting from an HTTP based consumer or a passive consumer (e.g. `direct` is a passive consumer)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auto")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Automatically deploy the integration as Knative service when all conditions hold: \n * Integration is using the Knative profile * All routes are either starting from an HTTP based consumer or a passive consumer (e.g. `direct` is a passive consumer)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean auto;

    public Boolean getAuto() {
        return auto;
    }

    public void setAuto(Boolean auto) {
        this.auto = auto;
    }

    /**
     * Configures the Knative autoscaling metric property (e.g. to set `concurrency` based or `cpu` based autoscaling).
     *  Refer to the Knative documentation for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoscalingMetric")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures the Knative autoscaling metric property (e.g. to set `concurrency` based or `cpu` based autoscaling). \n Refer to the Knative documentation for more information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String autoscalingMetric;

    public String getAutoscalingMetric() {
        return autoscalingMetric;
    }

    public void setAutoscalingMetric(String autoscalingMetric) {
        this.autoscalingMetric = autoscalingMetric;
    }

    /**
     * Sets the allowed concurrency level or CPU percentage (depending on the autoscaling metric) for each Pod.
     *  Refer to the Knative documentation for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoscalingTarget")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Sets the allowed concurrency level or CPU percentage (depending on the autoscaling metric) for each Pod. \n Refer to the Knative documentation for more information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long autoscalingTarget;

    public Long getAutoscalingTarget() {
        return autoscalingTarget;
    }

    public void setAutoscalingTarget(Long autoscalingTarget) {
        this.autoscalingTarget = autoscalingTarget;
    }

    public enum Class {

        @com.fasterxml.jackson.annotation.JsonProperty("kpa.autoscaling.knative.dev")
        KPA_AUTOSCALING_KNATIVE_DEV("kpa.autoscaling.knative.dev"), @com.fasterxml.jackson.annotation.JsonProperty("hpa.autoscaling.knative.dev")
        HPA_AUTOSCALING_KNATIVE_DEV("hpa.autoscaling.knative.dev");

        java.lang.String value;

        Class(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Configures the Knative autoscaling class property (e.g. to set `hpa.autoscaling.knative.dev` or `kpa.autoscaling.knative.dev` autoscaling).
     *  Refer to the Knative documentation for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("class")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures the Knative autoscaling class property (e.g. to set `hpa.autoscaling.knative.dev` or `kpa.autoscaling.knative.dev` autoscaling). \n Refer to the Knative documentation for more information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Class _class;

    public Class get_class() {
        return _class;
    }

    public void set_class(Class _class) {
        this._class = _class;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.knativeservice.Configuration configuration;

    public org.apache.camel.v1.integrationplatformspec.traits.knativeservice.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationplatformspec.traits.knativeservice.Configuration configuration) {
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
     * An upper bound for the number of Pods that can be running in parallel for the integration. Knative has its own cap value that depends on the installation.
     *  Refer to the Knative documentation for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxScale")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("An upper bound for the number of Pods that can be running in parallel for the integration. Knative has its own cap value that depends on the installation. \n Refer to the Knative documentation for more information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long maxScale;

    public Long getMaxScale() {
        return maxScale;
    }

    public void setMaxScale(Long maxScale) {
        this.maxScale = maxScale;
    }

    /**
     * The minimum number of Pods that should be running at any time for the integration. It's **zero** by default, meaning that the integration is scaled down to zero when not used for a configured amount of time.
     *  Refer to the Knative documentation for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minScale")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimum number of Pods that should be running at any time for the integration. It's **zero** by default, meaning that the integration is scaled down to zero when not used for a configured amount of time. \n Refer to the Knative documentation for more information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long minScale;

    public Long getMinScale() {
        return minScale;
    }

    public void setMinScale(Long minScale) {
        this.minScale = minScale;
    }

    /**
     * Enables to gradually shift traffic to the latest Revision and sets the rollout duration. It's disabled by default and must be expressed as a Golang `time.Duration` string representation, rounded to a second precision.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rolloutDuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enables to gradually shift traffic to the latest Revision and sets the rollout duration. It's disabled by default and must be expressed as a Golang `time.Duration` string representation, rounded to a second precision.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String rolloutDuration;

    public String getRolloutDuration() {
        return rolloutDuration;
    }

    public void setRolloutDuration(String rolloutDuration) {
        this.rolloutDuration = rolloutDuration;
    }

    public enum Visibility {

        @com.fasterxml.jackson.annotation.JsonProperty("cluster-local")
        CLUSTERLOCAL("cluster-local");

        java.lang.String value;

        Visibility(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Setting `cluster-local`, Knative service becomes a private service. Specifically, this option applies the `networking.knative.dev/visibility` label to Knative service.
     *  Refer to the Knative documentation for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("visibility")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Setting `cluster-local`, Knative service becomes a private service. Specifically, this option applies the `networking.knative.dev/visibility` label to Knative service. \n Refer to the Knative documentation for more information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Visibility visibility;

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }
}

