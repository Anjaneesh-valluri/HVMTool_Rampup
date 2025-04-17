package org.example;

public abstract class Account {
    //Here I have implemented Encapsulation where data is accessed only through abstract methods
    int acc = 1;
    String name = "satya";
    double balence = 10000;

    public abstract double currBalence();
    public abstract void displayTax();
}

