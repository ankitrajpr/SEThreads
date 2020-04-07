package com.company4;
/* =================================

author ankitrajprasad created on 07/04/20 
inside the package - com.company4 

=====================================*/


public class ID {

    private static int counter; // initialized to 0 by default
    public static synchronized int  getID() {
        return  counter++;
    }
}
