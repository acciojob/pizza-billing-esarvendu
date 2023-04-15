package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isBagAdded;
    boolean isPizzaBillGenerated;


    public Pizza(int price, Boolean isVeg, String bill, int cheese, int toppings, boolean isCheeseAdded, boolean isToppingAdded, boolean isBagAdded, boolean isPizzaBillGenerated) {

        this.isVeg = isVeg;

        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isBagAdded = false;
        this.isPizzaBillGenerated = false;
        this.bill = "";
    }

    public Pizza(Boolean isVeg) {

        // your code goes here

        if (isVeg) {
            this.price = 300;
            this.toppings = 70;

        } else {
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill = "Base price of the pizza : " + this.price + "\n";
    }


    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (isCheeseAdded) {
            this.price += this.cheese;
            this.isCheeseAdded = true;
        }

    }

    public void addExtraToppings() {
        // your code goes here
        if (isToppingAdded) {
            price += this.toppings;
            this.isToppingAdded = true;
        }
    }

    public void addTakeaway() {
        // your code goes here

        if (isBagAdded) {
            this.price += 20;
            this.isBagAdded = true;
        }
    }

    public String getBill() {
        // your code goes here
        if (isPizzaBillGenerated) {
            if (isCheeseAdded) {
                this.bill += "Extra cheese added" + this.cheese + "\n";
            }
            if (isCheeseAdded) {
                this.bill += "Extra Toppings added" + this.toppings + "\n";
            }
            if (isBagAdded) {
                bill += "Bag is added" + "\n";
            }
            this.bill += "Total price :" + getPrice() + "\n";
            this.isPizzaBillGenerated = true;


        }
        return this.bill;
    }
}

