package com.nelson.acp;

import java.util.HashMap;

/**
 * Created by Tyler
 */

public class ApplicationController {
    private HashMap<String, Handler> handlerMap = new HashMap();

    //Handles the requests and implements the handler
    public void handleRequest(String command, HashMap<String,Object> data){
        Handler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
                aCommandHandler.handleIt(data);
        }
    }

    //Used to map the command to a handler using a HashMap
    public void mapCommand(String aCommand, Handler acHandler){
        handlerMap.put(aCommand,acHandler);
    }
}