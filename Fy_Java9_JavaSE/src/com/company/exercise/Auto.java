package com.company.exercise;

/**
 * @author lbf
 * @date 2020/7/26 15:27
 */
public class Auto {
    private String brand;
    private int length;
    private float price;

    public Auto() {
    }

    public Auto(String brand, int length, float price) {
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void  showMsg(){
        System.out.println("车型" + brand);
        System.out.println("\t价格" + price);
        System.out.println("\t车长" + length);
    }
}
