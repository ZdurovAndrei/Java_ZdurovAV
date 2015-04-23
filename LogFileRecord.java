import java.util.Date;

/**
 * Created by Андрей on 05.03.2015.
 */
class LogFileRecord {
    String host;
    Date timestamp;
    String method;
    String path;
    String protocol;
    Integer reply;
    Integer bytes;
}
