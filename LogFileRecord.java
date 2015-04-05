import java.util.Date;

/**
 * Created by Андрей on 05.03.2015.
 */
class LogFileRecord {
    String host;
    Date timestamp; //date && time
    String method; //enum
    String path;
    String protocol; //enum
    String reply;
    String bytes;
}
