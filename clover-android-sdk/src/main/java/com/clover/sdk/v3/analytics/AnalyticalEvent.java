/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.analytics;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getEvent event}</li>
 * <li>{@link #getPayload payload}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class AnalyticalEvent extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.analytics.Event getEvent() {
    return genClient.cacheGet(CacheKey.event);
  }

  public com.clover.sdk.v3.base.Reference getPayload() {
    return genClient.cacheGet(CacheKey.payload);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AnalyticalEvent> {
    event {
      @Override
      public Object extractValue(AnalyticalEvent instance) {
        return instance.genClient.extractEnum("event", com.clover.sdk.v3.analytics.Event.class);
      }
    },
    payload {
      @Override
      public Object extractValue(AnalyticalEvent instance) {
        return instance.genClient.extractRecord("payload", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<AnalyticalEvent> genClient;

  /**
  * Constructs a new empty instance.
  */
  public AnalyticalEvent() {
    genClient = new GenericClient<AnalyticalEvent>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected AnalyticalEvent(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AnalyticalEvent(String json) throws IllegalArgumentException {
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
  public AnalyticalEvent(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AnalyticalEvent(AnalyticalEvent src) {
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
  }

  /** Checks whether the 'event' field is set and is not null */
  public boolean isNotNullEvent() {
    return genClient.cacheValueIsNotNull(CacheKey.event);
  }

  /** Checks whether the 'payload' field is set and is not null */
  public boolean isNotNullPayload() {
    return genClient.cacheValueIsNotNull(CacheKey.payload);
  }



  /** Checks whether the 'event' field has been set, however the value could be null */
  public boolean hasEvent() {
    return genClient.cacheHasKey(CacheKey.event);
  }

  /** Checks whether the 'payload' field has been set, however the value could be null */
  public boolean hasPayload() {
    return genClient.cacheHasKey(CacheKey.payload);
  }


  /**
   * Sets the field 'event'.
   */
  public AnalyticalEvent setEvent(com.clover.sdk.v3.analytics.Event event) {
    return genClient.setOther(event, CacheKey.event);
  }

  /**
   * Sets the field 'payload'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AnalyticalEvent setPayload(com.clover.sdk.v3.base.Reference payload) {
    return genClient.setRecord(payload, CacheKey.payload);
  }


  /** Clears the 'event' field, the 'has' method for this field will now return false */
  public void clearEvent() {
    genClient.clear(CacheKey.event);
  }
  /** Clears the 'payload' field, the 'has' method for this field will now return false */
  public void clearPayload() {
    genClient.clear(CacheKey.payload);
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
  public AnalyticalEvent copyChanges() {
    AnalyticalEvent copy = new AnalyticalEvent();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AnalyticalEvent src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AnalyticalEvent(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<AnalyticalEvent> CREATOR = new android.os.Parcelable.Creator<AnalyticalEvent>() {
    @Override
    public AnalyticalEvent createFromParcel(android.os.Parcel in) {
      AnalyticalEvent instance = new AnalyticalEvent(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AnalyticalEvent[] newArray(int size) {
      return new AnalyticalEvent[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AnalyticalEvent> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AnalyticalEvent>() {
    @Override
    public AnalyticalEvent create(org.json.JSONObject jsonObject) {
      return new AnalyticalEvent(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean EVENT_IS_REQUIRED = false;
    public static final boolean PAYLOAD_IS_REQUIRED = false;

  }

}