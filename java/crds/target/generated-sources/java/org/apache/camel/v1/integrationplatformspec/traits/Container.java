package org.apache.camel.v1.integrationplatformspec.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"auto","configuration","enabled","expose","image","imagePullPolicy","limitCPU","limitMemory","name","port","portName","requestCPU","requestMemory","servicePort","servicePortName"})
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
public class Container implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * To automatically enable the trait
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auto")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("To automatically enable the trait")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean auto;

    public Boolean getAuto() {
        return auto;
    }

    public void setAuto(Boolean auto) {
        this.auto = auto;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.traits.container.Configuration configuration;

    public org.apache.camel.v1.integrationplatformspec.traits.container.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationplatformspec.traits.container.Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * Deprecated: no longer in use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: no longer in use.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Can be used to enable/disable exposure via kubernetes Service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expose")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Can be used to enable/disable exposure via kubernetes Service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean expose;

    public Boolean getExpose() {
        return expose;
    }

    public void setExpose(Boolean expose) {
        this.expose = expose;
    }

    /**
     * The main container image
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The main container image")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public enum ImagePullPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("Always")
        ALWAYS("Always"), @com.fasterxml.jackson.annotation.JsonProperty("Never")
        NEVER("Never"), @com.fasterxml.jackson.annotation.JsonProperty("IfNotPresent")
        IFNOTPRESENT("IfNotPresent");

        java.lang.String value;

        ImagePullPolicy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The pull policy: Always|Never|IfNotPresent
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The pull policy: Always|Never|IfNotPresent")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ImagePullPolicy imagePullPolicy;

    public ImagePullPolicy getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(ImagePullPolicy imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    /**
     * The maximum amount of CPU required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limitCPU")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum amount of CPU required.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String limitCPU;

    public String getLimitCPU() {
        return limitCPU;
    }

    public void setLimitCPU(String limitCPU) {
        this.limitCPU = limitCPU;
    }

    /**
     * The maximum amount of memory required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limitMemory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum amount of memory required.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String limitMemory;

    public String getLimitMemory() {
        return limitMemory;
    }

    public void setLimitMemory(String limitMemory) {
        this.limitMemory = limitMemory;
    }

    /**
     * The main container name. It's named `integration` by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The main container name. It's named `integration` by default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name = "integration";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * To configure a different port exposed by the container (default `8080`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("To configure a different port exposed by the container (default `8080`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long port = 8080L;

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * To configure a different port name for the port exposed by the container. It defaults to `http` only when the `expose` parameter is true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("To configure a different port name for the port exposed by the container. It defaults to `http` only when the `expose` parameter is true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String portName;

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    /**
     * The minimum amount of CPU required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestCPU")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimum amount of CPU required.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String requestCPU;

    public String getRequestCPU() {
        return requestCPU;
    }

    public void setRequestCPU(String requestCPU) {
        this.requestCPU = requestCPU;
    }

    /**
     * The minimum amount of memory required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestMemory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimum amount of memory required.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String requestMemory;

    public String getRequestMemory() {
        return requestMemory;
    }

    public void setRequestMemory(String requestMemory) {
        this.requestMemory = requestMemory;
    }

    /**
     * To configure under which service port the container port is to be exposed (default `80`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servicePort")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("To configure under which service port the container port is to be exposed (default `80`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long servicePort = 80L;

    public Long getServicePort() {
        return servicePort;
    }

    public void setServicePort(Long servicePort) {
        this.servicePort = servicePort;
    }

    /**
     * To configure under which service port name the container port is to be exposed (default `http`).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servicePortName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("To configure under which service port name the container port is to be exposed (default `http`).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String servicePortName = "http";

    public String getServicePortName() {
        return servicePortName;
    }

    public void setServicePortName(String servicePortName) {
        this.servicePortName = servicePortName;
    }
}

