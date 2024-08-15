package baseball.controller;

import baseball.exception.Exception;
import baseball.model.ComputerBall;
import baseball.model.UserBall;
import baseball.service.BallService;

import static baseball.constant.ViewConstant.*;
import static baseball.view.OutputView.outputMessage;

public class BaseballController {
    ComputerBall computerBall = new ComputerBall();
    UserBall userBall = new UserBall();
    Exception exception = new Exception();
    BallService service = new BallService(computerBall, userBall, exception);

    public void run() {
        outputMessage(GAME_START);

        while (true) {
            if(service.baseballGame())
                break;
        }
    }
}
