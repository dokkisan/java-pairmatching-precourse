package pairmatching.controller;

import pairmatching.domain.Feature;
import pairmatching.message.ErrorMessage;
import pairmatching.message.OperationMessage;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairMatchingController {
    private final InputView inputView;
    private final OutputView outputView;

    public PairMatchingController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        Feature selectedFeature = getSelectedFeature();
    }

    private Feature getSelectedFeature() {
        outputView.printMessage(OperationMessage.SELECT_FEATURE.getMessage());
        outputView.printSelectableFunction();

        String inputKey = inputView.inputSelectedFeature();
        for (Feature feature : Feature.getAllFeatures()) {
            if (feature.getHotKey().equals(inputKey)) {
                return feature;
            }
        }

        throw new IllegalArgumentException(ErrorMessage.MATCH_HISTORY_NOT_FOUND.getMessage());
    }

//    private void getMatchingInfo() {
//        outputView.printMessage(OperationMessage.INFO_OF_COURSE_AND_MISSION.getMessage());
//        outputView.printMessage(OperationMessage.SELECT_COURSE_LEVEL_MISSION.getMessage());
//        inputView.
//    }
}