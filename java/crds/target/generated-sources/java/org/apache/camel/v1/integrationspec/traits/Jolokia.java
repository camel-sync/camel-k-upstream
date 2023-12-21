package org.apache.camel.v1.integrationspec.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"CACert","clientPrincipal","configuration","discoveryEnabled","enabled","extendedClientCheck","host","options","password","port","protocol","useSSLClientAuthentication","user"})
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
public class Jolokia implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The PEM encoded CA certification file path, used to verify client certificates, applicable when `protocol` is `https` and `use-ssl-client-authentication` is `true` (default `/var/run/secrets/kubernetes.io/serviceaccount/service-ca.crt` for OpenShift).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CACert")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The PEM encoded CA certification file path, used to verify client certificates, applicable when `protocol` is `https` and `use-ssl-client-authentication` is `true` (default `/var/run/secrets/kubernetes.io/serviceaccount/service-ca.crt` for OpenShift).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String CACert;

    public String getCACert() {
        return CACert;
    }

    public void setCACert(String CACert) {
        this.CACert = CACert;
    }

    /**
     * The principal(s) which must be given in a client certificate to allow access to the Jolokia endpoint, applicable when `protocol` is `https` and `use-ssl-client-authentication` is `true` (default `clientPrincipal=cn=system:master-proxy`, `cn=hawtio-online.hawtio.svc` and `cn=fuse-console.fuse.svc` for OpenShift).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientPrincipal")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The principal(s) which must be given in a client certificate to allow access to the Jolokia endpoint, applicable when `protocol` is `https` and `use-ssl-client-authentication` is `true` (default `clientPrincipal=cn=system:master-proxy`, `cn=hawtio-online.hawtio.svc` and `cn=fuse-console.fuse.svc` for OpenShift).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> clientPrincipal;

    public java.util.List<String> getClientPrincipal() {
        return clientPrincipal;
    }

    public void setClientPrincipal(java.util.List<String> clientPrincipal) {
        this.clientPrincipal = clientPrincipal;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationspec.traits.jolokia.Configuration configuration;

    public org.apache.camel.v1.integrationspec.traits.jolokia.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationspec.traits.jolokia.Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * Listen for multicast requests (default `false`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Listen for multicast requests (default `false`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean discoveryEnabled = false;

    public Boolean getDiscoveryEnabled() {
        return discoveryEnabled;
    }

    public void setDiscoveryEnabled(Boolean discoveryEnabled) {
        this.discoveryEnabled = discoveryEnabled;
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
     * Mandate the client certificate contains a client flag in the extended key usage section, applicable when `protocol` is `https` and `use-ssl-client-authentication` is `true` (default `true` for OpenShift).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedClientCheck")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Mandate the client certificate contains a client flag in the extended key usage section, applicable when `protocol` is `https` and `use-ssl-client-authentication` is `true` (default `true` for OpenShift).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean extendedClientCheck;

    public Boolean getExtendedClientCheck() {
        return extendedClientCheck;
    }

    public void setExtendedClientCheck(Boolean extendedClientCheck) {
        this.extendedClientCheck = extendedClientCheck;
    }

    /**
     * The Host address to which the Jolokia agent should bind to. If `"\*"` or `"0.0.0.0"` is given, the servers binds to every network interface (default `"*"`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Host address to which the Jolokia agent should bind to. If `\"\\*\"` or `\"0.0.0.0\"` is given, the servers binds to every network interface (default `\"*\"`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host = "*";

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * A list of additional Jolokia options as defined in https://jolokia.org/reference/html/agents.html#agent-jvm-config[JVM agent configuration options]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of additional Jolokia options as defined in https://jolokia.org/reference/html/agents.html#agent-jvm-config[JVM agent configuration options]")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> options;

    public java.util.List<String> getOptions() {
        return options;
    }

    public void setOptions(java.util.List<String> options) {
        this.options = options;
    }

    /**
     * The password used for authentication, applicable when the `user` option is set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The password used for authentication, applicable when the `user` option is set.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * The Jolokia endpoint port (default `8778`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Jolokia endpoint port (default `8778`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long port = 8778L;

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * The protocol to use, either `http` or `https` (default `https` for OpenShift)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The protocol to use, either `http` or `https` (default `https` for OpenShift)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String protocol;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Whether client certificates should be used for authentication (default `true` for OpenShift).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("useSSLClientAuthentication")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether client certificates should be used for authentication (default `true` for OpenShift).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean useSSLClientAuthentication;

    public Boolean getUseSSLClientAuthentication() {
        return useSSLClientAuthentication;
    }

    public void setUseSSLClientAuthentication(Boolean useSSLClientAuthentication) {
        this.useSSLClientAuthentication = useSSLClientAuthentication;
    }

    /**
     * The user to be used for authentication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The user to be used for authentication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

