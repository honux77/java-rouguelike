package kr.seoul42;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StageMap {

    private GameObject[][] mapData;

    public StageMap(String filename) throws IOException {
        var rawMapData = readTextData(filename);
        setMapData(rawMapData);

    }

    private void setMapData(List<String> rawMapData) {
    }

    public void print() {
        //TODO: implement
    }

    public List<String> readTextData(String filename) throws IOException {
        var path = Paths.get(filename);
        return Files.readAllLines(path);
    }
}
