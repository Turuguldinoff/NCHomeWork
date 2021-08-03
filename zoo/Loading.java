import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Loading {
    File file;
    List<InhibitionLog> logList = new ArrayList<>();

    public List<InhibitionLog> getLogList() {
        return logList;
    }

    public Loading() throws IOException {
        this.file = new File("Log.txt");
        this.file.createNewFile();
        FileWriter input = new FileWriter("Log.txt", true);
        input.close();
    }

    public void inLog(InhibitionLog log) throws IOException {
        FileWriter input = new FileWriter("Log.txt", true);
        logList.add(log);
        input.write(logList.get(logList.size() - 1).toString() + "\n");
        input.close();
    }

    public List<InhibitionLog> pullLog() throws IOException {
        for (InhibitionLog logString : logList) {
            System.out.println(logString);
        }
        return logList;
    }

    public void deleteLog() {
        this.file.delete();
    }
}
