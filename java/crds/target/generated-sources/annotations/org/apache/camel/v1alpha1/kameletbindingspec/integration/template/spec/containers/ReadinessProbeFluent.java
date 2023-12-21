package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.HttpGetBuilder;
import java.lang.SuppressWarnings;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.HttpGet;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.ExecBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.TcpSocketBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.TcpSocketFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.Exec;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.HttpGetFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.Grpc;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.GrpcBuilder;
import java.lang.Integer;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.ExecFluent;
import java.lang.Long;
import java.lang.Object;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.GrpcFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.containers.readinessprobe.TcpSocket;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ReadinessProbeFluent<A extends ReadinessProbeFluent<A>> extends BaseFluent<A>{
  public ReadinessProbeFluent() {
  }
  
  public ReadinessProbeFluent(ReadinessProbe instance) {
    this.copyInstance(instance);
  }
  private ExecBuilder exec;
  private Integer failureThreshold;
  private GrpcBuilder grpc;
  private HttpGetBuilder httpGet;
  private Integer initialDelaySeconds;
  private Integer periodSeconds;
  private Integer successThreshold;
  private TcpSocketBuilder tcpSocket;
  private Long terminationGracePeriodSeconds;
  private Integer timeoutSeconds;
  
  protected void copyInstance(ReadinessProbe instance) {
    instance = (instance != null ? instance : new ReadinessProbe());
    if (instance != null) {
          this.withExec(instance.getExec());
          this.withFailureThreshold(instance.getFailureThreshold());
          this.withGrpc(instance.getGrpc());
          this.withHttpGet(instance.getHttpGet());
          this.withInitialDelaySeconds(instance.getInitialDelaySeconds());
          this.withPeriodSeconds(instance.getPeriodSeconds());
          this.withSuccessThreshold(instance.getSuccessThreshold());
          this.withTcpSocket(instance.getTcpSocket());
          this.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds());
          this.withTimeoutSeconds(instance.getTimeoutSeconds());
        }
  }
  
  public Exec buildExec() {
    return this.exec != null ? this.exec.build() : null;
  }
  
  public A withExec(Exec exec) {
    this._visitables.remove("exec");
    if (exec != null) {
        this.exec = new ExecBuilder(exec);
        this._visitables.get("exec").add(this.exec);
    } else {
        this.exec = null;
        this._visitables.get("exec").remove(this.exec);
    }
    return (A) this;
  }
  
  public boolean hasExec() {
    return this.exec != null;
  }
  
  public ExecNested<A> withNewExec() {
    return new ExecNested(null);
  }
  
  public ExecNested<A> withNewExecLike(Exec item) {
    return new ExecNested(item);
  }
  
  public ExecNested<A> editReadinessprobeExec() {
    return withNewExecLike(java.util.Optional.ofNullable(buildExec()).orElse(null));
  }
  
  public ExecNested<A> editOrNewExec() {
    return withNewExecLike(java.util.Optional.ofNullable(buildExec()).orElse(new ExecBuilder().build()));
  }
  
  public ExecNested<A> editOrNewExecLike(Exec item) {
    return withNewExecLike(java.util.Optional.ofNullable(buildExec()).orElse(item));
  }
  
  public Integer getFailureThreshold() {
    return this.failureThreshold;
  }
  
  public A withFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
    return (A) this;
  }
  
  public boolean hasFailureThreshold() {
    return this.failureThreshold != null;
  }
  
  public Grpc buildGrpc() {
    return this.grpc != null ? this.grpc.build() : null;
  }
  
  public A withGrpc(Grpc grpc) {
    this._visitables.remove("grpc");
    if (grpc != null) {
        this.grpc = new GrpcBuilder(grpc);
        this._visitables.get("grpc").add(this.grpc);
    } else {
        this.grpc = null;
        this._visitables.get("grpc").remove(this.grpc);
    }
    return (A) this;
  }
  
  public boolean hasGrpc() {
    return this.grpc != null;
  }
  
  public GrpcNested<A> withNewGrpc() {
    return new GrpcNested(null);
  }
  
  public GrpcNested<A> withNewGrpcLike(Grpc item) {
    return new GrpcNested(item);
  }
  
  public GrpcNested<A> editReadinessprobeGrpc() {
    return withNewGrpcLike(java.util.Optional.ofNullable(buildGrpc()).orElse(null));
  }
  
  public GrpcNested<A> editOrNewGrpc() {
    return withNewGrpcLike(java.util.Optional.ofNullable(buildGrpc()).orElse(new GrpcBuilder().build()));
  }
  
  public GrpcNested<A> editOrNewGrpcLike(Grpc item) {
    return withNewGrpcLike(java.util.Optional.ofNullable(buildGrpc()).orElse(item));
  }
  
  public HttpGet buildHttpGet() {
    return this.httpGet != null ? this.httpGet.build() : null;
  }
  
  public A withHttpGet(HttpGet httpGet) {
    this._visitables.remove("httpGet");
    if (httpGet != null) {
        this.httpGet = new HttpGetBuilder(httpGet);
        this._visitables.get("httpGet").add(this.httpGet);
    } else {
        this.httpGet = null;
        this._visitables.get("httpGet").remove(this.httpGet);
    }
    return (A) this;
  }
  
  public boolean hasHttpGet() {
    return this.httpGet != null;
  }
  
  public HttpGetNested<A> withNewHttpGet() {
    return new HttpGetNested(null);
  }
  
  public HttpGetNested<A> withNewHttpGetLike(HttpGet item) {
    return new HttpGetNested(item);
  }
  
  public HttpGetNested<A> editReadinessprobeHttpGet() {
    return withNewHttpGetLike(java.util.Optional.ofNullable(buildHttpGet()).orElse(null));
  }
  
  public HttpGetNested<A> editOrNewHttpGet() {
    return withNewHttpGetLike(java.util.Optional.ofNullable(buildHttpGet()).orElse(new HttpGetBuilder().build()));
  }
  
  public HttpGetNested<A> editOrNewHttpGetLike(HttpGet item) {
    return withNewHttpGetLike(java.util.Optional.ofNullable(buildHttpGet()).orElse(item));
  }
  
  public Integer getInitialDelaySeconds() {
    return this.initialDelaySeconds;
  }
  
  public A withInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return (A) this;
  }
  
  public boolean hasInitialDelaySeconds() {
    return this.initialDelaySeconds != null;
  }
  
  public Integer getPeriodSeconds() {
    return this.periodSeconds;
  }
  
  public A withPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return (A) this;
  }
  
  public boolean hasPeriodSeconds() {
    return this.periodSeconds != null;
  }
  
  public Integer getSuccessThreshold() {
    return this.successThreshold;
  }
  
  public A withSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
    return (A) this;
  }
  
  public boolean hasSuccessThreshold() {
    return this.successThreshold != null;
  }
  
  public TcpSocket buildTcpSocket() {
    return this.tcpSocket != null ? this.tcpSocket.build() : null;
  }
  
  public A withTcpSocket(TcpSocket tcpSocket) {
    this._visitables.remove("tcpSocket");
    if (tcpSocket != null) {
        this.tcpSocket = new TcpSocketBuilder(tcpSocket);
        this._visitables.get("tcpSocket").add(this.tcpSocket);
    } else {
        this.tcpSocket = null;
        this._visitables.get("tcpSocket").remove(this.tcpSocket);
    }
    return (A) this;
  }
  
  public boolean hasTcpSocket() {
    return this.tcpSocket != null;
  }
  
  public TcpSocketNested<A> withNewTcpSocket() {
    return new TcpSocketNested(null);
  }
  
  public TcpSocketNested<A> withNewTcpSocketLike(TcpSocket item) {
    return new TcpSocketNested(item);
  }
  
  public TcpSocketNested<A> editReadinessprobeTcpSocket() {
    return withNewTcpSocketLike(java.util.Optional.ofNullable(buildTcpSocket()).orElse(null));
  }
  
  public TcpSocketNested<A> editOrNewTcpSocket() {
    return withNewTcpSocketLike(java.util.Optional.ofNullable(buildTcpSocket()).orElse(new TcpSocketBuilder().build()));
  }
  
  public TcpSocketNested<A> editOrNewTcpSocketLike(TcpSocket item) {
    return withNewTcpSocketLike(java.util.Optional.ofNullable(buildTcpSocket()).orElse(item));
  }
  
  public Long getTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds;
  }
  
  public A withTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return (A) this;
  }
  
  public boolean hasTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds != null;
  }
  
  public Integer getTimeoutSeconds() {
    return this.timeoutSeconds;
  }
  
  public A withTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return (A) this;
  }
  
  public boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ReadinessProbeFluent that = (ReadinessProbeFluent) o;
    if (!java.util.Objects.equals(exec, that.exec)) return false;
    if (!java.util.Objects.equals(failureThreshold, that.failureThreshold)) return false;
    if (!java.util.Objects.equals(grpc, that.grpc)) return false;
    if (!java.util.Objects.equals(httpGet, that.httpGet)) return false;
    if (!java.util.Objects.equals(initialDelaySeconds, that.initialDelaySeconds)) return false;
    if (!java.util.Objects.equals(periodSeconds, that.periodSeconds)) return false;
    if (!java.util.Objects.equals(successThreshold, that.successThreshold)) return false;
    if (!java.util.Objects.equals(tcpSocket, that.tcpSocket)) return false;
    if (!java.util.Objects.equals(terminationGracePeriodSeconds, that.terminationGracePeriodSeconds)) return false;
    if (!java.util.Objects.equals(timeoutSeconds, that.timeoutSeconds)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(exec,  failureThreshold,  grpc,  httpGet,  initialDelaySeconds,  periodSeconds,  successThreshold,  tcpSocket,  terminationGracePeriodSeconds,  timeoutSeconds,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (exec != null) { sb.append("exec:"); sb.append(exec + ","); }
    if (failureThreshold != null) { sb.append("failureThreshold:"); sb.append(failureThreshold + ","); }
    if (grpc != null) { sb.append("grpc:"); sb.append(grpc + ","); }
    if (httpGet != null) { sb.append("httpGet:"); sb.append(httpGet + ","); }
    if (initialDelaySeconds != null) { sb.append("initialDelaySeconds:"); sb.append(initialDelaySeconds + ","); }
    if (periodSeconds != null) { sb.append("periodSeconds:"); sb.append(periodSeconds + ","); }
    if (successThreshold != null) { sb.append("successThreshold:"); sb.append(successThreshold + ","); }
    if (tcpSocket != null) { sb.append("tcpSocket:"); sb.append(tcpSocket + ","); }
    if (terminationGracePeriodSeconds != null) { sb.append("terminationGracePeriodSeconds:"); sb.append(terminationGracePeriodSeconds + ","); }
    if (timeoutSeconds != null) { sb.append("timeoutSeconds:"); sb.append(timeoutSeconds); }
    sb.append("}");
    return sb.toString();
  }
  public class ExecNested<N> extends ExecFluent<ExecNested<N>> implements Nested<N>{
    ExecNested(Exec item) {
      this.builder = new ExecBuilder(this, item);
    }
    ExecBuilder builder;
    
    public N and() {
      return (N) ReadinessProbeFluent.this.withExec(builder.build());
    }
    
    public N endReadinessprobeExec() {
      return and();
    }
    
  
  }
  public class GrpcNested<N> extends GrpcFluent<GrpcNested<N>> implements Nested<N>{
    GrpcNested(Grpc item) {
      this.builder = new GrpcBuilder(this, item);
    }
    GrpcBuilder builder;
    
    public N and() {
      return (N) ReadinessProbeFluent.this.withGrpc(builder.build());
    }
    
    public N endReadinessprobeGrpc() {
      return and();
    }
    
  
  }
  public class HttpGetNested<N> extends HttpGetFluent<HttpGetNested<N>> implements Nested<N>{
    HttpGetNested(HttpGet item) {
      this.builder = new HttpGetBuilder(this, item);
    }
    HttpGetBuilder builder;
    
    public N and() {
      return (N) ReadinessProbeFluent.this.withHttpGet(builder.build());
    }
    
    public N endReadinessprobeHttpGet() {
      return and();
    }
    
  
  }
  public class TcpSocketNested<N> extends TcpSocketFluent<TcpSocketNested<N>> implements Nested<N>{
    TcpSocketNested(TcpSocket item) {
      this.builder = new TcpSocketBuilder(this, item);
    }
    TcpSocketBuilder builder;
    
    public N and() {
      return (N) ReadinessProbeFluent.this.withTcpSocket(builder.build());
    }
    
    public N endReadinessprobeTcpSocket() {
      return and();
    }
    
  
  }

}