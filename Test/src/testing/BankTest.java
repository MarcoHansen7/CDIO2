package testing;
import org.junit.Test;
import game.Bank;

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

}