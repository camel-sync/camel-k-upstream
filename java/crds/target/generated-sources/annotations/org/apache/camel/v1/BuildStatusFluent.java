package org.apache.camel.v1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.buildstatus.ConditionsFluent;
import java.lang.String;
import org.apache.camel.v1.buildstatus.FailureFluent;
import org.apache.camel.v1.buildstatus.ArtifactsFluent;
import org.apache.camel.v1.buildstatus.Conditions;
import java.util.function.Predicate;
import org.apache.camel.v1.buildstatus.FailureBuilder;
import java.time.ZonedDateTime;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import org.apache.camel.v1.buildstatus.Failure;
import org.apache.camel.v1.buildstatus.ArtifactsBuilder;
import org.apache.camel.v1.buildstatus.ConditionsBuilder;
import org.apache.camel.v1.buildstatus.Artifacts;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class BuildStatusFluent<A extends BuildStatusFluent<A>> extends BaseFluent<A>{
  public BuildStatusFluent() {
  }
  
  public BuildStatusFluent(BuildStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<ArtifactsBuilder> artifacts;
  private String baseImage;
  private ArrayList<ConditionsBuilder> conditions;
  private String digest;
  private String duration;
  private String error;
  private FailureBuilder failure;
  private String image;
  private Long observedGeneration;
  private String phase;
  private String rootImage;
  private ZonedDateTime startedAt;
  
  protected void copyInstance(BuildStatus instance) {
    instance = (instance != null ? instance : new BuildStatus());
    if (instance != null) {
          this.withArtifacts(instance.getArtifacts());
          this.withBaseImage(instance.getBaseImage());
          this.withConditions(instance.getConditions());
          this.withDigest(instance.getDigest());
          this.withDuration(instance.getDuration());
          this.withError(instance.getError());
          this.withFailure(instance.getFailure());
          this.withImage(instance.getImage());
          this.withObservedGeneration(instance.getObservedGeneration());
          this.withPhase(instance.getPhase());
          this.withRootImage(instance.getRootImage());
          this.withStartedAt(instance.getStartedAt());
        }
  }
  
  public A addToArtifacts(int index,Artifacts item) {
    if (this.artifacts == null) {this.artifacts = new ArrayList<ArtifactsBuilder>();}
    ArtifactsBuilder builder = new ArtifactsBuilder(item);
    if (index < 0 || index >= artifacts.size()) { _visitables.get("artifacts").add(builder); artifacts.add(builder); } else { _visitables.get("artifacts").add(index, builder); artifacts.add(index, builder);}
    return (A)this;
  }
  
  public A setToArtifacts(int index,Artifacts item) {
    if (this.artifacts == null) {this.artifacts = new ArrayList<ArtifactsBuilder>();}
    ArtifactsBuilder builder = new ArtifactsBuilder(item);
    if (index < 0 || index >= artifacts.size()) { _visitables.get("artifacts").add(builder); artifacts.add(builder); } else { _visitables.get("artifacts").set(index, builder); artifacts.set(index, builder);}
    return (A)this;
  }
  
  public A addToArtifacts(org.apache.camel.v1.buildstatus.Artifacts... items) {
    if (this.artifacts == null) {this.artifacts = new ArrayList<ArtifactsBuilder>();}
    for (Artifacts item : items) {ArtifactsBuilder builder = new ArtifactsBuilder(item);_visitables.get("artifacts").add(builder);this.artifacts.add(builder);} return (A)this;
  }
  
  public A addAllToArtifacts(Collection<Artifacts> items) {
    if (this.artifacts == null) {this.artifacts = new ArrayList<ArtifactsBuilder>();}
    for (Artifacts item : items) {ArtifactsBuilder builder = new ArtifactsBuilder(item);_visitables.get("artifacts").add(builder);this.artifacts.add(builder);} return (A)this;
  }
  
  public A removeFromArtifacts(org.apache.camel.v1.buildstatus.Artifacts... items) {
    if (this.artifacts == null) return (A)this;
    for (Artifacts item : items) {ArtifactsBuilder builder = new ArtifactsBuilder(item);_visitables.get("artifacts").remove(builder); this.artifacts.remove(builder);} return (A)this;
  }
  
  public A removeAllFromArtifacts(Collection<Artifacts> items) {
    if (this.artifacts == null) return (A)this;
    for (Artifacts item : items) {ArtifactsBuilder builder = new ArtifactsBuilder(item);_visitables.get("artifacts").remove(builder); this.artifacts.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromArtifacts(Predicate<ArtifactsBuilder> predicate) {
    if (artifacts == null) return (A) this;
    final Iterator<ArtifactsBuilder> each = artifacts.iterator();
    final List visitables = _visitables.get("artifacts");
    while (each.hasNext()) {
      ArtifactsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Artifacts> buildArtifacts() {
    return this.artifacts != null ? build(artifacts) : null;
  }
  
  public Artifacts buildArtifact(int index) {
    return this.artifacts.get(index).build();
  }
  
  public Artifacts buildFirstArtifact() {
    return this.artifacts.get(0).build();
  }
  
  public Artifacts buildLastArtifact() {
    return this.artifacts.get(artifacts.size() - 1).build();
  }
  
  public Artifacts buildMatchingArtifact(Predicate<ArtifactsBuilder> predicate) {
      for (ArtifactsBuilder item : artifacts) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingArtifact(Predicate<ArtifactsBuilder> predicate) {
      for (ArtifactsBuilder item : artifacts) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withArtifacts(List<Artifacts> artifacts) {
    if (this.artifacts != null) {
      this._visitables.get("artifacts").clear();
    }
    if (artifacts != null) {
        this.artifacts = new ArrayList();
        for (Artifacts item : artifacts) {
          this.addToArtifacts(item);
        }
    } else {
      this.artifacts = null;
    }
    return (A) this;
  }
  
  public A withArtifacts(org.apache.camel.v1.buildstatus.Artifacts... artifacts) {
    if (this.artifacts != null) {
        this.artifacts.clear();
        _visitables.remove("artifacts");
    }
    if (artifacts != null) {
      for (Artifacts item : artifacts) {
        this.addToArtifacts(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasArtifacts() {
    return this.artifacts != null && !this.artifacts.isEmpty();
  }
  
  public ArtifactsNested<A> addNewArtifact() {
    return new ArtifactsNested(-1, null);
  }
  
  public ArtifactsNested<A> addNewArtifactLike(Artifacts item) {
    return new ArtifactsNested(-1, item);
  }
  
  public ArtifactsNested<A> setNewArtifactLike(int index,Artifacts item) {
    return new ArtifactsNested(index, item);
  }
  
  public ArtifactsNested<A> editArtifact(int index) {
    if (artifacts.size() <= index) throw new RuntimeException("Can't edit artifacts. Index exceeds size.");
    return setNewArtifactLike(index, buildArtifact(index));
  }
  
  public ArtifactsNested<A> editFirstArtifact() {
    if (artifacts.size() == 0) throw new RuntimeException("Can't edit first artifacts. The list is empty.");
    return setNewArtifactLike(0, buildArtifact(0));
  }
  
  public ArtifactsNested<A> editLastArtifact() {
    int index = artifacts.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last artifacts. The list is empty.");
    return setNewArtifactLike(index, buildArtifact(index));
  }
  
  public ArtifactsNested<A> editMatchingArtifact(Predicate<ArtifactsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<artifacts.size();i++) { 
    if (predicate.test(artifacts.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching artifacts. No match found.");
    return setNewArtifactLike(index, buildArtifact(index));
  }
  
  public String getBaseImage() {
    return this.baseImage;
  }
  
  public A withBaseImage(String baseImage) {
    this.baseImage = baseImage;
    return (A) this;
  }
  
  public boolean hasBaseImage() {
    return this.baseImage != null;
  }
  
  public A addToConditions(int index,Conditions item) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    ConditionsBuilder builder = new ConditionsBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,Conditions item) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    ConditionsBuilder builder = new ConditionsBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(org.apache.camel.v1.buildstatus.Conditions... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<Conditions> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(org.apache.camel.v1.buildstatus.Conditions... items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<Conditions> items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<ConditionsBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<ConditionsBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      ConditionsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Conditions> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public Conditions buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public Conditions buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public Conditions buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public Conditions buildMatchingCondition(Predicate<ConditionsBuilder> predicate) {
      for (ConditionsBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<ConditionsBuilder> predicate) {
      for (ConditionsBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<Conditions> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (Conditions item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(org.apache.camel.v1.buildstatus.Conditions... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (Conditions item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !this.conditions.isEmpty();
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(Conditions item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,Conditions item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<ConditionsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public String getDigest() {
    return this.digest;
  }
  
  public A withDigest(String digest) {
    this.digest = digest;
    return (A) this;
  }
  
  public boolean hasDigest() {
    return this.digest != null;
  }
  
  public String getDuration() {
    return this.duration;
  }
  
  public A withDuration(String duration) {
    this.duration = duration;
    return (A) this;
  }
  
  public boolean hasDuration() {
    return this.duration != null;
  }
  
  public String getError() {
    return this.error;
  }
  
  public A withError(String error) {
    this.error = error;
    return (A) this;
  }
  
  public boolean hasError() {
    return this.error != null;
  }
  
  public Failure buildFailure() {
    return this.failure != null ? this.failure.build() : null;
  }
  
  public A withFailure(Failure failure) {
    this._visitables.remove("failure");
    if (failure != null) {
        this.failure = new FailureBuilder(failure);
        this._visitables.get("failure").add(this.failure);
    } else {
        this.failure = null;
        this._visitables.get("failure").remove(this.failure);
    }
    return (A) this;
  }
  
  public boolean hasFailure() {
    return this.failure != null;
  }
  
  public FailureNested<A> withNewFailure() {
    return new FailureNested(null);
  }
  
  public FailureNested<A> withNewFailureLike(Failure item) {
    return new FailureNested(item);
  }
  
  public FailureNested<A> editFailure() {
    return withNewFailureLike(java.util.Optional.ofNullable(buildFailure()).orElse(null));
  }
  
  public FailureNested<A> editOrNewFailure() {
    return withNewFailureLike(java.util.Optional.ofNullable(buildFailure()).orElse(new FailureBuilder().build()));
  }
  
  public FailureNested<A> editOrNewFailureLike(Failure item) {
    return withNewFailureLike(java.util.Optional.ofNullable(buildFailure()).orElse(item));
  }
  
  public String getImage() {
    return this.image;
  }
  
  public A withImage(String image) {
    this.image = image;
    return (A) this;
  }
  
  public boolean hasImage() {
    return this.image != null;
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  
  public boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  
  public String getPhase() {
    return this.phase;
  }
  
  public A withPhase(String phase) {
    this.phase = phase;
    return (A) this;
  }
  
  public boolean hasPhase() {
    return this.phase != null;
  }
  
  public String getRootImage() {
    return this.rootImage;
  }
  
  public A withRootImage(String rootImage) {
    this.rootImage = rootImage;
    return (A) this;
  }
  
  public boolean hasRootImage() {
    return this.rootImage != null;
  }
  
  public ZonedDateTime getStartedAt() {
    return this.startedAt;
  }
  
  public A withStartedAt(ZonedDateTime startedAt) {
    this.startedAt = startedAt;
    return (A) this;
  }
  
  public boolean hasStartedAt() {
    return this.startedAt != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    BuildStatusFluent that = (BuildStatusFluent) o;
    if (!java.util.Objects.equals(artifacts, that.artifacts)) return false;
    if (!java.util.Objects.equals(baseImage, that.baseImage)) return false;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(digest, that.digest)) return false;
    if (!java.util.Objects.equals(duration, that.duration)) return false;
    if (!java.util.Objects.equals(error, that.error)) return false;
    if (!java.util.Objects.equals(failure, that.failure)) return false;
    if (!java.util.Objects.equals(image, that.image)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    if (!java.util.Objects.equals(phase, that.phase)) return false;
    if (!java.util.Objects.equals(rootImage, that.rootImage)) return false;
    if (!java.util.Objects.equals(startedAt, that.startedAt)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(artifacts,  baseImage,  conditions,  digest,  duration,  error,  failure,  image,  observedGeneration,  phase,  rootImage,  startedAt,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (artifacts != null && !artifacts.isEmpty()) { sb.append("artifacts:"); sb.append(artifacts + ","); }
    if (baseImage != null) { sb.append("baseImage:"); sb.append(baseImage + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (digest != null) { sb.append("digest:"); sb.append(digest + ","); }
    if (duration != null) { sb.append("duration:"); sb.append(duration + ","); }
    if (error != null) { sb.append("error:"); sb.append(error + ","); }
    if (failure != null) { sb.append("failure:"); sb.append(failure + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase + ","); }
    if (rootImage != null) { sb.append("rootImage:"); sb.append(rootImage + ","); }
    if (startedAt != null) { sb.append("startedAt:"); sb.append(startedAt); }
    sb.append("}");
    return sb.toString();
  }
  public class ArtifactsNested<N> extends ArtifactsFluent<ArtifactsNested<N>> implements Nested<N>{
    ArtifactsNested(int index,Artifacts item) {
      this.index = index;
      this.builder = new ArtifactsBuilder(this, item);
    }
    ArtifactsBuilder builder;
    int index;
    
    public N and() {
      return (N) BuildStatusFluent.this.setToArtifacts(index,builder.build());
    }
    
    public N endArtifact() {
      return and();
    }
    
  
  }
  public class ConditionsNested<N> extends ConditionsFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,Conditions item) {
      this.index = index;
      this.builder = new ConditionsBuilder(this, item);
    }
    ConditionsBuilder builder;
    int index;
    
    public N and() {
      return (N) BuildStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }
  public class FailureNested<N> extends FailureFluent<FailureNested<N>> implements Nested<N>{
    FailureNested(Failure item) {
      this.builder = new FailureBuilder(this, item);
    }
    FailureBuilder builder;
    
    public N and() {
      return (N) BuildStatusFluent.this.withFailure(builder.build());
    }
    
    public N endFailure() {
      return and();
    }
    
  
  }

}