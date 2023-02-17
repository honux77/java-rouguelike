package kr.seoul42;

import java.io.IOException;
import static kr.seoul42.DataReader.*;

public class Game {

    private Player p;
    private StageMap map;

    public void start() throws IOException {
        init();
        loop();
        end();
    }

    private void end() {
        System.out.println("Game End");

    }

    private void loop() {
        System.out.println("Loop Start");
        System.out.println(p);

    }

    private void init() throws IOException {
        System.out.println("Game Init");
        p = new Player(getPlayerData());
        map = new StageMap();
    }
}
