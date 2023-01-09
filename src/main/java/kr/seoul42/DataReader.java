package kr.seoul42;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataReader {

    private final static String DATA_FILE = "data/game.txt";
    private static Map<String, List<String>> rawData;
    private static DataReader instance;

    static {
        try {
            instance = new DataReader();
        } catch (IOException e) {
            System.err.println("심각한 오류: 데이터 파일을 읽는 중 오류가 발생했습니다.");
            e.printStackTrace();
            System.exit(255);
        }
    }

    private DataReader() throws IOException {
        rawData = new HashMap<>();
        readAllInfo();
    }

    public static List<String> getRawData(String key) {
        return rawData.get(key);
    }

    private static void readAllInfo() throws IOException {
        Path path = Paths.get(DATA_FILE);
        var allLines = Files.readAllLines(path);

        boolean begin = true;
        String key = "";
        List <String> data = new ArrayList<>();

        for (String line: allLines) {
            if (begin) {
                key = line;
                begin = false;
            } else if (line.contains(key)) {
                rawData.put(key, data);
                begin = true;
                data = new ArrayList<>();
            } else {
                data.add(line);
            }
        }
    }
}
