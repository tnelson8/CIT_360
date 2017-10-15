package com.nelson.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Tyler
 */

public class AgeCheckerController {

    private AgeCheckerView theView;
    private AgeCheckerModel theModel;

    public AgeCheckerController(AgeCheckerView theView, AgeCheckerModel theModel) {

        this.theView = theView;

        this.theModel = theModel;
        // Tell the View that when ever the calculate button

        // is clicked to execute the actionPerformed method

        // in the CalculateListener inner class

        this.theView.addCalculateListener(new CalculateListener());

    }

    /**
     * I put the listener here because it is still acting as a go between
     * with the model and view.
     * The way it was explained to me is like this:
     * The controller responds to actions by the user taken in the view and responds.
     * You put validation here and select the appropriate view if the validation fails.
     */


    class CalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int firstNumber;
            // Nasty path checking for incorrect values being entered.
            try{
                firstNumber = theView.getFirstNumber();

                theModel.checkAge(firstNumber);
                theView.setCalcSolution(theModel.getCalculationValue());

            } catch(NumberFormatException ex){

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter an Integer as the age");

            }

        }

    }

}