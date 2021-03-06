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

package com.clover.sdk.v3.tables2;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * TableOrder object that associates the table and order together for orders created in Tables 2.0
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getTable table}</li>
 * <li>{@link #getGuests guests}</li>
 * <li>{@link #getOrder order}</li>
 * <li>{@link #getMerchant merchant}</li>
 * <li>{@link #getCreatedTime createdTime}</li>
 * <li>{@link #getModifiedTime modifiedTime}</li>
 * <li>{@link #getDeletedTime deletedTime}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class TableOrder extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * The table the order belongs to
   */
  public com.clover.sdk.v3.tables2.Table getTable() {
    return genClient.cacheGet(CacheKey.table);
  }

  /**
   * Guests associated with this table
   */
  public java.util.List<com.clover.sdk.v3.tables2.GuestV2> getGuests() {
    return genClient.cacheGet(CacheKey.guests);
  }

  /**
   * The order associated to the table
   */
  public com.clover.sdk.v3.order.Order getOrder() {
    return genClient.cacheGet(CacheKey.order);
  }

  /**
   * The merchant the TableOrder object belongs to
   */
  public com.clover.sdk.v3.merchant.Merchant getMerchant() {
    return genClient.cacheGet(CacheKey.merchant);
  }

  /**
   * Timestamp when the TableOrder was created
   */
  public java.lang.Long getCreatedTime() {
    return genClient.cacheGet(CacheKey.createdTime);
  }

  /**
   * Timestamp when the TableOrder was last modified
   */
  public java.lang.Long getModifiedTime() {
    return genClient.cacheGet(CacheKey.modifiedTime);
  }

  /**
   * Timestamp when TableOrder was last deleted
   */
  public java.lang.Long getDeletedTime() {
    return genClient.cacheGet(CacheKey.deletedTime);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    id
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    table
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.tables2.Table.JSON_CREATOR)),
    guests
        (com.clover.sdk.extractors.RecordListExtractionStrategy.instance(com.clover.sdk.v3.tables2.GuestV2.JSON_CREATOR)),
    order
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.order.Order.JSON_CREATOR)),
    merchant
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.merchant.Merchant.JSON_CREATOR)),
    createdTime
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    modifiedTime
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    deletedTime
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

  private final GenericClient<TableOrder> genClient;

  /**
   * Constructs a new empty instance.
   */
  public TableOrder() {
    genClient = new GenericClient<TableOrder>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected TableOrder(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public TableOrder(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public TableOrder(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public TableOrder(TableOrder src) {
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
    genClient.validateLength(getId(), 13);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'table' field is set and is not null */
  public boolean isNotNullTable() {
    return genClient.cacheValueIsNotNull(CacheKey.table);
  }

  /** Checks whether the 'guests' field is set and is not null */
  public boolean isNotNullGuests() {
    return genClient.cacheValueIsNotNull(CacheKey.guests);
  }

  /** Checks whether the 'guests' field is set and is not null and is not empty */
  public boolean isNotEmptyGuests() { return isNotNullGuests() && !getGuests().isEmpty(); }

  /** Checks whether the 'order' field is set and is not null */
  public boolean isNotNullOrder() {
    return genClient.cacheValueIsNotNull(CacheKey.order);
  }

  /** Checks whether the 'merchant' field is set and is not null */
  public boolean isNotNullMerchant() {
    return genClient.cacheValueIsNotNull(CacheKey.merchant);
  }

  /** Checks whether the 'createdTime' field is set and is not null */
  public boolean isNotNullCreatedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field is set and is not null */
  public boolean isNotNullModifiedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.modifiedTime);
  }

  /** Checks whether the 'deletedTime' field is set and is not null */
  public boolean isNotNullDeletedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.deletedTime);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'table' field has been set, however the value could be null */
  public boolean hasTable() {
    return genClient.cacheHasKey(CacheKey.table);
  }

  /** Checks whether the 'guests' field has been set, however the value could be null */
  public boolean hasGuests() {
    return genClient.cacheHasKey(CacheKey.guests);
  }

  /** Checks whether the 'order' field has been set, however the value could be null */
  public boolean hasOrder() {
    return genClient.cacheHasKey(CacheKey.order);
  }

  /** Checks whether the 'merchant' field has been set, however the value could be null */
  public boolean hasMerchant() {
    return genClient.cacheHasKey(CacheKey.merchant);
  }

  /** Checks whether the 'createdTime' field has been set, however the value could be null */
  public boolean hasCreatedTime() {
    return genClient.cacheHasKey(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field has been set, however the value could be null */
  public boolean hasModifiedTime() {
    return genClient.cacheHasKey(CacheKey.modifiedTime);
  }

  /** Checks whether the 'deletedTime' field has been set, however the value could be null */
  public boolean hasDeletedTime() {
    return genClient.cacheHasKey(CacheKey.deletedTime);
  }


  /**
   * Sets the field 'id'.
   */
  public TableOrder setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'table'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public TableOrder setTable(com.clover.sdk.v3.tables2.Table table) {
    return genClient.setRecord(table, CacheKey.table);
  }

  /**
   * Sets the field 'guests'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public TableOrder setGuests(java.util.List<com.clover.sdk.v3.tables2.GuestV2> guests) {
    return genClient.setArrayRecord(guests, CacheKey.guests);
  }

  /**
   * Sets the field 'order'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public TableOrder setOrder(com.clover.sdk.v3.order.Order order) {
    return genClient.setRecord(order, CacheKey.order);
  }

  /**
   * Sets the field 'merchant'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public TableOrder setMerchant(com.clover.sdk.v3.merchant.Merchant merchant) {
    return genClient.setRecord(merchant, CacheKey.merchant);
  }

  /**
   * Sets the field 'createdTime'.
   */
  public TableOrder setCreatedTime(java.lang.Long createdTime) {
    return genClient.setOther(createdTime, CacheKey.createdTime);
  }

  /**
   * Sets the field 'modifiedTime'.
   */
  public TableOrder setModifiedTime(java.lang.Long modifiedTime) {
    return genClient.setOther(modifiedTime, CacheKey.modifiedTime);
  }

  /**
   * Sets the field 'deletedTime'.
   */
  public TableOrder setDeletedTime(java.lang.Long deletedTime) {
    return genClient.setOther(deletedTime, CacheKey.deletedTime);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'table' field, the 'has' method for this field will now return false */
  public void clearTable() {
    genClient.clear(CacheKey.table);
  }
  /** Clears the 'guests' field, the 'has' method for this field will now return false */
  public void clearGuests() {
    genClient.clear(CacheKey.guests);
  }
  /** Clears the 'order' field, the 'has' method for this field will now return false */
  public void clearOrder() {
    genClient.clear(CacheKey.order);
  }
  /** Clears the 'merchant' field, the 'has' method for this field will now return false */
  public void clearMerchant() {
    genClient.clear(CacheKey.merchant);
  }
  /** Clears the 'createdTime' field, the 'has' method for this field will now return false */
  public void clearCreatedTime() {
    genClient.clear(CacheKey.createdTime);
  }
  /** Clears the 'modifiedTime' field, the 'has' method for this field will now return false */
  public void clearModifiedTime() {
    genClient.clear(CacheKey.modifiedTime);
  }
  /** Clears the 'deletedTime' field, the 'has' method for this field will now return false */
  public void clearDeletedTime() {
    genClient.clear(CacheKey.deletedTime);
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
  public TableOrder copyChanges() {
    TableOrder copy = new TableOrder();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(TableOrder src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new TableOrder(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<TableOrder> CREATOR = new android.os.Parcelable.Creator<TableOrder>() {
    @Override
    public TableOrder createFromParcel(android.os.Parcel in) {
      TableOrder instance = new TableOrder(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public TableOrder[] newArray(int size) {
      return new TableOrder[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<TableOrder> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<TableOrder>() {
    @Override
    public TableOrder create(org.json.JSONObject jsonObject) {
      return new TableOrder(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean TABLE_IS_REQUIRED = false;
    public static final boolean GUESTS_IS_REQUIRED = false;
    public static final boolean ORDER_IS_REQUIRED = false;
    public static final boolean MERCHANT_IS_REQUIRED = false;
    public static final boolean CREATEDTIME_IS_REQUIRED = false;
    public static final boolean MODIFIEDTIME_IS_REQUIRED = false;
    public static final boolean DELETEDTIME_IS_REQUIRED = false;

  }

}
