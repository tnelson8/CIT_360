package com.nelson.apc;

import java.util.HashMap;

/**
 * Created by Tyler
 */
public class MainIndex {
    public static void main(String[] args) {

        /*************************************************
         * 
         ************************************************/

        //Create instance of the handler
        ApplicationController ac = new ApplicationController();

        //Uses the mapCommand method in the application controller to store the command
        ac.mapCommand("Welcome", new HandlerWelcome());

        //Creates a hash map with the key value pair.
        HashMap<String, Object> welcome = new HashMap<>();
        welcome.put("w1", "Welcome to the Welcome Handler");
        welcome.put("w2", "The application controller is the go between");
        welcome.put("w3", "This hashmap stores the parameters");

        //Uses the mapCommand method in the application controller to store the command
        ac.mapCommand("Alternate", new HandlerAlternate());

        //Creates a hash map with the key value pair
        HashMap<String, Object> alternate = new HashMap<>();
        alternate.put("a1", "This is the alternate Handler");
        alternate.put("a2", "The application controller is still the go between");

        //Uses the application controller as the go between to interact with the handlers
        ac.handleRequest("Welcome", welcome);
        ac.handleRequest("Alternate", alternate);

        /*************************************************
         * 
         ************************************************/
        //Sending the wrong command to the wrong Handler
        try{
            ac.handleRequest("Alternate", welcome);
        } catch(Exception e){
            System.out.println("Command does not exist in Handler");
        }
        
    }
}