package com.nelson.mvc;

/**
 * Created by Tyler
 * The user interacts with the View 
 * The view and the controller talk to each other 
 * Controllers talk to each other 
 * The controller and the model talk to each other 
 * There are no other forms of communication
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