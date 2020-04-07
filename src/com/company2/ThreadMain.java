package com.company2;
/* =================================

author ankitrajprasad created on 07/04/20 
inside the package - com.company2 

=====================================*/

//new thread() -- NEW
//thread.start -- Runnable
//thread.run or execute run -- Running
//If on wait, waiting stage.
//job completed -- Destroyed

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {
        //print information about the current thread
        System.out.printf("%s is %s alive and in %s " +
                        "state%n and priority %d \n", Thread.currentThread().getName(),
                Thread.currentThread().isAlive() ? "" : "not ",
                Thread.currentThread().getState(),
                Thread.currentThread().getPriority());
        //Create a runnable object that prints information about the thread
        Runnable r1 = () -> {
            Thread thd = Thread.currentThread();
            System.out.printf("%s is %salive and in %s " +
                            "state%n and priority %d \n", thd.getName(),
                    thd.isAlive() ? "" : "not ",
                    thd.getState(), thd.getPriority());
        };
        //Create thread t1 and print the information BEFORE calling start()
        Thread t1 = new Thread(r1, "Thread t1"); // Thread t1 is not alive and in NEW state and priority 5

        System.out.printf("%s is %salive and in %s " +
                        "state%n and priority %d \n", t1.getName(),
                t1.isAlive() ? "" : "not ",
                t1.getState(),
                t1.getPriority());
        t1.start(); //It calls to t1 where earlier the state was New and now it will be, Thread t1 is alive and in RUNNABLE state  and priority 5

        //Create thread t2 with only a runnable object and no name
        Thread t2 = new Thread(r1);
        t2.start();//No expilicit thread Name provide for r1 instance.

        //put main thread to sleep for 2 seconds
        Thread.sleep(2000);

        //change the name of thread 2 and print out its info
        t2.setName("Thread t2");
        System.out.printf("%s is %salive and in %s " +
                        "state%n and priority %d \n", t2.getName(),
                t2.isAlive() ? "" : "not ",
                t2.getState(),
                t2.getPriority());  //Due to main thread is sleep for 2sec, that is why t2 returned here as Terminated state, as no thread opeations existed

        //print info about current thread
        System.out.printf("%s is %salive and in %s " +
                        "state%n and priority %d \n", Thread.currentThread().getName(),
                Thread.currentThread().isAlive() ? "" : "not ",
                Thread.currentThread().getState(),
                Thread.currentThread().getPriority());

    }
}
