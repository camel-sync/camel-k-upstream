package org.apache.camel.v1.integrationspec.template.spec;

import org.apache.camel.v1.integrationspec.template.spec.initcontainers.ReadinessProbe;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeDevices;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.ResizePolicyFluent;
import java.util.ArrayList;
import java.lang.String;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.ResizePolicy;
import java.util.function.Predicate;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.SecurityContextBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.StartupProbeFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.ResourcesBuilder;
import java.lang.Boolean;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.LivenessProbe;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.EnvFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.Lifecycle;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeMountsFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.ReadinessProbeFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.LifecycleBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.ReadinessProbeBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeDevicesBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.StartupProbeBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.EnvFromBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.LivenessProbeFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.SecurityContextFluent;
import java.util.Collection;
import java.lang.Object;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.ResourcesFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.Resources;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeDevicesFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.Env;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.PortsBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeMountsBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.StartupProbe;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeMounts;
import java.util.Iterator;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.ResizePolicyBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.Ports;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.LivenessProbeBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.LifecycleFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.EnvBuilder;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.EnvFrom;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.PortsFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.EnvFromFluent;
import org.apache.camel.v1.integrationspec.template.spec.initcontainers.SecurityContext;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class InitContainersFluent<A extends InitContainersFluent<A>> extends BaseFluent<A>{
  public InitContainersFluent() {
  }
  
  public InitContainersFluent(InitContainers instance) {
    this.copyInstance(instance);
  }
  private List<String> args;
  private List<String> command;
  private ArrayList<EnvBuilder> env;
  private ArrayList<EnvFromBuilder> envFrom;
  private String image;
  private String imagePullPolicy;
  private LifecycleBuilder lifecycle;
  private LivenessProbeBuilder livenessProbe;
  private String name;
  private ArrayList<PortsBuilder> ports;
  private ReadinessProbeBuilder readinessProbe;
  private ArrayList<ResizePolicyBuilder> resizePolicy;
  private ResourcesBuilder resources;
  private SecurityContextBuilder securityContext;
  private StartupProbeBuilder startupProbe;
  private Boolean stdin;
  private Boolean stdinOnce;
  private String terminationMessagePath;
  private String terminationMessagePolicy;
  private Boolean tty;
  private ArrayList<VolumeDevicesBuilder> volumeDevices;
  private ArrayList<VolumeMountsBuilder> volumeMounts;
  private String workingDir;
  
  protected void copyInstance(InitContainers instance) {
    instance = (instance != null ? instance : new InitContainers());
    if (instance != null) {
          this.withArgs(instance.getArgs());
          this.withCommand(instance.getCommand());
          this.withEnv(instance.getEnv());
          this.withEnvFrom(instance.getEnvFrom());
          this.withImage(instance.getImage());
          this.withImagePullPolicy(instance.getImagePullPolicy());
          this.withLifecycle(instance.getLifecycle());
          this.withLivenessProbe(instance.getLivenessProbe());
          this.withName(instance.getName());
          this.withPorts(instance.getPorts());
          this.withReadinessProbe(instance.getReadinessProbe());
          this.withResizePolicy(instance.getResizePolicy());
          this.withResources(instance.getResources());
          this.withSecurityContext(instance.getSecurityContext());
          this.withStartupProbe(instance.getStartupProbe());
          this.withStdin(instance.getStdin());
          this.withStdinOnce(instance.getStdinOnce());
          this.withTerminationMessagePath(instance.getTerminationMessagePath());
          this.withTerminationMessagePolicy(instance.getTerminationMessagePolicy());
          this.withTty(instance.getTty());
          this.withVolumeDevices(instance.getVolumeDevices());
          this.withVolumeMounts(instance.getVolumeMounts());
          this.withWorkingDir(instance.getWorkingDir());
        }
  }
  
  public A addToArgs(int index,String item) {
    if (this.args == null) {this.args = new ArrayList<String>();}
    this.args.add(index, item);
    return (A)this;
  }
  
  public A setToArgs(int index,String item) {
    if (this.args == null) {this.args = new ArrayList<String>();}
    this.args.set(index, item); return (A)this;
  }
  
  public A addToArgs(java.lang.String... items) {
    if (this.args == null) {this.args = new ArrayList<String>();}
    for (String item : items) {this.args.add(item);} return (A)this;
  }
  
  public A addAllToArgs(Collection<String> items) {
    if (this.args == null) {this.args = new ArrayList<String>();}
    for (String item : items) {this.args.add(item);} return (A)this;
  }
  
  public A removeFromArgs(java.lang.String... items) {
    if (this.args == null) return (A)this;
    for (String item : items) { this.args.remove(item);} return (A)this;
  }
  
  public A removeAllFromArgs(Collection<String> items) {
    if (this.args == null) return (A)this;
    for (String item : items) { this.args.remove(item);} return (A)this;
  }
  
  public List<String> getArgs() {
    return this.args;
  }
  
  public String getArg(int index) {
    return this.args.get(index);
  }
  
  public String getFirstArg() {
    return this.args.get(0);
  }
  
  public String getLastArg() {
    return this.args.get(args.size() - 1);
  }
  
  public String getMatchingArg(Predicate<String> predicate) {
      for (String item : args) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingArg(Predicate<String> predicate) {
      for (String item : args) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withArgs(List<String> args) {
    if (args != null) {
        this.args = new ArrayList();
        for (String item : args) {
          this.addToArgs(item);
        }
    } else {
      this.args = null;
    }
    return (A) this;
  }
  
  public A withArgs(java.lang.String... args) {
    if (this.args != null) {
        this.args.clear();
        _visitables.remove("args");
    }
    if (args != null) {
      for (String item : args) {
        this.addToArgs(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasArgs() {
    return this.args != null && !this.args.isEmpty();
  }
  
  public A addToCommand(int index,String item) {
    if (this.command == null) {this.command = new ArrayList<String>();}
    this.command.add(index, item);
    return (A)this;
  }
  
  public A setToCommand(int index,String item) {
    if (this.command == null) {this.command = new ArrayList<String>();}
    this.command.set(index, item); return (A)this;
  }
  
  public A addToCommand(java.lang.String... items) {
    if (this.command == null) {this.command = new ArrayList<String>();}
    for (String item : items) {this.command.add(item);} return (A)this;
  }
  
  public A addAllToCommand(Collection<String> items) {
    if (this.command == null) {this.command = new ArrayList<String>();}
    for (String item : items) {this.command.add(item);} return (A)this;
  }
  
  public A removeFromCommand(java.lang.String... items) {
    if (this.command == null) return (A)this;
    for (String item : items) { this.command.remove(item);} return (A)this;
  }
  
  public A removeAllFromCommand(Collection<String> items) {
    if (this.command == null) return (A)this;
    for (String item : items) { this.command.remove(item);} return (A)this;
  }
  
  public List<String> getCommand() {
    return this.command;
  }
  
  public String getCommand(int index) {
    return this.command.get(index);
  }
  
  public String getFirstCommand() {
    return this.command.get(0);
  }
  
  public String getLastCommand() {
    return this.command.get(command.size() - 1);
  }
  
  public String getMatchingCommand(Predicate<String> predicate) {
      for (String item : command) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingCommand(Predicate<String> predicate) {
      for (String item : command) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withCommand(List<String> command) {
    if (command != null) {
        this.command = new ArrayList();
        for (String item : command) {
          this.addToCommand(item);
        }
    } else {
      this.command = null;
    }
    return (A) this;
  }
  
  public A withCommand(java.lang.String... command) {
    if (this.command != null) {
        this.command.clear();
        _visitables.remove("command");
    }
    if (command != null) {
      for (String item : command) {
        this.addToCommand(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasCommand() {
    return this.command != null && !this.command.isEmpty();
  }
  
  public A addToEnv(int index,Env item) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    EnvBuilder builder = new EnvBuilder(item);
    if (index < 0 || index >= env.size()) { _visitables.get("env").add(builder); env.add(builder); } else { _visitables.get("env").add(index, builder); env.add(index, builder);}
    return (A)this;
  }
  
  public A setToEnv(int index,Env item) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    EnvBuilder builder = new EnvBuilder(item);
    if (index < 0 || index >= env.size()) { _visitables.get("env").add(builder); env.add(builder); } else { _visitables.get("env").set(index, builder); env.set(index, builder);}
    return (A)this;
  }
  
  public A addToEnv(org.apache.camel.v1.integrationspec.template.spec.initcontainers.Env... items) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").add(builder);this.env.add(builder);} return (A)this;
  }
  
  public A addAllToInitcontainersEnv(Collection<Env> items) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").add(builder);this.env.add(builder);} return (A)this;
  }
  
  public A removeFromEnv(org.apache.camel.v1.integrationspec.template.spec.initcontainers.Env... items) {
    if (this.env == null) return (A)this;
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").remove(builder); this.env.remove(builder);} return (A)this;
  }
  
  public A removeAllFromInitcontainersEnv(Collection<Env> items) {
    if (this.env == null) return (A)this;
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").remove(builder); this.env.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromInitcontainersEnv(Predicate<EnvBuilder> predicate) {
    if (env == null) return (A) this;
    final Iterator<EnvBuilder> each = env.iterator();
    final List visitables = _visitables.get("env");
    while (each.hasNext()) {
      EnvBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Env> buildEnv() {
    return this.env != null ? build(env) : null;
  }
  
  public Env buildEnv(int index) {
    return this.env.get(index).build();
  }
  
  public Env buildFirstEnv() {
    return this.env.get(0).build();
  }
  
  public Env buildLastEnv() {
    return this.env.get(env.size() - 1).build();
  }
  
  public Env buildMatchingEnv(Predicate<EnvBuilder> predicate) {
      for (EnvBuilder item : env) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingEnv(Predicate<EnvBuilder> predicate) {
      for (EnvBuilder item : env) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEnv(List<Env> env) {
    if (this.env != null) {
      this._visitables.get("env").clear();
    }
    if (env != null) {
        this.env = new ArrayList();
        for (Env item : env) {
          this.addToEnv(item);
        }
    } else {
      this.env = null;
    }
    return (A) this;
  }
  
  public A withEnv(org.apache.camel.v1.integrationspec.template.spec.initcontainers.Env... env) {
    if (this.env != null) {
        this.env.clear();
        _visitables.remove("env");
    }
    if (env != null) {
      for (Env item : env) {
        this.addToEnv(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEnv() {
    return this.env != null && !this.env.isEmpty();
  }
  
  public EnvNested<A> addNewEnv() {
    return new EnvNested(-1, null);
  }
  
  public EnvNested<A> addNewEnvLike(Env item) {
    return new EnvNested(-1, item);
  }
  
  public EnvNested<A> setNewEnvLike(int index,Env item) {
    return new EnvNested(index, item);
  }
  
  public EnvNested<A> editEnv(int index) {
    if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
    return setNewEnvLike(index, buildEnv(index));
  }
  
  public EnvNested<A> editFirstEnv() {
    if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
    return setNewEnvLike(0, buildEnv(0));
  }
  
  public EnvNested<A> editLastEnv() {
    int index = env.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
    return setNewEnvLike(index, buildEnv(index));
  }
  
  public EnvNested<A> editMatchingEnv(Predicate<EnvBuilder> predicate) {
    int index = -1;
    for (int i=0;i<env.size();i++) { 
    if (predicate.test(env.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
    return setNewEnvLike(index, buildEnv(index));
  }
  
  public A addToEnvFrom(int index,EnvFrom item) {
    if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromBuilder>();}
    EnvFromBuilder builder = new EnvFromBuilder(item);
    if (index < 0 || index >= envFrom.size()) { _visitables.get("envFrom").add(builder); envFrom.add(builder); } else { _visitables.get("envFrom").add(index, builder); envFrom.add(index, builder);}
    return (A)this;
  }
  
  public A setToEnvFrom(int index,EnvFrom item) {
    if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromBuilder>();}
    EnvFromBuilder builder = new EnvFromBuilder(item);
    if (index < 0 || index >= envFrom.size()) { _visitables.get("envFrom").add(builder); envFrom.add(builder); } else { _visitables.get("envFrom").set(index, builder); envFrom.set(index, builder);}
    return (A)this;
  }
  
  public A addToEnvFrom(org.apache.camel.v1.integrationspec.template.spec.initcontainers.EnvFrom... items) {
    if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromBuilder>();}
    for (EnvFrom item : items) {EnvFromBuilder builder = new EnvFromBuilder(item);_visitables.get("envFrom").add(builder);this.envFrom.add(builder);} return (A)this;
  }
  
  public A addAllToInitcontainersEnvFrom(Collection<EnvFrom> items) {
    if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromBuilder>();}
    for (EnvFrom item : items) {EnvFromBuilder builder = new EnvFromBuilder(item);_visitables.get("envFrom").add(builder);this.envFrom.add(builder);} return (A)this;
  }
  
  public A removeFromEnvFrom(org.apache.camel.v1.integrationspec.template.spec.initcontainers.EnvFrom... items) {
    if (this.envFrom == null) return (A)this;
    for (EnvFrom item : items) {EnvFromBuilder builder = new EnvFromBuilder(item);_visitables.get("envFrom").remove(builder); this.envFrom.remove(builder);} return (A)this;
  }
  
  public A removeAllFromInitcontainersEnvFrom(Collection<EnvFrom> items) {
    if (this.envFrom == null) return (A)this;
    for (EnvFrom item : items) {EnvFromBuilder builder = new EnvFromBuilder(item);_visitables.get("envFrom").remove(builder); this.envFrom.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromInitcontainersEnvFrom(Predicate<EnvFromBuilder> predicate) {
    if (envFrom == null) return (A) this;
    final Iterator<EnvFromBuilder> each = envFrom.iterator();
    final List visitables = _visitables.get("envFrom");
    while (each.hasNext()) {
      EnvFromBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<EnvFrom> buildEnvFrom() {
    return this.envFrom != null ? build(envFrom) : null;
  }
  
  public EnvFrom buildEnvFrom(int index) {
    return this.envFrom.get(index).build();
  }
  
  public EnvFrom buildFirstEnvFrom() {
    return this.envFrom.get(0).build();
  }
  
  public EnvFrom buildLastEnvFrom() {
    return this.envFrom.get(envFrom.size() - 1).build();
  }
  
  public EnvFrom buildMatchingEnvFrom(Predicate<EnvFromBuilder> predicate) {
      for (EnvFromBuilder item : envFrom) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingEnvFrom(Predicate<EnvFromBuilder> predicate) {
      for (EnvFromBuilder item : envFrom) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEnvFrom(List<EnvFrom> envFrom) {
    if (this.envFrom != null) {
      this._visitables.get("envFrom").clear();
    }
    if (envFrom != null) {
        this.envFrom = new ArrayList();
        for (EnvFrom item : envFrom) {
          this.addToEnvFrom(item);
        }
    } else {
      this.envFrom = null;
    }
    return (A) this;
  }
  
  public A withEnvFrom(org.apache.camel.v1.integrationspec.template.spec.initcontainers.EnvFrom... envFrom) {
    if (this.envFrom != null) {
        this.envFrom.clear();
        _visitables.remove("envFrom");
    }
    if (envFrom != null) {
      for (EnvFrom item : envFrom) {
        this.addToEnvFrom(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEnvFrom() {
    return this.envFrom != null && !this.envFrom.isEmpty();
  }
  
  public EnvFromNested<A> addNewEnvFrom() {
    return new EnvFromNested(-1, null);
  }
  
  public EnvFromNested<A> addNewEnvFromLike(EnvFrom item) {
    return new EnvFromNested(-1, item);
  }
  
  public EnvFromNested<A> setNewEnvFromLike(int index,EnvFrom item) {
    return new EnvFromNested(index, item);
  }
  
  public EnvFromNested<A> editEnvFrom(int index) {
    if (envFrom.size() <= index) throw new RuntimeException("Can't edit envFrom. Index exceeds size.");
    return setNewEnvFromLike(index, buildEnvFrom(index));
  }
  
  public EnvFromNested<A> editFirstEnvFrom() {
    if (envFrom.size() == 0) throw new RuntimeException("Can't edit first envFrom. The list is empty.");
    return setNewEnvFromLike(0, buildEnvFrom(0));
  }
  
  public EnvFromNested<A> editLastEnvFrom() {
    int index = envFrom.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last envFrom. The list is empty.");
    return setNewEnvFromLike(index, buildEnvFrom(index));
  }
  
  public EnvFromNested<A> editMatchingEnvFrom(Predicate<EnvFromBuilder> predicate) {
    int index = -1;
    for (int i=0;i<envFrom.size();i++) { 
    if (predicate.test(envFrom.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching envFrom. No match found.");
    return setNewEnvFromLike(index, buildEnvFrom(index));
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
  
  public String getImagePullPolicy() {
    return this.imagePullPolicy;
  }
  
  public A withImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return (A) this;
  }
  
  public boolean hasImagePullPolicy() {
    return this.imagePullPolicy != null;
  }
  
  public Lifecycle buildLifecycle() {
    return this.lifecycle != null ? this.lifecycle.build() : null;
  }
  
  public A withLifecycle(Lifecycle lifecycle) {
    this._visitables.remove("lifecycle");
    if (lifecycle != null) {
        this.lifecycle = new LifecycleBuilder(lifecycle);
        this._visitables.get("lifecycle").add(this.lifecycle);
    } else {
        this.lifecycle = null;
        this._visitables.get("lifecycle").remove(this.lifecycle);
    }
    return (A) this;
  }
  
  public boolean hasLifecycle() {
    return this.lifecycle != null;
  }
  
  public LifecycleNested<A> withNewLifecycle() {
    return new LifecycleNested(null);
  }
  
  public LifecycleNested<A> withNewLifecycleLike(Lifecycle item) {
    return new LifecycleNested(item);
  }
  
  public LifecycleNested<A> editLifecycle() {
    return withNewLifecycleLike(java.util.Optional.ofNullable(buildLifecycle()).orElse(null));
  }
  
  public LifecycleNested<A> editOrNewLifecycle() {
    return withNewLifecycleLike(java.util.Optional.ofNullable(buildLifecycle()).orElse(new LifecycleBuilder().build()));
  }
  
  public LifecycleNested<A> editOrNewLifecycleLike(Lifecycle item) {
    return withNewLifecycleLike(java.util.Optional.ofNullable(buildLifecycle()).orElse(item));
  }
  
  public LivenessProbe buildLivenessProbe() {
    return this.livenessProbe != null ? this.livenessProbe.build() : null;
  }
  
  public A withLivenessProbe(LivenessProbe livenessProbe) {
    this._visitables.remove("livenessProbe");
    if (livenessProbe != null) {
        this.livenessProbe = new LivenessProbeBuilder(livenessProbe);
        this._visitables.get("livenessProbe").add(this.livenessProbe);
    } else {
        this.livenessProbe = null;
        this._visitables.get("livenessProbe").remove(this.livenessProbe);
    }
    return (A) this;
  }
  
  public boolean hasLivenessProbe() {
    return this.livenessProbe != null;
  }
  
  public LivenessProbeNested<A> withNewLivenessProbe() {
    return new LivenessProbeNested(null);
  }
  
  public LivenessProbeNested<A> withNewLivenessProbeLike(LivenessProbe item) {
    return new LivenessProbeNested(item);
  }
  
  public LivenessProbeNested<A> editInitcontainersLivenessProbe() {
    return withNewLivenessProbeLike(java.util.Optional.ofNullable(buildLivenessProbe()).orElse(null));
  }
  
  public LivenessProbeNested<A> editOrNewLivenessProbe() {
    return withNewLivenessProbeLike(java.util.Optional.ofNullable(buildLivenessProbe()).orElse(new LivenessProbeBuilder().build()));
  }
  
  public LivenessProbeNested<A> editOrNewLivenessProbeLike(LivenessProbe item) {
    return withNewLivenessProbeLike(java.util.Optional.ofNullable(buildLivenessProbe()).orElse(item));
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public A addToPorts(int index,Ports item) {
    if (this.ports == null) {this.ports = new ArrayList<PortsBuilder>();}
    PortsBuilder builder = new PortsBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").add(index, builder); ports.add(index, builder);}
    return (A)this;
  }
  
  public A setToPorts(int index,Ports item) {
    if (this.ports == null) {this.ports = new ArrayList<PortsBuilder>();}
    PortsBuilder builder = new PortsBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").set(index, builder); ports.set(index, builder);}
    return (A)this;
  }
  
  public A addToPorts(org.apache.camel.v1.integrationspec.template.spec.initcontainers.Ports... items) {
    if (this.ports == null) {this.ports = new ArrayList<PortsBuilder>();}
    for (Ports item : items) {PortsBuilder builder = new PortsBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  
  public A addAllToInitcontainersPorts(Collection<Ports> items) {
    if (this.ports == null) {this.ports = new ArrayList<PortsBuilder>();}
    for (Ports item : items) {PortsBuilder builder = new PortsBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  
  public A removeFromPorts(org.apache.camel.v1.integrationspec.template.spec.initcontainers.Ports... items) {
    if (this.ports == null) return (A)this;
    for (Ports item : items) {PortsBuilder builder = new PortsBuilder(item);_visitables.get("ports").remove(builder); this.ports.remove(builder);} return (A)this;
  }
  
  public A removeAllFromInitcontainersPorts(Collection<Ports> items) {
    if (this.ports == null) return (A)this;
    for (Ports item : items) {PortsBuilder builder = new PortsBuilder(item);_visitables.get("ports").remove(builder); this.ports.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromInitcontainersPorts(Predicate<PortsBuilder> predicate) {
    if (ports == null) return (A) this;
    final Iterator<PortsBuilder> each = ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      PortsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Ports> buildPorts() {
    return this.ports != null ? build(ports) : null;
  }
  
  public Ports buildPort(int index) {
    return this.ports.get(index).build();
  }
  
  public Ports buildFirstPort() {
    return this.ports.get(0).build();
  }
  
  public Ports buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  
  public Ports buildMatchingPort(Predicate<PortsBuilder> predicate) {
      for (PortsBuilder item : ports) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPort(Predicate<PortsBuilder> predicate) {
      for (PortsBuilder item : ports) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPorts(List<Ports> ports) {
    if (this.ports != null) {
      this._visitables.get("ports").clear();
    }
    if (ports != null) {
        this.ports = new ArrayList();
        for (Ports item : ports) {
          this.addToPorts(item);
        }
    } else {
      this.ports = null;
    }
    return (A) this;
  }
  
  public A withPorts(org.apache.camel.v1.integrationspec.template.spec.initcontainers.Ports... ports) {
    if (this.ports != null) {
        this.ports.clear();
        _visitables.remove("ports");
    }
    if (ports != null) {
      for (Ports item : ports) {
        this.addToPorts(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPorts() {
    return this.ports != null && !this.ports.isEmpty();
  }
  
  public PortsNested<A> addNewPort() {
    return new PortsNested(-1, null);
  }
  
  public PortsNested<A> addNewPortLike(Ports item) {
    return new PortsNested(-1, item);
  }
  
  public PortsNested<A> setNewPortLike(int index,Ports item) {
    return new PortsNested(index, item);
  }
  
  public PortsNested<A> editPort(int index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }
  
  public PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }
  
  public PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }
  
  public PortsNested<A> editMatchingPort(Predicate<PortsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ports.size();i++) { 
    if (predicate.test(ports.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
    return setNewPortLike(index, buildPort(index));
  }
  
  public ReadinessProbe buildReadinessProbe() {
    return this.readinessProbe != null ? this.readinessProbe.build() : null;
  }
  
  public A withReadinessProbe(ReadinessProbe readinessProbe) {
    this._visitables.remove("readinessProbe");
    if (readinessProbe != null) {
        this.readinessProbe = new ReadinessProbeBuilder(readinessProbe);
        this._visitables.get("readinessProbe").add(this.readinessProbe);
    } else {
        this.readinessProbe = null;
        this._visitables.get("readinessProbe").remove(this.readinessProbe);
    }
    return (A) this;
  }
  
  public boolean hasReadinessProbe() {
    return this.readinessProbe != null;
  }
  
  public ReadinessProbeNested<A> withNewReadinessProbe() {
    return new ReadinessProbeNested(null);
  }
  
  public ReadinessProbeNested<A> withNewReadinessProbeLike(ReadinessProbe item) {
    return new ReadinessProbeNested(item);
  }
  
  public ReadinessProbeNested<A> editInitcontainersReadinessProbe() {
    return withNewReadinessProbeLike(java.util.Optional.ofNullable(buildReadinessProbe()).orElse(null));
  }
  
  public ReadinessProbeNested<A> editOrNewReadinessProbe() {
    return withNewReadinessProbeLike(java.util.Optional.ofNullable(buildReadinessProbe()).orElse(new ReadinessProbeBuilder().build()));
  }
  
  public ReadinessProbeNested<A> editOrNewReadinessProbeLike(ReadinessProbe item) {
    return withNewReadinessProbeLike(java.util.Optional.ofNullable(buildReadinessProbe()).orElse(item));
  }
  
  public A addToResizePolicy(int index,ResizePolicy item) {
    if (this.resizePolicy == null) {this.resizePolicy = new ArrayList<ResizePolicyBuilder>();}
    ResizePolicyBuilder builder = new ResizePolicyBuilder(item);
    if (index < 0 || index >= resizePolicy.size()) { _visitables.get("resizePolicy").add(builder); resizePolicy.add(builder); } else { _visitables.get("resizePolicy").add(index, builder); resizePolicy.add(index, builder);}
    return (A)this;
  }
  
  public A setToResizePolicy(int index,ResizePolicy item) {
    if (this.resizePolicy == null) {this.resizePolicy = new ArrayList<ResizePolicyBuilder>();}
    ResizePolicyBuilder builder = new ResizePolicyBuilder(item);
    if (index < 0 || index >= resizePolicy.size()) { _visitables.get("resizePolicy").add(builder); resizePolicy.add(builder); } else { _visitables.get("resizePolicy").set(index, builder); resizePolicy.set(index, builder);}
    return (A)this;
  }
  
  public A addToResizePolicy(org.apache.camel.v1.integrationspec.template.spec.initcontainers.ResizePolicy... items) {
    if (this.resizePolicy == null) {this.resizePolicy = new ArrayList<ResizePolicyBuilder>();}
    for (ResizePolicy item : items) {ResizePolicyBuilder builder = new ResizePolicyBuilder(item);_visitables.get("resizePolicy").add(builder);this.resizePolicy.add(builder);} return (A)this;
  }
  
  public A addAllToInitcontainersResizePolicy(Collection<ResizePolicy> items) {
    if (this.resizePolicy == null) {this.resizePolicy = new ArrayList<ResizePolicyBuilder>();}
    for (ResizePolicy item : items) {ResizePolicyBuilder builder = new ResizePolicyBuilder(item);_visitables.get("resizePolicy").add(builder);this.resizePolicy.add(builder);} return (A)this;
  }
  
  public A removeFromResizePolicy(org.apache.camel.v1.integrationspec.template.spec.initcontainers.ResizePolicy... items) {
    if (this.resizePolicy == null) return (A)this;
    for (ResizePolicy item : items) {ResizePolicyBuilder builder = new ResizePolicyBuilder(item);_visitables.get("resizePolicy").remove(builder); this.resizePolicy.remove(builder);} return (A)this;
  }
  
  public A removeAllFromInitcontainersResizePolicy(Collection<ResizePolicy> items) {
    if (this.resizePolicy == null) return (A)this;
    for (ResizePolicy item : items) {ResizePolicyBuilder builder = new ResizePolicyBuilder(item);_visitables.get("resizePolicy").remove(builder); this.resizePolicy.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromInitcontainersResizePolicy(Predicate<ResizePolicyBuilder> predicate) {
    if (resizePolicy == null) return (A) this;
    final Iterator<ResizePolicyBuilder> each = resizePolicy.iterator();
    final List visitables = _visitables.get("resizePolicy");
    while (each.hasNext()) {
      ResizePolicyBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<ResizePolicy> buildResizePolicy() {
    return this.resizePolicy != null ? build(resizePolicy) : null;
  }
  
  public ResizePolicy buildResizePolicy(int index) {
    return this.resizePolicy.get(index).build();
  }
  
  public ResizePolicy buildFirstResizePolicy() {
    return this.resizePolicy.get(0).build();
  }
  
  public ResizePolicy buildLastResizePolicy() {
    return this.resizePolicy.get(resizePolicy.size() - 1).build();
  }
  
  public ResizePolicy buildMatchingResizePolicy(Predicate<ResizePolicyBuilder> predicate) {
      for (ResizePolicyBuilder item : resizePolicy) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingResizePolicy(Predicate<ResizePolicyBuilder> predicate) {
      for (ResizePolicyBuilder item : resizePolicy) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResizePolicy(List<ResizePolicy> resizePolicy) {
    if (this.resizePolicy != null) {
      this._visitables.get("resizePolicy").clear();
    }
    if (resizePolicy != null) {
        this.resizePolicy = new ArrayList();
        for (ResizePolicy item : resizePolicy) {
          this.addToResizePolicy(item);
        }
    } else {
      this.resizePolicy = null;
    }
    return (A) this;
  }
  
  public A withResizePolicy(org.apache.camel.v1.integrationspec.template.spec.initcontainers.ResizePolicy... resizePolicy) {
    if (this.resizePolicy != null) {
        this.resizePolicy.clear();
        _visitables.remove("resizePolicy");
    }
    if (resizePolicy != null) {
      for (ResizePolicy item : resizePolicy) {
        this.addToResizePolicy(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResizePolicy() {
    return this.resizePolicy != null && !this.resizePolicy.isEmpty();
  }
  
  public ResizePolicyNested<A> addNewResizePolicy() {
    return new ResizePolicyNested(-1, null);
  }
  
  public ResizePolicyNested<A> addNewResizePolicyLike(ResizePolicy item) {
    return new ResizePolicyNested(-1, item);
  }
  
  public ResizePolicyNested<A> setNewResizePolicyLike(int index,ResizePolicy item) {
    return new ResizePolicyNested(index, item);
  }
  
  public ResizePolicyNested<A> editResizePolicy(int index) {
    if (resizePolicy.size() <= index) throw new RuntimeException("Can't edit resizePolicy. Index exceeds size.");
    return setNewResizePolicyLike(index, buildResizePolicy(index));
  }
  
  public ResizePolicyNested<A> editFirstResizePolicy() {
    if (resizePolicy.size() == 0) throw new RuntimeException("Can't edit first resizePolicy. The list is empty.");
    return setNewResizePolicyLike(0, buildResizePolicy(0));
  }
  
  public ResizePolicyNested<A> editLastResizePolicy() {
    int index = resizePolicy.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resizePolicy. The list is empty.");
    return setNewResizePolicyLike(index, buildResizePolicy(index));
  }
  
  public ResizePolicyNested<A> editMatchingResizePolicy(Predicate<ResizePolicyBuilder> predicate) {
    int index = -1;
    for (int i=0;i<resizePolicy.size();i++) { 
    if (predicate.test(resizePolicy.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching resizePolicy. No match found.");
    return setNewResizePolicyLike(index, buildResizePolicy(index));
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
  
  public ResourcesNested<A> editInitcontainersResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(null));
  }
  
  public ResourcesNested<A> editOrNewResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(new ResourcesBuilder().build()));
  }
  
  public ResourcesNested<A> editOrNewResourcesLike(Resources item) {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(item));
  }
  
  public SecurityContext buildSecurityContext() {
    return this.securityContext != null ? this.securityContext.build() : null;
  }
  
  public A withSecurityContext(SecurityContext securityContext) {
    this._visitables.remove("securityContext");
    if (securityContext != null) {
        this.securityContext = new SecurityContextBuilder(securityContext);
        this._visitables.get("securityContext").add(this.securityContext);
    } else {
        this.securityContext = null;
        this._visitables.get("securityContext").remove(this.securityContext);
    }
    return (A) this;
  }
  
  public boolean hasSecurityContext() {
    return this.securityContext != null;
  }
  
  public SecurityContextNested<A> withNewSecurityContext() {
    return new SecurityContextNested(null);
  }
  
  public SecurityContextNested<A> withNewSecurityContextLike(SecurityContext item) {
    return new SecurityContextNested(item);
  }
  
  public SecurityContextNested<A> editSecurityContext() {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(null));
  }
  
  public SecurityContextNested<A> editOrNewSecurityContext() {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(new SecurityContextBuilder().build()));
  }
  
  public SecurityContextNested<A> editOrNewSecurityContextLike(SecurityContext item) {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(item));
  }
  
  public StartupProbe buildStartupProbe() {
    return this.startupProbe != null ? this.startupProbe.build() : null;
  }
  
  public A withStartupProbe(StartupProbe startupProbe) {
    this._visitables.remove("startupProbe");
    if (startupProbe != null) {
        this.startupProbe = new StartupProbeBuilder(startupProbe);
        this._visitables.get("startupProbe").add(this.startupProbe);
    } else {
        this.startupProbe = null;
        this._visitables.get("startupProbe").remove(this.startupProbe);
    }
    return (A) this;
  }
  
  public boolean hasStartupProbe() {
    return this.startupProbe != null;
  }
  
  public StartupProbeNested<A> withNewStartupProbe() {
    return new StartupProbeNested(null);
  }
  
  public StartupProbeNested<A> withNewStartupProbeLike(StartupProbe item) {
    return new StartupProbeNested(item);
  }
  
  public StartupProbeNested<A> editInitcontainersStartupProbe() {
    return withNewStartupProbeLike(java.util.Optional.ofNullable(buildStartupProbe()).orElse(null));
  }
  
  public StartupProbeNested<A> editOrNewStartupProbe() {
    return withNewStartupProbeLike(java.util.Optional.ofNullable(buildStartupProbe()).orElse(new StartupProbeBuilder().build()));
  }
  
  public StartupProbeNested<A> editOrNewStartupProbeLike(StartupProbe item) {
    return withNewStartupProbeLike(java.util.Optional.ofNullable(buildStartupProbe()).orElse(item));
  }
  
  public Boolean getStdin() {
    return this.stdin;
  }
  
  public A withStdin(Boolean stdin) {
    this.stdin = stdin;
    return (A) this;
  }
  
  public boolean hasStdin() {
    return this.stdin != null;
  }
  
  public Boolean getStdinOnce() {
    return this.stdinOnce;
  }
  
  public A withStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return (A) this;
  }
  
  public boolean hasStdinOnce() {
    return this.stdinOnce != null;
  }
  
  public String getTerminationMessagePath() {
    return this.terminationMessagePath;
  }
  
  public A withTerminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
    return (A) this;
  }
  
  public boolean hasTerminationMessagePath() {
    return this.terminationMessagePath != null;
  }
  
  public String getTerminationMessagePolicy() {
    return this.terminationMessagePolicy;
  }
  
  public A withTerminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
    return (A) this;
  }
  
  public boolean hasTerminationMessagePolicy() {
    return this.terminationMessagePolicy != null;
  }
  
  public Boolean getTty() {
    return this.tty;
  }
  
  public A withTty(Boolean tty) {
    this.tty = tty;
    return (A) this;
  }
  
  public boolean hasTty() {
    return this.tty != null;
  }
  
  public A addToVolumeDevices(int index,VolumeDevices item) {
    if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<VolumeDevicesBuilder>();}
    VolumeDevicesBuilder builder = new VolumeDevicesBuilder(item);
    if (index < 0 || index >= volumeDevices.size()) { _visitables.get("volumeDevices").add(builder); volumeDevices.add(builder); } else { _visitables.get("volumeDevices").add(index, builder); volumeDevices.add(index, builder);}
    return (A)this;
  }
  
  public A setToVolumeDevices(int index,VolumeDevices item) {
    if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<VolumeDevicesBuilder>();}
    VolumeDevicesBuilder builder = new VolumeDevicesBuilder(item);
    if (index < 0 || index >= volumeDevices.size()) { _visitables.get("volumeDevices").add(builder); volumeDevices.add(builder); } else { _visitables.get("volumeDevices").set(index, builder); volumeDevices.set(index, builder);}
    return (A)this;
  }
  
  public A addToVolumeDevices(org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeDevices... items) {
    if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<VolumeDevicesBuilder>();}
    for (VolumeDevices item : items) {VolumeDevicesBuilder builder = new VolumeDevicesBuilder(item);_visitables.get("volumeDevices").add(builder);this.volumeDevices.add(builder);} return (A)this;
  }
  
  public A addAllToInitcontainersVolumeDevices(Collection<VolumeDevices> items) {
    if (this.volumeDevices == null) {this.volumeDevices = new ArrayList<VolumeDevicesBuilder>();}
    for (VolumeDevices item : items) {VolumeDevicesBuilder builder = new VolumeDevicesBuilder(item);_visitables.get("volumeDevices").add(builder);this.volumeDevices.add(builder);} return (A)this;
  }
  
  public A removeFromVolumeDevices(org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeDevices... items) {
    if (this.volumeDevices == null) return (A)this;
    for (VolumeDevices item : items) {VolumeDevicesBuilder builder = new VolumeDevicesBuilder(item);_visitables.get("volumeDevices").remove(builder); this.volumeDevices.remove(builder);} return (A)this;
  }
  
  public A removeAllFromInitcontainersVolumeDevices(Collection<VolumeDevices> items) {
    if (this.volumeDevices == null) return (A)this;
    for (VolumeDevices item : items) {VolumeDevicesBuilder builder = new VolumeDevicesBuilder(item);_visitables.get("volumeDevices").remove(builder); this.volumeDevices.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromInitcontainersVolumeDevices(Predicate<VolumeDevicesBuilder> predicate) {
    if (volumeDevices == null) return (A) this;
    final Iterator<VolumeDevicesBuilder> each = volumeDevices.iterator();
    final List visitables = _visitables.get("volumeDevices");
    while (each.hasNext()) {
      VolumeDevicesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<VolumeDevices> buildVolumeDevices() {
    return this.volumeDevices != null ? build(volumeDevices) : null;
  }
  
  public VolumeDevices buildVolumeDevice(int index) {
    return this.volumeDevices.get(index).build();
  }
  
  public VolumeDevices buildFirstVolumeDevice() {
    return this.volumeDevices.get(0).build();
  }
  
  public VolumeDevices buildLastVolumeDevice() {
    return this.volumeDevices.get(volumeDevices.size() - 1).build();
  }
  
  public VolumeDevices buildMatchingVolumeDevice(Predicate<VolumeDevicesBuilder> predicate) {
      for (VolumeDevicesBuilder item : volumeDevices) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVolumeDevice(Predicate<VolumeDevicesBuilder> predicate) {
      for (VolumeDevicesBuilder item : volumeDevices) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVolumeDevices(List<VolumeDevices> volumeDevices) {
    if (this.volumeDevices != null) {
      this._visitables.get("volumeDevices").clear();
    }
    if (volumeDevices != null) {
        this.volumeDevices = new ArrayList();
        for (VolumeDevices item : volumeDevices) {
          this.addToVolumeDevices(item);
        }
    } else {
      this.volumeDevices = null;
    }
    return (A) this;
  }
  
  public A withVolumeDevices(org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeDevices... volumeDevices) {
    if (this.volumeDevices != null) {
        this.volumeDevices.clear();
        _visitables.remove("volumeDevices");
    }
    if (volumeDevices != null) {
      for (VolumeDevices item : volumeDevices) {
        this.addToVolumeDevices(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVolumeDevices() {
    return this.volumeDevices != null && !this.volumeDevices.isEmpty();
  }
  
  public VolumeDevicesNested<A> addNewVolumeDevice() {
    return new VolumeDevicesNested(-1, null);
  }
  
  public VolumeDevicesNested<A> addNewVolumeDeviceLike(VolumeDevices item) {
    return new VolumeDevicesNested(-1, item);
  }
  
  public VolumeDevicesNested<A> setNewVolumeDeviceLike(int index,VolumeDevices item) {
    return new VolumeDevicesNested(index, item);
  }
  
  public VolumeDevicesNested<A> editVolumeDevice(int index) {
    if (volumeDevices.size() <= index) throw new RuntimeException("Can't edit volumeDevices. Index exceeds size.");
    return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
  }
  
  public VolumeDevicesNested<A> editFirstVolumeDevice() {
    if (volumeDevices.size() == 0) throw new RuntimeException("Can't edit first volumeDevices. The list is empty.");
    return setNewVolumeDeviceLike(0, buildVolumeDevice(0));
  }
  
  public VolumeDevicesNested<A> editLastVolumeDevice() {
    int index = volumeDevices.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumeDevices. The list is empty.");
    return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
  }
  
  public VolumeDevicesNested<A> editMatchingVolumeDevice(Predicate<VolumeDevicesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<volumeDevices.size();i++) { 
    if (predicate.test(volumeDevices.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching volumeDevices. No match found.");
    return setNewVolumeDeviceLike(index, buildVolumeDevice(index));
  }
  
  public A addToVolumeMounts(int index,VolumeMounts item) {
    if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountsBuilder>();}
    VolumeMountsBuilder builder = new VolumeMountsBuilder(item);
    if (index < 0 || index >= volumeMounts.size()) { _visitables.get("volumeMounts").add(builder); volumeMounts.add(builder); } else { _visitables.get("volumeMounts").add(index, builder); volumeMounts.add(index, builder);}
    return (A)this;
  }
  
  public A setToVolumeMounts(int index,VolumeMounts item) {
    if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountsBuilder>();}
    VolumeMountsBuilder builder = new VolumeMountsBuilder(item);
    if (index < 0 || index >= volumeMounts.size()) { _visitables.get("volumeMounts").add(builder); volumeMounts.add(builder); } else { _visitables.get("volumeMounts").set(index, builder); volumeMounts.set(index, builder);}
    return (A)this;
  }
  
  public A addToVolumeMounts(org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeMounts... items) {
    if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountsBuilder>();}
    for (VolumeMounts item : items) {VolumeMountsBuilder builder = new VolumeMountsBuilder(item);_visitables.get("volumeMounts").add(builder);this.volumeMounts.add(builder);} return (A)this;
  }
  
  public A addAllToInitcontainersVolumeMounts(Collection<VolumeMounts> items) {
    if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountsBuilder>();}
    for (VolumeMounts item : items) {VolumeMountsBuilder builder = new VolumeMountsBuilder(item);_visitables.get("volumeMounts").add(builder);this.volumeMounts.add(builder);} return (A)this;
  }
  
  public A removeFromVolumeMounts(org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeMounts... items) {
    if (this.volumeMounts == null) return (A)this;
    for (VolumeMounts item : items) {VolumeMountsBuilder builder = new VolumeMountsBuilder(item);_visitables.get("volumeMounts").remove(builder); this.volumeMounts.remove(builder);} return (A)this;
  }
  
  public A removeAllFromInitcontainersVolumeMounts(Collection<VolumeMounts> items) {
    if (this.volumeMounts == null) return (A)this;
    for (VolumeMounts item : items) {VolumeMountsBuilder builder = new VolumeMountsBuilder(item);_visitables.get("volumeMounts").remove(builder); this.volumeMounts.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromInitcontainersVolumeMounts(Predicate<VolumeMountsBuilder> predicate) {
    if (volumeMounts == null) return (A) this;
    final Iterator<VolumeMountsBuilder> each = volumeMounts.iterator();
    final List visitables = _visitables.get("volumeMounts");
    while (each.hasNext()) {
      VolumeMountsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<VolumeMounts> buildVolumeMounts() {
    return this.volumeMounts != null ? build(volumeMounts) : null;
  }
  
  public VolumeMounts buildVolumeMount(int index) {
    return this.volumeMounts.get(index).build();
  }
  
  public VolumeMounts buildFirstVolumeMount() {
    return this.volumeMounts.get(0).build();
  }
  
  public VolumeMounts buildLastVolumeMount() {
    return this.volumeMounts.get(volumeMounts.size() - 1).build();
  }
  
  public VolumeMounts buildMatchingVolumeMount(Predicate<VolumeMountsBuilder> predicate) {
      for (VolumeMountsBuilder item : volumeMounts) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVolumeMount(Predicate<VolumeMountsBuilder> predicate) {
      for (VolumeMountsBuilder item : volumeMounts) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVolumeMounts(List<VolumeMounts> volumeMounts) {
    if (this.volumeMounts != null) {
      this._visitables.get("volumeMounts").clear();
    }
    if (volumeMounts != null) {
        this.volumeMounts = new ArrayList();
        for (VolumeMounts item : volumeMounts) {
          this.addToVolumeMounts(item);
        }
    } else {
      this.volumeMounts = null;
    }
    return (A) this;
  }
  
  public A withVolumeMounts(org.apache.camel.v1.integrationspec.template.spec.initcontainers.VolumeMounts... volumeMounts) {
    if (this.volumeMounts != null) {
        this.volumeMounts.clear();
        _visitables.remove("volumeMounts");
    }
    if (volumeMounts != null) {
      for (VolumeMounts item : volumeMounts) {
        this.addToVolumeMounts(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVolumeMounts() {
    return this.volumeMounts != null && !this.volumeMounts.isEmpty();
  }
  
  public VolumeMountsNested<A> addNewVolumeMount() {
    return new VolumeMountsNested(-1, null);
  }
  
  public VolumeMountsNested<A> addNewVolumeMountLike(VolumeMounts item) {
    return new VolumeMountsNested(-1, item);
  }
  
  public VolumeMountsNested<A> setNewVolumeMountLike(int index,VolumeMounts item) {
    return new VolumeMountsNested(index, item);
  }
  
  public VolumeMountsNested<A> editVolumeMount(int index) {
    if (volumeMounts.size() <= index) throw new RuntimeException("Can't edit volumeMounts. Index exceeds size.");
    return setNewVolumeMountLike(index, buildVolumeMount(index));
  }
  
  public VolumeMountsNested<A> editFirstVolumeMount() {
    if (volumeMounts.size() == 0) throw new RuntimeException("Can't edit first volumeMounts. The list is empty.");
    return setNewVolumeMountLike(0, buildVolumeMount(0));
  }
  
  public VolumeMountsNested<A> editLastVolumeMount() {
    int index = volumeMounts.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumeMounts. The list is empty.");
    return setNewVolumeMountLike(index, buildVolumeMount(index));
  }
  
  public VolumeMountsNested<A> editMatchingVolumeMount(Predicate<VolumeMountsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<volumeMounts.size();i++) { 
    if (predicate.test(volumeMounts.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching volumeMounts. No match found.");
    return setNewVolumeMountLike(index, buildVolumeMount(index));
  }
  
  public String getWorkingDir() {
    return this.workingDir;
  }
  
  public A withWorkingDir(String workingDir) {
    this.workingDir = workingDir;
    return (A) this;
  }
  
  public boolean hasWorkingDir() {
    return this.workingDir != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    InitContainersFluent that = (InitContainersFluent) o;
    if (!java.util.Objects.equals(args, that.args)) return false;
    if (!java.util.Objects.equals(command, that.command)) return false;
    if (!java.util.Objects.equals(env, that.env)) return false;
    if (!java.util.Objects.equals(envFrom, that.envFrom)) return false;
    if (!java.util.Objects.equals(image, that.image)) return false;
    if (!java.util.Objects.equals(imagePullPolicy, that.imagePullPolicy)) return false;
    if (!java.util.Objects.equals(lifecycle, that.lifecycle)) return false;
    if (!java.util.Objects.equals(livenessProbe, that.livenessProbe)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(ports, that.ports)) return false;
    if (!java.util.Objects.equals(readinessProbe, that.readinessProbe)) return false;
    if (!java.util.Objects.equals(resizePolicy, that.resizePolicy)) return false;
    if (!java.util.Objects.equals(resources, that.resources)) return false;
    if (!java.util.Objects.equals(securityContext, that.securityContext)) return false;
    if (!java.util.Objects.equals(startupProbe, that.startupProbe)) return false;
    if (!java.util.Objects.equals(stdin, that.stdin)) return false;
    if (!java.util.Objects.equals(stdinOnce, that.stdinOnce)) return false;
    if (!java.util.Objects.equals(terminationMessagePath, that.terminationMessagePath)) return false;
    if (!java.util.Objects.equals(terminationMessagePolicy, that.terminationMessagePolicy)) return false;
    if (!java.util.Objects.equals(tty, that.tty)) return false;
    if (!java.util.Objects.equals(volumeDevices, that.volumeDevices)) return false;
    if (!java.util.Objects.equals(volumeMounts, that.volumeMounts)) return false;
    if (!java.util.Objects.equals(workingDir, that.workingDir)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(args,  command,  env,  envFrom,  image,  imagePullPolicy,  lifecycle,  livenessProbe,  name,  ports,  readinessProbe,  resizePolicy,  resources,  securityContext,  startupProbe,  stdin,  stdinOnce,  terminationMessagePath,  terminationMessagePolicy,  tty,  volumeDevices,  volumeMounts,  workingDir,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (args != null && !args.isEmpty()) { sb.append("args:"); sb.append(args + ","); }
    if (command != null && !command.isEmpty()) { sb.append("command:"); sb.append(command + ","); }
    if (env != null && !env.isEmpty()) { sb.append("env:"); sb.append(env + ","); }
    if (envFrom != null && !envFrom.isEmpty()) { sb.append("envFrom:"); sb.append(envFrom + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (imagePullPolicy != null) { sb.append("imagePullPolicy:"); sb.append(imagePullPolicy + ","); }
    if (lifecycle != null) { sb.append("lifecycle:"); sb.append(lifecycle + ","); }
    if (livenessProbe != null) { sb.append("livenessProbe:"); sb.append(livenessProbe + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (ports != null && !ports.isEmpty()) { sb.append("ports:"); sb.append(ports + ","); }
    if (readinessProbe != null) { sb.append("readinessProbe:"); sb.append(readinessProbe + ","); }
    if (resizePolicy != null && !resizePolicy.isEmpty()) { sb.append("resizePolicy:"); sb.append(resizePolicy + ","); }
    if (resources != null) { sb.append("resources:"); sb.append(resources + ","); }
    if (securityContext != null) { sb.append("securityContext:"); sb.append(securityContext + ","); }
    if (startupProbe != null) { sb.append("startupProbe:"); sb.append(startupProbe + ","); }
    if (stdin != null) { sb.append("stdin:"); sb.append(stdin + ","); }
    if (stdinOnce != null) { sb.append("stdinOnce:"); sb.append(stdinOnce + ","); }
    if (terminationMessagePath != null) { sb.append("terminationMessagePath:"); sb.append(terminationMessagePath + ","); }
    if (terminationMessagePolicy != null) { sb.append("terminationMessagePolicy:"); sb.append(terminationMessagePolicy + ","); }
    if (tty != null) { sb.append("tty:"); sb.append(tty + ","); }
    if (volumeDevices != null && !volumeDevices.isEmpty()) { sb.append("volumeDevices:"); sb.append(volumeDevices + ","); }
    if (volumeMounts != null && !volumeMounts.isEmpty()) { sb.append("volumeMounts:"); sb.append(volumeMounts + ","); }
    if (workingDir != null) { sb.append("workingDir:"); sb.append(workingDir); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withStdin() {
    return withStdin(true);
  }
  
  public A withStdinOnce() {
    return withStdinOnce(true);
  }
  
  public A withTty() {
    return withTty(true);
  }
  public class EnvNested<N> extends EnvFluent<EnvNested<N>> implements Nested<N>{
    EnvNested(int index,Env item) {
      this.index = index;
      this.builder = new EnvBuilder(this, item);
    }
    EnvBuilder builder;
    int index;
    
    public N and() {
      return (N) InitContainersFluent.this.setToEnv(index,builder.build());
    }
    
    public N endInitcontainersEnv() {
      return and();
    }
    
  
  }
  public class EnvFromNested<N> extends EnvFromFluent<EnvFromNested<N>> implements Nested<N>{
    EnvFromNested(int index,EnvFrom item) {
      this.index = index;
      this.builder = new EnvFromBuilder(this, item);
    }
    EnvFromBuilder builder;
    int index;
    
    public N and() {
      return (N) InitContainersFluent.this.setToEnvFrom(index,builder.build());
    }
    
    public N endInitcontainersEnvFrom() {
      return and();
    }
    
  
  }
  public class LifecycleNested<N> extends LifecycleFluent<LifecycleNested<N>> implements Nested<N>{
    LifecycleNested(Lifecycle item) {
      this.builder = new LifecycleBuilder(this, item);
    }
    LifecycleBuilder builder;
    
    public N and() {
      return (N) InitContainersFluent.this.withLifecycle(builder.build());
    }
    
    public N endLifecycle() {
      return and();
    }
    
  
  }
  public class LivenessProbeNested<N> extends LivenessProbeFluent<LivenessProbeNested<N>> implements Nested<N>{
    LivenessProbeNested(LivenessProbe item) {
      this.builder = new LivenessProbeBuilder(this, item);
    }
    LivenessProbeBuilder builder;
    
    public N and() {
      return (N) InitContainersFluent.this.withLivenessProbe(builder.build());
    }
    
    public N endInitcontainersLivenessProbe() {
      return and();
    }
    
  
  }
  public class PortsNested<N> extends PortsFluent<PortsNested<N>> implements Nested<N>{
    PortsNested(int index,Ports item) {
      this.index = index;
      this.builder = new PortsBuilder(this, item);
    }
    PortsBuilder builder;
    int index;
    
    public N and() {
      return (N) InitContainersFluent.this.setToPorts(index,builder.build());
    }
    
    public N endInitcontainersPort() {
      return and();
    }
    
  
  }
  public class ReadinessProbeNested<N> extends ReadinessProbeFluent<ReadinessProbeNested<N>> implements Nested<N>{
    ReadinessProbeNested(ReadinessProbe item) {
      this.builder = new ReadinessProbeBuilder(this, item);
    }
    ReadinessProbeBuilder builder;
    
    public N and() {
      return (N) InitContainersFluent.this.withReadinessProbe(builder.build());
    }
    
    public N endInitcontainersReadinessProbe() {
      return and();
    }
    
  
  }
  public class ResizePolicyNested<N> extends ResizePolicyFluent<ResizePolicyNested<N>> implements Nested<N>{
    ResizePolicyNested(int index,ResizePolicy item) {
      this.index = index;
      this.builder = new ResizePolicyBuilder(this, item);
    }
    ResizePolicyBuilder builder;
    int index;
    
    public N and() {
      return (N) InitContainersFluent.this.setToResizePolicy(index,builder.build());
    }
    
    public N endInitcontainersResizePolicy() {
      return and();
    }
    
  
  }
  public class ResourcesNested<N> extends ResourcesFluent<ResourcesNested<N>> implements Nested<N>{
    ResourcesNested(Resources item) {
      this.builder = new ResourcesBuilder(this, item);
    }
    ResourcesBuilder builder;
    
    public N and() {
      return (N) InitContainersFluent.this.withResources(builder.build());
    }
    
    public N endInitcontainersResources() {
      return and();
    }
    
  
  }
  public class SecurityContextNested<N> extends SecurityContextFluent<SecurityContextNested<N>> implements Nested<N>{
    SecurityContextNested(SecurityContext item) {
      this.builder = new SecurityContextBuilder(this, item);
    }
    SecurityContextBuilder builder;
    
    public N and() {
      return (N) InitContainersFluent.this.withSecurityContext(builder.build());
    }
    
    public N endSecurityContext() {
      return and();
    }
    
  
  }
  public class StartupProbeNested<N> extends StartupProbeFluent<StartupProbeNested<N>> implements Nested<N>{
    StartupProbeNested(StartupProbe item) {
      this.builder = new StartupProbeBuilder(this, item);
    }
    StartupProbeBuilder builder;
    
    public N and() {
      return (N) InitContainersFluent.this.withStartupProbe(builder.build());
    }
    
    public N endInitcontainersStartupProbe() {
      return and();
    }
    
  
  }
  public class VolumeDevicesNested<N> extends VolumeDevicesFluent<VolumeDevicesNested<N>> implements Nested<N>{
    VolumeDevicesNested(int index,VolumeDevices item) {
      this.index = index;
      this.builder = new VolumeDevicesBuilder(this, item);
    }
    VolumeDevicesBuilder builder;
    int index;
    
    public N and() {
      return (N) InitContainersFluent.this.setToVolumeDevices(index,builder.build());
    }
    
    public N endInitcontainersVolumeDevice() {
      return and();
    }
    
  
  }
  public class VolumeMountsNested<N> extends VolumeMountsFluent<VolumeMountsNested<N>> implements Nested<N>{
    VolumeMountsNested(int index,VolumeMounts item) {
      this.index = index;
      this.builder = new VolumeMountsBuilder(this, item);
    }
    VolumeMountsBuilder builder;
    int index;
    
    public N and() {
      return (N) InitContainersFluent.this.setToVolumeMounts(index,builder.build());
    }
    
    public N endInitcontainersVolumeMount() {
      return and();
    }
    
  
  }

}