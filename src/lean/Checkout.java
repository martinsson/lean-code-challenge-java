package lean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Checkout {
    /**
     * java -cp ./bin/ lean/Checkout
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out, true);
        Cashier cashier = new Cashier();
        cashier.checkout(reader, writer);
    }
}
