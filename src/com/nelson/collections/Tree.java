package com.nelson.collections;
/*
 * CIT 360 - Topic Proficiency Examples
 * Tyler Nelson
 * Fall 2017
 */

import java.util.TreeSet;

/**
 *
 * @author Tyler
 */
public class Tree {
    public static void main(String[] args) {
        TreeSet<Integer> tree2 = new TreeSet<Integer>();
        tree2.add(1);
        tree2.add(2);
        tree2.add(3);
        tree2.add(4);
        System.out.println(tree2);

        TreeSet<String> tree3 = new TreeSet<String>();
        tree3.add("A");
        tree3.add("B");
        tree3.add("C");
        System.out.println(tree3);


        //
        try {
            TreeSet tree1 = new TreeSet();
            tree1.add(1);
            tree1.add(2);
            tree1.add(3);
            tree1.add(4);
            tree1.add("A");
            tree1.add("B");
            tree1.add("C");
            System.out.println(tree1);
        }catch(ClassCastException e){
            System.out.println(e);
        }

        try {
            //Add null
            TreeSet<?> tree4 = new TreeSet<Object>();
            tree4.add(null);
            System.out.println(tree4);
        }catch(NullPointerException e){
            System.out.println(e);
        }

        try{
            //remove an index that doesn't exist
            tree2.remove(10);
            System.out.println("removing an index that doesn't exist: " + tree2);
        }catch(Exception e){
            System.out.println("Array out of bounds");
        }


        try{
            //Adding a negative value
            tree2.add(-1);
            System.out.println("Adding a negative value: " + tree2);
        }catch(Exception e){
            System.out.println("adding a negative value");
        }



    }
}
