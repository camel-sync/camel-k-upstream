package org.apache.camel.v1.buildspec.tasks;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SpectrumBuilder extends SpectrumFluent<SpectrumBuilder> implements VisitableBuilder<Spectrum,SpectrumBuilder>{
  public SpectrumBuilder() {
    this(new Spectrum());
  }
  
  public SpectrumBuilder(SpectrumFluent<?> fluent) {
    this(fluent, new Spectrum());
  }
  
  public SpectrumBuilder(SpectrumFluent<?> fluent,Spectrum instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SpectrumBuilder(Spectrum instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SpectrumFluent<?> fluent;
  
  public Spectrum build() {
    Spectrum buildable = new Spectrum();
    buildable.setBaseImage(fluent.getBaseImage());
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setContextDir(fluent.getContextDir());
    buildable.setImage(fluent.getImage());
    buildable.setName(fluent.getName());
    buildable.setRegistry(fluent.buildRegistry());
    return buildable;
  }
  

}