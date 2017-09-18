package lean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Cashier {


    public void checkout(BufferedReader reader, PrintWriter writer) throws IOException {
        writer.println("> OK. Ready for next customer, ctrl+c to exit");
        while (true) {
            int totalAmount = enter(reader.readLine());
            writer.println("> Current total: " + totalAmount);
        }
    }

    public int enter(String fruit) {
        return 0;
    }

}
