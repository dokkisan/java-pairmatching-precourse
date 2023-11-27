package pairmatching.domain;

import pairmatching.message.ErrorMessage;

import java.util.Arrays;
import java.util.List;

public enum Feature {
    PAIR_MATCHING("1", "페어 매칭"),
    PAIR_LOOKUP("2", "페어 조회"),
    PAIR_INIT("3", "페어 초기화"),
    QUIT("Q", "종료");

    private final String hotKey;
    private final String name;

    Feature(String hotKey, String name) {
        this.hotKey = hotKey;
        this.name = name;
    }

    public static List<Feature> getAllFeatures() {
        return Arrays.asList(Feature.values());
    }

    public Feature getFeatureByHotKey(String hotKey) {
        for (Feature feature : Feature.values()) {
            if (feature.getHotKey().equals(hotKey)) {
                return feature;
            }
        }
        throw new IllegalArgumentException(ErrorMessage.INVALID_HOT_KEY.getMessage());
    }

    public String getHotKey() {
        return hotKey;
    }

    public String getName() {
        return name;
    }
}
