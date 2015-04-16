import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Андрей on 09.04.2015.
 */

public class Report_1 implements ISpecified_period_of_time<List<Map.Entry<String, Integer>>>{
    public List<Map.Entry<String, Integer>> process (ArrayList<LogFileRecord> list, Date fromDate, Date toDate)
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(LogFileRecord note: list)
        {
            if(note.timestamp.after(fromDate) && note.timestamp.before(toDate))
            {
                if(map.containsKey(note.host))
                {
                    map.put(note.host, map.get(note.host) + 1);
                }
                else
                {
                    map.put(note.host, 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list1 = new ArrayList<Map.Entry<String, Integer>>();
        list1.addAll(map.entrySet());


        Collections.sort(list1, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare(Map.Entry<String, Integer> el1, Map.Entry<String, Integer> el2)
            {
                return el2.getValue().compareTo(el1.getValue());
            }
        });

        if(list1.size()>5)
        {
            while(list1.size()>5)
            {
                list1.remove(list1.size()-1);
            }
        }

        return list1;
    }

}
