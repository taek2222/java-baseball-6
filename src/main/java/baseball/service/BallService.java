package baseball.service;

import baseball.exception.Exception;
import baseball.model.ComputerBall;
import baseball.model.UserBall;

import static baseball.constant.GameConstant.*;
import static baseball.constant.ViewConstant.*;
import static baseball.view.Input.readInput;
import static baseball.view.Output.printlnMessage;
import static baseball.view.Output.printMessage;

public class BallService {
    private final BallSetService ballSetService;
    private final ComputerBall computerBall;
    private final UserBall userBall;
    private final Exception exception;

    public BallService(BallSetService ballSetService, ComputerBall computerBall, UserBall userBall, Exception exception) {
        this.ballSetService = ballSetService;
        this.computerBall = computerBall;
        this.userBall = userBall;
        this.exception = exception;
    }

    public boolean baseballGame() {
        ballSetService.setComputerBall();

        while (true) {
            ballSetService.setUserBalls();

            int strike = getStrike();
            int ball = getBall();

            printStrikeBall(ball, strike);

            if (isMaxStrikeBoolean(strike))
                break;
        }

        printGameEnd();
        return checkRestartExit();
    }

    private void printGameEnd() {
        printlnMessage(BALL_MAX + GAME_END.getMessage());
        printlnMessage(RESTART_EXIT.getMessage());
    }

    private boolean checkRestartExit() {
        String endInput = readInput();
        exception.endInputCheck(endInput);

        return endInput.equals(RESTART);
    }

    private boolean isMaxStrikeBoolean(int strike) {
        return strike == BALL_MAX;
    }

    private void printStrikeBall(int ball, int strike) {
        if (ball > 0)
            printMessage(ball + BALL.getMessage());

        if (strike > 0)
            printMessage(strike + STRIKE.getMessage());

        if(ball == 0 && strike == 0)
            printMessage(NOTHING.getMessage());

        printlnMessage("");
    }

    private int getBall() {
        int ball = 0;

        for (int i = 0; i < BALL_MAX; i++)
            for (int j = 0; j < BALL_MAX; j++) {
                if (i == j)
                    continue;
                if (computerBall.getBall(i) == userBall.getBall(j))
                    ball++;
            }

        return ball;
    }

    private int getStrike() {
        int strike = 0;

        for (int i = 0; i < BALL_MAX; i++)
            if(computerBall.getBall(i) == userBall.getBall(i))
                strike++;

        return strike;
    }
}
