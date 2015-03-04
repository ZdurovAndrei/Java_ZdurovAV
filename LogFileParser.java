import java.io.IOException;
import java.lang.String;

public class LogFileParser {
    public static void parseFile(String line) throws IOException {
        /*String Alphabet = "[A-Za-z0-9\\s:.-/]";
        Pattern pattern = Pattern.compile(Alphabet + " - - [" + Alphabet + "] \"" + Alphabet + "\" " + Alphabet);

        String[] splitFile = pattern.split (line);*/

        String[] buferLine = line.split(" - - ");
        String host = buferLine[0];
        String[] buferLine1 = buferLine[1].split(" \"");
        String timeStamp = buferLine1[0];
        buferLine = buferLine1[1].split("\" ");
        String request = buferLine[0];
        buferLine1 = buferLine[1].split(" ");
        String replyCode = buferLine1[0];
        String bytes = buferLine1[1];

        System.out.println(" Host: " + host + "  TimeStamp: " + timeStamp  + "  Request: " + request + "  ReplyCode: " + replyCode + "  Bytes: " + bytes);
    }
}
