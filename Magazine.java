package com.company.java_advanced.homework3;

public class Magazine {
    private String name;
    private double pricePerMonth;

    public Magazine(String name, double pricePerMonth) {
        this.name = name;
        this.pricePerMonth = pricePerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return pricePerMonth;
    }

    public void setPrice(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }
}
