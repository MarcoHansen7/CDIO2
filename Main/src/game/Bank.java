package game;

import java.util.Scanner;

public class Bank {
    //Bank b= new Bank();
    int amount;

    public Bank(int a) {
        amount = a;
    }

    public String toString(){
        return("("+amount+")");
    }
    public void add(int amt){
        amount = amount + amt;
        System.out.println("Total Balance: " +amount);

        //add(amt);

    }

}
