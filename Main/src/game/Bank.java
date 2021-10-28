package game;

public class Bank {
    int amount;

    public Bank(int a) {
        amount = a;
    }

    public String toString(){
        return("("+amount+")");  //This toString method returns amount as a String-variable
    }
    public void add(int amt){ //This method adds the new amount to the previous amount
        amount = amount + amt;
        System.out.println("Total Balance: " +amount);

        //add(amt);

    }

}
