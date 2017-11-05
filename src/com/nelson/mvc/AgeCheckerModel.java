package com.nelson.mvc;

/**
 * Created by Tyler
 * Model for Contact
 */

public class AgeCheckerModel {

    private boolean calculationValue;



    public void checkAge(int firstNumber) {

        int check = 18;

        if (firstNumber < check){
            calculationValue = false;
        }else {
            calculationValue = true;
        }


    }



    public boolean getCalculationValue() {
        return calculationValue;
    }


}