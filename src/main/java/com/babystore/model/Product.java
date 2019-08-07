package com.babystore.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Product  implements Serializable {

    private static final long serialVersionUID=425345L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;
    private double price;
    private int quantity;
    private String description;
    private String category;
    private String targetSize;
    private String imageUrl;
    private boolean isAvailable=true;
    private String date;

    public String getDate(){
        return date;
    } 
    public void setDate(String date){
        this.date = date;
        
    }
    // @ManyToOne(fetch = FetchType.EAGER)
    // @JoinColumn(name = "order_id")
    // private Order order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTargetSize() {
        return targetSize;
    }

    public void setTargetSize(String targetSize) {
        this.targetSize = targetSize;
    }

    // public Order getOrder() {
    //     return order;
    // }
    //
    // public void setOrder(Order order) {
    //     this.order = order;
    // }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
