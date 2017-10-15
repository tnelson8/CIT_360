package com.nelson.apc;

import java.util.HashMap;

/**
 * Created by Tyler
 */
public class HandlerWelcome implements Handler {

    @Override
    public void handleIt(HashMap<String, Object> dataMap) {

        //Prints out the command received to show the use of the different handlers
        System.out.println(dataMap.get("w1"));
        System.out.println(dataMap.get("w2"));
        System.out.println(dataMap.get("w3"));

    }
}