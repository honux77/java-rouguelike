package kr.seoul42;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

class MapTest {

    private final String MAP_FILE = "data/map.txt";

    @Test
    void fileExistCheck() throws IOException {
        File f = new File(MAP_FILE);
        assertThat(f.exists()).isTrue();
    }

    @Test
    void readMapData() throws IOException {
        Map m = new Map(MAP_FILE);
        var mapString = m.readTextData(MAP_FILE);
        for (var s: mapString) {
            System.out.println(s);
        }
        assertThat(mapString.size()).isGreaterThan(0);
    }


}