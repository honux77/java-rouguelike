package kr.seoul42;

import java.util.HashMap;
import java.util.Map;

public class MonsterFarm {

    private static final Map<Character, String[]> monsterData = new HashMap<>();

    private MonsterFarm() {
    }

    static {
        var monsterInfo = DataReader.getMonsterData();
        for (var data: monsterInfo) {
            monsterData.put(data[0].charAt(0), data);
        }

    }

    public static Monster generate(char initial) {
        return new Monster(monsterData.get(initial));
    }

}
