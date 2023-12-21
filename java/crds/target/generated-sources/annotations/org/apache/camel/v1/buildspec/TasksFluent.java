package org.apache.camel.v1.buildspec;

import org.apache.camel.v1.buildspec.tasks.BuilderFluent;
import org.apache.camel.v1.buildspec.tasks.BuildahFluent;
import org.apache.camel.v1.buildspec.tasks.JibBuilder;
import org.apache.camel.v1.buildspec.tasks.CustomFluent;
import java.lang.SuppressWarnings;
import org.apache.camel.v1.buildspec.tasks.Builder;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1.buildspec.tasks.Buildah;
import java.lang.String;
import org.apache.camel.v1.buildspec.tasks.S2i;
import org.apache.camel.v1.buildspec.tasks.CustomBuilder;
import org.apache.camel.v1.buildspec.tasks.Spectrum;
import org.apache.camel.v1.buildspec.tasks.Kaniko;
import org.apache.camel.v1.buildspec.tasks.KanikoBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1.buildspec.tasks.BuildahBuilder;
import org.apache.camel.v1.buildspec.tasks.Jib;
import org.apache.camel.v1.buildspec.tasks.SpectrumBuilder;
import org.apache.camel.v1.buildspec.tasks.SpectrumFluent;
import org.apache.camel.v1.buildspec.tasks.Custom;
import org.apache.camel.v1.buildspec.tasks.KanikoFluent;
import org.apache.camel.v1.buildspec.tasks.S2iFluent;
import org.apache.camel.v1.buildspec.tasks.S2iBuilder;
import java.lang.Object;
import org.apache.camel.v1.buildspec.tasks.BuilderBuilder;
import org.apache.camel.v1.buildspec.tasks.JibFluent;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class TasksFluent<A extends TasksFluent<A>> extends BaseFluent<A>{
  public TasksFluent() {
  }
  
  public TasksFluent(Tasks instance) {
    this.copyInstance(instance);
  }
  private BuildahBuilder buildah;
  private BuilderBuilder builder;
  private CustomBuilder custom;
  private JibBuilder jib;
  private KanikoBuilder kaniko;
  private S2iBuilder s2i;
  private SpectrumBuilder spectrum;
  
  protected void copyInstance(Tasks instance) {
    instance = (instance != null ? instance : new Tasks());
    if (instance != null) {
          this.withBuildah(instance.getBuildah());
          this.withBuilder(instance.getBuilder());
          this.withCustom(instance.getCustom());
          this.withJib(instance.getJib());
          this.withKaniko(instance.getKaniko());
          this.withS2i(instance.getS2i());
          this.withSpectrum(instance.getSpectrum());
        }
  }
  
  public Buildah buildBuildah() {
    return this.buildah != null ? this.buildah.build() : null;
  }
  
  public A withBuildah(Buildah buildah) {
    this._visitables.remove("buildah");
    if (buildah != null) {
        this.buildah = new BuildahBuilder(buildah);
        this._visitables.get("buildah").add(this.buildah);
    } else {
        this.buildah = null;
        this._visitables.get("buildah").remove(this.buildah);
    }
    return (A) this;
  }
  
  public boolean hasBuildah() {
    return this.buildah != null;
  }
  
  public BuildahNested<A> withNewBuildah() {
    return new BuildahNested(null);
  }
  
  public BuildahNested<A> withNewBuildahLike(Buildah item) {
    return new BuildahNested(item);
  }
  
  public BuildahNested<A> editBuildah() {
    return withNewBuildahLike(java.util.Optional.ofNullable(buildBuildah()).orElse(null));
  }
  
  public BuildahNested<A> editOrNewBuildah() {
    return withNewBuildahLike(java.util.Optional.ofNullable(buildBuildah()).orElse(new BuildahBuilder().build()));
  }
  
  public BuildahNested<A> editOrNewBuildahLike(Buildah item) {
    return withNewBuildahLike(java.util.Optional.ofNullable(buildBuildah()).orElse(item));
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
  
  public Custom buildCustom() {
    return this.custom != null ? this.custom.build() : null;
  }
  
  public A withCustom(Custom custom) {
    this._visitables.remove("custom");
    if (custom != null) {
        this.custom = new CustomBuilder(custom);
        this._visitables.get("custom").add(this.custom);
    } else {
        this.custom = null;
        this._visitables.get("custom").remove(this.custom);
    }
    return (A) this;
  }
  
  public boolean hasCustom() {
    return this.custom != null;
  }
  
  public CustomNested<A> withNewCustom() {
    return new CustomNested(null);
  }
  
  public CustomNested<A> withNewCustomLike(Custom item) {
    return new CustomNested(item);
  }
  
  public CustomNested<A> editCustom() {
    return withNewCustomLike(java.util.Optional.ofNullable(buildCustom()).orElse(null));
  }
  
  public CustomNested<A> editOrNewCustom() {
    return withNewCustomLike(java.util.Optional.ofNullable(buildCustom()).orElse(new CustomBuilder().build()));
  }
  
  public CustomNested<A> editOrNewCustomLike(Custom item) {
    return withNewCustomLike(java.util.Optional.ofNullable(buildCustom()).orElse(item));
  }
  
  public Jib buildJib() {
    return this.jib != null ? this.jib.build() : null;
  }
  
  public A withJib(Jib jib) {
    this._visitables.remove("jib");
    if (jib != null) {
        this.jib = new JibBuilder(jib);
        this._visitables.get("jib").add(this.jib);
    } else {
        this.jib = null;
        this._visitables.get("jib").remove(this.jib);
    }
    return (A) this;
  }
  
  public boolean hasJib() {
    return this.jib != null;
  }
  
  public JibNested<A> withNewJib() {
    return new JibNested(null);
  }
  
  public JibNested<A> withNewJibLike(Jib item) {
    return new JibNested(item);
  }
  
  public JibNested<A> editJib() {
    return withNewJibLike(java.util.Optional.ofNullable(buildJib()).orElse(null));
  }
  
  public JibNested<A> editOrNewJib() {
    return withNewJibLike(java.util.Optional.ofNullable(buildJib()).orElse(new JibBuilder().build()));
  }
  
  public JibNested<A> editOrNewJibLike(Jib item) {
    return withNewJibLike(java.util.Optional.ofNullable(buildJib()).orElse(item));
  }
  
  public Kaniko buildKaniko() {
    return this.kaniko != null ? this.kaniko.build() : null;
  }
  
  public A withKaniko(Kaniko kaniko) {
    this._visitables.remove("kaniko");
    if (kaniko != null) {
        this.kaniko = new KanikoBuilder(kaniko);
        this._visitables.get("kaniko").add(this.kaniko);
    } else {
        this.kaniko = null;
        this._visitables.get("kaniko").remove(this.kaniko);
    }
    return (A) this;
  }
  
  public boolean hasKaniko() {
    return this.kaniko != null;
  }
  
  public KanikoNested<A> withNewKaniko() {
    return new KanikoNested(null);
  }
  
  public KanikoNested<A> withNewKanikoLike(Kaniko item) {
    return new KanikoNested(item);
  }
  
  public KanikoNested<A> editKaniko() {
    return withNewKanikoLike(java.util.Optional.ofNullable(buildKaniko()).orElse(null));
  }
  
  public KanikoNested<A> editOrNewKaniko() {
    return withNewKanikoLike(java.util.Optional.ofNullable(buildKaniko()).orElse(new KanikoBuilder().build()));
  }
  
  public KanikoNested<A> editOrNewKanikoLike(Kaniko item) {
    return withNewKanikoLike(java.util.Optional.ofNullable(buildKaniko()).orElse(item));
  }
  
  public S2i buildS2i() {
    return this.s2i != null ? this.s2i.build() : null;
  }
  
  public A withS2i(S2i s2i) {
    this._visitables.remove("s2i");
    if (s2i != null) {
        this.s2i = new S2iBuilder(s2i);
        this._visitables.get("s2i").add(this.s2i);
    } else {
        this.s2i = null;
        this._visitables.get("s2i").remove(this.s2i);
    }
    return (A) this;
  }
  
  public boolean hasS2i() {
    return this.s2i != null;
  }
  
  public S2iNested<A> withNewS2i() {
    return new S2iNested(null);
  }
  
  public S2iNested<A> withNewS2iLike(S2i item) {
    return new S2iNested(item);
  }
  
  public S2iNested<A> editS2i() {
    return withNewS2iLike(java.util.Optional.ofNullable(buildS2i()).orElse(null));
  }
  
  public S2iNested<A> editOrNewS2i() {
    return withNewS2iLike(java.util.Optional.ofNullable(buildS2i()).orElse(new S2iBuilder().build()));
  }
  
  public S2iNested<A> editOrNewS2iLike(S2i item) {
    return withNewS2iLike(java.util.Optional.ofNullable(buildS2i()).orElse(item));
  }
  
  public Spectrum buildSpectrum() {
    return this.spectrum != null ? this.spectrum.build() : null;
  }
  
  public A withSpectrum(Spectrum spectrum) {
    this._visitables.remove("spectrum");
    if (spectrum != null) {
        this.spectrum = new SpectrumBuilder(spectrum);
        this._visitables.get("spectrum").add(this.spectrum);
    } else {
        this.spectrum = null;
        this._visitables.get("spectrum").remove(this.spectrum);
    }
    return (A) this;
  }
  
  public boolean hasSpectrum() {
    return this.spectrum != null;
  }
  
  public SpectrumNested<A> withNewSpectrum() {
    return new SpectrumNested(null);
  }
  
  public SpectrumNested<A> withNewSpectrumLike(Spectrum item) {
    return new SpectrumNested(item);
  }
  
  public SpectrumNested<A> editSpectrum() {
    return withNewSpectrumLike(java.util.Optional.ofNullable(buildSpectrum()).orElse(null));
  }
  
  public SpectrumNested<A> editOrNewSpectrum() {
    return withNewSpectrumLike(java.util.Optional.ofNullable(buildSpectrum()).orElse(new SpectrumBuilder().build()));
  }
  
  public SpectrumNested<A> editOrNewSpectrumLike(Spectrum item) {
    return withNewSpectrumLike(java.util.Optional.ofNullable(buildSpectrum()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    TasksFluent that = (TasksFluent) o;
    if (!java.util.Objects.equals(buildah, that.buildah)) return false;
    if (!java.util.Objects.equals(builder, that.builder)) return false;
    if (!java.util.Objects.equals(custom, that.custom)) return false;
    if (!java.util.Objects.equals(jib, that.jib)) return false;
    if (!java.util.Objects.equals(kaniko, that.kaniko)) return false;
    if (!java.util.Objects.equals(s2i, that.s2i)) return false;
    if (!java.util.Objects.equals(spectrum, that.spectrum)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(buildah,  builder,  custom,  jib,  kaniko,  s2i,  spectrum,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (buildah != null) { sb.append("buildah:"); sb.append(buildah + ","); }
    if (builder != null) { sb.append("builder:"); sb.append(builder + ","); }
    if (custom != null) { sb.append("custom:"); sb.append(custom + ","); }
    if (jib != null) { sb.append("jib:"); sb.append(jib + ","); }
    if (kaniko != null) { sb.append("kaniko:"); sb.append(kaniko + ","); }
    if (s2i != null) { sb.append("s2i:"); sb.append(s2i + ","); }
    if (spectrum != null) { sb.append("spectrum:"); sb.append(spectrum); }
    sb.append("}");
    return sb.toString();
  }
  public class BuildahNested<N> extends BuildahFluent<BuildahNested<N>> implements Nested<N>{
    BuildahNested(Buildah item) {
      this.builder = new BuildahBuilder(this, item);
    }
    BuildahBuilder builder;
    
    public N and() {
      return (N) TasksFluent.this.withBuildah(builder.build());
    }
    
    public N endBuildah() {
      return and();
    }
    
  
  }
  public class BuilderNested<N> extends BuilderFluent<BuilderNested<N>> implements Nested<N>{
    BuilderNested(Builder item) {
      this.builder = new BuilderBuilder(this, item);
    }
    BuilderBuilder builder;
    
    public N and() {
      return (N) TasksFluent.this.withBuilder(builder.build());
    }
    
    public N endBuilder() {
      return and();
    }
    
  
  }
  public class CustomNested<N> extends CustomFluent<CustomNested<N>> implements Nested<N>{
    CustomNested(Custom item) {
      this.builder = new CustomBuilder(this, item);
    }
    CustomBuilder builder;
    
    public N and() {
      return (N) TasksFluent.this.withCustom(builder.build());
    }
    
    public N endCustom() {
      return and();
    }
    
  
  }
  public class JibNested<N> extends JibFluent<JibNested<N>> implements Nested<N>{
    JibNested(Jib item) {
      this.builder = new JibBuilder(this, item);
    }
    JibBuilder builder;
    
    public N and() {
      return (N) TasksFluent.this.withJib(builder.build());
    }
    
    public N endJib() {
      return and();
    }
    
  
  }
  public class KanikoNested<N> extends KanikoFluent<KanikoNested<N>> implements Nested<N>{
    KanikoNested(Kaniko item) {
      this.builder = new KanikoBuilder(this, item);
    }
    KanikoBuilder builder;
    
    public N and() {
      return (N) TasksFluent.this.withKaniko(builder.build());
    }
    
    public N endKaniko() {
      return and();
    }
    
  
  }
  public class S2iNested<N> extends S2iFluent<S2iNested<N>> implements Nested<N>{
    S2iNested(S2i item) {
      this.builder = new S2iBuilder(this, item);
    }
    S2iBuilder builder;
    
    public N and() {
      return (N) TasksFluent.this.withS2i(builder.build());
    }
    
    public N endS2i() {
      return and();
    }
    
  
  }
  public class SpectrumNested<N> extends SpectrumFluent<SpectrumNested<N>> implements Nested<N>{
    SpectrumNested(Spectrum item) {
      this.builder = new SpectrumBuilder(this, item);
    }
    SpectrumBuilder builder;
    
    public N and() {
      return (N) TasksFluent.this.withSpectrum(builder.build());
    }
    
    public N endSpectrum() {
      return and();
    }
    
  
  }

}