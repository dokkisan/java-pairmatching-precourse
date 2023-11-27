package pairmatching.domain;

import pairmatching.util.CrewNameReader;

import java.util.ArrayList;
import java.util.List;

public class CrewRepository {
    private final List<Crew> crews = new ArrayList<>();

    public void saveBackendCrews() {
        for (String name : CrewNameReader.readBackendCrew()) {
            crews.add(new Crew(name, Course.BACKEND));
        }
    }
    
    public void saveFrontendCrews() {
        for (String name : CrewNameReader.readFrontendCrew()) {
            crews.add(new Crew(name, Course.FRONTEND));
        }
    }
}
