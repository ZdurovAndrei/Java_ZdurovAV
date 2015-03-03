import java.io.IOException;
import java.util.regex.*;
import java.lang.String;

public class LogFileParser {
    public static void parseFile(String line) throws IOException {
        String Alphabet = "[A-Za-z0-9]";
        Pattern pattern = Pattern.compile(Alphabet + " - - [" + Alphabet + "] U0022" + Alphabet + "U0022" + Alphabet);

        String[] splitFile = pattern.split (line);

        System.out.println(splitFile[0]);
    }
}
