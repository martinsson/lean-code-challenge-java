package lean;

import static org.junit.Assert.*;

import org.junit.Test;

public class CashierTest {

    @Test
    public void test() {
        Cashier cashier = new Cashier();
        String totalAmount = cashier.enter("apple");
        assertEquals("100", totalAmount);
    }

}
