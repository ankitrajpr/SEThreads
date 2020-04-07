package com.company5;
/* =================================

author ankitrajprasad created on 07/04/20 
inside the package - com.company5 

=====================================*/

import sun.jvm.hotspot.utilities.WorkerThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//Executor Framework --supports launching new tasks
//ExecutorService Framework  -- add features to manage lifecycle
//ScheduleExecutorService Framework  -- supports future taks by callable interface which returns



//Usage of SE high level Threads
public class ExecutorThread {

    public static void main(String[] args) {
        //creating a pool of 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5); //Creating ony 5 threads by ExecutorServices
        for (int i = 0; i < 10; i++) { //Only 5 threads but want to have 10times of running the treads, so once threads pool satisfies, then will reuse same thread form thread pool ceated
            Runnable worker = new WorkThread("I'm thread running thread instances " + i);
            //calling execute method of ExecutorService
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {   }

        System.out.println("Finished all threads");
    }
}
