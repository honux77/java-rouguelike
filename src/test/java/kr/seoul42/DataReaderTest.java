package kr.seoul42;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DataReaderTest {

    @Test
    @DisplayName("데이터리더는 올바른 플레이어 정보를 리턴해야 한다.")
    void getPlayer() {
        final String PLAYER="Player";
        var playerInfo = DataReader.getPlayerData();
        assertThat(playerInfo.size()).isGreaterThan(0);
        System.out.println(playerInfo);
    }

    @Test
    @DisplayName("데이터 리더는 몬스터 정보를 리턴해야 한다.")
    void getMonsters() {
        final String MONSTERS="Monsters";
        var monsters = DataReader.getMonsterData();
        assertThat(monsters.size()).isGreaterThan(0);
        System.out.println(monsters);
    }

    @Test
    @DisplayName("데이터 리더는 지도 정보를 리턴해야 한다.")
    void getMap() {
        final String STAGE_ONE="Stage 1";
        var map = DataReader.getStageData();
        assertThat(map.size()).isGreaterThan(0);
        System.out.println(map);
    }



}
