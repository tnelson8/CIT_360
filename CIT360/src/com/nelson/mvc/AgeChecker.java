package com.nelson.mvc;

/**
 * Created by Tyler
 */
public class AgeChecker {
    public static void main(String[] args) {

        //Create a new view and model
        AgeCheckerView theView = new AgeCheckerView();
        AgeCheckerModel theModel = new AgeCheckerModel();
        AgeCheckerController theController = new AgeCheckerController(theView,theModel);
        theView.setVisible(true);
    }

}