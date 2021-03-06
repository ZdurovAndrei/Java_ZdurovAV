
public class Report_3 implements IReport <String, ReportParameters>  {
    public String process(ReportParameters a)
    {
        LogFileRecord report = new LogFileRecord();
        int max=0;
        for(LogFileRecord element: a.list)
        {
            if(element.timestamp.after(a.fromDate) && element.timestamp.before(a.toDate) && max < element.bytes)
            {
                max = element.bytes;
                report = element;
            }
        }
        return report.path;
    }
}