package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.utils.Move;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveTest {
    @DisplayName("값이 주어질 때 전진여부 결정하는 기능 테스트")
    @Test
    void isCarMoveTest(){
        Move move = new Move();
        assertThat(move.isCarMove(3)).isFalse();
        assertThat(move.isCarMove(8)).isTrue();
    }

}
