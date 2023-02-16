package kr.seoul42;

import java.io.IOException;

public class Game {
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

    }

    private void init() throws IOException {
        System.out.println("Game Init");
        map = new StageMap();
    }
}
