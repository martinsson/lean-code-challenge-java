package lean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Cashier {


    public void checkout(BufferedReader reader, PrintWriter writer) throws IOException {
        while (true) {
            writer.println(enter(reader.readLine()));
        }
    }

    public int enter(String fruit) {
        return 0;
    }

}
