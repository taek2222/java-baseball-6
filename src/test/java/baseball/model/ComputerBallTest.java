package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerBallTest {
    private final ComputerBall computerBall = new ComputerBall();

    @Test
    @DisplayName("컴퓨터 숫자 3개 저장 확인")
    void ballsSizeTest() {
        // given
        List<Integer> balls;

        // when
        computerBall.setComputerBalls();
        balls = computerBall.getBalls();

        // then
        assertThat(balls.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("컴퓨터 숫자 3개 중복 체크")
    void ballsDuplicationCheck() {
        // given
        List<Integer> balls;

        // when
        computerBall.setComputerBalls();
        balls = computerBall.getBalls();

        // then
        HashSet<Integer> uniqBall = new HashSet<>(balls);
        assertThat(uniqBall.size()).isEqualTo(3);
    }
}
