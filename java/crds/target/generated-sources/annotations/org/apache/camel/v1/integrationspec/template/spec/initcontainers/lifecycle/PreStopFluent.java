package org.apache.camel.v1.integrationspec.template.spec.initcontainers.lifecycle;

import org.apache.camel.v1.integrationspec.template.spec.initcontainers.lifecycle.prestop.HttpGetBuilder;
import java.lang.SuppressWarnings;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.lifecycle.prestop.HttpGet;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.lifecycle.prestop.ExecBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.lifecycle.prestop.TcpSocketBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.lifecycle.prestop.TcpSocketFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.lifecycle.prestop.Exec;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.lifecycle.prestop.HttpGetFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.lifecycle.prestop.ExecFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.lifecycle.prestop.TcpSocket;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PreStopFluent<A extends PreStopFluent<A>> extends BaseFluent<A>{
  public PreStopFluent() {
  }
  
  public PreStopFluent(PreStop instance) {
    this.copyInstance(instance);
  }
  private ExecBuilder exec;
  private HttpGetBuilder httpGet;
  private TcpSocketBuilder tcpSocket;
  
  protected void copyInstance(PreStop instance) {
    instance = (instance != null ? instance : new PreStop());
    if (instance != null) {
          this.withExec(instance.getExec());
          this.withHttpGet(instance.getHttpGet());
          this.withTcpSocket(instance.getTcpSocket());
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
  
  public ExecNested<A> editPrestopExec() {
    return withNewExecLike(java.util.Optional.ofNullable(buildExec()).orElse(null));
  }
  
  public ExecNested<A> editOrNewExec() {
    return withNewExecLike(java.util.Optional.ofNullable(buildExec()).orElse(new ExecBuilder().build()));
  }
  
  public ExecNested<A> editOrNewExecLike(Exec item) {
    return withNewExecLike(java.util.Optional.ofNullable(buildExec()).orElse(item));
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
  
  public HttpGetNested<A> editPrestopHttpGet() {
    return withNewHttpGetLike(java.util.Optional.ofNullable(buildHttpGet()).orElse(null));
  }
  
  public HttpGetNested<A> editOrNewHttpGet() {
    return withNewHttpGetLike(java.util.Optional.ofNullable(buildHttpGet()).orElse(new HttpGetBuilder().build()));
  }
  
  public HttpGetNested<A> editOrNewHttpGetLike(HttpGet item) {
    return withNewHttpGetLike(java.util.Optional.ofNullable(buildHttpGet()).orElse(item));
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
  
  public TcpSocketNested<A> editPrestopTcpSocket() {
    return withNewTcpSocketLike(java.util.Optional.ofNullable(buildTcpSocket()).orElse(null));
  }
  
  public TcpSocketNested<A> editOrNewTcpSocket() {
    return withNewTcpSocketLike(java.util.Optional.ofNullable(buildTcpSocket()).orElse(new TcpSocketBuilder().build()));
  }
  
  public TcpSocketNested<A> editOrNewTcpSocketLike(TcpSocket item) {
    return withNewTcpSocketLike(java.util.Optional.ofNullable(buildTcpSocket()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    PreStopFluent that = (PreStopFluent) o;
    if (!java.util.Objects.equals(exec, that.exec)) return false;
    if (!java.util.Objects.equals(httpGet, that.httpGet)) return false;
    if (!java.util.Objects.equals(tcpSocket, that.tcpSocket)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(exec,  httpGet,  tcpSocket,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (exec != null) { sb.append("exec:"); sb.append(exec + ","); }
    if (httpGet != null) { sb.append("httpGet:"); sb.append(httpGet + ","); }
    if (tcpSocket != null) { sb.append("tcpSocket:"); sb.append(tcpSocket); }
    sb.append("}");
    return sb.toString();
  }
  public class ExecNested<N> extends ExecFluent<ExecNested<N>> implements Nested<N>{
    ExecNested(Exec item) {
      this.builder = new ExecBuilder(this, item);
    }
    ExecBuilder builder;
    
    public N and() {
      return (N) PreStopFluent.this.withExec(builder.build());
    }
    
    public N endPrestopExec() {
      return and();
    }
    
  
  }
  public class HttpGetNested<N> extends HttpGetFluent<HttpGetNested<N>> implements Nested<N>{
    HttpGetNested(HttpGet item) {
      this.builder = new HttpGetBuilder(this, item);
    }
    HttpGetBuilder builder;
    
    public N and() {
      return (N) PreStopFluent.this.withHttpGet(builder.build());
    }
    
    public N endPrestopHttpGet() {
      return and();
    }
    
  
  }
  public class TcpSocketNested<N> extends TcpSocketFluent<TcpSocketNested<N>> implements Nested<N>{
    TcpSocketNested(TcpSocket item) {
      this.builder = new TcpSocketBuilder(this, item);
    }
    TcpSocketBuilder builder;
    
    public N and() {
      return (N) PreStopFluent.this.withTcpSocket(builder.build());
    }
    
    public N endPrestopTcpSocket() {
      return and();
    }
    
  
  }

}