package kr.seoul42;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static kr.seoul42.DataReader.*;

class GameObjectTest {

    @Test
    @DisplayName("생성된 캐릭터는 이니셜을 가져야 한다.")
    void createPlayer() {
        var p = new Player(getPlayerData());
        assertThat(p.getDisplayLetter()).isEqualTo('@');
        System.out.println(p);
    }

    @Test
    @DisplayName("생성된 몬스터는 여럿이며 대문자 이니셜을 가져야 한다.")
    void createMonsters() {
        var monsterData = getMonsterData();
        SoftAssertions s = new SoftAssertions();
        s.assertThat(monsterData.size()).isGreaterThan(1);
        for (var data : monsterData) {
            var m = new Monster(data);
            s.assertThat(m.getDisplayLetter()).isBetween('A', 'Z');
            System.out.println(m);
        }


    }
}
