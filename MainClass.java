import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainClass {
    public static void main(String[] args) throws IOException,ParseException {
        try {
            if ((Integer.parseInt(args[1]) > 0) && (Integer.parseInt(args[2]) > 0)){
                String fileName = args[0];
                int numberOfLines = Integer.parseInt(args[1]);
                int amountOfRows = Integer.parseInt(args[2]);
                Date fromDate = new SimpleDateFormat("dd/MMM/y:HH:mm:ssZ", Locale.US).parse(args[3]);
                Date toDate = new SimpleDateFormat("dd/MMM/y:HH:mm:ssZ", Locale.US).parse(args[4]);

                LogFileReader logReader = new LogFileReader();
                List<LogFileRecord> list = logReader.readFile(fileName, numberOfLines, amountOfRows);
                AnalysisReport reportAnalize = new AnalysisReport();
                reportAnalize.analize(list, Integer.parseInt(args[5]), fromDate, toDate);
            }
        }
        catch (IOException e) {
            System.out.println("Input ERROR");
        }
    }
}
