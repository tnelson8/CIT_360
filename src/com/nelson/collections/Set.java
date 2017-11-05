package com.nelson.collections;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Tyler
 */
public class Set {
    public static void main(String args[]){
        HashSet<String> set1 = new HashSet<>();
        set1.add("student1");
        set1.add("student2");
        set1.add("student3");
        set1.add("student4");

        //Order doesn't matter
        System.out.println(set1);

        //Creating a new set for sorting
        HashSet<Integer> set2 = new HashSet<Integer>();

        try{
            System.out.println("Is the set empty: " + set2.isEmpty());
            System.out.println("Size of the set: " + set2.size());
            set2.add(1);
            set2.add(15);
            set2.add(30);
            set2.add(10);
            set2.add(4);
            System.out.println("Is the set empty: " + set2.isEmpty());
            System.out.println("Size of the set: " + set2.size());

        }catch (Exception e){
            System.out.println("Problem populating set2");
        }


        TreeSet<Integer> sortedSet = new TreeSet<>(set2);
        System.out.println("The sorted list is:");
        System.out.println(sortedSet);

        System.out.println("The First element of the set is: "+ sortedSet.first());
        System.out.println("The last element of the set is: "+ sortedSet.last());

        try{
            //remove an index that doesn't exist
            set1.remove(10);
            System.out.println(set1);
        }catch(Exception e){
            System.out.println("Array out of bounds");
        }

        try{
            //Adding null to a string set
            set1.add(null);
            System.out.println(set1);
        }catch(Exception e){
            System.out.println("Adding null error");
        }

        try{
            //Adding a negative value to the sorted list
            set2.add(-1);
            System.out.println(set2);
        }catch(Exception e){
            System.out.println("adding a negative value");
        }
        try{
            //Adding a null value to an integer set
            set2.add(null);
            System.out.println(set2);
        }catch(Exception e){
            System.out.println("adding null error");
        }


    }
}
