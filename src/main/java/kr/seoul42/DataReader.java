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

    private static final Map<String, List<String[]>> rawData = new HashMap<>();

    private DataReader() {
    }

    static {
        try {
            readAllInfo();
        } catch (IOException e) {
            System.err.println("오류: 데이터 파일을 읽지 못했습니다.");
            e.printStackTrace();
            System.exit(255);
        }
    }

    public static String[] getPlayerData() {
        return rawData.get("Player").get(0);
    }

    public static List<String[]> getMonsterData() {
        return rawData.get("Monsters");
    }

    public static List<String[]> getStageData() {
        return rawData.get("Stage 1");
    }

    private static void readAllInfo() throws IOException {
        final String END = "End";
        final String PATH = "data/game.txt";
        Path path = Paths.get(PATH);
        var allLines = Files.readAllLines(path);

        int begin = 0;
        String key = "";
        List<String[]> data = new ArrayList<>();

        for (String line : allLines) {
            if (line.length() == 0) continue;
            if (line.contains(END)) {
                rawData.put(key, data);
                begin = 0;
                data = new ArrayList<>();
                continue;
            }
            switch (begin) {
                case 0:
                    //set key
                    key = line;
                    begin++;
                    break;
                case 1:
                    //ignore header line
                    begin++;
                    break;
                default:
                    data.add(line.split(","));
            }


        }
    }
}
