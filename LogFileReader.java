import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LogFileReader {

    public static void readFile(String fileName, int numberOfLines, int amountOfRows) throws  IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        try {
            String line;
            int i = 0;
            while (((line = reader.readLine()) != null) && i <= numberOfLines + amountOfRows ) {
                i++;
                if (i >= numberOfLines && i < numberOfLines + amountOfRows) {
                    //System.out.println( line );
                    LogFileParser.parseFile(line);
                }
            }
        }
        catch (IOException e) {
            System.out.println("Input ERROR");
        }
        finally {
            reader.close();
        }
    }
}