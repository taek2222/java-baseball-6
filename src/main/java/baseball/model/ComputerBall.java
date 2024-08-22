package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerBall {
    public List<Integer> computerBalls;

    public void setComputerBalls() {
        computerBalls = new ArrayList<>();

        while (computerBalls.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerBalls.contains(randomNumber)) {
                computerBalls.add(randomNumber);
            }
        }
    }

    public int getBall(int i) {
        return computerBalls.get(i);
    }

    public List<Integer> getBalls() {
        return computerBalls;
    }
}

