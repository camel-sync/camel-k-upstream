package org.apache.camel.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"build","cluster","configuration","kamelet","profile","traits"})
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
public class IntegrationPlatformSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * specify how to build the Integration/IntegrationKits
     */
    @com.fasterxml.jackson.annotation.JsonProperty("build")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("specify how to build the Integration/IntegrationKits")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.Build build;

    public org.apache.camel.v1.integrationplatformspec.Build getBuild() {
        return build;
    }

    public void setBuild(org.apache.camel.v1.integrationplatformspec.Build build) {
        this.build = build;
    }

    /**
     * what kind of cluster you're running (ie, plain Kubernetes or OpenShift)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cluster")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("what kind of cluster you're running (ie, plain Kubernetes or OpenShift)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String cluster;

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * Deprecated: Use camel trait (camel.properties) to manage properties Use mount trait (mount.configs) to manage configs Use mount trait (mount.resources) to manage resources Use mount trait (mount.volumes) to manage volumes list of configuration properties to be attached to all the Integration/IntegrationKits built from this IntegrationPlatform
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated: Use camel trait (camel.properties) to manage properties Use mount trait (mount.configs) to manage configs Use mount trait (mount.resources) to manage resources Use mount trait (mount.volumes) to manage volumes list of configuration properties to be attached to all the Integration/IntegrationKits built from this IntegrationPlatform")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.integrationplatformspec.Configuration> configuration;

    public java.util.List<org.apache.camel.v1.integrationplatformspec.Configuration> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(java.util.List<org.apache.camel.v1.integrationplatformspec.Configuration> configuration) {
        this.configuration = configuration;
    }

    /**
     * configuration to be executed to all Kamelets controlled by this IntegrationPlatform
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kamelet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("configuration to be executed to all Kamelets controlled by this IntegrationPlatform")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.Kamelet kamelet;

    public org.apache.camel.v1.integrationplatformspec.Kamelet getKamelet() {
        return kamelet;
    }

    public void setKamelet(org.apache.camel.v1.integrationplatformspec.Kamelet kamelet) {
        this.kamelet = kamelet;
    }

    /**
     * the profile you wish to use. It will apply certain traits which are required by the specific profile chosen. It usually relates the Cluster with the optional definition of special profiles (ie, Knative)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the profile you wish to use. It will apply certain traits which are required by the specific profile chosen. It usually relates the Cluster with the optional definition of special profiles (ie, Knative)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String profile;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * list of traits to be executed for all the Integration/IntegrationKits built from this IntegrationPlatform
     */
    @com.fasterxml.jackson.annotation.JsonProperty("traits")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("list of traits to be executed for all the Integration/IntegrationKits built from this IntegrationPlatform")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformspec.Traits traits;

    public org.apache.camel.v1.integrationplatformspec.Traits getTraits() {
        return traits;
    }

    public void setTraits(org.apache.camel.v1.integrationplatformspec.Traits traits) {
        this.traits = traits;
    }
}

