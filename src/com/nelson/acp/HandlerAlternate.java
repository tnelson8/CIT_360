package com.nelson.acp;

import java.util.HashMap;

/**
 * Created by Tyler
 */
public class HandlerAlternate implements Handler {
    @Override
    public void handleIt(HashMap<String, Object> dataMap) {
        //Simply gets the commands and prints them out to show the use of different handlers
        System.out.println(dataMap.get("a1"));
        System.out.println(dataMap.get("a2"));
    }
}