package com.test.huangxingli.testserializableparcelable;

import java.io.Serializable;

/**
 * Created by huangxingli on 2015/3/26.
 */
public class Book implements Serializable {
    String bookName;
    int price ;

    public Book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}
