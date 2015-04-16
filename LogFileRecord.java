import java.util.Date;

/**
 * Created by Андрей on 05.03.2015.
 */
class LogFileRecord {
    String host;
    Date timestamp;
    String method; //enum
    String path;
    String protocol; //enum
    Integer reply;
    Integer bytes;
}
