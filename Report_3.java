import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Андрей on 15.04.2015.
 */
public class Report_3 implements IReport <LogFileRecord>  {
    public LogFileRecord process(ArrayList<LogFileRecord> list, Date  fromDate, Date toDate)
    {
        LogFileRecord report = new LogFileRecord();
        int max=0;
        for(LogFileRecord element: list)
        {
            if(element.timestamp.after(fromDate) && element.timestamp.before(toDate) && max < element.bytes)
            {
                max = element.bytes;
                report = element;
            }
        }
        return report;
    }
}