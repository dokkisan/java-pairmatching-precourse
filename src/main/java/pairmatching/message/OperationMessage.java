package pairmatching.message;

public enum OperationMessage {
    SELECT_FEATURE("기능을 선택하세요."),
    INFO_OF_COURSE_AND_MISSION(
            "#############################################\n" +
            "과정: 백엔드 | 프론트엔드\n" +
            "미션:\n" +
            "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n" +
            "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n" +
            "  - 레벨3: \n" +
            "  - 레벨4: 성능개선 | 배포\n" +
            "  - 레벨5: \n" +
            "############################################"),
    SELECT_COURSE_LEVEL_MISSION("과정, 레벨, 미션을 선택하세요.\n" + "ex) 백엔드, 레벨1, 자동차경주"),
    PAIR_MATCHING_RESULT("페어 매칭 결과입니다."),
    HAS_MATCHING_INFO("매칭 정보가 있습니다. 다시 매칭하시겠습니까?"),
    INIT("초기화 되었습니다. ")
    ;

    private final String message;

    OperationMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
