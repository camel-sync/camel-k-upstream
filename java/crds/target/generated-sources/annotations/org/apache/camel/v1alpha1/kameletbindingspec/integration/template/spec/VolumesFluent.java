package org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec;

import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.PhotonPersistentDiskBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.EmptyDirBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.PersistentVolumeClaimFluent;
import java.lang.String;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.NfsFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.EmptyDirFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.SecretBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ConfigMapFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Rbd;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.StorageosFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.DownwardAPIBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.FlexVolumeBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.CephfsFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.HostPathFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Cinder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Glusterfs;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ProjectedFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.HostPathBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.FcBuilder;
import java.lang.Object;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.GitRepoBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Projected;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.FlexVolumeFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.AwsElasticBlockStoreBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.NfsBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.StorageosBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.RbdBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.CsiFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.AzureFileBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.DownwardAPIFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.EmptyDir;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.AzureDiskBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Flocker;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.FlexVolume;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Iscsi;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ProjectedBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.PortworxVolumeFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Cephfs;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.PhotonPersistentDiskFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Storageos;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.GcePersistentDiskFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.CinderFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.FcFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.FlockerFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.SecretFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.AwsElasticBlockStoreFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Ephemeral;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.VsphereVolume;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.FlockerBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.AzureDisk;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.QuobyteFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ConfigMapBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Nfs;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ScaleIOFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.EphemeralFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.PersistentVolumeClaimBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.AzureFile;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.CinderBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.GcePersistentDiskBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Secret;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.AzureFileFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.VsphereVolumeBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.IscsiFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.PersistentVolumeClaim;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.AwsElasticBlockStore;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.PortworxVolumeBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.QuobyteBuilder;
import java.lang.SuppressWarnings;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.PhotonPersistentDisk;
import io.fabric8.kubernetes.api.builder.Nested;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.EphemeralBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.GlusterfsFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.CsiBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.GitRepoFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.IscsiBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ScaleIO;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.VsphereVolumeFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.DownwardAPI;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.GitRepo;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.PortworxVolume;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Csi;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.AzureDiskFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Fc;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.HostPath;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ConfigMap;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.GlusterfsBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.CephfsBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.Quobyte;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.RbdFluent;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.ScaleIOBuilder;
import org.apache.camel.v1alpha1.kameletbindingspec.integration.template.spec.volumes.GcePersistentDisk;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class VolumesFluent<A extends VolumesFluent<A>> extends BaseFluent<A>{
  public VolumesFluent() {
  }
  
  public VolumesFluent(Volumes instance) {
    this.copyInstance(instance);
  }
  private AwsElasticBlockStoreBuilder awsElasticBlockStore;
  private AzureDiskBuilder azureDisk;
  private AzureFileBuilder azureFile;
  private CephfsBuilder cephfs;
  private CinderBuilder cinder;
  private ConfigMapBuilder configMap;
  private CsiBuilder csi;
  private DownwardAPIBuilder downwardAPI;
  private EmptyDirBuilder emptyDir;
  private EphemeralBuilder ephemeral;
  private FcBuilder fc;
  private FlexVolumeBuilder flexVolume;
  private FlockerBuilder flocker;
  private GcePersistentDiskBuilder gcePersistentDisk;
  private GitRepoBuilder gitRepo;
  private GlusterfsBuilder glusterfs;
  private HostPathBuilder hostPath;
  private IscsiBuilder iscsi;
  private String name;
  private NfsBuilder nfs;
  private PersistentVolumeClaimBuilder persistentVolumeClaim;
  private PhotonPersistentDiskBuilder photonPersistentDisk;
  private PortworxVolumeBuilder portworxVolume;
  private ProjectedBuilder projected;
  private QuobyteBuilder quobyte;
  private RbdBuilder rbd;
  private ScaleIOBuilder scaleIO;
  private SecretBuilder secret;
  private StorageosBuilder storageos;
  private VsphereVolumeBuilder vsphereVolume;
  
  protected void copyInstance(Volumes instance) {
    instance = (instance != null ? instance : new Volumes());
    if (instance != null) {
          this.withAwsElasticBlockStore(instance.getAwsElasticBlockStore());
          this.withAzureDisk(instance.getAzureDisk());
          this.withAzureFile(instance.getAzureFile());
          this.withCephfs(instance.getCephfs());
          this.withCinder(instance.getCinder());
          this.withConfigMap(instance.getConfigMap());
          this.withCsi(instance.getCsi());
          this.withDownwardAPI(instance.getDownwardAPI());
          this.withEmptyDir(instance.getEmptyDir());
          this.withEphemeral(instance.getEphemeral());
          this.withFc(instance.getFc());
          this.withFlexVolume(instance.getFlexVolume());
          this.withFlocker(instance.getFlocker());
          this.withGcePersistentDisk(instance.getGcePersistentDisk());
          this.withGitRepo(instance.getGitRepo());
          this.withGlusterfs(instance.getGlusterfs());
          this.withHostPath(instance.getHostPath());
          this.withIscsi(instance.getIscsi());
          this.withName(instance.getName());
          this.withNfs(instance.getNfs());
          this.withPersistentVolumeClaim(instance.getPersistentVolumeClaim());
          this.withPhotonPersistentDisk(instance.getPhotonPersistentDisk());
          this.withPortworxVolume(instance.getPortworxVolume());
          this.withProjected(instance.getProjected());
          this.withQuobyte(instance.getQuobyte());
          this.withRbd(instance.getRbd());
          this.withScaleIO(instance.getScaleIO());
          this.withSecret(instance.getSecret());
          this.withStorageos(instance.getStorageos());
          this.withVsphereVolume(instance.getVsphereVolume());
        }
  }
  
  public AwsElasticBlockStore buildAwsElasticBlockStore() {
    return this.awsElasticBlockStore != null ? this.awsElasticBlockStore.build() : null;
  }
  
  public A withAwsElasticBlockStore(AwsElasticBlockStore awsElasticBlockStore) {
    this._visitables.remove("awsElasticBlockStore");
    if (awsElasticBlockStore != null) {
        this.awsElasticBlockStore = new AwsElasticBlockStoreBuilder(awsElasticBlockStore);
        this._visitables.get("awsElasticBlockStore").add(this.awsElasticBlockStore);
    } else {
        this.awsElasticBlockStore = null;
        this._visitables.get("awsElasticBlockStore").remove(this.awsElasticBlockStore);
    }
    return (A) this;
  }
  
  public boolean hasAwsElasticBlockStore() {
    return this.awsElasticBlockStore != null;
  }
  
  public AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStore() {
    return new AwsElasticBlockStoreNested(null);
  }
  
  public AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStoreLike(AwsElasticBlockStore item) {
    return new AwsElasticBlockStoreNested(item);
  }
  
  public AwsElasticBlockStoreNested<A> editIntegrationAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(java.util.Optional.ofNullable(buildAwsElasticBlockStore()).orElse(null));
  }
  
  public AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(java.util.Optional.ofNullable(buildAwsElasticBlockStore()).orElse(new AwsElasticBlockStoreBuilder().build()));
  }
  
  public AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStoreLike(AwsElasticBlockStore item) {
    return withNewAwsElasticBlockStoreLike(java.util.Optional.ofNullable(buildAwsElasticBlockStore()).orElse(item));
  }
  
  public AzureDisk buildAzureDisk() {
    return this.azureDisk != null ? this.azureDisk.build() : null;
  }
  
  public A withAzureDisk(AzureDisk azureDisk) {
    this._visitables.remove("azureDisk");
    if (azureDisk != null) {
        this.azureDisk = new AzureDiskBuilder(azureDisk);
        this._visitables.get("azureDisk").add(this.azureDisk);
    } else {
        this.azureDisk = null;
        this._visitables.get("azureDisk").remove(this.azureDisk);
    }
    return (A) this;
  }
  
  public boolean hasAzureDisk() {
    return this.azureDisk != null;
  }
  
  public AzureDiskNested<A> withNewAzureDisk() {
    return new AzureDiskNested(null);
  }
  
  public AzureDiskNested<A> withNewAzureDiskLike(AzureDisk item) {
    return new AzureDiskNested(item);
  }
  
  public AzureDiskNested<A> editIntegrationAzureDisk() {
    return withNewAzureDiskLike(java.util.Optional.ofNullable(buildAzureDisk()).orElse(null));
  }
  
  public AzureDiskNested<A> editOrNewAzureDisk() {
    return withNewAzureDiskLike(java.util.Optional.ofNullable(buildAzureDisk()).orElse(new AzureDiskBuilder().build()));
  }
  
  public AzureDiskNested<A> editOrNewAzureDiskLike(AzureDisk item) {
    return withNewAzureDiskLike(java.util.Optional.ofNullable(buildAzureDisk()).orElse(item));
  }
  
  public AzureFile buildAzureFile() {
    return this.azureFile != null ? this.azureFile.build() : null;
  }
  
  public A withAzureFile(AzureFile azureFile) {
    this._visitables.remove("azureFile");
    if (azureFile != null) {
        this.azureFile = new AzureFileBuilder(azureFile);
        this._visitables.get("azureFile").add(this.azureFile);
    } else {
        this.azureFile = null;
        this._visitables.get("azureFile").remove(this.azureFile);
    }
    return (A) this;
  }
  
  public boolean hasAzureFile() {
    return this.azureFile != null;
  }
  
  public AzureFileNested<A> withNewAzureFile() {
    return new AzureFileNested(null);
  }
  
  public AzureFileNested<A> withNewAzureFileLike(AzureFile item) {
    return new AzureFileNested(item);
  }
  
  public AzureFileNested<A> editIntegrationAzureFile() {
    return withNewAzureFileLike(java.util.Optional.ofNullable(buildAzureFile()).orElse(null));
  }
  
  public AzureFileNested<A> editOrNewAzureFile() {
    return withNewAzureFileLike(java.util.Optional.ofNullable(buildAzureFile()).orElse(new AzureFileBuilder().build()));
  }
  
  public AzureFileNested<A> editOrNewAzureFileLike(AzureFile item) {
    return withNewAzureFileLike(java.util.Optional.ofNullable(buildAzureFile()).orElse(item));
  }
  
  public Cephfs buildCephfs() {
    return this.cephfs != null ? this.cephfs.build() : null;
  }
  
  public A withCephfs(Cephfs cephfs) {
    this._visitables.remove("cephfs");
    if (cephfs != null) {
        this.cephfs = new CephfsBuilder(cephfs);
        this._visitables.get("cephfs").add(this.cephfs);
    } else {
        this.cephfs = null;
        this._visitables.get("cephfs").remove(this.cephfs);
    }
    return (A) this;
  }
  
  public boolean hasCephfs() {
    return this.cephfs != null;
  }
  
  public CephfsNested<A> withNewCephfs() {
    return new CephfsNested(null);
  }
  
  public CephfsNested<A> withNewCephfsLike(Cephfs item) {
    return new CephfsNested(item);
  }
  
  public CephfsNested<A> editIntegrationCephfs() {
    return withNewCephfsLike(java.util.Optional.ofNullable(buildCephfs()).orElse(null));
  }
  
  public CephfsNested<A> editOrNewCephfs() {
    return withNewCephfsLike(java.util.Optional.ofNullable(buildCephfs()).orElse(new CephfsBuilder().build()));
  }
  
  public CephfsNested<A> editOrNewCephfsLike(Cephfs item) {
    return withNewCephfsLike(java.util.Optional.ofNullable(buildCephfs()).orElse(item));
  }
  
  public Cinder buildCinder() {
    return this.cinder != null ? this.cinder.build() : null;
  }
  
  public A withCinder(Cinder cinder) {
    this._visitables.remove("cinder");
    if (cinder != null) {
        this.cinder = new CinderBuilder(cinder);
        this._visitables.get("cinder").add(this.cinder);
    } else {
        this.cinder = null;
        this._visitables.get("cinder").remove(this.cinder);
    }
    return (A) this;
  }
  
  public boolean hasCinder() {
    return this.cinder != null;
  }
  
  public CinderNested<A> withNewCinder() {
    return new CinderNested(null);
  }
  
  public CinderNested<A> withNewCinderLike(Cinder item) {
    return new CinderNested(item);
  }
  
  public CinderNested<A> editIntegrationCinder() {
    return withNewCinderLike(java.util.Optional.ofNullable(buildCinder()).orElse(null));
  }
  
  public CinderNested<A> editOrNewCinder() {
    return withNewCinderLike(java.util.Optional.ofNullable(buildCinder()).orElse(new CinderBuilder().build()));
  }
  
  public CinderNested<A> editOrNewCinderLike(Cinder item) {
    return withNewCinderLike(java.util.Optional.ofNullable(buildCinder()).orElse(item));
  }
  
  public ConfigMap buildConfigMap() {
    return this.configMap != null ? this.configMap.build() : null;
  }
  
  public A withConfigMap(ConfigMap configMap) {
    this._visitables.remove("configMap");
    if (configMap != null) {
        this.configMap = new ConfigMapBuilder(configMap);
        this._visitables.get("configMap").add(this.configMap);
    } else {
        this.configMap = null;
        this._visitables.get("configMap").remove(this.configMap);
    }
    return (A) this;
  }
  
  public boolean hasConfigMap() {
    return this.configMap != null;
  }
  
  public ConfigMapNested<A> withNewConfigMap() {
    return new ConfigMapNested(null);
  }
  
  public ConfigMapNested<A> withNewConfigMapLike(ConfigMap item) {
    return new ConfigMapNested(item);
  }
  
  public ConfigMapNested<A> editIntegrationConfigMap() {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(null));
  }
  
  public ConfigMapNested<A> editOrNewConfigMap() {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(new ConfigMapBuilder().build()));
  }
  
  public ConfigMapNested<A> editOrNewConfigMapLike(ConfigMap item) {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(item));
  }
  
  public Csi buildCsi() {
    return this.csi != null ? this.csi.build() : null;
  }
  
  public A withCsi(Csi csi) {
    this._visitables.remove("csi");
    if (csi != null) {
        this.csi = new CsiBuilder(csi);
        this._visitables.get("csi").add(this.csi);
    } else {
        this.csi = null;
        this._visitables.get("csi").remove(this.csi);
    }
    return (A) this;
  }
  
  public boolean hasCsi() {
    return this.csi != null;
  }
  
  public CsiNested<A> withNewCsi() {
    return new CsiNested(null);
  }
  
  public CsiNested<A> withNewCsiLike(Csi item) {
    return new CsiNested(item);
  }
  
  public CsiNested<A> editIntegrationCsi() {
    return withNewCsiLike(java.util.Optional.ofNullable(buildCsi()).orElse(null));
  }
  
  public CsiNested<A> editOrNewCsi() {
    return withNewCsiLike(java.util.Optional.ofNullable(buildCsi()).orElse(new CsiBuilder().build()));
  }
  
  public CsiNested<A> editOrNewCsiLike(Csi item) {
    return withNewCsiLike(java.util.Optional.ofNullable(buildCsi()).orElse(item));
  }
  
  public DownwardAPI buildDownwardAPI() {
    return this.downwardAPI != null ? this.downwardAPI.build() : null;
  }
  
  public A withDownwardAPI(DownwardAPI downwardAPI) {
    this._visitables.remove("downwardAPI");
    if (downwardAPI != null) {
        this.downwardAPI = new DownwardAPIBuilder(downwardAPI);
        this._visitables.get("downwardAPI").add(this.downwardAPI);
    } else {
        this.downwardAPI = null;
        this._visitables.get("downwardAPI").remove(this.downwardAPI);
    }
    return (A) this;
  }
  
  public boolean hasDownwardAPI() {
    return this.downwardAPI != null;
  }
  
  public DownwardAPINested<A> withNewDownwardAPI() {
    return new DownwardAPINested(null);
  }
  
  public DownwardAPINested<A> withNewDownwardAPILike(DownwardAPI item) {
    return new DownwardAPINested(item);
  }
  
  public DownwardAPINested<A> editIntegrationDownwardAPI() {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(null));
  }
  
  public DownwardAPINested<A> editOrNewDownwardAPI() {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(new DownwardAPIBuilder().build()));
  }
  
  public DownwardAPINested<A> editOrNewDownwardAPILike(DownwardAPI item) {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(item));
  }
  
  public EmptyDir buildEmptyDir() {
    return this.emptyDir != null ? this.emptyDir.build() : null;
  }
  
  public A withEmptyDir(EmptyDir emptyDir) {
    this._visitables.remove("emptyDir");
    if (emptyDir != null) {
        this.emptyDir = new EmptyDirBuilder(emptyDir);
        this._visitables.get("emptyDir").add(this.emptyDir);
    } else {
        this.emptyDir = null;
        this._visitables.get("emptyDir").remove(this.emptyDir);
    }
    return (A) this;
  }
  
  public boolean hasEmptyDir() {
    return this.emptyDir != null;
  }
  
  public EmptyDirNested<A> withNewEmptyDir() {
    return new EmptyDirNested(null);
  }
  
  public EmptyDirNested<A> withNewEmptyDirLike(EmptyDir item) {
    return new EmptyDirNested(item);
  }
  
  public EmptyDirNested<A> editIntegrationEmptyDir() {
    return withNewEmptyDirLike(java.util.Optional.ofNullable(buildEmptyDir()).orElse(null));
  }
  
  public EmptyDirNested<A> editOrNewEmptyDir() {
    return withNewEmptyDirLike(java.util.Optional.ofNullable(buildEmptyDir()).orElse(new EmptyDirBuilder().build()));
  }
  
  public EmptyDirNested<A> editOrNewEmptyDirLike(EmptyDir item) {
    return withNewEmptyDirLike(java.util.Optional.ofNullable(buildEmptyDir()).orElse(item));
  }
  
  public Ephemeral buildEphemeral() {
    return this.ephemeral != null ? this.ephemeral.build() : null;
  }
  
  public A withEphemeral(Ephemeral ephemeral) {
    this._visitables.remove("ephemeral");
    if (ephemeral != null) {
        this.ephemeral = new EphemeralBuilder(ephemeral);
        this._visitables.get("ephemeral").add(this.ephemeral);
    } else {
        this.ephemeral = null;
        this._visitables.get("ephemeral").remove(this.ephemeral);
    }
    return (A) this;
  }
  
  public boolean hasEphemeral() {
    return this.ephemeral != null;
  }
  
  public EphemeralNested<A> withNewEphemeral() {
    return new EphemeralNested(null);
  }
  
  public EphemeralNested<A> withNewEphemeralLike(Ephemeral item) {
    return new EphemeralNested(item);
  }
  
  public EphemeralNested<A> editIntegrationEphemeral() {
    return withNewEphemeralLike(java.util.Optional.ofNullable(buildEphemeral()).orElse(null));
  }
  
  public EphemeralNested<A> editOrNewEphemeral() {
    return withNewEphemeralLike(java.util.Optional.ofNullable(buildEphemeral()).orElse(new EphemeralBuilder().build()));
  }
  
  public EphemeralNested<A> editOrNewEphemeralLike(Ephemeral item) {
    return withNewEphemeralLike(java.util.Optional.ofNullable(buildEphemeral()).orElse(item));
  }
  
  public Fc buildFc() {
    return this.fc != null ? this.fc.build() : null;
  }
  
  public A withFc(Fc fc) {
    this._visitables.remove("fc");
    if (fc != null) {
        this.fc = new FcBuilder(fc);
        this._visitables.get("fc").add(this.fc);
    } else {
        this.fc = null;
        this._visitables.get("fc").remove(this.fc);
    }
    return (A) this;
  }
  
  public boolean hasFc() {
    return this.fc != null;
  }
  
  public FcNested<A> withNewFc() {
    return new FcNested(null);
  }
  
  public FcNested<A> withNewFcLike(Fc item) {
    return new FcNested(item);
  }
  
  public FcNested<A> editIntegrationFc() {
    return withNewFcLike(java.util.Optional.ofNullable(buildFc()).orElse(null));
  }
  
  public FcNested<A> editOrNewFc() {
    return withNewFcLike(java.util.Optional.ofNullable(buildFc()).orElse(new FcBuilder().build()));
  }
  
  public FcNested<A> editOrNewFcLike(Fc item) {
    return withNewFcLike(java.util.Optional.ofNullable(buildFc()).orElse(item));
  }
  
  public FlexVolume buildFlexVolume() {
    return this.flexVolume != null ? this.flexVolume.build() : null;
  }
  
  public A withFlexVolume(FlexVolume flexVolume) {
    this._visitables.remove("flexVolume");
    if (flexVolume != null) {
        this.flexVolume = new FlexVolumeBuilder(flexVolume);
        this._visitables.get("flexVolume").add(this.flexVolume);
    } else {
        this.flexVolume = null;
        this._visitables.get("flexVolume").remove(this.flexVolume);
    }
    return (A) this;
  }
  
  public boolean hasFlexVolume() {
    return this.flexVolume != null;
  }
  
  public FlexVolumeNested<A> withNewFlexVolume() {
    return new FlexVolumeNested(null);
  }
  
  public FlexVolumeNested<A> withNewFlexVolumeLike(FlexVolume item) {
    return new FlexVolumeNested(item);
  }
  
  public FlexVolumeNested<A> editIntegrationFlexVolume() {
    return withNewFlexVolumeLike(java.util.Optional.ofNullable(buildFlexVolume()).orElse(null));
  }
  
  public FlexVolumeNested<A> editOrNewFlexVolume() {
    return withNewFlexVolumeLike(java.util.Optional.ofNullable(buildFlexVolume()).orElse(new FlexVolumeBuilder().build()));
  }
  
  public FlexVolumeNested<A> editOrNewFlexVolumeLike(FlexVolume item) {
    return withNewFlexVolumeLike(java.util.Optional.ofNullable(buildFlexVolume()).orElse(item));
  }
  
  public Flocker buildFlocker() {
    return this.flocker != null ? this.flocker.build() : null;
  }
  
  public A withFlocker(Flocker flocker) {
    this._visitables.remove("flocker");
    if (flocker != null) {
        this.flocker = new FlockerBuilder(flocker);
        this._visitables.get("flocker").add(this.flocker);
    } else {
        this.flocker = null;
        this._visitables.get("flocker").remove(this.flocker);
    }
    return (A) this;
  }
  
  public boolean hasFlocker() {
    return this.flocker != null;
  }
  
  public FlockerNested<A> withNewFlocker() {
    return new FlockerNested(null);
  }
  
  public FlockerNested<A> withNewFlockerLike(Flocker item) {
    return new FlockerNested(item);
  }
  
  public FlockerNested<A> editIntegrationFlocker() {
    return withNewFlockerLike(java.util.Optional.ofNullable(buildFlocker()).orElse(null));
  }
  
  public FlockerNested<A> editOrNewFlocker() {
    return withNewFlockerLike(java.util.Optional.ofNullable(buildFlocker()).orElse(new FlockerBuilder().build()));
  }
  
  public FlockerNested<A> editOrNewFlockerLike(Flocker item) {
    return withNewFlockerLike(java.util.Optional.ofNullable(buildFlocker()).orElse(item));
  }
  
  public GcePersistentDisk buildGcePersistentDisk() {
    return this.gcePersistentDisk != null ? this.gcePersistentDisk.build() : null;
  }
  
  public A withGcePersistentDisk(GcePersistentDisk gcePersistentDisk) {
    this._visitables.remove("gcePersistentDisk");
    if (gcePersistentDisk != null) {
        this.gcePersistentDisk = new GcePersistentDiskBuilder(gcePersistentDisk);
        this._visitables.get("gcePersistentDisk").add(this.gcePersistentDisk);
    } else {
        this.gcePersistentDisk = null;
        this._visitables.get("gcePersistentDisk").remove(this.gcePersistentDisk);
    }
    return (A) this;
  }
  
  public boolean hasGcePersistentDisk() {
    return this.gcePersistentDisk != null;
  }
  
  public GcePersistentDiskNested<A> withNewGcePersistentDisk() {
    return new GcePersistentDiskNested(null);
  }
  
  public GcePersistentDiskNested<A> withNewGcePersistentDiskLike(GcePersistentDisk item) {
    return new GcePersistentDiskNested(item);
  }
  
  public GcePersistentDiskNested<A> editIntegrationGcePersistentDisk() {
    return withNewGcePersistentDiskLike(java.util.Optional.ofNullable(buildGcePersistentDisk()).orElse(null));
  }
  
  public GcePersistentDiskNested<A> editOrNewGcePersistentDisk() {
    return withNewGcePersistentDiskLike(java.util.Optional.ofNullable(buildGcePersistentDisk()).orElse(new GcePersistentDiskBuilder().build()));
  }
  
  public GcePersistentDiskNested<A> editOrNewGcePersistentDiskLike(GcePersistentDisk item) {
    return withNewGcePersistentDiskLike(java.util.Optional.ofNullable(buildGcePersistentDisk()).orElse(item));
  }
  
  public GitRepo buildGitRepo() {
    return this.gitRepo != null ? this.gitRepo.build() : null;
  }
  
  public A withGitRepo(GitRepo gitRepo) {
    this._visitables.remove("gitRepo");
    if (gitRepo != null) {
        this.gitRepo = new GitRepoBuilder(gitRepo);
        this._visitables.get("gitRepo").add(this.gitRepo);
    } else {
        this.gitRepo = null;
        this._visitables.get("gitRepo").remove(this.gitRepo);
    }
    return (A) this;
  }
  
  public boolean hasGitRepo() {
    return this.gitRepo != null;
  }
  
  public GitRepoNested<A> withNewGitRepo() {
    return new GitRepoNested(null);
  }
  
  public GitRepoNested<A> withNewGitRepoLike(GitRepo item) {
    return new GitRepoNested(item);
  }
  
  public GitRepoNested<A> editIntegrationGitRepo() {
    return withNewGitRepoLike(java.util.Optional.ofNullable(buildGitRepo()).orElse(null));
  }
  
  public GitRepoNested<A> editOrNewGitRepo() {
    return withNewGitRepoLike(java.util.Optional.ofNullable(buildGitRepo()).orElse(new GitRepoBuilder().build()));
  }
  
  public GitRepoNested<A> editOrNewGitRepoLike(GitRepo item) {
    return withNewGitRepoLike(java.util.Optional.ofNullable(buildGitRepo()).orElse(item));
  }
  
  public Glusterfs buildGlusterfs() {
    return this.glusterfs != null ? this.glusterfs.build() : null;
  }
  
  public A withGlusterfs(Glusterfs glusterfs) {
    this._visitables.remove("glusterfs");
    if (glusterfs != null) {
        this.glusterfs = new GlusterfsBuilder(glusterfs);
        this._visitables.get("glusterfs").add(this.glusterfs);
    } else {
        this.glusterfs = null;
        this._visitables.get("glusterfs").remove(this.glusterfs);
    }
    return (A) this;
  }
  
  public boolean hasGlusterfs() {
    return this.glusterfs != null;
  }
  
  public GlusterfsNested<A> withNewGlusterfs() {
    return new GlusterfsNested(null);
  }
  
  public GlusterfsNested<A> withNewGlusterfsLike(Glusterfs item) {
    return new GlusterfsNested(item);
  }
  
  public GlusterfsNested<A> editIntegrationGlusterfs() {
    return withNewGlusterfsLike(java.util.Optional.ofNullable(buildGlusterfs()).orElse(null));
  }
  
  public GlusterfsNested<A> editOrNewGlusterfs() {
    return withNewGlusterfsLike(java.util.Optional.ofNullable(buildGlusterfs()).orElse(new GlusterfsBuilder().build()));
  }
  
  public GlusterfsNested<A> editOrNewGlusterfsLike(Glusterfs item) {
    return withNewGlusterfsLike(java.util.Optional.ofNullable(buildGlusterfs()).orElse(item));
  }
  
  public HostPath buildHostPath() {
    return this.hostPath != null ? this.hostPath.build() : null;
  }
  
  public A withHostPath(HostPath hostPath) {
    this._visitables.remove("hostPath");
    if (hostPath != null) {
        this.hostPath = new HostPathBuilder(hostPath);
        this._visitables.get("hostPath").add(this.hostPath);
    } else {
        this.hostPath = null;
        this._visitables.get("hostPath").remove(this.hostPath);
    }
    return (A) this;
  }
  
  public boolean hasHostPath() {
    return this.hostPath != null;
  }
  
  public HostPathNested<A> withNewHostPath() {
    return new HostPathNested(null);
  }
  
  public HostPathNested<A> withNewHostPathLike(HostPath item) {
    return new HostPathNested(item);
  }
  
  public HostPathNested<A> editIntegrationHostPath() {
    return withNewHostPathLike(java.util.Optional.ofNullable(buildHostPath()).orElse(null));
  }
  
  public HostPathNested<A> editOrNewHostPath() {
    return withNewHostPathLike(java.util.Optional.ofNullable(buildHostPath()).orElse(new HostPathBuilder().build()));
  }
  
  public HostPathNested<A> editOrNewHostPathLike(HostPath item) {
    return withNewHostPathLike(java.util.Optional.ofNullable(buildHostPath()).orElse(item));
  }
  
  public Iscsi buildIscsi() {
    return this.iscsi != null ? this.iscsi.build() : null;
  }
  
  public A withIscsi(Iscsi iscsi) {
    this._visitables.remove("iscsi");
    if (iscsi != null) {
        this.iscsi = new IscsiBuilder(iscsi);
        this._visitables.get("iscsi").add(this.iscsi);
    } else {
        this.iscsi = null;
        this._visitables.get("iscsi").remove(this.iscsi);
    }
    return (A) this;
  }
  
  public boolean hasIscsi() {
    return this.iscsi != null;
  }
  
  public IscsiNested<A> withNewIscsi() {
    return new IscsiNested(null);
  }
  
  public IscsiNested<A> withNewIscsiLike(Iscsi item) {
    return new IscsiNested(item);
  }
  
  public IscsiNested<A> editIntegrationIscsi() {
    return withNewIscsiLike(java.util.Optional.ofNullable(buildIscsi()).orElse(null));
  }
  
  public IscsiNested<A> editOrNewIscsi() {
    return withNewIscsiLike(java.util.Optional.ofNullable(buildIscsi()).orElse(new IscsiBuilder().build()));
  }
  
  public IscsiNested<A> editOrNewIscsiLike(Iscsi item) {
    return withNewIscsiLike(java.util.Optional.ofNullable(buildIscsi()).orElse(item));
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
  
  public Nfs buildNfs() {
    return this.nfs != null ? this.nfs.build() : null;
  }
  
  public A withNfs(Nfs nfs) {
    this._visitables.remove("nfs");
    if (nfs != null) {
        this.nfs = new NfsBuilder(nfs);
        this._visitables.get("nfs").add(this.nfs);
    } else {
        this.nfs = null;
        this._visitables.get("nfs").remove(this.nfs);
    }
    return (A) this;
  }
  
  public boolean hasNfs() {
    return this.nfs != null;
  }
  
  public NfsNested<A> withNewNfs() {
    return new NfsNested(null);
  }
  
  public NfsNested<A> withNewNfsLike(Nfs item) {
    return new NfsNested(item);
  }
  
  public NfsNested<A> editIntegrationNfs() {
    return withNewNfsLike(java.util.Optional.ofNullable(buildNfs()).orElse(null));
  }
  
  public NfsNested<A> editOrNewNfs() {
    return withNewNfsLike(java.util.Optional.ofNullable(buildNfs()).orElse(new NfsBuilder().build()));
  }
  
  public NfsNested<A> editOrNewNfsLike(Nfs item) {
    return withNewNfsLike(java.util.Optional.ofNullable(buildNfs()).orElse(item));
  }
  
  public PersistentVolumeClaim buildPersistentVolumeClaim() {
    return this.persistentVolumeClaim != null ? this.persistentVolumeClaim.build() : null;
  }
  
  public A withPersistentVolumeClaim(PersistentVolumeClaim persistentVolumeClaim) {
    this._visitables.remove("persistentVolumeClaim");
    if (persistentVolumeClaim != null) {
        this.persistentVolumeClaim = new PersistentVolumeClaimBuilder(persistentVolumeClaim);
        this._visitables.get("persistentVolumeClaim").add(this.persistentVolumeClaim);
    } else {
        this.persistentVolumeClaim = null;
        this._visitables.get("persistentVolumeClaim").remove(this.persistentVolumeClaim);
    }
    return (A) this;
  }
  
  public boolean hasPersistentVolumeClaim() {
    return this.persistentVolumeClaim != null;
  }
  
  public PersistentVolumeClaimNested<A> withNewPersistentVolumeClaim() {
    return new PersistentVolumeClaimNested(null);
  }
  
  public PersistentVolumeClaimNested<A> withNewPersistentVolumeClaimLike(PersistentVolumeClaim item) {
    return new PersistentVolumeClaimNested(item);
  }
  
  public PersistentVolumeClaimNested<A> editIntegrationPersistentVolumeClaim() {
    return withNewPersistentVolumeClaimLike(java.util.Optional.ofNullable(buildPersistentVolumeClaim()).orElse(null));
  }
  
  public PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaim() {
    return withNewPersistentVolumeClaimLike(java.util.Optional.ofNullable(buildPersistentVolumeClaim()).orElse(new PersistentVolumeClaimBuilder().build()));
  }
  
  public PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaimLike(PersistentVolumeClaim item) {
    return withNewPersistentVolumeClaimLike(java.util.Optional.ofNullable(buildPersistentVolumeClaim()).orElse(item));
  }
  
  public PhotonPersistentDisk buildPhotonPersistentDisk() {
    return this.photonPersistentDisk != null ? this.photonPersistentDisk.build() : null;
  }
  
  public A withPhotonPersistentDisk(PhotonPersistentDisk photonPersistentDisk) {
    this._visitables.remove("photonPersistentDisk");
    if (photonPersistentDisk != null) {
        this.photonPersistentDisk = new PhotonPersistentDiskBuilder(photonPersistentDisk);
        this._visitables.get("photonPersistentDisk").add(this.photonPersistentDisk);
    } else {
        this.photonPersistentDisk = null;
        this._visitables.get("photonPersistentDisk").remove(this.photonPersistentDisk);
    }
    return (A) this;
  }
  
  public boolean hasPhotonPersistentDisk() {
    return this.photonPersistentDisk != null;
  }
  
  public PhotonPersistentDiskNested<A> withNewPhotonPersistentDisk() {
    return new PhotonPersistentDiskNested(null);
  }
  
  public PhotonPersistentDiskNested<A> withNewPhotonPersistentDiskLike(PhotonPersistentDisk item) {
    return new PhotonPersistentDiskNested(item);
  }
  
  public PhotonPersistentDiskNested<A> editIntegrationPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(java.util.Optional.ofNullable(buildPhotonPersistentDisk()).orElse(null));
  }
  
  public PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(java.util.Optional.ofNullable(buildPhotonPersistentDisk()).orElse(new PhotonPersistentDiskBuilder().build()));
  }
  
  public PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDiskLike(PhotonPersistentDisk item) {
    return withNewPhotonPersistentDiskLike(java.util.Optional.ofNullable(buildPhotonPersistentDisk()).orElse(item));
  }
  
  public PortworxVolume buildPortworxVolume() {
    return this.portworxVolume != null ? this.portworxVolume.build() : null;
  }
  
  public A withPortworxVolume(PortworxVolume portworxVolume) {
    this._visitables.remove("portworxVolume");
    if (portworxVolume != null) {
        this.portworxVolume = new PortworxVolumeBuilder(portworxVolume);
        this._visitables.get("portworxVolume").add(this.portworxVolume);
    } else {
        this.portworxVolume = null;
        this._visitables.get("portworxVolume").remove(this.portworxVolume);
    }
    return (A) this;
  }
  
  public boolean hasPortworxVolume() {
    return this.portworxVolume != null;
  }
  
  public PortworxVolumeNested<A> withNewPortworxVolume() {
    return new PortworxVolumeNested(null);
  }
  
  public PortworxVolumeNested<A> withNewPortworxVolumeLike(PortworxVolume item) {
    return new PortworxVolumeNested(item);
  }
  
  public PortworxVolumeNested<A> editIntegrationPortworxVolume() {
    return withNewPortworxVolumeLike(java.util.Optional.ofNullable(buildPortworxVolume()).orElse(null));
  }
  
  public PortworxVolumeNested<A> editOrNewPortworxVolume() {
    return withNewPortworxVolumeLike(java.util.Optional.ofNullable(buildPortworxVolume()).orElse(new PortworxVolumeBuilder().build()));
  }
  
  public PortworxVolumeNested<A> editOrNewPortworxVolumeLike(PortworxVolume item) {
    return withNewPortworxVolumeLike(java.util.Optional.ofNullable(buildPortworxVolume()).orElse(item));
  }
  
  public Projected buildProjected() {
    return this.projected != null ? this.projected.build() : null;
  }
  
  public A withProjected(Projected projected) {
    this._visitables.remove("projected");
    if (projected != null) {
        this.projected = new ProjectedBuilder(projected);
        this._visitables.get("projected").add(this.projected);
    } else {
        this.projected = null;
        this._visitables.get("projected").remove(this.projected);
    }
    return (A) this;
  }
  
  public boolean hasProjected() {
    return this.projected != null;
  }
  
  public ProjectedNested<A> withNewProjected() {
    return new ProjectedNested(null);
  }
  
  public ProjectedNested<A> withNewProjectedLike(Projected item) {
    return new ProjectedNested(item);
  }
  
  public ProjectedNested<A> editIntegrationProjected() {
    return withNewProjectedLike(java.util.Optional.ofNullable(buildProjected()).orElse(null));
  }
  
  public ProjectedNested<A> editOrNewProjected() {
    return withNewProjectedLike(java.util.Optional.ofNullable(buildProjected()).orElse(new ProjectedBuilder().build()));
  }
  
  public ProjectedNested<A> editOrNewProjectedLike(Projected item) {
    return withNewProjectedLike(java.util.Optional.ofNullable(buildProjected()).orElse(item));
  }
  
  public Quobyte buildQuobyte() {
    return this.quobyte != null ? this.quobyte.build() : null;
  }
  
  public A withQuobyte(Quobyte quobyte) {
    this._visitables.remove("quobyte");
    if (quobyte != null) {
        this.quobyte = new QuobyteBuilder(quobyte);
        this._visitables.get("quobyte").add(this.quobyte);
    } else {
        this.quobyte = null;
        this._visitables.get("quobyte").remove(this.quobyte);
    }
    return (A) this;
  }
  
  public boolean hasQuobyte() {
    return this.quobyte != null;
  }
  
  public QuobyteNested<A> withNewQuobyte() {
    return new QuobyteNested(null);
  }
  
  public QuobyteNested<A> withNewQuobyteLike(Quobyte item) {
    return new QuobyteNested(item);
  }
  
  public QuobyteNested<A> editIntegrationQuobyte() {
    return withNewQuobyteLike(java.util.Optional.ofNullable(buildQuobyte()).orElse(null));
  }
  
  public QuobyteNested<A> editOrNewQuobyte() {
    return withNewQuobyteLike(java.util.Optional.ofNullable(buildQuobyte()).orElse(new QuobyteBuilder().build()));
  }
  
  public QuobyteNested<A> editOrNewQuobyteLike(Quobyte item) {
    return withNewQuobyteLike(java.util.Optional.ofNullable(buildQuobyte()).orElse(item));
  }
  
  public Rbd buildRbd() {
    return this.rbd != null ? this.rbd.build() : null;
  }
  
  public A withRbd(Rbd rbd) {
    this._visitables.remove("rbd");
    if (rbd != null) {
        this.rbd = new RbdBuilder(rbd);
        this._visitables.get("rbd").add(this.rbd);
    } else {
        this.rbd = null;
        this._visitables.get("rbd").remove(this.rbd);
    }
    return (A) this;
  }
  
  public boolean hasRbd() {
    return this.rbd != null;
  }
  
  public RbdNested<A> withNewRbd() {
    return new RbdNested(null);
  }
  
  public RbdNested<A> withNewRbdLike(Rbd item) {
    return new RbdNested(item);
  }
  
  public RbdNested<A> editIntegrationRbd() {
    return withNewRbdLike(java.util.Optional.ofNullable(buildRbd()).orElse(null));
  }
  
  public RbdNested<A> editOrNewRbd() {
    return withNewRbdLike(java.util.Optional.ofNullable(buildRbd()).orElse(new RbdBuilder().build()));
  }
  
  public RbdNested<A> editOrNewRbdLike(Rbd item) {
    return withNewRbdLike(java.util.Optional.ofNullable(buildRbd()).orElse(item));
  }
  
  public ScaleIO buildScaleIO() {
    return this.scaleIO != null ? this.scaleIO.build() : null;
  }
  
  public A withScaleIO(ScaleIO scaleIO) {
    this._visitables.remove("scaleIO");
    if (scaleIO != null) {
        this.scaleIO = new ScaleIOBuilder(scaleIO);
        this._visitables.get("scaleIO").add(this.scaleIO);
    } else {
        this.scaleIO = null;
        this._visitables.get("scaleIO").remove(this.scaleIO);
    }
    return (A) this;
  }
  
  public boolean hasScaleIO() {
    return this.scaleIO != null;
  }
  
  public ScaleIONested<A> withNewScaleIO() {
    return new ScaleIONested(null);
  }
  
  public ScaleIONested<A> withNewScaleIOLike(ScaleIO item) {
    return new ScaleIONested(item);
  }
  
  public ScaleIONested<A> editIntegrationScaleIO() {
    return withNewScaleIOLike(java.util.Optional.ofNullable(buildScaleIO()).orElse(null));
  }
  
  public ScaleIONested<A> editOrNewScaleIO() {
    return withNewScaleIOLike(java.util.Optional.ofNullable(buildScaleIO()).orElse(new ScaleIOBuilder().build()));
  }
  
  public ScaleIONested<A> editOrNewScaleIOLike(ScaleIO item) {
    return withNewScaleIOLike(java.util.Optional.ofNullable(buildScaleIO()).orElse(item));
  }
  
  public Secret buildSecret() {
    return this.secret != null ? this.secret.build() : null;
  }
  
  public A withSecret(Secret secret) {
    this._visitables.remove("secret");
    if (secret != null) {
        this.secret = new SecretBuilder(secret);
        this._visitables.get("secret").add(this.secret);
    } else {
        this.secret = null;
        this._visitables.get("secret").remove(this.secret);
    }
    return (A) this;
  }
  
  public boolean hasSecret() {
    return this.secret != null;
  }
  
  public SecretNested<A> withNewSecret() {
    return new SecretNested(null);
  }
  
  public SecretNested<A> withNewSecretLike(Secret item) {
    return new SecretNested(item);
  }
  
  public SecretNested<A> editIntegrationSecret() {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(null));
  }
  
  public SecretNested<A> editOrNewSecret() {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(new SecretBuilder().build()));
  }
  
  public SecretNested<A> editOrNewSecretLike(Secret item) {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(item));
  }
  
  public Storageos buildStorageos() {
    return this.storageos != null ? this.storageos.build() : null;
  }
  
  public A withStorageos(Storageos storageos) {
    this._visitables.remove("storageos");
    if (storageos != null) {
        this.storageos = new StorageosBuilder(storageos);
        this._visitables.get("storageos").add(this.storageos);
    } else {
        this.storageos = null;
        this._visitables.get("storageos").remove(this.storageos);
    }
    return (A) this;
  }
  
  public boolean hasStorageos() {
    return this.storageos != null;
  }
  
  public StorageosNested<A> withNewStorageos() {
    return new StorageosNested(null);
  }
  
  public StorageosNested<A> withNewStorageosLike(Storageos item) {
    return new StorageosNested(item);
  }
  
  public StorageosNested<A> editIntegrationStorageos() {
    return withNewStorageosLike(java.util.Optional.ofNullable(buildStorageos()).orElse(null));
  }
  
  public StorageosNested<A> editOrNewStorageos() {
    return withNewStorageosLike(java.util.Optional.ofNullable(buildStorageos()).orElse(new StorageosBuilder().build()));
  }
  
  public StorageosNested<A> editOrNewStorageosLike(Storageos item) {
    return withNewStorageosLike(java.util.Optional.ofNullable(buildStorageos()).orElse(item));
  }
  
  public VsphereVolume buildVsphereVolume() {
    return this.vsphereVolume != null ? this.vsphereVolume.build() : null;
  }
  
  public A withVsphereVolume(VsphereVolume vsphereVolume) {
    this._visitables.remove("vsphereVolume");
    if (vsphereVolume != null) {
        this.vsphereVolume = new VsphereVolumeBuilder(vsphereVolume);
        this._visitables.get("vsphereVolume").add(this.vsphereVolume);
    } else {
        this.vsphereVolume = null;
        this._visitables.get("vsphereVolume").remove(this.vsphereVolume);
    }
    return (A) this;
  }
  
  public boolean hasVsphereVolume() {
    return this.vsphereVolume != null;
  }
  
  public VsphereVolumeNested<A> withNewVsphereVolume() {
    return new VsphereVolumeNested(null);
  }
  
  public VsphereVolumeNested<A> withNewVsphereVolumeLike(VsphereVolume item) {
    return new VsphereVolumeNested(item);
  }
  
  public VsphereVolumeNested<A> editIntegrationVsphereVolume() {
    return withNewVsphereVolumeLike(java.util.Optional.ofNullable(buildVsphereVolume()).orElse(null));
  }
  
  public VsphereVolumeNested<A> editOrNewVsphereVolume() {
    return withNewVsphereVolumeLike(java.util.Optional.ofNullable(buildVsphereVolume()).orElse(new VsphereVolumeBuilder().build()));
  }
  
  public VsphereVolumeNested<A> editOrNewVsphereVolumeLike(VsphereVolume item) {
    return withNewVsphereVolumeLike(java.util.Optional.ofNullable(buildVsphereVolume()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    VolumesFluent that = (VolumesFluent) o;
    if (!java.util.Objects.equals(awsElasticBlockStore, that.awsElasticBlockStore)) return false;
    if (!java.util.Objects.equals(azureDisk, that.azureDisk)) return false;
    if (!java.util.Objects.equals(azureFile, that.azureFile)) return false;
    if (!java.util.Objects.equals(cephfs, that.cephfs)) return false;
    if (!java.util.Objects.equals(cinder, that.cinder)) return false;
    if (!java.util.Objects.equals(configMap, that.configMap)) return false;
    if (!java.util.Objects.equals(csi, that.csi)) return false;
    if (!java.util.Objects.equals(downwardAPI, that.downwardAPI)) return false;
    if (!java.util.Objects.equals(emptyDir, that.emptyDir)) return false;
    if (!java.util.Objects.equals(ephemeral, that.ephemeral)) return false;
    if (!java.util.Objects.equals(fc, that.fc)) return false;
    if (!java.util.Objects.equals(flexVolume, that.flexVolume)) return false;
    if (!java.util.Objects.equals(flocker, that.flocker)) return false;
    if (!java.util.Objects.equals(gcePersistentDisk, that.gcePersistentDisk)) return false;
    if (!java.util.Objects.equals(gitRepo, that.gitRepo)) return false;
    if (!java.util.Objects.equals(glusterfs, that.glusterfs)) return false;
    if (!java.util.Objects.equals(hostPath, that.hostPath)) return false;
    if (!java.util.Objects.equals(iscsi, that.iscsi)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(nfs, that.nfs)) return false;
    if (!java.util.Objects.equals(persistentVolumeClaim, that.persistentVolumeClaim)) return false;
    if (!java.util.Objects.equals(photonPersistentDisk, that.photonPersistentDisk)) return false;
    if (!java.util.Objects.equals(portworxVolume, that.portworxVolume)) return false;
    if (!java.util.Objects.equals(projected, that.projected)) return false;
    if (!java.util.Objects.equals(quobyte, that.quobyte)) return false;
    if (!java.util.Objects.equals(rbd, that.rbd)) return false;
    if (!java.util.Objects.equals(scaleIO, that.scaleIO)) return false;
    if (!java.util.Objects.equals(secret, that.secret)) return false;
    if (!java.util.Objects.equals(storageos, that.storageos)) return false;
    if (!java.util.Objects.equals(vsphereVolume, that.vsphereVolume)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(awsElasticBlockStore,  azureDisk,  azureFile,  cephfs,  cinder,  configMap,  csi,  downwardAPI,  emptyDir,  ephemeral,  fc,  flexVolume,  flocker,  gcePersistentDisk,  gitRepo,  glusterfs,  hostPath,  iscsi,  name,  nfs,  persistentVolumeClaim,  photonPersistentDisk,  portworxVolume,  projected,  quobyte,  rbd,  scaleIO,  secret,  storageos,  vsphereVolume,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (awsElasticBlockStore != null) { sb.append("awsElasticBlockStore:"); sb.append(awsElasticBlockStore + ","); }
    if (azureDisk != null) { sb.append("azureDisk:"); sb.append(azureDisk + ","); }
    if (azureFile != null) { sb.append("azureFile:"); sb.append(azureFile + ","); }
    if (cephfs != null) { sb.append("cephfs:"); sb.append(cephfs + ","); }
    if (cinder != null) { sb.append("cinder:"); sb.append(cinder + ","); }
    if (configMap != null) { sb.append("configMap:"); sb.append(configMap + ","); }
    if (csi != null) { sb.append("csi:"); sb.append(csi + ","); }
    if (downwardAPI != null) { sb.append("downwardAPI:"); sb.append(downwardAPI + ","); }
    if (emptyDir != null) { sb.append("emptyDir:"); sb.append(emptyDir + ","); }
    if (ephemeral != null) { sb.append("ephemeral:"); sb.append(ephemeral + ","); }
    if (fc != null) { sb.append("fc:"); sb.append(fc + ","); }
    if (flexVolume != null) { sb.append("flexVolume:"); sb.append(flexVolume + ","); }
    if (flocker != null) { sb.append("flocker:"); sb.append(flocker + ","); }
    if (gcePersistentDisk != null) { sb.append("gcePersistentDisk:"); sb.append(gcePersistentDisk + ","); }
    if (gitRepo != null) { sb.append("gitRepo:"); sb.append(gitRepo + ","); }
    if (glusterfs != null) { sb.append("glusterfs:"); sb.append(glusterfs + ","); }
    if (hostPath != null) { sb.append("hostPath:"); sb.append(hostPath + ","); }
    if (iscsi != null) { sb.append("iscsi:"); sb.append(iscsi + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (nfs != null) { sb.append("nfs:"); sb.append(nfs + ","); }
    if (persistentVolumeClaim != null) { sb.append("persistentVolumeClaim:"); sb.append(persistentVolumeClaim + ","); }
    if (photonPersistentDisk != null) { sb.append("photonPersistentDisk:"); sb.append(photonPersistentDisk + ","); }
    if (portworxVolume != null) { sb.append("portworxVolume:"); sb.append(portworxVolume + ","); }
    if (projected != null) { sb.append("projected:"); sb.append(projected + ","); }
    if (quobyte != null) { sb.append("quobyte:"); sb.append(quobyte + ","); }
    if (rbd != null) { sb.append("rbd:"); sb.append(rbd + ","); }
    if (scaleIO != null) { sb.append("scaleIO:"); sb.append(scaleIO + ","); }
    if (secret != null) { sb.append("secret:"); sb.append(secret + ","); }
    if (storageos != null) { sb.append("storageos:"); sb.append(storageos + ","); }
    if (vsphereVolume != null) { sb.append("vsphereVolume:"); sb.append(vsphereVolume); }
    sb.append("}");
    return sb.toString();
  }
  public class AwsElasticBlockStoreNested<N> extends AwsElasticBlockStoreFluent<AwsElasticBlockStoreNested<N>> implements Nested<N>{
    AwsElasticBlockStoreNested(AwsElasticBlockStore item) {
      this.builder = new AwsElasticBlockStoreBuilder(this, item);
    }
    AwsElasticBlockStoreBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withAwsElasticBlockStore(builder.build());
    }
    
    public N endIntegrationAwsElasticBlockStore() {
      return and();
    }
    
  
  }
  public class AzureDiskNested<N> extends AzureDiskFluent<AzureDiskNested<N>> implements Nested<N>{
    AzureDiskNested(AzureDisk item) {
      this.builder = new AzureDiskBuilder(this, item);
    }
    AzureDiskBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withAzureDisk(builder.build());
    }
    
    public N endIntegrationAzureDisk() {
      return and();
    }
    
  
  }
  public class AzureFileNested<N> extends AzureFileFluent<AzureFileNested<N>> implements Nested<N>{
    AzureFileNested(AzureFile item) {
      this.builder = new AzureFileBuilder(this, item);
    }
    AzureFileBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withAzureFile(builder.build());
    }
    
    public N endIntegrationAzureFile() {
      return and();
    }
    
  
  }
  public class CephfsNested<N> extends CephfsFluent<CephfsNested<N>> implements Nested<N>{
    CephfsNested(Cephfs item) {
      this.builder = new CephfsBuilder(this, item);
    }
    CephfsBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withCephfs(builder.build());
    }
    
    public N endIntegrationCephfs() {
      return and();
    }
    
  
  }
  public class CinderNested<N> extends CinderFluent<CinderNested<N>> implements Nested<N>{
    CinderNested(Cinder item) {
      this.builder = new CinderBuilder(this, item);
    }
    CinderBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withCinder(builder.build());
    }
    
    public N endIntegrationCinder() {
      return and();
    }
    
  
  }
  public class ConfigMapNested<N> extends ConfigMapFluent<ConfigMapNested<N>> implements Nested<N>{
    ConfigMapNested(ConfigMap item) {
      this.builder = new ConfigMapBuilder(this, item);
    }
    ConfigMapBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withConfigMap(builder.build());
    }
    
    public N endIntegrationConfigMap() {
      return and();
    }
    
  
  }
  public class CsiNested<N> extends CsiFluent<CsiNested<N>> implements Nested<N>{
    CsiNested(Csi item) {
      this.builder = new CsiBuilder(this, item);
    }
    CsiBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withCsi(builder.build());
    }
    
    public N endIntegrationCsi() {
      return and();
    }
    
  
  }
  public class DownwardAPINested<N> extends DownwardAPIFluent<DownwardAPINested<N>> implements Nested<N>{
    DownwardAPINested(DownwardAPI item) {
      this.builder = new DownwardAPIBuilder(this, item);
    }
    DownwardAPIBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withDownwardAPI(builder.build());
    }
    
    public N endIntegrationDownwardAPI() {
      return and();
    }
    
  
  }
  public class EmptyDirNested<N> extends EmptyDirFluent<EmptyDirNested<N>> implements Nested<N>{
    EmptyDirNested(EmptyDir item) {
      this.builder = new EmptyDirBuilder(this, item);
    }
    EmptyDirBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withEmptyDir(builder.build());
    }
    
    public N endIntegrationEmptyDir() {
      return and();
    }
    
  
  }
  public class EphemeralNested<N> extends EphemeralFluent<EphemeralNested<N>> implements Nested<N>{
    EphemeralNested(Ephemeral item) {
      this.builder = new EphemeralBuilder(this, item);
    }
    EphemeralBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withEphemeral(builder.build());
    }
    
    public N endIntegrationEphemeral() {
      return and();
    }
    
  
  }
  public class FcNested<N> extends FcFluent<FcNested<N>> implements Nested<N>{
    FcNested(Fc item) {
      this.builder = new FcBuilder(this, item);
    }
    FcBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withFc(builder.build());
    }
    
    public N endIntegrationFc() {
      return and();
    }
    
  
  }
  public class FlexVolumeNested<N> extends FlexVolumeFluent<FlexVolumeNested<N>> implements Nested<N>{
    FlexVolumeNested(FlexVolume item) {
      this.builder = new FlexVolumeBuilder(this, item);
    }
    FlexVolumeBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withFlexVolume(builder.build());
    }
    
    public N endIntegrationFlexVolume() {
      return and();
    }
    
  
  }
  public class FlockerNested<N> extends FlockerFluent<FlockerNested<N>> implements Nested<N>{
    FlockerNested(Flocker item) {
      this.builder = new FlockerBuilder(this, item);
    }
    FlockerBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withFlocker(builder.build());
    }
    
    public N endIntegrationFlocker() {
      return and();
    }
    
  
  }
  public class GcePersistentDiskNested<N> extends GcePersistentDiskFluent<GcePersistentDiskNested<N>> implements Nested<N>{
    GcePersistentDiskNested(GcePersistentDisk item) {
      this.builder = new GcePersistentDiskBuilder(this, item);
    }
    GcePersistentDiskBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withGcePersistentDisk(builder.build());
    }
    
    public N endIntegrationGcePersistentDisk() {
      return and();
    }
    
  
  }
  public class GitRepoNested<N> extends GitRepoFluent<GitRepoNested<N>> implements Nested<N>{
    GitRepoNested(GitRepo item) {
      this.builder = new GitRepoBuilder(this, item);
    }
    GitRepoBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withGitRepo(builder.build());
    }
    
    public N endIntegrationGitRepo() {
      return and();
    }
    
  
  }
  public class GlusterfsNested<N> extends GlusterfsFluent<GlusterfsNested<N>> implements Nested<N>{
    GlusterfsNested(Glusterfs item) {
      this.builder = new GlusterfsBuilder(this, item);
    }
    GlusterfsBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withGlusterfs(builder.build());
    }
    
    public N endIntegrationGlusterfs() {
      return and();
    }
    
  
  }
  public class HostPathNested<N> extends HostPathFluent<HostPathNested<N>> implements Nested<N>{
    HostPathNested(HostPath item) {
      this.builder = new HostPathBuilder(this, item);
    }
    HostPathBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withHostPath(builder.build());
    }
    
    public N endIntegrationHostPath() {
      return and();
    }
    
  
  }
  public class IscsiNested<N> extends IscsiFluent<IscsiNested<N>> implements Nested<N>{
    IscsiNested(Iscsi item) {
      this.builder = new IscsiBuilder(this, item);
    }
    IscsiBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withIscsi(builder.build());
    }
    
    public N endIntegrationIscsi() {
      return and();
    }
    
  
  }
  public class NfsNested<N> extends NfsFluent<NfsNested<N>> implements Nested<N>{
    NfsNested(Nfs item) {
      this.builder = new NfsBuilder(this, item);
    }
    NfsBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withNfs(builder.build());
    }
    
    public N endIntegrationNfs() {
      return and();
    }
    
  
  }
  public class PersistentVolumeClaimNested<N> extends PersistentVolumeClaimFluent<PersistentVolumeClaimNested<N>> implements Nested<N>{
    PersistentVolumeClaimNested(PersistentVolumeClaim item) {
      this.builder = new PersistentVolumeClaimBuilder(this, item);
    }
    PersistentVolumeClaimBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withPersistentVolumeClaim(builder.build());
    }
    
    public N endIntegrationPersistentVolumeClaim() {
      return and();
    }
    
  
  }
  public class PhotonPersistentDiskNested<N> extends PhotonPersistentDiskFluent<PhotonPersistentDiskNested<N>> implements Nested<N>{
    PhotonPersistentDiskNested(PhotonPersistentDisk item) {
      this.builder = new PhotonPersistentDiskBuilder(this, item);
    }
    PhotonPersistentDiskBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withPhotonPersistentDisk(builder.build());
    }
    
    public N endIntegrationPhotonPersistentDisk() {
      return and();
    }
    
  
  }
  public class PortworxVolumeNested<N> extends PortworxVolumeFluent<PortworxVolumeNested<N>> implements Nested<N>{
    PortworxVolumeNested(PortworxVolume item) {
      this.builder = new PortworxVolumeBuilder(this, item);
    }
    PortworxVolumeBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withPortworxVolume(builder.build());
    }
    
    public N endIntegrationPortworxVolume() {
      return and();
    }
    
  
  }
  public class ProjectedNested<N> extends ProjectedFluent<ProjectedNested<N>> implements Nested<N>{
    ProjectedNested(Projected item) {
      this.builder = new ProjectedBuilder(this, item);
    }
    ProjectedBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withProjected(builder.build());
    }
    
    public N endIntegrationProjected() {
      return and();
    }
    
  
  }
  public class QuobyteNested<N> extends QuobyteFluent<QuobyteNested<N>> implements Nested<N>{
    QuobyteNested(Quobyte item) {
      this.builder = new QuobyteBuilder(this, item);
    }
    QuobyteBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withQuobyte(builder.build());
    }
    
    public N endIntegrationQuobyte() {
      return and();
    }
    
  
  }
  public class RbdNested<N> extends RbdFluent<RbdNested<N>> implements Nested<N>{
    RbdNested(Rbd item) {
      this.builder = new RbdBuilder(this, item);
    }
    RbdBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withRbd(builder.build());
    }
    
    public N endIntegrationRbd() {
      return and();
    }
    
  
  }
  public class ScaleIONested<N> extends ScaleIOFluent<ScaleIONested<N>> implements Nested<N>{
    ScaleIONested(ScaleIO item) {
      this.builder = new ScaleIOBuilder(this, item);
    }
    ScaleIOBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withScaleIO(builder.build());
    }
    
    public N endIntegrationScaleIO() {
      return and();
    }
    
  
  }
  public class SecretNested<N> extends SecretFluent<SecretNested<N>> implements Nested<N>{
    SecretNested(Secret item) {
      this.builder = new SecretBuilder(this, item);
    }
    SecretBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withSecret(builder.build());
    }
    
    public N endIntegrationSecret() {
      return and();
    }
    
  
  }
  public class StorageosNested<N> extends StorageosFluent<StorageosNested<N>> implements Nested<N>{
    StorageosNested(Storageos item) {
      this.builder = new StorageosBuilder(this, item);
    }
    StorageosBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withStorageos(builder.build());
    }
    
    public N endIntegrationStorageos() {
      return and();
    }
    
  
  }
  public class VsphereVolumeNested<N> extends VsphereVolumeFluent<VsphereVolumeNested<N>> implements Nested<N>{
    VsphereVolumeNested(VsphereVolume item) {
      this.builder = new VsphereVolumeBuilder(this, item);
    }
    VsphereVolumeBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withVsphereVolume(builder.build());
    }
    
    public N endIntegrationVsphereVolume() {
      return and();
    }
    
  
  }

}