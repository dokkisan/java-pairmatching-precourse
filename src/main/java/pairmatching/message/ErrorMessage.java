package pairmatching.message;

public enum ErrorMessage {
    INVALID_HOT_KEY("유효하지 않은 단축키입니다."),
    MATCH_HISTORY_NOT_FOUND("매칭 이력이 없습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        final String PREFIX = "[ERROR] ";

        return PREFIX + message;
    }
}
