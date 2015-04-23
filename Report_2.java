import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Андрей on 15.04.2015.
 */
public class Report_2 implements IReport <Integer> {
    public Integer process(ArrayList<LogFileRecord> list, Date fromDate, Date toDate)
    {
        int sum = 0;
        for(LogFileRecord note: list)
        {
            if(note.timestamp.after(fromDate) && note.timestamp.before(toDate))
            {
                sum += note.bytes;
            }
        }
        return sum;
    }
}
