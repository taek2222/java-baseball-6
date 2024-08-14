package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public abstract class ComputerBall {
    public static List<Integer> computerBalls;

    public static void setComputerBalls() {
        computerBalls = Randoms.pickUniqueNumbersInRange(1, 9, 3);
    }
}
