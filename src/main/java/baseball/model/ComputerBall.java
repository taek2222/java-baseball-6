package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class ComputerBall {
    public List<Integer> computerBalls;

    public void setComputerBalls() {
        computerBalls = Randoms.pickUniqueNumbersInRange(1, 9, 3);
    }

    public int getBall(int i) {
        return computerBalls.get(i);
    }

    public List<Integer> getBalls() {
        return computerBalls;
    }
}

