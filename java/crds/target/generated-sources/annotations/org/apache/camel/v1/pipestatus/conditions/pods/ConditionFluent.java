package org.apache.camel.v1.pipestatus.conditions.pods;

import java.time.ZonedDateTime;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ConditionFluent<A extends ConditionFluent<A>> extends BaseFluent<A>{
  public ConditionFluent() {
  }
  
  public ConditionFluent(Condition instance) {
    this.copyInstance(instance);
  }
  private ZonedDateTime lastProbeTime;
  private ZonedDateTime lastTransitionTime;
  private String message;
  private String reason;
  private String status;
  private String type;
  
  protected void copyInstance(Condition instance) {
    instance = (instance != null ? instance : new Condition());
    if (instance != null) {
          this.withLastProbeTime(instance.getLastProbeTime());
          this.withLastTransitionTime(instance.getLastTransitionTime());
          this.withMessage(instance.getMessage());
          this.withReason(instance.getReason());
          this.withStatus(instance.getStatus());
          this.withType(instance.getType());
        }
  }
  
  public ZonedDateTime getLastProbeTime() {
    return this.lastProbeTime;
  }
  
  public A withLastProbeTime(ZonedDateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return (A) this;
  }
  
  public boolean hasLastProbeTime() {
    return this.lastProbeTime != null;
  }
  
  public ZonedDateTime getLastTransitionTime() {
    return this.lastTransitionTime;
  }
  
  public A withLastTransitionTime(ZonedDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return (A) this;
  }
  
  public boolean hasLastTransitionTime() {
    return this.lastTransitionTime != null;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public A withStatus(String status) {
    this.status = status;
    return (A) this;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ConditionFluent that = (ConditionFluent) o;
    if (!java.util.Objects.equals(lastProbeTime, that.lastProbeTime)) return false;
    if (!java.util.Objects.equals(lastTransitionTime, that.lastTransitionTime)) return false;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    if (!java.util.Objects.equals(status, that.status)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(lastProbeTime,  lastTransitionTime,  message,  reason,  status,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (lastProbeTime != null) { sb.append("lastProbeTime:"); sb.append(lastProbeTime + ","); }
    if (lastTransitionTime != null) { sb.append("lastTransitionTime:"); sb.append(lastTransitionTime + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (status != null) { sb.append("status:"); sb.append(status + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  

}