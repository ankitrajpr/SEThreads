package com.company3;
/* =================================

author ankitrajprasad created on 07/04/20 
inside the package - com.company3 

=====================================*/


public class ThreadMain {

    public static void main(String[] args) {
        TestJoinClass t1 = new TestJoinClass("Thread t1");
        TestJoinClass t2 = new TestJoinClass("Thread t2");
        TestJoinClass t3 = new TestJoinClass("Thread t3");

        t1.start();
       /* try{
            t1.join(); // WIll ensure, that t1 should be completed without it's completion, none of the thread will work.
        }catch (Exception e){System.out.println(e);}*/
        t2.start();
        try{
            t2.join(); // WIll ensure, that t1 & t2 should be completed without it's completion, none of the thread(t3) will work.
        }catch (Exception e){System.out.println(e);}
        t3.start();

    }
}
