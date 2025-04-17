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
                //here I am calling the child class (Tax) using abstract class Account -- abstraction (implementation)
                System.err.println("Do you want to calculate tax using \n1. New tax scheme\n2. Old tax scheme");
                int input = sc.nextInt(); 
                switch(input){
                    case 1:
                        Account tax2 = new Tax(ac, true);
                        break;
                    case 2:
                        Account tax3 = new Tax(ac, false);
                        break;
                    default:
                        System.out.println("Sorry wrong output");
                        break;

                }
                break;
            case 2:
                Account tax = new Tax(ac,amount);
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