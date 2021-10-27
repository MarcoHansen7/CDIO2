package game;

import java.util.Scanner;

public class Bank {
    //Bank b= new Bank();
    int amount = 1000;

    public Bank(int i) {
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
