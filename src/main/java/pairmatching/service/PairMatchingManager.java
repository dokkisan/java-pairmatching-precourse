package pairmatching.service;

import pairmatching.domain.Course;
import pairmatching.util.CrewNameReader;

import java.util.List;

public class PairMatchingManager {

    public void createPairMatching() {

    }

    private boolean isBackendCrew(List<String> pairMatchingInfo) {
        return pairMatchingInfo.get(0).equals(Course.BACKEND.getName());
    }


}
