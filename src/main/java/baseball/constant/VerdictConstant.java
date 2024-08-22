package baseball.constant;

public enum VerdictConstant {
    BALL("볼 "),
    STRIKE("스트라이크"),
    NOTHING("낫싱");

    private final String verdict;

    VerdictConstant(String verdict) {
        this.verdict = verdict;
    }

    public String getVerdict() {
        return this.verdict;
    }
}
