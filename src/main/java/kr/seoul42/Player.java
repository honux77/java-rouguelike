package kr.seoul42;

import java.util.List;
import static kr.seoul42.GameUtil.*;

public class Player extends GameObject {

    private final String name;
    private int hp;
    private int mp;
    private int atk;
    private int def;
    private int gold;
    private int potion;

    /**
     * * 플레이어 정보를 포함하는 클래스
     * @param data: 플레이어 정보의 rawData를 포함함 스트링 리스트
     *                  * 예를 들어 [@,Pino,30,5,3,3,0,0]
     */
    public Player(String[] data) {
        super(data[0].charAt(0));
        this.name = data[1];
        this.hp = stoi(data, 2);
        this.mp = stoi(data, 3);
        this.atk = stoi(data, 4);
        this.def = stoi(data, 5);
        this.gold = stoi(data, 6);
        this.potion = stoi(data, 7);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getGold() {
        return gold;
    }

    public int getPotion() {
        return potion;
    }

    @Override
    public String toString() {
        return "Player{" +
                "initial=" + super.getDisplayLetter() +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", atk=" + atk +
                ", def=" + def +
                ", gold=" + gold +
                ", potion=" + potion +
                '}';
    }
}
