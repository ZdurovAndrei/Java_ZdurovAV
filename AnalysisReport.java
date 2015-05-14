import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 * Created by Андрей on 14.05.2015.
 */
public class AnalysisReport {
    public void analize (List<LogFileRecord> list, int args5, Date fromDate, Date toDate){
        System.out.print("Report "+ args5 +"\n");
        Param s = new Param(list, fromDate, toDate);
        List<IReport> Reports = new Vector<IReport>();
        Reports.add(new Report_1());
        Reports.add(new Report_2());
        Reports.add(new Report_3());
        System.out.println(Reports.get(args5 - 1).process(s));
        System.out.println();
    }
}
