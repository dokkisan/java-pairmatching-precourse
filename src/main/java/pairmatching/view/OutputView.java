package pairmatching.view;

import pairmatching.domain.Feature;

public class OutputView {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printSelectableFunction() {
        final String SEPARATOR = ". ";
        for (Feature feature : Feature.getAllFeatures()) {
            System.out.println(feature.getHotKey() + SEPARATOR + feature.getName());
        }
    }

    public void printBlankLine() {
        System.out.println();
    }
}
