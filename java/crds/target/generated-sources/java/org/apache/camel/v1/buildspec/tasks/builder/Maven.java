package org.apache.camel.v1.buildspec.tasks.builder;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"caSecrets","cliOptions","extension","localRepository","profiles","properties","repositories","servers","settings","settingsSecurity"})
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
public class Maven implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The Secrets name and key, containing the CA certificate(s) used to connect to remote Maven repositories. It can contain X.509 certificates, and PKCS#7 formatted certificate chains. A JKS formatted keystore is automatically created to store the CA certificate(s), and configured to be used as a trusted certificate(s) by the Maven commands. Note that the root CA certificates are also imported into the created keystore.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caSecrets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Secrets name and key, containing the CA certificate(s) used to connect to remote Maven repositories. It can contain X.509 certificates, and PKCS#7 formatted certificate chains. A JKS formatted keystore is automatically created to store the CA certificate(s), and configured to be used as a trusted certificate(s) by the Maven commands. Note that the root CA certificates are also imported into the created keystore.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.CaSecrets> caSecrets;

    public java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.CaSecrets> getCaSecrets() {
        return caSecrets;
    }

    public void setCaSecrets(java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.CaSecrets> caSecrets) {
        this.caSecrets = caSecrets;
    }

    /**
     * The CLI options that are appended to the list of arguments for Maven commands, e.g., `-V,--no-transfer-progress,-Dstyle.color=never`. See https://maven.apache.org/ref/3.8.4/maven-embedder/cli.html.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cliOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The CLI options that are appended to the list of arguments for Maven commands, e.g., `-V,--no-transfer-progress,-Dstyle.color=never`. See https://maven.apache.org/ref/3.8.4/maven-embedder/cli.html.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> cliOptions;

    public java.util.List<String> getCliOptions() {
        return cliOptions;
    }

    public void setCliOptions(java.util.List<String> cliOptions) {
        this.cliOptions = cliOptions;
    }

    /**
     * The Maven build extensions. See https://maven.apache.org/guides/mini/guide-using-extensions.html.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Maven build extensions. See https://maven.apache.org/guides/mini/guide-using-extensions.html.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Extension> extension;

    public java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Extension> getExtension() {
        return extension;
    }

    public void setExtension(java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Extension> extension) {
        this.extension = extension;
    }

    /**
     * The path of the local Maven repository.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localRepository")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The path of the local Maven repository.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String localRepository;

    public String getLocalRepository() {
        return localRepository;
    }

    public void setLocalRepository(String localRepository) {
        this.localRepository = localRepository;
    }

    /**
     * A reference to the ConfigMap or Secret key that contains the Maven profile.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profiles")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A reference to the ConfigMap or Secret key that contains the Maven profile.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Profiles> profiles;

    public java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Profiles> getProfiles() {
        return profiles;
    }

    public void setProfiles(java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Profiles> profiles) {
        this.profiles = profiles;
    }

    /**
     * The Maven properties.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Maven properties.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> properties;

    public java.util.Map<java.lang.String, String> getProperties() {
        return properties;
    }

    public void setProperties(java.util.Map<java.lang.String, String> properties) {
        this.properties = properties;
    }

    /**
     * additional repositories
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositories")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("additional repositories")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Repositories> repositories;

    public java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Repositories> getRepositories() {
        return repositories;
    }

    public void setRepositories(java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Repositories> repositories) {
        this.repositories = repositories;
    }

    /**
     * Servers (auth)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Servers (auth)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Servers> servers;

    public java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Servers> getServers() {
        return servers;
    }

    public void setServers(java.util.List<org.apache.camel.v1.buildspec.tasks.builder.maven.Servers> servers) {
        this.servers = servers;
    }

    /**
     * A reference to the ConfigMap or Secret key that contains the Maven settings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("settings")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A reference to the ConfigMap or Secret key that contains the Maven settings.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.builder.maven.Settings settings;

    public org.apache.camel.v1.buildspec.tasks.builder.maven.Settings getSettings() {
        return settings;
    }

    public void setSettings(org.apache.camel.v1.buildspec.tasks.builder.maven.Settings settings) {
        this.settings = settings;
    }

    /**
     * A reference to the ConfigMap or Secret key that contains the security of the Maven settings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("settingsSecurity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A reference to the ConfigMap or Secret key that contains the security of the Maven settings.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.buildspec.tasks.builder.maven.SettingsSecurity settingsSecurity;

    public org.apache.camel.v1.buildspec.tasks.builder.maven.SettingsSecurity getSettingsSecurity() {
        return settingsSecurity;
    }

    public void setSettingsSecurity(org.apache.camel.v1.buildspec.tasks.builder.maven.SettingsSecurity settingsSecurity) {
        this.settingsSecurity = settingsSecurity;
    }
}

