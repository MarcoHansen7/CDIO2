import java.util.Scanner;

public class Bank {
    //Bank b= new Bank();
    int amount = 1000;

    public int getBalance(){
    return amount;
}
public void add(int amt){
    amount = amount + amt;
    System.out.println("Total Balance: " +amount);

    //add(amt);

}

}

/*class Deposit{
   int amt=0;
    public int userInput()
    {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the amount to be deposited: ");
        amt = scanner.nextInt();
    }
    return amt; /*
}
