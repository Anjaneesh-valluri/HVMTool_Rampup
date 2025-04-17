package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Tax extends Account{

    int ac, tax=10 , new_tax = 9;
    double amount;
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String currDate = dateTime.format(date);

    public  Tax(int ac, double amount){
        this.ac=ac;
        this.amount= amount;
    }
    //here i have used constructor overloading - a type of polymorphism
    public  Tax(double amount , boolean newTax){
        this.amount = amount;
        if(newTax)
            displayTax(new_tax);
        else
            displayTax();
    }
    //Here I am overriding the abstract method that is declared in the parent class
    @Override
    public void displayTax(){
        amount = getTax();
        System.out.println("Tax payable : "+tax+"% \n--------Here is the amount after deduction : "+amount+" --------");
    }
    //Here I have implemented method overloading of displayTax method
    public void displayTax(int newTax){
        System.out.println("Your tax based on new tax slab : "+ (amount * new_tax/100) + ", Which in percent is : "+new_tax+" %");
    }
    public double getTax(){
        amount = amount - (amount * tax/100);
        return amount;
    }
    @Override
    public double currBalence(){
        double balence = super.getBalence();
        int temp = super.getAcc();
        if((temp == ac)&&(balence>=amount)){
            getTax();
            System.out.println("Here is the date and time of transaction: "+currDate);
            return (balence - amount);
        }
        else if((temp==ac) && (balence<amount)){
            System.out.println("Insuffecient balence");
            return balence;
        }
        else{
            System.out.println("Sorry wrong account number");
            return 0;
        }
    }


}

