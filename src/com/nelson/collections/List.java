package com.nelson.collections;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Tyler
 */
public class List {
    public static void main(String args[]){
        /**
         * ArrayList is better for storing and accessing data.
         */
        ArrayList<String> L1 = new ArrayList<>();
        
        L1.add(0, "Zero");
        L1.add(1, "first");
        L1.add(2, "Second");
        L1.add(3, "third");
        L1.add(4, "Forth");

        Iterator<String> itr=L1.iterator();//getting Iterator from arraylist to traverse elements
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        L1.remove(2);
        System.out.println(L1);
        
        try{
            //Not an error but will push the rest of the indexes up one
            System.out.println("Push the indexes up one:");
            L1.add(0,"Duplicate");
            System.out.println(L1);
        }catch(Exception e){
            System.out.println("Duplicate the index number");
        }

        try{
            System.out.println("Add a value to a negative index:");
            L1.add(-1,"Negative");
            System.out.println(L1);
        }catch(Exception e){
            System.out.println("Used a negative index - not allowed");
        }

        try{
            System.out.println("Add null:");
            L1.add(5,null);
            System.out.println(L1);
        }catch(Exception e){
            System.out.println("Add null to the List");
        }

        try{
            //remove an index that doesn't exist
            L1.remove(10);
            System.out.println(L1);
        }catch(Exception e){
            System.out.println("Array out of bounds");
        }
        
        
        
        
    }
}
