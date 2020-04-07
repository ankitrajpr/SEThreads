package com.company;
/* =================================

author ankitrajprasad created on 07/04/20 
inside the package - com.company 

=====================================*/


public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from "+Thread.currentThread().getName()+" "
                + "a thread created by "
                + "implementing a Runnable Interface!");
    }
}
