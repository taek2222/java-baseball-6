package baseball.service;

import baseball.exception.Exception;
import baseball.model.ComputerBall;
import baseball.model.UserBall;

import static baseball.constant.ViewConstant.NUMBER_INPUT;
import static baseball.view.Input.readInput;
import static baseball.view.Output.printMessage;

public class BallSetService {
    private final ComputerBall computerBall;
    private final UserBall userBall;
    private final Exception exception;

    public BallSetService(ComputerBall computerBall, UserBall userBall, Exception exception) {
        this.computerBall = computerBall;
        this.userBall = userBall;
        this.exception = exception;
    }

    public void setComputerBall() {
        computerBall.setComputerBalls();
    }

    public void setUserBalls() {
        String balls = promptUserBalls();
        validBall(balls);
        setUserBall(balls);
    }

    private String promptUserBalls() {
        printMessage(NUMBER_INPUT.getMessage());
        return readInput();
    }

    private void setUserBall(String balls) {
        userBall.setUserBall(balls);
    }

    private void validBall(String balls) {
        exception.inputCheck(balls);
    }
}
