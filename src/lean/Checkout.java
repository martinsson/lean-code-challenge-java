package lean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Checkout {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(System.console().reader());
        PrintWriter writer = System.console().writer();
        Cashier cashier = new Cashier();
        cashier.checkout(reader, writer);
    }
}
