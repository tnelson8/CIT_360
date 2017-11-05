package com.nelson.httpurlpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPPractice {
	public static void main(String[] args) {
        HTTPPractice connect = new HTTPPractice();

        try{
            connect.go();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void go() throws IOException {


        URL url = new URL("https://www.google.com/");

        //Nasty path: Empty String url
        try {
            URL url1 = new URL("");
        }catch (MalformedURLException e){
        	System.out.println("Nasty path: Empty String url");
            System.out.println(e);
        }


        //Nasty path: null url
        try {
            URL url2 = new URL("");
        }catch (MalformedURLException e){
        	System.out.println("Nasty path: null url");
            System.out.println(e);
        }

        //Set a new Connection using the url
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        //Nasty path for the connection to a url passing null
        try {
            HttpURLConnection connection1 = (HttpURLConnection) url.openConnection(null);
        }catch (IllegalArgumentException e){
        	System.out.println("Nasty path for the connection to a url passing null.");
            System.out.println(e);
        }

        //response from the server
        int responseNumber = connection.getResponseCode();

        //got a response from the server
        System.out.println("\nSending 'GET' reponse to URL: " + url);
        //Print out the response
        System.out.println("Response: " + responseNumber);

        //reads the input stream from the server
        BufferedReader myBuffer = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));


        String input;

        //This is to be able to save and display the input stream from the server
        StringBuffer response = new StringBuffer();

        System.out.println("Response from the string buffer: ");
        System.out.println();
        while((input = myBuffer.readLine()) != null){


            response.append(input);
        }

        myBuffer.close();

        //Prints the response
        System.out.println(response.toString());
    }
}
