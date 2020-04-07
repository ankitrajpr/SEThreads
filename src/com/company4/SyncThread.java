package com.company4;
/* =================================

author ankitrajprasad created on 07/04/20 
inside the package - com.company4 

=====================================*/

import java.util.logging.Level;
import java.util.logging.Logger;

//Synchornized block issue without synchronized
public class SyncThread {

    static int counter = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //use lambda notation for the runnable method
        Runnable r = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Logger.getLogger(SyncThread.class.getName()).log(Level.INFO, null, e);
            }
            System.out.println("ID value: "+getID());
        };
        Thread one = new Thread(r,"one");
        one.start();
        Thread two = new Thread(r,"two");
        two.start();

        //ID value: 1
        //ID value: 1
        //As thread sleep for 0.5 sec, and issue was that counter was increased by 1, but at that time, delimiter decreased the another thread by -1
        //Classsic example of Thread to be synchonized as reason.
    }
    public static int getID()
    {
        return counter++;
    }
}
