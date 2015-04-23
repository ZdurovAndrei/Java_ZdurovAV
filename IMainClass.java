import java.text.ParseException;
import java.util.ArrayList;

/**
 * Created by Андрей on 16.04.2015.
 */
public interface IMainClass <T>{
    T Process (ArrayList<LogFileRecord> list);
//
//    ArrayList<String> logs = new ArrayList<String>();
//
    void Process(String args[]) throws ParseException;
}
