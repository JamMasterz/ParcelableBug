package com.example.jam.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Custom implements Parcelable {
    public String name;
    public Custom() {}
    protected Custom(Parcel in) {
        name = in.readString();
    }
    public static final Parcelable.Creator<Custom> CREATOR = new Parcelable.Creator<Custom>() {
        @Override
        public Custom createFromParcel(Parcel in) {
            return new Custom(in);
        }
        @Override
        public Custom[] newArray(int size) {
            return new Custom[size];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}