import java.io.IOException;
import java.util.List;

/**
 * Created by Андрей on 07.05.2015.
 */
public interface ILogFileReader {
    public List<LogFileRecord> readFile(String fileName, int numberOfLines, int amountOfRows) throws  IOException;
}
