package testing;
import org.junit.Test;
import game.Bank;
import game.Language;


import static org.junit.Assert.*;

public class BankTest {

    public BankTest () { }

    /**
     * Testing the toString method in the the Bank class, the method should return the "amount"
     */
    @Test
    public void testingToStringMethod() {
        Bank amount = new Bank(1000);
        String expectingResult = "(1000)";
        String actualResult = amount.toString();
        assertEquals(expectingResult, actualResult);
        System.out.println(amount);
    }

    /**
     * Testing the add-amount method in the Bank class, adding an amount to the overall amount.
     */
    @Test
    public void testingAddMethod() {
        System.out.println("addEffect");
        int number = 1000;
        Bank amount = new Bank(0);
        amount.add(number);

    }

    /**
     * Testing the methodArrived & Bank, the amount/balance cant be negative - no matter what the withdrawal is
     */
    @Test
    public void TestingArrived(){
        int amount = -6000;
        System.out.println("The effect on your bank-account: "+ amount);
        if (amount < 0) {
            amount = 0;
            System.out.println("\n"+"Your bank balance is now: " + amount);
        }
        else {
            System.out.println("\n"+"Your bank balance is now: " + amount);
        }
    }

}