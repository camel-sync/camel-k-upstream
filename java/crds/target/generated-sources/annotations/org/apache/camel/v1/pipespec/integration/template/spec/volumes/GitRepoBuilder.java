package org.apache.camel.v1.pipespec.integration.template.spec.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class GitRepoBuilder extends GitRepoFluent<GitRepoBuilder> implements VisitableBuilder<GitRepo,GitRepoBuilder>{
  public GitRepoBuilder() {
    this(new GitRepo());
  }
  
  public GitRepoBuilder(GitRepoFluent<?> fluent) {
    this(fluent, new GitRepo());
  }
  
  public GitRepoBuilder(GitRepoFluent<?> fluent,GitRepo instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public GitRepoBuilder(GitRepo instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  GitRepoFluent<?> fluent;
  
  public GitRepo build() {
    GitRepo buildable = new GitRepo();
    buildable.setDirectory(fluent.getDirectory());
    buildable.setRepository(fluent.getRepository());
    buildable.setRevision(fluent.getRevision());
    return buildable;
  }
  

}