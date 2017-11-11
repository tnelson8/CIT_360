package com.nelson.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Tyler
 */
public class JsonExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employee;
        String title;

        String root = "owner";

        System.out.println("Enter employee first name: ");
        employee = scanner.next();

        System.out.println("Enter Job title of employee: ");
        title = scanner.next();

        jsonExampleGood(employee, title, root);

        scanner.close();

    }


    //Happy path example
    private static void jsonExampleGood(String employee, String title, String root) {

        //create the object
        JSONObject master = new JSONObject();

        //add to the master object (key pair)
        master.put("root", root);

        //create object
        JSONObject sub = new JSONObject();

        //add key pairs to the subObject
        sub.put("employee", employee);
        sub.put("title", title);

        //Create a JSONArray
        JSONArray array = new JSONArray();
        array.add(sub);

        //Add array to master object
        master.put("array", array);

        //Print out the json contents
        System.out.println();
        System.out.println("Print JSON: ");
        System.out.println(master.toString());
        System.out.println();

        //create file to hold json
        createFile(master, array);

    }

    //Created with the help of a tutor who helped me understand the reading and writing
    //Process
    public static void createFile(JSONObject master, JSONArray array) {
        Scanner scanner = new Scanner(System.in);

        //create a file
        File file = new File("test.txt");

        //nasty path: won't write anything to the file, you have to close the printwriter for it to write to file
        try {
            PrintWriter write = new PrintWriter(file);
            write.print(master.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //happy path: Will write to the file with paranthesis around it
        try (PrintWriter write = new PrintWriter(file)) {
            write.print(master.toJSONString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        //pause the execution
        System.out.println("File created successfully, Hit Return to display");
        scanner.nextLine();
        readFile(file);
    }

    private static void readFile(File file) {
        Scanner scanner;

        //reads the file
        //reading the file not from the console anymore
        try {
            scanner = new Scanner(file);
            //A String Builder allows a string to append to an existing one or insert into one
            StringBuilder build = new StringBuilder();
            //only has one line in the file created but has next line just in case so whole file is read
            while (scanner.hasNextLine()) {
                build.append(scanner.nextLine());
            }

            System.out.println("Print contents of StringBuilder");
            System.out.println(build.toString());
            System.out.println();

            //parse json string
            // a json parser provides read access to JSON data
            JSONParser myParse = new JSONParser();

            //we parse the string using the parser and cast it to a JSON Object
            JSONObject objmaster = (JSONObject) myParse.parse(build.toString());

            //nasty path: will print out null because username is a key of an object within an array it can only
            //be accessed through a JSONArray. The object looked for username but did not find it
            //so it returns null
            System.out.println("This is a nasty path");
            String userTest = (String) objmaster.get("employee");
            System.out.print(userTest);
            System.out.println();

            System.out.println();

            //This prints out the value we put in our master object. Because our master object is not buried in an array
            //we can access it's key value pair.
            System.out.printf("Generating username and password for %s", objmaster.get("root").toString());
            System.out.println();
            System.out.println("------------------------------------------------------------");
            System.out.println();
            System.out.println("Print out contents of the master object");
            System.out.println(objmaster.toString());
            System.out.println();

            //If we want to access our object that has some of our key value pairs we need to create a new array and with
            //our JSONObject we created before we need to get our array and cast it to a JSONArray to access the values found
            //in it
            JSONArray myArray = (JSONArray) objmaster.get("array");

            //with our JSONArray we grab the first element in the array. In this case it is our only element, which was
            //our branch object at creation and we stick the object element in the array into it's own object
            JSONObject test = (JSONObject) myArray.get(0);

            //We then create variables to hold our values from our object
            String employee = (String) test.get("employee");
            String title = (String) test.get("title");

            //prints out the username and password from our branch object we created at creation
            System.out.println("Employees first name: " + employee);
            System.out.println("Title of employee: " + title);

            System.out.println();

            //This is just an example of printing out the information from a loop. If there are more than one element in
            //the array we would do this.
            String employeeIn = null, titleIn = null;
            for (int i = 0; i < myArray.size(); i++) {
                JSONObject branchobj = (JSONObject) myArray.get(i);
                employeeIn = (String) branchobj.get("employee");
                titleIn = (String) branchobj.get("title");

            }
            System.out.println("Employees first name: " + employeeIn);
            System.out.println("Title of employee: " + titleIn);
            
            scanner.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        

    }

}