import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;

public class LogLineParser {

    static void parseLine(String line, int g, LogFileRecord log) throws IOException {
//        ArrayList<LogFileRecord> attributes = new ArrayList<LogFileRecord>();
        String[] host = line.split(" - - ");
        String[] timeStamp = host[1].split(" \"");
        String[] request = timeStamp[1].split("\" ");
        String[] bytes = request[1].split(" ");

        log.host[g] = host[0];
        log.timeStamp[g] = timeStamp[0];
        log.request[g] = request[0];
        log.replyCode[g] = request[1];
        log.bytes[g] = bytes[1];
//        return log;
//        attributes.add(new LogFileRecord(host[0], timeStamp[0], replyCode[0], bytes[0], bytes[1]));

    }
}
