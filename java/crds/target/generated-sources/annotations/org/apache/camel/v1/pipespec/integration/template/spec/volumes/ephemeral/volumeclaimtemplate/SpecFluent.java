package org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate;

import java.lang.SuppressWarnings;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSourceRef;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.SelectorFluent;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSourceBuilder;
import java.lang.String;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSourceFluent;
import java.util.List;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.ResourcesBuilder;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSourceRefFluent;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.Selector;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSourceRefBuilder;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSource;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.SelectorBuilder;
import java.util.Collection;
import java.lang.Object;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.ResourcesFluent;
import org.apache.camel.v1.pipespec.integration.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.Resources;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SpecFluent<A extends SpecFluent<A>> extends BaseFluent<A>{
  public SpecFluent() {
  }
  
  public SpecFluent(Spec instance) {
    this.copyInstance(instance);
  }
  private List<String> accessModes;
  private DataSourceBuilder dataSource;
  private DataSourceRefBuilder dataSourceRef;
  private ResourcesBuilder resources;
  private SelectorBuilder selector;
  private String storageClassName;
  private String volumeMode;
  private String volumeName;
  
  protected void copyInstance(Spec instance) {
    instance = (instance != null ? instance : new Spec());
    if (instance != null) {
          this.withAccessModes(instance.getAccessModes());
          this.withDataSource(instance.getDataSource());
          this.withDataSourceRef(instance.getDataSourceRef());
          this.withResources(instance.getResources());
          this.withSelector(instance.getSelector());
          this.withStorageClassName(instance.getStorageClassName());
          this.withVolumeMode(instance.getVolumeMode());
          this.withVolumeName(instance.getVolumeName());
        }
  }
  
  public A addToAccessModes(int index,String item) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    this.accessModes.add(index, item);
    return (A)this;
  }
  
  public A setToAccessModes(int index,String item) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    this.accessModes.set(index, item); return (A)this;
  }
  
  public A addToAccessModes(java.lang.String... items) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    for (String item : items) {this.accessModes.add(item);} return (A)this;
  }
  
  public A addAllToAccessModes(Collection<String> items) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    for (String item : items) {this.accessModes.add(item);} return (A)this;
  }
  
  public A removeFromAccessModes(java.lang.String... items) {
    if (this.accessModes == null) return (A)this;
    for (String item : items) { this.accessModes.remove(item);} return (A)this;
  }
  
  public A removeAllFromAccessModes(Collection<String> items) {
    if (this.accessModes == null) return (A)this;
    for (String item : items) { this.accessModes.remove(item);} return (A)this;
  }
  
  public List<String> getAccessModes() {
    return this.accessModes;
  }
  
  public String getAccessMode(int index) {
    return this.accessModes.get(index);
  }
  
  public String getFirstAccessMode() {
    return this.accessModes.get(0);
  }
  
  public String getLastAccessMode() {
    return this.accessModes.get(accessModes.size() - 1);
  }
  
  public String getMatchingAccessMode(Predicate<String> predicate) {
      for (String item : accessModes) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingAccessMode(Predicate<String> predicate) {
      for (String item : accessModes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAccessModes(List<String> accessModes) {
    if (accessModes != null) {
        this.accessModes = new ArrayList();
        for (String item : accessModes) {
          this.addToAccessModes(item);
        }
    } else {
      this.accessModes = null;
    }
    return (A) this;
  }
  
  public A withAccessModes(java.lang.String... accessModes) {
    if (this.accessModes != null) {
        this.accessModes.clear();
        _visitables.remove("accessModes");
    }
    if (accessModes != null) {
      for (String item : accessModes) {
        this.addToAccessModes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAccessModes() {
    return this.accessModes != null && !this.accessModes.isEmpty();
  }
  
  public DataSource buildDataSource() {
    return this.dataSource != null ? this.dataSource.build() : null;
  }
  
  public A withDataSource(DataSource dataSource) {
    this._visitables.remove("dataSource");
    if (dataSource != null) {
        this.dataSource = new DataSourceBuilder(dataSource);
        this._visitables.get("dataSource").add(this.dataSource);
    } else {
        this.dataSource = null;
        this._visitables.get("dataSource").remove(this.dataSource);
    }
    return (A) this;
  }
  
  public boolean hasDataSource() {
    return this.dataSource != null;
  }
  
  public DataSourceNested<A> withNewDataSource() {
    return new DataSourceNested(null);
  }
  
  public DataSourceNested<A> withNewDataSourceLike(DataSource item) {
    return new DataSourceNested(item);
  }
  
  public DataSourceNested<A> editIntegrationDataSource() {
    return withNewDataSourceLike(java.util.Optional.ofNullable(buildDataSource()).orElse(null));
  }
  
  public DataSourceNested<A> editOrNewDataSource() {
    return withNewDataSourceLike(java.util.Optional.ofNullable(buildDataSource()).orElse(new DataSourceBuilder().build()));
  }
  
  public DataSourceNested<A> editOrNewDataSourceLike(DataSource item) {
    return withNewDataSourceLike(java.util.Optional.ofNullable(buildDataSource()).orElse(item));
  }
  
  public DataSourceRef buildDataSourceRef() {
    return this.dataSourceRef != null ? this.dataSourceRef.build() : null;
  }
  
  public A withDataSourceRef(DataSourceRef dataSourceRef) {
    this._visitables.remove("dataSourceRef");
    if (dataSourceRef != null) {
        this.dataSourceRef = new DataSourceRefBuilder(dataSourceRef);
        this._visitables.get("dataSourceRef").add(this.dataSourceRef);
    } else {
        this.dataSourceRef = null;
        this._visitables.get("dataSourceRef").remove(this.dataSourceRef);
    }
    return (A) this;
  }
  
  public boolean hasDataSourceRef() {
    return this.dataSourceRef != null;
  }
  
  public DataSourceRefNested<A> withNewDataSourceRef() {
    return new DataSourceRefNested(null);
  }
  
  public DataSourceRefNested<A> withNewDataSourceRefLike(DataSourceRef item) {
    return new DataSourceRefNested(item);
  }
  
  public DataSourceRefNested<A> editIntegrationDataSourceRef() {
    return withNewDataSourceRefLike(java.util.Optional.ofNullable(buildDataSourceRef()).orElse(null));
  }
  
  public DataSourceRefNested<A> editOrNewDataSourceRef() {
    return withNewDataSourceRefLike(java.util.Optional.ofNullable(buildDataSourceRef()).orElse(new DataSourceRefBuilder().build()));
  }
  
  public DataSourceRefNested<A> editOrNewDataSourceRefLike(DataSourceRef item) {
    return withNewDataSourceRefLike(java.util.Optional.ofNullable(buildDataSourceRef()).orElse(item));
  }
  
  public Resources buildResources() {
    return this.resources != null ? this.resources.build() : null;
  }
  
  public A withResources(Resources resources) {
    this._visitables.remove("resources");
    if (resources != null) {
        this.resources = new ResourcesBuilder(resources);
        this._visitables.get("resources").add(this.resources);
    } else {
        this.resources = null;
        this._visitables.get("resources").remove(this.resources);
    }
    return (A) this;
  }
  
  public boolean hasResources() {
    return this.resources != null;
  }
  
  public ResourcesNested<A> withNewResources() {
    return new ResourcesNested(null);
  }
  
  public ResourcesNested<A> withNewResourcesLike(Resources item) {
    return new ResourcesNested(item);
  }
  
  public ResourcesNested<A> editSpecResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(null));
  }
  
  public ResourcesNested<A> editOrNewResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(new ResourcesBuilder().build()));
  }
  
  public ResourcesNested<A> editOrNewResourcesLike(Resources item) {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(item));
  }
  
  public Selector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }
  
  public A withSelector(Selector selector) {
    this._visitables.remove("selector");
    if (selector != null) {
        this.selector = new SelectorBuilder(selector);
        this._visitables.get("selector").add(this.selector);
    } else {
        this.selector = null;
        this._visitables.get("selector").remove(this.selector);
    }
    return (A) this;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public SelectorNested<A> withNewSelector() {
    return new SelectorNested(null);
  }
  
  public SelectorNested<A> withNewSelectorLike(Selector item) {
    return new SelectorNested(item);
  }
  
  public SelectorNested<A> editIntegrationSelector() {
    return withNewSelectorLike(java.util.Optional.ofNullable(buildSelector()).orElse(null));
  }
  
  public SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(java.util.Optional.ofNullable(buildSelector()).orElse(new SelectorBuilder().build()));
  }
  
  public SelectorNested<A> editOrNewSelectorLike(Selector item) {
    return withNewSelectorLike(java.util.Optional.ofNullable(buildSelector()).orElse(item));
  }
  
  public String getStorageClassName() {
    return this.storageClassName;
  }
  
  public A withStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return (A) this;
  }
  
  public boolean hasStorageClassName() {
    return this.storageClassName != null;
  }
  
  public String getVolumeMode() {
    return this.volumeMode;
  }
  
  public A withVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
    return (A) this;
  }
  
  public boolean hasVolumeMode() {
    return this.volumeMode != null;
  }
  
  public String getVolumeName() {
    return this.volumeName;
  }
  
  public A withVolumeName(String volumeName) {
    this.volumeName = volumeName;
    return (A) this;
  }
  
  public boolean hasVolumeName() {
    return this.volumeName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    SpecFluent that = (SpecFluent) o;
    if (!java.util.Objects.equals(accessModes, that.accessModes)) return false;
    if (!java.util.Objects.equals(dataSource, that.dataSource)) return false;
    if (!java.util.Objects.equals(dataSourceRef, that.dataSourceRef)) return false;
    if (!java.util.Objects.equals(resources, that.resources)) return false;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
    if (!java.util.Objects.equals(storageClassName, that.storageClassName)) return false;
    if (!java.util.Objects.equals(volumeMode, that.volumeMode)) return false;
    if (!java.util.Objects.equals(volumeName, that.volumeName)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(accessModes,  dataSource,  dataSourceRef,  resources,  selector,  storageClassName,  volumeMode,  volumeName,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (accessModes != null && !accessModes.isEmpty()) { sb.append("accessModes:"); sb.append(accessModes + ","); }
    if (dataSource != null) { sb.append("dataSource:"); sb.append(dataSource + ","); }
    if (dataSourceRef != null) { sb.append("dataSourceRef:"); sb.append(dataSourceRef + ","); }
    if (resources != null) { sb.append("resources:"); sb.append(resources + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector + ","); }
    if (storageClassName != null) { sb.append("storageClassName:"); sb.append(storageClassName + ","); }
    if (volumeMode != null) { sb.append("volumeMode:"); sb.append(volumeMode + ","); }
    if (volumeName != null) { sb.append("volumeName:"); sb.append(volumeName); }
    sb.append("}");
    return sb.toString();
  }
  public class DataSourceNested<N> extends DataSourceFluent<DataSourceNested<N>> implements Nested<N>{
    DataSourceNested(DataSource item) {
      this.builder = new DataSourceBuilder(this, item);
    }
    DataSourceBuilder builder;
    
    public N and() {
      return (N) SpecFluent.this.withDataSource(builder.build());
    }
    
    public N endIntegrationDataSource() {
      return and();
    }
    
  
  }
  public class DataSourceRefNested<N> extends DataSourceRefFluent<DataSourceRefNested<N>> implements Nested<N>{
    DataSourceRefNested(DataSourceRef item) {
      this.builder = new DataSourceRefBuilder(this, item);
    }
    DataSourceRefBuilder builder;
    
    public N and() {
      return (N) SpecFluent.this.withDataSourceRef(builder.build());
    }
    
    public N endIntegrationDataSourceRef() {
      return and();
    }
    
  
  }
  public class ResourcesNested<N> extends ResourcesFluent<ResourcesNested<N>> implements Nested<N>{
    ResourcesNested(Resources item) {
      this.builder = new ResourcesBuilder(this, item);
    }
    ResourcesBuilder builder;
    
    public N and() {
      return (N) SpecFluent.this.withResources(builder.build());
    }
    
    public N endSpecResources() {
      return and();
    }
    
  
  }
  public class SelectorNested<N> extends SelectorFluent<SelectorNested<N>> implements Nested<N>{
    SelectorNested(Selector item) {
      this.builder = new SelectorBuilder(this, item);
    }
    SelectorBuilder builder;
    
    public N and() {
      return (N) SpecFluent.this.withSelector(builder.build());
    }
    
    public N endIntegrationSelector() {
      return and();
    }
    
  
  }

}