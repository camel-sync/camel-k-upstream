package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.readinessprobe;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.readinessprobe.httpget.HttpHeaders;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import io.fabric8.kubernetes.api.model.IntOrString;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.readinessprobe.httpget.HttpHeadersFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.readinessprobe.httpget.HttpHeadersBuilder;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class HttpGetFluent<A extends HttpGetFluent<A>> extends BaseFluent<A>{
  public HttpGetFluent() {
  }
  
  public HttpGetFluent(HttpGet instance) {
    this.copyInstance(instance);
  }
  private String host;
  private ArrayList<HttpHeadersBuilder> httpHeaders;
  private String path;
  private IntOrString port;
  private String scheme;
  
  protected void copyInstance(HttpGet instance) {
    instance = (instance != null ? instance : new HttpGet());
    if (instance != null) {
          this.withHost(instance.getHost());
          this.withHttpHeaders(instance.getHttpHeaders());
          this.withPath(instance.getPath());
          this.withPort(instance.getPort());
          this.withScheme(instance.getScheme());
        }
  }
  
  public String getHost() {
    return this.host;
  }
  
  public A withHost(String host) {
    this.host = host;
    return (A) this;
  }
  
  public boolean hasHost() {
    return this.host != null;
  }
  
  public A addToHttpHeaders(int index,HttpHeaders item) {
    if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<HttpHeadersBuilder>();}
    HttpHeadersBuilder builder = new HttpHeadersBuilder(item);
    if (index < 0 || index >= httpHeaders.size()) { _visitables.get("httpHeaders").add(builder); httpHeaders.add(builder); } else { _visitables.get("httpHeaders").add(index, builder); httpHeaders.add(index, builder);}
    return (A)this;
  }
  
  public A setToHttpHeaders(int index,HttpHeaders item) {
    if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<HttpHeadersBuilder>();}
    HttpHeadersBuilder builder = new HttpHeadersBuilder(item);
    if (index < 0 || index >= httpHeaders.size()) { _visitables.get("httpHeaders").add(builder); httpHeaders.add(builder); } else { _visitables.get("httpHeaders").set(index, builder); httpHeaders.set(index, builder);}
    return (A)this;
  }
  
  public A addToHttpHeaders(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.readinessprobe.httpget.HttpHeaders... items) {
    if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<HttpHeadersBuilder>();}
    for (HttpHeaders item : items) {HttpHeadersBuilder builder = new HttpHeadersBuilder(item);_visitables.get("httpHeaders").add(builder);this.httpHeaders.add(builder);} return (A)this;
  }
  
  public A addAllToReadinessprobeHttpHeaders(Collection<HttpHeaders> items) {
    if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<HttpHeadersBuilder>();}
    for (HttpHeaders item : items) {HttpHeadersBuilder builder = new HttpHeadersBuilder(item);_visitables.get("httpHeaders").add(builder);this.httpHeaders.add(builder);} return (A)this;
  }
  
  public A removeFromHttpHeaders(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.readinessprobe.httpget.HttpHeaders... items) {
    if (this.httpHeaders == null) return (A)this;
    for (HttpHeaders item : items) {HttpHeadersBuilder builder = new HttpHeadersBuilder(item);_visitables.get("httpHeaders").remove(builder); this.httpHeaders.remove(builder);} return (A)this;
  }
  
  public A removeAllFromReadinessprobeHttpHeaders(Collection<HttpHeaders> items) {
    if (this.httpHeaders == null) return (A)this;
    for (HttpHeaders item : items) {HttpHeadersBuilder builder = new HttpHeadersBuilder(item);_visitables.get("httpHeaders").remove(builder); this.httpHeaders.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromReadinessprobeHttpHeaders(Predicate<HttpHeadersBuilder> predicate) {
    if (httpHeaders == null) return (A) this;
    final Iterator<HttpHeadersBuilder> each = httpHeaders.iterator();
    final List visitables = _visitables.get("httpHeaders");
    while (each.hasNext()) {
      HttpHeadersBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<HttpHeaders> buildHttpHeaders() {
    return this.httpHeaders != null ? build(httpHeaders) : null;
  }
  
  public HttpHeaders buildHttpHeader(int index) {
    return this.httpHeaders.get(index).build();
  }
  
  public HttpHeaders buildFirstHttpHeader() {
    return this.httpHeaders.get(0).build();
  }
  
  public HttpHeaders buildLastHttpHeader() {
    return this.httpHeaders.get(httpHeaders.size() - 1).build();
  }
  
  public HttpHeaders buildMatchingHttpHeader(Predicate<HttpHeadersBuilder> predicate) {
      for (HttpHeadersBuilder item : httpHeaders) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingHttpHeader(Predicate<HttpHeadersBuilder> predicate) {
      for (HttpHeadersBuilder item : httpHeaders) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withHttpHeaders(List<HttpHeaders> httpHeaders) {
    if (this.httpHeaders != null) {
      this._visitables.get("httpHeaders").clear();
    }
    if (httpHeaders != null) {
        this.httpHeaders = new ArrayList();
        for (HttpHeaders item : httpHeaders) {
          this.addToHttpHeaders(item);
        }
    } else {
      this.httpHeaders = null;
    }
    return (A) this;
  }
  
  public A withHttpHeaders(org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.ephemeralcontainers.readinessprobe.httpget.HttpHeaders... httpHeaders) {
    if (this.httpHeaders != null) {
        this.httpHeaders.clear();
        _visitables.remove("httpHeaders");
    }
    if (httpHeaders != null) {
      for (HttpHeaders item : httpHeaders) {
        this.addToHttpHeaders(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasHttpHeaders() {
    return this.httpHeaders != null && !this.httpHeaders.isEmpty();
  }
  
  public HttpHeadersNested<A> addNewHttpHeader() {
    return new HttpHeadersNested(-1, null);
  }
  
  public HttpHeadersNested<A> addNewHttpHeaderLike(HttpHeaders item) {
    return new HttpHeadersNested(-1, item);
  }
  
  public HttpHeadersNested<A> setNewHttpHeaderLike(int index,HttpHeaders item) {
    return new HttpHeadersNested(index, item);
  }
  
  public HttpHeadersNested<A> editHttpHeader(int index) {
    if (httpHeaders.size() <= index) throw new RuntimeException("Can't edit httpHeaders. Index exceeds size.");
    return setNewHttpHeaderLike(index, buildHttpHeader(index));
  }
  
  public HttpHeadersNested<A> editFirstHttpHeader() {
    if (httpHeaders.size() == 0) throw new RuntimeException("Can't edit first httpHeaders. The list is empty.");
    return setNewHttpHeaderLike(0, buildHttpHeader(0));
  }
  
  public HttpHeadersNested<A> editLastHttpHeader() {
    int index = httpHeaders.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last httpHeaders. The list is empty.");
    return setNewHttpHeaderLike(index, buildHttpHeader(index));
  }
  
  public HttpHeadersNested<A> editMatchingHttpHeader(Predicate<HttpHeadersBuilder> predicate) {
    int index = -1;
    for (int i=0;i<httpHeaders.size();i++) { 
    if (predicate.test(httpHeaders.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching httpHeaders. No match found.");
    return setNewHttpHeaderLike(index, buildHttpHeader(index));
  }
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public IntOrString getPort() {
    return this.port;
  }
  
  public A withPort(IntOrString port) {
    this.port = port;
    return (A) this;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public A withNewPort(Object value) {
    return (A)withPort(new IntOrString(value));
  }
  
  public String getScheme() {
    return this.scheme;
  }
  
  public A withScheme(String scheme) {
    this.scheme = scheme;
    return (A) this;
  }
  
  public boolean hasScheme() {
    return this.scheme != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    HttpGetFluent that = (HttpGetFluent) o;
    if (!java.util.Objects.equals(host, that.host)) return false;
    if (!java.util.Objects.equals(httpHeaders, that.httpHeaders)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(port, that.port)) return false;
    if (!java.util.Objects.equals(scheme, that.scheme)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(host,  httpHeaders,  path,  port,  scheme,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (host != null) { sb.append("host:"); sb.append(host + ","); }
    if (httpHeaders != null && !httpHeaders.isEmpty()) { sb.append("httpHeaders:"); sb.append(httpHeaders + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (port != null) { sb.append("port:"); sb.append(port + ","); }
    if (scheme != null) { sb.append("scheme:"); sb.append(scheme); }
    sb.append("}");
    return sb.toString();
  }
  public class HttpHeadersNested<N> extends HttpHeadersFluent<HttpHeadersNested<N>> implements Nested<N>{
    HttpHeadersNested(int index,HttpHeaders item) {
      this.index = index;
      this.builder = new HttpHeadersBuilder(this, item);
    }
    HttpHeadersBuilder builder;
    int index;
    
    public N and() {
      return (N) HttpGetFluent.this.setToHttpHeaders(index,builder.build());
    }
    
    public N endReadinessprobeHttpHeader() {
      return and();
    }
    
  
  }

}