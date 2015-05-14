import java.util.Date;
import java.util.List;

/**
 * Created by Andrei on 07.05.2015.
 */
public class ReportParameters {
    List<LogFileRecord> list;
    Date fromDate;
    Date toDate;
    public ReportParameters(List<LogFileRecord> list, Date fromDate, Date toDate)
    {
        this.list =list;
        this.fromDate=fromDate;
        this.toDate=toDate;
    }
}
