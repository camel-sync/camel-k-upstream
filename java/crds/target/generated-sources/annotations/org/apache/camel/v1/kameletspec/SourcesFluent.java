package org.apache.camel.v1.kameletspec;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SourcesFluent<A extends SourcesFluent<A>> extends BaseFluent<A>{
  public SourcesFluent() {
  }
  
  public SourcesFluent(Sources instance) {
    this.copyInstance(instance);
  }
  private Boolean compression;
  private String content;
  private String contentKey;
  private String contentRef;
  private String contentType;
  private Boolean fromKamelet;
  private List<String> interceptors;
  private String language;
  private String loader;
  private String name;
  private String path;
  private List<String> propertyNames;
  private String rawContent;
  private String type;
  
  protected void copyInstance(Sources instance) {
    instance = (instance != null ? instance : new Sources());
    if (instance != null) {
          this.withCompression(instance.getCompression());
          this.withContent(instance.getContent());
          this.withContentKey(instance.getContentKey());
          this.withContentRef(instance.getContentRef());
          this.withContentType(instance.getContentType());
          this.withFromKamelet(instance.getFromKamelet());
          this.withInterceptors(instance.getInterceptors());
          this.withLanguage(instance.getLanguage());
          this.withLoader(instance.getLoader());
          this.withName(instance.getName());
          this.withPath(instance.getPath());
          this.withPropertyNames(instance.getPropertyNames());
          this.withRawContent(instance.getRawContent());
          this.withType(instance.getType());
        }
  }
  
  public Boolean getCompression() {
    return this.compression;
  }
  
  public A withCompression(Boolean compression) {
    this.compression = compression;
    return (A) this;
  }
  
  public boolean hasCompression() {
    return this.compression != null;
  }
  
  public String getContent() {
    return this.content;
  }
  
  public A withContent(String content) {
    this.content = content;
    return (A) this;
  }
  
  public boolean hasContent() {
    return this.content != null;
  }
  
  public String getContentKey() {
    return this.contentKey;
  }
  
  public A withContentKey(String contentKey) {
    this.contentKey = contentKey;
    return (A) this;
  }
  
  public boolean hasContentKey() {
    return this.contentKey != null;
  }
  
  public String getContentRef() {
    return this.contentRef;
  }
  
  public A withContentRef(String contentRef) {
    this.contentRef = contentRef;
    return (A) this;
  }
  
  public boolean hasContentRef() {
    return this.contentRef != null;
  }
  
  public String getContentType() {
    return this.contentType;
  }
  
  public A withContentType(String contentType) {
    this.contentType = contentType;
    return (A) this;
  }
  
  public boolean hasContentType() {
    return this.contentType != null;
  }
  
  public Boolean getFromKamelet() {
    return this.fromKamelet;
  }
  
  public A withFromKamelet(Boolean fromKamelet) {
    this.fromKamelet = fromKamelet;
    return (A) this;
  }
  
  public boolean hasFromKamelet() {
    return this.fromKamelet != null;
  }
  
  public A addToInterceptors(int index,String item) {
    if (this.interceptors == null) {this.interceptors = new ArrayList<String>();}
    this.interceptors.add(index, item);
    return (A)this;
  }
  
  public A setToInterceptors(int index,String item) {
    if (this.interceptors == null) {this.interceptors = new ArrayList<String>();}
    this.interceptors.set(index, item); return (A)this;
  }
  
  public A addToInterceptors(java.lang.String... items) {
    if (this.interceptors == null) {this.interceptors = new ArrayList<String>();}
    for (String item : items) {this.interceptors.add(item);} return (A)this;
  }
  
  public A addAllToInterceptors(Collection<String> items) {
    if (this.interceptors == null) {this.interceptors = new ArrayList<String>();}
    for (String item : items) {this.interceptors.add(item);} return (A)this;
  }
  
  public A removeFromInterceptors(java.lang.String... items) {
    if (this.interceptors == null) return (A)this;
    for (String item : items) { this.interceptors.remove(item);} return (A)this;
  }
  
  public A removeAllFromInterceptors(Collection<String> items) {
    if (this.interceptors == null) return (A)this;
    for (String item : items) { this.interceptors.remove(item);} return (A)this;
  }
  
  public List<String> getInterceptors() {
    return this.interceptors;
  }
  
  public String getInterceptor(int index) {
    return this.interceptors.get(index);
  }
  
  public String getFirstInterceptor() {
    return this.interceptors.get(0);
  }
  
  public String getLastInterceptor() {
    return this.interceptors.get(interceptors.size() - 1);
  }
  
  public String getMatchingInterceptor(Predicate<String> predicate) {
      for (String item : interceptors) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingInterceptor(Predicate<String> predicate) {
      for (String item : interceptors) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withInterceptors(List<String> interceptors) {
    if (interceptors != null) {
        this.interceptors = new ArrayList();
        for (String item : interceptors) {
          this.addToInterceptors(item);
        }
    } else {
      this.interceptors = null;
    }
    return (A) this;
  }
  
  public A withInterceptors(java.lang.String... interceptors) {
    if (this.interceptors != null) {
        this.interceptors.clear();
        _visitables.remove("interceptors");
    }
    if (interceptors != null) {
      for (String item : interceptors) {
        this.addToInterceptors(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasInterceptors() {
    return this.interceptors != null && !this.interceptors.isEmpty();
  }
  
  public String getLanguage() {
    return this.language;
  }
  
  public A withLanguage(String language) {
    this.language = language;
    return (A) this;
  }
  
  public boolean hasLanguage() {
    return this.language != null;
  }
  
  public String getLoader() {
    return this.loader;
  }
  
  public A withLoader(String loader) {
    this.loader = loader;
    return (A) this;
  }
  
  public boolean hasLoader() {
    return this.loader != null;
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
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public A addToPropertyNames(int index,String item) {
    if (this.propertyNames == null) {this.propertyNames = new ArrayList<String>();}
    this.propertyNames.add(index, item);
    return (A)this;
  }
  
  public A setToPropertyNames(int index,String item) {
    if (this.propertyNames == null) {this.propertyNames = new ArrayList<String>();}
    this.propertyNames.set(index, item); return (A)this;
  }
  
  public A addToPropertyNames(java.lang.String... items) {
    if (this.propertyNames == null) {this.propertyNames = new ArrayList<String>();}
    for (String item : items) {this.propertyNames.add(item);} return (A)this;
  }
  
  public A addAllToPropertyNames(Collection<String> items) {
    if (this.propertyNames == null) {this.propertyNames = new ArrayList<String>();}
    for (String item : items) {this.propertyNames.add(item);} return (A)this;
  }
  
  public A removeFromPropertyNames(java.lang.String... items) {
    if (this.propertyNames == null) return (A)this;
    for (String item : items) { this.propertyNames.remove(item);} return (A)this;
  }
  
  public A removeAllFromPropertyNames(Collection<String> items) {
    if (this.propertyNames == null) return (A)this;
    for (String item : items) { this.propertyNames.remove(item);} return (A)this;
  }
  
  public List<String> getPropertyNames() {
    return this.propertyNames;
  }
  
  public String getPropertyName(int index) {
    return this.propertyNames.get(index);
  }
  
  public String getFirstPropertyName() {
    return this.propertyNames.get(0);
  }
  
  public String getLastPropertyName() {
    return this.propertyNames.get(propertyNames.size() - 1);
  }
  
  public String getMatchingPropertyName(Predicate<String> predicate) {
      for (String item : propertyNames) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingPropertyName(Predicate<String> predicate) {
      for (String item : propertyNames) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPropertyNames(List<String> propertyNames) {
    if (propertyNames != null) {
        this.propertyNames = new ArrayList();
        for (String item : propertyNames) {
          this.addToPropertyNames(item);
        }
    } else {
      this.propertyNames = null;
    }
    return (A) this;
  }
  
  public A withPropertyNames(java.lang.String... propertyNames) {
    if (this.propertyNames != null) {
        this.propertyNames.clear();
        _visitables.remove("propertyNames");
    }
    if (propertyNames != null) {
      for (String item : propertyNames) {
        this.addToPropertyNames(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPropertyNames() {
    return this.propertyNames != null && !this.propertyNames.isEmpty();
  }
  
  public String getRawContent() {
    return this.rawContent;
  }
  
  public A withRawContent(String rawContent) {
    this.rawContent = rawContent;
    return (A) this;
  }
  
  public boolean hasRawContent() {
    return this.rawContent != null;
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    SourcesFluent that = (SourcesFluent) o;
    if (!java.util.Objects.equals(compression, that.compression)) return false;
    if (!java.util.Objects.equals(content, that.content)) return false;
    if (!java.util.Objects.equals(contentKey, that.contentKey)) return false;
    if (!java.util.Objects.equals(contentRef, that.contentRef)) return false;
    if (!java.util.Objects.equals(contentType, that.contentType)) return false;
    if (!java.util.Objects.equals(fromKamelet, that.fromKamelet)) return false;
    if (!java.util.Objects.equals(interceptors, that.interceptors)) return false;
    if (!java.util.Objects.equals(language, that.language)) return false;
    if (!java.util.Objects.equals(loader, that.loader)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(propertyNames, that.propertyNames)) return false;
    if (!java.util.Objects.equals(rawContent, that.rawContent)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(compression,  content,  contentKey,  contentRef,  contentType,  fromKamelet,  interceptors,  language,  loader,  name,  path,  propertyNames,  rawContent,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (compression != null) { sb.append("compression:"); sb.append(compression + ","); }
    if (content != null) { sb.append("content:"); sb.append(content + ","); }
    if (contentKey != null) { sb.append("contentKey:"); sb.append(contentKey + ","); }
    if (contentRef != null) { sb.append("contentRef:"); sb.append(contentRef + ","); }
    if (contentType != null) { sb.append("contentType:"); sb.append(contentType + ","); }
    if (fromKamelet != null) { sb.append("fromKamelet:"); sb.append(fromKamelet + ","); }
    if (interceptors != null && !interceptors.isEmpty()) { sb.append("interceptors:"); sb.append(interceptors + ","); }
    if (language != null) { sb.append("language:"); sb.append(language + ","); }
    if (loader != null) { sb.append("loader:"); sb.append(loader + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (propertyNames != null && !propertyNames.isEmpty()) { sb.append("propertyNames:"); sb.append(propertyNames + ","); }
    if (rawContent != null) { sb.append("rawContent:"); sb.append(rawContent + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCompression() {
    return withCompression(true);
  }
  
  public A withFromKamelet() {
    return withFromKamelet(true);
  }
  

}