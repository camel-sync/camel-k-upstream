package org.apache.camel.v1.buildspec.tasks.jib;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"limitCPU","limitMemory","nodeSelector","operatorNamespace","orderStrategy","requestCPU","requestMemory","strategy","toolImage"})
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
public class Configuration implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The maximum amount of CPU required. Only used for `pod` strategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limitCPU")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum amount of CPU required. Only used for `pod` strategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String limitCPU;

    public String getLimitCPU() {
        return limitCPU;
    }

    public void setLimitCPU(String limitCPU) {
        this.limitCPU = limitCPU;
    }

    /**
     * The maximum amount of memory required. Only used for `pod` strategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limitMemory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum amount of memory required. Only used for `pod` strategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String limitMemory;

    public String getLimitMemory() {
        return limitMemory;
    }

    public void setLimitMemory(String limitMemory) {
        this.limitMemory = limitMemory;
    }

    /**
     * The node selector for the builder pod. Only used for `pod` strategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The node selector for the builder pod. Only used for `pod` strategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> nodeSelector;

    public java.util.Map<java.lang.String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(java.util.Map<java.lang.String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    /**
     * The namespace where to run the builder Pod (must be the same of the operator in charge of this Build reconciliation).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operatorNamespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The namespace where to run the builder Pod (must be the same of the operator in charge of this Build reconciliation).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String operatorNamespace;

    public String getOperatorNamespace() {
        return operatorNamespace;
    }

    public void setOperatorNamespace(String operatorNamespace) {
        this.operatorNamespace = operatorNamespace;
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
     * the build order strategy to adopt
     */
    @com.fasterxml.jackson.annotation.JsonProperty("orderStrategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the build order strategy to adopt")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private OrderStrategy orderStrategy;

    public OrderStrategy getOrderStrategy() {
        return orderStrategy;
    }

    public void setOrderStrategy(OrderStrategy orderStrategy) {
        this.orderStrategy = orderStrategy;
    }

    /**
     * The minimum amount of CPU required. Only used for `pod` strategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestCPU")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimum amount of CPU required. Only used for `pod` strategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String requestCPU;

    public String getRequestCPU() {
        return requestCPU;
    }

    public void setRequestCPU(String requestCPU) {
        this.requestCPU = requestCPU;
    }

    /**
     * The minimum amount of memory required. Only used for `pod` strategy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestMemory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The minimum amount of memory required. Only used for `pod` strategy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String requestMemory;

    public String getRequestMemory() {
        return requestMemory;
    }

    public void setRequestMemory(String requestMemory) {
        this.requestMemory = requestMemory;
    }

    public enum Strategy {

        @com.fasterxml.jackson.annotation.JsonProperty("routine")
        ROUTINE("routine"), @com.fasterxml.jackson.annotation.JsonProperty("pod")
        POD("pod");

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
     * the strategy to adopt
     */
    @com.fasterxml.jackson.annotation.JsonProperty("strategy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("the strategy to adopt")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * The container image to be used to run the build.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toolImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The container image to be used to run the build.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String toolImage;

    public String getToolImage() {
        return toolImage;
    }

    public void setToolImage(String toolImage) {
        this.toolImage = toolImage;
    }
}

