package org.apache.camel.v1alpha1.kameletspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"compression","content","contentKey","contentRef","contentType","from-kamelet","interceptors","language","loader","name","path","property-names","rawContent","type"})
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
public class Sources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * if the content is compressed (base64 encrypted)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compression")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("if the content is compressed (base64 encrypted)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean compression;

    public Boolean getCompression() {
        return compression;
    }

    public void setCompression(Boolean compression) {
        this.compression = compression;
    }

    /**
     * the source code (plain text)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the source code (plain text)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * the confimap key holding the source content
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentKey")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the confimap key holding the source content")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String contentKey;

    public String getContentKey() {
        return contentKey;
    }

    public void setContentKey(String contentKey) {
        this.contentKey = contentKey;
    }

    /**
     * the confimap reference holding the source content
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the confimap reference holding the source content")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String contentRef;

    public String getContentRef() {
        return contentRef;
    }

    public void setContentRef(String contentRef) {
        this.contentRef = contentRef;
    }

    /**
     * the content type (tipically text or binary)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the content type (tipically text or binary)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String contentType;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * True if the spec is generated from a Kamelet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("from-kamelet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("True if the spec is generated from a Kamelet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean fromKamelet;

    public Boolean getFromKamelet() {
        return fromKamelet;
    }

    public void setFromKamelet(Boolean fromKamelet) {
        this.fromKamelet = fromKamelet;
    }

    /**
     * Interceptors are optional identifiers the org.apache.camel.k.RoutesLoader uses to pre/post process sources
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interceptors")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Interceptors are optional identifiers the org.apache.camel.k.RoutesLoader uses to pre/post process sources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> interceptors;

    public java.util.List<String> getInterceptors() {
        return interceptors;
    }

    public void setInterceptors(java.util.List<String> interceptors) {
        this.interceptors = interceptors;
    }

    /**
     * specify which is the language (Camel DSL) used to interpret this source code
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("specify which is the language (Camel DSL) used to interpret this source code")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Loader is an optional id of the org.apache.camel.k.RoutesLoader that will interpret this source at runtime
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loader")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Loader is an optional id of the org.apache.camel.k.RoutesLoader that will interpret this source at runtime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String loader;

    public String getLoader() {
        return loader;
    }

    public void setLoader(String loader) {
        this.loader = loader;
    }

    /**
     * the name of the specification
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the name of the specification")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * the path where the file is stored
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the path where the file is stored")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * List of property names defined in the source (e.g. if type is "template")
     */
    @com.fasterxml.jackson.annotation.JsonProperty("property-names")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of property names defined in the source (e.g. if type is \"template\")")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> propertyNames;

    public java.util.List<String> getPropertyNames() {
        return propertyNames;
    }

    public void setPropertyNames(java.util.List<String> propertyNames) {
        this.propertyNames = propertyNames;
    }

    /**
     * the source code (binary)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rawContent")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the source code (binary)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String rawContent;

    public String getRawContent() {
        return rawContent;
    }

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * Type defines the kind of source described by this object
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Type defines the kind of source described by this object")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

