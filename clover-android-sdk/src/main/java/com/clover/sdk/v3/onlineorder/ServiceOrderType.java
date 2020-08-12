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
 * <li>{@link #getOnlineOrderService onlineOrderService}</li>
 * <li>{@link #getOrderType orderType}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class ServiceOrderType extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.onlineorder.OnlineOrderService getOnlineOrderService() {
    return genClient.cacheGet(CacheKey.onlineOrderService);
  }

  public com.clover.sdk.v3.order.OrderType getOrderType() {
    return genClient.cacheGet(CacheKey.orderType);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    onlineOrderService
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.onlineorder.OnlineOrderService.JSON_CREATOR)),
    orderType
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.order.OrderType.JSON_CREATOR)),
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

  private final GenericClient<ServiceOrderType> genClient;

  /**
   * Constructs a new empty instance.
   */
  public ServiceOrderType() {
    genClient = new GenericClient<ServiceOrderType>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected ServiceOrderType(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public ServiceOrderType(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public ServiceOrderType(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public ServiceOrderType(ServiceOrderType src) {
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
    genClient.validateNotNull(CacheKey.onlineOrderService, getOnlineOrderService());

    genClient.validateNotNull(CacheKey.orderType, getOrderType());
  }

  /** Checks whether the 'onlineOrderService' field is set and is not null */
  public boolean isNotNullOnlineOrderService() {
    return genClient.cacheValueIsNotNull(CacheKey.onlineOrderService);
  }

  /** Checks whether the 'orderType' field is set and is not null */
  public boolean isNotNullOrderType() {
    return genClient.cacheValueIsNotNull(CacheKey.orderType);
  }



  /** Checks whether the 'onlineOrderService' field has been set, however the value could be null */
  public boolean hasOnlineOrderService() {
    return genClient.cacheHasKey(CacheKey.onlineOrderService);
  }

  /** Checks whether the 'orderType' field has been set, however the value could be null */
  public boolean hasOrderType() {
    return genClient.cacheHasKey(CacheKey.orderType);
  }


  /**
   * Sets the field 'onlineOrderService'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public ServiceOrderType setOnlineOrderService(com.clover.sdk.v3.onlineorder.OnlineOrderService onlineOrderService) {
    return genClient.setRecord(onlineOrderService, CacheKey.onlineOrderService);
  }

  /**
   * Sets the field 'orderType'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public ServiceOrderType setOrderType(com.clover.sdk.v3.order.OrderType orderType) {
    return genClient.setRecord(orderType, CacheKey.orderType);
  }


  /** Clears the 'onlineOrderService' field, the 'has' method for this field will now return false */
  public void clearOnlineOrderService() {
    genClient.clear(CacheKey.onlineOrderService);
  }
  /** Clears the 'orderType' field, the 'has' method for this field will now return false */
  public void clearOrderType() {
    genClient.clear(CacheKey.orderType);
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
  public ServiceOrderType copyChanges() {
    ServiceOrderType copy = new ServiceOrderType();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(ServiceOrderType src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new ServiceOrderType(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<ServiceOrderType> CREATOR = new android.os.Parcelable.Creator<ServiceOrderType>() {
    @Override
    public ServiceOrderType createFromParcel(android.os.Parcel in) {
      ServiceOrderType instance = new ServiceOrderType(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public ServiceOrderType[] newArray(int size) {
      return new ServiceOrderType[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<ServiceOrderType> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<ServiceOrderType>() {
    public Class<ServiceOrderType> getCreatedClass() {
      return ServiceOrderType.class;
    }

    @Override
    public ServiceOrderType create(org.json.JSONObject jsonObject) {
      return new ServiceOrderType(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean ONLINEORDERSERVICE_IS_REQUIRED = true;
    public static final boolean ORDERTYPE_IS_REQUIRED = true;
  }

}
