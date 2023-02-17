package kr.seoul42;

import static kr.seoul42.GameUtil.*;

public class Monster extends GameObject{

    private String name;
    private int hp;
    private final int atk;
    private final int def;
    private final int atkPlus;
    private final int defPlus;
    private final int gold;

    public Monster(String[] data) {
        super(data[0].charAt(0));
        name = data[1];
        hp = stoi(data, 2);
        atk = stoi(data, 3);
        def = stoi(data, 4);
        atkPlus = stoi(data, 5);
        defPlus = stoi(data, 6);
        gold = stoi(data, 7);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                ", def=" + def +
                ", atkPlus=" + atkPlus +
                ", defPlus=" + defPlus +
                ", gold=" + gold +
                '}';
    }
}
