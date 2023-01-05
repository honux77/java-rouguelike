package kr.seoul42;

public class Game {
    private final static String MAP_FILE = "map.txt";

    private Map map;
    public void start() {
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

    private void init() {
        System.out.println("Game Init");
        map = new Map(MAP_FILE);
    }
}
