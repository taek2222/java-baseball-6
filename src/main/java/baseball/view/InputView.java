package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public abstract class InputView {
    public static String inputMessage(String message) {
        System.out.print(message);
        return Console.readLine();
    }

    public static String inputMessage() {
        return Console.readLine();
    }
}
