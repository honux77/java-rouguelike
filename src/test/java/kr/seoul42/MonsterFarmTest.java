package kr.seoul42;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MonsterFarmTest {

    @Test
    @DisplayName("몬스터 팜에서 몬스터를 생성할 수 있어야 한다.\n" +
            "생성된 몬스터의 이름과 이니셜이 일치해야 한다.")
    void spawn() {
        SoftAssertions s = new SoftAssertions();

        s.assertThat(MonsterFarm.generate('O').getName()).isEqualTo("Slime");
        s.assertThat(MonsterFarm.generate('S').getName()).isEqualTo("Snake");
    }

}
