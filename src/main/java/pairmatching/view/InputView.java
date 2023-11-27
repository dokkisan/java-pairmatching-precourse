package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public String inputSelectedFeature() {
        return Console.readLine();
    }

    public List<String> inputMatchinglInfo() {
        return validateSeparator(Console.readLine());
    }

    private List<String> validateSeparator(String input) {
        final String SEPARATOR = ",";

        return Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }
}
