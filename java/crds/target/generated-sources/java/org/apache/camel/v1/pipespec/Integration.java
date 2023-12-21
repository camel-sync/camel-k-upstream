package org.apache.camel.v1.pipespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configuration","dependencies","flows","integrationKit","profile","replicas","repositories","serviceAccountName","sources","template","traits"})
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
public class Integration implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Deprecated: Use camel trait (camel.properties) to manage properties Use mount trait (mount.configs) to manage configs Use mount trait (mount.resources) to manage resources Use mount trait (mount.volumes) to manage volumes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: Use camel trait (camel.properties) to manage properties Use mount trait (mount.configs) to manage configs Use mount trait (mount.resources) to manage resources Use mount trait (mount.volumes) to manage volumes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.pipespec.integration.Configuration> configuration;

    public java.util.List<org.apache.camel.v1.pipespec.integration.Configuration> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(java.util.List<org.apache.camel.v1.pipespec.integration.Configuration> configuration) {
        this.configuration = configuration;
    }

    /**
     * the list of Camel or Maven dependencies required by the Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the list of Camel or Maven dependencies required by the Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> dependencies;

    public java.util.List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(java.util.List<String> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * a source in YAML DSL language which contain the routes to run
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flows")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("a source in YAML DSL language which contain the routes to run")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.pipespec.integration.Flows> flows;

    public java.util.List<org.apache.camel.v1.pipespec.integration.Flows> getFlows() {
        return flows;
    }

    public void setFlows(java.util.List<org.apache.camel.v1.pipespec.integration.Flows> flows) {
        this.flows = flows;
    }

    /**
     * the reference of the `IntegrationKit` which is used for this Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("integrationKit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the reference of the `IntegrationKit` which is used for this Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.pipespec.integration.IntegrationKit integrationKit;

    public org.apache.camel.v1.pipespec.integration.IntegrationKit getIntegrationKit() {
        return integrationKit;
    }

    public void setIntegrationKit(org.apache.camel.v1.pipespec.integration.IntegrationKit integrationKit) {
        this.integrationKit = integrationKit;
    }

    /**
     * the profile needed to run this Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the profile needed to run this Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String profile;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * the number of `Pods` needed for the running Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the number of `Pods` needed for the running Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * additional Maven repositories to be used
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositories")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("additional Maven repositories to be used")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> repositories;

    public java.util.List<String> getRepositories() {
        return repositories;
    }

    public void setRepositories(java.util.List<String> repositories) {
        this.repositories = repositories;
    }

    /**
     * custom SA to use for the Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("custom SA to use for the Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceAccountName;

    public String getServiceAccountName() {
        return serviceAccountName;
    }

    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    /**
     * the sources which contain the Camel routes to run
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the sources which contain the Camel routes to run")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.pipespec.integration.Sources> sources;

    public java.util.List<org.apache.camel.v1.pipespec.integration.Sources> getSources() {
        return sources;
    }

    public void setSources(java.util.List<org.apache.camel.v1.pipespec.integration.Sources> sources) {
        this.sources = sources;
    }

    /**
     * Pod template customization
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod template customization")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.pipespec.integration.Template template;

    public org.apache.camel.v1.pipespec.integration.Template getTemplate() {
        return template;
    }

    public void setTemplate(org.apache.camel.v1.pipespec.integration.Template template) {
        this.template = template;
    }

    /**
     * the traits needed to run this Integration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("traits")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the traits needed to run this Integration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.pipespec.integration.Traits traits;

    public org.apache.camel.v1.pipespec.integration.Traits getTraits() {
        return traits;
    }

    public void setTraits(org.apache.camel.v1.pipespec.integration.Traits traits) {
        this.traits = traits;
    }
}

