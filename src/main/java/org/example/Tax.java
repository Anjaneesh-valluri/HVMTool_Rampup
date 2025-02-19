package org.example;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Tax extends Account{

    int ac, tax=10;
    double amount;
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String currDate = dateTime.format(date);
    public Tax(int ac, double amount){
        this.ac=ac;
        this.amount= amount;
    }
    //here i have used polymorphism
    public Tax(double amount){
        this.amount = amount;
        displayTax();
    }
    public void displayTax(){
        amount = getTax();
        System.out.println("Tax payable : "+tax+"% \n--------Here is the amount after deduction : "+amount+" --------");
    }
    public double getTax(){
        amount = amount - (amount * tax/100);
        return amount;
    }
    public double currBalence(){
        int temp = super.acc;
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

