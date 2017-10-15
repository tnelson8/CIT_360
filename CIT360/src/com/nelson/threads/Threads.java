package com.nelson.threads;

/**
 * Created by Tyler
 * When learning about threads I understood that
 * the best way to do it is to implement runnable 
 * and not extend thread but thought I should show this
 * example of what not to do.
 */


public class Threads extends Thread{
    public void run(){
        for (int i = 0; i < 3; i++){
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
        for (int threadCnt = 0; threadCnt < 5; threadCnt++){
            Threads aThread = new Threads();
            aThread.start();
        }
    }

}