import java.util.ArrayList;
import java.util.Date;
/**
 * Created by Андрей on 09.04.2015.
 */
public interface ISpecified_period_of_time <T>
{
    T process(ArrayList<LogFileRecord> list, Date  fromDate, Date toDate);
}