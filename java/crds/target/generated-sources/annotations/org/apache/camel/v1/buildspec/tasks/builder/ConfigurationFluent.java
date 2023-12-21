package org.apache.camel.v1.buildspec.tasks.builder;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ConfigurationFluent<A extends ConfigurationFluent<A>> extends BaseFluent<A>{
  public ConfigurationFluent() {
  }
  
  public ConfigurationFluent(Configuration instance) {
    this.copyInstance(instance);
  }
  private String limitCPU;
  private String limitMemory;
  private Map<String,String> nodeSelector;
  private String operatorNamespace;
  private Configuration.OrderStrategy orderStrategy;
  private String requestCPU;
  private String requestMemory;
  private Configuration.Strategy strategy;
  private String toolImage;
  
  protected void copyInstance(Configuration instance) {
    instance = (instance != null ? instance : new Configuration());
    if (instance != null) {
          this.withLimitCPU(instance.getLimitCPU());
          this.withLimitMemory(instance.getLimitMemory());
          this.withNodeSelector(instance.getNodeSelector());
          this.withOperatorNamespace(instance.getOperatorNamespace());
          this.withOrderStrategy(instance.getOrderStrategy());
          this.withRequestCPU(instance.getRequestCPU());
          this.withRequestMemory(instance.getRequestMemory());
          this.withStrategy(instance.getStrategy());
          this.withToolImage(instance.getToolImage());
        }
  }
  
  public String getLimitCPU() {
    return this.limitCPU;
  }
  
  public A withLimitCPU(String limitCPU) {
    this.limitCPU = limitCPU;
    return (A) this;
  }
  
  public boolean hasLimitCPU() {
    return this.limitCPU != null;
  }
  
  public String getLimitMemory() {
    return this.limitMemory;
  }
  
  public A withLimitMemory(String limitMemory) {
    this.limitMemory = limitMemory;
    return (A) this;
  }
  
  public boolean hasLimitMemory() {
    return this.limitMemory != null;
  }
  
  public A addToNodeSelector(String key,String value) {
    if(this.nodeSelector == null && key != null && value != null) { this.nodeSelector = new LinkedHashMap(); }
    if(key != null && value != null) {this.nodeSelector.put(key, value);} return (A)this;
  }
  
  public A addToNodeSelector(Map<String,String> map) {
    if(this.nodeSelector == null && map != null) { this.nodeSelector = new LinkedHashMap(); }
    if(map != null) { this.nodeSelector.putAll(map);} return (A)this;
  }
  
  public A removeFromNodeSelector(String key) {
    if(this.nodeSelector == null) { return (A) this; }
    if(key != null && this.nodeSelector != null) {this.nodeSelector.remove(key);} return (A)this;
  }
  
  public A removeFromNodeSelector(Map<String,String> map) {
    if(this.nodeSelector == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.nodeSelector != null){this.nodeSelector.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getNodeSelector() {
    return this.nodeSelector;
  }
  
  public <K,V>A withNodeSelector(Map<String,String> nodeSelector) {
    if (nodeSelector == null) {
      this.nodeSelector = null;
    } else {
      this.nodeSelector = new LinkedHashMap(nodeSelector);
    }
    return (A) this;
  }
  
  public boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }
  
  public String getOperatorNamespace() {
    return this.operatorNamespace;
  }
  
  public A withOperatorNamespace(String operatorNamespace) {
    this.operatorNamespace = operatorNamespace;
    return (A) this;
  }
  
  public boolean hasOperatorNamespace() {
    return this.operatorNamespace != null;
  }
  
  public Configuration.OrderStrategy getOrderStrategy() {
    return this.orderStrategy;
  }
  
  public A withOrderStrategy(Configuration.OrderStrategy orderStrategy) {
    this.orderStrategy = orderStrategy;
    return (A) this;
  }
  
  public boolean hasOrderStrategy() {
    return this.orderStrategy != null;
  }
  
  public String getRequestCPU() {
    return this.requestCPU;
  }
  
  public A withRequestCPU(String requestCPU) {
    this.requestCPU = requestCPU;
    return (A) this;
  }
  
  public boolean hasRequestCPU() {
    return this.requestCPU != null;
  }
  
  public String getRequestMemory() {
    return this.requestMemory;
  }
  
  public A withRequestMemory(String requestMemory) {
    this.requestMemory = requestMemory;
    return (A) this;
  }
  
  public boolean hasRequestMemory() {
    return this.requestMemory != null;
  }
  
  public Configuration.Strategy getStrategy() {
    return this.strategy;
  }
  
  public A withStrategy(Configuration.Strategy strategy) {
    this.strategy = strategy;
    return (A) this;
  }
  
  public boolean hasStrategy() {
    return this.strategy != null;
  }
  
  public String getToolImage() {
    return this.toolImage;
  }
  
  public A withToolImage(String toolImage) {
    this.toolImage = toolImage;
    return (A) this;
  }
  
  public boolean hasToolImage() {
    return this.toolImage != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ConfigurationFluent that = (ConfigurationFluent) o;
    if (!java.util.Objects.equals(limitCPU, that.limitCPU)) return false;
    if (!java.util.Objects.equals(limitMemory, that.limitMemory)) return false;
    if (!java.util.Objects.equals(nodeSelector, that.nodeSelector)) return false;
    if (!java.util.Objects.equals(operatorNamespace, that.operatorNamespace)) return false;
    if (!java.util.Objects.equals(orderStrategy, that.orderStrategy)) return false;
    if (!java.util.Objects.equals(requestCPU, that.requestCPU)) return false;
    if (!java.util.Objects.equals(requestMemory, that.requestMemory)) return false;
    if (!java.util.Objects.equals(strategy, that.strategy)) return false;
    if (!java.util.Objects.equals(toolImage, that.toolImage)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(limitCPU,  limitMemory,  nodeSelector,  operatorNamespace,  orderStrategy,  requestCPU,  requestMemory,  strategy,  toolImage,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (limitCPU != null) { sb.append("limitCPU:"); sb.append(limitCPU + ","); }
    if (limitMemory != null) { sb.append("limitMemory:"); sb.append(limitMemory + ","); }
    if (nodeSelector != null && !nodeSelector.isEmpty()) { sb.append("nodeSelector:"); sb.append(nodeSelector + ","); }
    if (operatorNamespace != null) { sb.append("operatorNamespace:"); sb.append(operatorNamespace + ","); }
    if (orderStrategy != null) { sb.append("orderStrategy:"); sb.append(orderStrategy + ","); }
    if (requestCPU != null) { sb.append("requestCPU:"); sb.append(requestCPU + ","); }
    if (requestMemory != null) { sb.append("requestMemory:"); sb.append(requestMemory + ","); }
    if (strategy != null) { sb.append("strategy:"); sb.append(strategy + ","); }
    if (toolImage != null) { sb.append("toolImage:"); sb.append(toolImage); }
    sb.append("}");
    return sb.toString();
  }
  

}