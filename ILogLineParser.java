import java.io.IOException;
import java.text.ParseException;

/**
 * Created by Андрей on 08.05.2015.
 */
public interface ILogLineParser {
    public LogFileRecord parseLine(String line) throws IOException, ParseException;
}