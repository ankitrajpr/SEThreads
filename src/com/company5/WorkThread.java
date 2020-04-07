package com.company5;
/* =================================

author ankitrajprasad created on 07/04/20 
inside the package - com.company5 

=====================================*/


public class WorkThread implements  Runnable{
    private final String message;

    public WorkThread(String message) {
        this.message = message;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+
                " (Start) message = " + message);
        //call workToBeDone method to simulate a delay
        workToBeDone();
        System.out.println(Thread.currentThread().getName()+
                " (End)");//prints thread name
    }

    private void workToBeDone() {
        try {  Thread.sleep(2000);  }
        catch (InterruptedException e)
        { e.printStackTrace(); }
    }
}
