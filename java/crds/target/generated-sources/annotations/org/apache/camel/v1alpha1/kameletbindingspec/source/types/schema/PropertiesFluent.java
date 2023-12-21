package org.apache.camel.v1alpha1.kameletbindingspec.source.types.schema;

import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.AnyType;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PropertiesFluent<A extends PropertiesFluent<A>> extends BaseFluent<A>{
  public PropertiesFluent() {
  }
  
  public PropertiesFluent(Properties instance) {
    this.copyInstance(instance);
  }
  private Boolean deprecated;
  private String description;
  private AnyType example;
  private Boolean exclusiveMaximum;
  private Boolean exclusiveMinimum;
  private String format;
  private String id;
  private Long maxItems;
  private Long maxLength;
  private Long maxProperties;
  private String maximum;
  private Long minItems;
  private Long minLength;
  private Long minProperties;
  private String minimum;
  private String multipleOf;
  private Boolean nullable;
  private String pattern;
  private String title;
  private String type;
  private Boolean uniqueItems;
  private List<String> xDescriptors;
  
  protected void copyInstance(Properties instance) {
    instance = (instance != null ? instance : new Properties());
    if (instance != null) {
          this.withDeprecated(instance.getDeprecated());
          this.withDescription(instance.getDescription());
          this.withExample(instance.getExample());
          this.withExclusiveMaximum(instance.getExclusiveMaximum());
          this.withExclusiveMinimum(instance.getExclusiveMinimum());
          this.withFormat(instance.getFormat());
          this.withId(instance.getId());
          this.withMaxItems(instance.getMaxItems());
          this.withMaxLength(instance.getMaxLength());
          this.withMaxProperties(instance.getMaxProperties());
          this.withMaximum(instance.getMaximum());
          this.withMinItems(instance.getMinItems());
          this.withMinLength(instance.getMinLength());
          this.withMinProperties(instance.getMinProperties());
          this.withMinimum(instance.getMinimum());
          this.withMultipleOf(instance.getMultipleOf());
          this.withNullable(instance.getNullable());
          this.withPattern(instance.getPattern());
          this.withTitle(instance.getTitle());
          this.withType(instance.getType());
          this.withUniqueItems(instance.getUniqueItems());
          this.withXDescriptors(instance.getXDescriptors());
        }
  }
  
  public Boolean getDeprecated() {
    return this.deprecated;
  }
  
  public A withDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
    return (A) this;
  }
  
  public boolean hasDeprecated() {
    return this.deprecated != null;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public A withDescription(String description) {
    this.description = description;
    return (A) this;
  }
  
  public boolean hasDescription() {
    return this.description != null;
  }
  
  public AnyType getExample() {
    return this.example;
  }
  
  public A withExample(AnyType example) {
    this.example = example;
    return (A) this;
  }
  
  public boolean hasExample() {
    return this.example != null;
  }
  
  public A withNewExample(Object value) {
    return (A)withExample(new AnyType(value));
  }
  
  public Boolean getExclusiveMaximum() {
    return this.exclusiveMaximum;
  }
  
  public A withExclusiveMaximum(Boolean exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
    return (A) this;
  }
  
  public boolean hasExclusiveMaximum() {
    return this.exclusiveMaximum != null;
  }
  
  public Boolean getExclusiveMinimum() {
    return this.exclusiveMinimum;
  }
  
  public A withExclusiveMinimum(Boolean exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
    return (A) this;
  }
  
  public boolean hasExclusiveMinimum() {
    return this.exclusiveMinimum != null;
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public A withFormat(String format) {
    this.format = format;
    return (A) this;
  }
  
  public boolean hasFormat() {
    return this.format != null;
  }
  
  public String getId() {
    return this.id;
  }
  
  public A withId(String id) {
    this.id = id;
    return (A) this;
  }
  
  public boolean hasId() {
    return this.id != null;
  }
  
  public Long getMaxItems() {
    return this.maxItems;
  }
  
  public A withMaxItems(Long maxItems) {
    this.maxItems = maxItems;
    return (A) this;
  }
  
  public boolean hasMaxItems() {
    return this.maxItems != null;
  }
  
  public Long getMaxLength() {
    return this.maxLength;
  }
  
  public A withMaxLength(Long maxLength) {
    this.maxLength = maxLength;
    return (A) this;
  }
  
  public boolean hasMaxLength() {
    return this.maxLength != null;
  }
  
  public Long getMaxProperties() {
    return this.maxProperties;
  }
  
  public A withMaxProperties(Long maxProperties) {
    this.maxProperties = maxProperties;
    return (A) this;
  }
  
  public boolean hasMaxProperties() {
    return this.maxProperties != null;
  }
  
  public String getMaximum() {
    return this.maximum;
  }
  
  public A withMaximum(String maximum) {
    this.maximum = maximum;
    return (A) this;
  }
  
  public boolean hasMaximum() {
    return this.maximum != null;
  }
  
  public Long getMinItems() {
    return this.minItems;
  }
  
  public A withMinItems(Long minItems) {
    this.minItems = minItems;
    return (A) this;
  }
  
  public boolean hasMinItems() {
    return this.minItems != null;
  }
  
  public Long getMinLength() {
    return this.minLength;
  }
  
  public A withMinLength(Long minLength) {
    this.minLength = minLength;
    return (A) this;
  }
  
  public boolean hasMinLength() {
    return this.minLength != null;
  }
  
  public Long getMinProperties() {
    return this.minProperties;
  }
  
  public A withMinProperties(Long minProperties) {
    this.minProperties = minProperties;
    return (A) this;
  }
  
  public boolean hasMinProperties() {
    return this.minProperties != null;
  }
  
  public String getMinimum() {
    return this.minimum;
  }
  
  public A withMinimum(String minimum) {
    this.minimum = minimum;
    return (A) this;
  }
  
  public boolean hasMinimum() {
    return this.minimum != null;
  }
  
  public String getMultipleOf() {
    return this.multipleOf;
  }
  
  public A withMultipleOf(String multipleOf) {
    this.multipleOf = multipleOf;
    return (A) this;
  }
  
  public boolean hasMultipleOf() {
    return this.multipleOf != null;
  }
  
  public Boolean getNullable() {
    return this.nullable;
  }
  
  public A withNullable(Boolean nullable) {
    this.nullable = nullable;
    return (A) this;
  }
  
  public boolean hasNullable() {
    return this.nullable != null;
  }
  
  public String getPattern() {
    return this.pattern;
  }
  
  public A withPattern(String pattern) {
    this.pattern = pattern;
    return (A) this;
  }
  
  public boolean hasPattern() {
    return this.pattern != null;
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public A withTitle(String title) {
    this.title = title;
    return (A) this;
  }
  
  public boolean hasTitle() {
    return this.title != null;
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
  
  public Boolean getUniqueItems() {
    return this.uniqueItems;
  }
  
  public A withUniqueItems(Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
    return (A) this;
  }
  
  public boolean hasUniqueItems() {
    return this.uniqueItems != null;
  }
  
  public A addToXDescriptors(int index,String item) {
    if (this.xDescriptors == null) {this.xDescriptors = new ArrayList<String>();}
    this.xDescriptors.add(index, item);
    return (A)this;
  }
  
  public A setToXDescriptors(int index,String item) {
    if (this.xDescriptors == null) {this.xDescriptors = new ArrayList<String>();}
    this.xDescriptors.set(index, item); return (A)this;
  }
  
  public A addToXDescriptors(java.lang.String... items) {
    if (this.xDescriptors == null) {this.xDescriptors = new ArrayList<String>();}
    for (String item : items) {this.xDescriptors.add(item);} return (A)this;
  }
  
  public A addAllToXDescriptors(Collection<String> items) {
    if (this.xDescriptors == null) {this.xDescriptors = new ArrayList<String>();}
    for (String item : items) {this.xDescriptors.add(item);} return (A)this;
  }
  
  public A removeFromXDescriptors(java.lang.String... items) {
    if (this.xDescriptors == null) return (A)this;
    for (String item : items) { this.xDescriptors.remove(item);} return (A)this;
  }
  
  public A removeAllFromXDescriptors(Collection<String> items) {
    if (this.xDescriptors == null) return (A)this;
    for (String item : items) { this.xDescriptors.remove(item);} return (A)this;
  }
  
  public List<String> getXDescriptors() {
    return this.xDescriptors;
  }
  
  public String getXDescriptor(int index) {
    return this.xDescriptors.get(index);
  }
  
  public String getFirstXDescriptor() {
    return this.xDescriptors.get(0);
  }
  
  public String getLastXDescriptor() {
    return this.xDescriptors.get(xDescriptors.size() - 1);
  }
  
  public String getMatchingXDescriptor(Predicate<String> predicate) {
      for (String item : xDescriptors) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingXDescriptor(Predicate<String> predicate) {
      for (String item : xDescriptors) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withXDescriptors(List<String> xDescriptors) {
    if (xDescriptors != null) {
        this.xDescriptors = new ArrayList();
        for (String item : xDescriptors) {
          this.addToXDescriptors(item);
        }
    } else {
      this.xDescriptors = null;
    }
    return (A) this;
  }
  
  public A withXDescriptors(java.lang.String... xDescriptors) {
    if (this.xDescriptors != null) {
        this.xDescriptors.clear();
        _visitables.remove("xDescriptors");
    }
    if (xDescriptors != null) {
      for (String item : xDescriptors) {
        this.addToXDescriptors(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasXDescriptors() {
    return this.xDescriptors != null && !this.xDescriptors.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    PropertiesFluent that = (PropertiesFluent) o;
    if (!java.util.Objects.equals(deprecated, that.deprecated)) return false;
    if (!java.util.Objects.equals(description, that.description)) return false;
    if (!java.util.Objects.equals(example, that.example)) return false;
    if (!java.util.Objects.equals(exclusiveMaximum, that.exclusiveMaximum)) return false;
    if (!java.util.Objects.equals(exclusiveMinimum, that.exclusiveMinimum)) return false;
    if (!java.util.Objects.equals(format, that.format)) return false;
    if (!java.util.Objects.equals(id, that.id)) return false;
    if (!java.util.Objects.equals(maxItems, that.maxItems)) return false;
    if (!java.util.Objects.equals(maxLength, that.maxLength)) return false;
    if (!java.util.Objects.equals(maxProperties, that.maxProperties)) return false;
    if (!java.util.Objects.equals(maximum, that.maximum)) return false;
    if (!java.util.Objects.equals(minItems, that.minItems)) return false;
    if (!java.util.Objects.equals(minLength, that.minLength)) return false;
    if (!java.util.Objects.equals(minProperties, that.minProperties)) return false;
    if (!java.util.Objects.equals(minimum, that.minimum)) return false;
    if (!java.util.Objects.equals(multipleOf, that.multipleOf)) return false;
    if (!java.util.Objects.equals(nullable, that.nullable)) return false;
    if (!java.util.Objects.equals(pattern, that.pattern)) return false;
    if (!java.util.Objects.equals(title, that.title)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    if (!java.util.Objects.equals(uniqueItems, that.uniqueItems)) return false;
    if (!java.util.Objects.equals(xDescriptors, that.xDescriptors)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(deprecated,  description,  example,  exclusiveMaximum,  exclusiveMinimum,  format,  id,  maxItems,  maxLength,  maxProperties,  maximum,  minItems,  minLength,  minProperties,  minimum,  multipleOf,  nullable,  pattern,  title,  type,  uniqueItems,  xDescriptors,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (deprecated != null) { sb.append("deprecated:"); sb.append(deprecated + ","); }
    if (description != null) { sb.append("description:"); sb.append(description + ","); }
    if (example != null) { sb.append("example:"); sb.append(example + ","); }
    if (exclusiveMaximum != null) { sb.append("exclusiveMaximum:"); sb.append(exclusiveMaximum + ","); }
    if (exclusiveMinimum != null) { sb.append("exclusiveMinimum:"); sb.append(exclusiveMinimum + ","); }
    if (format != null) { sb.append("format:"); sb.append(format + ","); }
    if (id != null) { sb.append("id:"); sb.append(id + ","); }
    if (maxItems != null) { sb.append("maxItems:"); sb.append(maxItems + ","); }
    if (maxLength != null) { sb.append("maxLength:"); sb.append(maxLength + ","); }
    if (maxProperties != null) { sb.append("maxProperties:"); sb.append(maxProperties + ","); }
    if (maximum != null) { sb.append("maximum:"); sb.append(maximum + ","); }
    if (minItems != null) { sb.append("minItems:"); sb.append(minItems + ","); }
    if (minLength != null) { sb.append("minLength:"); sb.append(minLength + ","); }
    if (minProperties != null) { sb.append("minProperties:"); sb.append(minProperties + ","); }
    if (minimum != null) { sb.append("minimum:"); sb.append(minimum + ","); }
    if (multipleOf != null) { sb.append("multipleOf:"); sb.append(multipleOf + ","); }
    if (nullable != null) { sb.append("nullable:"); sb.append(nullable + ","); }
    if (pattern != null) { sb.append("pattern:"); sb.append(pattern + ","); }
    if (title != null) { sb.append("title:"); sb.append(title + ","); }
    if (type != null) { sb.append("type:"); sb.append(type + ","); }
    if (uniqueItems != null) { sb.append("uniqueItems:"); sb.append(uniqueItems + ","); }
    if (xDescriptors != null && !xDescriptors.isEmpty()) { sb.append("xDescriptors:"); sb.append(xDescriptors); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDeprecated() {
    return withDeprecated(true);
  }
  
  public A withExclusiveMaximum() {
    return withExclusiveMaximum(true);
  }
  
  public A withExclusiveMinimum() {
    return withExclusiveMinimum(true);
  }
  
  public A withNullable() {
    return withNullable(true);
  }
  
  public A withUniqueItems() {
    return withUniqueItems(true);
  }
  

}