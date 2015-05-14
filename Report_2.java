
public class Report_2 implements IReport <Integer, Param> {
    public Integer process(Param s)
    {
        int sum = 0;
        for(LogFileRecord note: s.list)
        {
            if(note.timestamp.after(s.fromDate) && note.timestamp.before(s.toDate))
            {
                sum += note.bytes;
            }
        }
        return sum;
    }
}
