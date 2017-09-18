package lean;

import static org.junit.Assert.*;

import org.junit.Test;

public class CashierTest {

    @Test
    public void applesCost100() {
        Cashier cashier = new Cashier();
        int totalAmount = cashier.enter("apples");
        assertEquals(100, totalAmount);
    }

}
