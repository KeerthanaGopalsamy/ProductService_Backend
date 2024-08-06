package com.scaler.productservice_backend.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends baseModel{
//    private  long id;
    private String title;
    private double price;
    private Category category;// object for class

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
