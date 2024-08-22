package baseball.exception;

import java.util.HashSet;

import static baseball.constant.GameConstant.*;

public class Exception {

    public void inputCheck(String input) {
        sizeCheck(input);
        numberCheck(input);
        duplicationCheck(input);
    }

    // 입력된 문자가 3개 초과, 미만일 경우
    private void sizeCheck(String input) {
        if(input.length() != BALL_MAX)
            throw new IllegalArgumentException();
    }

    // 숫자가 아닌 경우
    private void numberCheck(String input) {
        for (int i = 0; i < BALL_MAX; i++) {
            char c = input.charAt(i);

            if ('1' > c || c > '9')
                throw new IllegalArgumentException();
        }
    }

    // 중복된 숫자가 존재할 경우
    private void duplicationCheck(String input) {
        HashSet<Character> numbers = new HashSet<>();

        for (int i = 0; i < BALL_MAX; i++)
            numbers.add(input.charAt(i));

        if (numbers.size() != BALL_MAX)
            throw new IllegalArgumentException();
    }

    // 게임 종료 후 입력이 1 or 2가 아닌 경우
    public void endInputCheck(String input) {
        if (!input.equals(RESTART) && !input.equals(EXIT))
            throw new IllegalArgumentException();
    }
}
