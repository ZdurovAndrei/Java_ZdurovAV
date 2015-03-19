/**
 * Created by Андрей on 05.03.2015.
 */
class LogFileRecord {
    String[] host;
    String[] timeStamp;
    String[] request;
    String[] replyCode;
    String[] bytes;

//    LogFileRecord(String host, String timeStamp, String request, String replyCode, String bytes)
    {
        this.host = host;
        this.timeStamp = timeStamp;
        this.request = request;
        this.replyCode = replyCode;
        this.bytes = bytes;
    }
}
