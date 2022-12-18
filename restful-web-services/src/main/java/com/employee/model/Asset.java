package com.employee.model;

import java.io.Serializable;

public class Asset extends AssetID implements Serializable {
    protected String name, color;
    protected int price, quantity;
    protected Double weight;

    public Asset() {
    }

    public Asset(String assetID) {
        this.assetID = assetID;
    }

    public Asset(String assetID, String name, String color, int price, int quantity, double weight) {
        super(assetID);
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\n  " + super.toString() + "; Name = " + this.name + "; Color = " + this.color + "; Price = " + this.price + "; Quantity = " + this.quantity + "; Weight = " + this.weight;
    }




}
