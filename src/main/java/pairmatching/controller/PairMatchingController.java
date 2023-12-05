package pairmatching.controller;

import pairmatching.domain.Feature;
import pairmatching.message.ErrorMessage;
import pairmatching.message.OperationMessage;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.util.Arrays;
import java.util.List;

public class PairMatchingController {
    private final InputView inputView;
    private final OutputView outputView;

    public PairMatchingController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        Feature selectedFeature = getSelectedFeature();
        List<String> matchingInfo = getMatchingInfo();
    }

    private Feature getSelectedFeature() {
        outputView.printMessage(OperationMessage.SELECT_FEATURE.getMessage());
        outputView.printSelectableFunction();

        while (true) {
            try {
                String inputKey = inputView.inputSelectedFeature();
                if (Arrays.stream(Feature.values())
                        .noneMatch(feature -> feature.getHotKey().equals(inputKey))) {
                    throw new IllegalArgumentException(ErrorMessage.INVALID_HOT_KEY.getMessage());
                }
                return Feature.getFeatureByHotKey(inputKey);
            } catch (IllegalArgumentException e) {
                outputView.printMessage(e.getMessage());
            }
        }
    }

    private List<String> getMatchingInfo() {
        outputView.printMessage(OperationMessage.INFO_OF_COURSE_AND_MISSION.getMessage());
        outputView.printMessage(OperationMessage.SELECT_COURSE_LEVEL_MISSION.getMessage());
        while (true) {
            try {
                return inputView.inputPairMatchingInfo();
            } catch (IllegalArgumentException e) {
                outputView.printMessage(e.getMessage());
            }
        }
    }
}