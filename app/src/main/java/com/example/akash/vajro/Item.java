package com.example.akash.vajro;

/**
 * Created by akash on 28-04-2016.
 */
public class Item {
    private String tshirt;
    private String brand;
    private String price;

    public Item(String tshirt, String brand, String price) {
        super();
        this.tshirt = tshirt;
        this.brand = brand;
        this.price = price;
    }
    public String getTshirt(){
        return this.tshirt;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getPrice(){
        return this.price;
    }
}
