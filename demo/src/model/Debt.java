package com.example.model;

public class Debt {
    private String name;
    private double amount;
    private String type;

    // Constructor
    public Debt(String name, double amount, String type) {
        this.name = name;
        this.amount = amount;
        this.type = type;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
