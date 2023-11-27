package pairmatching.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrewNameReader {

    public static List<String> readBackendCrew() {
        final String BACKEND_FILE_PATH = "src/main/resources/backend-crew.md";
        return readCrewNames(BACKEND_FILE_PATH);
    }

    public static List<String> readFrontendCrew() {
        final String FRONTEND_FILE_PATH = "src/main/resources/frontend-crew.md";
        return readCrewNames(FRONTEND_FILE_PATH);
    }

    private static List<String> readCrewNames(final String filePath) {
        List<String> crewNames = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                crewNames.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  crewNames;
    }
}
