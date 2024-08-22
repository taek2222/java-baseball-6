package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class UserBall {
    private List<Integer> userBalls;

    public void setUserBall(String inputBalls) {
        String[] str = inputBalls.split("");
        userBalls = new ArrayList<>();

        for (String s : str)
            userBalls.add(Integer.parseInt(s));
    }

    public int getBall(int i) {
        return userBalls.get(i);
    }
}
