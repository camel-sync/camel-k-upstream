package org.apache.camel.v1.pipespec.integration.template.spec.ephemeralcontainers.securitycontext;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class WindowsOptionsFluent<A extends WindowsOptionsFluent<A>> extends BaseFluent<A>{
  public WindowsOptionsFluent() {
  }
  
  public WindowsOptionsFluent(WindowsOptions instance) {
    this.copyInstance(instance);
  }
  private String gmsaCredentialSpec;
  private String gmsaCredentialSpecName;
  private Boolean hostProcess;
  private String runAsUserName;
  
  protected void copyInstance(WindowsOptions instance) {
    instance = (instance != null ? instance : new WindowsOptions());
    if (instance != null) {
          this.withGmsaCredentialSpec(instance.getGmsaCredentialSpec());
          this.withGmsaCredentialSpecName(instance.getGmsaCredentialSpecName());
          this.withHostProcess(instance.getHostProcess());
          this.withRunAsUserName(instance.getRunAsUserName());
        }
  }
  
  public String getGmsaCredentialSpec() {
    return this.gmsaCredentialSpec;
  }
  
  public A withGmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
    return (A) this;
  }
  
  public boolean hasGmsaCredentialSpec() {
    return this.gmsaCredentialSpec != null;
  }
  
  public String getGmsaCredentialSpecName() {
    return this.gmsaCredentialSpecName;
  }
  
  public A withGmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    return (A) this;
  }
  
  public boolean hasGmsaCredentialSpecName() {
    return this.gmsaCredentialSpecName != null;
  }
  
  public Boolean getHostProcess() {
    return this.hostProcess;
  }
  
  public A withHostProcess(Boolean hostProcess) {
    this.hostProcess = hostProcess;
    return (A) this;
  }
  
  public boolean hasHostProcess() {
    return this.hostProcess != null;
  }
  
  public String getRunAsUserName() {
    return this.runAsUserName;
  }
  
  public A withRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return (A) this;
  }
  
  public boolean hasRunAsUserName() {
    return this.runAsUserName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    WindowsOptionsFluent that = (WindowsOptionsFluent) o;
    if (!java.util.Objects.equals(gmsaCredentialSpec, that.gmsaCredentialSpec)) return false;
    if (!java.util.Objects.equals(gmsaCredentialSpecName, that.gmsaCredentialSpecName)) return false;
    if (!java.util.Objects.equals(hostProcess, that.hostProcess)) return false;
    if (!java.util.Objects.equals(runAsUserName, that.runAsUserName)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(gmsaCredentialSpec,  gmsaCredentialSpecName,  hostProcess,  runAsUserName,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (gmsaCredentialSpec != null) { sb.append("gmsaCredentialSpec:"); sb.append(gmsaCredentialSpec + ","); }
    if (gmsaCredentialSpecName != null) { sb.append("gmsaCredentialSpecName:"); sb.append(gmsaCredentialSpecName + ","); }
    if (hostProcess != null) { sb.append("hostProcess:"); sb.append(hostProcess + ","); }
    if (runAsUserName != null) { sb.append("runAsUserName:"); sb.append(runAsUserName); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withHostProcess() {
    return withHostProcess(true);
  }
  

}