package org.example;

public class Tax extends Account{

    int ac, tax=10;
    double amount;
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
        amount = amount - (amount * tax/100);
        System.out.println("Tax payable : "+tax+"% \n--------Here is the amount after deduction : "+amount+" --------");
    }
    public double currBalence(){
        int temp = super.acc;
        if((temp == ac)&&(balence>=amount)){
            displayTax();
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

