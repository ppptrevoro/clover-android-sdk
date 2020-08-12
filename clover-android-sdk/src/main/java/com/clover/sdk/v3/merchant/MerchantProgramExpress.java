/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

/*
 * Copyright (C) 2019 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.merchant;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * Program Express data collected from FDPOS during merchant boarding
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getMerchantRef merchantRef}</li>
 * <li>{@link #getProgramCode programCode}</li>
 * <li>{@link #getProgramCodeDescription programCodeDescription}</li>
 * <li>{@link #getKey key}</li>
 * <li>{@link #getKeyDescription keyDescription}</li>
 * <li>{@link #getValue value}</li>
 * <li>{@link #getValueDescription valueDescription}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class MerchantProgramExpress extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.base.Reference getMerchantRef() {
    return genClient.cacheGet(CacheKey.merchantRef);
  }

  /**
   * Program Code
   */
  public java.lang.String getProgramCode() {
    return genClient.cacheGet(CacheKey.programCode);
  }

  /**
   * Description of Program Code
   */
  public java.lang.String getProgramCodeDescription() {
    return genClient.cacheGet(CacheKey.programCodeDescription);
  }

  /**
   * Key
   */
  public java.lang.String getKey() {
    return genClient.cacheGet(CacheKey.key);
  }

  /**
   * Key description
   */
  public java.lang.String getKeyDescription() {
    return genClient.cacheGet(CacheKey.keyDescription);
  }

  /**
   * Value
   */
  public java.lang.String getValue() {
    return genClient.cacheGet(CacheKey.value);
  }

  /**
   * Description of value
   */
  public java.lang.String getValueDescription() {
    return genClient.cacheGet(CacheKey.valueDescription);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    merchantRef
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.base.Reference.JSON_CREATOR)),
    programCode
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    programCodeDescription
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    key
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    keyDescription
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    value
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    valueDescription
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
      ;

    private final com.clover.sdk.extractors.ExtractionStrategy extractionStrategy;

    private CacheKey(com.clover.sdk.extractors.ExtractionStrategy s) {
      extractionStrategy = s;
    }

    @Override
    public com.clover.sdk.extractors.ExtractionStrategy getExtractionStrategy() {
      return extractionStrategy;
    }
  }

  private final GenericClient<MerchantProgramExpress> genClient;

  /**
   * Constructs a new empty instance.
   */
  public MerchantProgramExpress() {
    genClient = new GenericClient<MerchantProgramExpress>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected MerchantProgramExpress(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public MerchantProgramExpress(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public MerchantProgramExpress(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public MerchantProgramExpress(MerchantProgramExpress src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {

    genClient.validateLength(CacheKey.programCodeDescription, getProgramCodeDescription(), 40);

    genClient.validateLength(CacheKey.keyDescription, getKeyDescription(), 40);

    genClient.validateLength(CacheKey.value, getValue(), 80);

    genClient.validateLength(CacheKey.valueDescription, getValueDescription(), 24);
    genClient.validateReferences(CacheKey.merchantRef);
  }

  /** Checks whether the 'merchantRef' field is set and is not null */
  public boolean isNotNullMerchantRef() {
    return genClient.cacheValueIsNotNull(CacheKey.merchantRef);
  }

  /** Checks whether the 'programCode' field is set and is not null */
  public boolean isNotNullProgramCode() {
    return genClient.cacheValueIsNotNull(CacheKey.programCode);
  }

  /** Checks whether the 'programCodeDescription' field is set and is not null */
  public boolean isNotNullProgramCodeDescription() {
    return genClient.cacheValueIsNotNull(CacheKey.programCodeDescription);
  }

  /** Checks whether the 'key' field is set and is not null */
  public boolean isNotNullKey() {
    return genClient.cacheValueIsNotNull(CacheKey.key);
  }

  /** Checks whether the 'keyDescription' field is set and is not null */
  public boolean isNotNullKeyDescription() {
    return genClient.cacheValueIsNotNull(CacheKey.keyDescription);
  }

  /** Checks whether the 'value' field is set and is not null */
  public boolean isNotNullValue() {
    return genClient.cacheValueIsNotNull(CacheKey.value);
  }

  /** Checks whether the 'valueDescription' field is set and is not null */
  public boolean isNotNullValueDescription() {
    return genClient.cacheValueIsNotNull(CacheKey.valueDescription);
  }



  /** Checks whether the 'merchantRef' field has been set, however the value could be null */
  public boolean hasMerchantRef() {
    return genClient.cacheHasKey(CacheKey.merchantRef);
  }

  /** Checks whether the 'programCode' field has been set, however the value could be null */
  public boolean hasProgramCode() {
    return genClient.cacheHasKey(CacheKey.programCode);
  }

  /** Checks whether the 'programCodeDescription' field has been set, however the value could be null */
  public boolean hasProgramCodeDescription() {
    return genClient.cacheHasKey(CacheKey.programCodeDescription);
  }

  /** Checks whether the 'key' field has been set, however the value could be null */
  public boolean hasKey() {
    return genClient.cacheHasKey(CacheKey.key);
  }

  /** Checks whether the 'keyDescription' field has been set, however the value could be null */
  public boolean hasKeyDescription() {
    return genClient.cacheHasKey(CacheKey.keyDescription);
  }

  /** Checks whether the 'value' field has been set, however the value could be null */
  public boolean hasValue() {
    return genClient.cacheHasKey(CacheKey.value);
  }

  /** Checks whether the 'valueDescription' field has been set, however the value could be null */
  public boolean hasValueDescription() {
    return genClient.cacheHasKey(CacheKey.valueDescription);
  }


  /**
   * Sets the field 'merchantRef'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public MerchantProgramExpress setMerchantRef(com.clover.sdk.v3.base.Reference merchantRef) {
    return genClient.setRecord(merchantRef, CacheKey.merchantRef);
  }

  /**
   * Sets the field 'programCode'.
   */
  public MerchantProgramExpress setProgramCode(java.lang.String programCode) {
    return genClient.setOther(programCode, CacheKey.programCode);
  }

  /**
   * Sets the field 'programCodeDescription'.
   */
  public MerchantProgramExpress setProgramCodeDescription(java.lang.String programCodeDescription) {
    return genClient.setOther(programCodeDescription, CacheKey.programCodeDescription);
  }

  /**
   * Sets the field 'key'.
   */
  public MerchantProgramExpress setKey(java.lang.String key) {
    return genClient.setOther(key, CacheKey.key);
  }

  /**
   * Sets the field 'keyDescription'.
   */
  public MerchantProgramExpress setKeyDescription(java.lang.String keyDescription) {
    return genClient.setOther(keyDescription, CacheKey.keyDescription);
  }

  /**
   * Sets the field 'value'.
   */
  public MerchantProgramExpress setValue(java.lang.String value) {
    return genClient.setOther(value, CacheKey.value);
  }

  /**
   * Sets the field 'valueDescription'.
   */
  public MerchantProgramExpress setValueDescription(java.lang.String valueDescription) {
    return genClient.setOther(valueDescription, CacheKey.valueDescription);
  }


  /** Clears the 'merchantRef' field, the 'has' method for this field will now return false */
  public void clearMerchantRef() {
    genClient.clear(CacheKey.merchantRef);
  }
  /** Clears the 'programCode' field, the 'has' method for this field will now return false */
  public void clearProgramCode() {
    genClient.clear(CacheKey.programCode);
  }
  /** Clears the 'programCodeDescription' field, the 'has' method for this field will now return false */
  public void clearProgramCodeDescription() {
    genClient.clear(CacheKey.programCodeDescription);
  }
  /** Clears the 'key' field, the 'has' method for this field will now return false */
  public void clearKey() {
    genClient.clear(CacheKey.key);
  }
  /** Clears the 'keyDescription' field, the 'has' method for this field will now return false */
  public void clearKeyDescription() {
    genClient.clear(CacheKey.keyDescription);
  }
  /** Clears the 'value' field, the 'has' method for this field will now return false */
  public void clearValue() {
    genClient.clear(CacheKey.value);
  }
  /** Clears the 'valueDescription' field, the 'has' method for this field will now return false */
  public void clearValueDescription() {
    genClient.clear(CacheKey.valueDescription);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public MerchantProgramExpress copyChanges() {
    MerchantProgramExpress copy = new MerchantProgramExpress();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(MerchantProgramExpress src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new MerchantProgramExpress(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<MerchantProgramExpress> CREATOR = new android.os.Parcelable.Creator<MerchantProgramExpress>() {
    @Override
    public MerchantProgramExpress createFromParcel(android.os.Parcel in) {
      MerchantProgramExpress instance = new MerchantProgramExpress(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public MerchantProgramExpress[] newArray(int size) {
      return new MerchantProgramExpress[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<MerchantProgramExpress> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<MerchantProgramExpress>() {
    public Class<MerchantProgramExpress> getCreatedClass() {
      return MerchantProgramExpress.class;
    }

    @Override
    public MerchantProgramExpress create(org.json.JSONObject jsonObject) {
      return new MerchantProgramExpress(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean MERCHANTREF_IS_REQUIRED = false;
    public static final boolean PROGRAMCODE_IS_REQUIRED = false;
    public static final boolean PROGRAMCODEDESCRIPTION_IS_REQUIRED = false;
    public static final long PROGRAMCODEDESCRIPTION_MAX_LEN = 40;
    public static final boolean KEY_IS_REQUIRED = false;
    public static final boolean KEYDESCRIPTION_IS_REQUIRED = false;
    public static final long KEYDESCRIPTION_MAX_LEN = 40;
    public static final boolean VALUE_IS_REQUIRED = false;
    public static final long VALUE_MAX_LEN = 80;
    public static final boolean VALUEDESCRIPTION_IS_REQUIRED = false;
    public static final long VALUEDESCRIPTION_MAX_LEN = 24;
  }

}
