package org.apache.camel.v1.integrationplatformspec.traits;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PdbBuilder extends PdbFluent<PdbBuilder> implements VisitableBuilder<Pdb,PdbBuilder>{
  public PdbBuilder() {
    this(new Pdb());
  }
  
  public PdbBuilder(PdbFluent<?> fluent) {
    this(fluent, new Pdb());
  }
  
  public PdbBuilder(PdbFluent<?> fluent,Pdb instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PdbBuilder(Pdb instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PdbFluent<?> fluent;
  
  public Pdb build() {
    Pdb buildable = new Pdb();
    buildable.setConfiguration(fluent.buildConfiguration());
    buildable.setEnabled(fluent.getEnabled());
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    buildable.setMinAvailable(fluent.getMinAvailable());
    return buildable;
  }
  

}