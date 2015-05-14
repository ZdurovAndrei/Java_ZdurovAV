import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 * Created by Андрей on 14.05.2015.
 */
public class ReportFactory {
    private List<IReport> reports = new Vector<IReport>();

    public ReportFactory() {
        reports.add(new Report_1());
        reports.add(new Report_2());
        reports.add(new Report_3());
    }

    public IReport getReportByIndex(int reportIndex) {
        return reports.get(reportIndex);
    }
}
