package org.apache.camel.v1.integrationplatformstatus.build;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import org.apache.camel.v1.integrationplatformstatus.build.maven.CaSecrets;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import org.apache.camel.v1.integrationplatformstatus.build.maven.ExtensionBuilder;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import org.apache.camel.v1.integrationplatformstatus.build.maven.SettingsBuilder;
import org.apache.camel.v1.integrationplatformstatus.build.maven.ExtensionFluent;
import org.apache.camel.v1.integrationplatformstatus.build.maven.Profiles;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import org.apache.camel.v1.integrationplatformstatus.build.maven.CaSecretsFluent;
import org.apache.camel.v1.integrationplatformstatus.build.maven.SettingsFluent;
import org.apache.camel.v1.integrationplatformstatus.build.maven.Settings;
import org.apache.camel.v1.integrationplatformstatus.build.maven.CaSecretsBuilder;
import org.apache.camel.v1.integrationplatformstatus.build.maven.ProfilesBuilder;
import org.apache.camel.v1.integrationplatformstatus.build.maven.SettingsSecurityBuilder;
import org.apache.camel.v1.integrationplatformstatus.build.maven.ProfilesFluent;
import org.apache.camel.v1.integrationplatformstatus.build.maven.Extension;
import org.apache.camel.v1.integrationplatformstatus.build.maven.SettingsSecurity;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import org.apache.camel.v1.integrationplatformstatus.build.maven.SettingsSecurityFluent;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class MavenFluent<A extends MavenFluent<A>> extends BaseFluent<A>{
  public MavenFluent() {
  }
  
  public MavenFluent(Maven instance) {
    this.copyInstance(instance);
  }
  private ArrayList<CaSecretsBuilder> caSecrets;
  private List<String> cliOptions;
  private ArrayList<ExtensionBuilder> extension;
  private String localRepository;
  private ArrayList<ProfilesBuilder> profiles;
  private Map<String,String> properties;
  private SettingsBuilder settings;
  private SettingsSecurityBuilder settingsSecurity;
  
  protected void copyInstance(Maven instance) {
    instance = (instance != null ? instance : new Maven());
    if (instance != null) {
          this.withCaSecrets(instance.getCaSecrets());
          this.withCliOptions(instance.getCliOptions());
          this.withExtension(instance.getExtension());
          this.withLocalRepository(instance.getLocalRepository());
          this.withProfiles(instance.getProfiles());
          this.withProperties(instance.getProperties());
          this.withSettings(instance.getSettings());
          this.withSettingsSecurity(instance.getSettingsSecurity());
        }
  }
  
  public A addToCaSecrets(int index,CaSecrets item) {
    if (this.caSecrets == null) {this.caSecrets = new ArrayList<CaSecretsBuilder>();}
    CaSecretsBuilder builder = new CaSecretsBuilder(item);
    if (index < 0 || index >= caSecrets.size()) { _visitables.get("caSecrets").add(builder); caSecrets.add(builder); } else { _visitables.get("caSecrets").add(index, builder); caSecrets.add(index, builder);}
    return (A)this;
  }
  
  public A setToCaSecrets(int index,CaSecrets item) {
    if (this.caSecrets == null) {this.caSecrets = new ArrayList<CaSecretsBuilder>();}
    CaSecretsBuilder builder = new CaSecretsBuilder(item);
    if (index < 0 || index >= caSecrets.size()) { _visitables.get("caSecrets").add(builder); caSecrets.add(builder); } else { _visitables.get("caSecrets").set(index, builder); caSecrets.set(index, builder);}
    return (A)this;
  }
  
  public A addToCaSecrets(org.apache.camel.v1.integrationplatformstatus.build.maven.CaSecrets... items) {
    if (this.caSecrets == null) {this.caSecrets = new ArrayList<CaSecretsBuilder>();}
    for (CaSecrets item : items) {CaSecretsBuilder builder = new CaSecretsBuilder(item);_visitables.get("caSecrets").add(builder);this.caSecrets.add(builder);} return (A)this;
  }
  
  public A addAllToBuildCaSecrets(Collection<CaSecrets> items) {
    if (this.caSecrets == null) {this.caSecrets = new ArrayList<CaSecretsBuilder>();}
    for (CaSecrets item : items) {CaSecretsBuilder builder = new CaSecretsBuilder(item);_visitables.get("caSecrets").add(builder);this.caSecrets.add(builder);} return (A)this;
  }
  
  public A removeFromCaSecrets(org.apache.camel.v1.integrationplatformstatus.build.maven.CaSecrets... items) {
    if (this.caSecrets == null) return (A)this;
    for (CaSecrets item : items) {CaSecretsBuilder builder = new CaSecretsBuilder(item);_visitables.get("caSecrets").remove(builder); this.caSecrets.remove(builder);} return (A)this;
  }
  
  public A removeAllFromBuildCaSecrets(Collection<CaSecrets> items) {
    if (this.caSecrets == null) return (A)this;
    for (CaSecrets item : items) {CaSecretsBuilder builder = new CaSecretsBuilder(item);_visitables.get("caSecrets").remove(builder); this.caSecrets.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromBuildCaSecrets(Predicate<CaSecretsBuilder> predicate) {
    if (caSecrets == null) return (A) this;
    final Iterator<CaSecretsBuilder> each = caSecrets.iterator();
    final List visitables = _visitables.get("caSecrets");
    while (each.hasNext()) {
      CaSecretsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<CaSecrets> buildCaSecrets() {
    return this.caSecrets != null ? build(caSecrets) : null;
  }
  
  public CaSecrets buildCaSecret(int index) {
    return this.caSecrets.get(index).build();
  }
  
  public CaSecrets buildFirstCaSecret() {
    return this.caSecrets.get(0).build();
  }
  
  public CaSecrets buildLastCaSecret() {
    return this.caSecrets.get(caSecrets.size() - 1).build();
  }
  
  public CaSecrets buildMatchingCaSecret(Predicate<CaSecretsBuilder> predicate) {
      for (CaSecretsBuilder item : caSecrets) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCaSecret(Predicate<CaSecretsBuilder> predicate) {
      for (CaSecretsBuilder item : caSecrets) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withCaSecrets(List<CaSecrets> caSecrets) {
    if (this.caSecrets != null) {
      this._visitables.get("caSecrets").clear();
    }
    if (caSecrets != null) {
        this.caSecrets = new ArrayList();
        for (CaSecrets item : caSecrets) {
          this.addToCaSecrets(item);
        }
    } else {
      this.caSecrets = null;
    }
    return (A) this;
  }
  
  public A withCaSecrets(org.apache.camel.v1.integrationplatformstatus.build.maven.CaSecrets... caSecrets) {
    if (this.caSecrets != null) {
        this.caSecrets.clear();
        _visitables.remove("caSecrets");
    }
    if (caSecrets != null) {
      for (CaSecrets item : caSecrets) {
        this.addToCaSecrets(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasCaSecrets() {
    return this.caSecrets != null && !this.caSecrets.isEmpty();
  }
  
  public CaSecretsNested<A> addNewCaSecret() {
    return new CaSecretsNested(-1, null);
  }
  
  public CaSecretsNested<A> addNewCaSecretLike(CaSecrets item) {
    return new CaSecretsNested(-1, item);
  }
  
  public CaSecretsNested<A> setNewCaSecretLike(int index,CaSecrets item) {
    return new CaSecretsNested(index, item);
  }
  
  public CaSecretsNested<A> editCaSecret(int index) {
    if (caSecrets.size() <= index) throw new RuntimeException("Can't edit caSecrets. Index exceeds size.");
    return setNewCaSecretLike(index, buildCaSecret(index));
  }
  
  public CaSecretsNested<A> editFirstCaSecret() {
    if (caSecrets.size() == 0) throw new RuntimeException("Can't edit first caSecrets. The list is empty.");
    return setNewCaSecretLike(0, buildCaSecret(0));
  }
  
  public CaSecretsNested<A> editLastCaSecret() {
    int index = caSecrets.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last caSecrets. The list is empty.");
    return setNewCaSecretLike(index, buildCaSecret(index));
  }
  
  public CaSecretsNested<A> editMatchingCaSecret(Predicate<CaSecretsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<caSecrets.size();i++) { 
    if (predicate.test(caSecrets.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching caSecrets. No match found.");
    return setNewCaSecretLike(index, buildCaSecret(index));
  }
  
  public A addToCliOptions(int index,String item) {
    if (this.cliOptions == null) {this.cliOptions = new ArrayList<String>();}
    this.cliOptions.add(index, item);
    return (A)this;
  }
  
  public A setToCliOptions(int index,String item) {
    if (this.cliOptions == null) {this.cliOptions = new ArrayList<String>();}
    this.cliOptions.set(index, item); return (A)this;
  }
  
  public A addToCliOptions(java.lang.String... items) {
    if (this.cliOptions == null) {this.cliOptions = new ArrayList<String>();}
    for (String item : items) {this.cliOptions.add(item);} return (A)this;
  }
  
  public A addAllToCliOptions(Collection<String> items) {
    if (this.cliOptions == null) {this.cliOptions = new ArrayList<String>();}
    for (String item : items) {this.cliOptions.add(item);} return (A)this;
  }
  
  public A removeFromCliOptions(java.lang.String... items) {
    if (this.cliOptions == null) return (A)this;
    for (String item : items) { this.cliOptions.remove(item);} return (A)this;
  }
  
  public A removeAllFromCliOptions(Collection<String> items) {
    if (this.cliOptions == null) return (A)this;
    for (String item : items) { this.cliOptions.remove(item);} return (A)this;
  }
  
  public List<String> getCliOptions() {
    return this.cliOptions;
  }
  
  public String getCliOption(int index) {
    return this.cliOptions.get(index);
  }
  
  public String getFirstCliOption() {
    return this.cliOptions.get(0);
  }
  
  public String getLastCliOption() {
    return this.cliOptions.get(cliOptions.size() - 1);
  }
  
  public String getMatchingCliOption(Predicate<String> predicate) {
      for (String item : cliOptions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingCliOption(Predicate<String> predicate) {
      for (String item : cliOptions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withCliOptions(List<String> cliOptions) {
    if (cliOptions != null) {
        this.cliOptions = new ArrayList();
        for (String item : cliOptions) {
          this.addToCliOptions(item);
        }
    } else {
      this.cliOptions = null;
    }
    return (A) this;
  }
  
  public A withCliOptions(java.lang.String... cliOptions) {
    if (this.cliOptions != null) {
        this.cliOptions.clear();
        _visitables.remove("cliOptions");
    }
    if (cliOptions != null) {
      for (String item : cliOptions) {
        this.addToCliOptions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasCliOptions() {
    return this.cliOptions != null && !this.cliOptions.isEmpty();
  }
  
  public A addToExtension(int index,Extension item) {
    if (this.extension == null) {this.extension = new ArrayList<ExtensionBuilder>();}
    ExtensionBuilder builder = new ExtensionBuilder(item);
    if (index < 0 || index >= extension.size()) { _visitables.get("extension").add(builder); extension.add(builder); } else { _visitables.get("extension").add(index, builder); extension.add(index, builder);}
    return (A)this;
  }
  
  public A setToExtension(int index,Extension item) {
    if (this.extension == null) {this.extension = new ArrayList<ExtensionBuilder>();}
    ExtensionBuilder builder = new ExtensionBuilder(item);
    if (index < 0 || index >= extension.size()) { _visitables.get("extension").add(builder); extension.add(builder); } else { _visitables.get("extension").set(index, builder); extension.set(index, builder);}
    return (A)this;
  }
  
  public A addToExtension(org.apache.camel.v1.integrationplatformstatus.build.maven.Extension... items) {
    if (this.extension == null) {this.extension = new ArrayList<ExtensionBuilder>();}
    for (Extension item : items) {ExtensionBuilder builder = new ExtensionBuilder(item);_visitables.get("extension").add(builder);this.extension.add(builder);} return (A)this;
  }
  
  public A addAllToBuildExtension(Collection<Extension> items) {
    if (this.extension == null) {this.extension = new ArrayList<ExtensionBuilder>();}
    for (Extension item : items) {ExtensionBuilder builder = new ExtensionBuilder(item);_visitables.get("extension").add(builder);this.extension.add(builder);} return (A)this;
  }
  
  public A removeFromExtension(org.apache.camel.v1.integrationplatformstatus.build.maven.Extension... items) {
    if (this.extension == null) return (A)this;
    for (Extension item : items) {ExtensionBuilder builder = new ExtensionBuilder(item);_visitables.get("extension").remove(builder); this.extension.remove(builder);} return (A)this;
  }
  
  public A removeAllFromBuildExtension(Collection<Extension> items) {
    if (this.extension == null) return (A)this;
    for (Extension item : items) {ExtensionBuilder builder = new ExtensionBuilder(item);_visitables.get("extension").remove(builder); this.extension.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromBuildExtension(Predicate<ExtensionBuilder> predicate) {
    if (extension == null) return (A) this;
    final Iterator<ExtensionBuilder> each = extension.iterator();
    final List visitables = _visitables.get("extension");
    while (each.hasNext()) {
      ExtensionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Extension> buildExtension() {
    return this.extension != null ? build(extension) : null;
  }
  
  public Extension buildExtension(int index) {
    return this.extension.get(index).build();
  }
  
  public Extension buildFirstExtension() {
    return this.extension.get(0).build();
  }
  
  public Extension buildLastExtension() {
    return this.extension.get(extension.size() - 1).build();
  }
  
  public Extension buildMatchingExtension(Predicate<ExtensionBuilder> predicate) {
      for (ExtensionBuilder item : extension) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingExtension(Predicate<ExtensionBuilder> predicate) {
      for (ExtensionBuilder item : extension) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withExtension(List<Extension> extension) {
    if (this.extension != null) {
      this._visitables.get("extension").clear();
    }
    if (extension != null) {
        this.extension = new ArrayList();
        for (Extension item : extension) {
          this.addToExtension(item);
        }
    } else {
      this.extension = null;
    }
    return (A) this;
  }
  
  public A withExtension(org.apache.camel.v1.integrationplatformstatus.build.maven.Extension... extension) {
    if (this.extension != null) {
        this.extension.clear();
        _visitables.remove("extension");
    }
    if (extension != null) {
      for (Extension item : extension) {
        this.addToExtension(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasExtension() {
    return this.extension != null && !this.extension.isEmpty();
  }
  
  public ExtensionNested<A> addNewExtension() {
    return new ExtensionNested(-1, null);
  }
  
  public ExtensionNested<A> addNewExtensionLike(Extension item) {
    return new ExtensionNested(-1, item);
  }
  
  public ExtensionNested<A> setNewExtensionLike(int index,Extension item) {
    return new ExtensionNested(index, item);
  }
  
  public ExtensionNested<A> editExtension(int index) {
    if (extension.size() <= index) throw new RuntimeException("Can't edit extension. Index exceeds size.");
    return setNewExtensionLike(index, buildExtension(index));
  }
  
  public ExtensionNested<A> editFirstExtension() {
    if (extension.size() == 0) throw new RuntimeException("Can't edit first extension. The list is empty.");
    return setNewExtensionLike(0, buildExtension(0));
  }
  
  public ExtensionNested<A> editLastExtension() {
    int index = extension.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last extension. The list is empty.");
    return setNewExtensionLike(index, buildExtension(index));
  }
  
  public ExtensionNested<A> editMatchingExtension(Predicate<ExtensionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<extension.size();i++) { 
    if (predicate.test(extension.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching extension. No match found.");
    return setNewExtensionLike(index, buildExtension(index));
  }
  
  public String getLocalRepository() {
    return this.localRepository;
  }
  
  public A withLocalRepository(String localRepository) {
    this.localRepository = localRepository;
    return (A) this;
  }
  
  public boolean hasLocalRepository() {
    return this.localRepository != null;
  }
  
  public A addToProfiles(int index,Profiles item) {
    if (this.profiles == null) {this.profiles = new ArrayList<ProfilesBuilder>();}
    ProfilesBuilder builder = new ProfilesBuilder(item);
    if (index < 0 || index >= profiles.size()) { _visitables.get("profiles").add(builder); profiles.add(builder); } else { _visitables.get("profiles").add(index, builder); profiles.add(index, builder);}
    return (A)this;
  }
  
  public A setToProfiles(int index,Profiles item) {
    if (this.profiles == null) {this.profiles = new ArrayList<ProfilesBuilder>();}
    ProfilesBuilder builder = new ProfilesBuilder(item);
    if (index < 0 || index >= profiles.size()) { _visitables.get("profiles").add(builder); profiles.add(builder); } else { _visitables.get("profiles").set(index, builder); profiles.set(index, builder);}
    return (A)this;
  }
  
  public A addToProfiles(org.apache.camel.v1.integrationplatformstatus.build.maven.Profiles... items) {
    if (this.profiles == null) {this.profiles = new ArrayList<ProfilesBuilder>();}
    for (Profiles item : items) {ProfilesBuilder builder = new ProfilesBuilder(item);_visitables.get("profiles").add(builder);this.profiles.add(builder);} return (A)this;
  }
  
  public A addAllToBuildProfiles(Collection<Profiles> items) {
    if (this.profiles == null) {this.profiles = new ArrayList<ProfilesBuilder>();}
    for (Profiles item : items) {ProfilesBuilder builder = new ProfilesBuilder(item);_visitables.get("profiles").add(builder);this.profiles.add(builder);} return (A)this;
  }
  
  public A removeFromProfiles(org.apache.camel.v1.integrationplatformstatus.build.maven.Profiles... items) {
    if (this.profiles == null) return (A)this;
    for (Profiles item : items) {ProfilesBuilder builder = new ProfilesBuilder(item);_visitables.get("profiles").remove(builder); this.profiles.remove(builder);} return (A)this;
  }
  
  public A removeAllFromBuildProfiles(Collection<Profiles> items) {
    if (this.profiles == null) return (A)this;
    for (Profiles item : items) {ProfilesBuilder builder = new ProfilesBuilder(item);_visitables.get("profiles").remove(builder); this.profiles.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromBuildProfiles(Predicate<ProfilesBuilder> predicate) {
    if (profiles == null) return (A) this;
    final Iterator<ProfilesBuilder> each = profiles.iterator();
    final List visitables = _visitables.get("profiles");
    while (each.hasNext()) {
      ProfilesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Profiles> buildProfiles() {
    return this.profiles != null ? build(profiles) : null;
  }
  
  public Profiles buildProfile(int index) {
    return this.profiles.get(index).build();
  }
  
  public Profiles buildFirstProfile() {
    return this.profiles.get(0).build();
  }
  
  public Profiles buildLastProfile() {
    return this.profiles.get(profiles.size() - 1).build();
  }
  
  public Profiles buildMatchingProfile(Predicate<ProfilesBuilder> predicate) {
      for (ProfilesBuilder item : profiles) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingProfile(Predicate<ProfilesBuilder> predicate) {
      for (ProfilesBuilder item : profiles) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withProfiles(List<Profiles> profiles) {
    if (this.profiles != null) {
      this._visitables.get("profiles").clear();
    }
    if (profiles != null) {
        this.profiles = new ArrayList();
        for (Profiles item : profiles) {
          this.addToProfiles(item);
        }
    } else {
      this.profiles = null;
    }
    return (A) this;
  }
  
  public A withProfiles(org.apache.camel.v1.integrationplatformstatus.build.maven.Profiles... profiles) {
    if (this.profiles != null) {
        this.profiles.clear();
        _visitables.remove("profiles");
    }
    if (profiles != null) {
      for (Profiles item : profiles) {
        this.addToProfiles(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasProfiles() {
    return this.profiles != null && !this.profiles.isEmpty();
  }
  
  public ProfilesNested<A> addNewProfile() {
    return new ProfilesNested(-1, null);
  }
  
  public ProfilesNested<A> addNewProfileLike(Profiles item) {
    return new ProfilesNested(-1, item);
  }
  
  public ProfilesNested<A> setNewProfileLike(int index,Profiles item) {
    return new ProfilesNested(index, item);
  }
  
  public ProfilesNested<A> editProfile(int index) {
    if (profiles.size() <= index) throw new RuntimeException("Can't edit profiles. Index exceeds size.");
    return setNewProfileLike(index, buildProfile(index));
  }
  
  public ProfilesNested<A> editFirstProfile() {
    if (profiles.size() == 0) throw new RuntimeException("Can't edit first profiles. The list is empty.");
    return setNewProfileLike(0, buildProfile(0));
  }
  
  public ProfilesNested<A> editLastProfile() {
    int index = profiles.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last profiles. The list is empty.");
    return setNewProfileLike(index, buildProfile(index));
  }
  
  public ProfilesNested<A> editMatchingProfile(Predicate<ProfilesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<profiles.size();i++) { 
    if (predicate.test(profiles.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching profiles. No match found.");
    return setNewProfileLike(index, buildProfile(index));
  }
  
  public A addToProperties(String key,String value) {
    if(this.properties == null && key != null && value != null) { this.properties = new LinkedHashMap(); }
    if(key != null && value != null) {this.properties.put(key, value);} return (A)this;
  }
  
  public A addToProperties(Map<String,String> map) {
    if(this.properties == null && map != null) { this.properties = new LinkedHashMap(); }
    if(map != null) { this.properties.putAll(map);} return (A)this;
  }
  
  public A removeFromProperties(String key) {
    if(this.properties == null) { return (A) this; }
    if(key != null && this.properties != null) {this.properties.remove(key);} return (A)this;
  }
  
  public A removeFromProperties(Map<String,String> map) {
    if(this.properties == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.properties != null){this.properties.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getProperties() {
    return this.properties;
  }
  
  public <K,V>A withProperties(Map<String,String> properties) {
    if (properties == null) {
      this.properties = null;
    } else {
      this.properties = new LinkedHashMap(properties);
    }
    return (A) this;
  }
  
  public boolean hasProperties() {
    return this.properties != null;
  }
  
  public Settings buildSettings() {
    return this.settings != null ? this.settings.build() : null;
  }
  
  public A withSettings(Settings settings) {
    this._visitables.remove("settings");
    if (settings != null) {
        this.settings = new SettingsBuilder(settings);
        this._visitables.get("settings").add(this.settings);
    } else {
        this.settings = null;
        this._visitables.get("settings").remove(this.settings);
    }
    return (A) this;
  }
  
  public boolean hasSettings() {
    return this.settings != null;
  }
  
  public SettingsNested<A> withNewSettings() {
    return new SettingsNested(null);
  }
  
  public SettingsNested<A> withNewSettingsLike(Settings item) {
    return new SettingsNested(item);
  }
  
  public SettingsNested<A> editBuildSettings() {
    return withNewSettingsLike(java.util.Optional.ofNullable(buildSettings()).orElse(null));
  }
  
  public SettingsNested<A> editOrNewSettings() {
    return withNewSettingsLike(java.util.Optional.ofNullable(buildSettings()).orElse(new SettingsBuilder().build()));
  }
  
  public SettingsNested<A> editOrNewSettingsLike(Settings item) {
    return withNewSettingsLike(java.util.Optional.ofNullable(buildSettings()).orElse(item));
  }
  
  public SettingsSecurity buildSettingsSecurity() {
    return this.settingsSecurity != null ? this.settingsSecurity.build() : null;
  }
  
  public A withSettingsSecurity(SettingsSecurity settingsSecurity) {
    this._visitables.remove("settingsSecurity");
    if (settingsSecurity != null) {
        this.settingsSecurity = new SettingsSecurityBuilder(settingsSecurity);
        this._visitables.get("settingsSecurity").add(this.settingsSecurity);
    } else {
        this.settingsSecurity = null;
        this._visitables.get("settingsSecurity").remove(this.settingsSecurity);
    }
    return (A) this;
  }
  
  public boolean hasSettingsSecurity() {
    return this.settingsSecurity != null;
  }
  
  public SettingsSecurityNested<A> withNewSettingsSecurity() {
    return new SettingsSecurityNested(null);
  }
  
  public SettingsSecurityNested<A> withNewSettingsSecurityLike(SettingsSecurity item) {
    return new SettingsSecurityNested(item);
  }
  
  public SettingsSecurityNested<A> editBuildSettingsSecurity() {
    return withNewSettingsSecurityLike(java.util.Optional.ofNullable(buildSettingsSecurity()).orElse(null));
  }
  
  public SettingsSecurityNested<A> editOrNewSettingsSecurity() {
    return withNewSettingsSecurityLike(java.util.Optional.ofNullable(buildSettingsSecurity()).orElse(new SettingsSecurityBuilder().build()));
  }
  
  public SettingsSecurityNested<A> editOrNewSettingsSecurityLike(SettingsSecurity item) {
    return withNewSettingsSecurityLike(java.util.Optional.ofNullable(buildSettingsSecurity()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    MavenFluent that = (MavenFluent) o;
    if (!java.util.Objects.equals(caSecrets, that.caSecrets)) return false;
    if (!java.util.Objects.equals(cliOptions, that.cliOptions)) return false;
    if (!java.util.Objects.equals(extension, that.extension)) return false;
    if (!java.util.Objects.equals(localRepository, that.localRepository)) return false;
    if (!java.util.Objects.equals(profiles, that.profiles)) return false;
    if (!java.util.Objects.equals(properties, that.properties)) return false;
    if (!java.util.Objects.equals(settings, that.settings)) return false;
    if (!java.util.Objects.equals(settingsSecurity, that.settingsSecurity)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(caSecrets,  cliOptions,  extension,  localRepository,  profiles,  properties,  settings,  settingsSecurity,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (caSecrets != null && !caSecrets.isEmpty()) { sb.append("caSecrets:"); sb.append(caSecrets + ","); }
    if (cliOptions != null && !cliOptions.isEmpty()) { sb.append("cliOptions:"); sb.append(cliOptions + ","); }
    if (extension != null && !extension.isEmpty()) { sb.append("extension:"); sb.append(extension + ","); }
    if (localRepository != null) { sb.append("localRepository:"); sb.append(localRepository + ","); }
    if (profiles != null && !profiles.isEmpty()) { sb.append("profiles:"); sb.append(profiles + ","); }
    if (properties != null && !properties.isEmpty()) { sb.append("properties:"); sb.append(properties + ","); }
    if (settings != null) { sb.append("settings:"); sb.append(settings + ","); }
    if (settingsSecurity != null) { sb.append("settingsSecurity:"); sb.append(settingsSecurity); }
    sb.append("}");
    return sb.toString();
  }
  public class CaSecretsNested<N> extends CaSecretsFluent<CaSecretsNested<N>> implements Nested<N>{
    CaSecretsNested(int index,CaSecrets item) {
      this.index = index;
      this.builder = new CaSecretsBuilder(this, item);
    }
    CaSecretsBuilder builder;
    int index;
    
    public N and() {
      return (N) MavenFluent.this.setToCaSecrets(index,builder.build());
    }
    
    public N endBuildCaSecret() {
      return and();
    }
    
  
  }
  public class ExtensionNested<N> extends ExtensionFluent<ExtensionNested<N>> implements Nested<N>{
    ExtensionNested(int index,Extension item) {
      this.index = index;
      this.builder = new ExtensionBuilder(this, item);
    }
    ExtensionBuilder builder;
    int index;
    
    public N and() {
      return (N) MavenFluent.this.setToExtension(index,builder.build());
    }
    
    public N endBuildExtension() {
      return and();
    }
    
  
  }
  public class ProfilesNested<N> extends ProfilesFluent<ProfilesNested<N>> implements Nested<N>{
    ProfilesNested(int index,Profiles item) {
      this.index = index;
      this.builder = new ProfilesBuilder(this, item);
    }
    ProfilesBuilder builder;
    int index;
    
    public N and() {
      return (N) MavenFluent.this.setToProfiles(index,builder.build());
    }
    
    public N endBuildProfile() {
      return and();
    }
    
  
  }
  public class SettingsNested<N> extends SettingsFluent<SettingsNested<N>> implements Nested<N>{
    SettingsNested(Settings item) {
      this.builder = new SettingsBuilder(this, item);
    }
    SettingsBuilder builder;
    
    public N and() {
      return (N) MavenFluent.this.withSettings(builder.build());
    }
    
    public N endBuildSettings() {
      return and();
    }
    
  
  }
  public class SettingsSecurityNested<N> extends SettingsSecurityFluent<SettingsSecurityNested<N>> implements Nested<N>{
    SettingsSecurityNested(SettingsSecurity item) {
      this.builder = new SettingsSecurityBuilder(this, item);
    }
    SettingsSecurityBuilder builder;
    
    public N and() {
      return (N) MavenFluent.this.withSettingsSecurity(builder.build());
    }
    
    public N endBuildSettingsSecurity() {
      return and();
    }
    
  
  }

}