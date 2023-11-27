package pairmatching.domain;

public enum Mission {
    RACING_GAME(Level.LEVEL_1, "자동차경주"),
    LOTTO(Level.LEVEL_1, "로또"),
    BASEBALL_GAME(Level.LEVEL_1, "숫자야구게임"),
    SHOPPING_CART(Level.LEVEL_2, "장바구니"),
    PAYMENT(Level.LEVEL_2, "결제"),
    SUBWAY_MAP(Level.LEVEL_2, "지하철노선도"),
    OPTIMIZATION(Level.LEVEL_4, "성능개선"),
    DEPLOY(Level.LEVEL_4, "배포");

    private final Level level;
    private final String name;

    Mission(Level level, String name) {
        this.level = level;
        this.name = name;
    }
}
