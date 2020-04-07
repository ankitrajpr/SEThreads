package com.company4;
/* =================================

author ankitrajprasad created on 07/04/20 
inside the package - com.company4 

=====================================*/


public class WithSynchronized {

    static int counter = 1;
    /* Example of locking using a synchronized method */

    //use lambda notation for the runnable method
//        Runnable r = () -> {
//            System.out.println("ID value: "+getID());
//        };
//        Thread one = new Thread(r,"one");
//        one.start();
//
//        Thread two = new Thread(r,"two");
//        two.start();
//    }

    /*  Example of locking using an object */
    //use lambda notation for the runnable method
    public static void main(String[] args) {
        Runnable r2 = () -> {
            ID id = new ID();
            System.out.println("ID value: " + id.getID());
        };
        Thread one = new Thread(r2, "one");
        one.start();
        Thread two = new Thread(r2, "two");
        two.start();
    }
    public static synchronized int getID()
    {
        return counter++;
    }
}
