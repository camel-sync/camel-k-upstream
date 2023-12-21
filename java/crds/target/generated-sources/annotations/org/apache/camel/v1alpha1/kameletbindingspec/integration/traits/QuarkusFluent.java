package org.apache.camel.v1alpha1.kameletbindingspec.integration.traits;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.quarkus.ConfigurationBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.quarkus.Configuration;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.quarkus.ConfigurationFluent;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class QuarkusFluent<A extends QuarkusFluent<A>> extends BaseFluent<A>{
  public QuarkusFluent() {
  }
  
  public QuarkusFluent(Quarkus instance) {
    this.copyInstance(instance);
  }
  private List<Quarkus.BuildMode> buildMode;
  private ConfigurationBuilder configuration;
  private Boolean enabled;
  private String nativeBaseImage;
  private String nativeBuilderImage;
  private List<Quarkus.PackageTypes> packageTypes;
  
  protected void copyInstance(Quarkus instance) {
    instance = (instance != null ? instance : new Quarkus());
    if (instance != null) {
          this.withBuildMode(instance.getBuildMode());
          this.withConfiguration(instance.getConfiguration());
          this.withEnabled(instance.getEnabled());
          this.withNativeBaseImage(instance.getNativeBaseImage());
          this.withNativeBuilderImage(instance.getNativeBuilderImage());
          this.withPackageTypes(instance.getPackageTypes());
        }
  }
  
  public A addToBuildMode(int index,Quarkus.BuildMode item) {
    if (this.buildMode == null) {this.buildMode = new ArrayList<Quarkus.BuildMode>();}
    this.buildMode.add(index, item);
    return (A)this;
  }
  
  public A setToBuildMode(int index,Quarkus.BuildMode item) {
    if (this.buildMode == null) {this.buildMode = new ArrayList<Quarkus.BuildMode>();}
    this.buildMode.set(index, item); return (A)this;
  }
  
  public A addToBuildMode(org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.Quarkus.BuildMode... items) {
    if (this.buildMode == null) {this.buildMode = new ArrayList<Quarkus.BuildMode>();}
    for (Quarkus.BuildMode item : items) {this.buildMode.add(item);} return (A)this;
  }
  
  public A addAllToBuildMode(Collection<Quarkus.BuildMode> items) {
    if (this.buildMode == null) {this.buildMode = new ArrayList<Quarkus.BuildMode>();}
    for (Quarkus.BuildMode item : items) {this.buildMode.add(item);} return (A)this;
  }
  
  public A removeFromBuildMode(org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.Quarkus.BuildMode... items) {
    if (this.buildMode == null) return (A)this;
    for (Quarkus.BuildMode item : items) { this.buildMode.remove(item);} return (A)this;
  }
  
  public A removeAllFromBuildMode(Collection<Quarkus.BuildMode> items) {
    if (this.buildMode == null) return (A)this;
    for (Quarkus.BuildMode item : items) { this.buildMode.remove(item);} return (A)this;
  }
  
  public List<Quarkus.BuildMode> getBuildMode() {
    return this.buildMode;
  }
  
  public Quarkus.BuildMode getBuildMode(int index) {
    return this.buildMode.get(index);
  }
  
  public Quarkus.BuildMode getFirstBuildMode() {
    return this.buildMode.get(0);
  }
  
  public Quarkus.BuildMode getLastBuildMode() {
    return this.buildMode.get(buildMode.size() - 1);
  }
  
  public Quarkus.BuildMode getMatchingBuildMode(Predicate<Quarkus.BuildMode> predicate) {
      for (Quarkus.BuildMode item : buildMode) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingBuildMode(Predicate<Quarkus.BuildMode> predicate) {
      for (Quarkus.BuildMode item : buildMode) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withBuildMode(List<Quarkus.BuildMode> buildMode) {
    if (buildMode != null) {
        this.buildMode = new ArrayList();
        for (Quarkus.BuildMode item : buildMode) {
          this.addToBuildMode(item);
        }
    } else {
      this.buildMode = null;
    }
    return (A) this;
  }
  
  public A withBuildMode(org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.Quarkus.BuildMode... buildMode) {
    if (this.buildMode != null) {
        this.buildMode.clear();
        _visitables.remove("buildMode");
    }
    if (buildMode != null) {
      for (Quarkus.BuildMode item : buildMode) {
        this.addToBuildMode(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasBuildMode() {
    return this.buildMode != null && !this.buildMode.isEmpty();
  }
  
  public Configuration buildConfiguration() {
    return this.configuration != null ? this.configuration.build() : null;
  }
  
  public A withConfiguration(Configuration configuration) {
    this._visitables.remove("configuration");
    if (configuration != null) {
        this.configuration = new ConfigurationBuilder(configuration);
        this._visitables.get("configuration").add(this.configuration);
    } else {
        this.configuration = null;
        this._visitables.get("configuration").remove(this.configuration);
    }
    return (A) this;
  }
  
  public boolean hasConfiguration() {
    return this.configuration != null;
  }
  
  public ConfigurationNested<A> withNewConfiguration() {
    return new ConfigurationNested(null);
  }
  
  public ConfigurationNested<A> withNewConfigurationLike(Configuration item) {
    return new ConfigurationNested(item);
  }
  
  public ConfigurationNested<A> editConfiguration() {
    return withNewConfigurationLike(java.util.Optional.ofNullable(buildConfiguration()).orElse(null));
  }
  
  public ConfigurationNested<A> editOrNewConfiguration() {
    return withNewConfigurationLike(java.util.Optional.ofNullable(buildConfiguration()).orElse(new ConfigurationBuilder().build()));
  }
  
  public ConfigurationNested<A> editOrNewConfigurationLike(Configuration item) {
    return withNewConfigurationLike(java.util.Optional.ofNullable(buildConfiguration()).orElse(item));
  }
  
  public Boolean getEnabled() {
    return this.enabled;
  }
  
  public A withEnabled(Boolean enabled) {
    this.enabled = enabled;
    return (A) this;
  }
  
  public boolean hasEnabled() {
    return this.enabled != null;
  }
  
  public String getNativeBaseImage() {
    return this.nativeBaseImage;
  }
  
  public A withNativeBaseImage(String nativeBaseImage) {
    this.nativeBaseImage = nativeBaseImage;
    return (A) this;
  }
  
  public boolean hasNativeBaseImage() {
    return this.nativeBaseImage != null;
  }
  
  public String getNativeBuilderImage() {
    return this.nativeBuilderImage;
  }
  
  public A withNativeBuilderImage(String nativeBuilderImage) {
    this.nativeBuilderImage = nativeBuilderImage;
    return (A) this;
  }
  
  public boolean hasNativeBuilderImage() {
    return this.nativeBuilderImage != null;
  }
  
  public A addToPackageTypes(int index,Quarkus.PackageTypes item) {
    if (this.packageTypes == null) {this.packageTypes = new ArrayList<Quarkus.PackageTypes>();}
    this.packageTypes.add(index, item);
    return (A)this;
  }
  
  public A setToPackageTypes(int index,Quarkus.PackageTypes item) {
    if (this.packageTypes == null) {this.packageTypes = new ArrayList<Quarkus.PackageTypes>();}
    this.packageTypes.set(index, item); return (A)this;
  }
  
  public A addToPackageTypes(org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.Quarkus.PackageTypes... items) {
    if (this.packageTypes == null) {this.packageTypes = new ArrayList<Quarkus.PackageTypes>();}
    for (Quarkus.PackageTypes item : items) {this.packageTypes.add(item);} return (A)this;
  }
  
  public A addAllToPackageTypes(Collection<Quarkus.PackageTypes> items) {
    if (this.packageTypes == null) {this.packageTypes = new ArrayList<Quarkus.PackageTypes>();}
    for (Quarkus.PackageTypes item : items) {this.packageTypes.add(item);} return (A)this;
  }
  
  public A removeFromPackageTypes(org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.Quarkus.PackageTypes... items) {
    if (this.packageTypes == null) return (A)this;
    for (Quarkus.PackageTypes item : items) { this.packageTypes.remove(item);} return (A)this;
  }
  
  public A removeAllFromPackageTypes(Collection<Quarkus.PackageTypes> items) {
    if (this.packageTypes == null) return (A)this;
    for (Quarkus.PackageTypes item : items) { this.packageTypes.remove(item);} return (A)this;
  }
  
  public List<Quarkus.PackageTypes> getPackageTypes() {
    return this.packageTypes;
  }
  
  public Quarkus.PackageTypes getPackageType(int index) {
    return this.packageTypes.get(index);
  }
  
  public Quarkus.PackageTypes getFirstPackageType() {
    return this.packageTypes.get(0);
  }
  
  public Quarkus.PackageTypes getLastPackageType() {
    return this.packageTypes.get(packageTypes.size() - 1);
  }
  
  public Quarkus.PackageTypes getMatchingPackageType(Predicate<Quarkus.PackageTypes> predicate) {
      for (Quarkus.PackageTypes item : packageTypes) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingPackageType(Predicate<Quarkus.PackageTypes> predicate) {
      for (Quarkus.PackageTypes item : packageTypes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPackageTypes(List<Quarkus.PackageTypes> packageTypes) {
    if (packageTypes != null) {
        this.packageTypes = new ArrayList();
        for (Quarkus.PackageTypes item : packageTypes) {
          this.addToPackageTypes(item);
        }
    } else {
      this.packageTypes = null;
    }
    return (A) this;
  }
  
  public A withPackageTypes(org.apache.camel.v1alpha1.kameletbindingspec.integration.traits.Quarkus.PackageTypes... packageTypes) {
    if (this.packageTypes != null) {
        this.packageTypes.clear();
        _visitables.remove("packageTypes");
    }
    if (packageTypes != null) {
      for (Quarkus.PackageTypes item : packageTypes) {
        this.addToPackageTypes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPackageTypes() {
    return this.packageTypes != null && !this.packageTypes.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    QuarkusFluent that = (QuarkusFluent) o;
    if (!java.util.Objects.equals(buildMode, that.buildMode)) return false;
    if (!java.util.Objects.equals(configuration, that.configuration)) return false;
    if (!java.util.Objects.equals(enabled, that.enabled)) return false;
    if (!java.util.Objects.equals(nativeBaseImage, that.nativeBaseImage)) return false;
    if (!java.util.Objects.equals(nativeBuilderImage, that.nativeBuilderImage)) return false;
    if (!java.util.Objects.equals(packageTypes, that.packageTypes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(buildMode,  configuration,  enabled,  nativeBaseImage,  nativeBuilderImage,  packageTypes,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (buildMode != null && !buildMode.isEmpty()) { sb.append("buildMode:"); sb.append(buildMode + ","); }
    if (configuration != null) { sb.append("configuration:"); sb.append(configuration + ","); }
    if (enabled != null) { sb.append("enabled:"); sb.append(enabled + ","); }
    if (nativeBaseImage != null) { sb.append("nativeBaseImage:"); sb.append(nativeBaseImage + ","); }
    if (nativeBuilderImage != null) { sb.append("nativeBuilderImage:"); sb.append(nativeBuilderImage + ","); }
    if (packageTypes != null && !packageTypes.isEmpty()) { sb.append("packageTypes:"); sb.append(packageTypes); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnabled() {
    return withEnabled(true);
  }
  public class ConfigurationNested<N> extends ConfigurationFluent<ConfigurationNested<N>> implements Nested<N>{
    ConfigurationNested(Configuration item) {
      this.builder = new ConfigurationBuilder(this, item);
    }
    ConfigurationBuilder builder;
    
    public N and() {
      return (N) QuarkusFluent.this.withConfiguration(builder.build());
    }
    
    public N endConfiguration() {
      return and();
    }
    
  
  }

}