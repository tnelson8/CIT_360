package com.nelson.threads;
/**
 * Created by Tyler
 */

public class ThreadsRunnables implements Runnable{

    //As per the Runnable interface a run method is needed
    @Override
    public void run() {
        for (int i = 0; i < 2; i++){
            System.out.println("Current thread number: "
                    + Thread.currentThread().getName());
            try {
                Thread.currentThread();
				Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {


        //Create three threads that will be run at the same time
        for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
            //Create new thread
            Thread thread = new Thread(new ThreadsRunnables());
            //use start and not run
            thread.start();
        }


        for(int threadCnt=0; threadCnt < 3; threadCnt++){


            //Calling run instead of start
            try{
                Thread threadN2 = new Thread(new ThreadsRunnables());
                //This will cause it to run on the main thread and not start multiple threads
                threadN2.run();
            }catch(Exception e){
                System.out.println("run instead of start");
            }

            //Passing null into the thread being created
            try{
                Thread threadN1 = new Thread((Runnable)null);
                threadN1.start();
            }catch(Exception e){
                System.out.println("Running a null thread");
            }


        }
    }
}