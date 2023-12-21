package org.apache.camel.v1.buildstatus.failure;

import java.time.ZonedDateTime;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class RecoveryFluent<A extends RecoveryFluent<A>> extends BaseFluent<A>{
  public RecoveryFluent() {
  }
  
  public RecoveryFluent(Recovery instance) {
    this.copyInstance(instance);
  }
  private Long attempt;
  private Long attemptMax;
  private ZonedDateTime attemptTime;
  
  protected void copyInstance(Recovery instance) {
    instance = (instance != null ? instance : new Recovery());
    if (instance != null) {
          this.withAttempt(instance.getAttempt());
          this.withAttemptMax(instance.getAttemptMax());
          this.withAttemptTime(instance.getAttemptTime());
        }
  }
  
  public Long getAttempt() {
    return this.attempt;
  }
  
  public A withAttempt(Long attempt) {
    this.attempt = attempt;
    return (A) this;
  }
  
  public boolean hasAttempt() {
    return this.attempt != null;
  }
  
  public Long getAttemptMax() {
    return this.attemptMax;
  }
  
  public A withAttemptMax(Long attemptMax) {
    this.attemptMax = attemptMax;
    return (A) this;
  }
  
  public boolean hasAttemptMax() {
    return this.attemptMax != null;
  }
  
  public ZonedDateTime getAttemptTime() {
    return this.attemptTime;
  }
  
  public A withAttemptTime(ZonedDateTime attemptTime) {
    this.attemptTime = attemptTime;
    return (A) this;
  }
  
  public boolean hasAttemptTime() {
    return this.attemptTime != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    RecoveryFluent that = (RecoveryFluent) o;
    if (!java.util.Objects.equals(attempt, that.attempt)) return false;
    if (!java.util.Objects.equals(attemptMax, that.attemptMax)) return false;
    if (!java.util.Objects.equals(attemptTime, that.attemptTime)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(attempt,  attemptMax,  attemptTime,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (attempt != null) { sb.append("attempt:"); sb.append(attempt + ","); }
    if (attemptMax != null) { sb.append("attemptMax:"); sb.append(attemptMax + ","); }
    if (attemptTime != null) { sb.append("attemptTime:"); sb.append(attemptTime); }
    sb.append("}");
    return sb.toString();
  }
  

}