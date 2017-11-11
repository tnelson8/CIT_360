package com.nelson.threads;

/**
 * Created by Tyler
 */
public class JobForExecutor implements Runnable{
    private String job;

    public String getJob() {
        return job;
    }
    public JobForExecutor(String job) {
        this.job = job;

    }

    @Override
    public void run() {
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