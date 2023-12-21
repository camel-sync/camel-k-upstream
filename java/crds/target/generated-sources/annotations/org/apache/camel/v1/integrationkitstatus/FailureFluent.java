package org.apache.camel.v1.integrationkitstatus;

import org.apache.camel.v1.integrationkitstatus.failure.RecoveryBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.integrationkitstatus.failure.Recovery;
import java.time.ZonedDateTime;
import org.apache.camel.v1.integrationkitstatus.failure.RecoveryFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class FailureFluent<A extends FailureFluent<A>> extends BaseFluent<A>{
  public FailureFluent() {
  }
  
  public FailureFluent(Failure instance) {
    this.copyInstance(instance);
  }
  private String reason;
  private RecoveryBuilder recovery;
  private ZonedDateTime time;
  
  protected void copyInstance(Failure instance) {
    instance = (instance != null ? instance : new Failure());
    if (instance != null) {
          this.withReason(instance.getReason());
          this.withRecovery(instance.getRecovery());
          this.withTime(instance.getTime());
        }
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
  
  public Recovery buildRecovery() {
    return this.recovery != null ? this.recovery.build() : null;
  }
  
  public A withRecovery(Recovery recovery) {
    this._visitables.remove("recovery");
    if (recovery != null) {
        this.recovery = new RecoveryBuilder(recovery);
        this._visitables.get("recovery").add(this.recovery);
    } else {
        this.recovery = null;
        this._visitables.get("recovery").remove(this.recovery);
    }
    return (A) this;
  }
  
  public boolean hasRecovery() {
    return this.recovery != null;
  }
  
  public RecoveryNested<A> withNewRecovery() {
    return new RecoveryNested(null);
  }
  
  public RecoveryNested<A> withNewRecoveryLike(Recovery item) {
    return new RecoveryNested(item);
  }
  
  public RecoveryNested<A> editIntegrationkitstatusRecovery() {
    return withNewRecoveryLike(java.util.Optional.ofNullable(buildRecovery()).orElse(null));
  }
  
  public RecoveryNested<A> editOrNewRecovery() {
    return withNewRecoveryLike(java.util.Optional.ofNullable(buildRecovery()).orElse(new RecoveryBuilder().build()));
  }
  
  public RecoveryNested<A> editOrNewRecoveryLike(Recovery item) {
    return withNewRecoveryLike(java.util.Optional.ofNullable(buildRecovery()).orElse(item));
  }
  
  public ZonedDateTime getTime() {
    return this.time;
  }
  
  public A withTime(ZonedDateTime time) {
    this.time = time;
    return (A) this;
  }
  
  public boolean hasTime() {
    return this.time != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    FailureFluent that = (FailureFluent) o;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    if (!java.util.Objects.equals(recovery, that.recovery)) return false;
    if (!java.util.Objects.equals(time, that.time)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(reason,  recovery,  time,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (recovery != null) { sb.append("recovery:"); sb.append(recovery + ","); }
    if (time != null) { sb.append("time:"); sb.append(time); }
    sb.append("}");
    return sb.toString();
  }
  public class RecoveryNested<N> extends RecoveryFluent<RecoveryNested<N>> implements Nested<N>{
    RecoveryNested(Recovery item) {
      this.builder = new RecoveryBuilder(this, item);
    }
    RecoveryBuilder builder;
    
    public N and() {
      return (N) FailureFluent.this.withRecovery(builder.build());
    }
    
    public N endIntegrationkitstatusRecovery() {
      return and();
    }
    
  
  }

}