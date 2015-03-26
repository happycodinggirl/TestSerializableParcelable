package com.test.huangxingli.testserializableparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by huangxingli on 2015/3/26.
 */
public class Author implements Parcelable {

    String name;
    int age;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }

    public static final Parcelable.Creator<Author> CREATOR = new Creator<Author>() {
        public Author createFromParcel(Parcel source) {
            Author author=new Author(source.readString(),source.readInt());

            return author;
        }
        public Author[] newArray(int size) {
            return new Author[size];
        }
    };

}
