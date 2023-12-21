package org.apache.camel.v1.camelcatalogspec.artifacts;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import org.apache.camel.v1.camelcatalogspec.artifacts.schemes.ConsumerFluent;
import org.apache.camel.v1.camelcatalogspec.artifacts.schemes.ProducerFluent;
import org.apache.camel.v1.camelcatalogspec.artifacts.schemes.ProducerBuilder;
import org.apache.camel.v1.camelcatalogspec.artifacts.schemes.Consumer;
import org.apache.camel.v1.camelcatalogspec.artifacts.schemes.Producer;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import org.apache.camel.v1.camelcatalogspec.artifacts.schemes.ConsumerBuilder;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SchemesFluent<A extends SchemesFluent<A>> extends BaseFluent<A>{
  public SchemesFluent() {
  }
  
  public SchemesFluent(Schemes instance) {
    this.copyInstance(instance);
  }
  private ConsumerBuilder consumer;
  private Boolean http;
  private String id;
  private Boolean passive;
  private ProducerBuilder producer;
  
  protected void copyInstance(Schemes instance) {
    instance = (instance != null ? instance : new Schemes());
    if (instance != null) {
          this.withConsumer(instance.getConsumer());
          this.withHttp(instance.getHttp());
          this.withId(instance.getId());
          this.withPassive(instance.getPassive());
          this.withProducer(instance.getProducer());
        }
  }
  
  public Consumer buildConsumer() {
    return this.consumer != null ? this.consumer.build() : null;
  }
  
  public A withConsumer(Consumer consumer) {
    this._visitables.remove("consumer");
    if (consumer != null) {
        this.consumer = new ConsumerBuilder(consumer);
        this._visitables.get("consumer").add(this.consumer);
    } else {
        this.consumer = null;
        this._visitables.get("consumer").remove(this.consumer);
    }
    return (A) this;
  }
  
  public boolean hasConsumer() {
    return this.consumer != null;
  }
  
  public ConsumerNested<A> withNewConsumer() {
    return new ConsumerNested(null);
  }
  
  public ConsumerNested<A> withNewConsumerLike(Consumer item) {
    return new ConsumerNested(item);
  }
  
  public ConsumerNested<A> editConsumer() {
    return withNewConsumerLike(java.util.Optional.ofNullable(buildConsumer()).orElse(null));
  }
  
  public ConsumerNested<A> editOrNewConsumer() {
    return withNewConsumerLike(java.util.Optional.ofNullable(buildConsumer()).orElse(new ConsumerBuilder().build()));
  }
  
  public ConsumerNested<A> editOrNewConsumerLike(Consumer item) {
    return withNewConsumerLike(java.util.Optional.ofNullable(buildConsumer()).orElse(item));
  }
  
  public Boolean getHttp() {
    return this.http;
  }
  
  public A withHttp(Boolean http) {
    this.http = http;
    return (A) this;
  }
  
  public boolean hasHttp() {
    return this.http != null;
  }
  
  public String getId() {
    return this.id;
  }
  
  public A withId(String id) {
    this.id = id;
    return (A) this;
  }
  
  public boolean hasId() {
    return this.id != null;
  }
  
  public Boolean getPassive() {
    return this.passive;
  }
  
  public A withPassive(Boolean passive) {
    this.passive = passive;
    return (A) this;
  }
  
  public boolean hasPassive() {
    return this.passive != null;
  }
  
  public Producer buildProducer() {
    return this.producer != null ? this.producer.build() : null;
  }
  
  public A withProducer(Producer producer) {
    this._visitables.remove("producer");
    if (producer != null) {
        this.producer = new ProducerBuilder(producer);
        this._visitables.get("producer").add(this.producer);
    } else {
        this.producer = null;
        this._visitables.get("producer").remove(this.producer);
    }
    return (A) this;
  }
  
  public boolean hasProducer() {
    return this.producer != null;
  }
  
  public ProducerNested<A> withNewProducer() {
    return new ProducerNested(null);
  }
  
  public ProducerNested<A> withNewProducerLike(Producer item) {
    return new ProducerNested(item);
  }
  
  public ProducerNested<A> editProducer() {
    return withNewProducerLike(java.util.Optional.ofNullable(buildProducer()).orElse(null));
  }
  
  public ProducerNested<A> editOrNewProducer() {
    return withNewProducerLike(java.util.Optional.ofNullable(buildProducer()).orElse(new ProducerBuilder().build()));
  }
  
  public ProducerNested<A> editOrNewProducerLike(Producer item) {
    return withNewProducerLike(java.util.Optional.ofNullable(buildProducer()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    SchemesFluent that = (SchemesFluent) o;
    if (!java.util.Objects.equals(consumer, that.consumer)) return false;
    if (!java.util.Objects.equals(http, that.http)) return false;
    if (!java.util.Objects.equals(id, that.id)) return false;
    if (!java.util.Objects.equals(passive, that.passive)) return false;
    if (!java.util.Objects.equals(producer, that.producer)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(consumer,  http,  id,  passive,  producer,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (consumer != null) { sb.append("consumer:"); sb.append(consumer + ","); }
    if (http != null) { sb.append("http:"); sb.append(http + ","); }
    if (id != null) { sb.append("id:"); sb.append(id + ","); }
    if (passive != null) { sb.append("passive:"); sb.append(passive + ","); }
    if (producer != null) { sb.append("producer:"); sb.append(producer); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withHttp() {
    return withHttp(true);
  }
  
  public A withPassive() {
    return withPassive(true);
  }
  public class ConsumerNested<N> extends ConsumerFluent<ConsumerNested<N>> implements Nested<N>{
    ConsumerNested(Consumer item) {
      this.builder = new ConsumerBuilder(this, item);
    }
    ConsumerBuilder builder;
    
    public N and() {
      return (N) SchemesFluent.this.withConsumer(builder.build());
    }
    
    public N endConsumer() {
      return and();
    }
    
  
  }
  public class ProducerNested<N> extends ProducerFluent<ProducerNested<N>> implements Nested<N>{
    ProducerNested(Producer item) {
      this.builder = new ProducerBuilder(this, item);
    }
    ProducerBuilder builder;
    
    public N and() {
      return (N) SchemesFluent.this.withProducer(builder.build());
    }
    
    public N endProducer() {
      return and();
    }
    
  
  }

}