package org.apache.camel.v1.integrationspec.template.spec.volumes;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class GitRepoFluent<A extends GitRepoFluent<A>> extends BaseFluent<A>{
  public GitRepoFluent() {
  }
  
  public GitRepoFluent(GitRepo instance) {
    this.copyInstance(instance);
  }
  private String directory;
  private String repository;
  private String revision;
  
  protected void copyInstance(GitRepo instance) {
    instance = (instance != null ? instance : new GitRepo());
    if (instance != null) {
          this.withDirectory(instance.getDirectory());
          this.withRepository(instance.getRepository());
          this.withRevision(instance.getRevision());
        }
  }
  
  public String getDirectory() {
    return this.directory;
  }
  
  public A withDirectory(String directory) {
    this.directory = directory;
    return (A) this;
  }
  
  public boolean hasDirectory() {
    return this.directory != null;
  }
  
  public String getRepository() {
    return this.repository;
  }
  
  public A withRepository(String repository) {
    this.repository = repository;
    return (A) this;
  }
  
  public boolean hasRepository() {
    return this.repository != null;
  }
  
  public String getRevision() {
    return this.revision;
  }
  
  public A withRevision(String revision) {
    this.revision = revision;
    return (A) this;
  }
  
  public boolean hasRevision() {
    return this.revision != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    GitRepoFluent that = (GitRepoFluent) o;
    if (!java.util.Objects.equals(directory, that.directory)) return false;
    if (!java.util.Objects.equals(repository, that.repository)) return false;
    if (!java.util.Objects.equals(revision, that.revision)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(directory,  repository,  revision,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (directory != null) { sb.append("directory:"); sb.append(directory + ","); }
    if (repository != null) { sb.append("repository:"); sb.append(repository + ","); }
    if (revision != null) { sb.append("revision:"); sb.append(revision); }
    sb.append("}");
    return sb.toString();
  }
  

}