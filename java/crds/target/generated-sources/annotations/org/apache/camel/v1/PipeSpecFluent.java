package org.apache.camel.v1;

import org.apache.camel.v1.pipespec.Steps;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.pipespec.IntegrationBuilder;
import java.lang.String;
import org.apache.camel.v1.pipespec.Source;
import java.util.function.Predicate;
import org.apache.camel.v1.pipespec.ErrorHandlerBuilder;
import org.apache.camel.v1.pipespec.StepsBuilder;
import org.apache.camel.v1.pipespec.Sink;
import org.apache.camel.v1.pipespec.SinkFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import org.apache.camel.v1.pipespec.ErrorHandler;
import org.apache.camel.v1.pipespec.Integration;
import org.apache.camel.v1.pipespec.SourceBuilder;
import org.apache.camel.v1.pipespec.SourceFluent;
import org.apache.camel.v1.pipespec.SinkBuilder;
import java.lang.Integer;
import org.apache.camel.v1.pipespec.ErrorHandlerFluent;
import java.util.Collection;
import org.apache.camel.v1.pipespec.IntegrationFluent;
import java.lang.Object;
import org.apache.camel.v1.pipespec.StepsFluent;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PipeSpecFluent<A extends PipeSpecFluent<A>> extends BaseFluent<A>{
  public PipeSpecFluent() {
  }
  
  public PipeSpecFluent(PipeSpec instance) {
    this.copyInstance(instance);
  }
  private ErrorHandlerBuilder errorHandler;
  private IntegrationBuilder integration;
  private Integer replicas;
  private String serviceAccountName;
  private SinkBuilder sink;
  private SourceBuilder source;
  private ArrayList<StepsBuilder> steps;
  
  protected void copyInstance(PipeSpec instance) {
    instance = (instance != null ? instance : new PipeSpec());
    if (instance != null) {
          this.withErrorHandler(instance.getErrorHandler());
          this.withIntegration(instance.getIntegration());
          this.withReplicas(instance.getReplicas());
          this.withServiceAccountName(instance.getServiceAccountName());
          this.withSink(instance.getSink());
          this.withSource(instance.getSource());
          this.withSteps(instance.getSteps());
        }
  }
  
  public ErrorHandler buildErrorHandler() {
    return this.errorHandler != null ? this.errorHandler.build() : null;
  }
  
  public A withErrorHandler(ErrorHandler errorHandler) {
    this._visitables.remove("errorHandler");
    if (errorHandler != null) {
        this.errorHandler = new ErrorHandlerBuilder(errorHandler);
        this._visitables.get("errorHandler").add(this.errorHandler);
    } else {
        this.errorHandler = null;
        this._visitables.get("errorHandler").remove(this.errorHandler);
    }
    return (A) this;
  }
  
  public boolean hasErrorHandler() {
    return this.errorHandler != null;
  }
  
  public ErrorHandlerNested<A> withNewErrorHandler() {
    return new ErrorHandlerNested(null);
  }
  
  public ErrorHandlerNested<A> withNewErrorHandlerLike(ErrorHandler item) {
    return new ErrorHandlerNested(item);
  }
  
  public ErrorHandlerNested<A> editPipespecErrorHandler() {
    return withNewErrorHandlerLike(java.util.Optional.ofNullable(buildErrorHandler()).orElse(null));
  }
  
  public ErrorHandlerNested<A> editOrNewErrorHandler() {
    return withNewErrorHandlerLike(java.util.Optional.ofNullable(buildErrorHandler()).orElse(new ErrorHandlerBuilder().build()));
  }
  
  public ErrorHandlerNested<A> editOrNewErrorHandlerLike(ErrorHandler item) {
    return withNewErrorHandlerLike(java.util.Optional.ofNullable(buildErrorHandler()).orElse(item));
  }
  
  public Integration buildIntegration() {
    return this.integration != null ? this.integration.build() : null;
  }
  
  public A withIntegration(Integration integration) {
    this._visitables.remove("integration");
    if (integration != null) {
        this.integration = new IntegrationBuilder(integration);
        this._visitables.get("integration").add(this.integration);
    } else {
        this.integration = null;
        this._visitables.get("integration").remove(this.integration);
    }
    return (A) this;
  }
  
  public boolean hasIntegration() {
    return this.integration != null;
  }
  
  public IntegrationNested<A> withNewIntegration() {
    return new IntegrationNested(null);
  }
  
  public IntegrationNested<A> withNewIntegrationLike(Integration item) {
    return new IntegrationNested(item);
  }
  
  public IntegrationNested<A> editPipespecIntegration() {
    return withNewIntegrationLike(java.util.Optional.ofNullable(buildIntegration()).orElse(null));
  }
  
  public IntegrationNested<A> editOrNewIntegration() {
    return withNewIntegrationLike(java.util.Optional.ofNullable(buildIntegration()).orElse(new IntegrationBuilder().build()));
  }
  
  public IntegrationNested<A> editOrNewIntegrationLike(Integration item) {
    return withNewIntegrationLike(java.util.Optional.ofNullable(buildIntegration()).orElse(item));
  }
  
  public Integer getReplicas() {
    return this.replicas;
  }
  
  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
  }
  
  public String getServiceAccountName() {
    return this.serviceAccountName;
  }
  
  public A withServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return (A) this;
  }
  
  public boolean hasServiceAccountName() {
    return this.serviceAccountName != null;
  }
  
  public Sink buildSink() {
    return this.sink != null ? this.sink.build() : null;
  }
  
  public A withSink(Sink sink) {
    this._visitables.remove("sink");
    if (sink != null) {
        this.sink = new SinkBuilder(sink);
        this._visitables.get("sink").add(this.sink);
    } else {
        this.sink = null;
        this._visitables.get("sink").remove(this.sink);
    }
    return (A) this;
  }
  
  public boolean hasSink() {
    return this.sink != null;
  }
  
  public SinkNested<A> withNewSink() {
    return new SinkNested(null);
  }
  
  public SinkNested<A> withNewSinkLike(Sink item) {
    return new SinkNested(item);
  }
  
  public SinkNested<A> editSink() {
    return withNewSinkLike(java.util.Optional.ofNullable(buildSink()).orElse(null));
  }
  
  public SinkNested<A> editOrNewSink() {
    return withNewSinkLike(java.util.Optional.ofNullable(buildSink()).orElse(new SinkBuilder().build()));
  }
  
  public SinkNested<A> editOrNewSinkLike(Sink item) {
    return withNewSinkLike(java.util.Optional.ofNullable(buildSink()).orElse(item));
  }
  
  public Source buildSource() {
    return this.source != null ? this.source.build() : null;
  }
  
  public A withSource(Source source) {
    this._visitables.remove("source");
    if (source != null) {
        this.source = new SourceBuilder(source);
        this._visitables.get("source").add(this.source);
    } else {
        this.source = null;
        this._visitables.get("source").remove(this.source);
    }
    return (A) this;
  }
  
  public boolean hasSource() {
    return this.source != null;
  }
  
  public SourceNested<A> withNewSource() {
    return new SourceNested(null);
  }
  
  public SourceNested<A> withNewSourceLike(Source item) {
    return new SourceNested(item);
  }
  
  public SourceNested<A> editSource() {
    return withNewSourceLike(java.util.Optional.ofNullable(buildSource()).orElse(null));
  }
  
  public SourceNested<A> editOrNewSource() {
    return withNewSourceLike(java.util.Optional.ofNullable(buildSource()).orElse(new SourceBuilder().build()));
  }
  
  public SourceNested<A> editOrNewSourceLike(Source item) {
    return withNewSourceLike(java.util.Optional.ofNullable(buildSource()).orElse(item));
  }
  
  public A addToSteps(int index,Steps item) {
    if (this.steps == null) {this.steps = new ArrayList<StepsBuilder>();}
    StepsBuilder builder = new StepsBuilder(item);
    if (index < 0 || index >= steps.size()) { _visitables.get("steps").add(builder); steps.add(builder); } else { _visitables.get("steps").add(index, builder); steps.add(index, builder);}
    return (A)this;
  }
  
  public A setToSteps(int index,Steps item) {
    if (this.steps == null) {this.steps = new ArrayList<StepsBuilder>();}
    StepsBuilder builder = new StepsBuilder(item);
    if (index < 0 || index >= steps.size()) { _visitables.get("steps").add(builder); steps.add(builder); } else { _visitables.get("steps").set(index, builder); steps.set(index, builder);}
    return (A)this;
  }
  
  public A addToSteps(org.apache.camel.v1.pipespec.Steps... items) {
    if (this.steps == null) {this.steps = new ArrayList<StepsBuilder>();}
    for (Steps item : items) {StepsBuilder builder = new StepsBuilder(item);_visitables.get("steps").add(builder);this.steps.add(builder);} return (A)this;
  }
  
  public A addAllToSteps(Collection<Steps> items) {
    if (this.steps == null) {this.steps = new ArrayList<StepsBuilder>();}
    for (Steps item : items) {StepsBuilder builder = new StepsBuilder(item);_visitables.get("steps").add(builder);this.steps.add(builder);} return (A)this;
  }
  
  public A removeFromSteps(org.apache.camel.v1.pipespec.Steps... items) {
    if (this.steps == null) return (A)this;
    for (Steps item : items) {StepsBuilder builder = new StepsBuilder(item);_visitables.get("steps").remove(builder); this.steps.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSteps(Collection<Steps> items) {
    if (this.steps == null) return (A)this;
    for (Steps item : items) {StepsBuilder builder = new StepsBuilder(item);_visitables.get("steps").remove(builder); this.steps.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSteps(Predicate<StepsBuilder> predicate) {
    if (steps == null) return (A) this;
    final Iterator<StepsBuilder> each = steps.iterator();
    final List visitables = _visitables.get("steps");
    while (each.hasNext()) {
      StepsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Steps> buildSteps() {
    return this.steps != null ? build(steps) : null;
  }
  
  public Steps buildStep(int index) {
    return this.steps.get(index).build();
  }
  
  public Steps buildFirstStep() {
    return this.steps.get(0).build();
  }
  
  public Steps buildLastStep() {
    return this.steps.get(steps.size() - 1).build();
  }
  
  public Steps buildMatchingStep(Predicate<StepsBuilder> predicate) {
      for (StepsBuilder item : steps) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingStep(Predicate<StepsBuilder> predicate) {
      for (StepsBuilder item : steps) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSteps(List<Steps> steps) {
    if (this.steps != null) {
      this._visitables.get("steps").clear();
    }
    if (steps != null) {
        this.steps = new ArrayList();
        for (Steps item : steps) {
          this.addToSteps(item);
        }
    } else {
      this.steps = null;
    }
    return (A) this;
  }
  
  public A withSteps(org.apache.camel.v1.pipespec.Steps... steps) {
    if (this.steps != null) {
        this.steps.clear();
        _visitables.remove("steps");
    }
    if (steps != null) {
      for (Steps item : steps) {
        this.addToSteps(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSteps() {
    return this.steps != null && !this.steps.isEmpty();
  }
  
  public StepsNested<A> addNewStep() {
    return new StepsNested(-1, null);
  }
  
  public StepsNested<A> addNewStepLike(Steps item) {
    return new StepsNested(-1, item);
  }
  
  public StepsNested<A> setNewStepLike(int index,Steps item) {
    return new StepsNested(index, item);
  }
  
  public StepsNested<A> editStep(int index) {
    if (steps.size() <= index) throw new RuntimeException("Can't edit steps. Index exceeds size.");
    return setNewStepLike(index, buildStep(index));
  }
  
  public StepsNested<A> editFirstStep() {
    if (steps.size() == 0) throw new RuntimeException("Can't edit first steps. The list is empty.");
    return setNewStepLike(0, buildStep(0));
  }
  
  public StepsNested<A> editLastStep() {
    int index = steps.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last steps. The list is empty.");
    return setNewStepLike(index, buildStep(index));
  }
  
  public StepsNested<A> editMatchingStep(Predicate<StepsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<steps.size();i++) { 
    if (predicate.test(steps.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching steps. No match found.");
    return setNewStepLike(index, buildStep(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    PipeSpecFluent that = (PipeSpecFluent) o;
    if (!java.util.Objects.equals(errorHandler, that.errorHandler)) return false;
    if (!java.util.Objects.equals(integration, that.integration)) return false;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    if (!java.util.Objects.equals(serviceAccountName, that.serviceAccountName)) return false;
    if (!java.util.Objects.equals(sink, that.sink)) return false;
    if (!java.util.Objects.equals(source, that.source)) return false;
    if (!java.util.Objects.equals(steps, that.steps)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(errorHandler,  integration,  replicas,  serviceAccountName,  sink,  source,  steps,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (errorHandler != null) { sb.append("errorHandler:"); sb.append(errorHandler + ","); }
    if (integration != null) { sb.append("integration:"); sb.append(integration + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (serviceAccountName != null) { sb.append("serviceAccountName:"); sb.append(serviceAccountName + ","); }
    if (sink != null) { sb.append("sink:"); sb.append(sink + ","); }
    if (source != null) { sb.append("source:"); sb.append(source + ","); }
    if (steps != null && !steps.isEmpty()) { sb.append("steps:"); sb.append(steps); }
    sb.append("}");
    return sb.toString();
  }
  public class ErrorHandlerNested<N> extends ErrorHandlerFluent<ErrorHandlerNested<N>> implements Nested<N>{
    ErrorHandlerNested(ErrorHandler item) {
      this.builder = new ErrorHandlerBuilder(this, item);
    }
    ErrorHandlerBuilder builder;
    
    public N and() {
      return (N) PipeSpecFluent.this.withErrorHandler(builder.build());
    }
    
    public N endPipespecErrorHandler() {
      return and();
    }
    
  
  }
  public class IntegrationNested<N> extends IntegrationFluent<IntegrationNested<N>> implements Nested<N>{
    IntegrationNested(Integration item) {
      this.builder = new IntegrationBuilder(this, item);
    }
    IntegrationBuilder builder;
    
    public N and() {
      return (N) PipeSpecFluent.this.withIntegration(builder.build());
    }
    
    public N endPipespecIntegration() {
      return and();
    }
    
  
  }
  public class SinkNested<N> extends SinkFluent<SinkNested<N>> implements Nested<N>{
    SinkNested(Sink item) {
      this.builder = new SinkBuilder(this, item);
    }
    SinkBuilder builder;
    
    public N and() {
      return (N) PipeSpecFluent.this.withSink(builder.build());
    }
    
    public N endSink() {
      return and();
    }
    
  
  }
  public class SourceNested<N> extends SourceFluent<SourceNested<N>> implements Nested<N>{
    SourceNested(Source item) {
      this.builder = new SourceBuilder(this, item);
    }
    SourceBuilder builder;
    
    public N and() {
      return (N) PipeSpecFluent.this.withSource(builder.build());
    }
    
    public N endSource() {
      return and();
    }
    
  
  }
  public class StepsNested<N> extends StepsFluent<StepsNested<N>> implements Nested<N>{
    StepsNested(int index,Steps item) {
      this.index = index;
      this.builder = new StepsBuilder(this, item);
    }
    StepsBuilder builder;
    int index;
    
    public N and() {
      return (N) PipeSpecFluent.this.setToSteps(index,builder.build());
    }
    
    public N endStep() {
      return and();
    }
    
  
  }

}