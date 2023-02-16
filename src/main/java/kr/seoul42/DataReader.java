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

    private static Map<String, List<String>> rawData;
    private static DataReader instance;

    static {
        try {
            new DataReader();
        } catch (IOException e) {
            System.err.println("오류: 데이터 파일을 읽지 못했습니다.");
            e.printStackTrace();
            System.exit(255);
        }
    }

    private DataReader() throws IOException {
        rawData = new HashMap<>();
        readAllInfo();
    }

    public static List<String> getPlayerData() {
        return rawData.get("Player");
    }

    public static List<String> getMonsterData() {
        return rawData.get("Monsters");
    }

    public static List<String> getStageData() {
        return rawData.get("Stage 1");
    }


    private static List<String> getRawData(String key) {
        return rawData.get(key);
    }

    private static void readAllInfo() throws IOException {
        final String END = "End";
        final String PATH = "data/game.txt";
        Path path = Paths.get(PATH);
        var allLines = Files.readAllLines(path);

        boolean begin = true;
        String key = "";
        List <String> data = new ArrayList<>();

        for (String line: allLines) {
            if (line.length() == 0) continue;
            if (begin) {
                key = line;
                begin = false;
            } else if (line.contains(END)) {
                rawData.put(key, data);
                begin = true;
                data = new ArrayList<>();
            } else {
                data.add(line);
            }
        }
    }
}
