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

package com.clover.sdk.v3.apps;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getUrl url}</li>
 * <li>{@link #getSecret secret}</li>
 * <li>{@link #getValid valid}</li>
 * <li>{@link #getVerification verification}</li>
 * <li>{@link #getOrders orders}</li>
 * <li>{@link #getApp app}</li>
 * <li>{@link #getPayments payments}</li>
 * <li>{@link #getInventory inventory}</li>
 * <li>{@link #getCustomers customers}</li>
 * <li>{@link #getMerchants merchants}</li>
 * <li>{@link #getEmployees employees}</li>
 * <li>{@link #getCashAdjustment cashAdjustment}</li>
 * <li>{@link #getExports exports}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class WebHook extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getUrl() {
    return genClient.cacheGet(CacheKey.url);
  }

  /**
   * A secret string included as a header in the HTTP request from Clover to the developer's web hook callback URL.
   */
  public java.lang.String getSecret() {
    return genClient.cacheGet(CacheKey.secret);
  }

  public java.lang.Boolean getValid() {
    return genClient.cacheGet(CacheKey.valid);
  }

  /**
   * The verification code that was sent to the developer's web hook callback URL.
   */
  public java.lang.String getVerification() {
    return genClient.cacheGet(CacheKey.verification);
  }

  public java.lang.Boolean getOrders() {
    return genClient.cacheGet(CacheKey.orders);
  }

  public java.lang.Boolean getApp() {
    return genClient.cacheGet(CacheKey.app);
  }

  public java.lang.Boolean getPayments() {
    return genClient.cacheGet(CacheKey.payments);
  }

  public java.lang.Boolean getInventory() {
    return genClient.cacheGet(CacheKey.inventory);
  }

  public java.lang.Boolean getCustomers() {
    return genClient.cacheGet(CacheKey.customers);
  }

  public java.lang.Boolean getMerchants() {
    return genClient.cacheGet(CacheKey.merchants);
  }

  /**
   * Webhook subscription for employee create/update/delete
   */
  public java.lang.Boolean getEmployees() {
    return genClient.cacheGet(CacheKey.employees);
  }

  public java.lang.Boolean getCashAdjustment() {
    return genClient.cacheGet(CacheKey.cashAdjustment);
  }

  public java.lang.Boolean getExports() {
    return genClient.cacheGet(CacheKey.exports);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    url
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    secret
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    valid
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    verification
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    orders
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    app
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    payments
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    inventory
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    customers
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    merchants
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    employees
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    cashAdjustment
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    exports
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
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

  private final GenericClient<WebHook> genClient;

  /**
   * Constructs a new empty instance.
   */
  public WebHook() {
    genClient = new GenericClient<WebHook>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected WebHook(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public WebHook(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public WebHook(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public WebHook(WebHook src) {
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
    genClient.validateLength(CacheKey.url, getUrl(), 1023);

    genClient.validateLength(CacheKey.secret, getSecret(), 36);

    genClient.validateLength(CacheKey.verification, getVerification(), 36);
  }

  /** Checks whether the 'url' field is set and is not null */
  public boolean isNotNullUrl() {
    return genClient.cacheValueIsNotNull(CacheKey.url);
  }

  /** Checks whether the 'secret' field is set and is not null */
  public boolean isNotNullSecret() {
    return genClient.cacheValueIsNotNull(CacheKey.secret);
  }

  /** Checks whether the 'valid' field is set and is not null */
  public boolean isNotNullValid() {
    return genClient.cacheValueIsNotNull(CacheKey.valid);
  }

  /** Checks whether the 'verification' field is set and is not null */
  public boolean isNotNullVerification() {
    return genClient.cacheValueIsNotNull(CacheKey.verification);
  }

  /** Checks whether the 'orders' field is set and is not null */
  public boolean isNotNullOrders() {
    return genClient.cacheValueIsNotNull(CacheKey.orders);
  }

  /** Checks whether the 'app' field is set and is not null */
  public boolean isNotNullApp() {
    return genClient.cacheValueIsNotNull(CacheKey.app);
  }

  /** Checks whether the 'payments' field is set and is not null */
  public boolean isNotNullPayments() {
    return genClient.cacheValueIsNotNull(CacheKey.payments);
  }

  /** Checks whether the 'inventory' field is set and is not null */
  public boolean isNotNullInventory() {
    return genClient.cacheValueIsNotNull(CacheKey.inventory);
  }

  /** Checks whether the 'customers' field is set and is not null */
  public boolean isNotNullCustomers() {
    return genClient.cacheValueIsNotNull(CacheKey.customers);
  }

  /** Checks whether the 'merchants' field is set and is not null */
  public boolean isNotNullMerchants() {
    return genClient.cacheValueIsNotNull(CacheKey.merchants);
  }

  /** Checks whether the 'employees' field is set and is not null */
  public boolean isNotNullEmployees() {
    return genClient.cacheValueIsNotNull(CacheKey.employees);
  }

  /** Checks whether the 'cashAdjustment' field is set and is not null */
  public boolean isNotNullCashAdjustment() {
    return genClient.cacheValueIsNotNull(CacheKey.cashAdjustment);
  }

  /** Checks whether the 'exports' field is set and is not null */
  public boolean isNotNullExports() {
    return genClient.cacheValueIsNotNull(CacheKey.exports);
  }



  /** Checks whether the 'url' field has been set, however the value could be null */
  public boolean hasUrl() {
    return genClient.cacheHasKey(CacheKey.url);
  }

  /** Checks whether the 'secret' field has been set, however the value could be null */
  public boolean hasSecret() {
    return genClient.cacheHasKey(CacheKey.secret);
  }

  /** Checks whether the 'valid' field has been set, however the value could be null */
  public boolean hasValid() {
    return genClient.cacheHasKey(CacheKey.valid);
  }

  /** Checks whether the 'verification' field has been set, however the value could be null */
  public boolean hasVerification() {
    return genClient.cacheHasKey(CacheKey.verification);
  }

  /** Checks whether the 'orders' field has been set, however the value could be null */
  public boolean hasOrders() {
    return genClient.cacheHasKey(CacheKey.orders);
  }

  /** Checks whether the 'app' field has been set, however the value could be null */
  public boolean hasApp() {
    return genClient.cacheHasKey(CacheKey.app);
  }

  /** Checks whether the 'payments' field has been set, however the value could be null */
  public boolean hasPayments() {
    return genClient.cacheHasKey(CacheKey.payments);
  }

  /** Checks whether the 'inventory' field has been set, however the value could be null */
  public boolean hasInventory() {
    return genClient.cacheHasKey(CacheKey.inventory);
  }

  /** Checks whether the 'customers' field has been set, however the value could be null */
  public boolean hasCustomers() {
    return genClient.cacheHasKey(CacheKey.customers);
  }

  /** Checks whether the 'merchants' field has been set, however the value could be null */
  public boolean hasMerchants() {
    return genClient.cacheHasKey(CacheKey.merchants);
  }

  /** Checks whether the 'employees' field has been set, however the value could be null */
  public boolean hasEmployees() {
    return genClient.cacheHasKey(CacheKey.employees);
  }

  /** Checks whether the 'cashAdjustment' field has been set, however the value could be null */
  public boolean hasCashAdjustment() {
    return genClient.cacheHasKey(CacheKey.cashAdjustment);
  }

  /** Checks whether the 'exports' field has been set, however the value could be null */
  public boolean hasExports() {
    return genClient.cacheHasKey(CacheKey.exports);
  }


  /**
   * Sets the field 'url'.
   */
  public WebHook setUrl(java.lang.String url) {
    return genClient.setOther(url, CacheKey.url);
  }

  /**
   * Sets the field 'secret'.
   */
  public WebHook setSecret(java.lang.String secret) {
    return genClient.setOther(secret, CacheKey.secret);
  }

  /**
   * Sets the field 'valid'.
   */
  public WebHook setValid(java.lang.Boolean valid) {
    return genClient.setOther(valid, CacheKey.valid);
  }

  /**
   * Sets the field 'verification'.
   */
  public WebHook setVerification(java.lang.String verification) {
    return genClient.setOther(verification, CacheKey.verification);
  }

  /**
   * Sets the field 'orders'.
   */
  public WebHook setOrders(java.lang.Boolean orders) {
    return genClient.setOther(orders, CacheKey.orders);
  }

  /**
   * Sets the field 'app'.
   */
  public WebHook setApp(java.lang.Boolean app) {
    return genClient.setOther(app, CacheKey.app);
  }

  /**
   * Sets the field 'payments'.
   */
  public WebHook setPayments(java.lang.Boolean payments) {
    return genClient.setOther(payments, CacheKey.payments);
  }

  /**
   * Sets the field 'inventory'.
   */
  public WebHook setInventory(java.lang.Boolean inventory) {
    return genClient.setOther(inventory, CacheKey.inventory);
  }

  /**
   * Sets the field 'customers'.
   */
  public WebHook setCustomers(java.lang.Boolean customers) {
    return genClient.setOther(customers, CacheKey.customers);
  }

  /**
   * Sets the field 'merchants'.
   */
  public WebHook setMerchants(java.lang.Boolean merchants) {
    return genClient.setOther(merchants, CacheKey.merchants);
  }

  /**
   * Sets the field 'employees'.
   */
  public WebHook setEmployees(java.lang.Boolean employees) {
    return genClient.setOther(employees, CacheKey.employees);
  }

  /**
   * Sets the field 'cashAdjustment'.
   */
  public WebHook setCashAdjustment(java.lang.Boolean cashAdjustment) {
    return genClient.setOther(cashAdjustment, CacheKey.cashAdjustment);
  }

  /**
   * Sets the field 'exports'.
   */
  public WebHook setExports(java.lang.Boolean exports) {
    return genClient.setOther(exports, CacheKey.exports);
  }


  /** Clears the 'url' field, the 'has' method for this field will now return false */
  public void clearUrl() {
    genClient.clear(CacheKey.url);
  }
  /** Clears the 'secret' field, the 'has' method for this field will now return false */
  public void clearSecret() {
    genClient.clear(CacheKey.secret);
  }
  /** Clears the 'valid' field, the 'has' method for this field will now return false */
  public void clearValid() {
    genClient.clear(CacheKey.valid);
  }
  /** Clears the 'verification' field, the 'has' method for this field will now return false */
  public void clearVerification() {
    genClient.clear(CacheKey.verification);
  }
  /** Clears the 'orders' field, the 'has' method for this field will now return false */
  public void clearOrders() {
    genClient.clear(CacheKey.orders);
  }
  /** Clears the 'app' field, the 'has' method for this field will now return false */
  public void clearApp() {
    genClient.clear(CacheKey.app);
  }
  /** Clears the 'payments' field, the 'has' method for this field will now return false */
  public void clearPayments() {
    genClient.clear(CacheKey.payments);
  }
  /** Clears the 'inventory' field, the 'has' method for this field will now return false */
  public void clearInventory() {
    genClient.clear(CacheKey.inventory);
  }
  /** Clears the 'customers' field, the 'has' method for this field will now return false */
  public void clearCustomers() {
    genClient.clear(CacheKey.customers);
  }
  /** Clears the 'merchants' field, the 'has' method for this field will now return false */
  public void clearMerchants() {
    genClient.clear(CacheKey.merchants);
  }
  /** Clears the 'employees' field, the 'has' method for this field will now return false */
  public void clearEmployees() {
    genClient.clear(CacheKey.employees);
  }
  /** Clears the 'cashAdjustment' field, the 'has' method for this field will now return false */
  public void clearCashAdjustment() {
    genClient.clear(CacheKey.cashAdjustment);
  }
  /** Clears the 'exports' field, the 'has' method for this field will now return false */
  public void clearExports() {
    genClient.clear(CacheKey.exports);
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
  public WebHook copyChanges() {
    WebHook copy = new WebHook();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(WebHook src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new WebHook(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<WebHook> CREATOR = new android.os.Parcelable.Creator<WebHook>() {
    @Override
    public WebHook createFromParcel(android.os.Parcel in) {
      WebHook instance = new WebHook(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public WebHook[] newArray(int size) {
      return new WebHook[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<WebHook> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<WebHook>() {
    public Class<WebHook> getCreatedClass() {
      return WebHook.class;
    }

    @Override
    public WebHook create(org.json.JSONObject jsonObject) {
      return new WebHook(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean URL_IS_REQUIRED = false;
    public static final long URL_MAX_LEN = 1023;
    public static final boolean SECRET_IS_REQUIRED = false;
    public static final long SECRET_MAX_LEN = 36;
    public static final boolean VALID_IS_REQUIRED = false;
    public static final boolean VERIFICATION_IS_REQUIRED = false;
    public static final long VERIFICATION_MAX_LEN = 36;
    public static final boolean ORDERS_IS_REQUIRED = false;
    public static final boolean APP_IS_REQUIRED = false;
    public static final boolean PAYMENTS_IS_REQUIRED = false;
    public static final boolean INVENTORY_IS_REQUIRED = false;
    public static final boolean CUSTOMERS_IS_REQUIRED = false;
    public static final boolean MERCHANTS_IS_REQUIRED = false;
    public static final boolean EMPLOYEES_IS_REQUIRED = false;
    public static final boolean CASHADJUSTMENT_IS_REQUIRED = false;
    public static final boolean EXPORTS_IS_REQUIRED = false;
  }

}
