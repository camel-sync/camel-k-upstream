package org.apache.camel.v1.integrationkitspec;

import org.apache.camel.v1.integrationkitspec.traits.BuilderFluent;
import org.apache.camel.v1.integrationkitspec.traits.CamelBuilder;
import java.lang.SuppressWarnings;
import org.apache.camel.v1.integrationkitspec.traits.Builder;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1.integrationkitspec.traits.Addons;
import java.lang.String;
import org.apache.camel.v1.integrationkitspec.traits.Camel;
import java.util.LinkedHashMap;
import org.apache.camel.v1.integrationkitspec.traits.QuarkusBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1.integrationkitspec.traits.Registry;
import org.apache.camel.v1.integrationkitspec.traits.RegistryFluent;
import org.apache.camel.v1.integrationkitspec.traits.CamelFluent;
import org.apache.camel.v1.integrationkitspec.traits.Quarkus;
import java.lang.Object;
import org.apache.camel.v1.integrationkitspec.traits.BuilderBuilder;
import org.apache.camel.v1.integrationkitspec.traits.RegistryBuilder;
import java.util.Map;
import org.apache.camel.v1.integrationkitspec.traits.QuarkusFluent;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class TraitsFluent<A extends TraitsFluent<A>> extends BaseFluent<A>{
  public TraitsFluent() {
  }
  
  public TraitsFluent(Traits instance) {
    this.copyInstance(instance);
  }
  private Map<String,Addons> addons;
  private BuilderBuilder builder;
  private CamelBuilder camel;
  private QuarkusBuilder quarkus;
  private RegistryBuilder registry;
  
  protected void copyInstance(Traits instance) {
    instance = (instance != null ? instance : new Traits());
    if (instance != null) {
          this.withAddons(instance.getAddons());
          this.withBuilder(instance.getBuilder());
          this.withCamel(instance.getCamel());
          this.withQuarkus(instance.getQuarkus());
          this.withRegistry(instance.getRegistry());
        }
  }
  
  public A addToAddons(String key,Addons value) {
    if(this.addons == null && key != null && value != null) { this.addons = new LinkedHashMap(); }
    if(key != null && value != null) {this.addons.put(key, value);} return (A)this;
  }
  
  public A addToAddons(Map<String,Addons> map) {
    if(this.addons == null && map != null) { this.addons = new LinkedHashMap(); }
    if(map != null) { this.addons.putAll(map);} return (A)this;
  }
  
  public A removeFromAddons(String key) {
    if(this.addons == null) { return (A) this; }
    if(key != null && this.addons != null) {this.addons.remove(key);} return (A)this;
  }
  
  public A removeFromAddons(Map<String,Addons> map) {
    if(this.addons == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.addons != null){this.addons.remove(key);}}} return (A)this;
  }
  
  public Map<String,Addons> getAddons() {
    return this.addons;
  }
  
  public <K,V>A withAddons(Map<String,Addons> addons) {
    if (addons == null) {
      this.addons = null;
    } else {
      this.addons = new LinkedHashMap(addons);
    }
    return (A) this;
  }
  
  public boolean hasAddons() {
    return this.addons != null;
  }
  
  public Builder buildBuilder() {
    return this.builder != null ? this.builder.build() : null;
  }
  
  public A withBuilder(Builder builder) {
    this._visitables.remove("builder");
    if (builder != null) {
        this.builder = new BuilderBuilder(builder);
        this._visitables.get("builder").add(this.builder);
    } else {
        this.builder = null;
        this._visitables.get("builder").remove(this.builder);
    }
    return (A) this;
  }
  
  public boolean hasBuilder() {
    return this.builder != null;
  }
  
  public BuilderNested<A> withNewBuilder() {
    return new BuilderNested(null);
  }
  
  public BuilderNested<A> withNewBuilderLike(Builder item) {
    return new BuilderNested(item);
  }
  
  public BuilderNested<A> editBuilder() {
    return withNewBuilderLike(java.util.Optional.ofNullable(buildBuilder()).orElse(null));
  }
  
  public BuilderNested<A> editOrNewBuilder() {
    return withNewBuilderLike(java.util.Optional.ofNullable(buildBuilder()).orElse(new BuilderBuilder().build()));
  }
  
  public BuilderNested<A> editOrNewBuilderLike(Builder item) {
    return withNewBuilderLike(java.util.Optional.ofNullable(buildBuilder()).orElse(item));
  }
  
  public Camel buildCamel() {
    return this.camel != null ? this.camel.build() : null;
  }
  
  public A withCamel(Camel camel) {
    this._visitables.remove("camel");
    if (camel != null) {
        this.camel = new CamelBuilder(camel);
        this._visitables.get("camel").add(this.camel);
    } else {
        this.camel = null;
        this._visitables.get("camel").remove(this.camel);
    }
    return (A) this;
  }
  
  public boolean hasCamel() {
    return this.camel != null;
  }
  
  public CamelNested<A> withNewCamel() {
    return new CamelNested(null);
  }
  
  public CamelNested<A> withNewCamelLike(Camel item) {
    return new CamelNested(item);
  }
  
  public CamelNested<A> editCamel() {
    return withNewCamelLike(java.util.Optional.ofNullable(buildCamel()).orElse(null));
  }
  
  public CamelNested<A> editOrNewCamel() {
    return withNewCamelLike(java.util.Optional.ofNullable(buildCamel()).orElse(new CamelBuilder().build()));
  }
  
  public CamelNested<A> editOrNewCamelLike(Camel item) {
    return withNewCamelLike(java.util.Optional.ofNullable(buildCamel()).orElse(item));
  }
  
  public Quarkus buildQuarkus() {
    return this.quarkus != null ? this.quarkus.build() : null;
  }
  
  public A withQuarkus(Quarkus quarkus) {
    this._visitables.remove("quarkus");
    if (quarkus != null) {
        this.quarkus = new QuarkusBuilder(quarkus);
        this._visitables.get("quarkus").add(this.quarkus);
    } else {
        this.quarkus = null;
        this._visitables.get("quarkus").remove(this.quarkus);
    }
    return (A) this;
  }
  
  public boolean hasQuarkus() {
    return this.quarkus != null;
  }
  
  public QuarkusNested<A> withNewQuarkus() {
    return new QuarkusNested(null);
  }
  
  public QuarkusNested<A> withNewQuarkusLike(Quarkus item) {
    return new QuarkusNested(item);
  }
  
  public QuarkusNested<A> editQuarkus() {
    return withNewQuarkusLike(java.util.Optional.ofNullable(buildQuarkus()).orElse(null));
  }
  
  public QuarkusNested<A> editOrNewQuarkus() {
    return withNewQuarkusLike(java.util.Optional.ofNullable(buildQuarkus()).orElse(new QuarkusBuilder().build()));
  }
  
  public QuarkusNested<A> editOrNewQuarkusLike(Quarkus item) {
    return withNewQuarkusLike(java.util.Optional.ofNullable(buildQuarkus()).orElse(item));
  }
  
  public Registry buildRegistry() {
    return this.registry != null ? this.registry.build() : null;
  }
  
  public A withRegistry(Registry registry) {
    this._visitables.remove("registry");
    if (registry != null) {
        this.registry = new RegistryBuilder(registry);
        this._visitables.get("registry").add(this.registry);
    } else {
        this.registry = null;
        this._visitables.get("registry").remove(this.registry);
    }
    return (A) this;
  }
  
  public boolean hasRegistry() {
    return this.registry != null;
  }
  
  public RegistryNested<A> withNewRegistry() {
    return new RegistryNested(null);
  }
  
  public RegistryNested<A> withNewRegistryLike(Registry item) {
    return new RegistryNested(item);
  }
  
  public RegistryNested<A> editTraitsRegistry() {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(null));
  }
  
  public RegistryNested<A> editOrNewRegistry() {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(new RegistryBuilder().build()));
  }
  
  public RegistryNested<A> editOrNewRegistryLike(Registry item) {
    return withNewRegistryLike(java.util.Optional.ofNullable(buildRegistry()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    TraitsFluent that = (TraitsFluent) o;
    if (!java.util.Objects.equals(addons, that.addons)) return false;
    if (!java.util.Objects.equals(builder, that.builder)) return false;
    if (!java.util.Objects.equals(camel, that.camel)) return false;
    if (!java.util.Objects.equals(quarkus, that.quarkus)) return false;
    if (!java.util.Objects.equals(registry, that.registry)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(addons,  builder,  camel,  quarkus,  registry,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (addons != null && !addons.isEmpty()) { sb.append("addons:"); sb.append(addons + ","); }
    if (builder != null) { sb.append("builder:"); sb.append(builder + ","); }
    if (camel != null) { sb.append("camel:"); sb.append(camel + ","); }
    if (quarkus != null) { sb.append("quarkus:"); sb.append(quarkus + ","); }
    if (registry != null) { sb.append("registry:"); sb.append(registry); }
    sb.append("}");
    return sb.toString();
  }
  public class BuilderNested<N> extends BuilderFluent<BuilderNested<N>> implements Nested<N>{
    BuilderNested(Builder item) {
      this.builder = new BuilderBuilder(this, item);
    }
    BuilderBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withBuilder(builder.build());
    }
    
    public N endBuilder() {
      return and();
    }
    
  
  }
  public class CamelNested<N> extends CamelFluent<CamelNested<N>> implements Nested<N>{
    CamelNested(Camel item) {
      this.builder = new CamelBuilder(this, item);
    }
    CamelBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withCamel(builder.build());
    }
    
    public N endCamel() {
      return and();
    }
    
  
  }
  public class QuarkusNested<N> extends QuarkusFluent<QuarkusNested<N>> implements Nested<N>{
    QuarkusNested(Quarkus item) {
      this.builder = new QuarkusBuilder(this, item);
    }
    QuarkusBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withQuarkus(builder.build());
    }
    
    public N endQuarkus() {
      return and();
    }
    
  
  }
  public class RegistryNested<N> extends RegistryFluent<RegistryNested<N>> implements Nested<N>{
    RegistryNested(Registry item) {
      this.builder = new RegistryBuilder(this, item);
    }
    RegistryBuilder builder;
    
    public N and() {
      return (N) TraitsFluent.this.withRegistry(builder.build());
    }
    
    public N endTraitsRegistry() {
      return and();
    }
    
  
  }

}