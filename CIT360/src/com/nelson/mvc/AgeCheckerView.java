package com.nelson.mvc;


//This is the View
//Its only job is to display what the user sees
//It performs no calculations, but instead passes
//information entered by the user to whomever needs
//it.

     import java.awt.event.ActionListener;

     import javax.swing.*;

public class AgeCheckerView extends JFrame {


 private JTextField firstNumber = new JTextField(10);
 private JLabel additionLabel = new JLabel("Enter your age");
 private JButton checkButton = new JButton("Check");
 private JTextField calcSolution = new JTextField(50);

 AgeCheckerView() {

     // Sets up the view and adds the components

     JPanel checkAgePanel = new JPanel();

     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setSize(600, 200);

     checkAgePanel.add(firstNumber);
     checkAgePanel.add(additionLabel);
     checkAgePanel.add(checkButton);
     checkAgePanel.add(calcSolution);
     this.add(checkAgePanel);

     // End of setting up the components --------
 }

 public int getFirstNumber() {

     return Integer.parseInt(firstNumber.getText());

 }


 public void setCalcSolution(boolean solution) {
     //Checks to see if the age is 18 or older
     if (solution){
         calcSolution.setText("You are 18 or older and can enter.");
     }else{
         calcSolution.setText("Must be 18 years or older: Access denied!");
     }
 }

 // If the checkButton is clicked execute a method
 // in the Controller named actionPerformed
 void addCalculateListener(ActionListener listenForCalcButton) {
     checkButton.addActionListener(listenForCalcButton);
 }

 // Open a popup that contains the error message passed

 void displayErrorMessage(String errorMessage) {

     JOptionPane.showMessageDialog(this, errorMessage);

 }
}