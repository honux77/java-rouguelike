package kr.seoul42;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DataReaderTest {

    private final String PLAYER="Player";

    @Test
    @DisplayName("데이터리더는 올바른 플레이어 정보를 리턴해야 한다.")
    void getPlayer() {
        var playerInfo = DataReader.getRawData(PLAYER);
        assertThat(playerInfo.size()).isGreaterThan(0);
        System.out.println(playerInfo);
    }

}