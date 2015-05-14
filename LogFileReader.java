import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LogFileReader implements ILogFileReader{
    public List<LogFileRecord> readFile(String fileName, int numberOfLines, int amountOfRows) throws  IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        List<LogFileRecord> list = new ArrayList<LogFileRecord>();
        try {
            String line;
            int i = 0;

            LogLineParser logParser = new LogLineParser();
            while (((line = reader.readLine()) != null) && i <= numberOfLines + amountOfRows ) {
                if (i >= numberOfLines && i < numberOfLines + amountOfRows) {
                    list.add(logParser.parseLine(line));
                }
                i++;
            }
        }
        catch (IOException e) {
            System.out.println("Input ERROR");
        }
        finally {
            reader.close();
            return list;
        }
    }
}