import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Здуров Андрей on 19.02.2015.
 *
 1. host making the request. A hostname when possible, otherwise the Internet address if the name could not be looked up.
 2. timestamp in the format "DAY MON DD HH:MM:SS YYYY", where DAY is the day of the week, MON is the name of the month,
 DD is the day of the month, HH:MM:SS is the time of day using a 24-hour clock, and YYYY is the year.
 3. request given in quotes.
 4. HTTP reply code.
 5. bytes in the reply.
 *
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        try {
            if ((Integer.parseInt(args[1]) > 0) && (Integer.parseInt(args[2]) > 0)){
                String fileName = args[0];
                int numberOfLines = Integer.parseInt(args[1]);
                int amountOfRows = Integer.parseInt(args[2]);

                List<LogFileRecord> list = new ArrayList<LogFileRecord>(LogFileReader.readFile(fileName, numberOfLines, amountOfRows));
                List<String> files = new ArrayList<String>();

                for (LogFileRecord note: list) {

                    String str = "Host: " + note.host + ", TimeStamp: " + note.timestamp + ", Method: " + note.method + ", Way: " + note.path + ", Protocol: " + note.protocol + ", Reply: " + note.reply + ", Bytes: " + note.bytes;
                    files.add(str);
                    System.out.println(str);
                }

                System.out.println();
            }
        }
        catch (IOException e) {
            System.out.println("Input ERROR");
        }
    }
}
