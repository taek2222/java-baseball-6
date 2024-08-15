package baseball.constant;

public enum ViewConstant {
    GAME_START("숫자 야구 게임을 시작합니다."),
    GAME_END("개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    RESTART_EXIT("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    NUMBER_INPUT("숫자를 입력해주세요 : "),
    BALL("볼 "),
    STRIKE("스트라이크"),
    NOTHING("낫싱");

    private final String message;

    ViewConstant(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
