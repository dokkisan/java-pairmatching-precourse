package pairmatching.domain;

import pairmatching.util.CrewNameReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrewRepository {
    private static Map<Course, Crew> crews;

    static {
        crews = new HashMap<>();
        saveBackendCrews();
        saveFrontendCrews();
    }

//    public List<String> findAllByCourse(Course course) {
//        List<String> crewNames = new ArrayList<>();
//
//        crews.values().stream().filter(crew -> crewNames.add(crews.get(course).getName()));
//    }

    private static void saveBackendCrews() {
        for (String name : CrewNameReader.readBackendCrew()) {
            crews.put(Course.BACKEND, new Crew(name));
        }
    }

    private static void saveFrontendCrews() {
        for (String name : CrewNameReader.readFrontendCrew()) {
            crews.put(Course.BACKEND, new Crew(name));
        }
    }
}
