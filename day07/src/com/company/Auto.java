package com.company;

/**
 * @author lbf
 * @date 2020/5/31 19:20
 */
public class Auto {
    private String brand;
    private int length;
    private int price;

    public Auto() {
    }

    public Auto(String brand, int length, int price) {
        this.brand = brand;
        this.length = length;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
