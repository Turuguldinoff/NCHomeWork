import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Parser{

    public static String name() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        while (name.equals("")) {
            name = (String)reader.readLine();
        }
        return name;
    }
}
