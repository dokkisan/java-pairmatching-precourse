package pairmatching.domain;

import pairmatching.util.CrewNameReader;

import java.util.ArrayList;
import java.util.List;

public class CrewRepository {
    private static final List<Crew> crews;

    static {
        crews = new ArrayList<>();
        saveBackendCrews();
        saveFrontendCrews();
    }

//    public List<String> findAllByCourse(Course course) {
//        crews.values().stream().filter(crew -> crewNames.add(crews.get(course).getName()));
//        crews.stream().allMatch(crew -> crew.)
//    }

    private static void saveBackendCrews() {
        for (String name : CrewNameReader.readBackendCrew()) {
            crews.add(new Crew(Course.BACKEND, name));
        }
    }

    private static void saveFrontendCrews() {
        for (String name : CrewNameReader.readFrontendCrew()) {
            crews.add(new Crew(Course.FRONTEND, name));
        }
    }
}
