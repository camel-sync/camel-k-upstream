package org.apache.camel.v1.camelcatalogspec;

import org.apache.camel.v1.camelcatalogspec.artifacts.DependenciesBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.camelcatalogspec.artifacts.Exclusions;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import org.apache.camel.v1.camelcatalogspec.artifacts.SchemesBuilder;
import org.apache.camel.v1.camelcatalogspec.artifacts.DependenciesFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import org.apache.camel.v1.camelcatalogspec.artifacts.SchemesFluent;
import java.util.List;
import org.apache.camel.v1.camelcatalogspec.artifacts.Dependencies;
import org.apache.camel.v1.camelcatalogspec.artifacts.ExclusionsBuilder;
import org.apache.camel.v1.camelcatalogspec.artifacts.Schemes;
import java.util.Collection;
import org.apache.camel.v1.camelcatalogspec.artifacts.ExclusionsFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ArtifactsFluent<A extends ArtifactsFluent<A>> extends BaseFluent<A>{
  public ArtifactsFluent() {
  }
  
  public ArtifactsFluent(Artifacts instance) {
    this.copyInstance(instance);
  }
  private String artifactId;
  private List<String> dataformats;
  private ArrayList<DependenciesBuilder> dependencies;
  private ArrayList<ExclusionsBuilder> exclusions;
  private String groupId;
  private List<String> javaTypes;
  private List<String> languages;
  private ArrayList<SchemesBuilder> schemes;
  private String version;
  
  protected void copyInstance(Artifacts instance) {
    instance = (instance != null ? instance : new Artifacts());
    if (instance != null) {
          this.withArtifactId(instance.getArtifactId());
          this.withDataformats(instance.getDataformats());
          this.withDependencies(instance.getDependencies());
          this.withExclusions(instance.getExclusions());
          this.withGroupId(instance.getGroupId());
          this.withJavaTypes(instance.getJavaTypes());
          this.withLanguages(instance.getLanguages());
          this.withSchemes(instance.getSchemes());
          this.withVersion(instance.getVersion());
        }
  }
  
  public String getArtifactId() {
    return this.artifactId;
  }
  
  public A withArtifactId(String artifactId) {
    this.artifactId = artifactId;
    return (A) this;
  }
  
  public boolean hasArtifactId() {
    return this.artifactId != null;
  }
  
  public A addToDataformats(int index,String item) {
    if (this.dataformats == null) {this.dataformats = new ArrayList<String>();}
    this.dataformats.add(index, item);
    return (A)this;
  }
  
  public A setToDataformats(int index,String item) {
    if (this.dataformats == null) {this.dataformats = new ArrayList<String>();}
    this.dataformats.set(index, item); return (A)this;
  }
  
  public A addToDataformats(java.lang.String... items) {
    if (this.dataformats == null) {this.dataformats = new ArrayList<String>();}
    for (String item : items) {this.dataformats.add(item);} return (A)this;
  }
  
  public A addAllToDataformats(Collection<String> items) {
    if (this.dataformats == null) {this.dataformats = new ArrayList<String>();}
    for (String item : items) {this.dataformats.add(item);} return (A)this;
  }
  
  public A removeFromDataformats(java.lang.String... items) {
    if (this.dataformats == null) return (A)this;
    for (String item : items) { this.dataformats.remove(item);} return (A)this;
  }
  
  public A removeAllFromDataformats(Collection<String> items) {
    if (this.dataformats == null) return (A)this;
    for (String item : items) { this.dataformats.remove(item);} return (A)this;
  }
  
  public List<String> getDataformats() {
    return this.dataformats;
  }
  
  public String getDataformat(int index) {
    return this.dataformats.get(index);
  }
  
  public String getFirstDataformat() {
    return this.dataformats.get(0);
  }
  
  public String getLastDataformat() {
    return this.dataformats.get(dataformats.size() - 1);
  }
  
  public String getMatchingDataformat(Predicate<String> predicate) {
      for (String item : dataformats) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingDataformat(Predicate<String> predicate) {
      for (String item : dataformats) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDataformats(List<String> dataformats) {
    if (dataformats != null) {
        this.dataformats = new ArrayList();
        for (String item : dataformats) {
          this.addToDataformats(item);
        }
    } else {
      this.dataformats = null;
    }
    return (A) this;
  }
  
  public A withDataformats(java.lang.String... dataformats) {
    if (this.dataformats != null) {
        this.dataformats.clear();
        _visitables.remove("dataformats");
    }
    if (dataformats != null) {
      for (String item : dataformats) {
        this.addToDataformats(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDataformats() {
    return this.dataformats != null && !this.dataformats.isEmpty();
  }
  
  public A addToDependencies(int index,Dependencies item) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    DependenciesBuilder builder = new DependenciesBuilder(item);
    if (index < 0 || index >= dependencies.size()) { _visitables.get("dependencies").add(builder); dependencies.add(builder); } else { _visitables.get("dependencies").add(index, builder); dependencies.add(index, builder);}
    return (A)this;
  }
  
  public A setToDependencies(int index,Dependencies item) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    DependenciesBuilder builder = new DependenciesBuilder(item);
    if (index < 0 || index >= dependencies.size()) { _visitables.get("dependencies").add(builder); dependencies.add(builder); } else { _visitables.get("dependencies").set(index, builder); dependencies.set(index, builder);}
    return (A)this;
  }
  
  public A addToDependencies(org.apache.camel.v1.camelcatalogspec.artifacts.Dependencies... items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").add(builder);this.dependencies.add(builder);} return (A)this;
  }
  
  public A addAllToArtifactsDependencies(Collection<Dependencies> items) {
    if (this.dependencies == null) {this.dependencies = new ArrayList<DependenciesBuilder>();}
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").add(builder);this.dependencies.add(builder);} return (A)this;
  }
  
  public A removeFromDependencies(org.apache.camel.v1.camelcatalogspec.artifacts.Dependencies... items) {
    if (this.dependencies == null) return (A)this;
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").remove(builder); this.dependencies.remove(builder);} return (A)this;
  }
  
  public A removeAllFromArtifactsDependencies(Collection<Dependencies> items) {
    if (this.dependencies == null) return (A)this;
    for (Dependencies item : items) {DependenciesBuilder builder = new DependenciesBuilder(item);_visitables.get("dependencies").remove(builder); this.dependencies.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromArtifactsDependencies(Predicate<DependenciesBuilder> predicate) {
    if (dependencies == null) return (A) this;
    final Iterator<DependenciesBuilder> each = dependencies.iterator();
    final List visitables = _visitables.get("dependencies");
    while (each.hasNext()) {
      DependenciesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Dependencies> buildDependencies() {
    return this.dependencies != null ? build(dependencies) : null;
  }
  
  public Dependencies buildDependency(int index) {
    return this.dependencies.get(index).build();
  }
  
  public Dependencies buildFirstDependency() {
    return this.dependencies.get(0).build();
  }
  
  public Dependencies buildLastDependency() {
    return this.dependencies.get(dependencies.size() - 1).build();
  }
  
  public Dependencies buildMatchingDependency(Predicate<DependenciesBuilder> predicate) {
      for (DependenciesBuilder item : dependencies) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingDependency(Predicate<DependenciesBuilder> predicate) {
      for (DependenciesBuilder item : dependencies) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDependencies(List<Dependencies> dependencies) {
    if (this.dependencies != null) {
      this._visitables.get("dependencies").clear();
    }
    if (dependencies != null) {
        this.dependencies = new ArrayList();
        for (Dependencies item : dependencies) {
          this.addToDependencies(item);
        }
    } else {
      this.dependencies = null;
    }
    return (A) this;
  }
  
  public A withDependencies(org.apache.camel.v1.camelcatalogspec.artifacts.Dependencies... dependencies) {
    if (this.dependencies != null) {
        this.dependencies.clear();
        _visitables.remove("dependencies");
    }
    if (dependencies != null) {
      for (Dependencies item : dependencies) {
        this.addToDependencies(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDependencies() {
    return this.dependencies != null && !this.dependencies.isEmpty();
  }
  
  public DependenciesNested<A> addNewDependency() {
    return new DependenciesNested(-1, null);
  }
  
  public DependenciesNested<A> addNewDependencyLike(Dependencies item) {
    return new DependenciesNested(-1, item);
  }
  
  public DependenciesNested<A> setNewDependencyLike(int index,Dependencies item) {
    return new DependenciesNested(index, item);
  }
  
  public DependenciesNested<A> editDependency(int index) {
    if (dependencies.size() <= index) throw new RuntimeException("Can't edit dependencies. Index exceeds size.");
    return setNewDependencyLike(index, buildDependency(index));
  }
  
  public DependenciesNested<A> editFirstDependency() {
    if (dependencies.size() == 0) throw new RuntimeException("Can't edit first dependencies. The list is empty.");
    return setNewDependencyLike(0, buildDependency(0));
  }
  
  public DependenciesNested<A> editLastDependency() {
    int index = dependencies.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last dependencies. The list is empty.");
    return setNewDependencyLike(index, buildDependency(index));
  }
  
  public DependenciesNested<A> editMatchingDependency(Predicate<DependenciesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<dependencies.size();i++) { 
    if (predicate.test(dependencies.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching dependencies. No match found.");
    return setNewDependencyLike(index, buildDependency(index));
  }
  
  public A addToExclusions(int index,Exclusions item) {
    if (this.exclusions == null) {this.exclusions = new ArrayList<ExclusionsBuilder>();}
    ExclusionsBuilder builder = new ExclusionsBuilder(item);
    if (index < 0 || index >= exclusions.size()) { _visitables.get("exclusions").add(builder); exclusions.add(builder); } else { _visitables.get("exclusions").add(index, builder); exclusions.add(index, builder);}
    return (A)this;
  }
  
  public A setToExclusions(int index,Exclusions item) {
    if (this.exclusions == null) {this.exclusions = new ArrayList<ExclusionsBuilder>();}
    ExclusionsBuilder builder = new ExclusionsBuilder(item);
    if (index < 0 || index >= exclusions.size()) { _visitables.get("exclusions").add(builder); exclusions.add(builder); } else { _visitables.get("exclusions").set(index, builder); exclusions.set(index, builder);}
    return (A)this;
  }
  
  public A addToExclusions(org.apache.camel.v1.camelcatalogspec.artifacts.Exclusions... items) {
    if (this.exclusions == null) {this.exclusions = new ArrayList<ExclusionsBuilder>();}
    for (Exclusions item : items) {ExclusionsBuilder builder = new ExclusionsBuilder(item);_visitables.get("exclusions").add(builder);this.exclusions.add(builder);} return (A)this;
  }
  
  public A addAllToExclusions(Collection<Exclusions> items) {
    if (this.exclusions == null) {this.exclusions = new ArrayList<ExclusionsBuilder>();}
    for (Exclusions item : items) {ExclusionsBuilder builder = new ExclusionsBuilder(item);_visitables.get("exclusions").add(builder);this.exclusions.add(builder);} return (A)this;
  }
  
  public A removeFromExclusions(org.apache.camel.v1.camelcatalogspec.artifacts.Exclusions... items) {
    if (this.exclusions == null) return (A)this;
    for (Exclusions item : items) {ExclusionsBuilder builder = new ExclusionsBuilder(item);_visitables.get("exclusions").remove(builder); this.exclusions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromExclusions(Collection<Exclusions> items) {
    if (this.exclusions == null) return (A)this;
    for (Exclusions item : items) {ExclusionsBuilder builder = new ExclusionsBuilder(item);_visitables.get("exclusions").remove(builder); this.exclusions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromExclusions(Predicate<ExclusionsBuilder> predicate) {
    if (exclusions == null) return (A) this;
    final Iterator<ExclusionsBuilder> each = exclusions.iterator();
    final List visitables = _visitables.get("exclusions");
    while (each.hasNext()) {
      ExclusionsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Exclusions> buildExclusions() {
    return this.exclusions != null ? build(exclusions) : null;
  }
  
  public Exclusions buildExclusion(int index) {
    return this.exclusions.get(index).build();
  }
  
  public Exclusions buildFirstExclusion() {
    return this.exclusions.get(0).build();
  }
  
  public Exclusions buildLastExclusion() {
    return this.exclusions.get(exclusions.size() - 1).build();
  }
  
  public Exclusions buildMatchingExclusion(Predicate<ExclusionsBuilder> predicate) {
      for (ExclusionsBuilder item : exclusions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingExclusion(Predicate<ExclusionsBuilder> predicate) {
      for (ExclusionsBuilder item : exclusions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withExclusions(List<Exclusions> exclusions) {
    if (this.exclusions != null) {
      this._visitables.get("exclusions").clear();
    }
    if (exclusions != null) {
        this.exclusions = new ArrayList();
        for (Exclusions item : exclusions) {
          this.addToExclusions(item);
        }
    } else {
      this.exclusions = null;
    }
    return (A) this;
  }
  
  public A withExclusions(org.apache.camel.v1.camelcatalogspec.artifacts.Exclusions... exclusions) {
    if (this.exclusions != null) {
        this.exclusions.clear();
        _visitables.remove("exclusions");
    }
    if (exclusions != null) {
      for (Exclusions item : exclusions) {
        this.addToExclusions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasExclusions() {
    return this.exclusions != null && !this.exclusions.isEmpty();
  }
  
  public ExclusionsNested<A> addNewExclusion() {
    return new ExclusionsNested(-1, null);
  }
  
  public ExclusionsNested<A> addNewExclusionLike(Exclusions item) {
    return new ExclusionsNested(-1, item);
  }
  
  public ExclusionsNested<A> setNewExclusionLike(int index,Exclusions item) {
    return new ExclusionsNested(index, item);
  }
  
  public ExclusionsNested<A> editExclusion(int index) {
    if (exclusions.size() <= index) throw new RuntimeException("Can't edit exclusions. Index exceeds size.");
    return setNewExclusionLike(index, buildExclusion(index));
  }
  
  public ExclusionsNested<A> editFirstExclusion() {
    if (exclusions.size() == 0) throw new RuntimeException("Can't edit first exclusions. The list is empty.");
    return setNewExclusionLike(0, buildExclusion(0));
  }
  
  public ExclusionsNested<A> editLastExclusion() {
    int index = exclusions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last exclusions. The list is empty.");
    return setNewExclusionLike(index, buildExclusion(index));
  }
  
  public ExclusionsNested<A> editMatchingExclusion(Predicate<ExclusionsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<exclusions.size();i++) { 
    if (predicate.test(exclusions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching exclusions. No match found.");
    return setNewExclusionLike(index, buildExclusion(index));
  }
  
  public String getGroupId() {
    return this.groupId;
  }
  
  public A withGroupId(String groupId) {
    this.groupId = groupId;
    return (A) this;
  }
  
  public boolean hasGroupId() {
    return this.groupId != null;
  }
  
  public A addToJavaTypes(int index,String item) {
    if (this.javaTypes == null) {this.javaTypes = new ArrayList<String>();}
    this.javaTypes.add(index, item);
    return (A)this;
  }
  
  public A setToJavaTypes(int index,String item) {
    if (this.javaTypes == null) {this.javaTypes = new ArrayList<String>();}
    this.javaTypes.set(index, item); return (A)this;
  }
  
  public A addToJavaTypes(java.lang.String... items) {
    if (this.javaTypes == null) {this.javaTypes = new ArrayList<String>();}
    for (String item : items) {this.javaTypes.add(item);} return (A)this;
  }
  
  public A addAllToJavaTypes(Collection<String> items) {
    if (this.javaTypes == null) {this.javaTypes = new ArrayList<String>();}
    for (String item : items) {this.javaTypes.add(item);} return (A)this;
  }
  
  public A removeFromJavaTypes(java.lang.String... items) {
    if (this.javaTypes == null) return (A)this;
    for (String item : items) { this.javaTypes.remove(item);} return (A)this;
  }
  
  public A removeAllFromJavaTypes(Collection<String> items) {
    if (this.javaTypes == null) return (A)this;
    for (String item : items) { this.javaTypes.remove(item);} return (A)this;
  }
  
  public List<String> getJavaTypes() {
    return this.javaTypes;
  }
  
  public String getJavaType(int index) {
    return this.javaTypes.get(index);
  }
  
  public String getFirstJavaType() {
    return this.javaTypes.get(0);
  }
  
  public String getLastJavaType() {
    return this.javaTypes.get(javaTypes.size() - 1);
  }
  
  public String getMatchingJavaType(Predicate<String> predicate) {
      for (String item : javaTypes) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingJavaType(Predicate<String> predicate) {
      for (String item : javaTypes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withJavaTypes(List<String> javaTypes) {
    if (javaTypes != null) {
        this.javaTypes = new ArrayList();
        for (String item : javaTypes) {
          this.addToJavaTypes(item);
        }
    } else {
      this.javaTypes = null;
    }
    return (A) this;
  }
  
  public A withJavaTypes(java.lang.String... javaTypes) {
    if (this.javaTypes != null) {
        this.javaTypes.clear();
        _visitables.remove("javaTypes");
    }
    if (javaTypes != null) {
      for (String item : javaTypes) {
        this.addToJavaTypes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasJavaTypes() {
    return this.javaTypes != null && !this.javaTypes.isEmpty();
  }
  
  public A addToLanguages(int index,String item) {
    if (this.languages == null) {this.languages = new ArrayList<String>();}
    this.languages.add(index, item);
    return (A)this;
  }
  
  public A setToLanguages(int index,String item) {
    if (this.languages == null) {this.languages = new ArrayList<String>();}
    this.languages.set(index, item); return (A)this;
  }
  
  public A addToLanguages(java.lang.String... items) {
    if (this.languages == null) {this.languages = new ArrayList<String>();}
    for (String item : items) {this.languages.add(item);} return (A)this;
  }
  
  public A addAllToLanguages(Collection<String> items) {
    if (this.languages == null) {this.languages = new ArrayList<String>();}
    for (String item : items) {this.languages.add(item);} return (A)this;
  }
  
  public A removeFromLanguages(java.lang.String... items) {
    if (this.languages == null) return (A)this;
    for (String item : items) { this.languages.remove(item);} return (A)this;
  }
  
  public A removeAllFromLanguages(Collection<String> items) {
    if (this.languages == null) return (A)this;
    for (String item : items) { this.languages.remove(item);} return (A)this;
  }
  
  public List<String> getLanguages() {
    return this.languages;
  }
  
  public String getLanguage(int index) {
    return this.languages.get(index);
  }
  
  public String getFirstLanguage() {
    return this.languages.get(0);
  }
  
  public String getLastLanguage() {
    return this.languages.get(languages.size() - 1);
  }
  
  public String getMatchingLanguage(Predicate<String> predicate) {
      for (String item : languages) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingLanguage(Predicate<String> predicate) {
      for (String item : languages) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withLanguages(List<String> languages) {
    if (languages != null) {
        this.languages = new ArrayList();
        for (String item : languages) {
          this.addToLanguages(item);
        }
    } else {
      this.languages = null;
    }
    return (A) this;
  }
  
  public A withLanguages(java.lang.String... languages) {
    if (this.languages != null) {
        this.languages.clear();
        _visitables.remove("languages");
    }
    if (languages != null) {
      for (String item : languages) {
        this.addToLanguages(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasLanguages() {
    return this.languages != null && !this.languages.isEmpty();
  }
  
  public A addToSchemes(int index,Schemes item) {
    if (this.schemes == null) {this.schemes = new ArrayList<SchemesBuilder>();}
    SchemesBuilder builder = new SchemesBuilder(item);
    if (index < 0 || index >= schemes.size()) { _visitables.get("schemes").add(builder); schemes.add(builder); } else { _visitables.get("schemes").add(index, builder); schemes.add(index, builder);}
    return (A)this;
  }
  
  public A setToSchemes(int index,Schemes item) {
    if (this.schemes == null) {this.schemes = new ArrayList<SchemesBuilder>();}
    SchemesBuilder builder = new SchemesBuilder(item);
    if (index < 0 || index >= schemes.size()) { _visitables.get("schemes").add(builder); schemes.add(builder); } else { _visitables.get("schemes").set(index, builder); schemes.set(index, builder);}
    return (A)this;
  }
  
  public A addToSchemes(org.apache.camel.v1.camelcatalogspec.artifacts.Schemes... items) {
    if (this.schemes == null) {this.schemes = new ArrayList<SchemesBuilder>();}
    for (Schemes item : items) {SchemesBuilder builder = new SchemesBuilder(item);_visitables.get("schemes").add(builder);this.schemes.add(builder);} return (A)this;
  }
  
  public A addAllToSchemes(Collection<Schemes> items) {
    if (this.schemes == null) {this.schemes = new ArrayList<SchemesBuilder>();}
    for (Schemes item : items) {SchemesBuilder builder = new SchemesBuilder(item);_visitables.get("schemes").add(builder);this.schemes.add(builder);} return (A)this;
  }
  
  public A removeFromSchemes(org.apache.camel.v1.camelcatalogspec.artifacts.Schemes... items) {
    if (this.schemes == null) return (A)this;
    for (Schemes item : items) {SchemesBuilder builder = new SchemesBuilder(item);_visitables.get("schemes").remove(builder); this.schemes.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSchemes(Collection<Schemes> items) {
    if (this.schemes == null) return (A)this;
    for (Schemes item : items) {SchemesBuilder builder = new SchemesBuilder(item);_visitables.get("schemes").remove(builder); this.schemes.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSchemes(Predicate<SchemesBuilder> predicate) {
    if (schemes == null) return (A) this;
    final Iterator<SchemesBuilder> each = schemes.iterator();
    final List visitables = _visitables.get("schemes");
    while (each.hasNext()) {
      SchemesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Schemes> buildSchemes() {
    return this.schemes != null ? build(schemes) : null;
  }
  
  public Schemes buildScheme(int index) {
    return this.schemes.get(index).build();
  }
  
  public Schemes buildFirstScheme() {
    return this.schemes.get(0).build();
  }
  
  public Schemes buildLastScheme() {
    return this.schemes.get(schemes.size() - 1).build();
  }
  
  public Schemes buildMatchingScheme(Predicate<SchemesBuilder> predicate) {
      for (SchemesBuilder item : schemes) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingScheme(Predicate<SchemesBuilder> predicate) {
      for (SchemesBuilder item : schemes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSchemes(List<Schemes> schemes) {
    if (this.schemes != null) {
      this._visitables.get("schemes").clear();
    }
    if (schemes != null) {
        this.schemes = new ArrayList();
        for (Schemes item : schemes) {
          this.addToSchemes(item);
        }
    } else {
      this.schemes = null;
    }
    return (A) this;
  }
  
  public A withSchemes(org.apache.camel.v1.camelcatalogspec.artifacts.Schemes... schemes) {
    if (this.schemes != null) {
        this.schemes.clear();
        _visitables.remove("schemes");
    }
    if (schemes != null) {
      for (Schemes item : schemes) {
        this.addToSchemes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSchemes() {
    return this.schemes != null && !this.schemes.isEmpty();
  }
  
  public SchemesNested<A> addNewScheme() {
    return new SchemesNested(-1, null);
  }
  
  public SchemesNested<A> addNewSchemeLike(Schemes item) {
    return new SchemesNested(-1, item);
  }
  
  public SchemesNested<A> setNewSchemeLike(int index,Schemes item) {
    return new SchemesNested(index, item);
  }
  
  public SchemesNested<A> editScheme(int index) {
    if (schemes.size() <= index) throw new RuntimeException("Can't edit schemes. Index exceeds size.");
    return setNewSchemeLike(index, buildScheme(index));
  }
  
  public SchemesNested<A> editFirstScheme() {
    if (schemes.size() == 0) throw new RuntimeException("Can't edit first schemes. The list is empty.");
    return setNewSchemeLike(0, buildScheme(0));
  }
  
  public SchemesNested<A> editLastScheme() {
    int index = schemes.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last schemes. The list is empty.");
    return setNewSchemeLike(index, buildScheme(index));
  }
  
  public SchemesNested<A> editMatchingScheme(Predicate<SchemesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<schemes.size();i++) { 
    if (predicate.test(schemes.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching schemes. No match found.");
    return setNewSchemeLike(index, buildScheme(index));
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    ArtifactsFluent that = (ArtifactsFluent) o;
    if (!java.util.Objects.equals(artifactId, that.artifactId)) return false;
    if (!java.util.Objects.equals(dataformats, that.dataformats)) return false;
    if (!java.util.Objects.equals(dependencies, that.dependencies)) return false;
    if (!java.util.Objects.equals(exclusions, that.exclusions)) return false;
    if (!java.util.Objects.equals(groupId, that.groupId)) return false;
    if (!java.util.Objects.equals(javaTypes, that.javaTypes)) return false;
    if (!java.util.Objects.equals(languages, that.languages)) return false;
    if (!java.util.Objects.equals(schemes, that.schemes)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(artifactId,  dataformats,  dependencies,  exclusions,  groupId,  javaTypes,  languages,  schemes,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (artifactId != null) { sb.append("artifactId:"); sb.append(artifactId + ","); }
    if (dataformats != null && !dataformats.isEmpty()) { sb.append("dataformats:"); sb.append(dataformats + ","); }
    if (dependencies != null && !dependencies.isEmpty()) { sb.append("dependencies:"); sb.append(dependencies + ","); }
    if (exclusions != null && !exclusions.isEmpty()) { sb.append("exclusions:"); sb.append(exclusions + ","); }
    if (groupId != null) { sb.append("groupId:"); sb.append(groupId + ","); }
    if (javaTypes != null && !javaTypes.isEmpty()) { sb.append("javaTypes:"); sb.append(javaTypes + ","); }
    if (languages != null && !languages.isEmpty()) { sb.append("languages:"); sb.append(languages + ","); }
    if (schemes != null && !schemes.isEmpty()) { sb.append("schemes:"); sb.append(schemes + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  public class DependenciesNested<N> extends DependenciesFluent<DependenciesNested<N>> implements Nested<N>{
    DependenciesNested(int index,Dependencies item) {
      this.index = index;
      this.builder = new DependenciesBuilder(this, item);
    }
    DependenciesBuilder builder;
    int index;
    
    public N and() {
      return (N) ArtifactsFluent.this.setToDependencies(index,builder.build());
    }
    
    public N endArtifactsDependency() {
      return and();
    }
    
  
  }
  public class ExclusionsNested<N> extends ExclusionsFluent<ExclusionsNested<N>> implements Nested<N>{
    ExclusionsNested(int index,Exclusions item) {
      this.index = index;
      this.builder = new ExclusionsBuilder(this, item);
    }
    ExclusionsBuilder builder;
    int index;
    
    public N and() {
      return (N) ArtifactsFluent.this.setToExclusions(index,builder.build());
    }
    
    public N endExclusion() {
      return and();
    }
    
  
  }
  public class SchemesNested<N> extends SchemesFluent<SchemesNested<N>> implements Nested<N>{
    SchemesNested(int index,Schemes item) {
      this.index = index;
      this.builder = new SchemesBuilder(this, item);
    }
    SchemesBuilder builder;
    int index;
    
    public N and() {
      return (N) ArtifactsFluent.this.setToSchemes(index,builder.build());
    }
    
    public N endScheme() {
      return and();
    }
    
  
  }

}