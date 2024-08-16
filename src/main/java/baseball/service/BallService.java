package baseball.service;

import baseball.exception.Exception;
import baseball.model.ComputerBall;
import baseball.model.UserBall;

import static baseball.constant.GameConstant.*;
import static baseball.constant.ViewConstant.*;
import static baseball.view.InputView.inputMessage;
import static baseball.view.OutputView.outputMessage;

public class BallService {
    private final ComputerBall computerBall;
    private final UserBall userBall;
    private final Exception exception;

    public BallService(ComputerBall computerBall, UserBall userBall, Exception exception) {
        this.computerBall = computerBall;
        this.userBall = userBall;
        this.exception = exception;
    }

    public boolean baseballGame() {
        computerBall.setComputerBalls();

        while (true) {
            promptUserBalls();

            int strike = 0;
            int ball = 0;

            for (int i = 0; i < BALL_MAX; i++)
                if(computerBall.getBall(i) == userBall.getBall(i))
                    strike++;

            for (int i = 0; i < BALL_MAX; i++)
                for (int j = 0; j < BALL_MAX; j++) {
                    if (i == j)
                        continue;
                    if (computerBall.getBall(i) == userBall.getBall(j))
                        ball++;
                }

            if (ball > 0 && strike > 0) {
                outputMessage(ball + BALL.getMessage() + strike + STRIKE.getMessage());
                continue;
            }

            if (ball > 0) {
                outputMessage(ball + BALL.getMessage());
                continue;
            }

            if (strike > 0) {
                outputMessage(strike + STRIKE.getMessage());
                if (strike == BALL_MAX)
                    break;
                continue;
            }

            outputMessage(NOTHING.getMessage());
        }

        outputMessage(GAME_END.getMessage());
        outputMessage(RESTART_EXIT.getMessage());
        return !exception.endInputCheck(inputMessage()).equals(RESTART);
    }

    private void promptUserBalls() {
        String balls = inputMessage(NUMBER_INPUT.getMessage());
        exception.inputCheck(balls);
        userBall.setUserBall(balls);
    }
}
