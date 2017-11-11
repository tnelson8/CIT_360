package com.nelson.collections;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;

/**
 *
 * @author Tyler
 */
public class Map {
    public static void main(String args[]){
        HashMap<Integer,String> family = new HashMap<>();

        try{
            family.put(1,"David");
            family.put(2,"Cindi");
            family.put(3,"Jessica");
            family.put(4,"Breanna");
            family.put(5,"Chad");
        }catch(Exception e){
            System.out.println("Error with the constructor key pairs");
        }
        //constructor
        try{
            HashMap<Integer,String> family2 = new HashMap<Integer,String>();
            //Messing with the indexes
            family2.put(1,"David");
            family2.put(1,"Cindi");
            family2.put(2,"Jessica");
            family2.put(10,"Breanna");
            family2.put(5,"Chad");
            System.out.println("Family2 size: " + family.size());

            //numerical does not mean in order so it could lead to unexpected results
            System.out.println(family2.keySet());

            //Adding null value as the key and the value
            family2.put(null, null);
            System.out.println("Family2 at index null: " + family2.get(null));

        }catch(Exception e){
            System.out.println("Error with the constructor key pairs");
        }


        //Get the individual values of the hashmap
        System.out.println(family.get(1));
        System.out.println(family.get(2));
        System.out.println(family.get(3));
        System.out.println(family.get(4));
        System.out.println(family.get(5));
        System.out.println(family.size());
        System.out.println(family.keySet());
        System.out.println(family.values());

        //Clear out the hashmap and verify
        family.clear();
        System.out.println("Size of the hashmap: " + family.size());


        try{
            System.out.println("Get the value at the key of 10: " + family.get(10));
        }catch(Exception e){
            System.out.println("Using an unknown key!");
        }

        try{
            //Adding a null key
            family.put(null,"David");
            System.out.println(family);
        }catch(Exception e){
            System.out.println("Null key value being added");
        }
        try{
            //Adding a null value
            family.put(6,null);
            System.out.println(family);
        }catch(Exception e){
            System.out.println("null value to a real key");
        }
    }
}
