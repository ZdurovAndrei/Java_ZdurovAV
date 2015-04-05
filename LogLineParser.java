import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;

public class LogLineParser {

    public static LogFileRecord parseLine(String line) throws IOException {
        LogFileRecord note = new LogFileRecord();

        String[] buffer1 = line.split(" - - ");
        note.host = buffer1[0];

        String[] buffer2 = buffer1[1].split(" \"");
//        note.timestamp = buffer2[0];

        String[] buffer3 = buffer2[1].split("\" ");
        String[] buffer4 = buffer3[0].split(" ");
        note.method = buffer4[0];
        note.path = buffer4[1];
        note.protocol = buffer4[2];

        String[] buffer5 = buffer3[1].split(" ");
        note.reply = buffer5[0];
        note.bytes = buffer5[1];

        return note;
    }
}
