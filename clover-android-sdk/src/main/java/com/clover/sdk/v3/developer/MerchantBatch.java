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

package com.clover.sdk.v3.developer;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * A batch of merchants
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getMerchants merchants}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class MerchantBatch extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * The merchants that belong to this batch
   */
  public java.util.List<com.clover.sdk.v3.base.Reference> getMerchants() {
    return genClient.cacheGet(CacheKey.merchants);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    merchants
        (com.clover.sdk.extractors.RecordListExtractionStrategy.instance(com.clover.sdk.v3.base.Reference.JSON_CREATOR)),
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

  private final GenericClient<MerchantBatch> genClient;

  /**
   * Constructs a new empty instance.
   */
  public MerchantBatch() {
    genClient = new GenericClient<MerchantBatch>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected MerchantBatch(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public MerchantBatch(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public MerchantBatch(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public MerchantBatch(MerchantBatch src) {
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
    genClient.validateReferences(CacheKey.merchants);
  }

  /** Checks whether the 'merchants' field is set and is not null */
  public boolean isNotNullMerchants() {
    return genClient.cacheValueIsNotNull(CacheKey.merchants);
  }

  /** Checks whether the 'merchants' field is set and is not null and is not empty */
  public boolean isNotEmptyMerchants() { return isNotNullMerchants() && !getMerchants().isEmpty(); }



  /** Checks whether the 'merchants' field has been set, however the value could be null */
  public boolean hasMerchants() {
    return genClient.cacheHasKey(CacheKey.merchants);
  }


  /**
   * Sets the field 'merchants'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public MerchantBatch setMerchants(java.util.List<com.clover.sdk.v3.base.Reference> merchants) {
    return genClient.setArrayRecord(merchants, CacheKey.merchants);
  }


  /** Clears the 'merchants' field, the 'has' method for this field will now return false */
  public void clearMerchants() {
    genClient.clear(CacheKey.merchants);
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
  public MerchantBatch copyChanges() {
    MerchantBatch copy = new MerchantBatch();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(MerchantBatch src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new MerchantBatch(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<MerchantBatch> CREATOR = new android.os.Parcelable.Creator<MerchantBatch>() {
    @Override
    public MerchantBatch createFromParcel(android.os.Parcel in) {
      MerchantBatch instance = new MerchantBatch(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public MerchantBatch[] newArray(int size) {
      return new MerchantBatch[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<MerchantBatch> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<MerchantBatch>() {
    public Class<MerchantBatch> getCreatedClass() {
      return MerchantBatch.class;
    }

    @Override
    public MerchantBatch create(org.json.JSONObject jsonObject) {
      return new MerchantBatch(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean MERCHANTS_IS_REQUIRED = false;
  }

}
