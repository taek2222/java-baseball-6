package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerBallTest {

    @Test
    @DisplayName("컴퓨터 숫자 3개 저장 확인")
    void ballsSizeTest() {
        // given
        List<Integer> computerBalls;

        // when
        ComputerBall.setComputerBalls();
        computerBalls = ComputerBall.computerBalls;

        // then
        assertThat(computerBalls.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("컴퓨터 숫자 3개 중복 체크")
    void ballsDuplicationCheck() {
        // given
        List<Integer> computerBalls;

        // when
        ComputerBall.setComputerBalls();
        computerBalls = ComputerBall.computerBalls;

        // then
        HashSet<Integer> uniqBall = new HashSet<>(computerBalls);
        assertThat(uniqBall.size()).isEqualTo(3);
    }
}
