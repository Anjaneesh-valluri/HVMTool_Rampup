package org.example;

import java.util.Scanner;
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number and amount: ");
        int ac = sc.nextInt();
        double amount = sc.nextDouble();
        System.out.println("----------------Enter you choice------------------\n 1. Check tax on amount\n 2. Proceed transaction ");
        int opt=sc.nextInt();
        switch(opt){
            case 1:
                Tax tax2= new Tax(amount);
                break;
            case 2:
                Tax tax = new Tax(ac,amount);
                double out = tax.currBalence();
                System.out.println("Thank you for conformation, \nProcessing your transaction, please collect your cash.........\nHere is your balence: "+ out);
                tax.displayTax();
                break;
            default:
                System.out.println("Wrong output");
                break;
        }


    }
}