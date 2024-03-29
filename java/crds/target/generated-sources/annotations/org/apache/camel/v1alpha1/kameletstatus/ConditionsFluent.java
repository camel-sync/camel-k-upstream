package org.apache.camel.v1alpha1.kameletstatus;

import java.time.ZonedDateTime;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ConditionsFluent<A extends ConditionsFluent<A>> extends BaseFluent<A>{
  public ConditionsFluent() {
  }
  
  public ConditionsFluent(Conditions instance) {
    this.copyInstance(instance);
  }
  private ZonedDateTime lastTransitionTime;
  private ZonedDateTime lastUpdateTime;
  private String message;
  private String reason;
  private String status;
  private String type;
  
  protected void copyInstance(Conditions instance) {
    instance = (instance != null ? instance : new Conditions());
    if (instance != null) {
          this.withLastTransitionTime(instance.getLastTransitionTime());
          this.withLastUpdateTime(instance.getLastUpdateTime());
          this.withMessage(instance.getMessage());
          this.withReason(instance.getReason());
          this.withStatus(instance.getStatus());
          this.withType(instance.getType());
        }
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
  
  public ZonedDateTime getLastUpdateTime() {
    return this.lastUpdateTime;
  }
  
  public A withLastUpdateTime(ZonedDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return (A) this;
  }
  
  public boolean hasLastUpdateTime() {
    return this.lastUpdateTime != null;
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
    ConditionsFluent that = (ConditionsFluent) o;
    if (!java.util.Objects.equals(lastTransitionTime, that.lastTransitionTime)) return false;
    if (!java.util.Objects.equals(lastUpdateTime, that.lastUpdateTime)) return false;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    if (!java.util.Objects.equals(status, that.status)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(lastTransitionTime,  lastUpdateTime,  message,  reason,  status,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (lastTransitionTime != null) { sb.append("lastTransitionTime:"); sb.append(lastTransitionTime + ","); }
    if (lastUpdateTime != null) { sb.append("lastUpdateTime:"); sb.append(lastUpdateTime + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (status != null) { sb.append("status:"); sb.append(status + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  

}