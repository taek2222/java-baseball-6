package baseball.controller;

import baseball.exception.Exception;
import baseball.model.ComputerBall;
import baseball.model.UserBall;
import baseball.service.BallService;
import baseball.service.BallSetService;

import static baseball.constant.ViewConstant.GAME_START;
import static baseball.view.Output.printlnMessage;

public class BaseballController {
    ComputerBall computerBall = new ComputerBall();
    UserBall userBall = new UserBall();
    Exception exception = new Exception();

    BallSetService ballSetService = new BallSetService(computerBall, userBall, exception);
    BallService ballService = new BallService(ballSetService, computerBall, userBall, exception);

    public void run() {
        printlnMessage(GAME_START.getMessage());

        while (true) {
            if(ballService.baseballGame())
                continue;
            break;
        }
    }
}
