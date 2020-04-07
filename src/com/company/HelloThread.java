package com.company;
/* =================================

author ankitrajprasad created on 07/04/20 
inside the package - com.company 

=====================================*/


public class HelloThread extends Thread{
    public void run() {
        System.out.println("Hello from "+Thread.currentThread().getName()
                + " created by "
                + "extending Thread class!");
    }
}
