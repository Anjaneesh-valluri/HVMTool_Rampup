package org.example;

public abstract class Account {
    //Here I have implemented Encapsulation but making variables private so that other classes cannot access them directly
    private int acc = 1;
    private String name = "satya";
    private double balence = 10000;

    public int getAcc(){
        return acc;
    }
    public String getName(){
        return name;
    }
    public double getBalence(){
        return balence;
    }
    public abstract double currBalence();
    public abstract void displayTax();
}

