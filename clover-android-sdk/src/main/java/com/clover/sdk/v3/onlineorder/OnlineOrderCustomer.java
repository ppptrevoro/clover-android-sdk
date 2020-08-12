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

package com.clover.sdk.v3.onlineorder;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getCustomerEmailAddress customerEmailAddress}</li>
 * <li>{@link #getCustomerDisplayName customerDisplayName}</li>
 * <li>{@link #getCustomerFirstName customerFirstName}</li>
 * <li>{@link #getCustomerLastName customerLastName}</li>
 * <li>{@link #getCustomerPhoneNumber customerPhoneNumber}</li>
 * <li>{@link #getCreatedTime createdTime}</li>
 * <li>{@link #getModifiedTime modifiedTime}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class OnlineOrderCustomer extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * online order customer id
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Online Order customer email address
   */
  public java.lang.String getCustomerEmailAddress() {
    return genClient.cacheGet(CacheKey.customerEmailAddress);
  }

  /**
   * Online Order customer display name
   */
  public java.lang.String getCustomerDisplayName() {
    return genClient.cacheGet(CacheKey.customerDisplayName);
  }

  /**
   * Online Order customer first name
   */
  public java.lang.String getCustomerFirstName() {
    return genClient.cacheGet(CacheKey.customerFirstName);
  }

  /**
   * Online Order customer last name
   */
  public java.lang.String getCustomerLastName() {
    return genClient.cacheGet(CacheKey.customerLastName);
  }

  /**
   * Online Order customer phone number
   */
  public java.lang.String getCustomerPhoneNumber() {
    return genClient.cacheGet(CacheKey.customerPhoneNumber);
  }

  /**
   * Timestamp when the online ordering item was created
   */
  public java.lang.Long getCreatedTime() {
    return genClient.cacheGet(CacheKey.createdTime);
  }

  /**
   * Timestamp when the online ordering item was last modified
   */
  public java.lang.Long getModifiedTime() {
    return genClient.cacheGet(CacheKey.modifiedTime);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    id
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    customerEmailAddress
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    customerDisplayName
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    customerFirstName
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    customerLastName
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    customerPhoneNumber
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    createdTime
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    modifiedTime
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
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

  private final GenericClient<OnlineOrderCustomer> genClient;

  /**
   * Constructs a new empty instance.
   */
  public OnlineOrderCustomer() {
    genClient = new GenericClient<OnlineOrderCustomer>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected OnlineOrderCustomer(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public OnlineOrderCustomer(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public OnlineOrderCustomer(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public OnlineOrderCustomer(OnlineOrderCustomer src) {
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
    genClient.validateCloverId(CacheKey.id, getId());
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'customerEmailAddress' field is set and is not null */
  public boolean isNotNullCustomerEmailAddress() {
    return genClient.cacheValueIsNotNull(CacheKey.customerEmailAddress);
  }

  /** Checks whether the 'customerDisplayName' field is set and is not null */
  public boolean isNotNullCustomerDisplayName() {
    return genClient.cacheValueIsNotNull(CacheKey.customerDisplayName);
  }

  /** Checks whether the 'customerFirstName' field is set and is not null */
  public boolean isNotNullCustomerFirstName() {
    return genClient.cacheValueIsNotNull(CacheKey.customerFirstName);
  }

  /** Checks whether the 'customerLastName' field is set and is not null */
  public boolean isNotNullCustomerLastName() {
    return genClient.cacheValueIsNotNull(CacheKey.customerLastName);
  }

  /** Checks whether the 'customerPhoneNumber' field is set and is not null */
  public boolean isNotNullCustomerPhoneNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.customerPhoneNumber);
  }

  /** Checks whether the 'createdTime' field is set and is not null */
  public boolean isNotNullCreatedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field is set and is not null */
  public boolean isNotNullModifiedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.modifiedTime);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'customerEmailAddress' field has been set, however the value could be null */
  public boolean hasCustomerEmailAddress() {
    return genClient.cacheHasKey(CacheKey.customerEmailAddress);
  }

  /** Checks whether the 'customerDisplayName' field has been set, however the value could be null */
  public boolean hasCustomerDisplayName() {
    return genClient.cacheHasKey(CacheKey.customerDisplayName);
  }

  /** Checks whether the 'customerFirstName' field has been set, however the value could be null */
  public boolean hasCustomerFirstName() {
    return genClient.cacheHasKey(CacheKey.customerFirstName);
  }

  /** Checks whether the 'customerLastName' field has been set, however the value could be null */
  public boolean hasCustomerLastName() {
    return genClient.cacheHasKey(CacheKey.customerLastName);
  }

  /** Checks whether the 'customerPhoneNumber' field has been set, however the value could be null */
  public boolean hasCustomerPhoneNumber() {
    return genClient.cacheHasKey(CacheKey.customerPhoneNumber);
  }

  /** Checks whether the 'createdTime' field has been set, however the value could be null */
  public boolean hasCreatedTime() {
    return genClient.cacheHasKey(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field has been set, however the value could be null */
  public boolean hasModifiedTime() {
    return genClient.cacheHasKey(CacheKey.modifiedTime);
  }


  /**
   * Sets the field 'id'.
   */
  public OnlineOrderCustomer setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'customerEmailAddress'.
   */
  public OnlineOrderCustomer setCustomerEmailAddress(java.lang.String customerEmailAddress) {
    return genClient.setOther(customerEmailAddress, CacheKey.customerEmailAddress);
  }

  /**
   * Sets the field 'customerDisplayName'.
   */
  public OnlineOrderCustomer setCustomerDisplayName(java.lang.String customerDisplayName) {
    return genClient.setOther(customerDisplayName, CacheKey.customerDisplayName);
  }

  /**
   * Sets the field 'customerFirstName'.
   */
  public OnlineOrderCustomer setCustomerFirstName(java.lang.String customerFirstName) {
    return genClient.setOther(customerFirstName, CacheKey.customerFirstName);
  }

  /**
   * Sets the field 'customerLastName'.
   */
  public OnlineOrderCustomer setCustomerLastName(java.lang.String customerLastName) {
    return genClient.setOther(customerLastName, CacheKey.customerLastName);
  }

  /**
   * Sets the field 'customerPhoneNumber'.
   */
  public OnlineOrderCustomer setCustomerPhoneNumber(java.lang.String customerPhoneNumber) {
    return genClient.setOther(customerPhoneNumber, CacheKey.customerPhoneNumber);
  }

  /**
   * Sets the field 'createdTime'.
   */
  public OnlineOrderCustomer setCreatedTime(java.lang.Long createdTime) {
    return genClient.setOther(createdTime, CacheKey.createdTime);
  }

  /**
   * Sets the field 'modifiedTime'.
   */
  public OnlineOrderCustomer setModifiedTime(java.lang.Long modifiedTime) {
    return genClient.setOther(modifiedTime, CacheKey.modifiedTime);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'customerEmailAddress' field, the 'has' method for this field will now return false */
  public void clearCustomerEmailAddress() {
    genClient.clear(CacheKey.customerEmailAddress);
  }
  /** Clears the 'customerDisplayName' field, the 'has' method for this field will now return false */
  public void clearCustomerDisplayName() {
    genClient.clear(CacheKey.customerDisplayName);
  }
  /** Clears the 'customerFirstName' field, the 'has' method for this field will now return false */
  public void clearCustomerFirstName() {
    genClient.clear(CacheKey.customerFirstName);
  }
  /** Clears the 'customerLastName' field, the 'has' method for this field will now return false */
  public void clearCustomerLastName() {
    genClient.clear(CacheKey.customerLastName);
  }
  /** Clears the 'customerPhoneNumber' field, the 'has' method for this field will now return false */
  public void clearCustomerPhoneNumber() {
    genClient.clear(CacheKey.customerPhoneNumber);
  }
  /** Clears the 'createdTime' field, the 'has' method for this field will now return false */
  public void clearCreatedTime() {
    genClient.clear(CacheKey.createdTime);
  }
  /** Clears the 'modifiedTime' field, the 'has' method for this field will now return false */
  public void clearModifiedTime() {
    genClient.clear(CacheKey.modifiedTime);
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
  public OnlineOrderCustomer copyChanges() {
    OnlineOrderCustomer copy = new OnlineOrderCustomer();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(OnlineOrderCustomer src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new OnlineOrderCustomer(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<OnlineOrderCustomer> CREATOR = new android.os.Parcelable.Creator<OnlineOrderCustomer>() {
    @Override
    public OnlineOrderCustomer createFromParcel(android.os.Parcel in) {
      OnlineOrderCustomer instance = new OnlineOrderCustomer(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public OnlineOrderCustomer[] newArray(int size) {
      return new OnlineOrderCustomer[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<OnlineOrderCustomer> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<OnlineOrderCustomer>() {
    public Class<OnlineOrderCustomer> getCreatedClass() {
      return OnlineOrderCustomer.class;
    }

    @Override
    public OnlineOrderCustomer create(org.json.JSONObject jsonObject) {
      return new OnlineOrderCustomer(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean CUSTOMEREMAILADDRESS_IS_REQUIRED = false;
    public static final boolean CUSTOMERDISPLAYNAME_IS_REQUIRED = false;
    public static final boolean CUSTOMERFIRSTNAME_IS_REQUIRED = false;
    public static final boolean CUSTOMERLASTNAME_IS_REQUIRED = false;
    public static final boolean CUSTOMERPHONENUMBER_IS_REQUIRED = false;
    public static final boolean CREATEDTIME_IS_REQUIRED = false;
    public static final boolean MODIFIEDTIME_IS_REQUIRED = false;
  }

}
