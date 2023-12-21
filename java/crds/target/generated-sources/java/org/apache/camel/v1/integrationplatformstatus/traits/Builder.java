package org.apache.camel.v1.integrationplatformstatus.traits;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"baseImage","configuration","enabled","incrementalImageBuild","limitCPU","limitMemory","mavenProfiles","nodeSelector","orderStrategy","properties","requestCPU","requestMemory","strategy","tasks","tasksLimitCPU","tasksLimitMemory","tasksRequestCPU","tasksRequestMemory","verbose"})
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
public class Builder implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Specify a base image
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specify a base image")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String baseImage;

    public String getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    /**
     * Legacy trait configuration parameters. Deprecated: for backward compatibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Legacy trait configuration parameters. Deprecated: for backward compatibility.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private org.apache.camel.v1.integrationplatformstatus.traits.builder.Configuration configuration;

    public org.apache.camel.v1.integrationplatformstatus.traits.builder.Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(org.apache.camel.v1.integrationplatformstatus.traits.builder.Configuration configuration) {
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
     * Use the incremental image build option, to reuse existing containers (default `true`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("incrementalImageBuild")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use the incremental image build option, to reuse existing containers (default `true`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean incrementalImageBuild = true;

    public Boolean getIncrementalImageBuild() {
        return incrementalImageBuild;
    }

    public void setIncrementalImageBuild(Boolean incrementalImageBuild) {
        this.incrementalImageBuild = incrementalImageBuild;
    }

    /**
     * When using `pod` strategy, the maximum amount of CPU required by the pod builder. Deprecated: use TasksRequestCPU instead with task name `builder`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limitCPU")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When using `pod` strategy, the maximum amount of CPU required by the pod builder. Deprecated: use TasksRequestCPU instead with task name `builder`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String limitCPU;

    public String getLimitCPU() {
        return limitCPU;
    }

    public void setLimitCPU(String limitCPU) {
        this.limitCPU = limitCPU;
    }

    /**
     * When using `pod` strategy, the maximum amount of memory required by the pod builder. Deprecated: use TasksRequestCPU instead with task name `builder`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limitMemory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When using `pod` strategy, the maximum amount of memory required by the pod builder. Deprecated: use TasksRequestCPU instead with task name `builder`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String limitMemory;

    public String getLimitMemory() {
        return limitMemory;
    }

    public void setLimitMemory(String limitMemory) {
        this.limitMemory = limitMemory;
    }

    /**
     * A list of references pointing to configmaps/secrets that contains a maven profile. The content of the maven profile is expected to be a text containing a valid maven profile starting with `<profile>` and ending with `</profile>` that will be integrated as an inline profile in the POM. Syntax: [configmap|secret]:name[/key], where name represents the resource name, key optionally represents the resource key to be filtered (default key value = profile.xml).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mavenProfiles")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of references pointing to configmaps/secrets that contains a maven profile. The content of the maven profile is expected to be a text containing a valid maven profile starting with `<profile>` and ending with `</profile>` that will be integrated as an inline profile in the POM. Syntax: [configmap|secret]:name[/key], where name represents the resource name, key optionally represents the resource key to be filtered (default key value = profile.xml).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> mavenProfiles;

    public java.util.List<String> getMavenProfiles() {
        return mavenProfiles;
    }

    public void setMavenProfiles(java.util.List<String> mavenProfiles) {
        this.mavenProfiles = mavenProfiles;
    }

    /**
     * Defines a set of nodes the builder pod is eligible to be scheduled on, based on labels on the node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defines a set of nodes the builder pod is eligible to be scheduled on, based on labels on the node.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> nodeSelector;

    public java.util.Map<java.lang.String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(java.util.Map<java.lang.String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public enum OrderStrategy {

        @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
        DEPENDENCIES("dependencies"), @com.fasterxml.jackson.annotation.JsonProperty("fifo")
        FIFO("fifo"), @com.fasterxml.jackson.annotation.JsonProperty("sequential")
        SEQUENTIAL("sequential");

        java.lang.String value;

        OrderStrategy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The build order strategy to use, either `dependencies`, `fifo` or `sequential` (default `sequential`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("orderStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The build order strategy to use, either `dependencies`, `fifo` or `sequential` (default `sequential`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private OrderStrategy orderStrategy = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"sequential\"", OrderStrategy.class);

    public OrderStrategy getOrderStrategy() {
        return orderStrategy;
    }

    public void setOrderStrategy(OrderStrategy orderStrategy) {
        this.orderStrategy = orderStrategy;
    }

    /**
     * A list of properties to be provided to the build task
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of properties to be provided to the build task")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> properties;

    public java.util.List<String> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<String> properties) {
        this.properties = properties;
    }

    /**
     * When using `pod` strategy, the minimum amount of CPU required by the pod builder. Deprecated: use TasksRequestCPU instead with task name `builder`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestCPU")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When using `pod` strategy, the minimum amount of CPU required by the pod builder. Deprecated: use TasksRequestCPU instead with task name `builder`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String requestCPU;

    public String getRequestCPU() {
        return requestCPU;
    }

    public void setRequestCPU(String requestCPU) {
        this.requestCPU = requestCPU;
    }

    /**
     * When using `pod` strategy, the minimum amount of memory required by the pod builder. Deprecated: use TasksRequestCPU instead with task name `builder`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestMemory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When using `pod` strategy, the minimum amount of memory required by the pod builder. Deprecated: use TasksRequestCPU instead with task name `builder`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String requestMemory;

    public String getRequestMemory() {
        return requestMemory;
    }

    public void setRequestMemory(String requestMemory) {
        this.requestMemory = requestMemory;
    }

    public enum Strategy {

        @com.fasterxml.jackson.annotation.JsonProperty("pod")
        POD("pod"), @com.fasterxml.jackson.annotation.JsonProperty("routine")
        ROUTINE("routine");

        java.lang.String value;

        Strategy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * The strategy to use, either `pod` or `routine` (default `routine`)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("strategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The strategy to use, either `pod` or `routine` (default `routine`)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Strategy strategy = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"routine\"", Strategy.class);

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * A list of tasks to be executed (available only when using `pod` strategy) with format `<name>;<container-image>;<container-command>`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tasks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of tasks to be executed (available only when using `pod` strategy) with format `<name>;<container-image>;<container-command>`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> tasks;

    public java.util.List<String> getTasks() {
        return tasks;
    }

    public void setTasks(java.util.List<String> tasks) {
        this.tasks = tasks;
    }

    /**
     * A list of limit cpu configuration for the specific task with format `<task-name>:<limit-cpu-conf>`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tasksLimitCPU")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of limit cpu configuration for the specific task with format `<task-name>:<limit-cpu-conf>`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> tasksLimitCPU;

    public java.util.List<String> getTasksLimitCPU() {
        return tasksLimitCPU;
    }

    public void setTasksLimitCPU(java.util.List<String> tasksLimitCPU) {
        this.tasksLimitCPU = tasksLimitCPU;
    }

    /**
     * A list of limit memory configuration for the specific task with format `<task-name>:<limit-memory-conf>`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tasksLimitMemory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of limit memory configuration for the specific task with format `<task-name>:<limit-memory-conf>`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> tasksLimitMemory;

    public java.util.List<String> getTasksLimitMemory() {
        return tasksLimitMemory;
    }

    public void setTasksLimitMemory(java.util.List<String> tasksLimitMemory) {
        this.tasksLimitMemory = tasksLimitMemory;
    }

    /**
     * A list of request cpu configuration for the specific task with format `<task-name>:<request-cpu-conf>`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tasksRequestCPU")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of request cpu configuration for the specific task with format `<task-name>:<request-cpu-conf>`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> tasksRequestCPU;

    public java.util.List<String> getTasksRequestCPU() {
        return tasksRequestCPU;
    }

    public void setTasksRequestCPU(java.util.List<String> tasksRequestCPU) {
        this.tasksRequestCPU = tasksRequestCPU;
    }

    /**
     * A list of request memory configuration for the specific task with format `<task-name>:<request-memory-conf>`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tasksRequestMemory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of request memory configuration for the specific task with format `<task-name>:<request-memory-conf>`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> tasksRequestMemory;

    public java.util.List<String> getTasksRequestMemory() {
        return tasksRequestMemory;
    }

    public void setTasksRequestMemory(java.util.List<String> tasksRequestMemory) {
        this.tasksRequestMemory = tasksRequestMemory;
    }

    /**
     * Enable verbose logging on build components that support it (e.g. Kaniko build pod).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verbose")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enable verbose logging on build components that support it (e.g. Kaniko build pod).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean verbose;

    public Boolean getVerbose() {
        return verbose;
    }

    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }
}

