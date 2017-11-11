package com.nelson.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * Created by Tyler
 */
public class ExecutorsExample {
    public static void main(String[] args) {
        //The Thread pool is created using a fixed amount of threads (but that can be changed easily
        ThreadPoolExecutor e1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++){

            //space out the threads for visual reasons
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Use the JobForExecutor to give the thread something to do
            JobForExecutor job = new JobForExecutor("This is job: " + i);
            //Print out when a job is added
            System.out.println("A new task has been added : " + job.getJob());
            e1.execute(job);
        }
        //Shut down thread to avoid waisting resources
        e1.shutdown();


    }




}