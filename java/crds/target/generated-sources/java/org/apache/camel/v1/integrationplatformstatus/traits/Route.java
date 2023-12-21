package org.apache.camel.v1.integrationplatformstatus.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"annotations","configuration","enabled","host","tlsCACertificate","tlsCACertificateSecret","tlsCertificate","tlsCertificateSecret","tlsDestinationCACertificate","tlsDestinationCACertificateSecret","tlsInsecureEdgeTerminationPolicy","tlsKey","tlsKeySecret","tlsTermination"})
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
public class Route implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The annotations added to route. This can be used to set route specific annotations For annotations options see https://docs.openshift.com/container-platform/3.11/architecture/networking/routes.html#route-specific-annotations CLI usage example: -t "route.annotations.'haproxy.router.openshift.io/balance'=true"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("annotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The annotations added to route. This can be used to set route specific annotations For annotations options see https://docs.openshift.com/container-platform/3.11/architecture/networking/routes.html#route-specific-annotations CLI usage example: -t \"route.annotations.'haproxy.router.openshift.io/balance'=true\"")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> annotations;

    public java.util.Map<java.lang.String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(java.util.Map<java.lang.String, String> annotations) {
        this.annotations = annotations;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformstatus.traits.route.Configuration configuration;

    public org.apache.camel.v1.integrationplatformstatus.traits.route.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationplatformstatus.traits.route.Configuration configuration) {
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
     * To configure the host exposed by the route.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("To configure the host exposed by the route.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * The TLS CA certificate contents.
     *  Refer to the OpenShift route documentation for additional information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsCACertificate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The TLS CA certificate contents. \n Refer to the OpenShift route documentation for additional information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tlsCACertificate;

    public String getTlsCACertificate() {
        return tlsCACertificate;
    }

    public void setTlsCACertificate(String tlsCACertificate) {
        this.tlsCACertificate = tlsCACertificate;
    }

    /**
     * The secret name and key reference to the TLS CA certificate. The format is "secret-name[/key-name]", the value represents the secret name, if there is only one key in the secret it will be read, otherwise you can set a key name separated with a "/".
     *  Refer to the OpenShift route documentation for additional information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsCACertificateSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The secret name and key reference to the TLS CA certificate. The format is \"secret-name[/key-name]\", the value represents the secret name, if there is only one key in the secret it will be read, otherwise you can set a key name separated with a \"/\". \n Refer to the OpenShift route documentation for additional information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tlsCACertificateSecret;

    public String getTlsCACertificateSecret() {
        return tlsCACertificateSecret;
    }

    public void setTlsCACertificateSecret(String tlsCACertificateSecret) {
        this.tlsCACertificateSecret = tlsCACertificateSecret;
    }

    /**
     * The TLS certificate contents.
     *  Refer to the OpenShift route documentation for additional information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsCertificate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The TLS certificate contents. \n Refer to the OpenShift route documentation for additional information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tlsCertificate;

    public String getTlsCertificate() {
        return tlsCertificate;
    }

    public void setTlsCertificate(String tlsCertificate) {
        this.tlsCertificate = tlsCertificate;
    }

    /**
     * The secret name and key reference to the TLS certificate. The format is "secret-name[/key-name]", the value represents the secret name, if there is only one key in the secret it will be read, otherwise you can set a key name separated with a "/".
     *  Refer to the OpenShift route documentation for additional information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsCertificateSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The secret name and key reference to the TLS certificate. The format is \"secret-name[/key-name]\", the value represents the secret name, if there is only one key in the secret it will be read, otherwise you can set a key name separated with a \"/\". \n Refer to the OpenShift route documentation for additional information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tlsCertificateSecret;

    public String getTlsCertificateSecret() {
        return tlsCertificateSecret;
    }

    public void setTlsCertificateSecret(String tlsCertificateSecret) {
        this.tlsCertificateSecret = tlsCertificateSecret;
    }

    /**
     * The destination CA certificate provides the contents of the ca certificate of the final destination.  When using reencrypt termination this file should be provided in order to have routers use it for health checks on the secure connection. If this field is not specified, the router may provide its own destination CA and perform hostname validation using the short service name (service.namespace.svc), which allows infrastructure generated certificates to automatically verify.
     *  Refer to the OpenShift route documentation for additional information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsDestinationCACertificate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The destination CA certificate provides the contents of the ca certificate of the final destination.  When using reencrypt termination this file should be provided in order to have routers use it for health checks on the secure connection. If this field is not specified, the router may provide its own destination CA and perform hostname validation using the short service name (service.namespace.svc), which allows infrastructure generated certificates to automatically verify. \n Refer to the OpenShift route documentation for additional information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tlsDestinationCACertificate;

    public String getTlsDestinationCACertificate() {
        return tlsDestinationCACertificate;
    }

    public void setTlsDestinationCACertificate(String tlsDestinationCACertificate) {
        this.tlsDestinationCACertificate = tlsDestinationCACertificate;
    }

    /**
     * The secret name and key reference to the destination CA certificate. The format is "secret-name[/key-name]", the value represents the secret name, if there is only one key in the secret it will be read, otherwise you can set a key name separated with a "/".
     *  Refer to the OpenShift route documentation for additional information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsDestinationCACertificateSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The secret name and key reference to the destination CA certificate. The format is \"secret-name[/key-name]\", the value represents the secret name, if there is only one key in the secret it will be read, otherwise you can set a key name separated with a \"/\". \n Refer to the OpenShift route documentation for additional information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tlsDestinationCACertificateSecret;

    public String getTlsDestinationCACertificateSecret() {
        return tlsDestinationCACertificateSecret;
    }

    public void setTlsDestinationCACertificateSecret(String tlsDestinationCACertificateSecret) {
        this.tlsDestinationCACertificateSecret = tlsDestinationCACertificateSecret;
    }

    public enum TlsInsecureEdgeTerminationPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("None")
        NONE("None"), @com.fasterxml.jackson.annotation.JsonProperty("Allow")
        ALLOW("Allow"), @com.fasterxml.jackson.annotation.JsonProperty("Redirect")
        REDIRECT("Redirect");

        java.lang.String value;

        TlsInsecureEdgeTerminationPolicy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * To configure how to deal with insecure traffic, e.g. `Allow`, `Disable` or `Redirect` traffic.
     *  Refer to the OpenShift route documentation for additional information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsInsecureEdgeTerminationPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("To configure how to deal with insecure traffic, e.g. `Allow`, `Disable` or `Redirect` traffic. \n Refer to the OpenShift route documentation for additional information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private TlsInsecureEdgeTerminationPolicy tlsInsecureEdgeTerminationPolicy;

    public TlsInsecureEdgeTerminationPolicy getTlsInsecureEdgeTerminationPolicy() {
        return tlsInsecureEdgeTerminationPolicy;
    }

    public void setTlsInsecureEdgeTerminationPolicy(TlsInsecureEdgeTerminationPolicy tlsInsecureEdgeTerminationPolicy) {
        this.tlsInsecureEdgeTerminationPolicy = tlsInsecureEdgeTerminationPolicy;
    }

    /**
     * The TLS certificate key contents.
     *  Refer to the OpenShift route documentation for additional information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsKey")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The TLS certificate key contents. \n Refer to the OpenShift route documentation for additional information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tlsKey;

    public String getTlsKey() {
        return tlsKey;
    }

    public void setTlsKey(String tlsKey) {
        this.tlsKey = tlsKey;
    }

    /**
     * The secret name and key reference to the TLS certificate key. The format is "secret-name[/key-name]", the value represents the secret name, if there is only one key in the secret it will be read, otherwise you can set a key name separated with a "/".
     *  Refer to the OpenShift route documentation for additional information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsKeySecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The secret name and key reference to the TLS certificate key. The format is \"secret-name[/key-name]\", the value represents the secret name, if there is only one key in the secret it will be read, otherwise you can set a key name separated with a \"/\". \n Refer to the OpenShift route documentation for additional information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tlsKeySecret;

    public String getTlsKeySecret() {
        return tlsKeySecret;
    }

    public void setTlsKeySecret(String tlsKeySecret) {
        this.tlsKeySecret = tlsKeySecret;
    }

    public enum TlsTermination {

        @com.fasterxml.jackson.annotation.JsonProperty("edge")
        EDGE("edge"), @com.fasterxml.jackson.annotation.JsonProperty("reencrypt")
        REENCRYPT("reencrypt"), @com.fasterxml.jackson.annotation.JsonProperty("passthrough")
        PASSTHROUGH("passthrough");

        java.lang.String value;

        TlsTermination(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The TLS termination type, like `edge`, `passthrough` or `reencrypt`.
     *  Refer to the OpenShift route documentation for additional information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsTermination")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The TLS termination type, like `edge`, `passthrough` or `reencrypt`. \n Refer to the OpenShift route documentation for additional information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private TlsTermination tlsTermination;

    public TlsTermination getTlsTermination() {
        return tlsTermination;
    }

    public void setTlsTermination(TlsTermination tlsTermination) {
        this.tlsTermination = tlsTermination;
    }
}

