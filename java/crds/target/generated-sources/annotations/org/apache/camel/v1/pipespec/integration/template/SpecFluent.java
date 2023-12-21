package org.apache.camel.v1.pipespec.integration.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import org.apache.camel.v1.pipespec.integration.template.spec.TopologySpreadConstraintsBuilder;
import java.lang.SuppressWarnings;
import org.apache.camel.v1.pipespec.integration.template.spec.TopologySpreadConstraints;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.pipespec.integration.template.spec.Containers;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import org.apache.camel.v1.pipespec.integration.template.spec.ContainersBuilder;
import org.apache.camel.v1.pipespec.integration.template.spec.TopologySpreadConstraintsFluent;
import org.apache.camel.v1.pipespec.integration.template.spec.SecurityContextBuilder;
import org.apache.camel.v1.pipespec.integration.template.spec.Volumes;
import org.apache.camel.v1.pipespec.integration.template.spec.VolumesBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import org.apache.camel.v1.pipespec.integration.template.spec.EphemeralContainersBuilder;
import org.apache.camel.v1.pipespec.integration.template.spec.ContainersFluent;
import org.apache.camel.v1.pipespec.integration.template.spec.InitContainers;
import org.apache.camel.v1.pipespec.integration.template.spec.InitContainersBuilder;
import org.apache.camel.v1.pipespec.integration.template.spec.VolumesFluent;
import org.apache.camel.v1.pipespec.integration.template.spec.EphemeralContainersFluent;
import org.apache.camel.v1.pipespec.integration.template.spec.EphemeralContainers;
import java.lang.Long;
import org.apache.camel.v1.pipespec.integration.template.spec.SecurityContext;
import org.apache.camel.v1.pipespec.integration.template.spec.SecurityContextFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import org.apache.camel.v1.pipespec.integration.template.spec.InitContainersFluent;

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
  private Long activeDeadlineSeconds;
  private ArrayList<ContainersBuilder> containers;
  private String dnsPolicy;
  private ArrayList<EphemeralContainersBuilder> ephemeralContainers;
  private ArrayList<InitContainersBuilder> initContainers;
  private Map<String,String> nodeSelector;
  private String restartPolicy;
  private SecurityContextBuilder securityContext;
  private Long terminationGracePeriodSeconds;
  private ArrayList<TopologySpreadConstraintsBuilder> topologySpreadConstraints;
  private ArrayList<VolumesBuilder> volumes;
  
  protected void copyInstance(Spec instance) {
    instance = (instance != null ? instance : new Spec());
    if (instance != null) {
          this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());
          this.withContainers(instance.getContainers());
          this.withDnsPolicy(instance.getDnsPolicy());
          this.withEphemeralContainers(instance.getEphemeralContainers());
          this.withInitContainers(instance.getInitContainers());
          this.withNodeSelector(instance.getNodeSelector());
          this.withRestartPolicy(instance.getRestartPolicy());
          this.withSecurityContext(instance.getSecurityContext());
          this.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds());
          this.withTopologySpreadConstraints(instance.getTopologySpreadConstraints());
          this.withVolumes(instance.getVolumes());
        }
  }
  
  public Long getActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds;
  }
  
  public A withActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return (A) this;
  }
  
  public boolean hasActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds != null;
  }
  
  public A addToContainers(int index,Containers item) {
    if (this.containers == null) {this.containers = new ArrayList<ContainersBuilder>();}
    ContainersBuilder builder = new ContainersBuilder(item);
    if (index < 0 || index >= containers.size()) { _visitables.get("containers").add(builder); containers.add(builder); } else { _visitables.get("containers").add(index, builder); containers.add(index, builder);}
    return (A)this;
  }
  
  public A setToContainers(int index,Containers item) {
    if (this.containers == null) {this.containers = new ArrayList<ContainersBuilder>();}
    ContainersBuilder builder = new ContainersBuilder(item);
    if (index < 0 || index >= containers.size()) { _visitables.get("containers").add(builder); containers.add(builder); } else { _visitables.get("containers").set(index, builder); containers.set(index, builder);}
    return (A)this;
  }
  
  public A addToContainers(org.apache.camel.v1.pipespec.integration.template.spec.Containers... items) {
    if (this.containers == null) {this.containers = new ArrayList<ContainersBuilder>();}
    for (Containers item : items) {ContainersBuilder builder = new ContainersBuilder(item);_visitables.get("containers").add(builder);this.containers.add(builder);} return (A)this;
  }
  
  public A addAllToIntegrationContainers(Collection<Containers> items) {
    if (this.containers == null) {this.containers = new ArrayList<ContainersBuilder>();}
    for (Containers item : items) {ContainersBuilder builder = new ContainersBuilder(item);_visitables.get("containers").add(builder);this.containers.add(builder);} return (A)this;
  }
  
  public A removeFromContainers(org.apache.camel.v1.pipespec.integration.template.spec.Containers... items) {
    if (this.containers == null) return (A)this;
    for (Containers item : items) {ContainersBuilder builder = new ContainersBuilder(item);_visitables.get("containers").remove(builder); this.containers.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIntegrationContainers(Collection<Containers> items) {
    if (this.containers == null) return (A)this;
    for (Containers item : items) {ContainersBuilder builder = new ContainersBuilder(item);_visitables.get("containers").remove(builder); this.containers.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIntegrationContainers(Predicate<ContainersBuilder> predicate) {
    if (containers == null) return (A) this;
    final Iterator<ContainersBuilder> each = containers.iterator();
    final List visitables = _visitables.get("containers");
    while (each.hasNext()) {
      ContainersBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Containers> buildContainers() {
    return this.containers != null ? build(containers) : null;
  }
  
  public Containers buildContainer(int index) {
    return this.containers.get(index).build();
  }
  
  public Containers buildFirstContainer() {
    return this.containers.get(0).build();
  }
  
  public Containers buildLastContainer() {
    return this.containers.get(containers.size() - 1).build();
  }
  
  public Containers buildMatchingContainer(Predicate<ContainersBuilder> predicate) {
      for (ContainersBuilder item : containers) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingContainer(Predicate<ContainersBuilder> predicate) {
      for (ContainersBuilder item : containers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withContainers(List<Containers> containers) {
    if (this.containers != null) {
      this._visitables.get("containers").clear();
    }
    if (containers != null) {
        this.containers = new ArrayList();
        for (Containers item : containers) {
          this.addToContainers(item);
        }
    } else {
      this.containers = null;
    }
    return (A) this;
  }
  
  public A withContainers(org.apache.camel.v1.pipespec.integration.template.spec.Containers... containers) {
    if (this.containers != null) {
        this.containers.clear();
        _visitables.remove("containers");
    }
    if (containers != null) {
      for (Containers item : containers) {
        this.addToContainers(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasContainers() {
    return this.containers != null && !this.containers.isEmpty();
  }
  
  public ContainersNested<A> addNewContainer() {
    return new ContainersNested(-1, null);
  }
  
  public ContainersNested<A> addNewContainerLike(Containers item) {
    return new ContainersNested(-1, item);
  }
  
  public ContainersNested<A> setNewContainerLike(int index,Containers item) {
    return new ContainersNested(index, item);
  }
  
  public ContainersNested<A> editContainer(int index) {
    if (containers.size() <= index) throw new RuntimeException("Can't edit containers. Index exceeds size.");
    return setNewContainerLike(index, buildContainer(index));
  }
  
  public ContainersNested<A> editFirstContainer() {
    if (containers.size() == 0) throw new RuntimeException("Can't edit first containers. The list is empty.");
    return setNewContainerLike(0, buildContainer(0));
  }
  
  public ContainersNested<A> editLastContainer() {
    int index = containers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last containers. The list is empty.");
    return setNewContainerLike(index, buildContainer(index));
  }
  
  public ContainersNested<A> editMatchingContainer(Predicate<ContainersBuilder> predicate) {
    int index = -1;
    for (int i=0;i<containers.size();i++) { 
    if (predicate.test(containers.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching containers. No match found.");
    return setNewContainerLike(index, buildContainer(index));
  }
  
  public String getDnsPolicy() {
    return this.dnsPolicy;
  }
  
  public A withDnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
    return (A) this;
  }
  
  public boolean hasDnsPolicy() {
    return this.dnsPolicy != null;
  }
  
  public A addToEphemeralContainers(int index,EphemeralContainers item) {
    if (this.ephemeralContainers == null) {this.ephemeralContainers = new ArrayList<EphemeralContainersBuilder>();}
    EphemeralContainersBuilder builder = new EphemeralContainersBuilder(item);
    if (index < 0 || index >= ephemeralContainers.size()) { _visitables.get("ephemeralContainers").add(builder); ephemeralContainers.add(builder); } else { _visitables.get("ephemeralContainers").add(index, builder); ephemeralContainers.add(index, builder);}
    return (A)this;
  }
  
  public A setToEphemeralContainers(int index,EphemeralContainers item) {
    if (this.ephemeralContainers == null) {this.ephemeralContainers = new ArrayList<EphemeralContainersBuilder>();}
    EphemeralContainersBuilder builder = new EphemeralContainersBuilder(item);
    if (index < 0 || index >= ephemeralContainers.size()) { _visitables.get("ephemeralContainers").add(builder); ephemeralContainers.add(builder); } else { _visitables.get("ephemeralContainers").set(index, builder); ephemeralContainers.set(index, builder);}
    return (A)this;
  }
  
  public A addToEphemeralContainers(org.apache.camel.v1.pipespec.integration.template.spec.EphemeralContainers... items) {
    if (this.ephemeralContainers == null) {this.ephemeralContainers = new ArrayList<EphemeralContainersBuilder>();}
    for (EphemeralContainers item : items) {EphemeralContainersBuilder builder = new EphemeralContainersBuilder(item);_visitables.get("ephemeralContainers").add(builder);this.ephemeralContainers.add(builder);} return (A)this;
  }
  
  public A addAllToIntegrationEphemeralContainers(Collection<EphemeralContainers> items) {
    if (this.ephemeralContainers == null) {this.ephemeralContainers = new ArrayList<EphemeralContainersBuilder>();}
    for (EphemeralContainers item : items) {EphemeralContainersBuilder builder = new EphemeralContainersBuilder(item);_visitables.get("ephemeralContainers").add(builder);this.ephemeralContainers.add(builder);} return (A)this;
  }
  
  public A removeFromEphemeralContainers(org.apache.camel.v1.pipespec.integration.template.spec.EphemeralContainers... items) {
    if (this.ephemeralContainers == null) return (A)this;
    for (EphemeralContainers item : items) {EphemeralContainersBuilder builder = new EphemeralContainersBuilder(item);_visitables.get("ephemeralContainers").remove(builder); this.ephemeralContainers.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIntegrationEphemeralContainers(Collection<EphemeralContainers> items) {
    if (this.ephemeralContainers == null) return (A)this;
    for (EphemeralContainers item : items) {EphemeralContainersBuilder builder = new EphemeralContainersBuilder(item);_visitables.get("ephemeralContainers").remove(builder); this.ephemeralContainers.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIntegrationEphemeralContainers(Predicate<EphemeralContainersBuilder> predicate) {
    if (ephemeralContainers == null) return (A) this;
    final Iterator<EphemeralContainersBuilder> each = ephemeralContainers.iterator();
    final List visitables = _visitables.get("ephemeralContainers");
    while (each.hasNext()) {
      EphemeralContainersBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<EphemeralContainers> buildEphemeralContainers() {
    return this.ephemeralContainers != null ? build(ephemeralContainers) : null;
  }
  
  public EphemeralContainers buildEphemeralContainer(int index) {
    return this.ephemeralContainers.get(index).build();
  }
  
  public EphemeralContainers buildFirstEphemeralContainer() {
    return this.ephemeralContainers.get(0).build();
  }
  
  public EphemeralContainers buildLastEphemeralContainer() {
    return this.ephemeralContainers.get(ephemeralContainers.size() - 1).build();
  }
  
  public EphemeralContainers buildMatchingEphemeralContainer(Predicate<EphemeralContainersBuilder> predicate) {
      for (EphemeralContainersBuilder item : ephemeralContainers) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingEphemeralContainer(Predicate<EphemeralContainersBuilder> predicate) {
      for (EphemeralContainersBuilder item : ephemeralContainers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEphemeralContainers(List<EphemeralContainers> ephemeralContainers) {
    if (this.ephemeralContainers != null) {
      this._visitables.get("ephemeralContainers").clear();
    }
    if (ephemeralContainers != null) {
        this.ephemeralContainers = new ArrayList();
        for (EphemeralContainers item : ephemeralContainers) {
          this.addToEphemeralContainers(item);
        }
    } else {
      this.ephemeralContainers = null;
    }
    return (A) this;
  }
  
  public A withEphemeralContainers(org.apache.camel.v1.pipespec.integration.template.spec.EphemeralContainers... ephemeralContainers) {
    if (this.ephemeralContainers != null) {
        this.ephemeralContainers.clear();
        _visitables.remove("ephemeralContainers");
    }
    if (ephemeralContainers != null) {
      for (EphemeralContainers item : ephemeralContainers) {
        this.addToEphemeralContainers(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEphemeralContainers() {
    return this.ephemeralContainers != null && !this.ephemeralContainers.isEmpty();
  }
  
  public EphemeralContainersNested<A> addNewEphemeralContainer() {
    return new EphemeralContainersNested(-1, null);
  }
  
  public EphemeralContainersNested<A> addNewEphemeralContainerLike(EphemeralContainers item) {
    return new EphemeralContainersNested(-1, item);
  }
  
  public EphemeralContainersNested<A> setNewEphemeralContainerLike(int index,EphemeralContainers item) {
    return new EphemeralContainersNested(index, item);
  }
  
  public EphemeralContainersNested<A> editEphemeralContainer(int index) {
    if (ephemeralContainers.size() <= index) throw new RuntimeException("Can't edit ephemeralContainers. Index exceeds size.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }
  
  public EphemeralContainersNested<A> editFirstEphemeralContainer() {
    if (ephemeralContainers.size() == 0) throw new RuntimeException("Can't edit first ephemeralContainers. The list is empty.");
    return setNewEphemeralContainerLike(0, buildEphemeralContainer(0));
  }
  
  public EphemeralContainersNested<A> editLastEphemeralContainer() {
    int index = ephemeralContainers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ephemeralContainers. The list is empty.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }
  
  public EphemeralContainersNested<A> editMatchingEphemeralContainer(Predicate<EphemeralContainersBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ephemeralContainers.size();i++) { 
    if (predicate.test(ephemeralContainers.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ephemeralContainers. No match found.");
    return setNewEphemeralContainerLike(index, buildEphemeralContainer(index));
  }
  
  public A addToInitContainers(int index,InitContainers item) {
    if (this.initContainers == null) {this.initContainers = new ArrayList<InitContainersBuilder>();}
    InitContainersBuilder builder = new InitContainersBuilder(item);
    if (index < 0 || index >= initContainers.size()) { _visitables.get("initContainers").add(builder); initContainers.add(builder); } else { _visitables.get("initContainers").add(index, builder); initContainers.add(index, builder);}
    return (A)this;
  }
  
  public A setToInitContainers(int index,InitContainers item) {
    if (this.initContainers == null) {this.initContainers = new ArrayList<InitContainersBuilder>();}
    InitContainersBuilder builder = new InitContainersBuilder(item);
    if (index < 0 || index >= initContainers.size()) { _visitables.get("initContainers").add(builder); initContainers.add(builder); } else { _visitables.get("initContainers").set(index, builder); initContainers.set(index, builder);}
    return (A)this;
  }
  
  public A addToInitContainers(org.apache.camel.v1.pipespec.integration.template.spec.InitContainers... items) {
    if (this.initContainers == null) {this.initContainers = new ArrayList<InitContainersBuilder>();}
    for (InitContainers item : items) {InitContainersBuilder builder = new InitContainersBuilder(item);_visitables.get("initContainers").add(builder);this.initContainers.add(builder);} return (A)this;
  }
  
  public A addAllToIntegrationInitContainers(Collection<InitContainers> items) {
    if (this.initContainers == null) {this.initContainers = new ArrayList<InitContainersBuilder>();}
    for (InitContainers item : items) {InitContainersBuilder builder = new InitContainersBuilder(item);_visitables.get("initContainers").add(builder);this.initContainers.add(builder);} return (A)this;
  }
  
  public A removeFromInitContainers(org.apache.camel.v1.pipespec.integration.template.spec.InitContainers... items) {
    if (this.initContainers == null) return (A)this;
    for (InitContainers item : items) {InitContainersBuilder builder = new InitContainersBuilder(item);_visitables.get("initContainers").remove(builder); this.initContainers.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIntegrationInitContainers(Collection<InitContainers> items) {
    if (this.initContainers == null) return (A)this;
    for (InitContainers item : items) {InitContainersBuilder builder = new InitContainersBuilder(item);_visitables.get("initContainers").remove(builder); this.initContainers.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIntegrationInitContainers(Predicate<InitContainersBuilder> predicate) {
    if (initContainers == null) return (A) this;
    final Iterator<InitContainersBuilder> each = initContainers.iterator();
    final List visitables = _visitables.get("initContainers");
    while (each.hasNext()) {
      InitContainersBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<InitContainers> buildInitContainers() {
    return this.initContainers != null ? build(initContainers) : null;
  }
  
  public InitContainers buildInitContainer(int index) {
    return this.initContainers.get(index).build();
  }
  
  public InitContainers buildFirstInitContainer() {
    return this.initContainers.get(0).build();
  }
  
  public InitContainers buildLastInitContainer() {
    return this.initContainers.get(initContainers.size() - 1).build();
  }
  
  public InitContainers buildMatchingInitContainer(Predicate<InitContainersBuilder> predicate) {
      for (InitContainersBuilder item : initContainers) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingInitContainer(Predicate<InitContainersBuilder> predicate) {
      for (InitContainersBuilder item : initContainers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withInitContainers(List<InitContainers> initContainers) {
    if (this.initContainers != null) {
      this._visitables.get("initContainers").clear();
    }
    if (initContainers != null) {
        this.initContainers = new ArrayList();
        for (InitContainers item : initContainers) {
          this.addToInitContainers(item);
        }
    } else {
      this.initContainers = null;
    }
    return (A) this;
  }
  
  public A withInitContainers(org.apache.camel.v1.pipespec.integration.template.spec.InitContainers... initContainers) {
    if (this.initContainers != null) {
        this.initContainers.clear();
        _visitables.remove("initContainers");
    }
    if (initContainers != null) {
      for (InitContainers item : initContainers) {
        this.addToInitContainers(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasInitContainers() {
    return this.initContainers != null && !this.initContainers.isEmpty();
  }
  
  public InitContainersNested<A> addNewInitContainer() {
    return new InitContainersNested(-1, null);
  }
  
  public InitContainersNested<A> addNewInitContainerLike(InitContainers item) {
    return new InitContainersNested(-1, item);
  }
  
  public InitContainersNested<A> setNewInitContainerLike(int index,InitContainers item) {
    return new InitContainersNested(index, item);
  }
  
  public InitContainersNested<A> editInitContainer(int index) {
    if (initContainers.size() <= index) throw new RuntimeException("Can't edit initContainers. Index exceeds size.");
    return setNewInitContainerLike(index, buildInitContainer(index));
  }
  
  public InitContainersNested<A> editFirstInitContainer() {
    if (initContainers.size() == 0) throw new RuntimeException("Can't edit first initContainers. The list is empty.");
    return setNewInitContainerLike(0, buildInitContainer(0));
  }
  
  public InitContainersNested<A> editLastInitContainer() {
    int index = initContainers.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last initContainers. The list is empty.");
    return setNewInitContainerLike(index, buildInitContainer(index));
  }
  
  public InitContainersNested<A> editMatchingInitContainer(Predicate<InitContainersBuilder> predicate) {
    int index = -1;
    for (int i=0;i<initContainers.size();i++) { 
    if (predicate.test(initContainers.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching initContainers. No match found.");
    return setNewInitContainerLike(index, buildInitContainer(index));
  }
  
  public A addToNodeSelector(String key,String value) {
    if(this.nodeSelector == null && key != null && value != null) { this.nodeSelector = new LinkedHashMap(); }
    if(key != null && value != null) {this.nodeSelector.put(key, value);} return (A)this;
  }
  
  public A addToNodeSelector(Map<String,String> map) {
    if(this.nodeSelector == null && map != null) { this.nodeSelector = new LinkedHashMap(); }
    if(map != null) { this.nodeSelector.putAll(map);} return (A)this;
  }
  
  public A removeFromNodeSelector(String key) {
    if(this.nodeSelector == null) { return (A) this; }
    if(key != null && this.nodeSelector != null) {this.nodeSelector.remove(key);} return (A)this;
  }
  
  public A removeFromNodeSelector(Map<String,String> map) {
    if(this.nodeSelector == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.nodeSelector != null){this.nodeSelector.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getNodeSelector() {
    return this.nodeSelector;
  }
  
  public <K,V>A withNodeSelector(Map<String,String> nodeSelector) {
    if (nodeSelector == null) {
      this.nodeSelector = null;
    } else {
      this.nodeSelector = new LinkedHashMap(nodeSelector);
    }
    return (A) this;
  }
  
  public boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }
  
  public String getRestartPolicy() {
    return this.restartPolicy;
  }
  
  public A withRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return (A) this;
  }
  
  public boolean hasRestartPolicy() {
    return this.restartPolicy != null;
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
  
  public Long getTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds;
  }
  
  public A withTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return (A) this;
  }
  
  public boolean hasTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds != null;
  }
  
  public A addToTopologySpreadConstraints(int index,TopologySpreadConstraints item) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<TopologySpreadConstraintsBuilder>();}
    TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);
    if (index < 0 || index >= topologySpreadConstraints.size()) { _visitables.get("topologySpreadConstraints").add(builder); topologySpreadConstraints.add(builder); } else { _visitables.get("topologySpreadConstraints").add(index, builder); topologySpreadConstraints.add(index, builder);}
    return (A)this;
  }
  
  public A setToTopologySpreadConstraints(int index,TopologySpreadConstraints item) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<TopologySpreadConstraintsBuilder>();}
    TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);
    if (index < 0 || index >= topologySpreadConstraints.size()) { _visitables.get("topologySpreadConstraints").add(builder); topologySpreadConstraints.add(builder); } else { _visitables.get("topologySpreadConstraints").set(index, builder); topologySpreadConstraints.set(index, builder);}
    return (A)this;
  }
  
  public A addToTopologySpreadConstraints(org.apache.camel.v1.pipespec.integration.template.spec.TopologySpreadConstraints... items) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<TopologySpreadConstraintsBuilder>();}
    for (TopologySpreadConstraints item : items) {TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);_visitables.get("topologySpreadConstraints").add(builder);this.topologySpreadConstraints.add(builder);} return (A)this;
  }
  
  public A addAllToIntegrationTopologySpreadConstraints(Collection<TopologySpreadConstraints> items) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<TopologySpreadConstraintsBuilder>();}
    for (TopologySpreadConstraints item : items) {TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);_visitables.get("topologySpreadConstraints").add(builder);this.topologySpreadConstraints.add(builder);} return (A)this;
  }
  
  public A removeFromTopologySpreadConstraints(org.apache.camel.v1.pipespec.integration.template.spec.TopologySpreadConstraints... items) {
    if (this.topologySpreadConstraints == null) return (A)this;
    for (TopologySpreadConstraints item : items) {TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);_visitables.get("topologySpreadConstraints").remove(builder); this.topologySpreadConstraints.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIntegrationTopologySpreadConstraints(Collection<TopologySpreadConstraints> items) {
    if (this.topologySpreadConstraints == null) return (A)this;
    for (TopologySpreadConstraints item : items) {TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);_visitables.get("topologySpreadConstraints").remove(builder); this.topologySpreadConstraints.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIntegrationTopologySpreadConstraints(Predicate<TopologySpreadConstraintsBuilder> predicate) {
    if (topologySpreadConstraints == null) return (A) this;
    final Iterator<TopologySpreadConstraintsBuilder> each = topologySpreadConstraints.iterator();
    final List visitables = _visitables.get("topologySpreadConstraints");
    while (each.hasNext()) {
      TopologySpreadConstraintsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<TopologySpreadConstraints> buildTopologySpreadConstraints() {
    return this.topologySpreadConstraints != null ? build(topologySpreadConstraints) : null;
  }
  
  public TopologySpreadConstraints buildTopologySpreadConstraint(int index) {
    return this.topologySpreadConstraints.get(index).build();
  }
  
  public TopologySpreadConstraints buildFirstTopologySpreadConstraint() {
    return this.topologySpreadConstraints.get(0).build();
  }
  
  public TopologySpreadConstraints buildLastTopologySpreadConstraint() {
    return this.topologySpreadConstraints.get(topologySpreadConstraints.size() - 1).build();
  }
  
  public TopologySpreadConstraints buildMatchingTopologySpreadConstraint(Predicate<TopologySpreadConstraintsBuilder> predicate) {
      for (TopologySpreadConstraintsBuilder item : topologySpreadConstraints) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingTopologySpreadConstraint(Predicate<TopologySpreadConstraintsBuilder> predicate) {
      for (TopologySpreadConstraintsBuilder item : topologySpreadConstraints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTopologySpreadConstraints(List<TopologySpreadConstraints> topologySpreadConstraints) {
    if (this.topologySpreadConstraints != null) {
      this._visitables.get("topologySpreadConstraints").clear();
    }
    if (topologySpreadConstraints != null) {
        this.topologySpreadConstraints = new ArrayList();
        for (TopologySpreadConstraints item : topologySpreadConstraints) {
          this.addToTopologySpreadConstraints(item);
        }
    } else {
      this.topologySpreadConstraints = null;
    }
    return (A) this;
  }
  
  public A withTopologySpreadConstraints(org.apache.camel.v1.pipespec.integration.template.spec.TopologySpreadConstraints... topologySpreadConstraints) {
    if (this.topologySpreadConstraints != null) {
        this.topologySpreadConstraints.clear();
        _visitables.remove("topologySpreadConstraints");
    }
    if (topologySpreadConstraints != null) {
      for (TopologySpreadConstraints item : topologySpreadConstraints) {
        this.addToTopologySpreadConstraints(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTopologySpreadConstraints() {
    return this.topologySpreadConstraints != null && !this.topologySpreadConstraints.isEmpty();
  }
  
  public TopologySpreadConstraintsNested<A> addNewTopologySpreadConstraint() {
    return new TopologySpreadConstraintsNested(-1, null);
  }
  
  public TopologySpreadConstraintsNested<A> addNewTopologySpreadConstraintLike(TopologySpreadConstraints item) {
    return new TopologySpreadConstraintsNested(-1, item);
  }
  
  public TopologySpreadConstraintsNested<A> setNewTopologySpreadConstraintLike(int index,TopologySpreadConstraints item) {
    return new TopologySpreadConstraintsNested(index, item);
  }
  
  public TopologySpreadConstraintsNested<A> editTopologySpreadConstraint(int index) {
    if (topologySpreadConstraints.size() <= index) throw new RuntimeException("Can't edit topologySpreadConstraints. Index exceeds size.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }
  
  public TopologySpreadConstraintsNested<A> editFirstTopologySpreadConstraint() {
    if (topologySpreadConstraints.size() == 0) throw new RuntimeException("Can't edit first topologySpreadConstraints. The list is empty.");
    return setNewTopologySpreadConstraintLike(0, buildTopologySpreadConstraint(0));
  }
  
  public TopologySpreadConstraintsNested<A> editLastTopologySpreadConstraint() {
    int index = topologySpreadConstraints.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last topologySpreadConstraints. The list is empty.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }
  
  public TopologySpreadConstraintsNested<A> editMatchingTopologySpreadConstraint(Predicate<TopologySpreadConstraintsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<topologySpreadConstraints.size();i++) { 
    if (predicate.test(topologySpreadConstraints.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching topologySpreadConstraints. No match found.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }
  
  public A addToVolumes(int index,Volumes item) {
    if (this.volumes == null) {this.volumes = new ArrayList<VolumesBuilder>();}
    VolumesBuilder builder = new VolumesBuilder(item);
    if (index < 0 || index >= volumes.size()) { _visitables.get("volumes").add(builder); volumes.add(builder); } else { _visitables.get("volumes").add(index, builder); volumes.add(index, builder);}
    return (A)this;
  }
  
  public A setToVolumes(int index,Volumes item) {
    if (this.volumes == null) {this.volumes = new ArrayList<VolumesBuilder>();}
    VolumesBuilder builder = new VolumesBuilder(item);
    if (index < 0 || index >= volumes.size()) { _visitables.get("volumes").add(builder); volumes.add(builder); } else { _visitables.get("volumes").set(index, builder); volumes.set(index, builder);}
    return (A)this;
  }
  
  public A addToVolumes(org.apache.camel.v1.pipespec.integration.template.spec.Volumes... items) {
    if (this.volumes == null) {this.volumes = new ArrayList<VolumesBuilder>();}
    for (Volumes item : items) {VolumesBuilder builder = new VolumesBuilder(item);_visitables.get("volumes").add(builder);this.volumes.add(builder);} return (A)this;
  }
  
  public A addAllToIntegrationVolumes(Collection<Volumes> items) {
    if (this.volumes == null) {this.volumes = new ArrayList<VolumesBuilder>();}
    for (Volumes item : items) {VolumesBuilder builder = new VolumesBuilder(item);_visitables.get("volumes").add(builder);this.volumes.add(builder);} return (A)this;
  }
  
  public A removeFromVolumes(org.apache.camel.v1.pipespec.integration.template.spec.Volumes... items) {
    if (this.volumes == null) return (A)this;
    for (Volumes item : items) {VolumesBuilder builder = new VolumesBuilder(item);_visitables.get("volumes").remove(builder); this.volumes.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIntegrationVolumes(Collection<Volumes> items) {
    if (this.volumes == null) return (A)this;
    for (Volumes item : items) {VolumesBuilder builder = new VolumesBuilder(item);_visitables.get("volumes").remove(builder); this.volumes.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIntegrationVolumes(Predicate<VolumesBuilder> predicate) {
    if (volumes == null) return (A) this;
    final Iterator<VolumesBuilder> each = volumes.iterator();
    final List visitables = _visitables.get("volumes");
    while (each.hasNext()) {
      VolumesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Volumes> buildVolumes() {
    return this.volumes != null ? build(volumes) : null;
  }
  
  public Volumes buildVolume(int index) {
    return this.volumes.get(index).build();
  }
  
  public Volumes buildFirstVolume() {
    return this.volumes.get(0).build();
  }
  
  public Volumes buildLastVolume() {
    return this.volumes.get(volumes.size() - 1).build();
  }
  
  public Volumes buildMatchingVolume(Predicate<VolumesBuilder> predicate) {
      for (VolumesBuilder item : volumes) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVolume(Predicate<VolumesBuilder> predicate) {
      for (VolumesBuilder item : volumes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVolumes(List<Volumes> volumes) {
    if (this.volumes != null) {
      this._visitables.get("volumes").clear();
    }
    if (volumes != null) {
        this.volumes = new ArrayList();
        for (Volumes item : volumes) {
          this.addToVolumes(item);
        }
    } else {
      this.volumes = null;
    }
    return (A) this;
  }
  
  public A withVolumes(org.apache.camel.v1.pipespec.integration.template.spec.Volumes... volumes) {
    if (this.volumes != null) {
        this.volumes.clear();
        _visitables.remove("volumes");
    }
    if (volumes != null) {
      for (Volumes item : volumes) {
        this.addToVolumes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVolumes() {
    return this.volumes != null && !this.volumes.isEmpty();
  }
  
  public VolumesNested<A> addNewVolume() {
    return new VolumesNested(-1, null);
  }
  
  public VolumesNested<A> addNewVolumeLike(Volumes item) {
    return new VolumesNested(-1, item);
  }
  
  public VolumesNested<A> setNewVolumeLike(int index,Volumes item) {
    return new VolumesNested(index, item);
  }
  
  public VolumesNested<A> editVolume(int index) {
    if (volumes.size() <= index) throw new RuntimeException("Can't edit volumes. Index exceeds size.");
    return setNewVolumeLike(index, buildVolume(index));
  }
  
  public VolumesNested<A> editFirstVolume() {
    if (volumes.size() == 0) throw new RuntimeException("Can't edit first volumes. The list is empty.");
    return setNewVolumeLike(0, buildVolume(0));
  }
  
  public VolumesNested<A> editLastVolume() {
    int index = volumes.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumes. The list is empty.");
    return setNewVolumeLike(index, buildVolume(index));
  }
  
  public VolumesNested<A> editMatchingVolume(Predicate<VolumesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<volumes.size();i++) { 
    if (predicate.test(volumes.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching volumes. No match found.");
    return setNewVolumeLike(index, buildVolume(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    SpecFluent that = (SpecFluent) o;
    if (!java.util.Objects.equals(activeDeadlineSeconds, that.activeDeadlineSeconds)) return false;
    if (!java.util.Objects.equals(containers, that.containers)) return false;
    if (!java.util.Objects.equals(dnsPolicy, that.dnsPolicy)) return false;
    if (!java.util.Objects.equals(ephemeralContainers, that.ephemeralContainers)) return false;
    if (!java.util.Objects.equals(initContainers, that.initContainers)) return false;
    if (!java.util.Objects.equals(nodeSelector, that.nodeSelector)) return false;
    if (!java.util.Objects.equals(restartPolicy, that.restartPolicy)) return false;
    if (!java.util.Objects.equals(securityContext, that.securityContext)) return false;
    if (!java.util.Objects.equals(terminationGracePeriodSeconds, that.terminationGracePeriodSeconds)) return false;
    if (!java.util.Objects.equals(topologySpreadConstraints, that.topologySpreadConstraints)) return false;
    if (!java.util.Objects.equals(volumes, that.volumes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(activeDeadlineSeconds,  containers,  dnsPolicy,  ephemeralContainers,  initContainers,  nodeSelector,  restartPolicy,  securityContext,  terminationGracePeriodSeconds,  topologySpreadConstraints,  volumes,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (activeDeadlineSeconds != null) { sb.append("activeDeadlineSeconds:"); sb.append(activeDeadlineSeconds + ","); }
    if (containers != null && !containers.isEmpty()) { sb.append("containers:"); sb.append(containers + ","); }
    if (dnsPolicy != null) { sb.append("dnsPolicy:"); sb.append(dnsPolicy + ","); }
    if (ephemeralContainers != null && !ephemeralContainers.isEmpty()) { sb.append("ephemeralContainers:"); sb.append(ephemeralContainers + ","); }
    if (initContainers != null && !initContainers.isEmpty()) { sb.append("initContainers:"); sb.append(initContainers + ","); }
    if (nodeSelector != null && !nodeSelector.isEmpty()) { sb.append("nodeSelector:"); sb.append(nodeSelector + ","); }
    if (restartPolicy != null) { sb.append("restartPolicy:"); sb.append(restartPolicy + ","); }
    if (securityContext != null) { sb.append("securityContext:"); sb.append(securityContext + ","); }
    if (terminationGracePeriodSeconds != null) { sb.append("terminationGracePeriodSeconds:"); sb.append(terminationGracePeriodSeconds + ","); }
    if (topologySpreadConstraints != null && !topologySpreadConstraints.isEmpty()) { sb.append("topologySpreadConstraints:"); sb.append(topologySpreadConstraints + ","); }
    if (volumes != null && !volumes.isEmpty()) { sb.append("volumes:"); sb.append(volumes); }
    sb.append("}");
    return sb.toString();
  }
  public class ContainersNested<N> extends ContainersFluent<ContainersNested<N>> implements Nested<N>{
    ContainersNested(int index,Containers item) {
      this.index = index;
      this.builder = new ContainersBuilder(this, item);
    }
    ContainersBuilder builder;
    int index;
    
    public N and() {
      return (N) SpecFluent.this.setToContainers(index,builder.build());
    }
    
    public N endIntegrationContainer() {
      return and();
    }
    
  
  }
  public class EphemeralContainersNested<N> extends EphemeralContainersFluent<EphemeralContainersNested<N>> implements Nested<N>{
    EphemeralContainersNested(int index,EphemeralContainers item) {
      this.index = index;
      this.builder = new EphemeralContainersBuilder(this, item);
    }
    EphemeralContainersBuilder builder;
    int index;
    
    public N and() {
      return (N) SpecFluent.this.setToEphemeralContainers(index,builder.build());
    }
    
    public N endIntegrationEphemeralContainer() {
      return and();
    }
    
  
  }
  public class InitContainersNested<N> extends InitContainersFluent<InitContainersNested<N>> implements Nested<N>{
    InitContainersNested(int index,InitContainers item) {
      this.index = index;
      this.builder = new InitContainersBuilder(this, item);
    }
    InitContainersBuilder builder;
    int index;
    
    public N and() {
      return (N) SpecFluent.this.setToInitContainers(index,builder.build());
    }
    
    public N endIntegrationInitContainer() {
      return and();
    }
    
  
  }
  public class SecurityContextNested<N> extends SecurityContextFluent<SecurityContextNested<N>> implements Nested<N>{
    SecurityContextNested(SecurityContext item) {
      this.builder = new SecurityContextBuilder(this, item);
    }
    SecurityContextBuilder builder;
    
    public N and() {
      return (N) SpecFluent.this.withSecurityContext(builder.build());
    }
    
    public N endSecurityContext() {
      return and();
    }
    
  
  }
  public class TopologySpreadConstraintsNested<N> extends TopologySpreadConstraintsFluent<TopologySpreadConstraintsNested<N>> implements Nested<N>{
    TopologySpreadConstraintsNested(int index,TopologySpreadConstraints item) {
      this.index = index;
      this.builder = new TopologySpreadConstraintsBuilder(this, item);
    }
    TopologySpreadConstraintsBuilder builder;
    int index;
    
    public N and() {
      return (N) SpecFluent.this.setToTopologySpreadConstraints(index,builder.build());
    }
    
    public N endIntegrationTopologySpreadConstraint() {
      return and();
    }
    
  
  }
  public class VolumesNested<N> extends VolumesFluent<VolumesNested<N>> implements Nested<N>{
    VolumesNested(int index,Volumes item) {
      this.index = index;
      this.builder = new VolumesBuilder(this, item);
    }
    VolumesBuilder builder;
    int index;
    
    public N and() {
      return (N) SpecFluent.this.setToVolumes(index,builder.build());
    }
    
    public N endIntegrationVolume() {
      return and();
    }
    
  
  }

}