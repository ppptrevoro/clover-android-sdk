/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.apps;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum ProductType implements Parcelable {
  ANDROID, WEB, BOTH;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<ProductType> CREATOR = new Creator<ProductType>() {
    @Override
    public ProductType createFromParcel(final Parcel source) {
      return ProductType.valueOf(source.readString());
    }

    @Override
    public ProductType[] newArray(final int size) {
      return new ProductType[size];
    }
  };
}