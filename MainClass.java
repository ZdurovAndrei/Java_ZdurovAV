import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Здуров Андрей on 19.02.2015.
 */
public class MainClass {
    public static void main(String[] args) throws IOException,ParseException {
        try {
            if ((Integer.parseInt(args[1]) > 0) && (Integer.parseInt(args[2]) > 0)){
                String fileName = args[0];
                int numberOfLines = Integer.parseInt(args[1]);
                int amountOfRows = Integer.parseInt(args[2]);
                Date fromDate = new SimpleDateFormat("dd/MMM/y:HH:mm:ssZ", Locale.US).parse(args[3]);
                Date toDate = new SimpleDateFormat("dd/MMM/y:HH:mm:ssZ", Locale.US).parse(args[4]);

                ArrayList<LogFileRecord> list = new ArrayList<LogFileRecord>(LogFileReader.readFile(fileName, numberOfLines, amountOfRows));

                Map time = new HashMap <String, Integer>();
                System.out.print("Report "+ args[5] +"\n");

//                for (LogFileRecord note: list) {
//                    String str = "Host: " + note.host + ", TimeStamp: " + note.timestamp + ", Method: " + note.method + ", Way: " + note.path + ", Protocol: " + note.protocol + ", Reply: " + note.reply + ", Bytes: " + note.bytes;
//                    System.out.println(str);
//                }

                switch(Integer.parseInt(args[5]))
                {
                    case 1 :
                    {
                        ISpecified_period_of_time <List<Map.Entry<String, Integer>>> rep1 = new Report_1();
                        System.out.println(rep1.process(list, fromDate, toDate));
                        break;
                    }
                    case 2 :
                    {
                        ISpecified_period_of_time <Integer> rep2 = new Report_2();
                        System.out.println(rep2.process(list, fromDate, toDate));
                        break;
                    }
//                    case 3 :
//                    {
//                        ISpecified_period_of_time <LogFileRecord> rep3 = new Report_3();
//                        System.out.println(rep3.process(list, fromDate, toDate).bytes + " " + rep3.process(list, fromDate, toDate).reply);
//                        break;
//                    }
//                    default:{System.out.print("Error" );break;}
                }

                System.out.println();
            }
        }
        catch (IOException e) {
            System.out.println("Input ERROR");
        }
    }
}
