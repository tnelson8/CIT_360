package com.nelson.collections;
/*
 * CIT 360 - Topic Proficiency Examples
 * Tyler Nelson
 * Fall 2017
 */

import java.util.PriorityQueue;

/**
 * 
 * @author Tyler
 */
public class Queue {
    public static void main(String[] args){
        /**
         * PriorityQueue class provides the facility of using queue. Does not 
         * orders the elements in FIFO manner like the queue interface does.
         */
        PriorityQueue<String> q1 = new PriorityQueue<>();
        
        q1.add("David");
        q1.add("Evelyn");
        q1.add("Anneke");
        
        System.out.println("Offer Method: Insert the specified element");
        try {
            boolean test = q1.offer("Test");
            System.out.println(test);
            System.out.println(q1);

        }catch(Exception e){
            System.out.println("Offer method Failed");
        }
        
        System.out.println("Poll Method: Return and remove head of queue");
        try{
            System.out.println(q1.poll());
            System.out.println("New Queue:");
            System.out.println(q1);
        }catch(Exception e){
            System.out.println("Poll method did not go as planned");
        }
        
        System.out.println("Element Method: Return head of queue");
        try{
        
            System.out.println(q1.element());
            System.out.println("Queue:");
            System.out.println(q1);
        }catch(Exception e){
            System.out.println("Element method did not go as planned");
        }
        
        //Empty Queue
        PriorityQueue<String> q2 = new PriorityQueue<>();
        System.out.println("check Head of Queue Or if emtpy");
        System.out.println(q2.peek());
        try{
            System.out.println("Trying to use element on an empty queue");
            System.out.println(q2.element());
            System.out.println("Queue:");
            System.out.println(q2);
        }catch(Exception e){
            System.out.println("Element method did not go as planned");
        }
    }
}
