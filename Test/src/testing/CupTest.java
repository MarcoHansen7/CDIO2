package testing;
import static org.junit.Assert.*;
import org.junit.Test;
import game.Cup;

public class CupTest {

    /**
     * Testing the Cup and dice, the method should roll two dices and its combined sum should be limited from
     * 2-12, as it is: two six sided dice
     */
    @Test
    public void test() {

        Cup cup = new Cup();
        int result = cup.sum();
        if (result > 12 || result < 2) {
            fail("The dice is not limited ");
        }

    }

}