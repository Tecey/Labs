package com.FirstStart;


public class Computer {
    private String manufacturer;
    private int serialNomber;
        public float price = 2.4f; // потом вернуть и в маин сделать через сет и гет
    private int quantityCPU;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    // создать для всех остальных 2,1.3

    public void view() {
        System.out.println(manufacturer + ", " + serialNomber + ", " + price + ", " + quantityCPU);
    }
}
