package org.apache.camel.v1.pipespec.integration.template.spec.containers;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.pipespec.integration.template.spec.containers.resources.Claims;
import io.fabric8.kubernetes.api.model.IntOrString;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.pipespec.integration.template.spec.containers.resources.ClaimsBuilder;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import org.apache.camel.v1.pipespec.integration.template.spec.containers.resources.ClaimsFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ResourcesFluent<A extends ResourcesFluent<A>> extends BaseFluent<A>{
  public ResourcesFluent() {
  }
  
  public ResourcesFluent(Resources instance) {
    this.copyInstance(instance);
  }
  private ArrayList<ClaimsBuilder> claims;
  private Map<String,IntOrString> limits;
  private Map<String,IntOrString> requests;
  
  protected void copyInstance(Resources instance) {
    instance = (instance != null ? instance : new Resources());
    if (instance != null) {
          this.withClaims(instance.getClaims());
          this.withLimits(instance.getLimits());
          this.withRequests(instance.getRequests());
        }
  }
  
  public A addToClaims(int index,Claims item) {
    if (this.claims == null) {this.claims = new ArrayList<ClaimsBuilder>();}
    ClaimsBuilder builder = new ClaimsBuilder(item);
    if (index < 0 || index >= claims.size()) { _visitables.get("claims").add(builder); claims.add(builder); } else { _visitables.get("claims").add(index, builder); claims.add(index, builder);}
    return (A)this;
  }
  
  public A setToClaims(int index,Claims item) {
    if (this.claims == null) {this.claims = new ArrayList<ClaimsBuilder>();}
    ClaimsBuilder builder = new ClaimsBuilder(item);
    if (index < 0 || index >= claims.size()) { _visitables.get("claims").add(builder); claims.add(builder); } else { _visitables.get("claims").set(index, builder); claims.set(index, builder);}
    return (A)this;
  }
  
  public A addToClaims(org.apache.camel.v1.pipespec.integration.template.spec.containers.resources.Claims... items) {
    if (this.claims == null) {this.claims = new ArrayList<ClaimsBuilder>();}
    for (Claims item : items) {ClaimsBuilder builder = new ClaimsBuilder(item);_visitables.get("claims").add(builder);this.claims.add(builder);} return (A)this;
  }
  
  public A addAllToIntegrationClaims(Collection<Claims> items) {
    if (this.claims == null) {this.claims = new ArrayList<ClaimsBuilder>();}
    for (Claims item : items) {ClaimsBuilder builder = new ClaimsBuilder(item);_visitables.get("claims").add(builder);this.claims.add(builder);} return (A)this;
  }
  
  public A removeFromClaims(org.apache.camel.v1.pipespec.integration.template.spec.containers.resources.Claims... items) {
    if (this.claims == null) return (A)this;
    for (Claims item : items) {ClaimsBuilder builder = new ClaimsBuilder(item);_visitables.get("claims").remove(builder); this.claims.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIntegrationClaims(Collection<Claims> items) {
    if (this.claims == null) return (A)this;
    for (Claims item : items) {ClaimsBuilder builder = new ClaimsBuilder(item);_visitables.get("claims").remove(builder); this.claims.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIntegrationClaims(Predicate<ClaimsBuilder> predicate) {
    if (claims == null) return (A) this;
    final Iterator<ClaimsBuilder> each = claims.iterator();
    final List visitables = _visitables.get("claims");
    while (each.hasNext()) {
      ClaimsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Claims> buildClaims() {
    return this.claims != null ? build(claims) : null;
  }
  
  public Claims buildClaim(int index) {
    return this.claims.get(index).build();
  }
  
  public Claims buildFirstClaim() {
    return this.claims.get(0).build();
  }
  
  public Claims buildLastClaim() {
    return this.claims.get(claims.size() - 1).build();
  }
  
  public Claims buildMatchingClaim(Predicate<ClaimsBuilder> predicate) {
      for (ClaimsBuilder item : claims) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingClaim(Predicate<ClaimsBuilder> predicate) {
      for (ClaimsBuilder item : claims) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withClaims(List<Claims> claims) {
    if (this.claims != null) {
      this._visitables.get("claims").clear();
    }
    if (claims != null) {
        this.claims = new ArrayList();
        for (Claims item : claims) {
          this.addToClaims(item);
        }
    } else {
      this.claims = null;
    }
    return (A) this;
  }
  
  public A withClaims(org.apache.camel.v1.pipespec.integration.template.spec.containers.resources.Claims... claims) {
    if (this.claims != null) {
        this.claims.clear();
        _visitables.remove("claims");
    }
    if (claims != null) {
      for (Claims item : claims) {
        this.addToClaims(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasClaims() {
    return this.claims != null && !this.claims.isEmpty();
  }
  
  public ClaimsNested<A> addNewClaim() {
    return new ClaimsNested(-1, null);
  }
  
  public ClaimsNested<A> addNewClaimLike(Claims item) {
    return new ClaimsNested(-1, item);
  }
  
  public ClaimsNested<A> setNewClaimLike(int index,Claims item) {
    return new ClaimsNested(index, item);
  }
  
  public ClaimsNested<A> editClaim(int index) {
    if (claims.size() <= index) throw new RuntimeException("Can't edit claims. Index exceeds size.");
    return setNewClaimLike(index, buildClaim(index));
  }
  
  public ClaimsNested<A> editFirstClaim() {
    if (claims.size() == 0) throw new RuntimeException("Can't edit first claims. The list is empty.");
    return setNewClaimLike(0, buildClaim(0));
  }
  
  public ClaimsNested<A> editLastClaim() {
    int index = claims.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last claims. The list is empty.");
    return setNewClaimLike(index, buildClaim(index));
  }
  
  public ClaimsNested<A> editMatchingClaim(Predicate<ClaimsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<claims.size();i++) { 
    if (predicate.test(claims.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching claims. No match found.");
    return setNewClaimLike(index, buildClaim(index));
  }
  
  public A addToLimits(String key,IntOrString value) {
    if(this.limits == null && key != null && value != null) { this.limits = new LinkedHashMap(); }
    if(key != null && value != null) {this.limits.put(key, value);} return (A)this;
  }
  
  public A addToLimits(Map<String,IntOrString> map) {
    if(this.limits == null && map != null) { this.limits = new LinkedHashMap(); }
    if(map != null) { this.limits.putAll(map);} return (A)this;
  }
  
  public A removeFromLimits(String key) {
    if(this.limits == null) { return (A) this; }
    if(key != null && this.limits != null) {this.limits.remove(key);} return (A)this;
  }
  
  public A removeFromLimits(Map<String,IntOrString> map) {
    if(this.limits == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.limits != null){this.limits.remove(key);}}} return (A)this;
  }
  
  public Map<String,IntOrString> getLimits() {
    return this.limits;
  }
  
  public <K,V>A withLimits(Map<String,IntOrString> limits) {
    if (limits == null) {
      this.limits = null;
    } else {
      this.limits = new LinkedHashMap(limits);
    }
    return (A) this;
  }
  
  public boolean hasLimits() {
    return this.limits != null;
  }
  
  public A addToRequests(String key,IntOrString value) {
    if(this.requests == null && key != null && value != null) { this.requests = new LinkedHashMap(); }
    if(key != null && value != null) {this.requests.put(key, value);} return (A)this;
  }
  
  public A addToRequests(Map<String,IntOrString> map) {
    if(this.requests == null && map != null) { this.requests = new LinkedHashMap(); }
    if(map != null) { this.requests.putAll(map);} return (A)this;
  }
  
  public A removeFromRequests(String key) {
    if(this.requests == null) { return (A) this; }
    if(key != null && this.requests != null) {this.requests.remove(key);} return (A)this;
  }
  
  public A removeFromRequests(Map<String,IntOrString> map) {
    if(this.requests == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.requests != null){this.requests.remove(key);}}} return (A)this;
  }
  
  public Map<String,IntOrString> getRequests() {
    return this.requests;
  }
  
  public <K,V>A withRequests(Map<String,IntOrString> requests) {
    if (requests == null) {
      this.requests = null;
    } else {
      this.requests = new LinkedHashMap(requests);
    }
    return (A) this;
  }
  
  public boolean hasRequests() {
    return this.requests != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ResourcesFluent that = (ResourcesFluent) o;
    if (!java.util.Objects.equals(claims, that.claims)) return false;
    if (!java.util.Objects.equals(limits, that.limits)) return false;
    if (!java.util.Objects.equals(requests, that.requests)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(claims,  limits,  requests,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (claims != null && !claims.isEmpty()) { sb.append("claims:"); sb.append(claims + ","); }
    if (limits != null && !limits.isEmpty()) { sb.append("limits:"); sb.append(limits + ","); }
    if (requests != null && !requests.isEmpty()) { sb.append("requests:"); sb.append(requests); }
    sb.append("}");
    return sb.toString();
  }
  public class ClaimsNested<N> extends ClaimsFluent<ClaimsNested<N>> implements Nested<N>{
    ClaimsNested(int index,Claims item) {
      this.index = index;
      this.builder = new ClaimsBuilder(this, item);
    }
    ClaimsBuilder builder;
    int index;
    
    public N and() {
      return (N) ResourcesFluent.this.setToClaims(index,builder.build());
    }
    
    public N endIntegrationClaim() {
      return and();
    }
    
  
  }

}